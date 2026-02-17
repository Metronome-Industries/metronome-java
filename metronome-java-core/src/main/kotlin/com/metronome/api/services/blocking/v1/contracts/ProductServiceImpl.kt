// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1ContractProductArchiveParams
import com.metronome.api.models.V1ContractProductArchiveResponse
import com.metronome.api.models.V1ContractProductCreateParams
import com.metronome.api.models.V1ContractProductCreateResponse
import com.metronome.api.models.V1ContractProductListPage
import com.metronome.api.models.V1ContractProductListParams
import com.metronome.api.models.V1ContractProductRetrieveParams
import com.metronome.api.models.V1ContractProductRetrieveResponse
import com.metronome.api.models.V1ContractProductUpdateParams
import com.metronome.api.models.V1ContractProductUpdateResponse

class ProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<V1ContractProductCreateResponse> =
        jsonHandler<V1ContractProductCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create a new product object. Products in Metronome represent your company's individual
     * product or service offerings. A Product can be thought of as the basic unit of a line item on
     * the invoice. This is analogous to SKUs or items in an ERP system. Give the product a
     * meaningful name as they will appear on customer invoices.
     */
    override fun create(
        params: V1ContractProductCreateParams,
        requestOptions: RequestOptions,
    ): V1ContractProductCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "products", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<V1ContractProductRetrieveResponse> =
        jsonHandler<V1ContractProductRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a product by its ID, including all metadata and historical changes. */
    override fun retrieve(
        params: V1ContractProductRetrieveParams,
        requestOptions: RequestOptions,
    ): V1ContractProductRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "products", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<V1ContractProductUpdateResponse> =
        jsonHandler<V1ContractProductUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Updates a product's configuration while maintaining billing continuity for active customers.
     * Use this endpoint to modify product names, metrics, pricing rules, and composite settings
     * without disrupting ongoing billing cycles. Changes are scheduled using the starting_at
     * timestamp, which must be on an hour boundary—set future dates to schedule updates ahead of
     * time, or past dates for retroactive changes. Returns the updated product ID upon success.
     *
     * ### Usage guidance:
     * - Product type cannot be changed after creation. For incorrect product types, create a new
     *   product and archive the original instead.
     */
    override fun update(
        params: V1ContractProductUpdateParams,
        requestOptions: RequestOptions,
    ): V1ContractProductUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "products", "update")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<V1ContractProductListPage.Response> =
        jsonHandler<V1ContractProductListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a paginated list of all products in your organization with their complete configuration,
     * version history, and metadata. By default excludes archived products unless explicitly
     * requested via the `archive_filter` parameter.
     */
    override fun list(
        params: V1ContractProductListParams,
        requestOptions: RequestOptions,
    ): V1ContractProductListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "products", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
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
            .let { V1ContractProductListPage.of(this, params, it) }
    }

    private val archiveHandler: Handler<V1ContractProductArchiveResponse> =
        jsonHandler<V1ContractProductArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Archive a product. Any current rate cards associated with this product will continue to
     * function as normal. However, it will no longer be available as an option for newly created
     * rates. Once you archive a product, you can still retrieve it in the UI and API, but you
     * cannot unarchive it.
     */
    override fun archive(
        params: V1ContractProductArchiveParams,
        requestOptions: RequestOptions,
    ): V1ContractProductArchiveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "products", "archive")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
