// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.contracts

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractRateCardCreateParams
import com.metronome.api.models.ContractRateCardCreateResponse
import com.metronome.api.models.ContractRateCardListPageAsync
import com.metronome.api.models.ContractRateCardListParams
import com.metronome.api.models.ContractRateCardRetrieveParams
import com.metronome.api.models.ContractRateCardRetrieveRateScheduleParams
import com.metronome.api.models.ContractRateCardRetrieveRateScheduleResponse
import com.metronome.api.models.ContractRateCardRetrieveResponse
import com.metronome.api.models.ContractRateCardUpdateParams
import com.metronome.api.models.ContractRateCardUpdateResponse
import com.metronome.api.services.async.contracts.rateCards.NamedScheduleServiceAsync
import com.metronome.api.services.async.contracts.rateCards.ProductOrderServiceAsync
import com.metronome.api.services.async.contracts.rateCards.RateServiceAsync
import java.util.concurrent.CompletableFuture

interface RateCardServiceAsync {

    fun productOrders(): ProductOrderServiceAsync

    fun rates(): RateServiceAsync

    fun namedSchedules(): NamedScheduleServiceAsync

    /** Create a new rate card */
    @JvmOverloads
    fun create(
        params: ContractRateCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractRateCardCreateResponse>

    /**
     * Get a specific rate card NOTE: Use `/contract-pricing/rate-cards/getRates` to retrieve rate
     * card rates.
     */
    @JvmOverloads
    fun retrieve(
        params: ContractRateCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractRateCardRetrieveResponse>

    /** Update a rate card */
    @JvmOverloads
    fun update(
        params: ContractRateCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractRateCardUpdateResponse>

    /**
     * List rate cards NOTE: Use `/contract-pricing/rate-cards/getRates` to retrieve rate card
     * rates.
     */
    @JvmOverloads
    fun list(
        params: ContractRateCardListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractRateCardListPageAsync>

    /**
     * Get all rates for a rate card from starting_at (either in perpetuity or until ending_before,
     * if provided)
     */
    @JvmOverloads
    fun retrieveRateSchedule(
        params: ContractRateCardRetrieveRateScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ContractRateCardRetrieveRateScheduleResponse>
}
