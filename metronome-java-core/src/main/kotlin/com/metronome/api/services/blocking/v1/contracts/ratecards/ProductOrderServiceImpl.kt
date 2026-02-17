// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.ratecards

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
import com.metronome.api.core.http.json
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderSetParams
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderSetResponse
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderUpdateParams
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderUpdateResponse
import java.util.function.Consumer

class ProductOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductOrderService {

    private val withRawResponse: ProductOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductOrderService =
        ProductOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ProductOrderUpdateParams,
        requestOptions: RequestOptions,
    ): ProductOrderUpdateResponse =
        // post /v1/contract-pricing/rate-cards/moveRateCardProducts
        withRawResponse().update(params, requestOptions).parse()

    override fun set(
        params: ProductOrderSetParams,
        requestOptions: RequestOptions,
    ): ProductOrderSetResponse =
        // post /v1/contract-pricing/rate-cards/setRateCardProductsOrder
        withRawResponse().set(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductOrderService.WithRawResponse =
            ProductOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ProductOrderUpdateResponse> =
            jsonHandler<ProductOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ProductOrderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductOrderUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "moveRateCardProducts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setHandler: Handler<ProductOrderSetResponse> =
            jsonHandler<ProductOrderSetResponse>(clientOptions.jsonMapper)

        override fun set(
            params: ProductOrderSetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductOrderSetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "contract-pricing",
                        "rate-cards",
                        "setRateCardProductsOrder",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
