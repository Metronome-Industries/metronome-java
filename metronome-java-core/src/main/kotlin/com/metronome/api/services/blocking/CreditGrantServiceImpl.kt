// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

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
import com.metronome.api.models.CreditGrantCreateParams
import com.metronome.api.models.CreditGrantCreateResponse
import com.metronome.api.models.CreditGrantEditParams
import com.metronome.api.models.CreditGrantEditResponse
import com.metronome.api.models.CreditGrantListCreditTypesPage
import com.metronome.api.models.CreditGrantListCreditTypesParams
import com.metronome.api.models.CreditGrantListEntriesParams
import com.metronome.api.models.CreditGrantListEntriesResponse
import com.metronome.api.models.CreditGrantListPage
import com.metronome.api.models.CreditGrantListParams
import com.metronome.api.models.CreditGrantVoidParams
import com.metronome.api.models.CreditGrantVoidResponse

class CreditGrantServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CreditGrantService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CreditGrantCreateResponse> =
        jsonHandler<CreditGrantCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new credit grant */
    override fun create(
        params: CreditGrantCreateParams,
        requestOptions: RequestOptions
    ): CreditGrantCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "createGrant")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CreditGrantListPage.Response> =
        jsonHandler<CreditGrantListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List credit grants. This list does not included voided grants. */
    override fun list(
        params: CreditGrantListParams,
        requestOptions: RequestOptions
    ): CreditGrantListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "listGrants")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CreditGrantListPage.of(this, params, it) }
        }
    }

    private val editHandler: Handler<CreditGrantEditResponse> =
        jsonHandler<CreditGrantEditResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Edit an existing credit grant */
    override fun edit(
        params: CreditGrantEditParams,
        requestOptions: RequestOptions
    ): CreditGrantEditResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "editGrant")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { editHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listCreditTypesHandler: Handler<CreditGrantListCreditTypesPage.Response> =
        jsonHandler<CreditGrantListCreditTypesPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all pricing units (known in the API by the legacy term "credit types"). */
    override fun listCreditTypes(
        params: CreditGrantListCreditTypesParams,
        requestOptions: RequestOptions
    ): CreditGrantListCreditTypesPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("credit-types", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listCreditTypesHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CreditGrantListCreditTypesPage.of(this, params, it) }
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
    ): CreditGrantListEntriesResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "listEntries")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listEntriesHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
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
    ): CreditGrantVoidResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("credits", "voidGrant")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { voidHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
