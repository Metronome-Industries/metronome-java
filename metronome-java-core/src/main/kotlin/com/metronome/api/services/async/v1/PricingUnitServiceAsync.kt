// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.pricingunits.PricingUnitListPageAsync
import com.metronome.api.models.v1.pricingunits.PricingUnitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PricingUnitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PricingUnitServiceAsync

    /**
     * List all pricing units. All fiat currency types (for example, USD or GBP) will be included,
     * as well as any custom pricing units that were configured. Custom pricing units can be used to
     * charge for usage in a non-fiat pricing unit, for example AI credits.
     *
     * Note: The USD (cents) pricing unit is 2714e483-4ff1-48e4-9e25-ac732e8f24f2.
     */
    fun list(): CompletableFuture<PricingUnitListPageAsync> = list(PricingUnitListParams.none())

    /** @see list */
    fun list(
        params: PricingUnitListParams = PricingUnitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingUnitListPageAsync>

    /** @see list */
    fun list(
        params: PricingUnitListParams = PricingUnitListParams.none()
    ): CompletableFuture<PricingUnitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PricingUnitListPageAsync> =
        list(PricingUnitListParams.none(), requestOptions)

    /**
     * A view of [PricingUnitServiceAsync] that provides access to raw HTTP responses for each
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
        ): PricingUnitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/credit-types/list`, but is otherwise the same as
         * [PricingUnitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>> =
            list(PricingUnitListParams.none())

        /** @see list */
        fun list(
            params: PricingUnitListParams = PricingUnitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>>

        /** @see list */
        fun list(
            params: PricingUnitListParams = PricingUnitListParams.none()
        ): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>> =
            list(PricingUnitListParams.none(), requestOptions)
    }
}
