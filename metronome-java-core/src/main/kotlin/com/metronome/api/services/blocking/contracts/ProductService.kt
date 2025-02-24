// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.contracts

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractProductArchiveParams
import com.metronome.api.models.ContractProductArchiveResponse
import com.metronome.api.models.ContractProductCreateParams
import com.metronome.api.models.ContractProductCreateResponse
import com.metronome.api.models.ContractProductListPage
import com.metronome.api.models.ContractProductListParams
import com.metronome.api.models.ContractProductRetrieveParams
import com.metronome.api.models.ContractProductRetrieveResponse
import com.metronome.api.models.ContractProductUpdateParams
import com.metronome.api.models.ContractProductUpdateResponse

interface ProductService {

    /** Create a new product */
    @JvmOverloads
    fun create(
        params: ContractProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractProductCreateResponse

    /** Get a specific product */
    @JvmOverloads
    fun retrieve(
        params: ContractProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractProductRetrieveResponse

    /** Update a product */
    @JvmOverloads
    fun update(
        params: ContractProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractProductUpdateResponse

    /** List products */
    @JvmOverloads
    fun list(
        params: ContractProductListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractProductListPage

    /** Archive a product */
    @JvmOverloads
    fun archive(
        params: ContractProductArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractProductArchiveResponse
}
