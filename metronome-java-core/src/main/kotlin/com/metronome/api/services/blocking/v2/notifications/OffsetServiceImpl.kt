// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2.notifications

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
import com.metronome.api.core.prepare
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveParams
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveResponse
import com.metronome.api.models.v2.notifications.offset.OffsetCreateParams
import com.metronome.api.models.v2.notifications.offset.OffsetCreateResponse
import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import com.metronome.api.models.v2.notifications.offset.OffsetEditResponse
import com.metronome.api.models.v2.notifications.offset.OffsetListPage
import com.metronome.api.models.v2.notifications.offset.OffsetListPageResponse
import com.metronome.api.models.v2.notifications.offset.OffsetListParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveResponse
import java.util.function.Consumer

class OffsetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OffsetService {

    private val withRawResponse: OffsetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OffsetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetService =
        OffsetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: OffsetCreateParams,
        requestOptions: RequestOptions,
    ): OffsetCreateResponse =
        // post /v2/notifications/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: OffsetRetrieveParams,
        requestOptions: RequestOptions,
    ): OffsetRetrieveResponse =
        // post /v2/notifications/get
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: OffsetListParams, requestOptions: RequestOptions): OffsetListPage =
        // post /v2/notifications/offset/list
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: OffsetArchiveParams,
        requestOptions: RequestOptions,
    ): OffsetArchiveResponse =
        // post /v2/notifications/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun edit(
        params: OffsetEditParams,
        requestOptions: RequestOptions,
    ): OffsetEditResponse =
        // post /v2/notifications/edit
        withRawResponse().edit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OffsetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OffsetService.WithRawResponse =
            OffsetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<OffsetCreateResponse> =
            jsonHandler<OffsetCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OffsetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OffsetCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notifications", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<OffsetRetrieveResponse> =
            jsonHandler<OffsetRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OffsetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OffsetRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notifications", "get")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<OffsetListPageResponse> =
            jsonHandler<OffsetListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OffsetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OffsetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notifications", "offset", "list")
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
                        OffsetListPage.builder()
                            .service(OffsetServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<OffsetArchiveResponse> =
            jsonHandler<OffsetArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: OffsetArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OffsetArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notifications", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val editHandler: Handler<OffsetEditResponse> =
            jsonHandler<OffsetEditResponse>(clientOptions.jsonMapper)

        override fun edit(
            params: OffsetEditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OffsetEditResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notifications", "edit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
