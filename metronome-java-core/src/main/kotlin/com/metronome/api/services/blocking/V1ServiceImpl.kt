// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.blocking.v1.AlertService
import com.metronome.api.services.blocking.v1.AlertServiceImpl
import com.metronome.api.services.blocking.v1.AuditLogService
import com.metronome.api.services.blocking.v1.AuditLogServiceImpl
import com.metronome.api.services.blocking.v1.BillableMetricService
import com.metronome.api.services.blocking.v1.BillableMetricServiceImpl
import com.metronome.api.services.blocking.v1.ContractService
import com.metronome.api.services.blocking.v1.ContractServiceImpl
import com.metronome.api.services.blocking.v1.CreditGrantService
import com.metronome.api.services.blocking.v1.CreditGrantServiceImpl
import com.metronome.api.services.blocking.v1.CustomFieldService
import com.metronome.api.services.blocking.v1.CustomFieldServiceImpl
import com.metronome.api.services.blocking.v1.CustomerService
import com.metronome.api.services.blocking.v1.CustomerServiceImpl
import com.metronome.api.services.blocking.v1.DashboardService
import com.metronome.api.services.blocking.v1.DashboardServiceImpl
import com.metronome.api.services.blocking.v1.InvoiceService
import com.metronome.api.services.blocking.v1.InvoiceServiceImpl
import com.metronome.api.services.blocking.v1.PaymentService
import com.metronome.api.services.blocking.v1.PaymentServiceImpl
import com.metronome.api.services.blocking.v1.PlanService
import com.metronome.api.services.blocking.v1.PlanServiceImpl
import com.metronome.api.services.blocking.v1.PricingUnitService
import com.metronome.api.services.blocking.v1.PricingUnitServiceImpl
import com.metronome.api.services.blocking.v1.ServiceService
import com.metronome.api.services.blocking.v1.ServiceServiceImpl
import com.metronome.api.services.blocking.v1.SettingService
import com.metronome.api.services.blocking.v1.SettingServiceImpl
import com.metronome.api.services.blocking.v1.UsageService
import com.metronome.api.services.blocking.v1.UsageServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptions) }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptions) }

    private val creditGrants: CreditGrantService by lazy { CreditGrantServiceImpl(clientOptions) }

    private val pricingUnits: PricingUnitService by lazy { PricingUnitServiceImpl(clientOptions) }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val dashboards: DashboardService by lazy { DashboardServiceImpl(clientOptions) }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    private val auditLogs: AuditLogService by lazy { AuditLogServiceImpl(clientOptions) }

    private val customFields: CustomFieldService by lazy { CustomFieldServiceImpl(clientOptions) }

    private val billableMetrics: BillableMetricService by lazy {
        BillableMetricServiceImpl(clientOptions)
    }

    private val services: ServiceService by lazy { ServiceServiceImpl(clientOptions) }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptions) }

    private val contracts: ContractService by lazy { ContractServiceImpl(clientOptions) }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptions) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun alerts(): AlertService = alerts

    override fun plans(): PlanService = plans

    override fun creditGrants(): CreditGrantService = creditGrants

    override fun pricingUnits(): PricingUnitService = pricingUnits

    override fun customers(): CustomerService = customers

    override fun dashboards(): DashboardService = dashboards

    override fun usage(): UsageService = usage

    override fun auditLogs(): AuditLogService = auditLogs

    override fun customFields(): CustomFieldService = customFields

    override fun billableMetrics(): BillableMetricService = billableMetrics

    override fun services(): ServiceService = services

    override fun invoices(): InvoiceService = invoices

    override fun contracts(): ContractService = contracts

    override fun payments(): PaymentService = payments

    override fun settings(): SettingService = settings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val alerts: AlertService.WithRawResponse by lazy {
            AlertServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditGrants: CreditGrantService.WithRawResponse by lazy {
            CreditGrantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pricingUnits: PricingUnitService.WithRawResponse by lazy {
            PricingUnitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dashboards: DashboardService.WithRawResponse by lazy {
            DashboardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val auditLogs: AuditLogService.WithRawResponse by lazy {
            AuditLogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customFields: CustomFieldService.WithRawResponse by lazy {
            CustomFieldServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val billableMetrics: BillableMetricService.WithRawResponse by lazy {
            BillableMetricServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val services: ServiceService.WithRawResponse by lazy {
            ServiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceService.WithRawResponse by lazy {
            InvoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractService.WithRawResponse by lazy {
            ContractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payments: PaymentService.WithRawResponse by lazy {
            PaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun alerts(): AlertService.WithRawResponse = alerts

        override fun plans(): PlanService.WithRawResponse = plans

        override fun creditGrants(): CreditGrantService.WithRawResponse = creditGrants

        override fun pricingUnits(): PricingUnitService.WithRawResponse = pricingUnits

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun dashboards(): DashboardService.WithRawResponse = dashboards

        override fun usage(): UsageService.WithRawResponse = usage

        override fun auditLogs(): AuditLogService.WithRawResponse = auditLogs

        override fun customFields(): CustomFieldService.WithRawResponse = customFields

        override fun billableMetrics(): BillableMetricService.WithRawResponse = billableMetrics

        override fun services(): ServiceService.WithRawResponse = services

        override fun invoices(): InvoiceService.WithRawResponse = invoices

        override fun contracts(): ContractService.WithRawResponse = contracts

        override fun payments(): PaymentService.WithRawResponse = payments

        override fun settings(): SettingService.WithRawResponse = settings
    }
}
