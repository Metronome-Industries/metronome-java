// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CreditCreateGrantParams
import com.metronome.api.models.CreditCreateGrantResponse
import com.metronome.api.models.CreditEditGrantParams
import com.metronome.api.models.CreditEditGrantResponse
import com.metronome.api.models.CreditListEntriesParams
import com.metronome.api.models.CreditListEntriesResponse
import com.metronome.api.models.CreditListGrantsParams
import com.metronome.api.models.CreditListGrantsResponse
import com.metronome.api.models.CreditVoidGrantParams
import com.metronome.api.models.CreditVoidGrantResponse
import java.util.concurrent.CompletableFuture

interface CreditServiceAsync {

    /** Create a new credit grant */
    @JvmOverloads
    fun createGrant(
        params: CreditCreateGrantParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditCreateGrantResponse>

    /** Edit an existing credit grant */
    @JvmOverloads
    fun editGrant(
        params: CreditEditGrantParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditEditGrantResponse>

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in reverse chronological order. Ledger entries associated with voided
     * credit grants are not included.
     */
    @JvmOverloads
    fun listEntries(
        params: CreditListEntriesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditListEntriesResponse>

    /** List credit grants. This list does not included voided grants. */
    @JvmOverloads
    fun listGrants(
        params: CreditListGrantsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditListGrantsResponse>

    /** Void a credit grant */
    @JvmOverloads
    fun voidGrant(
        params: CreditVoidGrantParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditVoidGrantResponse>
}
