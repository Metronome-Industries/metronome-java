// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

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
import com.metronome.api.models.v1.customers.invoices.InvoiceAddChargeParams
import com.metronome.api.models.v1.customers.invoices.InvoiceAddChargeResponse
import com.metronome.api.models.v1.customers.invoices.InvoiceListBreakdownsPage
import com.metronome.api.models.v1.customers.invoices.InvoiceListBreakdownsPageResponse
import com.metronome.api.models.v1.customers.invoices.InvoiceListBreakdownsParams
import com.metronome.api.models.v1.customers.invoices.InvoiceListPage
import com.metronome.api.models.v1.customers.invoices.InvoiceListPageResponse
import com.metronome.api.models.v1.customers.invoices.InvoiceListParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrieveParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrievePdfParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrieveResponse
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

    override fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions,
    ): InvoiceRetrieveResponse =
        // get /v1/customers/{customer_id}/invoices/{invoice_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: InvoiceListParams, requestOptions: RequestOptions): InvoiceListPage =
        // get /v1/customers/{customer_id}/invoices
        withRawResponse().list(params, requestOptions).parse()

    override fun addCharge(
        params: InvoiceAddChargeParams,
        requestOptions: RequestOptions,
    ): InvoiceAddChargeResponse =
        // post /v1/customers/{customer_id}/addCharge
        withRawResponse().addCharge(params, requestOptions).parse()

    override fun listBreakdowns(
        params: InvoiceListBreakdownsParams,
        requestOptions: RequestOptions,
    ): InvoiceListBreakdownsPage =
        // get /v1/customers/{customer_id}/invoices/breakdowns
        withRawResponse().listBreakdowns(params, requestOptions).parse()

    override fun retrievePdf(
        params: InvoiceRetrievePdfParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/customers/{customer_id}/invoices/{invoice_id}/pdf
        withRawResponse().retrievePdf(params, requestOptions)

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

        private val retrieveHandler: Handler<InvoiceRetrieveResponse> =
            jsonHandler<InvoiceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "invoices",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InvoiceListPageResponse> =
            jsonHandler<InvoiceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvoiceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "invoices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InvoiceListPage.builder()
                            .service(InvoiceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val addChargeHandler: Handler<InvoiceAddChargeResponse> =
            jsonHandler<InvoiceAddChargeResponse>(clientOptions.jsonMapper)

        override fun addCharge(
            params: InvoiceAddChargeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceAddChargeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "addCharge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addChargeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBreakdownsHandler: Handler<InvoiceListBreakdownsPageResponse> =
            jsonHandler<InvoiceListBreakdownsPageResponse>(clientOptions.jsonMapper)

        override fun listBreakdowns(
            params: InvoiceListBreakdownsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListBreakdownsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "invoices",
                        "breakdowns",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBreakdownsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InvoiceListBreakdownsPage.builder()
                            .service(InvoiceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        override fun retrievePdf(
            params: InvoiceRetrievePdfParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "invoices",
                        params._pathParam(1),
                        "pdf",
                    )
                    .putHeader("Accept", "application/pdf")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
