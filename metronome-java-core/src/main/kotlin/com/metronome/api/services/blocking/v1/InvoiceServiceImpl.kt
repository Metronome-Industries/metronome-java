// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

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
import com.metronome.api.models.V1InvoiceRegenerateParams
import com.metronome.api.models.V1InvoiceRegenerateResponse
import com.metronome.api.models.V1InvoiceVoidParams
import com.metronome.api.models.V1InvoiceVoidResponse

class InvoiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val regenerateHandler: Handler<V1InvoiceRegenerateResponse> =
        jsonHandler<V1InvoiceRegenerateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint regenerates a voided invoice and recalculates the invoice based on up-to-date
     * rates, available balances, and other fees regardless of the billing period.
     *
     * ### Use this endpoint to:
     *
     * Recalculate an invoice with updated rate terms, available balance, and fees to correct
     * billing disputes or discrepancies
     *
     * ### Key response fields:
     *
     * The regenerated invoice id, which is distinct from the previously voided invoice.
     *
     * ### Usage guidelines:
     *
     * If an invoice is attached to a contract with a billing provider on it, the regenerated
     * invoice will be distributed based on the configuration.
     */
    override fun regenerate(
        params: V1InvoiceRegenerateParams,
        requestOptions: RequestOptions,
    ): V1InvoiceRegenerateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "invoices", "regenerate")
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

    private val voidHandler: Handler<V1InvoiceVoidResponse> =
        jsonHandler<V1InvoiceVoidResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Permanently cancels an invoice by setting its status to voided, preventing collection and
     * removing it from customer billing. Use this to correct billing errors, cancel incorrect
     * charges, or handle disputed invoices that should not be collected. Returns the voided invoice
     * ID with the status change applied immediately to stop any payment processing.
     */
    override fun void_(
        params: V1InvoiceVoidParams,
        requestOptions: RequestOptions,
    ): V1InvoiceVoidResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "invoices", "void")
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
