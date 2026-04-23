// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

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
import com.metronome.api.core.prepareAsync
import com.metronome.api.models.v1.customers.CustomerArchiveBillingConfigurationsParams
import com.metronome.api.models.v1.customers.CustomerArchiveBillingConfigurationsResponse
import com.metronome.api.models.v1.customers.CustomerArchiveParams
import com.metronome.api.models.v1.customers.CustomerArchiveResponse
import com.metronome.api.models.v1.customers.CustomerCreateParams
import com.metronome.api.models.v1.customers.CustomerCreateResponse
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsPageAsync
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsPageResponse
import com.metronome.api.models.v1.customers.CustomerListBillableMetricsParams
import com.metronome.api.models.v1.customers.CustomerListCostsPageAsync
import com.metronome.api.models.v1.customers.CustomerListCostsPageResponse
import com.metronome.api.models.v1.customers.CustomerListCostsParams
import com.metronome.api.models.v1.customers.CustomerListPageAsync
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
import com.metronome.api.services.async.v1.customers.AlertServiceAsync
import com.metronome.api.services.async.v1.customers.AlertServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.BillingConfigServiceAsync
import com.metronome.api.services.async.v1.customers.BillingConfigServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.CommitServiceAsync
import com.metronome.api.services.async.v1.customers.CommitServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.CreditServiceAsync
import com.metronome.api.services.async.v1.customers.CreditServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsync
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.customers.NamedScheduleServiceAsyncImpl
import com.metronome.api.services.async.v1.customers.PlanServiceAsync
import com.metronome.api.services.async.v1.customers.PlanServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer spending,
     * balances, and other billing factors. Use these endpoints to create, retrieve, and archive
     * customer alerts. To view sample alert payloads by alert type, navigate
     * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
     */
    override fun alerts(): AlertServiceAsync = alerts

    /**
     * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the base
     * pricing for a customer. Use these endpoints to add a plan to a customer, end a customer plan,
     * retrieve plans, and retrieve plan details. Create plans in the
     * [Metronome app](https://app.metronome.com/plans).
     */
    override fun plans(): PlanServiceAsync = plans

    /**
     * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
     * period, which is the basis for billing. Metronome automatically generates invoices based upon
     * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
     */
    override fun invoices(): InvoiceServiceAsync = invoices

    /**
     * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome represent
     * your users for all billing and reporting. Use these endpoints to create, retrieve, update,
     * and archive customers and their billing configuration.
     */
    override fun billingConfig(): BillingConfigServiceAsync = billingConfig

    /** Credits and commits are used to manage customer balances. */
    override fun commits(): CommitServiceAsync = commits

    /** Credits and commits are used to manage customer balances. */
    override fun credits(): CreditServiceAsync = credits

    /**
     * Named schedules are used for storing custom data that can change over time. Named schedules
     * are often used in custom pricing logic.
     */
    override fun namedSchedules(): NamedScheduleServiceAsync = namedSchedules

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreateResponse> =
        // post /v1/customers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerRetrieveResponse> =
        // get /v1/customers/{customer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListPageAsync> =
        // get /v1/customers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerArchiveResponse> =
        // post /v1/customers/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun archiveBillingConfigurations(
        params: CustomerArchiveBillingConfigurationsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerArchiveBillingConfigurationsResponse> =
        // post /v1/archiveCustomerBillingProviderConfigurations
        withRawResponse().archiveBillingConfigurations(params, requestOptions).thenApply {
            it.parse()
        }

    override fun listBillableMetrics(
        params: CustomerListBillableMetricsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListBillableMetricsPageAsync> =
        // get /v1/customers/{customer_id}/billable-metrics
        withRawResponse().listBillableMetrics(params, requestOptions).thenApply { it.parse() }

    override fun listCosts(
        params: CustomerListCostsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListCostsPageAsync> =
        // get /v1/customers/{customer_id}/costs
        withRawResponse().listCosts(params, requestOptions).thenApply { it.parse() }

    override fun previewEvents(
        params: CustomerPreviewEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPreviewEventsResponse> =
        // post /v1/customers/{customer_id}/previewEvents
        withRawResponse().previewEvents(params, requestOptions).thenApply { it.parse() }

    override fun retrieveBillingConfigurations(
        params: CustomerRetrieveBillingConfigurationsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerRetrieveBillingConfigurationsResponse> =
        // post /v1/getCustomerBillingProviderConfigurations
        withRawResponse().retrieveBillingConfigurations(params, requestOptions).thenApply {
            it.parse()
        }

    override fun setBillingConfigurations(
        params: CustomerSetBillingConfigurationsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerSetBillingConfigurationsResponse> =
        // post /v1/setCustomerBillingProviderConfigurations
        withRawResponse().setBillingConfigurations(params, requestOptions).thenApply { it.parse() }

    override fun setIngestAliases(
        params: CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/customers/{customer_id}/setIngestAliases
        withRawResponse().setIngestAliases(params, requestOptions).thenAccept {}

    override fun setName(
        params: CustomerSetNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerSetNameResponse> =
        // post /v1/customers/{customer_id}/setName
        withRawResponse().setName(params, requestOptions).thenApply { it.parse() }

    override fun updateConfig(
        params: CustomerUpdateConfigParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/customers/{customer_id}/updateConfig
        withRawResponse().updateConfig(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val alerts: AlertServiceAsync.WithRawResponse by lazy {
            AlertServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanServiceAsync.WithRawResponse by lazy {
            PlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceServiceAsync.WithRawResponse by lazy {
            InvoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val billingConfig: BillingConfigServiceAsync.WithRawResponse by lazy {
            BillingConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val commits: CommitServiceAsync.WithRawResponse by lazy {
            CommitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val credits: CreditServiceAsync.WithRawResponse by lazy {
            CreditServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val namedSchedules: NamedScheduleServiceAsync.WithRawResponse by lazy {
            NamedScheduleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer
         * spending, balances, and other billing factors. Use these endpoints to create, retrieve,
         * and archive customer alerts. To view sample alert payloads by alert type, navigate
         * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
         */
        override fun alerts(): AlertServiceAsync.WithRawResponse = alerts

        /**
         * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the
         * base pricing for a customer. Use these endpoints to add a plan to a customer, end a
         * customer plan, retrieve plans, and retrieve plan details. Create plans in the
         * [Metronome app](https://app.metronome.com/plans).
         */
        override fun plans(): PlanServiceAsync.WithRawResponse = plans

        /**
         * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent
         * during a period, which is the basis for billing. Metronome automatically generates
         * invoices based upon your pricing, packaging, and usage events. Use these endpoints to
         * retrieve invoices.
         */
        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        /**
         * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome
         * represent your users for all billing and reporting. Use these endpoints to create,
         * retrieve, update, and archive customers and their billing configuration.
         */
        override fun billingConfig(): BillingConfigServiceAsync.WithRawResponse = billingConfig

        /** Credits and commits are used to manage customer balances. */
        override fun commits(): CommitServiceAsync.WithRawResponse = commits

        /** Credits and commits are used to manage customer balances. */
        override fun credits(): CreditServiceAsync.WithRawResponse = credits

        /**
         * Named schedules are used for storing custom data that can change over time. Named
         * schedules are often used in custom pricing logic.
         */
        override fun namedSchedules(): NamedScheduleServiceAsync.WithRawResponse = namedSchedules

        private val createHandler: Handler<CustomerCreateResponse> =
            jsonHandler<CustomerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<CustomerRetrieveResponse> =
            jsonHandler<CustomerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0))
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

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers")
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
                                CustomerListPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<CustomerArchiveResponse> =
            jsonHandler<CustomerArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerArchiveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val archiveBillingConfigurationsHandler:
            Handler<CustomerArchiveBillingConfigurationsResponse> =
            jsonHandler<CustomerArchiveBillingConfigurationsResponse>(clientOptions.jsonMapper)

        override fun archiveBillingConfigurations(
            params: CustomerArchiveBillingConfigurationsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerArchiveBillingConfigurationsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "archiveCustomerBillingProviderConfigurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveBillingConfigurationsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listBillableMetricsHandler: Handler<CustomerListBillableMetricsPageResponse> =
            jsonHandler<CustomerListBillableMetricsPageResponse>(clientOptions.jsonMapper)

        override fun listBillableMetrics(
            params: CustomerListBillableMetricsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListBillableMetricsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "billable-metrics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBillableMetricsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerListBillableMetricsPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listCostsHandler: Handler<CustomerListCostsPageResponse> =
            jsonHandler<CustomerListCostsPageResponse>(clientOptions.jsonMapper)

        override fun listCosts(
            params: CustomerListCostsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListCostsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "costs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listCostsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerListCostsPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val previewEventsHandler: Handler<CustomerPreviewEventsResponse> =
            jsonHandler<CustomerPreviewEventsResponse>(clientOptions.jsonMapper)

        override fun previewEvents(
            params: CustomerPreviewEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerPreviewEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "previewEvents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { previewEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveBillingConfigurationsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "getCustomerBillingProviderConfigurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveBillingConfigurationsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<CustomerSetBillingConfigurationsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "setCustomerBillingProviderConfigurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setBillingConfigurationsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setIngestAliasesHandler: Handler<Void?> = emptyHandler()

        override fun setIngestAliases(
            params: CustomerSetIngestAliasesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "setIngestAliases")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { setIngestAliasesHandler.handle(it) }
                    }
                }
        }

        private val setNameHandler: Handler<CustomerSetNameResponse> =
            jsonHandler<CustomerSetNameResponse>(clientOptions.jsonMapper)

        override fun setName(
            params: CustomerSetNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerSetNameResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "setName")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setNameHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateConfigHandler: Handler<Void?> = emptyHandler()

        override fun updateConfig(
            params: CustomerUpdateConfigParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "updateConfig")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateConfigHandler.handle(it) }
                    }
                }
        }
    }
}
