// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1

import com.metronome.api.core.RequestOptions
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
import com.metronome.api.services.async.v1.customers.BillingConfigServiceAsync
import com.metronome.api.services.async.v1.customers.CommitServiceAsync
import com.metronome.api.services.async.v1.customers.CreditServiceAsync
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsync
import com.metronome.api.services.async.v1.customers.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.customers.PlanServiceAsync
import java.util.concurrent.CompletableFuture

interface CustomerServiceAsync {

    fun alerts(): AlertServiceAsync

    fun plans(): PlanServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun billingConfig(): BillingConfigServiceAsync

    fun commits(): CommitServiceAsync

    fun credits(): CreditServiceAsync

    fun namedSchedules(): NamedScheduleServiceAsync

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
    @JvmOverloads
    fun create(
        params: V1CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerCreateResponse>

    /**
     * Get detailed information for a specific customer by their Metronome ID. Returns customer
     * profile data including name, creation date, ingest aliases, configuration settings, and
     * custom fields. Use this endpoint to fetch complete customer details for billing operations or
     * account management.
     *
     * Note: If searching for a customer billing configuration, use the
     * `/getCustomerBillingConfigurations` endpoint.
     */
    @JvmOverloads
    fun retrieve(
        params: V1CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerRetrieveResponse>

    /**
     * Gets a paginated list of all customers in your Metronome account. Use this endpoint to browse
     * your customer base, implement customer search functionality, or sync customer data with
     * external systems. Returns customer details including IDs, names, and configuration settings.
     * Supports filtering and pagination parameters for efficient data retrieval.
     */
    @JvmOverloads
    fun list(
        params: V1CustomerListParams = V1CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerListPageAsync>

    /**
     * Gets a paginated list of all customers in your Metronome account. Use this endpoint to browse
     * your customer base, implement customer search functionality, or sync customer data with
     * external systems. Returns customer details including IDs, names, and configuration settings.
     * Supports filtering and pagination parameters for efficient data retrieval.
     */
    fun list(requestOptions: RequestOptions): CompletableFuture<V1CustomerListPageAsync> =
        list(V1CustomerListParams.none(), requestOptions)

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
    @JvmOverloads
    fun archive(
        params: V1CustomerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerArchiveResponse>

    /**
     * Get all billable metrics available for a specific customer. Supports pagination and filtering
     * by current plan status or archived metrics. Use this endpoint to see which metrics are being
     * tracked for billing calculations for a given customer.
     */
    @JvmOverloads
    fun listBillableMetrics(
        params: V1CustomerListBillableMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerListBillableMetricsPageAsync>

    /**
     * Fetch daily pending costs for the specified customer, broken down by credit type and line
     * items. Note: this is not supported for customers whose plan includes a UNIQUE-type billable
     * metric. This is a Plans (deprecated) endpoint. New clients should implement using Contracts.
     */
    @JvmOverloads
    fun listCosts(
        params: V1CustomerListCostsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerListCostsPageAsync>

    /**
     * Preview how a set of events will affect a customer's invoices. Generates draft invoices for a
     * customer using their current contract configuration and the provided events. This is useful
     * for testing how new events will affect the customer's invoices before they are actually
     * processed. Customers on contracts with SQL billable metrics are not supported.
     */
    @JvmOverloads
    fun previewEvents(
        params: V1CustomerPreviewEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerPreviewEventsResponse>

    /**
     * Returns all billing configurations previously set for the customer. Use during the contract
     * provisioning process to fetch the `billing_provider_configuration_id` needed to set the
     * contract billing configuration.
     */
    @JvmOverloads
    fun retrieveBillingConfigurations(
        params: V1CustomerRetrieveBillingConfigurationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerRetrieveBillingConfigurationsResponse>

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
    @JvmOverloads
    fun setBillingConfigurations(
        params: V1CustomerSetBillingConfigurationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerSetBillingConfigurationsResponse>

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
    @JvmOverloads
    fun setIngestAliases(
        params: V1CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Updates the display name for a customer record. Use this to correct customer names, update
     * business names after rebranding, or maintain accurate customer information for invoicing and
     * reporting. Returns the updated customer object with the new name applied immediately across
     * all billing documents and interfaces.
     */
    @JvmOverloads
    fun setName(
        params: V1CustomerSetNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerSetNameResponse>

    /**
     * Update configuration settings for a specific customer, such as external system integrations
     * (e.g., Salesforce account ID) and other customer-specific billing parameters. Use this
     * endpoint to modify customer configurations without affecting core customer data like name or
     * ingest aliases.
     */
    @JvmOverloads
    fun updateConfig(
        params: V1CustomerUpdateConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>
}
