// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts.ratecards

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
import com.metronome.api.core.prepareAsync
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderSetParams
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderSetResponse
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderUpdateParams
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Rate cards are used to define default pricing for products. */
class ProductOrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductOrderServiceAsync {

    private val withRawResponse: ProductOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductOrderServiceAsync =
        ProductOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ProductOrderUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductOrderUpdateResponse> =
        // post /v1/contract-pricing/rate-cards/moveRateCardProducts
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun set(
        params: ProductOrderSetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductOrderSetResponse> =
        // post /v1/contract-pricing/rate-cards/setRateCardProductsOrder
        withRawResponse().set(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductOrderServiceAsync.WithRawResponse =
            ProductOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ProductOrderUpdateResponse> =
            jsonHandler<ProductOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ProductOrderUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductOrderUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "moveRateCardProducts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setHandler: Handler<ProductOrderSetResponse> =
            jsonHandler<ProductOrderSetResponse>(clientOptions.jsonMapper)

        override fun set(
            params: ProductOrderSetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductOrderSetResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
