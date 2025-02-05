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
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.PricingUnitListPage
import com.metronome.api.models.PricingUnitListParams

class PricingUnitServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PricingUnitService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<PricingUnitListPage.Response> =
        jsonHandler<PricingUnitListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all pricing units (known in the API by the legacy term "credit types"). */
    override fun list(
        params: PricingUnitListParams,
        requestOptions: RequestOptions
    ): PricingUnitListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("credit-types", "list")
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
            .let { PricingUnitListPage.of(this, params, it) }
    }
}
