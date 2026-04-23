// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts.ratecards

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListPageAsync
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Rate cards are used to define default pricing for products. */
interface RateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateServiceAsync

    /**
     * Understand the rate schedule at a given timestamp, optionally filtering the list of rates
     * returned based on properties such as `product_id` and `pricing_group_values`. For example,
     * you may want to display the current price for a given product in your product experience -
     * use this endpoint to fetch that information from its source of truth in Metronome.
     *
     * If you want to understand the rates for a specific customer's contract, inclusive of
     * contract-level overrides, use the `getContractRateSchedule` endpoint.
     */
    fun list(params: RateListParams): CompletableFuture<RateListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateListPageAsync>

    /** Add a new rate */
    fun add(params: RateAddParams): CompletableFuture<RateAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: RateAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateAddResponse>

    /** Add new rates */
    fun addMany(params: RateAddManyParams): CompletableFuture<RateAddManyResponse> =
        addMany(params, RequestOptions.none())

    /** @see addMany */
    fun addMany(
        params: RateAddManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateAddManyResponse>

    /** A view of [RateServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/getRates`, but is
         * otherwise the same as [RateServiceAsync.list].
         */
        fun list(params: RateListParams): CompletableFuture<HttpResponseFor<RateListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateListPageAsync>>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/addRate`, but is
         * otherwise the same as [RateServiceAsync.add].
         */
        fun add(params: RateAddParams): CompletableFuture<HttpResponseFor<RateAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: RateAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateAddResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/addRates`, but is
         * otherwise the same as [RateServiceAsync.addMany].
         */
        fun addMany(
            params: RateAddManyParams
        ): CompletableFuture<HttpResponseFor<RateAddManyResponse>> =
            addMany(params, RequestOptions.none())

        /** @see addMany */
        fun addMany(
            params: RateAddManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateAddManyResponse>>
    }
}
