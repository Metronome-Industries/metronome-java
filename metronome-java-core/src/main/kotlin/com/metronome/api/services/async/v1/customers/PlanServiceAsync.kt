// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.customers.plans.PlanAddParams
import com.metronome.api.models.v1.customers.plans.PlanAddResponse
import com.metronome.api.models.v1.customers.plans.PlanEndParams
import com.metronome.api.models.v1.customers.plans.PlanEndResponse
import com.metronome.api.models.v1.customers.plans.PlanListPageAsync
import com.metronome.api.models.v1.customers.plans.PlanListParams
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsPageAsync
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the base
 * pricing for a customer. Use these endpoints to add a plan to a customer, end a customer plan,
 * retrieve plans, and retrieve plan details. Create plans in the
 * [Metronome app](https://app.metronome.com/plans).
 */
interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync

    /**
     * List the given customer's plans in reverse-chronological order. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    fun list(params: PlanListParams): CompletableFuture<PlanListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListPageAsync>

    /**
     * Associate an existing customer with a plan for a specified date range. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    fun add(params: PlanAddParams): CompletableFuture<PlanAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: PlanAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanAddResponse>

    /**
     * Change the end date of a customer's plan. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    fun end(params: PlanEndParams): CompletableFuture<PlanEndResponse> =
        end(params, RequestOptions.none())

    /** @see end */
    fun end(
        params: PlanEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanEndResponse>

    /**
     * Lists a customer plans adjustments. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details. This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    fun listPriceAdjustments(
        params: PlanListPriceAdjustmentsParams
    ): CompletableFuture<PlanListPriceAdjustmentsPageAsync> =
        listPriceAdjustments(params, RequestOptions.none())

    /** @see listPriceAdjustments */
    fun listPriceAdjustments(
        params: PlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListPriceAdjustmentsPageAsync>

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}/plans`, but is otherwise
         * the same as [PlanServiceAsync.list].
         */
        fun list(params: PlanListParams): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/plans/add`, but is
         * otherwise the same as [PlanServiceAsync.add].
         */
        fun add(params: PlanAddParams): CompletableFuture<HttpResponseFor<PlanAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: PlanAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanAddResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/customers/{customer_id}/plans/{customer_plan_id}/end`, but is otherwise the same as
         * [PlanServiceAsync.end].
         */
        fun end(params: PlanEndParams): CompletableFuture<HttpResponseFor<PlanEndResponse>> =
            end(params, RequestOptions.none())

        /** @see end */
        fun end(
            params: PlanEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanEndResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/customers/{customer_id}/plans/{customer_plan_id}/priceAdjustments`, but is otherwise
         * the same as [PlanServiceAsync.listPriceAdjustments].
         */
        fun listPriceAdjustments(
            params: PlanListPriceAdjustmentsParams
        ): CompletableFuture<HttpResponseFor<PlanListPriceAdjustmentsPageAsync>> =
            listPriceAdjustments(params, RequestOptions.none())

        /** @see listPriceAdjustments */
        fun listPriceAdjustments(
            params: PlanListPriceAdjustmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListPriceAdjustmentsPageAsync>>
    }
}
