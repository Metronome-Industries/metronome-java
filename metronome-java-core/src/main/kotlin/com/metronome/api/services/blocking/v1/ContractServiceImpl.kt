// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
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
import com.metronome.api.models.v1.contracts.ContractAddManualBalanceEntryParams
import com.metronome.api.models.v1.contracts.ContractAmendParams
import com.metronome.api.models.v1.contracts.ContractAmendResponse
import com.metronome.api.models.v1.contracts.ContractArchiveParams
import com.metronome.api.models.v1.contracts.ContractArchiveResponse
import com.metronome.api.models.v1.contracts.ContractCreateHistoricalInvoicesParams
import com.metronome.api.models.v1.contracts.ContractCreateHistoricalInvoicesResponse
import com.metronome.api.models.v1.contracts.ContractCreateParams
import com.metronome.api.models.v1.contracts.ContractCreateResponse
import com.metronome.api.models.v1.contracts.ContractGetNetBalanceParams
import com.metronome.api.models.v1.contracts.ContractGetNetBalanceResponse
import com.metronome.api.models.v1.contracts.ContractListBalancesPage
import com.metronome.api.models.v1.contracts.ContractListBalancesPageResponse
import com.metronome.api.models.v1.contracts.ContractListBalancesParams
import com.metronome.api.models.v1.contracts.ContractListParams
import com.metronome.api.models.v1.contracts.ContractListResponse
import com.metronome.api.models.v1.contracts.ContractRetrieveParams
import com.metronome.api.models.v1.contracts.ContractRetrieveRateScheduleParams
import com.metronome.api.models.v1.contracts.ContractRetrieveRateScheduleResponse
import com.metronome.api.models.v1.contracts.ContractRetrieveResponse
import com.metronome.api.models.v1.contracts.ContractRetrieveSubscriptionQuantityHistoryParams
import com.metronome.api.models.v1.contracts.ContractRetrieveSubscriptionQuantityHistoryResponse
import com.metronome.api.models.v1.contracts.ContractScheduleProServicesInvoiceParams
import com.metronome.api.models.v1.contracts.ContractScheduleProServicesInvoiceResponse
import com.metronome.api.models.v1.contracts.ContractSetUsageFilterParams
import com.metronome.api.models.v1.contracts.ContractUpdateEndDateParams
import com.metronome.api.models.v1.contracts.ContractUpdateEndDateResponse
import com.metronome.api.services.blocking.v1.contracts.NamedScheduleService
import com.metronome.api.services.blocking.v1.contracts.NamedScheduleServiceImpl
import com.metronome.api.services.blocking.v1.contracts.ProductService
import com.metronome.api.services.blocking.v1.contracts.ProductServiceImpl
import com.metronome.api.services.blocking.v1.contracts.RateCardService
import com.metronome.api.services.blocking.v1.contracts.RateCardServiceImpl
import java.util.function.Consumer

class ContractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractService {

