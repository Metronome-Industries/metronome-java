// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.contracts.rateCards

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1ContractRateCardProductOrderSetParams
import com.metronome.api.models.V1ContractRateCardProductOrderSetResponse
import com.metronome.api.models.V1ContractRateCardProductOrderUpdateParams
import com.metronome.api.models.V1ContractRateCardProductOrderUpdateResponse

interface ProductOrderService {

    /**
     * The ordering of products on a rate card determines the order in which the products will
     * appear on customers' invoices. Use this endpoint to set the order of specific products on the
     * rate card by moving them relative to their current location.
     */
    @JvmOverloads
    fun update(
        params: V1ContractRateCardProductOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractRateCardProductOrderUpdateResponse

    /**
     * The ordering of products on a rate card determines the order in which the products will
     * appear on customers' invoices. Use this endpoint to set the order of products on the rate
     * card.
     */
    @JvmOverloads
    fun set(
        params: V1ContractRateCardProductOrderSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContractRateCardProductOrderSetResponse
}
