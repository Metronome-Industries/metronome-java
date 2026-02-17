// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.customers.CustomerArchiveParams
import com.metronome.api.models.v1.customers.CustomerArchiveResponse
import com.metronome.api.models.v1.customers.CustomerCreateParams
import com.metronome.api.models.v1.customers.CustomerCreateResponse
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsPage
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsParams
import com.metronome.api.models.v1.customers.CustomerListCostsPage
import com.metronome.api.models.v1.customers.CustomerListCostsParams
import com.metronome.api.models.v1.customers.CustomerListPage
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
import com.metronome.api.services.blocking.v1.customers.AlertService
import com.metronome.api.services.blocking.v1.customers.BillingConfigService
import com.metronome.api.services.blocking.v1.customers.CommitService
import com.metronome.api.services.blocking.v1.customers.CreditService
import com.metronome.api.services.blocking.v1.customers.InvoiceService
import com.metronome.api.services.blocking.v1.customers.NamedScheduleService
import com.metronome.api.services.blocking.v1.customers.PlanService
import java.util.function.Consumer

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService

    fun alerts(): AlertService

    fun plans(): PlanService

    fun invoices(): InvoiceService

    fun billingConfig(): BillingConfigService

    fun commits(): CommitService

    fun credits(): CreditService

    fun namedSchedules(): NamedScheduleService

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
    fun create(params: CustomerCreateParams): CustomerCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreateResponse

    /**
     * Get detailed information for a specific customer by their Metronome ID. Returns customer
     * profile data including name, creation date, ingest aliases, configuration settings, and
     * custom fields. Use this endpoint to fetch complete customer details for billing operations or
     * account management.
     *
     * Note: If searching for a customer billing configuration, use the
     * `/getCustomerBillingConfigurations` endpoint.
     */
    fun retrieve(params: CustomerRetrieveParams): CustomerRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveResponse

    /**
     * Gets a paginated list of all customers in your Metronome account. Use this endpoint to browse
     * your customer base, implement customer search functionality, or sync customer data with
     * external systems. Returns customer details including IDs, names, and configuration settings.
     * Supports filtering and pagination parameters for efficient data retrieval.
     */
    fun list(): CustomerListPage = list(CustomerListParams.none())

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** @see list */
    fun list(params: CustomerListParams = CustomerListParams.none()): CustomerListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerListPage =
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
    fun archive(params: CustomerArchiveParams): CustomerArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerArchiveResponse

    /** @see archive */
    fun archive(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerArchiveResponse =
        archive(CustomerArchiveParams.builder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: Id): CustomerArchiveResponse = archive(id, RequestOptions.none())

    /**
     * Get all billable metrics available for a specific customer. Supports pagination and filtering
     * by current plan status or archived metrics. Use this endpoint to see which metrics are being
     * tracked for billing calculations for a given customer.
     */
    fun listBillableMetrics(
        params: CustomerListBillableMetricsParams
    ): CustomerListBillableMetricsPage = listBillableMetrics(params, RequestOptions.none())

    /** @see listBillableMetrics */
    fun listBillableMetrics(
        params: CustomerListBillableMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListBillableMetricsPage

    /**
     * Fetch daily pending costs for the specified customer, broken down by credit type and line
     * items. Note: this is not supported for customers whose plan includes a UNIQUE-type billable
     * metric. This is a Plans (deprecated) endpoint. New clients should implement using Contracts.
     */
    fun listCosts(params: CustomerListCostsParams): CustomerListCostsPage =
        listCosts(params, RequestOptions.none())

    /** @see listCosts */
    fun listCosts(
        params: CustomerListCostsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListCostsPage

    /**
     * Preview how a set of events will affect a customer's invoices. Generates draft invoices for a
     * customer using their current contract configuration and the provided events. This is useful
     * for testing how new events will affect the customer's invoices before they are actually
     * processed. Customers on contracts with SQL billable metrics are not supported.
     */
    fun previewEvents(params: CustomerPreviewEventsParams): CustomerPreviewEventsResponse =
        previewEvents(params, RequestOptions.none())

    /** @see previewEvents */
    fun previewEvents(
        params: CustomerPreviewEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPreviewEventsResponse

    /**
     * Returns all billing configurations previously set for the customer. Use during the contract
     * provisioning process to fetch the `billing_provider_configuration_id` needed to set the
     * contract billing configuration.
     */
    fun retrieveBillingConfigurations(
        params: CustomerRetrieveBillingConfigurationsParams
    ): CustomerRetrieveBillingConfigurationsResponse =
        retrieveBillingConfigurations(params, RequestOptions.none())

    /** @see retrieveBillingConfigurations */
    fun retrieveBillingConfigurations(
        params: CustomerRetrieveBillingConfigurationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveBillingConfigurationsResponse

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
    ): CustomerSetBillingConfigurationsResponse =
        setBillingConfigurations(params, RequestOptions.none())

    /** @see setBillingConfigurations */
    fun setBillingConfigurations(
        params: CustomerSetBillingConfigurationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerSetBillingConfigurationsResponse

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
    fun setIngestAliases(params: CustomerSetIngestAliasesParams) =
        setIngestAliases(params, RequestOptions.none())

    /** @see setIngestAliases */
    fun setIngestAliases(
        params: CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Updates the display name for a customer record. Use this to correct customer names, update
     * business names after rebranding, or maintain accurate customer information for invoicing and
     * reporting. Returns the updated customer object with the new name applied immediately across
     * all billing documents and interfaces.
     */
    fun setName(params: CustomerSetNameParams): CustomerSetNameResponse =
        setName(params, RequestOptions.none())

    /** @see setName */
    fun setName(
        params: CustomerSetNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerSetNameResponse

    /**
     * Update configuration settings for a specific customer, such as external system integrations
     * (e.g., Salesforce account ID) and other customer-specific billing parameters. Use this
     * endpoint to modify customer configurations without affecting core customer data like name or
     * ingest aliases.
     */
    fun updateConfig(params: CustomerUpdateConfigParams) =
        updateConfig(params, RequestOptions.none())

    /** @see updateConfig */
    fun updateConfig(
        params: CustomerUpdateConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService.WithRawResponse

        fun alerts(): AlertService.WithRawResponse

        fun plans(): PlanService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        fun billingConfig(): BillingConfigService.WithRawResponse

        fun commits(): CommitService.WithRawResponse

        fun credits(): CreditService.WithRawResponse

        fun namedSchedules(): NamedScheduleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/customers`, but is otherwise the same as
         * [CustomerService.create].
         */
        @MustBeClosed
        fun create(params: CustomerCreateParams): HttpResponseFor<CustomerCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}`, but is otherwise the
         * same as [CustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CustomerRetrieveParams): HttpResponseFor<CustomerRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomerListPage> = list(CustomerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): HttpResponseFor<CustomerListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPage> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/customers/archive`, but is otherwise the same
         * as [CustomerService.archive].
         */
        @MustBeClosed
        fun archive(params: CustomerArchiveParams): HttpResponseFor<CustomerArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerArchiveResponse>

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerArchiveResponse> =
            archive(CustomerArchiveParams.builder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(id: Id): HttpResponseFor<CustomerArchiveResponse> =
            archive(id, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}/billable-metrics`, but
         * is otherwise the same as [CustomerService.listBillableMetrics].
         */
        @MustBeClosed
        fun listBillableMetrics(
            params: CustomerListBillableMetricsParams
        ): HttpResponseFor<CustomerListBillableMetricsPage> =
            listBillableMetrics(params, RequestOptions.none())

        /** @see listBillableMetrics */
        @MustBeClosed
        fun listBillableMetrics(
            params: CustomerListBillableMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListBillableMetricsPage>

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}/costs`, but is otherwise
         * the same as [CustomerService.listCosts].
         */
        @MustBeClosed
        fun listCosts(params: CustomerListCostsParams): HttpResponseFor<CustomerListCostsPage> =
            listCosts(params, RequestOptions.none())

        /** @see listCosts */
        @MustBeClosed
        fun listCosts(
            params: CustomerListCostsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListCostsPage>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/previewEvents`, but is
         * otherwise the same as [CustomerService.previewEvents].
         */
        @MustBeClosed
        fun previewEvents(
            params: CustomerPreviewEventsParams
        ): HttpResponseFor<CustomerPreviewEventsResponse> =
            previewEvents(params, RequestOptions.none())

        /** @see previewEvents */
        @MustBeClosed
        fun previewEvents(
            params: CustomerPreviewEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPreviewEventsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/getCustomerBillingProviderConfigurations`, but
         * is otherwise the same as [CustomerService.retrieveBillingConfigurations].
         */
        @MustBeClosed
        fun retrieveBillingConfigurations(
            params: CustomerRetrieveBillingConfigurationsParams
        ): HttpResponseFor<CustomerRetrieveBillingConfigurationsResponse> =
            retrieveBillingConfigurations(params, RequestOptions.none())

        /** @see retrieveBillingConfigurations */
        @MustBeClosed
        fun retrieveBillingConfigurations(
            params: CustomerRetrieveBillingConfigurationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrieveBillingConfigurationsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/setCustomerBillingProviderConfigurations`, but
         * is otherwise the same as [CustomerService.setBillingConfigurations].
         */
        @MustBeClosed
        fun setBillingConfigurations(
            params: CustomerSetBillingConfigurationsParams
        ): HttpResponseFor<CustomerSetBillingConfigurationsResponse> =
            setBillingConfigurations(params, RequestOptions.none())

        /** @see setBillingConfigurations */
        @MustBeClosed
        fun setBillingConfigurations(
            params: CustomerSetBillingConfigurationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerSetBillingConfigurationsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/setIngestAliases`, but
         * is otherwise the same as [CustomerService.setIngestAliases].
         */
        @MustBeClosed
        fun setIngestAliases(params: CustomerSetIngestAliasesParams): HttpResponse =
            setIngestAliases(params, RequestOptions.none())

        /** @see setIngestAliases */
        @MustBeClosed
        fun setIngestAliases(
            params: CustomerSetIngestAliasesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/setName`, but is
         * otherwise the same as [CustomerService.setName].
         */
        @MustBeClosed
        fun setName(params: CustomerSetNameParams): HttpResponseFor<CustomerSetNameResponse> =
            setName(params, RequestOptions.none())

        /** @see setName */
        @MustBeClosed
        fun setName(
            params: CustomerSetNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerSetNameResponse>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/updateConfig`, but is
         * otherwise the same as [CustomerService.updateConfig].
         */
        @MustBeClosed
        fun updateConfig(params: CustomerUpdateConfigParams): HttpResponse =
            updateConfig(params, RequestOptions.none())

        /** @see updateConfig */
        @MustBeClosed
        fun updateConfig(
            params: CustomerUpdateConfigParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
