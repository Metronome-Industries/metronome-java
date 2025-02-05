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
import com.metronome.api.core.prepare
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
import com.metronome.api.services.blocking.contracts.NamedScheduleService
import com.metronome.api.services.blocking.contracts.NamedScheduleServiceImpl
import com.metronome.api.services.blocking.contracts.ProductService
import com.metronome.api.services.blocking.contracts.ProductServiceImpl
import com.metronome.api.services.blocking.contracts.RateCardService
import com.metronome.api.services.blocking.contracts.RateCardServiceImpl

class ContractServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ContractService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val products: ProductService by lazy { ProductServiceImpl(clientOptions) }

    private val rateCards: RateCardService by lazy { RateCardServiceImpl(clientOptions) }

    private val namedSchedules: NamedScheduleService by lazy {
        NamedScheduleServiceImpl(clientOptions)
    }

    override fun products(): ProductService = products

    override fun rateCards(): RateCardService = rateCards

    override fun namedSchedules(): NamedScheduleService = namedSchedules

    private val createHandler: Handler<ContractCreateResponse> =
        jsonHandler<ContractCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new contract */
    override fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions
    ): ContractCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): ContractRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ContractListResponse> =
        jsonHandler<ContractListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all contracts for a customer */
    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions
    ): ContractListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val addManualBalanceEntryHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Add a manual balance entry */
    override fun addManualBalanceEntry(
        params: ContractAddManualBalanceEntryParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "addManualBalanceLedgerEntry")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { addManualBalanceEntryHandler.handle(it) }
    }

    private val amendHandler: Handler<ContractAmendResponse> =
        jsonHandler<ContractAmendResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Amend a contract */
    override fun amend(
        params: ContractAmendParams,
        requestOptions: RequestOptions
    ): ContractAmendResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "amend")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { amendHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): ContractArchiveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "archive")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): ContractCreateHistoricalInvoicesResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "createHistoricalInvoices")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHistoricalInvoicesHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): ContractListBalancesResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerBalances", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listBalancesHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): ContractRetrieveRateScheduleResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "getContractRateSchedule")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveRateScheduleHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): ContractScheduleProServicesInvoiceResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "scheduleProServicesInvoice")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { scheduleProServicesInvoiceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val setUsageFilterHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Set usage filter for a contract */
    override fun setUsageFilter(
        params: ContractSetUsageFilterParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "setUsageFilter")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { setUsageFilterHandler.handle(it) }
    }

    private val updateEndDateHandler: Handler<ContractUpdateEndDateResponse> =
        jsonHandler<ContractUpdateEndDateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the end date of a contract */
    override fun updateEndDate(
        params: ContractUpdateEndDateParams,
        requestOptions: RequestOptions
    ): ContractUpdateEndDateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "updateEndDate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateEndDateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
