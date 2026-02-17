// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.contracts.products.ProductArchiveParams
import com.metronome.api.models.v1.contracts.products.ProductArchiveResponse
import com.metronome.api.models.v1.contracts.products.ProductCreateParams
import com.metronome.api.models.v1.contracts.products.ProductCreateResponse
import com.metronome.api.models.v1.contracts.products.ProductListPage
import com.metronome.api.models.v1.contracts.products.ProductListParams
import com.metronome.api.models.v1.contracts.products.ProductRetrieveParams
import com.metronome.api.models.v1.contracts.products.ProductRetrieveResponse
import com.metronome.api.models.v1.contracts.products.ProductUpdateParams
import com.metronome.api.models.v1.contracts.products.ProductUpdateResponse
import java.util.function.Consumer

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService

    /**
     * Create a new product object. Products in Metronome represent your company's individual
     * product or service offerings. A Product can be thought of as the basic unit of a line item on
     * the invoice. This is analogous to SKUs or items in an ERP system. Give the product a
     * meaningful name as they will appear on customer invoices.
     */
    fun create(params: ProductCreateParams): ProductCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCreateResponse

    /** Retrieve a product by its ID, including all metadata and historical changes. */
    fun retrieve(params: ProductRetrieveParams): ProductRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductRetrieveResponse =
        retrieve(ProductRetrieveParams.builder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: Id): ProductRetrieveResponse = retrieve(id, RequestOptions.none())

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
    fun update(params: ProductUpdateParams): ProductUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductUpdateResponse

    /**
     * Get a paginated list of all products in your organization with their complete configuration,
     * version history, and metadata. By default excludes archived products unless explicitly
     * requested via the `archive_filter` parameter.
     */
    fun list(): ProductListPage = list(ProductListParams.none())

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see list */
    fun list(params: ProductListParams = ProductListParams.none()): ProductListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    /**
     * Archive a product. Any current rate cards associated with this product will continue to
     * function as normal. However, it will no longer be available as an option for newly created
     * rates. Once you archive a product, you can still retrieve it in the UI and API, but you
     * cannot unarchive it.
     */
    fun archive(params: ProductArchiveParams): ProductArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: ProductArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductArchiveResponse

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/create`, but is
         * otherwise the same as [ProductService.create].
         */
        @MustBeClosed
        fun create(params: ProductCreateParams): HttpResponseFor<ProductCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/get`, but is
         * otherwise the same as [ProductService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProductRetrieveParams): HttpResponseFor<ProductRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductRetrieveResponse> =
            retrieve(ProductRetrieveParams.builder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: Id): HttpResponseFor<ProductRetrieveResponse> =
            retrieve(id, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/update`, but is
         * otherwise the same as [ProductService.update].
         */
        @MustBeClosed
        fun update(params: ProductUpdateParams): HttpResponseFor<ProductUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/list`, but is
         * otherwise the same as [ProductService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProductListPage> = list(ProductListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): HttpResponseFor<ProductListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/products/archive`, but is
         * otherwise the same as [ProductService.archive].
         */
        @MustBeClosed
        fun archive(params: ProductArchiveParams): HttpResponseFor<ProductArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: ProductArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductArchiveResponse>
    }
}
