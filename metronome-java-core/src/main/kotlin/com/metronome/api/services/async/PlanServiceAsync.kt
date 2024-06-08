// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.PlanGetDetailsParams
import com.metronome.api.models.PlanGetDetailsResponse
import com.metronome.api.models.PlanListChargesParams
import com.metronome.api.models.PlanListChargesResponse
import com.metronome.api.models.PlanListCustomersParams
import com.metronome.api.models.PlanListCustomersResponse
import com.metronome.api.models.PlanListParams
import com.metronome.api.models.PlanListResponse
import java.util.concurrent.CompletableFuture

interface PlanServiceAsync {

    /** List all available plans. */
    @JvmOverloads
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PlanListResponse>

    /** Fetch high level details of a specific plan. */
    @JvmOverloads
    fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PlanGetDetailsResponse>

    /** Fetches a list of charges of a specific plan. */
    @JvmOverloads
    fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PlanListChargesResponse>

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included)
     */
    @JvmOverloads
    fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PlanListCustomersResponse>
}
