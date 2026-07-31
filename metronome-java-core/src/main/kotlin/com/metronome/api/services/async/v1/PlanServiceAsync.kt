// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.plans.PlanGetDetailsParams
import com.metronome.api.models.v1.plans.PlanGetDetailsResponse
import com.metronome.api.models.v1.plans.PlanListChargesPageAsync
import com.metronome.api.models.v1.plans.PlanListChargesParams
import com.metronome.api.models.v1.plans.PlanListCustomersPageAsync
import com.metronome.api.models.v1.plans.PlanListCustomersParams
import com.metronome.api.models.v1.plans.PlanListPageAsync
import com.metronome.api.models.v1.plans.PlanListParams
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
     * List all available plans. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun list(): CompletableFuture<PlanListPageAsync> = list(PlanListParams.none())

    /** @see list */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListPageAsync>

    /** @see list */
    fun list(params: PlanListParams = PlanListParams.none()): CompletableFuture<PlanListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PlanListPageAsync> =
        list(PlanListParams.none(), requestOptions)

    /**
     * Fetch high level details of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    fun getDetails(params: PlanGetDetailsParams): CompletableFuture<PlanGetDetailsResponse> =
        getDetails(params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGetDetailsResponse>

    /**
     * Fetches a list of charges of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    fun listCharges(params: PlanListChargesParams): CompletableFuture<PlanListChargesPageAsync> =
        listCharges(params, RequestOptions.none())

    /** @see listCharges */
    fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListChargesPageAsync>

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included). This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    fun listCustomers(
        params: PlanListCustomersParams
    ): CompletableFuture<PlanListCustomersPageAsync> = listCustomers(params, RequestOptions.none())

    /** @see listCustomers */
    fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListCustomersPageAsync>

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/plans`, but is otherwise the same as
         * [PlanServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none())

        /** @see list */
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>>

        /** @see list */
        fun list(
            params: PlanListParams = PlanListParams.none()
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/planDetails/{plan_id}`, but is otherwise the
         * same as [PlanServiceAsync.getDetails].
         */
        fun getDetails(
            params: PlanGetDetailsParams
        ): CompletableFuture<HttpResponseFor<PlanGetDetailsResponse>> =
            getDetails(params, RequestOptions.none())

        /** @see getDetails */
        fun getDetails(
            params: PlanGetDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGetDetailsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/planDetails/{plan_id}/charges`, but is otherwise
         * the same as [PlanServiceAsync.listCharges].
         */
        fun listCharges(
            params: PlanListChargesParams
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>> =
            listCharges(params, RequestOptions.none())

        /** @see listCharges */
        fun listCharges(
            params: PlanListChargesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>>

        /**
         * Returns a raw HTTP response for `get /v1/planDetails/{plan_id}/customers`, but is
         * otherwise the same as [PlanServiceAsync.listCustomers].
         */
        fun listCustomers(
            params: PlanListCustomersParams
        ): CompletableFuture<HttpResponseFor<PlanListCustomersPageAsync>> =
            listCustomers(params, RequestOptions.none())

        /** @see listCustomers */
        fun listCustomers(
            params: PlanListCustomersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListCustomersPageAsync>>
    }
}
