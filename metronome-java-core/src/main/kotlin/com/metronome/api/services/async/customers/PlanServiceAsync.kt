// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerPlanAddParams
import com.metronome.api.models.CustomerPlanAddResponse
import com.metronome.api.models.CustomerPlanEndParams
import com.metronome.api.models.CustomerPlanEndResponse
import com.metronome.api.models.CustomerPlanListPageAsync
import com.metronome.api.models.CustomerPlanListParams
import com.metronome.api.models.CustomerPlanListPriceAdjustmentsPageAsync
import com.metronome.api.models.CustomerPlanListPriceAdjustmentsParams
import java.util.concurrent.CompletableFuture

interface PlanServiceAsync {

    /** List the given customer's plans in reverse-chronological order. */
    @JvmOverloads
    fun list(
        params: CustomerPlanListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerPlanListPageAsync>

    /**
     * Associate an existing customer with a plan for a specified date range. See the
     * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments.
     */
    @JvmOverloads
    fun add(
        params: CustomerPlanAddParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerPlanAddResponse>

    /** Change the end date of a customer's plan. */
    @JvmOverloads
    fun end(
        params: CustomerPlanEndParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerPlanEndResponse>

    /**
     * Lists a customer plans adjustments. See the
     * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details.
     */
    @JvmOverloads
    fun listPriceAdjustments(
        params: CustomerPlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerPlanListPriceAdjustmentsPageAsync>
}
