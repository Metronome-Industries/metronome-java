// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

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
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.usage.UsageIngestParams
import com.metronome.api.models.v1.usage.UsageListPage
import com.metronome.api.models.v1.usage.UsageListPageResponse
import com.metronome.api.models.v1.usage.UsageListParams
import com.metronome.api.models.v1.usage.UsageListWithGroupsPage
import com.metronome.api.models.v1.usage.UsageListWithGroupsPageResponse
import com.metronome.api.models.v1.usage.UsageListWithGroupsParams
import com.metronome.api.models.v1.usage.UsageSearchParams
import com.metronome.api.models.v1.usage.UsageSearchResponse
import java.util.function.Consumer

class UsageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageService {

    private val withRawResponse: UsageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService =
        UsageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: UsageListParams, requestOptions: RequestOptions): UsageListPage =
        // post /v1/usage
        withRawResponse().list(params, requestOptions).parse()

    override fun ingest(params: UsageIngestParams, requestOptions: RequestOptions) {
        // post /v1/ingest
        withRawResponse().ingest(params, requestOptions)
    }

    override fun listWithGroups(
        params: UsageListWithGroupsParams,
        requestOptions: RequestOptions,
    ): UsageListWithGroupsPage =
        // post /v1/usage/groups
        withRawResponse().listWithGroups(params, requestOptions).parse()

    override fun search(
        params: UsageSearchParams,
        requestOptions: RequestOptions,
    ): List<UsageSearchResponse> =
        // post /v1/events/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageService.WithRawResponse =
            UsageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<UsageListPageResponse> =
            jsonHandler<UsageListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UsageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "usage")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        UsageListPage.builder()
                            .service(UsageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val ingestHandler: Handler<Void?> = emptyHandler()

        override fun ingest(
            params: UsageIngestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ingest")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { ingestHandler.handle(it) }
            }
        }

        private val listWithGroupsHandler: Handler<UsageListWithGroupsPageResponse> =
            jsonHandler<UsageListWithGroupsPageResponse>(clientOptions.jsonMapper)

        override fun listWithGroups(
            params: UsageListWithGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageListWithGroupsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "usage", "groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listWithGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        UsageListWithGroupsPage.builder()
                            .service(UsageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val searchHandler: Handler<List<UsageSearchResponse>> =
            jsonHandler<List<UsageSearchResponse>>(clientOptions.jsonMapper)

        override fun search(
            params: UsageSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UsageSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "events", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
