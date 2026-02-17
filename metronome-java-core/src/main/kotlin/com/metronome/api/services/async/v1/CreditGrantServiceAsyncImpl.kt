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
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateParams
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantEditParams
import com.metronome.api.models.v1.creditgrants.CreditGrantEditResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesPageAsync
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesPageResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesParams
import com.metronome.api.models.v1.creditgrants.CreditGrantListPageAsync
import com.metronome.api.models.v1.creditgrants.CreditGrantListPageResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CreditGrantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditGrantServiceAsync {

    private val withRawResponse: CreditGrantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditGrantServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditGrantServiceAsync =
        CreditGrantServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CreditGrantCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGrantCreateResponse> =
        // post /v1/credits/createGrant
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CreditGrantListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGrantListPageAsync> =
        // post /v1/credits/listGrants
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun edit(
        params: CreditGrantEditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGrantEditResponse> =
        // post /v1/credits/editGrant
        withRawResponse().edit(params, requestOptions).thenApply { it.parse() }

    override fun listEntries(
        params: CreditGrantListEntriesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGrantListEntriesPageAsync> =
        // post /v1/credits/listEntries
        withRawResponse().listEntries(params, requestOptions).thenApply { it.parse() }

    override fun void_(
        params: CreditGrantVoidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGrantVoidResponse> =
        // post /v1/credits/voidGrant
        withRawResponse().void_(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditGrantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditGrantServiceAsync.WithRawResponse =
            CreditGrantServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreditGrantCreateResponse> =
            jsonHandler<CreditGrantCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CreditGrantCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "createGrant")
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

        private val listHandler: Handler<CreditGrantListPageResponse> =
            jsonHandler<CreditGrantListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CreditGrantListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "listGrants")
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
                                CreditGrantListPageAsync.builder()
                                    .service(CreditGrantServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val editHandler: Handler<CreditGrantEditResponse> =
            jsonHandler<CreditGrantEditResponse>(clientOptions.jsonMapper)

        override fun edit(
            params: CreditGrantEditParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantEditResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "editGrant")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { editHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEntriesHandler: Handler<CreditGrantListEntriesPageResponse> =
            jsonHandler<CreditGrantListEntriesPageResponse>(clientOptions.jsonMapper)

        override fun listEntries(
            params: CreditGrantListEntriesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantListEntriesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "listEntries")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEntriesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CreditGrantListEntriesPageAsync.builder()
                                    .service(CreditGrantServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val voidHandler: Handler<CreditGrantVoidResponse> =
            jsonHandler<CreditGrantVoidResponse>(clientOptions.jsonMapper)

        override fun void_(
            params: CreditGrantVoidParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantVoidResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "voidGrant")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { voidHandler.handle(it) }
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
