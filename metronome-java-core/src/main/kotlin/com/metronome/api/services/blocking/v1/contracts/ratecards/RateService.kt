// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.ratecards

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListPage
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListParams
import java.util.function.Consumer

/** Rate cards are used to define default pricing for products. */
interface RateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateService

    /**
     * Understand the rate schedule at a given timestamp, optionally filtering the list of rates
     * returned based on properties such as `product_id` and `pricing_group_values`. For example,
     * you may want to display the current price for a given product in your product experience -
     * use this endpoint to fetch that information from its source of truth in Metronome.
     *
     * If you want to understand the rates for a specific customer's contract, inclusive of
     * contract-level overrides, use the `getContractRateSchedule` endpoint.
     */
    fun list(params: RateListParams): RateListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RateListPage

    /** Add a new rate */
    fun add(params: RateAddParams): RateAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: RateAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RateAddResponse

    /** Add new rates */
    fun addMany(params: RateAddManyParams): RateAddManyResponse =
        addMany(params, RequestOptions.none())

    /** @see addMany */
    fun addMany(
        params: RateAddManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RateAddManyResponse

    /** A view of [RateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/getRates`, but is
         * otherwise the same as [RateService.list].
         */
        @MustBeClosed
        fun list(params: RateListParams): HttpResponseFor<RateListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RateListPage>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/addRate`, but is
         * otherwise the same as [RateService.add].
         */
        @MustBeClosed
        fun add(params: RateAddParams): HttpResponseFor<RateAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: RateAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RateAddResponse>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/addRates`, but is
         * otherwise the same as [RateService.addMany].
         */
        @MustBeClosed
        fun addMany(params: RateAddManyParams): HttpResponseFor<RateAddManyResponse> =
            addMany(params, RequestOptions.none())

        /** @see addMany */
        @MustBeClosed
        fun addMany(
            params: RateAddManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RateAddManyResponse>
    }
}
