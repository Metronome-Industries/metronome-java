// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1DashboardGetEmbeddableUrlParams
import com.metronome.api.models.V1DashboardGetEmbeddableUrlResponse
import java.util.concurrent.CompletableFuture

class DashboardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DashboardServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val getEmbeddableUrlHandler: Handler<V1DashboardGetEmbeddableUrlResponse> =
        jsonHandler<V1DashboardGetEmbeddableUrlResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun getEmbeddableUrl(
        params: V1DashboardGetEmbeddableUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1DashboardGetEmbeddableUrlResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dashboards", "getEmbeddableUrl")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getEmbeddableUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
