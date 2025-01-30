// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

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
import com.metronome.api.models.CustomerInvoiceAddChargeParams
import com.metronome.api.models.CustomerInvoiceAddChargeResponse
import com.metronome.api.models.CustomerInvoiceListBreakdownsPage
import com.metronome.api.models.CustomerInvoiceListBreakdownsParams
import com.metronome.api.models.CustomerInvoiceListPage
import com.metronome.api.models.CustomerInvoiceListParams
import com.metronome.api.models.CustomerInvoiceRetrieveParams
import com.metronome.api.models.CustomerInvoiceRetrieveResponse

class InvoiceServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InvoiceService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CustomerInvoiceRetrieveResponse> =
        jsonHandler<CustomerInvoiceRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetch a specific invoice for a given customer. */
    override fun retrieve(
        params: CustomerInvoiceRetrieveParams,
        requestOptions: RequestOptions
    ): CustomerInvoiceRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "invoices",
                    params.getPathParam(1)
                )
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CustomerInvoiceListPage.Response> =
        jsonHandler<CustomerInvoiceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List all invoices for a given customer, optionally filtered by status, date range, and/or
     * credit type.
     */
    override fun list(
        params: CustomerInvoiceListParams,
        requestOptions: RequestOptions
    ): CustomerInvoiceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "invoices")
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerInvoiceListPage.of(this, params, it) }
        }
    }

    private val addChargeHandler: Handler<CustomerInvoiceAddChargeResponse> =
        jsonHandler<CustomerInvoiceAddChargeResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a one time charge to the specified invoice */
    override fun addCharge(
        params: CustomerInvoiceAddChargeParams,
        requestOptions: RequestOptions
    ): CustomerInvoiceAddChargeResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "addCharge")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { addChargeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listBreakdownsHandler: Handler<CustomerInvoiceListBreakdownsPage.Response> =
        jsonHandler<CustomerInvoiceListBreakdownsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List daily or hourly invoice breakdowns for a given customer, optionally filtered by status,
     * date range, and/or credit type.
     */
    override fun listBreakdowns(
        params: CustomerInvoiceListBreakdownsParams,
        requestOptions: RequestOptions
    ): CustomerInvoiceListBreakdownsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "invoices", "breakdowns")
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listBreakdownsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerInvoiceListBreakdownsPage.of(this, params, it) }
        }
    }
}
