// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.PlanGetDetailsParams
import com.metronome.api.models.PlanGetDetailsResponse
import com.metronome.api.models.PlanListChargesPage
import com.metronome.api.models.PlanListChargesParams
import com.metronome.api.models.PlanListCustomersPage
import com.metronome.api.models.PlanListCustomersParams
import com.metronome.api.models.PlanListPage
import com.metronome.api.models.PlanListParams

interface PlanService {

    /** List all available plans. */
    @JvmOverloads
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPage

    /** Fetch high level details of a specific plan. */
    @JvmOverloads
    fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGetDetailsResponse

    /** Fetches a list of charges of a specific plan. */
    @JvmOverloads
    fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListChargesPage

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included)
     */
    @JvmOverloads
    fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListCustomersPage
}
