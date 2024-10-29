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
import com.metronome.api.models.ContractAddManualBalanceEntryParams
import com.metronome.api.models.ContractAmendParams
import com.metronome.api.models.ContractAmendResponse
import com.metronome.api.models.ContractArchiveParams
import com.metronome.api.models.ContractArchiveResponse
import com.metronome.api.models.ContractCreateHistoricalInvoicesParams
import com.metronome.api.models.ContractCreateHistoricalInvoicesResponse
import com.metronome.api.models.ContractCreateParams
import com.metronome.api.models.ContractCreateResponse
import com.metronome.api.models.ContractListBalancesParams
import com.metronome.api.models.ContractListBalancesResponse
import com.metronome.api.models.ContractListParams
import com.metronome.api.models.ContractListResponse
import com.metronome.api.models.ContractRetrieveParams
import com.metronome.api.models.ContractRetrieveRateScheduleParams
import com.metronome.api.models.ContractRetrieveRateScheduleResponse
import com.metronome.api.models.ContractRetrieveResponse
import com.metronome.api.models.ContractScheduleProServicesInvoiceParams
import com.metronome.api.models.ContractScheduleProServicesInvoiceResponse
import com.metronome.api.models.ContractSetUsageFilterParams
import com.metronome.api.models.ContractUpdateEndDateParams
import com.metronome.api.models.ContractUpdateEndDateResponse
import com.metronome.api.services.async.contracts.NamedScheduleServiceAsync
import com.metronome.api.services.async.contracts.NamedScheduleServiceAsyncImpl
import com.metronome.api.services.async.contracts.ProductServiceAsync
import com.metronome.api.services.async.contracts.ProductServiceAsyncImpl
import com.metronome.api.services.async.contracts.RateCardServiceAsync
import com.metronome.api.services.async.contracts.RateCardServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class ContractServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ContractServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val products: ProductServiceAsync by lazy { ProductServiceAsyncImpl(clientOptions) }

    private val rateCards: RateCardServiceAsync by lazy { RateCardServiceAsyncImpl(clientOptions) }

    private val namedSchedules: NamedScheduleServiceAsync by lazy {
        NamedScheduleServiceAsyncImpl(clientOptions)
    }

    override fun products(): ProductServiceAsync = products

    override fun rateCards(): RateCardServiceAsync = rateCards

    override fun namedSchedules(): NamedScheduleServiceAsync = namedSchedules

    private val createHandler: Handler<ContractCreateResponse> =
        jsonHandler<ContractCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new contract */
    override fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "create")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<ContractRetrieveResponse> =
        jsonHandler<ContractRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a specific contract */
    override fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
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

    private val listHandler: Handler<ContractListResponse> =
        jsonHandler<ContractListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all contracts for a customer */
    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
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
        }
    }

    private val addManualBalanceEntryHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Add a manual balance entry */
    override fun addManualBalanceEntry(
        params: ContractAddManualBalanceEntryParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "addManualBalanceLedgerEntry")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { addManualBalanceEntryHandler.handle(it) }
        }
    }

    private val amendHandler: Handler<ContractAmendResponse> =
        jsonHandler<ContractAmendResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Amend a contract */
    override fun amend(
        params: ContractAmendParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractAmendResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "amend")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { amendHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val archiveHandler: Handler<ContractArchiveResponse> =
        jsonHandler<ContractArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Archive a contract */
    override fun archive(
        params: ContractArchiveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractArchiveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "archive")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val createHistoricalInvoicesHandler: Handler<ContractCreateHistoricalInvoicesResponse> =
        jsonHandler<ContractCreateHistoricalInvoicesResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Creates historical usage invoices for a contract */
    override fun createHistoricalInvoices(
        params: ContractCreateHistoricalInvoicesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractCreateHistoricalInvoicesResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "createHistoricalInvoices")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHistoricalInvoicesHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listBalancesHandler: Handler<ContractListBalancesResponse> =
        jsonHandler<ContractListBalancesResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List balances (commits and credits). */
    override fun listBalances(
        params: ContractListBalancesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractListBalancesResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerBalances", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listBalancesHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveRateScheduleHandler: Handler<ContractRetrieveRateScheduleResponse> =
        jsonHandler<ContractRetrieveRateScheduleResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the rate schedule for the rate card on a given contract. */
    override fun retrieveRateSchedule(
        params: ContractRetrieveRateScheduleParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractRetrieveRateScheduleResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "getContractRateSchedule")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveRateScheduleHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val scheduleProServicesInvoiceHandler:
        Handler<ContractScheduleProServicesInvoiceResponse> =
        jsonHandler<ContractScheduleProServicesInvoiceResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create a new scheduled invoice for Professional Services terms on a contract. This endpoint's
     * availability is dependent on your client's configuration.
     */
    override fun scheduleProServicesInvoice(
        params: ContractScheduleProServicesInvoiceParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractScheduleProServicesInvoiceResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "scheduleProServicesInvoice")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { scheduleProServicesInvoiceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val setUsageFilterHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Set usage filter for a contract */
    override fun setUsageFilter(
        params: ContractSetUsageFilterParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "setUsageFilter")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { setUsageFilterHandler.handle(it) }
        }
    }

    private val updateEndDateHandler: Handler<ContractUpdateEndDateResponse> =
        jsonHandler<ContractUpdateEndDateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the end date of a contract */
    override fun updateEndDate(
        params: ContractUpdateEndDateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractUpdateEndDateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "updateEndDate")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateEndDateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
