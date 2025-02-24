// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.contracts.rateCards

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractRateCardRateAddManyParams
import com.metronome.api.models.ContractRateCardRateAddManyResponse
import com.metronome.api.models.ContractRateCardRateAddParams
import com.metronome.api.models.ContractRateCardRateAddResponse
import com.metronome.api.models.ContractRateCardRateListPage
import com.metronome.api.models.ContractRateCardRateListParams

interface RateService {

    /** Get all rates for a rate card at a point in time */
    @JvmOverloads
    fun list(
        params: ContractRateCardRateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractRateCardRateListPage

    /** Add a new rate */
    @JvmOverloads
    fun add(
        params: ContractRateCardRateAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractRateCardRateAddResponse

    /** Add new rates */
    @JvmOverloads
    fun addMany(
        params: ContractRateCardRateAddManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractRateCardRateAddManyResponse
}
