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
import com.metronome.api.models.v1.customers.commits.CommitCreateParams
import com.metronome.api.models.v1.customers.commits.CommitCreateResponse
import com.metronome.api.models.v1.customers.commits.CommitListPageAsync
import com.metronome.api.models.v1.customers.commits.CommitListPageResponse
import com.metronome.api.models.v1.customers.commits.CommitListParams
import com.metronome.api.models.v1.customers.commits.CommitUpdateEndDateParams
import com.metronome.api.models.v1.customers.commits.CommitUpdateEndDateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Credits and commits are used to manage customer balances. */
class CommitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitServiceAsync {

    private val withRawResponse: CommitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitServiceAsync =
        CommitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitCreateResponse> =
        // post /v1/contracts/customerCommits/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CommitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitListPageAsync> =
        // post /v1/contracts/customerCommits/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun updateEndDate(
        params: CommitUpdateEndDateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitUpdateEndDateResponse> =
        // post /v1/contracts/customerCommits/updateEndDate
        withRawResponse().updateEndDate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommitServiceAsync.WithRawResponse =
            CommitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CommitCreateResponse> =
            jsonHandler<CommitCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCommits", "create")
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

        private val listHandler: Handler<CommitListPageResponse> =
            jsonHandler<CommitListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CommitListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCommits", "list")
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
                                CommitListPageAsync.builder()
                                    .service(CommitServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateEndDateHandler: Handler<CommitUpdateEndDateResponse> =
            jsonHandler<CommitUpdateEndDateResponse>(clientOptions.jsonMapper)

        override fun updateEndDate(
            params: CommitUpdateEndDateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitUpdateEndDateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCommits", "updateEndDate")
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
