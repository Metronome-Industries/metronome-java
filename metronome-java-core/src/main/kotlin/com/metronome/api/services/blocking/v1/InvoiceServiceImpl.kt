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
import com.metronome.api.models.v1.invoices.InvoiceRegenerateParams
import com.metronome.api.models.v1.invoices.InvoiceRegenerateResponse
import com.metronome.api.models.v1.invoices.InvoiceVoidParams
import com.metronome.api.models.v1.invoices.InvoiceVoidResponse
import java.util.function.Consumer

/**
 * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
 * period, which is the basis for billing. Metronome automatically generates invoices based upon
 * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
 */
class InvoiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceService {

    private val withRawResponse: InvoiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService =
        InvoiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun regenerate(
        params: InvoiceRegenerateParams,
        requestOptions: RequestOptions,
    ): InvoiceRegenerateResponse =
        // post /v1/invoices/regenerate
        withRawResponse().regenerate(params, requestOptions).parse()

    override fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions,
    ): InvoiceVoidResponse =
        // post /v1/invoices/void
        withRawResponse().void_(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceService.WithRawResponse =
            InvoiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val regenerateHandler: Handler<InvoiceRegenerateResponse> =
            jsonHandler<InvoiceRegenerateResponse>(clientOptions.jsonMapper)

        override fun regenerate(
            params: InvoiceRegenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceRegenerateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "invoices", "regenerate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { regenerateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val voidHandler: Handler<InvoiceVoidResponse> =
            jsonHandler<InvoiceVoidResponse>(clientOptions.jsonMapper)

        override fun void_(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceVoidResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "invoices", "void")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
