// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.async.v1.AlertServiceAsync
import com.metronome.api.services.async.v1.AlertServiceAsyncImpl
import com.metronome.api.services.async.v1.AuditLogServiceAsync
import com.metronome.api.services.async.v1.AuditLogServiceAsyncImpl
import com.metronome.api.services.async.v1.BillableMetricServiceAsync
import com.metronome.api.services.async.v1.BillableMetricServiceAsyncImpl
import com.metronome.api.services.async.v1.ContractServiceAsync
import com.metronome.api.services.async.v1.ContractServiceAsyncImpl
import com.metronome.api.services.async.v1.CreditGrantServiceAsync
import com.metronome.api.services.async.v1.CreditGrantServiceAsyncImpl
import com.metronome.api.services.async.v1.CustomFieldServiceAsync
import com.metronome.api.services.async.v1.CustomFieldServiceAsyncImpl
import com.metronome.api.services.async.v1.CustomerServiceAsync
import com.metronome.api.services.async.v1.CustomerServiceAsyncImpl
import com.metronome.api.services.async.v1.DashboardServiceAsync
import com.metronome.api.services.async.v1.DashboardServiceAsyncImpl
import com.metronome.api.services.async.v1.InvoiceServiceAsync
import com.metronome.api.services.async.v1.InvoiceServiceAsyncImpl
import com.metronome.api.services.async.v1.PackageServiceAsync
import com.metronome.api.services.async.v1.PackageServiceAsyncImpl
import com.metronome.api.services.async.v1.PaymentServiceAsync
import com.metronome.api.services.async.v1.PaymentServiceAsyncImpl
import com.metronome.api.services.async.v1.PlanServiceAsync
import com.metronome.api.services.async.v1.PlanServiceAsyncImpl
import com.metronome.api.services.async.v1.PricingUnitServiceAsync
import com.metronome.api.services.async.v1.PricingUnitServiceAsyncImpl
import com.metronome.api.services.async.v1.ServiceServiceAsync
import com.metronome.api.services.async.v1.ServiceServiceAsyncImpl
import com.metronome.api.services.async.v1.SettingServiceAsync
import com.metronome.api.services.async.v1.SettingServiceAsyncImpl
import com.metronome.api.services.async.v1.UsageServiceAsync
import com.metronome.api.services.async.v1.UsageServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val alerts: AlertServiceAsync by lazy { AlertServiceAsyncImpl(clientOptions) }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptions) }

    private val creditGrants: CreditGrantServiceAsync by lazy {
        CreditGrantServiceAsyncImpl(clientOptions)
    }

    private val pricingUnits: PricingUnitServiceAsync by lazy {
        PricingUnitServiceAsyncImpl(clientOptions)
    }

    private val customers: CustomerServiceAsync by lazy { CustomerServiceAsyncImpl(clientOptions) }

    private val dashboards: DashboardServiceAsync by lazy {
        DashboardServiceAsyncImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    private val auditLogs: AuditLogServiceAsync by lazy { AuditLogServiceAsyncImpl(clientOptions) }

    private val customFields: CustomFieldServiceAsync by lazy {
        CustomFieldServiceAsyncImpl(clientOptions)
    }

    private val billableMetrics: BillableMetricServiceAsync by lazy {
        BillableMetricServiceAsyncImpl(clientOptions)
    }

    private val services: ServiceServiceAsync by lazy { ServiceServiceAsyncImpl(clientOptions) }

    private val invoices: InvoiceServiceAsync by lazy { InvoiceServiceAsyncImpl(clientOptions) }

    private val contracts: ContractServiceAsync by lazy { ContractServiceAsyncImpl(clientOptions) }

    private val packages: PackageServiceAsync by lazy { PackageServiceAsyncImpl(clientOptions) }

    private val payments: PaymentServiceAsync by lazy { PaymentServiceAsyncImpl(clientOptions) }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer spending,
     * balances, and other billing factors. Use these endpoints to create, retrieve, and archive
     * customer alerts. To view sample alert payloads by alert type, navigate
     * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
     */
    override fun alerts(): AlertServiceAsync = alerts

    /**
     * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the base
     * pricing for a customer. Use these endpoints to add a plan to a customer, end a customer plan,
     * retrieve plans, and retrieve plan details. Create plans in the
     * [Metronome app](https://app.metronome.com/plans).
     */
    override fun plans(): PlanServiceAsync = plans

    /**
     * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/)
     * adjust a customer balance for prepayments, reimbursements, promotions, and so on. Use these
     * endpoints to create, retrieve, update, and delete credit grants.
     */
    override fun creditGrants(): CreditGrantServiceAsync = creditGrants

    /**
     * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
     * behavior.
     */
    override fun pricingUnits(): PricingUnitServiceAsync = pricingUnits

    override fun customers(): CustomerServiceAsync = customers

    /**
     * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome represent
     * your users for all billing and reporting. Use these endpoints to create, retrieve, update,
     * and archive customers and their billing configuration.
     */
    override fun dashboards(): DashboardServiceAsync = dashboards

    /**
     * [Usage events](https://docs.metronome.com/connecting-metronome/send-usage-data/) are the
     * basis for billable metrics. Use these endpoints to send usage events to Metronome and
     * retrieve aggregated event data.
     */
    override fun usage(): UsageServiceAsync = usage

    /**
     * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
     * retrieve security-related data.
     */
    override fun auditLogs(): AuditLogServiceAsync = auditLogs

    /**
     * [Custom fields](https://docs.metronome.com/integrations/custom-fields/) enable adding
     * additional data to Metronome entities. Use these endpoints to create, retrieve, update, and
     * delete custom fields.
     */
    override fun customFields(): CustomFieldServiceAsync = customFields

    /**
     * [Billable
     * metrics](https://docs.metronome.com/understanding-metronome/how-metronome-works#billable-metrics)
     * in Metronome represent the various consumption components that Metronome meters and
     * aggregates.
     */
    override fun billableMetrics(): BillableMetricServiceAsync = billableMetrics

    /**
     * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
     * retrieve security-related data.
     */
    override fun services(): ServiceServiceAsync = services

    /**
     * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
     * period, which is the basis for billing. Metronome automatically generates invoices based upon
     * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
     */
    override fun invoices(): InvoiceServiceAsync = invoices

    override fun contracts(): ContractServiceAsync = contracts

    override fun packages(): PackageServiceAsync = packages

    override fun payments(): PaymentServiceAsync = payments

    /**
     * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
     * behavior.
     */
    override fun settings(): SettingServiceAsync = settings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val alerts: AlertServiceAsync.WithRawResponse by lazy {
            AlertServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanServiceAsync.WithRawResponse by lazy {
            PlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditGrants: CreditGrantServiceAsync.WithRawResponse by lazy {
            CreditGrantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pricingUnits: PricingUnitServiceAsync.WithRawResponse by lazy {
            PricingUnitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dashboards: DashboardServiceAsync.WithRawResponse by lazy {
            DashboardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val auditLogs: AuditLogServiceAsync.WithRawResponse by lazy {
            AuditLogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customFields: CustomFieldServiceAsync.WithRawResponse by lazy {
            CustomFieldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val billableMetrics: BillableMetricServiceAsync.WithRawResponse by lazy {
            BillableMetricServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val services: ServiceServiceAsync.WithRawResponse by lazy {
            ServiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceServiceAsync.WithRawResponse by lazy {
            InvoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractServiceAsync.WithRawResponse by lazy {
            ContractServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val packages: PackageServiceAsync.WithRawResponse by lazy {
            PackageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payments: PaymentServiceAsync.WithRawResponse by lazy {
            PaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer
         * spending, balances, and other billing factors. Use these endpoints to create, retrieve,
         * and archive customer alerts. To view sample alert payloads by alert type, navigate
         * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
         */
        override fun alerts(): AlertServiceAsync.WithRawResponse = alerts

        /**
         * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the
         * base pricing for a customer. Use these endpoints to add a plan to a customer, end a
         * customer plan, retrieve plans, and retrieve plan details. Create plans in the
         * [Metronome app](https://app.metronome.com/plans).
         */
        override fun plans(): PlanServiceAsync.WithRawResponse = plans

        /**
         * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/)
         * adjust a customer balance for prepayments, reimbursements, promotions, and so on. Use
         * these endpoints to create, retrieve, update, and delete credit grants.
         */
        override fun creditGrants(): CreditGrantServiceAsync.WithRawResponse = creditGrants

        /**
         * Use these endpoints to configure a billing API key, a webhook secret, or invoice
         * finalization behavior.
         */
        override fun pricingUnits(): PricingUnitServiceAsync.WithRawResponse = pricingUnits

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        /**
         * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome
         * represent your users for all billing and reporting. Use these endpoints to create,
         * retrieve, update, and archive customers and their billing configuration.
         */
        override fun dashboards(): DashboardServiceAsync.WithRawResponse = dashboards

        /**
         * [Usage events](https://docs.metronome.com/connecting-metronome/send-usage-data/) are the
         * basis for billable metrics. Use these endpoints to send usage events to Metronome and
         * retrieve aggregated event data.
         */
        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        /**
         * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you
         * to retrieve security-related data.
         */
        override fun auditLogs(): AuditLogServiceAsync.WithRawResponse = auditLogs

        /**
         * [Custom fields](https://docs.metronome.com/integrations/custom-fields/) enable adding
         * additional data to Metronome entities. Use these endpoints to create, retrieve, update,
         * and delete custom fields.
         */
        override fun customFields(): CustomFieldServiceAsync.WithRawResponse = customFields

        /**
         * [Billable
         * metrics](https://docs.metronome.com/understanding-metronome/how-metronome-works#billable-metrics)
         * in Metronome represent the various consumption components that Metronome meters and
         * aggregates.
         */
        override fun billableMetrics(): BillableMetricServiceAsync.WithRawResponse = billableMetrics

        /**
         * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you
         * to retrieve security-related data.
         */
        override fun services(): ServiceServiceAsync.WithRawResponse = services

        /**
         * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent
         * during a period, which is the basis for billing. Metronome automatically generates
         * invoices based upon your pricing, packaging, and usage events. Use these endpoints to
         * retrieve invoices.
         */
        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        override fun contracts(): ContractServiceAsync.WithRawResponse = contracts

        override fun packages(): PackageServiceAsync.WithRawResponse = packages

        override fun payments(): PaymentServiceAsync.WithRawResponse = payments

        /**
         * Use these endpoints to configure a billing API key, a webhook secret, or invoice
         * finalization behavior.
         */
        override fun settings(): SettingServiceAsync.WithRawResponse = settings
    }
}
