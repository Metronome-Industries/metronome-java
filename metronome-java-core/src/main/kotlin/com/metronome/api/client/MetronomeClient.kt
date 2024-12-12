// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.services.blocking.AlertService
import com.metronome.api.services.blocking.AuditLogService
import com.metronome.api.services.blocking.BillableMetricService
import com.metronome.api.services.blocking.ContractService
import com.metronome.api.services.blocking.CreditGrantService
import com.metronome.api.services.blocking.CustomFieldService
import com.metronome.api.services.blocking.CustomerService
import com.metronome.api.services.blocking.DashboardService
import com.metronome.api.services.blocking.InvoiceService
import com.metronome.api.services.blocking.PlanService
import com.metronome.api.services.blocking.ServiceService
import com.metronome.api.services.blocking.UsageService

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
