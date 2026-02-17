// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.contracts.rateCards

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1ContractRateCardRateAddManyParams
import com.metronome.api.models.V1ContractRateCardRateAddManyResponse
import com.metronome.api.models.V1ContractRateCardRateAddParams
import com.metronome.api.models.V1ContractRateCardRateAddResponse
import com.metronome.api.models.V1ContractRateCardRateListPage
import com.metronome.api.models.V1ContractRateCardRateListParams

interface RateService {

    /**
     * Understand the rate schedule at a given timestamp, optionally filtering the list of rates
     * returned based on properties such as `product_id` and `pricing_group_values`. For example,
     * you may want to display the current price for a given product in your product experience -
     * use this endpoint to fetch that information from its source of truth in Metronome.
     *
     * If you want to understand the rates for a specific customer's contract, inclusive of
     * contract-level overrides, use the `getContractRateSchedule` endpoint.
     */
    @JvmOverloads
    fun list(
        params: V1ContractRateCardRateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractRateCardRateListPage

    /** Add a new rate */
    @JvmOverloads
    fun add(
        params: V1ContractRateCardRateAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractRateCardRateAddResponse

    /** Add new rates */
    @JvmOverloads
    fun addMany(
        params: V1ContractRateCardRateAddManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractRateCardRateAddManyResponse
}
