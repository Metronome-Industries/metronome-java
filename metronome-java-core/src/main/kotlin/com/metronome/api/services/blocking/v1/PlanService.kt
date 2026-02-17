// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1PlanGetDetailsParams
import com.metronome.api.models.V1PlanGetDetailsResponse
import com.metronome.api.models.V1PlanListChargesPage
import com.metronome.api.models.V1PlanListChargesParams
import com.metronome.api.models.V1PlanListCustomersPage
import com.metronome.api.models.V1PlanListCustomersParams
import com.metronome.api.models.V1PlanListPage
import com.metronome.api.models.V1PlanListParams

interface PlanService {

    /**
     * List all available plans. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    @JvmOverloads
    fun list(
        params: V1PlanListParams = V1PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1PlanListPage

    /**
     * List all available plans. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun list(requestOptions: RequestOptions): V1PlanListPage =
        list(V1PlanListParams.none(), requestOptions)

    /**
     * Fetch high level details of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    @JvmOverloads
    fun getDetails(
        params: V1PlanGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1PlanGetDetailsResponse

    /**
     * Fetches a list of charges of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    @JvmOverloads
    fun listCharges(
        params: V1PlanListChargesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1PlanListChargesPage

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included). This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    @JvmOverloads
    fun listCustomers(
        params: V1PlanListCustomersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1PlanListCustomersPage
}
