// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CreditCreateGrantParams
import com.metronome.api.models.CreditCreateGrantResponse
import com.metronome.api.models.CreditEditGrantParams
import com.metronome.api.models.CreditEditGrantResponse
import com.metronome.api.models.CreditListEntriesParams
import com.metronome.api.models.CreditListEntriesResponse
import com.metronome.api.models.CreditListGrantsParams
import com.metronome.api.models.CreditListGrantsResponse
import com.metronome.api.models.CreditVoidGrantParams
import com.metronome.api.models.CreditVoidGrantResponse
import com.metronome.api.services.errorHandler
import com.metronome.api.services.json
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CreditServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createGrantHandler: Handler<CreditCreateGrantResponse> =
        jsonHandler<CreditCreateGrantResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new credit grant */
    override fun createGrant(
        params: CreditCreateGrantParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditCreateGrantResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "createGrant")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createGrantHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val editGrantHandler: Handler<CreditEditGrantResponse> =
        jsonHandler<CreditEditGrantResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Edit an existing credit grant */
    override fun editGrant(
        params: CreditEditGrantParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditEditGrantResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "editGrant")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { editGrantHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listEntriesHandler: Handler<CreditListEntriesResponse> =
        jsonHandler<CreditListEntriesResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in reverse chronological order. Ledger entries associated with voided
     * credit grants are not included.
     */
    override fun listEntries(
        params: CreditListEntriesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditListEntriesResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "listEntries")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listEntriesHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listGrantsHandler: Handler<CreditListGrantsResponse> =
        jsonHandler<CreditListGrantsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List credit grants. This list does not included voided grants. */
    override fun listGrants(
        params: CreditListGrantsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditListGrantsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "listGrants")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listGrantsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val voidGrantHandler: Handler<CreditVoidGrantResponse> =
        jsonHandler<CreditVoidGrantResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Void a credit grant */
    override fun voidGrant(
        params: CreditVoidGrantParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditVoidGrantResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "voidGrant")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { voidGrantHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
