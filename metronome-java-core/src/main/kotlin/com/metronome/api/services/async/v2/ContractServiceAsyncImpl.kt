// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2

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
import com.metronome.api.models.v2.contracts.ContractEditCommitParams
import com.metronome.api.models.v2.contracts.ContractEditCommitResponse
import com.metronome.api.models.v2.contracts.ContractEditCreditParams
import com.metronome.api.models.v2.contracts.ContractEditCreditResponse
import com.metronome.api.models.v2.contracts.ContractEditParams
import com.metronome.api.models.v2.contracts.ContractEditResponse
import com.metronome.api.models.v2.contracts.ContractGetEditHistoryParams
import com.metronome.api.models.v2.contracts.ContractGetEditHistoryResponse
import com.metronome.api.models.v2.contracts.ContractListParams
import com.metronome.api.models.v2.contracts.ContractListResponse
import com.metronome.api.models.v2.contracts.ContractRetrieveParams
import com.metronome.api.models.v2.contracts.ContractRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ContractServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractServiceAsync {

    private val withRawResponse: ContractServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContractServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractServiceAsync =
        ContractServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractRetrieveResponse> =
        // post /v2/contracts/get
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractListResponse> =
        // post /v2/contracts/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun edit(
        params: ContractEditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractEditResponse> =
        // post /v2/contracts/edit
        withRawResponse().edit(params, requestOptions).thenApply { it.parse() }

    override fun editCommit(
        params: ContractEditCommitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractEditCommitResponse> =
        // post /v2/contracts/commits/edit
        withRawResponse().editCommit(params, requestOptions).thenApply { it.parse() }

    override fun editCredit(
        params: ContractEditCreditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractEditCreditResponse> =
        // post /v2/contracts/credits/edit
        withRawResponse().editCredit(params, requestOptions).thenApply { it.parse() }

    override fun getEditHistory(
        params: ContractGetEditHistoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractGetEditHistoryResponse> =
        // post /v2/contracts/getEditHistory
        withRawResponse().getEditHistory(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContractServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractServiceAsync.WithRawResponse =
            ContractServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ContractRetrieveResponse> =
            jsonHandler<ContractRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "get")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<ContractListResponse> =
            jsonHandler<ContractListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ContractListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "list")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                    }
                }
        }

        private val editHandler: Handler<ContractEditResponse> =
            jsonHandler<ContractEditResponse>(clientOptions.jsonMapper)

        override fun edit(
            params: ContractEditParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractEditResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "edit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { editHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val editCommitHandler: Handler<ContractEditCommitResponse> =
            jsonHandler<ContractEditCommitResponse>(clientOptions.jsonMapper)

        override fun editCommit(
            params: ContractEditCommitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractEditCommitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "commits", "edit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { editCommitHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val editCreditHandler: Handler<ContractEditCreditResponse> =
            jsonHandler<ContractEditCreditResponse>(clientOptions.jsonMapper)

        override fun editCredit(
            params: ContractEditCreditParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractEditCreditResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "credits", "edit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { editCreditHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getEditHistoryHandler: Handler<ContractGetEditHistoryResponse> =
            jsonHandler<ContractGetEditHistoryResponse>(clientOptions.jsonMapper)

        override fun getEditHistory(
            params: ContractGetEditHistoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractGetEditHistoryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "getEditHistory")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getEditHistoryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
