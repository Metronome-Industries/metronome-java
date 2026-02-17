// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.ratecards

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderSetParams
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderSetResponse
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderUpdateParams
import com.metronome.api.models.v1.contracts.ratecards.productorders.ProductOrderUpdateResponse
import java.util.function.Consumer

interface ProductOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductOrderService

    /**
     * The ordering of products on a rate card determines the order in which the products will
     * appear on customers' invoices. Use this endpoint to set the order of specific products on the
     * rate card by moving them relative to their current location.
     */
    fun update(params: ProductOrderUpdateParams): ProductOrderUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProductOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductOrderUpdateResponse

    /**
     * The ordering of products on a rate card determines the order in which the products will
     * appear on customers' invoices. Use this endpoint to set the order of products on the rate
     * card.
     */
    fun set(params: ProductOrderSetParams): ProductOrderSetResponse =
        set(params, RequestOptions.none())

    /** @see set */
    fun set(
        params: ProductOrderSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductOrderSetResponse

    /**
     * A view of [ProductOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/contract-pricing/rate-cards/moveRateCardProducts`, but is otherwise the same as
         * [ProductOrderService.update].
         */
        @MustBeClosed
        fun update(params: ProductOrderUpdateParams): HttpResponseFor<ProductOrderUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProductOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductOrderUpdateResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/contract-pricing/rate-cards/setRateCardProductsOrder`, but is otherwise the same as
         * [ProductOrderService.set].
         */
        @MustBeClosed
        fun set(params: ProductOrderSetParams): HttpResponseFor<ProductOrderSetResponse> =
            set(params, RequestOptions.none())

        /** @see set */
        @MustBeClosed
        fun set(
            params: ProductOrderSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductOrderSetResponse>
    }
}
