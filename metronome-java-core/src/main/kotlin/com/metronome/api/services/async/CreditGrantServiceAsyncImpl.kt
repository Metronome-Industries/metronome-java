// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

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
import com.metronome.api.models.CreditGrantCreateParams
import com.metronome.api.models.CreditGrantCreateResponse
import com.metronome.api.models.CreditGrantEditParams
import com.metronome.api.models.CreditGrantEditResponse
import com.metronome.api.models.CreditGrantListEntriesParams
import com.metronome.api.models.CreditGrantListEntriesResponse
import com.metronome.api.models.CreditGrantListPageAsync
import com.metronome.api.models.CreditGrantListParams
import com.metronome.api.models.CreditGrantVoidParams
import com.metronome.api.models.CreditGrantVoidResponse
import java.util.concurrent.CompletableFuture

class CreditGrantServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CreditGrantServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CreditGrantCreateResponse> =
        jsonHandler<CreditGrantCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new credit grant */
    override fun create(
        params: CreditGrantCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditGrantCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "createGrant")
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

    private val listHandler: Handler<CreditGrantListPageAsync.Response> =
        jsonHandler<CreditGrantListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List credit grants. This list does not included voided grants. */
    override fun list(
        params: CreditGrantListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditGrantListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "listGrants")
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
                    .let { CreditGrantListPageAsync.of(this, params, it) }
            }
    }

    private val editHandler: Handler<CreditGrantEditResponse> =
        jsonHandler<CreditGrantEditResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Edit an existing credit grant */
    override fun edit(
        params: CreditGrantEditParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditGrantEditResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "editGrant")
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

    private val listEntriesHandler: Handler<CreditGrantListEntriesResponse> =
        jsonHandler<CreditGrantListEntriesResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included.
     */
    override fun listEntries(
        params: CreditGrantListEntriesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditGrantListEntriesResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "listEntries")
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
            }
    }

    private val voidHandler: Handler<CreditGrantVoidResponse> =
        jsonHandler<CreditGrantVoidResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Void a credit grant */
    override fun void_(
        params: CreditGrantVoidParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditGrantVoidResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "voidGrant")
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
