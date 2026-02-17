// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.customers.plans.PlanAddParams
import com.metronome.api.models.v1.customers.plans.PlanAddResponse
import com.metronome.api.models.v1.customers.plans.PlanEndParams
import com.metronome.api.models.v1.customers.plans.PlanEndResponse
import com.metronome.api.models.v1.customers.plans.PlanListPage
import com.metronome.api.models.v1.customers.plans.PlanListParams
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsPage
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsParams
import java.util.function.Consumer

interface PlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService

    /**
     * List the given customer's plans in reverse-chronological order. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    fun list(params: PlanListParams): PlanListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPage

    /**
     * Associate an existing customer with a plan for a specified date range. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    fun add(params: PlanAddParams): PlanAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: PlanAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanAddResponse

    /**
     * Change the end date of a customer's plan. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    fun end(params: PlanEndParams): PlanEndResponse = end(params, RequestOptions.none())

    /** @see end */
    fun end(
        params: PlanEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanEndResponse

    /**
     * Lists a customer plans adjustments. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details. This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    fun listPriceAdjustments(params: PlanListPriceAdjustmentsParams): PlanListPriceAdjustmentsPage =
        listPriceAdjustments(params, RequestOptions.none())

    /** @see listPriceAdjustments */
    fun listPriceAdjustments(
        params: PlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPriceAdjustmentsPage

    /** A view of [PlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/customers/{customer_id}/plans`, but is otherwise
         * the same as [PlanService.list].
         */
        @MustBeClosed
        fun list(params: PlanListParams): HttpResponseFor<PlanListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPage>

        /**
         * Returns a raw HTTP response for `post /v1/customers/{customer_id}/plans/add`, but is
         * otherwise the same as [PlanService.add].
         */
        @MustBeClosed
        fun add(params: PlanAddParams): HttpResponseFor<PlanAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: PlanAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanAddResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/customers/{customer_id}/plans/{customer_plan_id}/end`, but is otherwise the same as
         * [PlanService.end].
         */
        @MustBeClosed
        fun end(params: PlanEndParams): HttpResponseFor<PlanEndResponse> =
            end(params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            params: PlanEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanEndResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/customers/{customer_id}/plans/{customer_plan_id}/priceAdjustments`, but is otherwise
         * the same as [PlanService.listPriceAdjustments].
         */
        @MustBeClosed
        fun listPriceAdjustments(
            params: PlanListPriceAdjustmentsParams
        ): HttpResponseFor<PlanListPriceAdjustmentsPage> =
            listPriceAdjustments(params, RequestOptions.none())

        /** @see listPriceAdjustments */
        @MustBeClosed
        fun listPriceAdjustments(
            params: PlanListPriceAdjustmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPriceAdjustmentsPage>
    }
}
