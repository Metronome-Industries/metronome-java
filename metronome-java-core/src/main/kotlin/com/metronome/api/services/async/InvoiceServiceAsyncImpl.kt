// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.InvoiceRegenerateParams
import com.metronome.api.models.InvoiceRegenerateResponse
import com.metronome.api.models.InvoiceVoidParams
import com.metronome.api.models.InvoiceVoidResponse
import java.util.concurrent.CompletableFuture

class InvoiceServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InvoiceServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val regenerateHandler: Handler<InvoiceRegenerateResponse> =
        jsonHandler<InvoiceRegenerateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Regenerate a voided contract invoice */
    override fun regenerate(
        params: InvoiceRegenerateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InvoiceRegenerateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", "regenerate")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { regenerateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val voidHandler: Handler<InvoiceVoidResponse> =
        jsonHandler<InvoiceVoidResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Void an invoice */
    override fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InvoiceVoidResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", "void")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { voidHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
