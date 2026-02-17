// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1CreditGrantCreateParams
import com.metronome.api.models.V1CreditGrantCreateResponse
import com.metronome.api.models.V1CreditGrantEditParams
import com.metronome.api.models.V1CreditGrantEditResponse
import com.metronome.api.models.V1CreditGrantListEntriesPageAsync
import com.metronome.api.models.V1CreditGrantListEntriesParams
import com.metronome.api.models.V1CreditGrantListPageAsync
import com.metronome.api.models.V1CreditGrantListParams
import com.metronome.api.models.V1CreditGrantVoidParams
import com.metronome.api.models.V1CreditGrantVoidResponse
import java.util.concurrent.CompletableFuture

interface CreditGrantServiceAsync {

    /**
     * Create a new credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    @JvmOverloads
    fun create(
        params: V1CreditGrantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreditGrantCreateResponse>

    /**
     * List credit grants. This list does not included voided grants. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    @JvmOverloads
    fun list(
        params: V1CreditGrantListParams = V1CreditGrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreditGrantListPageAsync>

    /**
     * List credit grants. This list does not included voided grants. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    fun list(requestOptions: RequestOptions): CompletableFuture<V1CreditGrantListPageAsync> =
        list(V1CreditGrantListParams.none(), requestOptions)

    /**
     * Edit an existing credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    @JvmOverloads
    fun edit(
        params: V1CreditGrantEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreditGrantEditResponse>

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    @JvmOverloads
    fun listEntries(
        params: V1CreditGrantListEntriesParams = V1CreditGrantListEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreditGrantListEntriesPageAsync>

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun listEntries(
        requestOptions: RequestOptions
    ): CompletableFuture<V1CreditGrantListEntriesPageAsync> =
        listEntries(V1CreditGrantListEntriesParams.none(), requestOptions)

    /**
     * Void a credit grant. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    @JvmOverloads
    fun void_(
        params: V1CreditGrantVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreditGrantVoidResponse>
}
