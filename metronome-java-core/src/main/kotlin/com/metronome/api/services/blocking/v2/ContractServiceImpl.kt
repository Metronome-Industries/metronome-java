// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2

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
import java.util.function.Consumer

class ContractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractService {

    private val withRawResponse: ContractService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContractService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService =
        ContractServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions,
    ): ContractRetrieveResponse =
        // post /v2/contracts/get
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions,
    ): ContractListResponse =
        // post /v2/contracts/list
        withRawResponse().list(params, requestOptions).parse()

    override fun edit(
        params: ContractEditParams,
        requestOptions: RequestOptions,
    ): ContractEditResponse =
        // post /v2/contracts/edit
        withRawResponse().edit(params, requestOptions).parse()

    override fun editCommit(
        params: ContractEditCommitParams,
        requestOptions: RequestOptions,
    ): ContractEditCommitResponse =
        // post /v2/contracts/commits/edit
        withRawResponse().editCommit(params, requestOptions).parse()

    override fun editCredit(
        params: ContractEditCreditParams,
        requestOptions: RequestOptions,
    ): ContractEditCreditResponse =
        // post /v2/contracts/credits/edit
        withRawResponse().editCredit(params, requestOptions).parse()

    override fun getEditHistory(
        params: ContractGetEditHistoryParams,
        requestOptions: RequestOptions,
    ): ContractGetEditHistoryResponse =
        // post /v2/contracts/getEditHistory
        withRawResponse().getEditHistory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContractService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractService.WithRawResponse =
            ContractServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

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
                    .addPathSegments("v2", "contracts", "get")
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
                    .addPathSegments("v2", "contracts", "list")
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

        private val editHandler: Handler<ContractEditResponse> =
            jsonHandler<ContractEditResponse>(clientOptions.jsonMapper)

        override fun edit(
            params: ContractEditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractEditResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "edit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { editHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val editCommitHandler: Handler<ContractEditCommitResponse> =
            jsonHandler<ContractEditCommitResponse>(clientOptions.jsonMapper)

        override fun editCommit(
            params: ContractEditCommitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractEditCommitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "commits", "edit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { editCommitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val editCreditHandler: Handler<ContractEditCreditResponse> =
            jsonHandler<ContractEditCreditResponse>(clientOptions.jsonMapper)

        override fun editCredit(
            params: ContractEditCreditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractEditCreditResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "credits", "edit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { editCreditHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getEditHistoryHandler: Handler<ContractGetEditHistoryResponse> =
            jsonHandler<ContractGetEditHistoryResponse>(clientOptions.jsonMapper)

        override fun getEditHistory(
            params: ContractGetEditHistoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractGetEditHistoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "contracts", "getEditHistory")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
