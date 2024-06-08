// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.client

import com.metronome.api.models.*
import com.metronome.api.services.blocking.*

interface MetronomeClient {

    fun async(): MetronomeClientAsync

    fun alerts(): AlertService

    fun customerAlerts(): CustomerAlertService

    fun plans(): PlanService

    fun credits(): CreditService

    fun creditTypes(): CreditTypeService

    fun customers(): CustomerService

    fun dashboards(): DashboardService

    fun usage(): UsageService

    fun auditLogs(): AuditLogService

    fun customFields(): CustomFieldService
}
