// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.ratecards

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.contracts.ratecards.namedschedules.NamedScheduleRetrieveParams
import com.metronome.api.models.v1.contracts.ratecards.namedschedules.NamedScheduleRetrieveResponse
import com.metronome.api.models.v1.contracts.ratecards.namedschedules.NamedScheduleUpdateParams
import java.util.function.Consumer

/**
 * Named schedules are used for storing custom data that can change over time. Named schedules are
 * often used in custom pricing logic.
 */
interface NamedScheduleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamedScheduleService

    /**
     * Get a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    fun retrieve(params: NamedScheduleRetrieveParams): NamedScheduleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NamedScheduleRetrieveResponse

    /**
     * Update a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    fun update(params: NamedScheduleUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [NamedScheduleService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamedScheduleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contracts/getNamedSchedule`, but is otherwise
         * the same as [NamedScheduleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: NamedScheduleRetrieveParams
        ): HttpResponseFor<NamedScheduleRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NamedScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NamedScheduleRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/updateNamedSchedule`, but is
         * otherwise the same as [NamedScheduleService.update].
         */
        @MustBeClosed
        fun update(params: NamedScheduleUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NamedScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
