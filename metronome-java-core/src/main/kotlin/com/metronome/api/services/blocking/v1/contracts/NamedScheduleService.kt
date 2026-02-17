// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.contracts

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1ContractNamedScheduleRetrieveParams
import com.metronome.api.models.V1ContractNamedScheduleRetrieveResponse
import com.metronome.api.models.V1ContractNamedScheduleUpdateParams

interface NamedScheduleService {

    /**
     * Get a named schedule for the given rate card. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun retrieve(
        params: V1ContractNamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractNamedScheduleRetrieveResponse

    /**
     * Update a named schedule for the given rate card. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun update(
        params: V1ContractNamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
