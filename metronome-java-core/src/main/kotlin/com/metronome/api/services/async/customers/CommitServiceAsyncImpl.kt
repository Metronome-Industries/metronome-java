// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CustomerCommitCreateParams
import com.metronome.api.models.CustomerCommitCreateResponse
import com.metronome.api.models.CustomerCommitListParams
import com.metronome.api.models.CustomerCommitListResponse
import com.metronome.api.models.CustomerCommitUpdateEndDateParams
import com.metronome.api.models.CustomerCommitUpdateEndDateResponse
import java.util.concurrent.CompletableFuture

class CommitServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CommitServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CustomerCommitCreateResponse> =
        jsonHandler<CustomerCommitCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new commit at the customer level. */
    override fun create(
        params: CustomerCommitCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerCommitCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerCommits", "create")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CustomerCommitListResponse> =
        jsonHandler<CustomerCommitListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List commits. */
    override fun list(
        params: CustomerCommitListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerCommitListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerCommits", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateEndDateHandler: Handler<CustomerCommitUpdateEndDateResponse> =
        jsonHandler<CustomerCommitUpdateEndDateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the end date of a PREPAID commit */
    override fun updateEndDate(
        params: CustomerCommitUpdateEndDateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerCommitUpdateEndDateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerCommits", "updateEndDate")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateEndDateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
