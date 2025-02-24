// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.contracts.rateCards

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractRateCardProductOrderSetParams
import com.metronome.api.models.ContractRateCardProductOrderSetResponse
import com.metronome.api.models.ContractRateCardProductOrderUpdateParams
import com.metronome.api.models.ContractRateCardProductOrderUpdateResponse
import java.util.concurrent.CompletableFuture

interface ProductOrderServiceAsync {

    /** Updates ordering of specified products */
    @JvmOverloads
    fun update(
        params: ContractRateCardProductOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRateCardProductOrderUpdateResponse>

    /** Sets the ordering of products within a rate card */
    @JvmOverloads
    fun set(
        params: ContractRateCardProductOrderSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRateCardProductOrderSetResponse>
}
