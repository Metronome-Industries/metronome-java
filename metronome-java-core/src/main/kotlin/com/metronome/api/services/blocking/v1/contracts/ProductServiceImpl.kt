// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

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
import com.metronome.api.models.v1.contracts.products.ProductArchiveParams
import com.metronome.api.models.v1.contracts.products.ProductArchiveResponse
import com.metronome.api.models.v1.contracts.products.ProductCreateParams
import com.metronome.api.models.v1.contracts.products.ProductCreateResponse
import com.metronome.api.models.v1.contracts.products.ProductListPage
import com.metronome.api.models.v1.contracts.products.ProductListPageResponse
import com.metronome.api.models.v1.contracts.products.ProductListParams
import com.metronome.api.models.v1.contracts.products.ProductRetrieveParams
import com.metronome.api.models.v1.contracts.products.ProductRetrieveResponse
import com.metronome.api.models.v1.contracts.products.ProductUpdateParams
import com.metronome.api.models.v1.contracts.products.ProductUpdateResponse
import java.util.function.Consumer

class ProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductService {

    private val withRawResponse: ProductService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService =
        ProductServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions,
    ): ProductCreateResponse =
        // post /v1/contract-pricing/products/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions,
    ): ProductRetrieveResponse =
        // post /v1/contract-pricing/products/get
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions,
    ): ProductUpdateResponse =
        // post /v1/contract-pricing/products/update
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ProductListParams, requestOptions: RequestOptions): ProductListPage =
        // post /v1/contract-pricing/products/list
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: ProductArchiveParams,
        requestOptions: RequestOptions,
    ): ProductArchiveResponse =
        // post /v1/contract-pricing/products/archive
        withRawResponse().archive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductService.WithRawResponse =
            ProductServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ProductCreateResponse> =
            jsonHandler<ProductCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "products", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ProductRetrieveResponse> =
            jsonHandler<ProductRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "products", "get")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ProductUpdateResponse> =
            jsonHandler<ProductUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "products", "update")
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

        private val listHandler: Handler<ProductListPageResponse> =
            jsonHandler<ProductListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProductListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "products", "list")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                        ProductListPage.builder()
                            .service(ProductServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<ProductArchiveResponse> =
            jsonHandler<ProductArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: ProductArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "products", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
