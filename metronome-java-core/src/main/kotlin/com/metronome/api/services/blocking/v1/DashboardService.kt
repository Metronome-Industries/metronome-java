// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1DashboardGetEmbeddableUrlParams
import com.metronome.api.models.V1DashboardGetEmbeddableUrlResponse

interface DashboardService {

    /**
     * Generate secure, embeddable dashboard URLs that allow you to seamlessly integrate Metronome's
     * billing visualizations directly into your application. This endpoint creates authenticated
     * iframe-ready URLs for customer-specific dashboards, providing a white-labeled billing
     * experience without building custom UI.
     *
     * ### Use this endpoint to:
     * - Embed billing dashboards directly in your customer portal or admin interface
     * - Provide self-service access to invoices, usage data, and credit balances
     * - Build white-labeled billing experiences with minimal development effort
     *
     * ### Key response fields:
     * - A secure, time-limited URL that can be embedded in an iframe
     * - The URL includes authentication tokens and configuration parameters
     * - URLs are customer-specific and respect your security settings
     *
     * ### Usage guidelines:
     * - Dashboard types: Choose from `invoices`, `usage`, or `commits_and_credits`
     * - Customization options:
     *     - `dashboard_options`: Configure whether you want invoices to show zero usage line items
     *     - `color_overrides`: Match your brand's color palette
     *     - `bm_group_key_overrides`: Customize how dimensions are displayed (for the usage
     *       embeddable dashboard)
     * - Iframe implementation: Embed the returned URL directly in an iframe element
     * - Responsive design: Dashboards automatically adapt to container dimensions
     */
    @JvmOverloads
    fun getEmbeddableUrl(
        params: V1DashboardGetEmbeddableUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DashboardGetEmbeddableUrlResponse
}
