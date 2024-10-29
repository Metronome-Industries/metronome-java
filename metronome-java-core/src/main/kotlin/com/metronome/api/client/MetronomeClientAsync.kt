// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.models.*
import com.metronome.api.services.async.*

interface MetronomeClientAsync {

    fun sync(): MetronomeClient

    fun alerts(): AlertServiceAsync

    fun plans(): PlanServiceAsync

    fun creditGrants(): CreditGrantServiceAsync

    fun customers(): CustomerServiceAsync

    fun dashboards(): DashboardServiceAsync

    fun usage(): UsageServiceAsync

    fun auditLogs(): AuditLogServiceAsync

    fun customFields(): CustomFieldServiceAsync

    fun billableMetrics(): BillableMetricServiceAsync

    fun services(): ServiceServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun contracts(): ContractServiceAsync
}
