// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.contracts.rateCards

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1ContractRateCardNamedScheduleRetrieveParams
import com.metronome.api.models.V1ContractRateCardNamedScheduleRetrieveResponse
import com.metronome.api.models.V1ContractRateCardNamedScheduleUpdateParams

interface NamedScheduleService {

    /**
     * Get a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun retrieve(
        params: V1ContractRateCardNamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractRateCardNamedScheduleRetrieveResponse

    /**
     * Update a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun update(
        params: V1ContractRateCardNamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
