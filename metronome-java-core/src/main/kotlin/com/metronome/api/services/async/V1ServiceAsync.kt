// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.async.v1.AlertServiceAsync
import com.metronome.api.services.async.v1.AuditLogServiceAsync
import com.metronome.api.services.async.v1.BillableMetricServiceAsync
import com.metronome.api.services.async.v1.ContractServiceAsync
import com.metronome.api.services.async.v1.CreditGrantServiceAsync
import com.metronome.api.services.async.v1.CustomFieldServiceAsync
import com.metronome.api.services.async.v1.CustomerServiceAsync
import com.metronome.api.services.async.v1.DashboardServiceAsync
import com.metronome.api.services.async.v1.InvoiceServiceAsync
import com.metronome.api.services.async.v1.PackageServiceAsync
import com.metronome.api.services.async.v1.PaymentServiceAsync
import com.metronome.api.services.async.v1.PlanServiceAsync
import com.metronome.api.services.async.v1.PricingUnitServiceAsync
import com.metronome.api.services.async.v1.ServiceServiceAsync
import com.metronome.api.services.async.v1.SettingServiceAsync
import com.metronome.api.services.async.v1.UsageServiceAsync
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

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
     * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/)
     * adjust a customer balance for prepayments, reimbursements, promotions, and so on. Use these
     * endpoints to create, retrieve, update, and delete credit grants.
     */
    fun creditGrants(): CreditGrantServiceAsync

    /**
     * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
     * behavior.
     */
    fun pricingUnits(): PricingUnitServiceAsync

    fun customers(): CustomerServiceAsync

    /**
     * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome represent
     * your users for all billing and reporting. Use these endpoints to create, retrieve, update,
     * and archive customers and their billing configuration.
     */
    fun dashboards(): DashboardServiceAsync

    /**
     * [Usage events](https://docs.metronome.com/connecting-metronome/send-usage-data/) are the
     * basis for billable metrics. Use these endpoints to send usage events to Metronome and
     * retrieve aggregated event data.
     */
    fun usage(): UsageServiceAsync

    /**
     * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
     * retrieve security-related data.
     */
    fun auditLogs(): AuditLogServiceAsync

    /**
     * [Custom fields](https://docs.metronome.com/integrations/custom-fields/) enable adding
     * additional data to Metronome entities. Use these endpoints to create, retrieve, update, and
     * delete custom fields.
     */
    fun customFields(): CustomFieldServiceAsync

    /**
     * [Billable
     * metrics](https://docs.metronome.com/understanding-metronome/how-metronome-works#billable-metrics)
     * in Metronome represent the various consumption components that Metronome meters and
     * aggregates.
     */
    fun billableMetrics(): BillableMetricServiceAsync

    /**
     * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
     * retrieve security-related data.
     */
    fun services(): ServiceServiceAsync

    /**
     * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
     * period, which is the basis for billing. Metronome automatically generates invoices based upon
     * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
     */
    fun invoices(): InvoiceServiceAsync

    fun contracts(): ContractServiceAsync

    fun packages(): PackageServiceAsync

    fun payments(): PaymentServiceAsync

    /**
     * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
     * behavior.
     */
    fun settings(): SettingServiceAsync

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

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
         * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/)
         * adjust a customer balance for prepayments, reimbursements, promotions, and so on. Use
         * these endpoints to create, retrieve, update, and delete credit grants.
         */
        fun creditGrants(): CreditGrantServiceAsync.WithRawResponse

        /**
         * Use these endpoints to configure a billing API key, a webhook secret, or invoice
         * finalization behavior.
         */
        fun pricingUnits(): PricingUnitServiceAsync.WithRawResponse

        fun customers(): CustomerServiceAsync.WithRawResponse

        /**
         * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome
         * represent your users for all billing and reporting. Use these endpoints to create,
         * retrieve, update, and archive customers and their billing configuration.
         */
        fun dashboards(): DashboardServiceAsync.WithRawResponse

        /**
         * [Usage events](https://docs.metronome.com/connecting-metronome/send-usage-data/) are the
         * basis for billable metrics. Use these endpoints to send usage events to Metronome and
         * retrieve aggregated event data.
         */
        fun usage(): UsageServiceAsync.WithRawResponse

        /**
         * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you
         * to retrieve security-related data.
         */
        fun auditLogs(): AuditLogServiceAsync.WithRawResponse

        /**
         * [Custom fields](https://docs.metronome.com/integrations/custom-fields/) enable adding
         * additional data to Metronome entities. Use these endpoints to create, retrieve, update,
         * and delete custom fields.
         */
        fun customFields(): CustomFieldServiceAsync.WithRawResponse

        /**
         * [Billable
         * metrics](https://docs.metronome.com/understanding-metronome/how-metronome-works#billable-metrics)
         * in Metronome represent the various consumption components that Metronome meters and
         * aggregates.
         */
        fun billableMetrics(): BillableMetricServiceAsync.WithRawResponse

        /**
         * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you
         * to retrieve security-related data.
         */
        fun services(): ServiceServiceAsync.WithRawResponse

        /**
         * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent
         * during a period, which is the basis for billing. Metronome automatically generates
         * invoices based upon your pricing, packaging, and usage events. Use these endpoints to
         * retrieve invoices.
         */
        fun invoices(): InvoiceServiceAsync.WithRawResponse

        fun contracts(): ContractServiceAsync.WithRawResponse

        fun packages(): PackageServiceAsync.WithRawResponse

        fun payments(): PaymentServiceAsync.WithRawResponse

        /**
         * Use these endpoints to configure a billing API key, a webhook secret, or invoice
         * finalization behavior.
         */
        fun settings(): SettingServiceAsync.WithRawResponse
    }
}
