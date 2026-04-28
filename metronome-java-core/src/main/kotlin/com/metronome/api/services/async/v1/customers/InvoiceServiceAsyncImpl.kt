// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

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
import com.metronome.api.models.v1.customers.invoices.InvoiceAddChargeParams
import com.metronome.api.models.v1.customers.invoices.InvoiceAddChargeResponse
import com.metronome.api.models.v1.customers.invoices.InvoiceListBreakdownsPageAsync
import com.metronome.api.models.v1.customers.invoices.InvoiceListBreakdownsPageResponse
import com.metronome.api.models.v1.customers.invoices.InvoiceListBreakdownsParams
import com.metronome.api.models.v1.customers.invoices.InvoiceListPageAsync
import com.metronome.api.models.v1.customers.invoices.InvoiceListPageResponse
import com.metronome.api.models.v1.customers.invoices.InvoiceListParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrieveParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrievePdfParams
import com.metronome.api.models.v1.customers.invoices.InvoiceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
 * period, which is the basis for billing. Metronome automatically generates invoices based upon
 * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
 */
class InvoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceServiceAsync {

    private val withRawResponse: InvoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync =
        InvoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceRetrieveResponse> =
        // get /v1/customers/{customer_id}/invoices/{invoice_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceListPageAsync> =
        // get /v1/customers/{customer_id}/invoices
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun addCharge(
        params: InvoiceAddChargeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceAddChargeResponse> =
        // post /v1/customers/{customer_id}/addCharge
        withRawResponse().addCharge(params, requestOptions).thenApply { it.parse() }

    override fun listBreakdowns(
        params: InvoiceListBreakdownsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceListBreakdownsPageAsync> =
        // get /v1/customers/{customer_id}/invoices/breakdowns
        withRawResponse().listBreakdowns(params, requestOptions).thenApply { it.parse() }

    override fun retrievePdf(
        params: InvoiceRetrievePdfParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /v1/customers/{customer_id}/invoices/{invoice_id}/pdf
        withRawResponse().retrievePdf(params, requestOptions)

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

        private val retrieveHandler: Handler<InvoiceRetrieveResponse> =
            jsonHandler<InvoiceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceRetrieveResponse>> {
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

        private val listHandler: Handler<InvoiceListPageResponse> =
            jsonHandler<InvoiceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvoiceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "invoices")
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
                                InvoiceListPageAsync.builder()
                                    .service(InvoiceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val addChargeHandler: Handler<InvoiceAddChargeResponse> =
            jsonHandler<InvoiceAddChargeResponse>(clientOptions.jsonMapper)

        override fun addCharge(
            params: InvoiceAddChargeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceAddChargeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "addCharge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addChargeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listBreakdownsHandler: Handler<InvoiceListBreakdownsPageResponse> =
            jsonHandler<InvoiceListBreakdownsPageResponse>(clientOptions.jsonMapper)

        override fun listBreakdowns(
            params: InvoiceListBreakdownsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceListBreakdownsPageAsync>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBreakdownsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                InvoiceListBreakdownsPageAsync.builder()
                                    .service(InvoiceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        override fun retrievePdf(
            params: InvoiceRetrievePdfParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
