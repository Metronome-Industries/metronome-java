// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.models.*
import com.metronome.api.services.blocking.*

interface MetronomeClient {

    fun async(): MetronomeClientAsync

    fun alerts(): AlertService

    fun plans(): PlanService

    fun creditGrants(): CreditGrantService

    fun customers(): CustomerService

    fun dashboards(): DashboardService

    fun usage(): UsageService

    fun auditLogs(): AuditLogService

    fun customFields(): CustomFieldService

    fun billableMetrics(): BillableMetricService

    fun services(): ServiceService

    fun invoices(): InvoiceService

    fun contracts(): ContractService
}
