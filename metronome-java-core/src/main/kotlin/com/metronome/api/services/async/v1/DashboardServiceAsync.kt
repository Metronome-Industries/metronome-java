// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.dashboards.DashboardGetEmbeddableUrlParams
import com.metronome.api.models.v1.dashboards.DashboardGetEmbeddableUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome represent
 * your users for all billing and reporting. Use these endpoints to create, retrieve, update, and
 * archive customers and their billing configuration.
 */
interface DashboardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DashboardServiceAsync

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
    fun getEmbeddableUrl(
        params: DashboardGetEmbeddableUrlParams
    ): CompletableFuture<DashboardGetEmbeddableUrlResponse> =
        getEmbeddableUrl(params, RequestOptions.none())

    /** @see getEmbeddableUrl */
    fun getEmbeddableUrl(
        params: DashboardGetEmbeddableUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DashboardGetEmbeddableUrlResponse>

    /**
     * A view of [DashboardServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DashboardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/dashboards/getEmbeddableUrl`, but is otherwise
         * the same as [DashboardServiceAsync.getEmbeddableUrl].
         */
        fun getEmbeddableUrl(
            params: DashboardGetEmbeddableUrlParams
        ): CompletableFuture<HttpResponseFor<DashboardGetEmbeddableUrlResponse>> =
            getEmbeddableUrl(params, RequestOptions.none())

        /** @see getEmbeddableUrl */
        fun getEmbeddableUrl(
            params: DashboardGetEmbeddableUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DashboardGetEmbeddableUrlResponse>>
    }
}
