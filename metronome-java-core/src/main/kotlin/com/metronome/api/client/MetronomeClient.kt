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

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
