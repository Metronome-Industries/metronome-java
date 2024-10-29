// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.contracts.rateCards

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractRateCardNamedScheduleRetrieveParams
import com.metronome.api.models.ContractRateCardNamedScheduleRetrieveResponse
import com.metronome.api.models.ContractRateCardNamedScheduleUpdateParams

interface NamedScheduleService {

    /**
     * Get a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun retrieve(
        params: ContractRateCardNamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractRateCardNamedScheduleRetrieveResponse

    /**
     * Update a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun update(
        params: ContractRateCardNamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
