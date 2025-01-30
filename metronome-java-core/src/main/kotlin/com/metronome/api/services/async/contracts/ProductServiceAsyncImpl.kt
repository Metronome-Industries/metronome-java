// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.contracts

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.ContractProductArchiveParams
import com.metronome.api.models.ContractProductArchiveResponse
import com.metronome.api.models.ContractProductCreateParams
import com.metronome.api.models.ContractProductCreateResponse
import com.metronome.api.models.ContractProductListPageAsync
import com.metronome.api.models.ContractProductListParams
import com.metronome.api.models.ContractProductRetrieveParams
import com.metronome.api.models.ContractProductRetrieveResponse
import com.metronome.api.models.ContractProductUpdateParams
import com.metronome.api.models.ContractProductUpdateResponse
import java.util.concurrent.CompletableFuture

class ProductServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProductServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ContractProductCreateResponse> =
        jsonHandler<ContractProductCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new product */
    override fun create(
        params: ContractProductCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractProductCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<ContractProductRetrieveResponse> =
        jsonHandler<ContractProductRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a specific product */
    override fun retrieve(
        params: ContractProductRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractProductRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<ContractProductUpdateResponse> =
        jsonHandler<ContractProductUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update a product */
    override fun update(
        params: ContractProductUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractProductUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "update")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<ContractProductListPageAsync.Response> =
        jsonHandler<ContractProductListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List products */
    override fun list(
        params: ContractProductListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractProductListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
                    .let { ContractProductListPageAsync.of(this, params, it) }
            }
    }

    private val archiveHandler: Handler<ContractProductArchiveResponse> =
        jsonHandler<ContractProductArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Archive a product */
    override fun archive(
        params: ContractProductArchiveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractProductArchiveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "products", "archive")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { archiveHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }
}
