// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.contracts

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractProductArchiveParams
import com.metronome.api.models.ContractProductArchiveResponse
import com.metronome.api.models.ContractProductCreateParams
import com.metronome.api.models.ContractProductCreateResponse
import com.metronome.api.models.ContractProductListPageAsync
import com.metronome.api.models.ContractProductListParams
import com.metronome.api.models.ContractProductRetrieveParams
import com.metronome.api.models.ContractProductRetrieveResponse
import com.metronome.api.models.ContractProductUpdateParams
import com.metronome.api.models.ContractProductUpdateResponse
import java.util.concurrent.CompletableFuture

interface ProductServiceAsync {

    /** Create a new product */
    @JvmOverloads
    fun create(
        params: ContractProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractProductCreateResponse>

    /** Get a specific product */
    @JvmOverloads
    fun retrieve(
        params: ContractProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractProductRetrieveResponse>

    /** Update a product */
    @JvmOverloads
    fun update(
        params: ContractProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractProductUpdateResponse>

    /** List products */
    @JvmOverloads
    fun list(
        params: ContractProductListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractProductListPageAsync>

    /** Archive a product */
    @JvmOverloads
    fun archive(
        params: ContractProductArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractProductArchiveResponse>
}
