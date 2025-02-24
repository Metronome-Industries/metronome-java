// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.contracts

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractNamedScheduleRetrieveParams
import com.metronome.api.models.ContractNamedScheduleRetrieveResponse
import com.metronome.api.models.ContractNamedScheduleUpdateParams

interface NamedScheduleService {

    /**
     * Get a named schedule for the given rate card. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun retrieve(
        params: ContractNamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractNamedScheduleRetrieveResponse

    /**
     * Update a named schedule for the given rate card. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun update(
        params: ContractNamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
