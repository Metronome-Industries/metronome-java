// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.services.blocking.v1.AlertService
import com.metronome.api.services.blocking.v1.AuditLogService
import com.metronome.api.services.blocking.v1.BillableMetricService
import com.metronome.api.services.blocking.v1.ContractService
import com.metronome.api.services.blocking.v1.CreditGrantService
import com.metronome.api.services.blocking.v1.CustomFieldService
import com.metronome.api.services.blocking.v1.CustomerService
import com.metronome.api.services.blocking.v1.DashboardService
import com.metronome.api.services.blocking.v1.InvoiceService
import com.metronome.api.services.blocking.v1.PaymentService
import com.metronome.api.services.blocking.v1.PlanService
import com.metronome.api.services.blocking.v1.PricingUnitService
import com.metronome.api.services.blocking.v1.ServiceService
import com.metronome.api.services.blocking.v1.SettingService
import com.metronome.api.services.blocking.v1.UsageService

interface V1Service {

    fun alerts(): AlertService

    fun plans(): PlanService

    fun creditGrants(): CreditGrantService

    fun pricingUnits(): PricingUnitService

    fun customers(): CustomerService

    fun dashboards(): DashboardService

    fun usage(): UsageService

    fun auditLogs(): AuditLogService

    fun customFields(): CustomFieldService

    fun billableMetrics(): BillableMetricService

    fun services(): ServiceService

    fun invoices(): InvoiceService

    fun contracts(): ContractService

    fun payments(): PaymentService

    fun settings(): SettingService
}
