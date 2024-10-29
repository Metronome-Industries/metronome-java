// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ContractAddManualBalanceEntryParams
import com.metronome.api.models.ContractAmendParams
import com.metronome.api.models.ContractAmendResponse
import com.metronome.api.models.ContractArchiveParams
import com.metronome.api.models.ContractArchiveResponse
import com.metronome.api.models.ContractCreateHistoricalInvoicesParams
import com.metronome.api.models.ContractCreateHistoricalInvoicesResponse
import com.metronome.api.models.ContractCreateParams
import com.metronome.api.models.ContractCreateResponse
import com.metronome.api.models.ContractListBalancesParams
import com.metronome.api.models.ContractListBalancesResponse
import com.metronome.api.models.ContractListParams
import com.metronome.api.models.ContractListResponse
import com.metronome.api.models.ContractRetrieveParams
import com.metronome.api.models.ContractRetrieveRateScheduleParams
import com.metronome.api.models.ContractRetrieveRateScheduleResponse
import com.metronome.api.models.ContractRetrieveResponse
import com.metronome.api.models.ContractScheduleProServicesInvoiceParams
import com.metronome.api.models.ContractScheduleProServicesInvoiceResponse
import com.metronome.api.models.ContractSetUsageFilterParams
import com.metronome.api.models.ContractUpdateEndDateParams
import com.metronome.api.models.ContractUpdateEndDateResponse
import com.metronome.api.services.blocking.contracts.NamedScheduleService
import com.metronome.api.services.blocking.contracts.ProductService
import com.metronome.api.services.blocking.contracts.RateCardService

interface ContractService {

    fun products(): ProductService

    fun rateCards(): RateCardService

    fun namedSchedules(): NamedScheduleService

    /** Create a new contract */
    @JvmOverloads
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractCreateResponse

    /** Get a specific contract */
    @JvmOverloads
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractRetrieveResponse

    /** List all contracts for a customer */
    @JvmOverloads
    fun list(
        params: ContractListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractListResponse

    /** Add a manual balance entry */
    @JvmOverloads
    fun addManualBalanceEntry(
        params: ContractAddManualBalanceEntryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Amend a contract */
    @JvmOverloads
    fun amend(
        params: ContractAmendParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractAmendResponse

    /** Archive a contract */
    @JvmOverloads
    fun archive(
        params: ContractArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractArchiveResponse

    /** Creates historical usage invoices for a contract */
    @JvmOverloads
    fun createHistoricalInvoices(
        params: ContractCreateHistoricalInvoicesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractCreateHistoricalInvoicesResponse

    /** List balances (commits and credits). */
    @JvmOverloads
    fun listBalances(
        params: ContractListBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractListBalancesResponse

    /** Get the rate schedule for the rate card on a given contract. */
    @JvmOverloads
    fun retrieveRateSchedule(
        params: ContractRetrieveRateScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractRetrieveRateScheduleResponse

    /**
     * Create a new scheduled invoice for Professional Services terms on a contract. This endpoint's
     * availability is dependent on your client's configuration.
     */
    @JvmOverloads
    fun scheduleProServicesInvoice(
        params: ContractScheduleProServicesInvoiceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractScheduleProServicesInvoiceResponse

    /** Set usage filter for a contract */
    @JvmOverloads
    fun setUsageFilter(
        params: ContractSetUsageFilterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Update the end date of a contract */
    @JvmOverloads
    fun updateEndDate(
        params: ContractUpdateEndDateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ContractUpdateEndDateResponse
}
