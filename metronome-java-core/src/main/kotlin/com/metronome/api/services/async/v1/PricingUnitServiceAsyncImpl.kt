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
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1PricingUnitListPageAsync
import com.metronome.api.models.V1PricingUnitListParams
import java.util.concurrent.CompletableFuture

class PricingUnitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingUnitServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1PricingUnitListPageAsync.Response> =
        jsonHandler<V1PricingUnitListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List all pricing units. All fiat currency types (for example, USD or GBP) will be included,
     * as well as any custom pricing units that were configured. Custom pricing units can be used to
     * charge for usage in a non-fiat pricing unit, for example AI credits.
     *
     * Note: The USD (cents) pricing unit is 2714e483-4ff1-48e4-9e25-ac732e8f24f2.
     */
    override fun list(
        params: V1PricingUnitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PricingUnitListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "credit-types", "list")
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
                    .let { V1PricingUnitListPageAsync.of(this, params, it) }
            }
    }
}
