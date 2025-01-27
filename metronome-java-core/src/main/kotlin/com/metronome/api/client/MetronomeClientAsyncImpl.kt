// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.getPackageVersion
import com.metronome.api.services.async.AlertServiceAsync
import com.metronome.api.services.async.AlertServiceAsyncImpl
import com.metronome.api.services.async.AuditLogServiceAsync
import com.metronome.api.services.async.AuditLogServiceAsyncImpl
import com.metronome.api.services.async.BillableMetricServiceAsync
import com.metronome.api.services.async.BillableMetricServiceAsyncImpl
import com.metronome.api.services.async.ContractServiceAsync
import com.metronome.api.services.async.ContractServiceAsyncImpl
import com.metronome.api.services.async.CreditGrantServiceAsync
import com.metronome.api.services.async.CreditGrantServiceAsyncImpl
import com.metronome.api.services.async.CustomFieldServiceAsync
import com.metronome.api.services.async.CustomFieldServiceAsyncImpl
import com.metronome.api.services.async.CustomerServiceAsync
import com.metronome.api.services.async.CustomerServiceAsyncImpl
import com.metronome.api.services.async.DashboardServiceAsync
import com.metronome.api.services.async.DashboardServiceAsyncImpl
import com.metronome.api.services.async.InvoiceServiceAsync
import com.metronome.api.services.async.InvoiceServiceAsyncImpl
import com.metronome.api.services.async.PlanServiceAsync
import com.metronome.api.services.async.PlanServiceAsyncImpl
import com.metronome.api.services.async.PricingUnitServiceAsync
import com.metronome.api.services.async.PricingUnitServiceAsyncImpl
import com.metronome.api.services.async.ServiceServiceAsync
import com.metronome.api.services.async.ServiceServiceAsyncImpl
import com.metronome.api.services.async.UsageServiceAsync
import com.metronome.api.services.async.UsageServiceAsyncImpl

class MetronomeClientAsyncImpl(
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

    private val pricingUnits: PricingUnitServiceAsync by lazy {
        PricingUnitServiceAsyncImpl(clientOptionsWithUserAgent)
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

    override fun close() = clientOptions.httpClient.close()
}
