// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorBodyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.pricingunits.PricingUnitListPage
import com.metronome.api.models.v1.pricingunits.PricingUnitListPageResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitListParams
import java.util.function.Consumer

class PricingUnitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingUnitService {

    private val withRawResponse: PricingUnitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PricingUnitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PricingUnitService =
        PricingUnitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PricingUnitListParams,
        requestOptions: RequestOptions,
    ): PricingUnitListPage =
        // get /v1/credit-types/list
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PricingUnitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PricingUnitService.WithRawResponse =
            PricingUnitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PricingUnitListPageResponse> =
            jsonHandler<PricingUnitListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PricingUnitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PricingUnitListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credit-types", "list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PricingUnitListPage.builder()
                            .service(PricingUnitServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
