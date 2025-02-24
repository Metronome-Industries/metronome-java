// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.ContractProductArchiveParams
import com.metronome.api.models.ContractProductArchiveResponse
import com.metronome.api.models.ContractProductCreateParams
import com.metronome.api.models.ContractProductCreateResponse
import com.metronome.api.models.ContractProductListPage
import com.metronome.api.models.ContractProductListParams
import com.metronome.api.models.ContractProductRetrieveParams
import com.metronome.api.models.ContractProductRetrieveResponse
import com.metronome.api.models.ContractProductUpdateParams
import com.metronome.api.models.ContractProductUpdateResponse

class ProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ContractProductCreateResponse> =
        jsonHandler<ContractProductCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new product */
    override fun create(
        params: ContractProductCreateParams,
        requestOptions: RequestOptions,
    ): ContractProductCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "create")
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

    private val retrieveHandler: Handler<ContractProductRetrieveResponse> =
        jsonHandler<ContractProductRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a specific product */
    override fun retrieve(
        params: ContractProductRetrieveParams,
        requestOptions: RequestOptions,
    ): ContractProductRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "get")
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

    private val updateHandler: Handler<ContractProductUpdateResponse> =
        jsonHandler<ContractProductUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update a product */
    override fun update(
        params: ContractProductUpdateParams,
        requestOptions: RequestOptions,
    ): ContractProductUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "update")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ContractProductListPage.Response> =
        jsonHandler<ContractProductListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List products */
    override fun list(
        params: ContractProductListParams,
        requestOptions: RequestOptions,
    ): ContractProductListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "list")
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
            .let { ContractProductListPage.of(this, params, it) }
    }

    private val archiveHandler: Handler<ContractProductArchiveResponse> =
        jsonHandler<ContractProductArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Archive a product */
    override fun archive(
        params: ContractProductArchiveParams,
        requestOptions: RequestOptions,
    ): ContractProductArchiveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "archive")
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
}
