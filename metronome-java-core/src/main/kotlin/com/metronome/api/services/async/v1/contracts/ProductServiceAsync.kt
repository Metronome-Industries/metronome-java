// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.contracts.products.ProductArchiveParams
import com.metronome.api.models.v1.contracts.products.ProductArchiveResponse
import com.metronome.api.models.v1.contracts.products.ProductCreateParams
import com.metronome.api.models.v1.contracts.products.ProductCreateResponse
import com.metronome.api.models.v1.contracts.products.ProductListPageAsync
import com.metronome.api.models.v1.contracts.products.ProductListParams
import com.metronome.api.models.v1.contracts.products.ProductRetrieveParams
import com.metronome.api.models.v1.contracts.products.ProductRetrieveResponse
import com.metronome.api.models.v1.contracts.products.ProductUpdateParams
import com.metronome.api.models.v1.contracts.products.ProductUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Products are the items that customers purchase. */
interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductServiceAsync

    /**
     * Create a new product object. Products in Metronome represent your company's individual
     * product or service offerings. A Product can be thought of as the basic unit of a line item on
     * the invoice. This is analogous to SKUs or items in an ERP system. Give the product a
     * meaningful name as they will appear on customer invoices.
     */
    fun create(params: ProductCreateParams): CompletableFuture<ProductCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCreateResponse>

    /** Retrieve a product by its ID, including all metadata and historical changes. */
    fun retrieve(params: ProductRetrieveParams): CompletableFuture<ProductRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductRetrieveResponse> =
        retrieve(ProductRetrieveParams.builder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: Id): CompletableFuture<ProductRetrieveResponse> =
        retrieve(id, RequestOptions.none())

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
    fun update(params: ProductUpdateParams): CompletableFuture<ProductUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductUpdateResponse>

    /**
     * Get a paginated list of all products in your organization with their complete configuration,
     * version history, and metadata. By default excludes archived products unless explicitly
     * requested via the `archive_filter` parameter.
     */
    fun list(): CompletableFuture<ProductListPageAsync> = list(ProductListParams.none())

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListPageAsync>

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none()
    ): CompletableFuture<ProductListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProductListPageAsync> =
        list(ProductListParams.none(), requestOptions)

    /**
     * Archive a product. Any current rate cards associated with this product will continue to
     * function as normal. However, it will no longer be available as an option for newly created
     * rates. Once you archive a product, you can still retrieve it in the UI and API, but you
     * cannot unarchive it.
     */
    fun archive(params: ProductArchiveParams): CompletableFuture<ProductArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: ProductArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductArchiveResponse>

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/create`, but is
         * otherwise the same as [ProductServiceAsync.create].
         */
        fun create(
            params: ProductCreateParams
        ): CompletableFuture<HttpResponseFor<ProductCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/get`, but is
         * otherwise the same as [ProductServiceAsync.retrieve].
         */
        fun retrieve(
            params: ProductRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProductRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductRetrieveResponse>> =
            retrieve(ProductRetrieveParams.builder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(id: Id): CompletableFuture<HttpResponseFor<ProductRetrieveResponse>> =
            retrieve(id, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/update`, but is
         * otherwise the same as [ProductServiceAsync.update].
         */
        fun update(
            params: ProductUpdateParams
        ): CompletableFuture<HttpResponseFor<ProductUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/list`, but is
         * otherwise the same as [ProductServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none())

        /** @see list */
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>>

        /** @see list */
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/archive`, but is
         * otherwise the same as [ProductServiceAsync.archive].
         */
        fun archive(
            params: ProductArchiveParams
        ): CompletableFuture<HttpResponseFor<ProductArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: ProductArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductArchiveResponse>>
    }
}
