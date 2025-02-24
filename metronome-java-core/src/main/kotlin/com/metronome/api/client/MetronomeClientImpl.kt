// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.getPackageVersion
import com.metronome.api.services.blocking.AlertService
import com.metronome.api.services.blocking.AlertServiceImpl
import com.metronome.api.services.blocking.AuditLogService
import com.metronome.api.services.blocking.AuditLogServiceImpl
import com.metronome.api.services.blocking.BillableMetricService
import com.metronome.api.services.blocking.BillableMetricServiceImpl
import com.metronome.api.services.blocking.ContractService
import com.metronome.api.services.blocking.ContractServiceImpl
import com.metronome.api.services.blocking.CreditGrantService
import com.metronome.api.services.blocking.CreditGrantServiceImpl
import com.metronome.api.services.blocking.CustomFieldService
import com.metronome.api.services.blocking.CustomFieldServiceImpl
import com.metronome.api.services.blocking.CustomerService
import com.metronome.api.services.blocking.CustomerServiceImpl
import com.metronome.api.services.blocking.DashboardService
import com.metronome.api.services.blocking.DashboardServiceImpl
import com.metronome.api.services.blocking.InvoiceService
import com.metronome.api.services.blocking.InvoiceServiceImpl
import com.metronome.api.services.blocking.PlanService
import com.metronome.api.services.blocking.PlanServiceImpl
import com.metronome.api.services.blocking.PricingUnitService
import com.metronome.api.services.blocking.PricingUnitServiceImpl
import com.metronome.api.services.blocking.ServiceService
import com.metronome.api.services.blocking.ServiceServiceImpl
import com.metronome.api.services.blocking.UsageService
import com.metronome.api.services.blocking.UsageServiceImpl

class MetronomeClientImpl(private val clientOptions: ClientOptions) : MetronomeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: MetronomeClientAsync by lazy { MetronomeClientAsyncImpl(clientOptions) }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptionsWithUserAgent) }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptionsWithUserAgent) }

    private val creditGrants: CreditGrantService by lazy {
        CreditGrantServiceImpl(clientOptionsWithUserAgent)
    }

    private val pricingUnits: PricingUnitService by lazy {
        PricingUnitServiceImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerService by lazy {
        CustomerServiceImpl(clientOptionsWithUserAgent)
    }

    private val dashboards: DashboardService by lazy {
        DashboardServiceImpl(clientOptionsWithUserAgent)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptionsWithUserAgent) }

    private val auditLogs: AuditLogService by lazy {
        AuditLogServiceImpl(clientOptionsWithUserAgent)
    }

    private val customFields: CustomFieldService by lazy {
        CustomFieldServiceImpl(clientOptionsWithUserAgent)
    }

    private val billableMetrics: BillableMetricService by lazy {
        BillableMetricServiceImpl(clientOptionsWithUserAgent)
    }

    private val services: ServiceService by lazy { ServiceServiceImpl(clientOptionsWithUserAgent) }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptionsWithUserAgent) }

    private val contracts: ContractService by lazy {
        ContractServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): MetronomeClientAsync = async

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

    override fun close() = clientOptions.httpClient.close()
}
