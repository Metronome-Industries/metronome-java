// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1CustomerNamedScheduleRetrieveParams
import com.metronome.api.models.V1CustomerNamedScheduleRetrieveResponse
import com.metronome.api.models.V1CustomerNamedScheduleUpdateParams

interface NamedScheduleService {

    /**
     * Get a named schedule for the given customer. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun retrieve(
        params: V1CustomerNamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CustomerNamedScheduleRetrieveResponse

    /**
     * Update a named schedule for the given customer. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun update(
        params: V1CustomerNamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
