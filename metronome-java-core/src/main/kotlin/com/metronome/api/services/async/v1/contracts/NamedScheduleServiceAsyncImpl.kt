// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
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
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleRetrieveParams
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleRetrieveResponse
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class NamedScheduleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NamedScheduleServiceAsync {

    private val withRawResponse: NamedScheduleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NamedScheduleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamedScheduleServiceAsync =
        NamedScheduleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: NamedScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamedScheduleRetrieveResponse> =
        // post /v1/contract-pricing/rate-cards/getNamedSchedule
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: NamedScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/contract-pricing/rate-cards/updateNamedSchedule
        withRawResponse().update(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NamedScheduleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamedScheduleServiceAsync.WithRawResponse =
            NamedScheduleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<NamedScheduleRetrieveResponse> =
            jsonHandler<NamedScheduleRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NamedScheduleRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamedScheduleRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "getNamedSchedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: NamedScheduleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "updateNamedSchedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }
    }
}
