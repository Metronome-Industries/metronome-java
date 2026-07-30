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
import com.metronome.api.models.v2.notifications.system.SystemListParams
import com.metronome.api.models.v2.notifications.system.SystemListResponse
import com.metronome.api.services.blocking.v2.notifications.SystemService
import com.metronome.api.services.blocking.v2.notifications.SystemServiceImpl
import java.util.function.Consumer

class SystemServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : SystemService {

    private val withRawResponse: SystemService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): SystemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemService = SystemServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: SystemListParams, requestOptions: RequestOptions): SystemListResponse =
        // post /v2/notifications/system/list
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : SystemService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemService.WithRawResponse = SystemServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<SystemListResponse> = jsonHandler<SystemListResponse>(clientOptions.jsonMapper)

        override fun list(params: SystemListParams, requestOptions: RequestOptions): HttpResponseFor<SystemListResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("v2", "notifications", "system", "list")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
