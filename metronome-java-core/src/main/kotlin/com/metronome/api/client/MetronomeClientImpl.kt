// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.*
import com.metronome.api.services.blocking.*
import com.metronome.api.services.errorHandler

class MetronomeClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : MetronomeClient {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val async: MetronomeClientAsync by lazy { MetronomeClientAsyncImpl(clientOptions) }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptions) }

    private val customerAlerts: CustomerAlertService by lazy {
        CustomerAlertServiceImpl(clientOptions)
    }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptions) }

    private val credits: CreditService by lazy { CreditServiceImpl(clientOptions) }

    private val creditTypes: CreditTypeService by lazy { CreditTypeServiceImpl(clientOptions) }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val dashboards: DashboardService by lazy { DashboardServiceImpl(clientOptions) }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    private val auditLogs: AuditLogService by lazy { AuditLogServiceImpl(clientOptions) }

    private val customFields: CustomFieldService by lazy { CustomFieldServiceImpl(clientOptions) }

    override fun async(): MetronomeClientAsync = async

    override fun alerts(): AlertService = alerts

    override fun customerAlerts(): CustomerAlertService = customerAlerts

    override fun plans(): PlanService = plans

    override fun credits(): CreditService = credits

    override fun creditTypes(): CreditTypeService = creditTypes

    override fun customers(): CustomerService = customers

    override fun dashboards(): DashboardService = dashboards

    override fun usage(): UsageService = usage

    override fun auditLogs(): AuditLogService = auditLogs

    override fun customFields(): CustomFieldService = customFields
}