    private val withRawResponse: ContractService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptions) }

    private val rateCards: RateCardService by lazy { RateCardServiceImpl(clientOptions) }

    private val namedSchedules: NamedScheduleService by lazy {
        NamedScheduleServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ContractService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService =
        ContractServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Products are the items that customers purchase. */
    override fun products(): ProductService = products

    /** Rate cards are used to define default pricing for products. */
    override fun rateCards(): RateCardService = rateCards

    /**
     * Named schedules are used for storing custom data that can change over time. Named schedules
     * are often used in custom pricing logic.
     */
    override fun namedSchedules(): NamedScheduleService = namedSchedules

    override fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions,
    ): ContractCreateResponse =
        // post /v1/contracts/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions,
    ): ContractRetrieveResponse =
        // post /v1/contracts/get
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions,
    ): ContractListResponse =
        // post /v1/contracts/list
        withRawResponse().list(params, requestOptions).parse()

    override fun addManualBalanceEntry(
        params: ContractAddManualBalanceEntryParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/contracts/addManualBalanceLedgerEntry
        withRawResponse().addManualBalanceEntry(params, requestOptions)
    }

    override fun amend(
        params: ContractAmendParams,
        requestOptions: RequestOptions,
    ): ContractAmendResponse =
        // post /v1/contracts/amend
        withRawResponse().amend(params, requestOptions).parse()

    override fun archive(
        params: ContractArchiveParams,
        requestOptions: RequestOptions,
    ): ContractArchiveResponse =
        // post /v1/contracts/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun createHistoricalInvoices(
        params: ContractCreateHistoricalInvoicesParams,
        requestOptions: RequestOptions,
    ): ContractCreateHistoricalInvoicesResponse =
        // post /v1/contracts/createHistoricalInvoices
        withRawResponse().createHistoricalInvoices(params, requestOptions).parse()

    override fun getNetBalance(
        params: ContractGetNetBalanceParams,
        requestOptions: RequestOptions,
    ): ContractGetNetBalanceResponse =
        // post /v1/contracts/customerBalances/getNetBalance
        withRawResponse().getNetBalance(params, requestOptions).parse()

    override fun listBalances(
        params: ContractListBalancesParams,
        requestOptions: RequestOptions,
    ): ContractListBalancesPage =
        // post /v1/contracts/customerBalances/list
        withRawResponse().listBalances(params, requestOptions).parse()

    override fun retrieveRateSchedule(
        params: ContractRetrieveRateScheduleParams,
        requestOptions: RequestOptions,
    ): ContractRetrieveRateScheduleResponse =
        // post /v1/contracts/getContractRateSchedule
        withRawResponse().retrieveRateSchedule(params, requestOptions).parse()

    override fun retrieveSubscriptionQuantityHistory(
        params: ContractRetrieveSubscriptionQuantityHistoryParams,
        requestOptions: RequestOptions,
    ): ContractRetrieveSubscriptionQuantityHistoryResponse =
        // post /v1/contracts/getSubscriptionQuantityHistory
        withRawResponse().retrieveSubscriptionQuantityHistory(params, requestOptions).parse()

    override fun scheduleProServicesInvoice(
        params: ContractScheduleProServicesInvoiceParams,
        requestOptions: RequestOptions,
    ): ContractScheduleProServicesInvoiceResponse =
        // post /v1/contracts/scheduleProServicesInvoice
        withRawResponse().scheduleProServicesInvoice(params, requestOptions).parse()

    override fun setUsageFilter(
        params: ContractSetUsageFilterParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/contracts/setUsageFilter
        withRawResponse().setUsageFilter(params, requestOptions)
    }

    override fun updateEndDate(
        params: ContractUpdateEndDateParams,
        requestOptions: RequestOptions,
    ): ContractUpdateEndDateResponse =
        // post /v1/contracts/updateEndDate
        withRawResponse().updateEndDate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContractService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val products: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rateCards: RateCardService.WithRawResponse by lazy {
            RateCardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val namedSchedules: NamedScheduleService.WithRawResponse by lazy {
            NamedScheduleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractService.WithRawResponse =
            ContractServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Products are the items that customers purchase. */
        override fun products(): ProductService.WithRawResponse = products

        /** Rate cards are used to define default pricing for products. */
        override fun rateCards(): RateCardService.WithRawResponse = rateCards

        /**
         * Named schedules are used for storing custom data that can change over time. Named
         * schedules are often used in custom pricing logic.
         */
        override fun namedSchedules(): NamedScheduleService.WithRawResponse = namedSchedules

        private val createHandler: Handler<ContractCreateResponse> =
            jsonHandler<ContractCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ContractRetrieveResponse> =
            jsonHandler<ContractRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "get")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<ContractListResponse> =
            jsonHandler<ContractListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ContractListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "list")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
            }
        }

        private val addManualBalanceEntryHandler: Handler<Void?> = emptyHandler()

        override fun addManualBalanceEntry(
            params: ContractAddManualBalanceEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "addManualBalanceLedgerEntry")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addManualBalanceEntryHandler.handle(it) }
            }
        }

        private val amendHandler: Handler<ContractAmendResponse> =
            jsonHandler<ContractAmendResponse>(clientOptions.jsonMapper)

        override fun amend(
            params: ContractAmendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractAmendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "amend")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { amendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val archiveHandler: Handler<ContractArchiveResponse> =
            jsonHandler<ContractArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: ContractArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createHistoricalInvoicesHandler:
            Handler<ContractCreateHistoricalInvoicesResponse> =
            jsonHandler<ContractCreateHistoricalInvoicesResponse>(clientOptions.jsonMapper)

        override fun createHistoricalInvoices(
            params: ContractCreateHistoricalInvoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractCreateHistoricalInvoicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "createHistoricalInvoices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHistoricalInvoicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getNetBalanceHandler: Handler<ContractGetNetBalanceResponse> =
            jsonHandler<ContractGetNetBalanceResponse>(clientOptions.jsonMapper)

        override fun getNetBalance(
            params: ContractGetNetBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractGetNetBalanceResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerBalances", "getNetBalance")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getNetBalanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBalancesHandler: Handler<ContractListBalancesPageResponse> =
            jsonHandler<ContractListBalancesPageResponse>(clientOptions.jsonMapper)

        override fun listBalances(
            params: ContractListBalancesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractListBalancesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerBalances", "list")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBalancesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ContractListBalancesPage.builder()
                            .service(ContractServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveRateScheduleHandler: Handler<ContractRetrieveRateScheduleResponse> =
            jsonHandler<ContractRetrieveRateScheduleResponse>(clientOptions.jsonMapper)

        override fun retrieveRateSchedule(
            params: ContractRetrieveRateScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractRetrieveRateScheduleResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "getContractRateSchedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRateScheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSubscriptionQuantityHistoryHandler:
            Handler<ContractRetrieveSubscriptionQuantityHistoryResponse> =
            jsonHandler<ContractRetrieveSubscriptionQuantityHistoryResponse>(
                clientOptions.jsonMapper
            )

        override fun retrieveSubscriptionQuantityHistory(
            params: ContractRetrieveSubscriptionQuantityHistoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractRetrieveSubscriptionQuantityHistoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "getSubscriptionQuantityHistory")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSubscriptionQuantityHistoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val scheduleProServicesInvoiceHandler:
            Handler<ContractScheduleProServicesInvoiceResponse> =
            jsonHandler<ContractScheduleProServicesInvoiceResponse>(clientOptions.jsonMapper)

        override fun scheduleProServicesInvoice(
            params: ContractScheduleProServicesInvoiceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractScheduleProServicesInvoiceResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "scheduleProServicesInvoice")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { scheduleProServicesInvoiceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setUsageFilterHandler: Handler<Void?> = emptyHandler()

        override fun setUsageFilter(
            params: ContractSetUsageFilterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "setUsageFilter")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setUsageFilterHandler.handle(it) }
            }
        }

        private val updateEndDateHandler: Handler<ContractUpdateEndDateResponse> =
            jsonHandler<ContractUpdateEndDateResponse>(clientOptions.jsonMapper)

        override fun updateEndDate(
            params: ContractUpdateEndDateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractUpdateEndDateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "updateEndDate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateEndDateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
