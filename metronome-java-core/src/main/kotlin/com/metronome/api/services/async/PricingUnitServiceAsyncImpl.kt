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
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.PricingUnitListPageAsync
import com.metronome.api.models.PricingUnitListParams
import java.util.concurrent.CompletableFuture

class PricingUnitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingUnitServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<PricingUnitListPageAsync.Response> =
        jsonHandler<PricingUnitListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all pricing units (known in the API by the legacy term "credit types"). */
    override fun list(
        params: PricingUnitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PricingUnitListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("credit-types", "list")
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
                    .let { PricingUnitListPageAsync.of(this, params, it) }
            }
    }
}
