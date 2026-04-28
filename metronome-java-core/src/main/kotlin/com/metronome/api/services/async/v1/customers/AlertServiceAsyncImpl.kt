// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

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
import com.metronome.api.models.v1.customers.alerts.AlertListPageAsync
import com.metronome.api.models.v1.customers.alerts.AlertListPageResponse
import com.metronome.api.models.v1.customers.alerts.AlertListParams
import com.metronome.api.models.v1.customers.alerts.AlertResetParams
import com.metronome.api.models.v1.customers.alerts.AlertRetrieveParams
import com.metronome.api.models.v1.customers.alerts.AlertRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer spending,
 * balances, and other billing factors. Use these endpoints to create, retrieve, and archive
 * customer alerts. To view sample alert payloads by alert type, navigate
 * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
 */
class AlertServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertServiceAsync {

    private val withRawResponse: AlertServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertServiceAsync =
        AlertServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertRetrieveResponse> =
        // post /v1/customer-alerts/get
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AlertListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertListPageAsync> =
        // post /v1/customer-alerts/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun reset(
        params: AlertResetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/customer-alerts/reset
        withRawResponse().reset(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertServiceAsync.WithRawResponse =
            AlertServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AlertRetrieveResponse> =
            jsonHandler<AlertRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customer-alerts", "get")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AlertListPageResponse> =
            jsonHandler<AlertListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AlertListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customer-alerts", "list")
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
                                AlertListPageAsync.builder()
                                    .service(AlertServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val resetHandler: Handler<Void?> = emptyHandler()

        override fun reset(
            params: AlertResetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customer-alerts", "reset")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { resetHandler.handle(it) }
                    }
                }
        }
    }
}
