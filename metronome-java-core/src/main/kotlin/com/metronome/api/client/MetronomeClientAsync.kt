// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.services.async.AlertServiceAsync
import com.metronome.api.services.async.AuditLogServiceAsync
import com.metronome.api.services.async.BillableMetricServiceAsync
import com.metronome.api.services.async.ContractServiceAsync
import com.metronome.api.services.async.CreditGrantServiceAsync
import com.metronome.api.services.async.CustomFieldServiceAsync
import com.metronome.api.services.async.CustomerServiceAsync
import com.metronome.api.services.async.DashboardServiceAsync
import com.metronome.api.services.async.InvoiceServiceAsync
import com.metronome.api.services.async.PlanServiceAsync
import com.metronome.api.services.async.ServiceServiceAsync
import com.metronome.api.services.async.UsageServiceAsync

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
