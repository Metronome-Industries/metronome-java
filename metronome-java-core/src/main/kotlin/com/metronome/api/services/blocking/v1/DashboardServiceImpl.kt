// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

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
import com.metronome.api.models.v1.dashboards.DashboardGetEmbeddableUrlParams
import com.metronome.api.models.v1.dashboards.DashboardGetEmbeddableUrlResponse
import java.util.function.Consumer

class DashboardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DashboardService {

    private val withRawResponse: DashboardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DashboardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DashboardService =
        DashboardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getEmbeddableUrl(
        params: DashboardGetEmbeddableUrlParams,
        requestOptions: RequestOptions,
    ): DashboardGetEmbeddableUrlResponse =
        // post /v1/dashboards/getEmbeddableUrl
        withRawResponse().getEmbeddableUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DashboardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DashboardService.WithRawResponse =
            DashboardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getEmbeddableUrlHandler: Handler<DashboardGetEmbeddableUrlResponse> =
            jsonHandler<DashboardGetEmbeddableUrlResponse>(clientOptions.jsonMapper)

        override fun getEmbeddableUrl(
            params: DashboardGetEmbeddableUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DashboardGetEmbeddableUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "dashboards", "getEmbeddableUrl")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEmbeddableUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
