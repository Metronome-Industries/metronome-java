// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.services.async.v1.AlertServiceAsync
import com.metronome.api.services.async.v1.AuditLogServiceAsync
import com.metronome.api.services.async.v1.BillableMetricServiceAsync
import com.metronome.api.services.async.v1.ContractServiceAsync
import com.metronome.api.services.async.v1.CreditGrantServiceAsync
import com.metronome.api.services.async.v1.CustomFieldServiceAsync
import com.metronome.api.services.async.v1.CustomerServiceAsync
import com.metronome.api.services.async.v1.DashboardServiceAsync
import com.metronome.api.services.async.v1.InvoiceServiceAsync
import com.metronome.api.services.async.v1.PaymentServiceAsync
import com.metronome.api.services.async.v1.PlanServiceAsync
import com.metronome.api.services.async.v1.PricingUnitServiceAsync
import com.metronome.api.services.async.v1.ServiceServiceAsync
import com.metronome.api.services.async.v1.SettingServiceAsync
import com.metronome.api.services.async.v1.UsageServiceAsync

interface V1ServiceAsync {

    fun alerts(): AlertServiceAsync

    fun plans(): PlanServiceAsync

    fun creditGrants(): CreditGrantServiceAsync

    fun pricingUnits(): PricingUnitServiceAsync

    fun customers(): CustomerServiceAsync

    fun dashboards(): DashboardServiceAsync

    fun usage(): UsageServiceAsync

    fun auditLogs(): AuditLogServiceAsync

    fun customFields(): CustomFieldServiceAsync

    fun billableMetrics(): BillableMetricServiceAsync

    fun services(): ServiceServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun contracts(): ContractServiceAsync

    fun payments(): PaymentServiceAsync

    fun settings(): SettingServiceAsync
}
