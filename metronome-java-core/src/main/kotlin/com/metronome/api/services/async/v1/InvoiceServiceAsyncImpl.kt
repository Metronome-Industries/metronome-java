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
import com.metronome.api.models.v1.invoices.InvoiceRegenerateParams
import com.metronome.api.models.v1.invoices.InvoiceRegenerateResponse
import com.metronome.api.models.v1.invoices.InvoiceVoidParams
import com.metronome.api.models.v1.invoices.InvoiceVoidResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InvoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceServiceAsync {

    private val withRawResponse: InvoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync =
        InvoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun regenerate(
        params: InvoiceRegenerateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceRegenerateResponse> =
        // post /v1/invoices/regenerate
        withRawResponse().regenerate(params, requestOptions).thenApply { it.parse() }

    override fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceVoidResponse> =
        // post /v1/invoices/void
        withRawResponse().void_(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse =
            InvoiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val regenerateHandler: Handler<InvoiceRegenerateResponse> =
            jsonHandler<InvoiceRegenerateResponse>(clientOptions.jsonMapper)

        override fun regenerate(
            params: InvoiceRegenerateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceRegenerateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "invoices", "regenerate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { regenerateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val voidHandler: Handler<InvoiceVoidResponse> =
            jsonHandler<InvoiceVoidResponse>(clientOptions.jsonMapper)

        override fun void_(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceVoidResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "invoices", "void")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { voidHandler.handle(it) }
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
