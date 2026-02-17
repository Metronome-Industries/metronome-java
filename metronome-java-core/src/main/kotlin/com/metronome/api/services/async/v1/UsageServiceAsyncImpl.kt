// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

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
import com.metronome.api.models.v1.usage.UsageIngestParams
import com.metronome.api.models.v1.usage.UsageListPageAsync
import com.metronome.api.models.v1.usage.UsageListPageResponse
import com.metronome.api.models.v1.usage.UsageListParams
import com.metronome.api.models.v1.usage.UsageListWithGroupsPageAsync
import com.metronome.api.models.v1.usage.UsageListWithGroupsPageResponse
import com.metronome.api.models.v1.usage.UsageListWithGroupsParams
import com.metronome.api.models.v1.usage.UsageSearchParams
import com.metronome.api.models.v1.usage.UsageSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class UsageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageServiceAsync {

    private val withRawResponse: UsageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync =
        UsageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: UsageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageListPageAsync> =
        // post /v1/usage
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun ingest(
        params: UsageIngestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/ingest
        withRawResponse().ingest(params, requestOptions).thenAccept {}

    override fun listWithGroups(
        params: UsageListWithGroupsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageListWithGroupsPageAsync> =
        // post /v1/usage/groups
        withRawResponse().listWithGroups(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: UsageSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<UsageSearchResponse>> =
        // post /v1/events/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse =
            UsageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<UsageListPageResponse> =
            jsonHandler<UsageListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UsageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "usage")
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
                                UsageListPageAsync.builder()
                                    .service(UsageServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val ingestHandler: Handler<Void?> = emptyHandler()

        override fun ingest(
            params: UsageIngestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ingest")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { ingestHandler.handle(it) }
                    }
                }
        }

        private val listWithGroupsHandler: Handler<UsageListWithGroupsPageResponse> =
            jsonHandler<UsageListWithGroupsPageResponse>(clientOptions.jsonMapper)

        override fun listWithGroups(
            params: UsageListWithGroupsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageListWithGroupsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "usage", "groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listWithGroupsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                UsageListWithGroupsPageAsync.builder()
                                    .service(UsageServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val searchHandler: Handler<List<UsageSearchResponse>> =
            jsonHandler<List<UsageSearchResponse>>(clientOptions.jsonMapper)

        override fun search(
            params: UsageSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<UsageSearchResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "events", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
