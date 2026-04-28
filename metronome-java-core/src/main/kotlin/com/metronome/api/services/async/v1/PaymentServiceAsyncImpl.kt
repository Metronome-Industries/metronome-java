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
import com.metronome.api.models.v1.payments.PaymentAttemptParams
import com.metronome.api.models.v1.payments.PaymentAttemptResponse
import com.metronome.api.models.v1.payments.PaymentCancelParams
import com.metronome.api.models.v1.payments.PaymentCancelResponse
import com.metronome.api.models.v1.payments.PaymentListPageAsync
import com.metronome.api.models.v1.payments.PaymentListPageResponse
import com.metronome.api.models.v1.payments.PaymentListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentServiceAsync =
        PaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentListPageAsync> =
        // post /v1/payments/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun attempt(
        params: PaymentAttemptParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentAttemptResponse> =
        // post /v1/payments/attempt
        withRawResponse().attempt(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: PaymentCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentCancelResponse> =
        // post /v1/payments/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentServiceAsync.WithRawResponse =
            PaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PaymentListPageResponse> =
            jsonHandler<PaymentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PaymentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "payments", "list")
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
                                PaymentListPageAsync.builder()
                                    .service(PaymentServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val attemptHandler: Handler<PaymentAttemptResponse> =
            jsonHandler<PaymentAttemptResponse>(clientOptions.jsonMapper)

        override fun attempt(
            params: PaymentAttemptParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentAttemptResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "payments", "attempt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { attemptHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelHandler: Handler<PaymentCancelResponse> =
            jsonHandler<PaymentCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: PaymentCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentCancelResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "payments", "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
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
