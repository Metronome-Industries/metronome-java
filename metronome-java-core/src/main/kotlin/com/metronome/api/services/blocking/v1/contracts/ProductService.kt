// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.contracts

import com.metronome.api.core.RequestOptions
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

interface ProductService {

    /**
     * Create a new product object. Products in Metronome represent your company's individual
     * product or service offerings. A Product can be thought of as the basic unit of a line item on
     * the invoice. This is analogous to SKUs or items in an ERP system. Give the product a
     * meaningful name as they will appear on customer invoices.
     */
    @JvmOverloads
    fun create(
        params: V1ContractProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractProductCreateResponse

    /** Retrieve a product by its ID, including all metadata and historical changes. */
    @JvmOverloads
    fun retrieve(
        params: V1ContractProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractProductRetrieveResponse

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
    @JvmOverloads
    fun update(
        params: V1ContractProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractProductUpdateResponse

    /**
     * Get a paginated list of all products in your organization with their complete configuration,
     * version history, and metadata. By default excludes archived products unless explicitly
     * requested via the `archive_filter` parameter.
     */
    @JvmOverloads
    fun list(
        params: V1ContractProductListParams = V1ContractProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractProductListPage

    /**
     * Get a paginated list of all products in your organization with their complete configuration,
     * version history, and metadata. By default excludes archived products unless explicitly
     * requested via the `archive_filter` parameter.
     */
    fun list(requestOptions: RequestOptions): V1ContractProductListPage =
        list(V1ContractProductListParams.none(), requestOptions)

    /**
     * Archive a product. Any current rate cards associated with this product will continue to
     * function as normal. However, it will no longer be available as an option for newly created
     * rates. Once you archive a product, you can still retrieve it in the UI and API, but you
     * cannot unarchive it.
     */
    @JvmOverloads
    fun archive(
        params: V1ContractProductArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractProductArchiveResponse
}
