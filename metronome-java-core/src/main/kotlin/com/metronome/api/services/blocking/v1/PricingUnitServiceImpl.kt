// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1PricingUnitListPage
import com.metronome.api.models.V1PricingUnitListParams

class PricingUnitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingUnitService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1PricingUnitListPage.Response> =
        jsonHandler<V1PricingUnitListPage.Response>(clientOptions.jsonMapper)
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
    ): V1PricingUnitListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "credit-types", "list")
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
            .let { V1PricingUnitListPage.of(this, params, it) }
    }
}
