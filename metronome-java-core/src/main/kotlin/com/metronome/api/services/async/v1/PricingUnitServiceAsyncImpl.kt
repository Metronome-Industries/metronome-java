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
import com.metronome.api.models.v1.pricingunits.PricingUnitArchiveParams
import com.metronome.api.models.v1.pricingunits.PricingUnitArchiveResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateParams
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitListPageAsync
import com.metronome.api.models.v1.pricingunits.PricingUnitListPageResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
 * behavior.
 */
class PricingUnitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingUnitServiceAsync {

    private val withRawResponse: PricingUnitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PricingUnitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PricingUnitServiceAsync =
        PricingUnitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PricingUnitCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PricingUnitCreateResponse> =
        // post /v1/credit-types/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PricingUnitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PricingUnitListPageAsync> =
        // get /v1/credit-types/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: PricingUnitArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PricingUnitArchiveResponse> =
        // post /v1/credit-types/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PricingUnitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PricingUnitServiceAsync.WithRawResponse =
            PricingUnitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PricingUnitCreateResponse> =
            jsonHandler<PricingUnitCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PricingUnitCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PricingUnitCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credit-types", "create")
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

        private val listHandler: Handler<PricingUnitListPageResponse> =
            jsonHandler<PricingUnitListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PricingUnitListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credit-types", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PricingUnitListPageAsync.builder()
                                    .service(PricingUnitServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<PricingUnitArchiveResponse> =
            jsonHandler<PricingUnitArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: PricingUnitArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PricingUnitArchiveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credit-types", "archive")
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
