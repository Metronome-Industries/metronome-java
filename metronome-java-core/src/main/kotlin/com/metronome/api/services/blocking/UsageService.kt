// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.UsageListParams
import com.metronome.api.models.UsageListResponse
import com.metronome.api.models.UsageListWithGroupsParams
import com.metronome.api.models.UsageListWithGroupsResponse

interface UsageService {

    /**
     * Fetch aggregated usage data for multiple customers and billable-metrics, broken into
     * intervals of the specified length.
     */
    @JvmOverloads
    fun list(
        params: UsageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UsageListResponse

    /**
     * Fetch aggregated usage data for the specified customer, billable-metric, and optional group,
     * broken into intervals of the specified length.
     */
    @JvmOverloads
    fun listWithGroups(
        params: UsageListWithGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UsageListWithGroupsResponse
}
