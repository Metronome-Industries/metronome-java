// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.*
import com.metronome.api.services.async.*
import com.metronome.api.services.errorHandler

class MetronomeClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : MetronomeClientAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val sync: MetronomeClient by lazy { MetronomeClientImpl(clientOptions) }

    private val alerts: AlertServiceAsync by lazy { AlertServiceAsyncImpl(clientOptions) }

    private val customerAlerts: CustomerAlertServiceAsync by lazy {
        CustomerAlertServiceAsyncImpl(clientOptions)
    }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptions) }

    private val credits: CreditServiceAsync by lazy { CreditServiceAsyncImpl(clientOptions) }

    private val creditTypes: CreditTypeServiceAsync by lazy {
        CreditTypeServiceAsyncImpl(clientOptions)
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

    override fun sync(): MetronomeClient = sync

    override fun alerts(): AlertServiceAsync = alerts

    override fun customerAlerts(): CustomerAlertServiceAsync = customerAlerts

    override fun plans(): PlanServiceAsync = plans

    override fun credits(): CreditServiceAsync = credits

    override fun creditTypes(): CreditTypeServiceAsync = creditTypes

    override fun customers(): CustomerServiceAsync = customers

    override fun dashboards(): DashboardServiceAsync = dashboards

    override fun usage(): UsageServiceAsync = usage

    override fun auditLogs(): AuditLogServiceAsync = auditLogs

    override fun customFields(): CustomFieldServiceAsync = customFields
}
