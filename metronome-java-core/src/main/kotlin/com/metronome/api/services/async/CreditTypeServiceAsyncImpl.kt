// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CreditTypeListParams
import com.metronome.api.models.CreditTypeListResponse
import com.metronome.api.services.errorHandler
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CreditTypeServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditTypeServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CreditTypeListResponse> =
        jsonHandler<CreditTypeListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all pricing units (known in the API by the legacy term "credit types"). */
    override fun list(
        params: CreditTypeListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditTypeListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("credit-types", "list")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
}
