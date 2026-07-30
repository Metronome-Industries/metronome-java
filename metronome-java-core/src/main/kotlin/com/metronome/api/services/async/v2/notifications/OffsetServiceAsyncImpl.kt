// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2.notifications

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
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveParams
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveResponse
import com.metronome.api.models.v2.notifications.offset.OffsetCreateParams
import com.metronome.api.models.v2.notifications.offset.OffsetCreateResponse
import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import com.metronome.api.models.v2.notifications.offset.OffsetEditResponse
import com.metronome.api.models.v2.notifications.offset.OffsetListPage
import com.metronome.api.models.v2.notifications.offset.OffsetListPageAsync
import com.metronome.api.models.v2.notifications.offset.OffsetListPageResponse
import com.metronome.api.models.v2.notifications.offset.OffsetListParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveResponse
import com.metronome.api.services.async.v2.notifications.OffsetServiceAsync
import com.metronome.api.services.async.v2.notifications.OffsetServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OffsetServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OffsetServiceAsync {

    private val withRawResponse: OffsetServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OffsetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetServiceAsync = OffsetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: OffsetCreateParams, requestOptions: RequestOptions): CompletableFuture<OffsetCreateResponse> =
        // post /v2/notifications/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(params: OffsetRetrieveParams, requestOptions: RequestOptions): CompletableFuture<OffsetRetrieveResponse> =
        // post /v2/notifications/get
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: OffsetListParams, requestOptions: RequestOptions): CompletableFuture<OffsetListPageAsync> =
        // post /v2/notifications/offset/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(params: OffsetArchiveParams, requestOptions: RequestOptions): CompletableFuture<OffsetArchiveResponse> =
        // post /v2/notifications/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun edit(params: OffsetEditParams, requestOptions: RequestOptions): CompletableFuture<OffsetEditResponse> =
        // post /v2/notifications/edit
        withRawResponse().edit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OffsetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetServiceAsync.WithRawResponse = OffsetServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<OffsetCreateResponse> = jsonHandler<OffsetCreateResponse>(clientOptions.jsonMapper)

        override fun create(params: OffsetCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OffsetCreateResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("v2", "notifications", "create")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val retrieveHandler: Handler<OffsetRetrieveResponse> = jsonHandler<OffsetRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(params: OffsetRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OffsetRetrieveResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("v2", "notifications", "get")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val listHandler: Handler<OffsetListPageResponse> = jsonHandler<OffsetListPageResponse>(clientOptions.jsonMapper)

        override fun list(params: OffsetListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OffsetListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("v2", "notifications", "offset", "list")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  OffsetListPageAsync.builder()
                      .service(OffsetServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .response(it)
                      .build()
              }
          } }
        }

        private val archiveHandler: Handler<OffsetArchiveResponse> = jsonHandler<OffsetArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(params: OffsetArchiveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OffsetArchiveResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("v2", "notifications", "archive")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  archiveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val editHandler: Handler<OffsetEditResponse> = jsonHandler<OffsetEditResponse>(clientOptions.jsonMapper)

        override fun edit(params: OffsetEditParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OffsetEditResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("v2", "notifications", "edit")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  editHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }
    }
}
