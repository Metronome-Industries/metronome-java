// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
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
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

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

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun alerts(): AlertServiceAsync.WithRawResponse

        fun plans(): PlanServiceAsync.WithRawResponse

        fun creditGrants(): CreditGrantServiceAsync.WithRawResponse

        fun pricingUnits(): PricingUnitServiceAsync.WithRawResponse

        fun customers(): CustomerServiceAsync.WithRawResponse

        fun dashboards(): DashboardServiceAsync.WithRawResponse

        fun usage(): UsageServiceAsync.WithRawResponse

        fun auditLogs(): AuditLogServiceAsync.WithRawResponse

        fun customFields(): CustomFieldServiceAsync.WithRawResponse

        fun billableMetrics(): BillableMetricServiceAsync.WithRawResponse

        fun services(): ServiceServiceAsync.WithRawResponse

        fun invoices(): InvoiceServiceAsync.WithRawResponse

        fun contracts(): ContractServiceAsync.WithRawResponse

        fun payments(): PaymentServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse
    }
}
