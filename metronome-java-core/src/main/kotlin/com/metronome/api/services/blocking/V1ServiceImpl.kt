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

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

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
}
