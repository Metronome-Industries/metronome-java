// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.InvoiceRegenerateParams
import com.metronome.api.models.InvoiceRegenerateResponse
import com.metronome.api.models.InvoiceVoidParams
import com.metronome.api.models.InvoiceVoidResponse

class InvoiceServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InvoiceService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val regenerateHandler: Handler<InvoiceRegenerateResponse> =
        jsonHandler<InvoiceRegenerateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Regenerate a voided contract invoice */
    override fun regenerate(
        params: InvoiceRegenerateParams,
        requestOptions: RequestOptions
    ): InvoiceRegenerateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", "regenerate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { regenerateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val voidHandler: Handler<InvoiceVoidResponse> =
        jsonHandler<InvoiceVoidResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Void an invoice */
    override fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions
    ): InvoiceVoidResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", "void")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { voidHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
