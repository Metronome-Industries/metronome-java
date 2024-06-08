// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.client

import com.metronome.api.models.*
import com.metronome.api.services.async.*

interface MetronomeClientAsync {

    fun sync(): MetronomeClient

    fun alerts(): AlertServiceAsync

    fun customerAlerts(): CustomerAlertServiceAsync

    fun plans(): PlanServiceAsync

    fun credits(): CreditServiceAsync

    fun creditTypes(): CreditTypeServiceAsync

    fun customers(): CustomerServiceAsync

    fun dashboards(): DashboardServiceAsync

    fun usage(): UsageServiceAsync

    fun auditLogs(): AuditLogServiceAsync

    fun customFields(): CustomFieldServiceAsync
}
