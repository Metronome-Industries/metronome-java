// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CustomerArchiveParams
import com.metronome.api.models.CustomerArchiveResponse
import com.metronome.api.models.CustomerCreateParams
import com.metronome.api.models.CustomerCreateResponse
import com.metronome.api.models.CustomerListBillableMetricsPageAsync
import com.metronome.api.models.CustomerListBillableMetricsParams
import com.metronome.api.models.CustomerListCostsPageAsync
import com.metronome.api.models.CustomerListCostsParams
import com.metronome.api.models.CustomerListPageAsync
import com.metronome.api.models.CustomerListParams
import com.metronome.api.models.CustomerRetrieveParams
import com.metronome.api.models.CustomerRetrieveResponse
import com.metronome.api.models.CustomerSetIngestAliasesParams
import com.metronome.api.models.CustomerSetNameParams
import com.metronome.api.models.CustomerSetNameResponse
import com.metronome.api.models.CustomerUpdateConfigParams
import com.metronome.api.services.async.customers.AlertServiceAsync
import com.metronome.api.services.async.customers.AlertServiceAsyncImpl
import com.metronome.api.services.async.customers.BillingConfigServiceAsync
import com.metronome.api.services.async.customers.BillingConfigServiceAsyncImpl
import com.metronome.api.services.async.customers.CommitServiceAsync
import com.metronome.api.services.async.customers.CommitServiceAsyncImpl
import com.metronome.api.services.async.customers.CreditServiceAsync
import com.metronome.api.services.async.customers.CreditServiceAsyncImpl
import com.metronome.api.services.async.customers.InvoiceServiceAsync
import com.metronome.api.services.async.customers.InvoiceServiceAsyncImpl
import com.metronome.api.services.async.customers.NamedScheduleServiceAsync
import com.metronome.api.services.async.customers.NamedScheduleServiceAsyncImpl
import com.metronome.api.services.async.customers.PlanServiceAsync
import com.metronome.api.services.async.customers.PlanServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class CustomerServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CustomerServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val alerts: AlertServiceAsync by lazy { AlertServiceAsyncImpl(clientOptions) }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptions) }

    private val invoices: InvoiceServiceAsync by lazy { InvoiceServiceAsyncImpl(clientOptions) }

    private val billingConfig: BillingConfigServiceAsync by lazy {
        BillingConfigServiceAsyncImpl(clientOptions)
    }

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val credits: CreditServiceAsync by lazy { CreditServiceAsyncImpl(clientOptions) }

    private val namedSchedules: NamedScheduleServiceAsync by lazy {
        NamedScheduleServiceAsyncImpl(clientOptions)
    }

    override fun alerts(): AlertServiceAsync = alerts

    override fun plans(): PlanServiceAsync = plans

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun billingConfig(): BillingConfigServiceAsync = billingConfig

    override fun commits(): CommitServiceAsync = commits

    override fun credits(): CreditServiceAsync = credits

    override fun namedSchedules(): NamedScheduleServiceAsync = namedSchedules

    private val createHandler: Handler<CustomerCreateResponse> =
        jsonHandler<CustomerCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new customer */
    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<CustomerRetrieveResponse> =
        jsonHandler<CustomerRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a customer by Metronome ID. */
    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
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

    private val listHandler: Handler<CustomerListPageAsync.Response> =
        jsonHandler<CustomerListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all customers. */
    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
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
                .let { CustomerListPageAsync.of(this, params, it) }
        }
    }

    private val archiveHandler: Handler<CustomerArchiveResponse> =
        jsonHandler<CustomerArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Archive a customer */
    override fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerArchiveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", "archive")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { archiveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listBillableMetricsHandler: Handler<CustomerListBillableMetricsPageAsync.Response> =
        jsonHandler<CustomerListBillableMetricsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get all billable metrics for a given customer. */
    override fun listBillableMetrics(
        params: CustomerListBillableMetricsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerListBillableMetricsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "billable-metrics")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listBillableMetricsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerListBillableMetricsPageAsync.of(this, params, it) }
        }
    }

    private val listCostsHandler: Handler<CustomerListCostsPageAsync.Response> =
        jsonHandler<CustomerListCostsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch daily pending costs for the specified customer, broken down by credit type and line
     * items. Note: this is not supported for customers whose plan includes a UNIQUE-type billable
     * metric.
     */
    override fun listCosts(
        params: CustomerListCostsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerListCostsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "costs")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listCostsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerListCostsPageAsync.of(this, params, it) }
        }
    }

    private val setIngestAliasesHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /**
     * Sets the ingest aliases for a customer. Ingest aliases can be used in the `customer_id` field
     * when sending usage events to Metronome. This call is idempotent. It fully replaces the set of
     * ingest aliases for the given customer.
     */
    override fun setIngestAliases(
        params: CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "setIngestAliases")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { setIngestAliasesHandler.handle(it) }
        }
    }

    private val setNameHandler: Handler<CustomerSetNameResponse> =
        jsonHandler<CustomerSetNameResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Updates the specified customer's name. */
    override fun setName(
        params: CustomerSetNameParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerSetNameResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "setName")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { setNameHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateConfigHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Updates the specified customer's config. */
    override fun updateConfig(
        params: CustomerUpdateConfigParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "updateConfig")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { updateConfigHandler.handle(it) }
        }
    }
}
