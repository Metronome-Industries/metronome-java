// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1CustomerPlanAddParams
import com.metronome.api.models.V1CustomerPlanAddResponse
import com.metronome.api.models.V1CustomerPlanEndParams
import com.metronome.api.models.V1CustomerPlanEndResponse
import com.metronome.api.models.V1CustomerPlanListPageAsync
import com.metronome.api.models.V1CustomerPlanListParams
import com.metronome.api.models.V1CustomerPlanListPriceAdjustmentsPageAsync
import com.metronome.api.models.V1CustomerPlanListPriceAdjustmentsParams
import java.util.concurrent.CompletableFuture

interface PlanServiceAsync {

    /**
     * List the given customer's plans in reverse-chronological order. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    @JvmOverloads
    fun list(
        params: V1CustomerPlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerPlanListPageAsync>

    /**
     * Associate an existing customer with a plan for a specified date range. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    @JvmOverloads
    fun add(
        params: V1CustomerPlanAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerPlanAddResponse>

    /**
     * Change the end date of a customer's plan. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    @JvmOverloads
    fun end(
        params: V1CustomerPlanEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerPlanEndResponse>

    /**
     * Lists a customer plans adjustments. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details. This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    @JvmOverloads
    fun listPriceAdjustments(
        params: V1CustomerPlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerPlanListPriceAdjustmentsPageAsync>
}
