// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

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
import com.metronome.api.models.CustomerListBillableMetricsPage
import com.metronome.api.models.CustomerListBillableMetricsParams
import com.metronome.api.models.CustomerListCostsPage
import com.metronome.api.models.CustomerListCostsParams
import com.metronome.api.models.CustomerListPage
import com.metronome.api.models.CustomerListParams
import com.metronome.api.models.CustomerRetrieveParams
import com.metronome.api.models.CustomerRetrieveResponse
import com.metronome.api.models.CustomerSetIngestAliasesParams
import com.metronome.api.models.CustomerSetNameParams
import com.metronome.api.models.CustomerSetNameResponse
import com.metronome.api.models.CustomerUpdateConfigParams
import com.metronome.api.services.blocking.customers.AlertService
import com.metronome.api.services.blocking.customers.AlertServiceImpl
import com.metronome.api.services.blocking.customers.BillingConfigService
import com.metronome.api.services.blocking.customers.BillingConfigServiceImpl
import com.metronome.api.services.blocking.customers.CommitService
import com.metronome.api.services.blocking.customers.CommitServiceImpl
import com.metronome.api.services.blocking.customers.CreditService
import com.metronome.api.services.blocking.customers.CreditServiceImpl
import com.metronome.api.services.blocking.customers.InvoiceService
import com.metronome.api.services.blocking.customers.InvoiceServiceImpl
import com.metronome.api.services.blocking.customers.NamedScheduleService
import com.metronome.api.services.blocking.customers.NamedScheduleServiceImpl
import com.metronome.api.services.blocking.customers.PlanService
import com.metronome.api.services.blocking.customers.PlanServiceImpl

class CustomerServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CustomerService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptions) }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptions) }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptions) }

    private val billingConfig: BillingConfigService by lazy {
        BillingConfigServiceImpl(clientOptions)
    }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptions) }

    private val credits: CreditService by lazy { CreditServiceImpl(clientOptions) }

    private val namedSchedules: NamedScheduleService by lazy {
        NamedScheduleServiceImpl(clientOptions)
    }

    override fun alerts(): AlertService = alerts

    override fun plans(): PlanService = plans

    override fun invoices(): InvoiceService = invoices

    override fun billingConfig(): BillingConfigService = billingConfig

    override fun commits(): CommitService = commits

    override fun credits(): CreditService = credits

    override fun namedSchedules(): NamedScheduleService = namedSchedules

    private val createHandler: Handler<CustomerCreateResponse> =
        jsonHandler<CustomerCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new customer */
    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions
    ): CustomerCreateResponse {
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): CustomerRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
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

    private val listHandler: Handler<CustomerListPage.Response> =
        jsonHandler<CustomerListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all customers. */
    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions
    ): CustomerListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerListPage.of(this, params, it) }
        }
    }

    private val archiveHandler: Handler<CustomerArchiveResponse> =
        jsonHandler<CustomerArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Archive a customer */
    override fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions
    ): CustomerArchiveResponse {
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { archiveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listBillableMetricsHandler: Handler<CustomerListBillableMetricsPage.Response> =
        jsonHandler<CustomerListBillableMetricsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get all billable metrics for a given customer. */
    override fun listBillableMetrics(
        params: CustomerListBillableMetricsParams,
        requestOptions: RequestOptions
    ): CustomerListBillableMetricsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "billable-metrics")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listBillableMetricsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerListBillableMetricsPage.of(this, params, it) }
        }
    }

    private val listCostsHandler: Handler<CustomerListCostsPage.Response> =
        jsonHandler<CustomerListCostsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch daily pending costs for the specified customer, broken down by credit type and line
     * items. Note: this is not supported for customers whose plan includes a UNIQUE-type billable
     * metric.
     */
    override fun listCosts(
        params: CustomerListCostsParams,
        requestOptions: RequestOptions
    ): CustomerListCostsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "costs")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listCostsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerListCostsPage.of(this, params, it) }
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
    ) {
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
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): CustomerSetNameResponse {
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun updateConfig(params: CustomerUpdateConfigParams, requestOptions: RequestOptions) {
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
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { updateConfigHandler.handle(it) }
        }
    }
}
