// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.contracts.rateCards

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractRateCardRateAddManyParams
import com.metronome.api.models.ContractRateCardRateAddManyResponse
import com.metronome.api.models.ContractRateCardRateAddParams
import com.metronome.api.models.ContractRateCardRateAddResponse
import com.metronome.api.models.ContractRateCardRateListPageAsync
import com.metronome.api.models.ContractRateCardRateListParams
import java.util.concurrent.CompletableFuture

interface RateServiceAsync {

    /** Get all rates for a rate card at a point in time */
    @JvmOverloads
    fun list(
        params: ContractRateCardRateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRateCardRateListPageAsync>

    /** Add a new rate */
    @JvmOverloads
    fun add(
        params: ContractRateCardRateAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRateCardRateAddResponse>

    /** Add new rates */
    @JvmOverloads
    fun addMany(
        params: ContractRateCardRateAddManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRateCardRateAddManyResponse>
}
