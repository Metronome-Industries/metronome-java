// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

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
import com.metronome.api.models.CustomerInvoiceAddChargeParams
import com.metronome.api.models.CustomerInvoiceAddChargeResponse
import com.metronome.api.models.CustomerInvoiceListBreakdownsPageAsync
import com.metronome.api.models.CustomerInvoiceListBreakdownsParams
import com.metronome.api.models.CustomerInvoiceListPageAsync
import com.metronome.api.models.CustomerInvoiceListParams
import com.metronome.api.models.CustomerInvoiceRetrieveParams
import com.metronome.api.models.CustomerInvoiceRetrieveResponse
import java.util.concurrent.CompletableFuture

class InvoiceServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InvoiceServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CustomerInvoiceRetrieveResponse> =
        jsonHandler<CustomerInvoiceRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetch a specific invoice for a given customer. */
    override fun retrieve(
        params: CustomerInvoiceRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerInvoiceRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "invoices",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CustomerInvoiceListPageAsync.Response> =
        jsonHandler<CustomerInvoiceListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List all invoices for a given customer, optionally filtered by status, date range, and/or
     * credit type.
     */
    override fun list(
        params: CustomerInvoiceListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerInvoiceListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "invoices")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerInvoiceListPageAsync.of(this, params, it) }
        }
    }

    private val addChargeHandler: Handler<CustomerInvoiceAddChargeResponse> =
        jsonHandler<CustomerInvoiceAddChargeResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a one time charge to the specified invoice */
    override fun addCharge(
        params: CustomerInvoiceAddChargeParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerInvoiceAddChargeResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "addCharge")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { addChargeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listBreakdownsHandler: Handler<CustomerInvoiceListBreakdownsPageAsync.Response> =
        jsonHandler<CustomerInvoiceListBreakdownsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List daily or hourly invoice breakdowns for a given customer, optionally filtered by status,
     * date range, and/or credit type.
     */
    override fun listBreakdowns(
        params: CustomerInvoiceListBreakdownsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerInvoiceListBreakdownsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "invoices", "breakdowns")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listBreakdownsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerInvoiceListBreakdownsPageAsync.of(this, params, it) }
        }
    }
}
