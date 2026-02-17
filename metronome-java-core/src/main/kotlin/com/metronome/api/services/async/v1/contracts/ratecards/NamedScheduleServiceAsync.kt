// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts.ratecards

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.contracts.ratecards.namedschedules.NamedScheduleRetrieveParams
import com.metronome.api.models.v1.contracts.ratecards.namedschedules.NamedScheduleRetrieveResponse
import com.metronome.api.models.v1.contracts.ratecards.namedschedules.NamedScheduleUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NamedScheduleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamedScheduleServiceAsync

    /**
     * Get a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    fun retrieve(
        params: NamedScheduleRetrieveParams
    ): CompletableFuture<NamedScheduleRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamedScheduleRetrieveResponse>

    /**
     * Update a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    fun update(params: NamedScheduleUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [NamedScheduleServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamedScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contracts/getNamedSchedule`, but is otherwise
         * the same as [NamedScheduleServiceAsync.retrieve].
         */
        fun retrieve(
            params: NamedScheduleRetrieveParams
        ): CompletableFuture<HttpResponseFor<NamedScheduleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NamedScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamedScheduleRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/updateNamedSchedule`, but is
         * otherwise the same as [NamedScheduleServiceAsync.update].
         */
        fun update(params: NamedScheduleUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: NamedScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
