// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

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
import com.metronome.api.models.V1CreditGrantCreateParams
import com.metronome.api.models.V1CreditGrantCreateResponse
import com.metronome.api.models.V1CreditGrantEditParams
import com.metronome.api.models.V1CreditGrantEditResponse
import com.metronome.api.models.V1CreditGrantListEntriesPageAsync
import com.metronome.api.models.V1CreditGrantListEntriesParams
import com.metronome.api.models.V1CreditGrantListPageAsync
import com.metronome.api.models.V1CreditGrantListParams
import com.metronome.api.models.V1CreditGrantVoidParams
import com.metronome.api.models.V1CreditGrantVoidResponse
import java.util.concurrent.CompletableFuture

class CreditGrantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditGrantServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<V1CreditGrantCreateResponse> =
        jsonHandler<V1CreditGrantCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create a new credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    override fun create(
        params: V1CreditGrantCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreditGrantCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "credits", "createGrant")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<V1CreditGrantListPageAsync.Response> =
        jsonHandler<V1CreditGrantListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List credit grants. This list does not included voided grants. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    override fun list(
        params: V1CreditGrantListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreditGrantListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "credits", "listGrants")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1CreditGrantListPageAsync.of(this, params, it) }
            }
    }

    private val editHandler: Handler<V1CreditGrantEditResponse> =
        jsonHandler<V1CreditGrantEditResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Edit an existing credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    override fun edit(
        params: V1CreditGrantEditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreditGrantEditResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "credits", "editGrant")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { editHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listEntriesHandler: Handler<V1CreditGrantListEntriesPageAsync.Response> =
        jsonHandler<V1CreditGrantListEntriesPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    override fun listEntries(
        params: V1CreditGrantListEntriesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreditGrantListEntriesPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "credits", "listEntries")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listEntriesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1CreditGrantListEntriesPageAsync.of(this, params, it) }
            }
    }

    private val voidHandler: Handler<V1CreditGrantVoidResponse> =
        jsonHandler<V1CreditGrantVoidResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Void a credit grant. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    override fun void_(
        params: V1CreditGrantVoidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreditGrantVoidResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "credits", "voidGrant")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { voidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
