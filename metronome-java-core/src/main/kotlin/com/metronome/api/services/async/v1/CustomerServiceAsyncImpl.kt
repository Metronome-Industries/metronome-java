// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1CustomerArchiveParams
import com.metronome.api.models.V1CustomerArchiveResponse
import com.metronome.api.models.V1CustomerCreateParams
import com.metronome.api.models.V1CustomerCreateResponse
import com.metronome.api.models.V1CustomerListBillableMetricsPageAsync
import com.metronome.api.models.V1CustomerListBillableMetricsParams
import com.metronome.api.models.V1CustomerListCostsPageAsync
import com.metronome.api.models.V1CustomerListCostsParams
import com.metronome.api.models.V1CustomerListPageAsync
import com.metronome.api.models.V1CustomerListParams
import com.metronome.api.models.V1CustomerPreviewEventsParams
import com.metronome.api.models.V1CustomerPreviewEventsResponse
import com.metronome.api.models.V1CustomerRetrieveBillingConfigurationsParams
import com.metronome.api.models.V1CustomerRetrieveBillingConfigurationsResponse
import com.metronome.api.models.V1CustomerRetrieveParams
import com.metronome.api.models.V1CustomerRetrieveResponse
import com.metronome.api.models.V1CustomerSetBillingConfigurationsParams
import com.metronome.api.models.V1CustomerSetBillingConfigurationsResponse
import com.metronome.api.models.V1CustomerSetIngestAliasesParams
import com.metronome.api.models.V1CustomerSetNameParams
import com.metronome.api.models.V1CustomerSetNameResponse
import com.metronome.api.models.V1CustomerUpdateConfigParams
import com.metronome.api.services.async.v1.customers.AlertServiceAsync
import com.metronome.api.services.async.v1.customers.AlertServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.BillingConfigServiceAsync
import com.metronome.api.services.async.v1.customers.BillingConfigServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.CommitServiceAsync
import com.metronome.api.services.async.v1.customers.CommitServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.CreditServiceAsync
import com.metronome.api.services.async.v1.customers.CreditServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsync
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.customers.NamedScheduleServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.PlanServiceAsync
import com.metronome.api.services.async.v1.customers.PlanServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val alerts: AlertServiceAsync by lazy { AlertServiceAsyncImpl(clientOptions) }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptions) }

    private val invoices: InvoiceServiceAsync by lazy { InvoiceServiceAsyncImpl(clientOptions) }

    private val billingConfig: BillingConfigServiceAsync by lazy {
        BillingConfigServiceAsyncImpl(clientOptions)
    }

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val credits: CreditServiceAsync by lazy { CreditServiceAsyncImpl(clientOptions) }

    private val namedSchedules: NamedScheduleServiceAsync by lazy {
        NamedScheduleServiceAsyncImpl(clientOptions)
    }

    override fun alerts(): AlertServiceAsync = alerts

    override fun plans(): PlanServiceAsync = plans

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun billingConfig(): BillingConfigServiceAsync = billingConfig

    override fun commits(): CommitServiceAsync = commits

    override fun credits(): CreditServiceAsync = credits

    override fun namedSchedules(): NamedScheduleServiceAsync = namedSchedules

    private val createHandler: Handler<V1CustomerCreateResponse> =
        jsonHandler<V1CustomerCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create a new customer in Metronome and optionally the billing configuration (recommended)
     * which dictates where invoices for the customer will be sent or where payment will be
     * collected.
     *
     * ### Use this endpoint to:
     *
     * Execute your customer provisioning workflows for either PLG motions, where customers
     * originate in your platform, or SLG motions, where customers originate in your sales system.
     *
     * ### Key response fields:
     *
     * This end-point returns the `customer_id` created by the request. This id can be used to fetch
     * relevant billing configurations and create contracts.
     *
     * ### Example workflow:
     * - Generally, Metronome recommends first creating the customer in the downstream payment / ERP
     *   system when payment method is collected and then creating the customer in Metronome using
     *   the response (i.e. `customer_id`) from the downstream system. If you do not create a
     *   billing configuration on customer creation, you can add it later.
     * - Once a customer is created, you can then create a contract for the customer. In the
     *   contract creation process, you will need to add the customer billing configuration to the
     *   contract to ensure Metronome invoices the customer correctly. This is because a customer
     *   can have multiple configurations.
     * - As part of the customer creation process, set the ingest alias for the customer which will
     *   ensure usage is accurately mapped to the customer. Ingest aliases can be added or changed
     *   after the creation process as well.
     *
     * ### Usage guidelines:
     *
     * For details on different billing configurations for different systems, review the
     * `/setCustomerBillingConfiguration` end-point.
     */
    override fun create(
        params: V1CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<V1CustomerRetrieveResponse> =
        jsonHandler<V1CustomerRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get detailed information for a specific customer by their Metronome ID. Returns customer
     * profile data including name, creation date, ingest aliases, configuration settings, and
     * custom fields. Use this endpoint to fetch complete customer details for billing operations or
     * account management.
     *
     * Note: If searching for a customer billing configuration, use the
     * `/getCustomerBillingConfigurations` endpoint.
     */
    override fun retrieve(
        params: V1CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "customers", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<V1CustomerListPageAsync.Response> =
        jsonHandler<V1CustomerListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Gets a paginated list of all customers in your Metronome account. Use this endpoint to browse
     * your customer base, implement customer search functionality, or sync customer data with
     * external systems. Returns customer details including IDs, names, and configuration settings.
     * Supports filtering and pagination parameters for efficient data retrieval.
     */
    override fun list(
        params: V1CustomerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "customers")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1CustomerListPageAsync.of(this, params, it) }
            }
    }

    private val archiveHandler: Handler<V1CustomerArchiveResponse> =
        jsonHandler<V1CustomerArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Use this endpoint to archive a customer while preserving auditability. Archiving a customer
     * will automatically archive all contracts as of the current date and void all corresponding
     * invoices. Use this endpoint if a customer is onboarded by mistake.
     *
     * ### Usage guidelines:
     * - Once a customer is archived, it cannot be unarchived.
     * - Archived customers can still be viewed through the API or the UI for audit purposes.
     * - Ingest aliases remain idempotent for archived customers. In order to reuse an ingest alias,
     *   first remove the ingest alias from the customer prior to archiving.
     * - Any notifications associated with the customer will no longer be triggered.
     */
    override fun archive(
        params: V1CustomerArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerArchiveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", "archive")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listBillableMetricsHandler:
        Handler<V1CustomerListBillableMetricsPageAsync.Response> =
        jsonHandler<V1CustomerListBillableMetricsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get all billable metrics available for a specific customer. Supports pagination and filtering
     * by current plan status or archived metrics. Use this endpoint to see which metrics are being
     * tracked for billing calculations for a given customer.
     */
    override fun listBillableMetrics(
        params: V1CustomerListBillableMetricsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerListBillableMetricsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "customers", params.getPathParam(0), "billable-metrics")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listBillableMetricsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1CustomerListBillableMetricsPageAsync.of(this, params, it) }
            }
    }

    private val listCostsHandler: Handler<V1CustomerListCostsPageAsync.Response> =
        jsonHandler<V1CustomerListCostsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch daily pending costs for the specified customer, broken down by credit type and line
     * items. Note: this is not supported for customers whose plan includes a UNIQUE-type billable
     * metric. This is a Plans (deprecated) endpoint. New clients should implement using Contracts.
     */
    override fun listCosts(
        params: V1CustomerListCostsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerListCostsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "customers", params.getPathParam(0), "costs")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listCostsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1CustomerListCostsPageAsync.of(this, params, it) }
            }
    }

    private val previewEventsHandler: Handler<V1CustomerPreviewEventsResponse> =
        jsonHandler<V1CustomerPreviewEventsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Preview how a set of events will affect a customer's invoices. Generates draft invoices for a
     * customer using their current contract configuration and the provided events. This is useful
     * for testing how new events will affect the customer's invoices before they are actually
     * processed. Customers on contracts with SQL billable metrics are not supported.
     */
    override fun previewEvents(
        params: V1CustomerPreviewEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerPreviewEventsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", params.getPathParam(0), "previewEvents")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { previewEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveBillingConfigurationsHandler:
        Handler<V1CustomerRetrieveBillingConfigurationsResponse> =
        jsonHandler<V1CustomerRetrieveBillingConfigurationsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns all billing configurations previously set for the customer. Use during the contract
     * provisioning process to fetch the `billing_provider_configuration_id` needed to set the
     * contract billing configuration.
     */
    override fun retrieveBillingConfigurations(
        params: V1CustomerRetrieveBillingConfigurationsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerRetrieveBillingConfigurationsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "getCustomerBillingProviderConfigurations")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveBillingConfigurationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val setBillingConfigurationsHandler:
        Handler<V1CustomerSetBillingConfigurationsResponse> =
        jsonHandler<V1CustomerSetBillingConfigurationsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create a billing configuration for a customer. Once created, these configurations are
     * available to associate to a contract and dictates which downstream system to collect payment
     * in or send the invoice to. You can create multiple configurations per customer. The
     * configuration formats are distinct for each downstream provider.
     *
     * ### Use this endpoint to:
     * - Add the initial configuration to an existing customer. Once created, the billing
     *   configuration can then be associated to the customer's contract.
     * - Add a new configuration to an existing customer. This might be used as part of an upgrade
     *   or downgrade workflow where the customer was previously billed through system A (e.g.
     *   Stripe) but will now be billed through system B (e.g. AWS). Once created, the new
     *   configuration can then be associated to the customer's contract.
     * - Multiple configurations can be added per destination. For example, you can create two
     *   Stripe billing configurations for a Metronome customer that each have a distinct
     *   `collection_method`.
     *
     * ### Delivery method options:
     * - `direct_to_billing_provider`: Use when Metronome should send invoices directly to the
     *   billing provider's API (e.g., Stripe, NetSuite). This is the most common method for
     *   automated billing workflows.
     * - `tackle`: Use specifically for AWS Marketplace transactions that require Tackle's
     *   co-selling platform for partner attribution and commission tracking.
     * - `aws_sqs`: Use when you want invoice data delivered to an AWS SQS queue for custom
     *   processing before sending to your billing system.
     * - `aws_sns`: Use when you want invoice notifications published to an AWS SNS topic for
     *   event-driven billing workflows.
     *
     * ### Key response fields:
     *
     * The id for the customer billing configuration. This id can be used to associate the billing
     * configuration to a contract.
     *
     * ### Usage guidelines:
     *
     * Must use the `delivery_method_id` if you have multiple Stripe accounts connected to
     * Metronome.
     */
    override fun setBillingConfigurations(
        params: V1CustomerSetBillingConfigurationsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerSetBillingConfigurationsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "setCustomerBillingProviderConfigurations")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { setBillingConfigurationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val setIngestAliasesHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /**
     * Sets the ingest aliases for a customer. Use this endpoint to associate a Metronome customer
     * with an internal ID for easier tracking between systems. Ingest aliases can be used in the
     * `customer_id` field when sending usage events to Metronome.
     *
     * ### Usage guidelines:
     * - This call is idempotent and fully replaces the set of ingest aliases for the given
     *   customer.
     * - Switching an ingest alias from one customer to another will associate all corresponding
     *   usage to the new customer.
     * - Use multiple ingest aliases to model child organizations within a single Metronome
     *   customer.
     */
    override fun setIngestAliases(
        params: V1CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", params.getPathParam(0), "setIngestAliases")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { setIngestAliasesHandler.handle(it) } }
    }

    private val setNameHandler: Handler<V1CustomerSetNameResponse> =
        jsonHandler<V1CustomerSetNameResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Updates the display name for a customer record. Use this to correct customer names, update
     * business names after rebranding, or maintain accurate customer information for invoicing and
     * reporting. Returns the updated customer object with the new name applied immediately across
     * all billing documents and interfaces.
     */
    override fun setName(
        params: V1CustomerSetNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerSetNameResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", params.getPathParam(0), "setName")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { setNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateConfigHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Update configuration settings for a specific customer, such as external system integrations
     * (e.g., Salesforce account ID) and other customer-specific billing parameters. Use this
     * endpoint to modify customer configurations without affecting core customer data like name or
     * ingest aliases.
     */
    override fun updateConfig(
        params: V1CustomerUpdateConfigParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", params.getPathParam(0), "updateConfig")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { updateConfigHandler.handle(it) } }
    }
}
