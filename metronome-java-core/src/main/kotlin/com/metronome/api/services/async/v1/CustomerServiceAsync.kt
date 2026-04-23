// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.customers.CustomerArchiveBillingConfigurationsParams
import com.metronome.api.models.v1.customers.CustomerArchiveBillingConfigurationsResponse
import com.metronome.api.models.v1.customers.CustomerArchiveParams
import com.metronome.api.models.v1.customers.CustomerArchiveResponse
import com.metronome.api.models.v1.customers.CustomerCreateParams
import com.metronome.api.models.v1.customers.CustomerCreateResponse
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsPageAsync
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsParams
import com.metronome.api.models.v1.customers.CustomerListCostsPageAsync
import com.metronome.api.models.v1.customers.CustomerListCostsParams
import com.metronome.api.models.v1.customers.CustomerListPageAsync
import com.metronome.api.models.v1.customers.CustomerListParams
import com.metronome.api.models.v1.customers.CustomerPreviewEventsParams
import com.metronome.api.models.v1.customers.CustomerPreviewEventsResponse
import com.metronome.api.models.v1.customers.CustomerRetrieveBillingConfigurationsParams
import com.metronome.api.models.v1.customers.CustomerRetrieveBillingConfigurationsResponse
import com.metronome.api.models.v1.customers.CustomerRetrieveParams
import com.metronome.api.models.v1.customers.CustomerRetrieveResponse
import com.metronome.api.models.v1.customers.CustomerSetBillingConfigurationsParams
import com.metronome.api.models.v1.customers.CustomerSetBillingConfigurationsResponse
import com.metronome.api.models.v1.customers.CustomerSetIngestAliasesParams
import com.metronome.api.models.v1.customers.CustomerSetNameParams
import com.metronome.api.models.v1.customers.CustomerSetNameResponse
import com.metronome.api.models.v1.customers.CustomerUpdateConfigParams
import com.metronome.api.services.async.v1.customers.AlertServiceAsync
import com.metronome.api.services.async.v1.customers.BillingConfigServiceAsync
import com.metronome.api.services.async.v1.customers.CommitServiceAsync
import com.metronome.api.services.async.v1.customers.CreditServiceAsync
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsync
import com.metronome.api.services.async.v1.customers.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.customers.PlanServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync

    /**
     * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer spending,
     * balances, and other billing factors. Use these endpoints to create, retrieve, and archive
     * customer alerts. To view sample alert payloads by alert type, navigate
     * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
     */
    fun alerts(): AlertServiceAsync

    /**
     * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the base
     * pricing for a customer. Use these endpoints to add a plan to a customer, end a customer plan,
     * retrieve plans, and retrieve plan details. Create plans in the
     * [Metronome app](https://app.metronome.com/plans).
     */
    fun plans(): PlanServiceAsync

    /**
     * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
     * period, which is the basis for billing. Metronome automatically generates invoices based upon
     * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
     */
    fun invoices(): InvoiceServiceAsync

    /**
     * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome represent
     * your users for all billing and reporting. Use these endpoints to create, retrieve, update,
     * and archive customers and their billing configuration.
     */
    fun billingConfig(): BillingConfigServiceAsync

    /** Credits and commits are used to manage customer balances. */
    fun commits(): CommitServiceAsync

    /** Credits and commits are used to manage customer balances. */
    fun credits(): CreditServiceAsync

    /**
     * Named schedules are used for storing custom data that can change over time. Named schedules
     * are often used in custom pricing logic.
     */
    fun namedSchedules(): NamedScheduleServiceAsync

    /**
     * Create a new customer in Metronome and optionally the billing configuration (recommended)
     * which dictates where invoices for the customer will be sent or where payment will be
     * collected.
     *
     * ### Use this endpoint to:
     * Execute your customer provisioning workflows for either PLG motions, where customers
     * originate in your platform, or SLG motions, where customers originate in your sales system.
     *
     * ### Key response fields:
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
     * For details on different billing configurations for different systems, review the
     * `/setCustomerBillingConfiguration` end-point.
     */
    fun create(params: CustomerCreateParams): CompletableFuture<CustomerCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreateResponse>

    /**
     * Get detailed information for a specific customer by their Metronome ID. Returns customer
     * profile data including name, creation date, ingest aliases, configuration settings, and
     * custom fields. Use this endpoint to fetch complete customer details for billing operations or
     * account management.
     *
     * Note: If searching for a customer billing configuration, use the
     * `/getCustomerBillingConfigurations` endpoint.
     */
    fun retrieve(params: CustomerRetrieveParams): CompletableFuture<CustomerRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveResponse>

    /**
     * Gets a paginated list of all customers in your Metronome account. Use this endpoint to browse
     * your customer base, implement customer search functionality, or sync customer data with
     * external systems. Returns customer details including IDs, names, and configuration settings.
     * Supports filtering and pagination parameters for efficient data retrieval.
     */
    fun list(): CompletableFuture<CustomerListPageAsync> = list(CustomerListParams.none())

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListPageAsync>

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none()
    ): CompletableFuture<CustomerListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomerListPageAsync> =
        list(CustomerListParams.none(), requestOptions)

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
    fun archive(params: CustomerArchiveParams): CompletableFuture<CustomerArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerArchiveResponse>

    /** @see archive */
    fun archive(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerArchiveResponse> =
        archive(CustomerArchiveParams.builder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: Id): CompletableFuture<CustomerArchiveResponse> =
        archive(id, RequestOptions.none())

    /**
     * Deprecate an existing billing configuration for a customer to handle churn or billing and
     * collection preference changes. Archiving a billing configuration takes effect immediately. If
     * there are active contracts using the configuration, Metronome will archive the configuration
     * on the contract and immediately stop metering to downstream systems.
     *
     * ### Use this endpoint to:
     * - Remove billing provider customer data and configurations when no longer needed
     * - Clean up test or deprecated billing provider configurations
     * - Free up uniqueness keys for reuse with new billing provider configurations
     * - Disable threshold recharge configurations associated with archived billing providers
     *
     * ### Key response fields:
     * A successful response returns:
     * - `success`: Boolean indicating the operation completed successfully
     * - `error`: Null on success, error message on failure
     *
     * ### Usage guidelines:
     * - Archiving a contract configuration during a grace period will result in the invoice not
     *   being sent to the customer
     * - Automatically disables both spend-based and credit-based threshold recharge configurations
     *   for contracts using the archived billing provider
     * - You can archive multiple configurations for a single customer in a single request, but any
     *   validation failures for an individual configuration will prevent the entire operation from
     *   succeeding
     */
    fun archiveBillingConfigurations(
        params: CustomerArchiveBillingConfigurationsParams
    ): CompletableFuture<CustomerArchiveBillingConfigurationsResponse> =
        archiveBillingConfigurations(params, RequestOptions.none())

    /** @see archiveBillingConfigurations */
    fun archiveBillingConfigurations(
        params: CustomerArchiveBillingConfigurationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerArchiveBillingConfigurationsResponse>

    /**
     * Get all billable metrics available for a specific customer. Supports pagination and filtering
     * by current plan status or archived metrics. Use this endpoint to see which metrics are being
     * tracked for billing calculations for a given customer.
     */
    fun listBillableMetrics(
        params: CustomerListBillableMetricsParams
    ): CompletableFuture<CustomerListBillableMetricsPageAsync> =
        listBillableMetrics(params, RequestOptions.none())

    /** @see listBillableMetrics */
    fun listBillableMetrics(
        params: CustomerListBillableMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListBillableMetricsPageAsync>

    /**
     * Fetch daily pending costs for the specified customer, broken down by credit type and line
     * items. Note: this is not supported for customers whose plan includes a UNIQUE-type billable
     * metric. This is a Plans (deprecated) endpoint. New clients should implement using Contracts.
     */
    fun listCosts(params: CustomerListCostsParams): CompletableFuture<CustomerListCostsPageAsync> =
        listCosts(params, RequestOptions.none())

    /** @see listCosts */
    fun listCosts(
        params: CustomerListCostsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListCostsPageAsync>

    /**
     * Preview how a set of events will affect a customer's invoices. Generates draft invoices for a
     * customer using their current contract configuration and the provided events. This is useful
     * for testing how new events will affect the customer's invoices before they are actually
     * processed. Customers on contracts with SQL billable metrics are not supported.
     */
    fun previewEvents(
        params: CustomerPreviewEventsParams
    ): CompletableFuture<CustomerPreviewEventsResponse> =
        previewEvents(params, RequestOptions.none())

    /** @see previewEvents */
    fun previewEvents(
        params: CustomerPreviewEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPreviewEventsResponse>

    /**
     * Returns all billing configurations previously set for the customer. Use during the contract
     * provisioning process to fetch the `billing_provider_configuration_id` needed to set the
     * contract billing configuration.
     */
    fun retrieveBillingConfigurations(
        params: CustomerRetrieveBillingConfigurationsParams
    ): CompletableFuture<CustomerRetrieveBillingConfigurationsResponse> =
        retrieveBillingConfigurations(params, RequestOptions.none())

    /** @see retrieveBillingConfigurations */
    fun retrieveBillingConfigurations(
        params: CustomerRetrieveBillingConfigurationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrieveBillingConfigurationsResponse>

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
     * The id for the customer billing configuration. This id can be used to associate the billing
     * configuration to a contract.
     *
     * ### Usage guidelines:
     * Must use the `delivery_method_id` if you have multiple Stripe accounts connected to
     * Metronome.
     */
    fun setBillingConfigurations(
        params: CustomerSetBillingConfigurationsParams
    ): CompletableFuture<CustomerSetBillingConfigurationsResponse> =
        setBillingConfigurations(params, RequestOptions.none())

    /** @see setBillingConfigurations */
    fun setBillingConfigurations(
        params: CustomerSetBillingConfigurationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerSetBillingConfigurationsResponse>

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
    fun setIngestAliases(params: CustomerSetIngestAliasesParams): CompletableFuture<Void?> =
        setIngestAliases(params, RequestOptions.none())

    /** @see setIngestAliases */
    fun setIngestAliases(
        params: CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Updates the display name for a customer record. Use this to correct customer names, update
     * business names after rebranding, or maintain accurate customer information for invoicing and
     * reporting. Returns the updated customer object with the new name applied immediately across
     * all billing documents and interfaces.
     */
    fun setName(params: CustomerSetNameParams): CompletableFuture<CustomerSetNameResponse> =
        setName(params, RequestOptions.none())

    /** @see setName */
    fun setName(
        params: CustomerSetNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerSetNameResponse>

    /**
     * Update configuration settings for a specific customer, such as external system integrations
     * (e.g., Salesforce account ID) and other customer-specific billing parameters. Use this
     * endpoint to modify customer configurations without affecting core customer data like name or
     * ingest aliases.
     */
    fun updateConfig(params: CustomerUpdateConfigParams): CompletableFuture<Void?> =
        updateConfig(params, RequestOptions.none())

    /** @see updateConfig */
    fun updateConfig(
        params: CustomerUpdateConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse

        /**
         * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer
         * spending, balances, and other billing factors. Use these endpoints to create, retrieve,
         * and archive customer alerts. To view sample alert payloads by alert type, navigate
         * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
         */
        fun alerts(): AlertServiceAsync.WithRawResponse

        /**
         * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the
         * base pricing for a customer. Use these endpoints to add a plan to a customer, end a
         * customer plan, retrieve plans, and retrieve plan details. Create plans in the
         * [Metronome app](https://app.metronome.com/plans).
         */
        fun plans(): PlanServiceAsync.WithRawResponse

        /**
         * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent
         * during a period, which is the basis for billing. Metronome automatically generates
         * invoices based upon your pricing, packaging, and usage events. Use these endpoints to
         * retrieve invoices.
         */
        fun invoices(): InvoiceServiceAsync.WithRawResponse

        /**
         * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome
         * represent your users for all billing and reporting. Use these endpoints to create,
         * retrieve, update, and archive customers and their billing configuration.
         */
        fun billingConfig(): BillingConfigServiceAsync.WithRawResponse

        /** Credits and commits are used to manage customer balances. */
        fun commits(): CommitServiceAsync.WithRawResponse

        /** Credits and commits are used to manage customer balances. */
        fun credits(): CreditServiceAsync.WithRawResponse

        /**
         * Named schedules are used for storing custom data that can change over time. Named
         * schedules are often used in custom pricing logic.
         */
        fun namedSchedules(): NamedScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        fun create(
            params: CustomerCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}`, but is otherwise the
         * same as [CustomerServiceAsync.retrieve].
         */
        fun retrieve(
            params: CustomerRetrieveParams
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none())

        /** @see list */
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>>

        /** @see list */
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/customers/archive`, but is otherwise the same
         * as [CustomerServiceAsync.archive].
         */
        fun archive(
            params: CustomerArchiveParams
        ): CompletableFuture<HttpResponseFor<CustomerArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerArchiveResponse>>

        /** @see archive */
        fun archive(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerArchiveResponse>> =
            archive(CustomerArchiveParams.builder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(id: Id): CompletableFuture<HttpResponseFor<CustomerArchiveResponse>> =
            archive(id, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/archiveCustomerBillingProviderConfigurations`,
         * but is otherwise the same as [CustomerServiceAsync.archiveBillingConfigurations].
         */
        fun archiveBillingConfigurations(
            params: CustomerArchiveBillingConfigurationsParams
        ): CompletableFuture<HttpResponseFor<CustomerArchiveBillingConfigurationsResponse>> =
            archiveBillingConfigurations(params, RequestOptions.none())

        /** @see archiveBillingConfigurations */
        fun archiveBillingConfigurations(
            params: CustomerArchiveBillingConfigurationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerArchiveBillingConfigurationsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}/billable-metrics`, but
         * is otherwise the same as [CustomerServiceAsync.listBillableMetrics].
         */
        fun listBillableMetrics(
            params: CustomerListBillableMetricsParams
        ): CompletableFuture<HttpResponseFor<CustomerListBillableMetricsPageAsync>> =
            listBillableMetrics(params, RequestOptions.none())

        /** @see listBillableMetrics */
        fun listBillableMetrics(
            params: CustomerListBillableMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListBillableMetricsPageAsync>>

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}/costs`, but is otherwise
         * the same as [CustomerServiceAsync.listCosts].
         */
        fun listCosts(
            params: CustomerListCostsParams
        ): CompletableFuture<HttpResponseFor<CustomerListCostsPageAsync>> =
            listCosts(params, RequestOptions.none())

        /** @see listCosts */
        fun listCosts(
            params: CustomerListCostsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListCostsPageAsync>>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/previewEvents`, but is
         * otherwise the same as [CustomerServiceAsync.previewEvents].
         */
        fun previewEvents(
            params: CustomerPreviewEventsParams
        ): CompletableFuture<HttpResponseFor<CustomerPreviewEventsResponse>> =
            previewEvents(params, RequestOptions.none())

        /** @see previewEvents */
        fun previewEvents(
            params: CustomerPreviewEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPreviewEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/getCustomerBillingProviderConfigurations`, but
         * is otherwise the same as [CustomerServiceAsync.retrieveBillingConfigurations].
         */
        fun retrieveBillingConfigurations(
            params: CustomerRetrieveBillingConfigurationsParams
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveBillingConfigurationsResponse>> =
            retrieveBillingConfigurations(params, RequestOptions.none())

        /** @see retrieveBillingConfigurations */
        fun retrieveBillingConfigurations(
            params: CustomerRetrieveBillingConfigurationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveBillingConfigurationsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/setCustomerBillingProviderConfigurations`, but
         * is otherwise the same as [CustomerServiceAsync.setBillingConfigurations].
         */
        fun setBillingConfigurations(
            params: CustomerSetBillingConfigurationsParams
        ): CompletableFuture<HttpResponseFor<CustomerSetBillingConfigurationsResponse>> =
            setBillingConfigurations(params, RequestOptions.none())

        /** @see setBillingConfigurations */
        fun setBillingConfigurations(
            params: CustomerSetBillingConfigurationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerSetBillingConfigurationsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/setIngestAliases`, but
         * is otherwise the same as [CustomerServiceAsync.setIngestAliases].
         */
        fun setIngestAliases(
            params: CustomerSetIngestAliasesParams
        ): CompletableFuture<HttpResponse> = setIngestAliases(params, RequestOptions.none())

        /** @see setIngestAliases */
        fun setIngestAliases(
            params: CustomerSetIngestAliasesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/setName`, but is
         * otherwise the same as [CustomerServiceAsync.setName].
         */
        fun setName(
            params: CustomerSetNameParams
        ): CompletableFuture<HttpResponseFor<CustomerSetNameResponse>> =
            setName(params, RequestOptions.none())

        /** @see setName */
        fun setName(
            params: CustomerSetNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerSetNameResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/updateConfig`, but is
         * otherwise the same as [CustomerServiceAsync.updateConfig].
         */
        fun updateConfig(params: CustomerUpdateConfigParams): CompletableFuture<HttpResponse> =
            updateConfig(params, RequestOptions.none())

        /** @see updateConfig */
        fun updateConfig(
            params: CustomerUpdateConfigParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
