// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.getPackageVersion
import com.metronome.api.models.*
import com.metronome.api.services.async.*

class MetronomeClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : MetronomeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: MetronomeClient by lazy { MetronomeClientImpl(clientOptions) }

    private val alerts: AlertServiceAsync by lazy {
        AlertServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val creditGrants: CreditGrantServiceAsync by lazy {
        CreditGrantServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerServiceAsync by lazy {
        CustomerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dashboards: DashboardServiceAsync by lazy {
        DashboardServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val usage: UsageServiceAsync by lazy {
        UsageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val auditLogs: AuditLogServiceAsync by lazy {
        AuditLogServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customFields: CustomFieldServiceAsync by lazy {
        CustomFieldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val billableMetrics: BillableMetricServiceAsync by lazy {
        BillableMetricServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val services: ServiceServiceAsync by lazy {
        ServiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceServiceAsync by lazy {
        InvoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val contracts: ContractServiceAsync by lazy {
        ContractServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): MetronomeClient = sync

    override fun alerts(): AlertServiceAsync = alerts

    override fun plans(): PlanServiceAsync = plans

    override fun creditGrants(): CreditGrantServiceAsync = creditGrants

    override fun customers(): CustomerServiceAsync = customers

    override fun dashboards(): DashboardServiceAsync = dashboards

    override fun usage(): UsageServiceAsync = usage

    override fun auditLogs(): AuditLogServiceAsync = auditLogs

    override fun customFields(): CustomFieldServiceAsync = customFields

    override fun billableMetrics(): BillableMetricServiceAsync = billableMetrics

    override fun services(): ServiceServiceAsync = services

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun contracts(): ContractServiceAsync = contracts
}
