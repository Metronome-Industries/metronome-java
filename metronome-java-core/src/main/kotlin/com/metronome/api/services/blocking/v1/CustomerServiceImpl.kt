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
import com.metronome.api.models.v1.customers.CustomerArchiveParams
import com.metronome.api.models.v1.customers.CustomerArchiveResponse
import com.metronome.api.models.v1.customers.CustomerCreateParams
import com.metronome.api.models.v1.customers.CustomerCreateResponse
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsPage
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsPageResponse
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsParams
import com.metronome.api.models.v1.customers.CustomerListCostsPage
import com.metronome.api.models.v1.customers.CustomerListCostsPageResponse
import com.metronome.api.models.v1.customers.CustomerListCostsParams
import com.metronome.api.models.v1.customers.CustomerListPage
import com.metronome.api.models.v1.customers.CustomerListPageResponse
import com.metronome.api.models.v1.customers.CustomerListParams
import com.metronome.api.models.v1.customers.CustomerPreviewEventsParams
import com.metronome.api.models.v1.customers.CustomerPreviewEventsResponse
import com.metronome.api.models.v1.customers.CustomerRetrieveBillingConfigurationsParams
import com.metronome.api.models.v1.customers.CustomerRetrieveBillingConfigurationsResponse
import com.metronome.api.models.v1.customers.CustomerRetrieveParams
import com.metronome.api.models.v1.customers.CustomerRetrieveResponse
import com.metronome.api.models.v1.customers.CustomerSetBillingConfigurationsParams
import com.metronome.api.models.v1.customers.CustomerSetBillingConfigurationsResponse
import com.metronome.api.models.v1.customers.CustomerSetIngestAliasesParams
import com.metronome.api.models.v1.customers.CustomerSetNameParams
import com.metronome.api.models.v1.customers.CustomerSetNameResponse
import com.metronome.api.models.v1.customers.CustomerUpdateConfigParams
import com.metronome.api.services.blocking.v1.customers.AlertService
import com.metronome.api.services.blocking.v1.customers.AlertServiceImpl
import com.metronome.api.services.blocking.v1.customers.BillingConfigService
import com.metronome.api.services.blocking.v1.customers.BillingConfigServiceImpl
import com.metronome.api.services.blocking.v1.customers.CommitService
import com.metronome.api.services.blocking.v1.customers.CommitServiceImpl
import com.metronome.api.services.blocking.v1.customers.CreditService
import com.metronome.api.services.blocking.v1.customers.CreditServiceImpl
import com.metronome.api.services.blocking.v1.customers.InvoiceService
import com.metronome.api.services.blocking.v1.customers.InvoiceServiceImpl
import com.metronome.api.services.blocking.v1.customers.NamedScheduleService
import com.metronome.api.services.blocking.v1.customers.NamedScheduleServiceImpl
import com.metronome.api.services.blocking.v1.customers.PlanService
import com.metronome.api.services.blocking.v1.customers.PlanServiceImpl
import java.util.function.Consumer

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun alerts(): AlertService = alerts

    override fun plans(): PlanService = plans

    override fun invoices(): InvoiceService = invoices

    override fun billingConfig(): BillingConfigService = billingConfig

    override fun commits(): CommitService = commits

    override fun credits(): CreditService = credits

    override fun namedSchedules(): NamedScheduleService = namedSchedules

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CustomerCreateResponse =
        // post /v1/customers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CustomerRetrieveResponse =
        // get /v1/customers/{customer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CustomerListPage =
        // get /v1/customers
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions,
    ): CustomerArchiveResponse =
        // post /v1/customers/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun listBillableMetrics(
        params: CustomerListBillableMetricsParams,
        requestOptions: RequestOptions,
    ): CustomerListBillableMetricsPage =
        // get /v1/customers/{customer_id}/billable-metrics
        withRawResponse().listBillableMetrics(params, requestOptions).parse()

    override fun listCosts(
        params: CustomerListCostsParams,
        requestOptions: RequestOptions,
    ): CustomerListCostsPage =
        // get /v1/customers/{customer_id}/costs
        withRawResponse().listCosts(params, requestOptions).parse()

    override fun previewEvents(
        params: CustomerPreviewEventsParams,
        requestOptions: RequestOptions,
    ): CustomerPreviewEventsResponse =
        // post /v1/customers/{customer_id}/previewEvents
        withRawResponse().previewEvents(params, requestOptions).parse()

    override fun retrieveBillingConfigurations(
        params: CustomerRetrieveBillingConfigurationsParams,
        requestOptions: RequestOptions,
    ): CustomerRetrieveBillingConfigurationsResponse =
        // post /v1/getCustomerBillingProviderConfigurations
        withRawResponse().retrieveBillingConfigurations(params, requestOptions).parse()

    override fun setBillingConfigurations(
        params: CustomerSetBillingConfigurationsParams,
        requestOptions: RequestOptions,
    ): CustomerSetBillingConfigurationsResponse =
        // post /v1/setCustomerBillingProviderConfigurations
        withRawResponse().setBillingConfigurations(params, requestOptions).parse()

    override fun setIngestAliases(
        params: CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/customers/{customer_id}/setIngestAliases
        withRawResponse().setIngestAliases(params, requestOptions)
    }

    override fun setName(
        params: CustomerSetNameParams,
        requestOptions: RequestOptions,
    ): CustomerSetNameResponse =
        // post /v1/customers/{customer_id}/setName
        withRawResponse().setName(params, requestOptions).parse()

    override fun updateConfig(params: CustomerUpdateConfigParams, requestOptions: RequestOptions) {
        // post /v1/customers/{customer_id}/updateConfig
        withRawResponse().updateConfig(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val alerts: AlertService.WithRawResponse by lazy {
            AlertServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceService.WithRawResponse by lazy {
            InvoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val billingConfig: BillingConfigService.WithRawResponse by lazy {
            BillingConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val commits: CommitService.WithRawResponse by lazy {
            CommitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val credits: CreditService.WithRawResponse by lazy {
            CreditServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val namedSchedules: NamedScheduleService.WithRawResponse by lazy {
            NamedScheduleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun alerts(): AlertService.WithRawResponse = alerts

        override fun plans(): PlanService.WithRawResponse = plans

        override fun invoices(): InvoiceService.WithRawResponse = invoices

        override fun billingConfig(): BillingConfigService.WithRawResponse = billingConfig

        override fun commits(): CommitService.WithRawResponse = commits

        override fun credits(): CreditService.WithRawResponse = credits

        override fun namedSchedules(): NamedScheduleService.WithRawResponse = namedSchedules

        private val createHandler: Handler<CustomerCreateResponse> =
            jsonHandler<CustomerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers")
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

        private val retrieveHandler: Handler<CustomerRetrieveResponse> =
            jsonHandler<CustomerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0))
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

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers")
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
                        CustomerListPage.builder()
                            .service(CustomerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<CustomerArchiveResponse> =
            jsonHandler<CustomerArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", "archive")
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

        private val listBillableMetricsHandler: Handler<CustomerListBillableMetricsPageResponse> =
            jsonHandler<CustomerListBillableMetricsPageResponse>(clientOptions.jsonMapper)

        override fun listBillableMetrics(
            params: CustomerListBillableMetricsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListBillableMetricsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "billable-metrics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBillableMetricsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CustomerListBillableMetricsPage.builder()
                            .service(CustomerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listCostsHandler: Handler<CustomerListCostsPageResponse> =
            jsonHandler<CustomerListCostsPageResponse>(clientOptions.jsonMapper)

        override fun listCosts(
            params: CustomerListCostsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListCostsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "costs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCostsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CustomerListCostsPage.builder()
                            .service(CustomerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val previewEventsHandler: Handler<CustomerPreviewEventsResponse> =
            jsonHandler<CustomerPreviewEventsResponse>(clientOptions.jsonMapper)

        override fun previewEvents(
            params: CustomerPreviewEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPreviewEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "previewEvents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { previewEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveBillingConfigurationsHandler:
            Handler<CustomerRetrieveBillingConfigurationsResponse> =
            jsonHandler<CustomerRetrieveBillingConfigurationsResponse>(clientOptions.jsonMapper)

        override fun retrieveBillingConfigurations(
            params: CustomerRetrieveBillingConfigurationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerRetrieveBillingConfigurationsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "getCustomerBillingProviderConfigurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveBillingConfigurationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setBillingConfigurationsHandler:
            Handler<CustomerSetBillingConfigurationsResponse> =
            jsonHandler<CustomerSetBillingConfigurationsResponse>(clientOptions.jsonMapper)

        override fun setBillingConfigurations(
            params: CustomerSetBillingConfigurationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerSetBillingConfigurationsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "setCustomerBillingProviderConfigurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setBillingConfigurationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setIngestAliasesHandler: Handler<Void?> = emptyHandler()

        override fun setIngestAliases(
            params: CustomerSetIngestAliasesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "setIngestAliases")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setIngestAliasesHandler.handle(it) }
            }
        }

        private val setNameHandler: Handler<CustomerSetNameResponse> =
            jsonHandler<CustomerSetNameResponse>(clientOptions.jsonMapper)

        override fun setName(
            params: CustomerSetNameParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerSetNameResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "setName")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateConfigHandler: Handler<Void?> = emptyHandler()

        override fun updateConfig(
            params: CustomerUpdateConfigParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "updateConfig")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateConfigHandler.handle(it) }
            }
        }
    }
}
