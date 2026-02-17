// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
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
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

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

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun alerts(): AlertService.WithRawResponse

        fun plans(): PlanService.WithRawResponse

        fun creditGrants(): CreditGrantService.WithRawResponse

        fun pricingUnits(): PricingUnitService.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        fun dashboards(): DashboardService.WithRawResponse

        fun usage(): UsageService.WithRawResponse

        fun auditLogs(): AuditLogService.WithRawResponse

        fun customFields(): CustomFieldService.WithRawResponse

        fun billableMetrics(): BillableMetricService.WithRawResponse

        fun services(): ServiceService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        fun contracts(): ContractService.WithRawResponse

        fun payments(): PaymentService.WithRawResponse

        fun settings(): SettingService.WithRawResponse
    }
}
