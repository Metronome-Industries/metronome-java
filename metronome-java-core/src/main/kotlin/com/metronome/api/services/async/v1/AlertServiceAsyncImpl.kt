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
import com.metronome.api.models.v1.alerts.AlertArchiveParams
import com.metronome.api.models.v1.alerts.AlertArchiveResponse
import com.metronome.api.models.v1.alerts.AlertCreateParams
import com.metronome.api.models.v1.alerts.AlertCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AlertServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertServiceAsync {

    private val withRawResponse: AlertServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertServiceAsync =
        AlertServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertCreateResponse> =
        // post /v1/alerts/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: AlertArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertArchiveResponse> =
        // post /v1/alerts/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertServiceAsync.WithRawResponse =
            AlertServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AlertCreateResponse> =
            jsonHandler<AlertCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AlertCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val archiveHandler: Handler<AlertArchiveResponse> =
            jsonHandler<AlertArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: AlertArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertArchiveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveHandler.handle(it) }
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
