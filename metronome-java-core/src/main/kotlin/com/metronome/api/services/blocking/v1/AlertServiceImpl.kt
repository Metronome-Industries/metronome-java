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
import com.metronome.api.models.v1.alerts.AlertArchiveParams
import com.metronome.api.models.v1.alerts.AlertArchiveResponse
import com.metronome.api.models.v1.alerts.AlertCreateParams
import com.metronome.api.models.v1.alerts.AlertCreateResponse
import java.util.function.Consumer

/**
 * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer spending,
 * balances, and other billing factors. Use these endpoints to create, retrieve, and archive
 * customer alerts. To view sample alert payloads by alert type, navigate
 * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
 */
class AlertServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertService {

    private val withRawResponse: AlertService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService =
        AlertServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions,
    ): AlertCreateResponse =
        // post /v1/alerts/create
        withRawResponse().create(params, requestOptions).parse()

    override fun archive(
        params: AlertArchiveParams,
        requestOptions: RequestOptions,
    ): AlertArchiveResponse =
        // post /v1/alerts/archive
        withRawResponse().archive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertService.WithRawResponse =
            AlertServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AlertCreateResponse> =
            jsonHandler<AlertCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AlertCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts", "create")
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

        private val archiveHandler: Handler<AlertArchiveResponse> =
            jsonHandler<AlertArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: AlertArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts", "archive")
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
    }
}
