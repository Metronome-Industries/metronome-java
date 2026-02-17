// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorBodyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.core.http.json
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepareAsync
import com.metronome.api.models.v1.dashboards.DashboardGetEmbeddableUrlParams
import com.metronome.api.models.v1.dashboards.DashboardGetEmbeddableUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DashboardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DashboardServiceAsync {

    private val withRawResponse: DashboardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DashboardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DashboardServiceAsync =
        DashboardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getEmbeddableUrl(
        params: DashboardGetEmbeddableUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DashboardGetEmbeddableUrlResponse> =
        // post /v1/dashboards/getEmbeddableUrl
        withRawResponse().getEmbeddableUrl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DashboardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DashboardServiceAsync.WithRawResponse =
            DashboardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getEmbeddableUrlHandler: Handler<DashboardGetEmbeddableUrlResponse> =
            jsonHandler<DashboardGetEmbeddableUrlResponse>(clientOptions.jsonMapper)

        override fun getEmbeddableUrl(
            params: DashboardGetEmbeddableUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DashboardGetEmbeddableUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "dashboards", "getEmbeddableUrl")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getEmbeddableUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
