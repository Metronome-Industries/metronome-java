// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.blocking.v1.AlertService
import com.metronome.api.services.blocking.v1.AuditLogService
import com.metronome.api.services.blocking.v1.BillableMetricService
import com.metronome.api.services.blocking.v1.ContractService
import com.metronome.api.services.blocking.v1.CreditGrantService
import com.metronome.api.services.blocking.v1.CustomFieldService
import com.metronome.api.services.blocking.v1.CustomerService
import com.metronome.api.services.blocking.v1.DashboardService
import com.metronome.api.services.blocking.v1.InvoiceService
import com.metronome.api.services.blocking.v1.PackageService
import com.metronome.api.services.blocking.v1.PaymentService
import com.metronome.api.services.blocking.v1.PlanService
import com.metronome.api.services.blocking.v1.PricingUnitService
import com.metronome.api.services.blocking.v1.ServiceService
import com.metronome.api.services.blocking.v1.SettingService
import com.metronome.api.services.blocking.v1.UsageService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /**
     * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer spending,
     * balances, and other billing factors. Use these endpoints to create, retrieve, and archive
     * customer alerts. To view sample alert payloads by alert type, navigate
     * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
     */
    fun alerts(): AlertService

    /**
     * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the base
     * pricing for a customer. Use these endpoints to add a plan to a customer, end a customer plan,
     * retrieve plans, and retrieve plan details. Create plans in the
     * [Metronome app](https://app.metronome.com/plans).
     */
    fun plans(): PlanService

    /**
     * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/)
     * adjust a customer balance for prepayments, reimbursements, promotions, and so on. Use these
     * endpoints to create, retrieve, update, and delete credit grants.
     */
    fun creditGrants(): CreditGrantService

    /**
     * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
     * behavior.
     */
    fun pricingUnits(): PricingUnitService

    fun customers(): CustomerService

    /**
     * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome represent
     * your users for all billing and reporting. Use these endpoints to create, retrieve, update,
     * and archive customers and their billing configuration.
     */
    fun dashboards(): DashboardService

    /**
     * [Usage events](https://docs.metronome.com/connecting-metronome/send-usage-data/) are the
     * basis for billable metrics. Use these endpoints to send usage events to Metronome and
     * retrieve aggregated event data.
     */
    fun usage(): UsageService

    /**
     * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
     * retrieve security-related data.
     */
    fun auditLogs(): AuditLogService

    /**
     * [Custom fields](https://docs.metronome.com/integrations/custom-fields/) enable adding
     * additional data to Metronome entities. Use these endpoints to create, retrieve, update, and
     * delete custom fields.
     */
    fun customFields(): CustomFieldService

    /**
     * [Billable
     * metrics](https://docs.metronome.com/understanding-metronome/how-metronome-works#billable-metrics)
     * in Metronome represent the various consumption components that Metronome meters and
     * aggregates.
     */
    fun billableMetrics(): BillableMetricService

    /**
     * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
     * retrieve security-related data.
     */
    fun services(): ServiceService

    /**
     * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
     * period, which is the basis for billing. Metronome automatically generates invoices based upon
     * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
     */
    fun invoices(): InvoiceService

    fun contracts(): ContractService

    fun packages(): PackageService

    fun payments(): PaymentService

    /**
     * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
     * behavior.
     */
    fun settings(): SettingService

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer
         * spending, balances, and other billing factors. Use these endpoints to create, retrieve,
         * and archive customer alerts. To view sample alert payloads by alert type, navigate
         * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
         */
        fun alerts(): AlertService.WithRawResponse

        /**
         * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the
         * base pricing for a customer. Use these endpoints to add a plan to a customer, end a
         * customer plan, retrieve plans, and retrieve plan details. Create plans in the
         * [Metronome app](https://app.metronome.com/plans).
         */
        fun plans(): PlanService.WithRawResponse

        /**
         * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/)
         * adjust a customer balance for prepayments, reimbursements, promotions, and so on. Use
         * these endpoints to create, retrieve, update, and delete credit grants.
         */
        fun creditGrants(): CreditGrantService.WithRawResponse

        /**
         * Use these endpoints to configure a billing API key, a webhook secret, or invoice
         * finalization behavior.
         */
        fun pricingUnits(): PricingUnitService.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        /**
         * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome
         * represent your users for all billing and reporting. Use these endpoints to create,
         * retrieve, update, and archive customers and their billing configuration.
         */
        fun dashboards(): DashboardService.WithRawResponse

        /**
         * [Usage events](https://docs.metronome.com/connecting-metronome/send-usage-data/) are the
         * basis for billable metrics. Use these endpoints to send usage events to Metronome and
         * retrieve aggregated event data.
         */
        fun usage(): UsageService.WithRawResponse

        /**
         * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you
         * to retrieve security-related data.
         */
        fun auditLogs(): AuditLogService.WithRawResponse

        /**
         * [Custom fields](https://docs.metronome.com/integrations/custom-fields/) enable adding
         * additional data to Metronome entities. Use these endpoints to create, retrieve, update,
         * and delete custom fields.
         */
        fun customFields(): CustomFieldService.WithRawResponse

        /**
         * [Billable
         * metrics](https://docs.metronome.com/understanding-metronome/how-metronome-works#billable-metrics)
         * in Metronome represent the various consumption components that Metronome meters and
         * aggregates.
         */
        fun billableMetrics(): BillableMetricService.WithRawResponse

        /**
         * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you
         * to retrieve security-related data.
         */
        fun services(): ServiceService.WithRawResponse

        /**
         * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent
         * during a period, which is the basis for billing. Metronome automatically generates
         * invoices based upon your pricing, packaging, and usage events. Use these endpoints to
         * retrieve invoices.
         */
        fun invoices(): InvoiceService.WithRawResponse

        fun contracts(): ContractService.WithRawResponse

        fun packages(): PackageService.WithRawResponse

        fun payments(): PaymentService.WithRawResponse

        /**
         * Use these endpoints to configure a billing API key, a webhook secret, or invoice
         * finalization behavior.
         */
        fun settings(): SettingService.WithRawResponse
    }
}
