// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.plans.PlanGetDetailsParams
import com.metronome.api.models.v1.plans.PlanGetDetailsResponse
import com.metronome.api.models.v1.plans.PlanListChargesPage
import com.metronome.api.models.v1.plans.PlanListChargesParams
import com.metronome.api.models.v1.plans.PlanListCustomersPage
import com.metronome.api.models.v1.plans.PlanListCustomersParams
import com.metronome.api.models.v1.plans.PlanListPage
import com.metronome.api.models.v1.plans.PlanListParams
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
     * List all available plans. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun list(): PlanListPage = list(PlanListParams.none())

    /** @see list */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPage

    /** @see list */
    fun list(params: PlanListParams = PlanListParams.none()): PlanListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PlanListPage =
        list(PlanListParams.none(), requestOptions)

    /**
     * Fetch high level details of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    fun getDetails(params: PlanGetDetailsParams): PlanGetDetailsResponse =
        getDetails(params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGetDetailsResponse

    /**
     * Fetches a list of charges of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    fun listCharges(params: PlanListChargesParams): PlanListChargesPage =
        listCharges(params, RequestOptions.none())

    /** @see listCharges */
    fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListChargesPage

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included). This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    fun listCustomers(params: PlanListCustomersParams): PlanListCustomersPage =
        listCustomers(params, RequestOptions.none())

    /** @see listCustomers */
    fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListCustomersPage

    /** A view of [PlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/plans`, but is otherwise the same as
         * [PlanService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PlanListPage> = list(PlanListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PlanListParams = PlanListParams.none()): HttpResponseFor<PlanListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlanListPage> =
            list(PlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/planDetails/{plan_id}`, but is otherwise the
         * same as [PlanService.getDetails].
         */
        @MustBeClosed
        fun getDetails(params: PlanGetDetailsParams): HttpResponseFor<PlanGetDetailsResponse> =
            getDetails(params, RequestOptions.none())

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            params: PlanGetDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGetDetailsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/planDetails/{plan_id}/charges`, but is otherwise
         * the same as [PlanService.listCharges].
         */
        @MustBeClosed
        fun listCharges(params: PlanListChargesParams): HttpResponseFor<PlanListChargesPage> =
            listCharges(params, RequestOptions.none())

        /** @see listCharges */
        @MustBeClosed
        fun listCharges(
            params: PlanListChargesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListChargesPage>

        /**
         * Returns a raw HTTP response for `get /v1/planDetails/{plan_id}/customers`, but is
         * otherwise the same as [PlanService.listCustomers].
         */
        @MustBeClosed
        fun listCustomers(params: PlanListCustomersParams): HttpResponseFor<PlanListCustomersPage> =
            listCustomers(params, RequestOptions.none())

        /** @see listCustomers */
        @MustBeClosed
        fun listCustomers(
            params: PlanListCustomersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListCustomersPage>
    }
}
