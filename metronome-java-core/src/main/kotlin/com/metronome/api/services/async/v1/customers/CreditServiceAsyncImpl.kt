// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

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
import com.metronome.api.models.v1.customers.credits.CreditCreateParams
import com.metronome.api.models.v1.customers.credits.CreditCreateResponse
import com.metronome.api.models.v1.customers.credits.CreditListPageAsync
import com.metronome.api.models.v1.customers.credits.CreditListPageResponse
import com.metronome.api.models.v1.customers.credits.CreditListParams
import com.metronome.api.models.v1.customers.credits.CreditUpdateEndDateParams
import com.metronome.api.models.v1.customers.credits.CreditUpdateEndDateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Credits and commits are used to manage customer balances. */
class CreditServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditServiceAsync {

    private val withRawResponse: CreditServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditServiceAsync =
        CreditServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CreditCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditCreateResponse> =
        // post /v1/contracts/customerCredits/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CreditListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditListPageAsync> =
        // post /v1/contracts/customerCredits/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun updateEndDate(
        params: CreditUpdateEndDateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditUpdateEndDateResponse> =
        // post /v1/contracts/customerCredits/updateEndDate
        withRawResponse().updateEndDate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditServiceAsync.WithRawResponse =
            CreditServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreditCreateResponse> =
            jsonHandler<CreditCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CreditCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCredits", "create")
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

        private val listHandler: Handler<CreditListPageResponse> =
            jsonHandler<CreditListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CreditListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCredits", "list")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                                CreditListPageAsync.builder()
                                    .service(CreditServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateEndDateHandler: Handler<CreditUpdateEndDateResponse> =
            jsonHandler<CreditUpdateEndDateResponse>(clientOptions.jsonMapper)

        override fun updateEndDate(
            params: CreditUpdateEndDateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditUpdateEndDateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCredits", "updateEndDate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateEndDateHandler.handle(it) }
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
