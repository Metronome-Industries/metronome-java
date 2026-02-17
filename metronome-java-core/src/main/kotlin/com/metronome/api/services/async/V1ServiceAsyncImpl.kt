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

    private val payments: PaymentServiceAsync by lazy { PaymentServiceAsyncImpl(clientOptions) }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun alerts(): AlertServiceAsync = alerts

    override fun plans(): PlanServiceAsync = plans

    override fun creditGrants(): CreditGrantServiceAsync = creditGrants

    override fun pricingUnits(): PricingUnitServiceAsync = pricingUnits

    override fun customers(): CustomerServiceAsync = customers

    override fun dashboards(): DashboardServiceAsync = dashboards

    override fun usage(): UsageServiceAsync = usage

    override fun auditLogs(): AuditLogServiceAsync = auditLogs

    override fun customFields(): CustomFieldServiceAsync = customFields

    override fun billableMetrics(): BillableMetricServiceAsync = billableMetrics

    override fun services(): ServiceServiceAsync = services

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun contracts(): ContractServiceAsync = contracts

    override fun payments(): PaymentServiceAsync = payments

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

        override fun alerts(): AlertServiceAsync.WithRawResponse = alerts

        override fun plans(): PlanServiceAsync.WithRawResponse = plans

        override fun creditGrants(): CreditGrantServiceAsync.WithRawResponse = creditGrants

        override fun pricingUnits(): PricingUnitServiceAsync.WithRawResponse = pricingUnits

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        override fun dashboards(): DashboardServiceAsync.WithRawResponse = dashboards

        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        override fun auditLogs(): AuditLogServiceAsync.WithRawResponse = auditLogs

        override fun customFields(): CustomFieldServiceAsync.WithRawResponse = customFields

        override fun billableMetrics(): BillableMetricServiceAsync.WithRawResponse = billableMetrics

        override fun services(): ServiceServiceAsync.WithRawResponse = services

        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        override fun contracts(): ContractServiceAsync.WithRawResponse = contracts

        override fun payments(): PaymentServiceAsync.WithRawResponse = payments

        override fun settings(): SettingServiceAsync.WithRawResponse = settings
    }
}
