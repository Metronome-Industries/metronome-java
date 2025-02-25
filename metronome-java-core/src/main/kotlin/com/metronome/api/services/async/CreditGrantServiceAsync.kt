// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CreditGrantCreateParams
import com.metronome.api.models.CreditGrantCreateResponse
import com.metronome.api.models.CreditGrantEditParams
import com.metronome.api.models.CreditGrantEditResponse
import com.metronome.api.models.CreditGrantListEntriesParams
import com.metronome.api.models.CreditGrantListEntriesResponse
import com.metronome.api.models.CreditGrantListPageAsync
import com.metronome.api.models.CreditGrantListParams
import com.metronome.api.models.CreditGrantVoidParams
import com.metronome.api.models.CreditGrantVoidResponse
import java.util.concurrent.CompletableFuture

interface CreditGrantServiceAsync {

    /** Create a new credit grant */
    @JvmOverloads
    fun create(
        params: CreditGrantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantCreateResponse>

    /** List credit grants. This list does not included voided grants. */
    @JvmOverloads
    fun list(
        params: CreditGrantListParams = CreditGrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantListPageAsync>

    /** List credit grants. This list does not included voided grants. */
    fun list(requestOptions: RequestOptions): CompletableFuture<CreditGrantListPageAsync> =
        list(CreditGrantListParams.none(), requestOptions)

    /** Edit an existing credit grant */
    @JvmOverloads
    fun edit(
        params: CreditGrantEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantEditResponse>

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included.
     */
    @JvmOverloads
    fun listEntries(
        params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantListEntriesResponse>

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included.
     */
    fun listEntries(
        requestOptions: RequestOptions
    ): CompletableFuture<CreditGrantListEntriesResponse> =
        listEntries(CreditGrantListEntriesParams.none(), requestOptions)

    /** Void a credit grant */
    @JvmOverloads
    fun void_(
        params: CreditGrantVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantVoidResponse>
}
