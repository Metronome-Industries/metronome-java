// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateParams
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantEditParams
import com.metronome.api.models.v1.creditgrants.CreditGrantEditResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesPageAsync
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesParams
import com.metronome.api.models.v1.creditgrants.CreditGrantListPageAsync
import com.metronome.api.models.v1.creditgrants.CreditGrantListParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/) adjust a
 * customer balance for prepayments, reimbursements, promotions, and so on. Use these endpoints to
 * create, retrieve, update, and delete credit grants.
 */
interface CreditGrantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditGrantServiceAsync

    /**
     * Create a new credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    fun create(params: CreditGrantCreateParams): CompletableFuture<CreditGrantCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CreditGrantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantCreateResponse>

    /**
     * List credit grants. This list does not included voided grants. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    fun list(): CompletableFuture<CreditGrantListPageAsync> = list(CreditGrantListParams.none())

    /** @see list */
    fun list(
        params: CreditGrantListParams = CreditGrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantListPageAsync>

    /** @see list */
    fun list(
        params: CreditGrantListParams = CreditGrantListParams.none()
    ): CompletableFuture<CreditGrantListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CreditGrantListPageAsync> =
        list(CreditGrantListParams.none(), requestOptions)

    /**
     * Edit an existing credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    fun edit(params: CreditGrantEditParams): CompletableFuture<CreditGrantEditResponse> =
        edit(params, RequestOptions.none())

    /** @see edit */
    fun edit(
        params: CreditGrantEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantEditResponse>

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun listEntries(): CompletableFuture<CreditGrantListEntriesPageAsync> =
        listEntries(CreditGrantListEntriesParams.none())

    /** @see listEntries */
    fun listEntries(
        params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantListEntriesPageAsync>

    /** @see listEntries */
    fun listEntries(
        params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none()
    ): CompletableFuture<CreditGrantListEntriesPageAsync> =
        listEntries(params, RequestOptions.none())

    /** @see listEntries */
    fun listEntries(
        requestOptions: RequestOptions
    ): CompletableFuture<CreditGrantListEntriesPageAsync> =
        listEntries(CreditGrantListEntriesParams.none(), requestOptions)

    /**
     * Void a credit grant. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun void_(params: CreditGrantVoidParams): CompletableFuture<CreditGrantVoidResponse> =
        void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: CreditGrantVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantVoidResponse>

    /**
     * A view of [CreditGrantServiceAsync] that provides access to raw HTTP responses for each
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
        ): CreditGrantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/credits/createGrant`, but is otherwise the same
         * as [CreditGrantServiceAsync.create].
         */
        fun create(
            params: CreditGrantCreateParams
        ): CompletableFuture<HttpResponseFor<CreditGrantCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CreditGrantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/credits/listGrants`, but is otherwise the same
         * as [CreditGrantServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CreditGrantListPageAsync>> =
            list(CreditGrantListParams.none())

        /** @see list */
        fun list(
            params: CreditGrantListParams = CreditGrantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantListPageAsync>>

        /** @see list */
        fun list(
            params: CreditGrantListParams = CreditGrantListParams.none()
        ): CompletableFuture<HttpResponseFor<CreditGrantListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CreditGrantListPageAsync>> =
            list(CreditGrantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/credits/editGrant`, but is otherwise the same
         * as [CreditGrantServiceAsync.edit].
         */
        fun edit(
            params: CreditGrantEditParams
        ): CompletableFuture<HttpResponseFor<CreditGrantEditResponse>> =
            edit(params, RequestOptions.none())

        /** @see edit */
        fun edit(
            params: CreditGrantEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantEditResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/credits/listEntries`, but is otherwise the same
         * as [CreditGrantServiceAsync.listEntries].
         */
        fun listEntries(): CompletableFuture<HttpResponseFor<CreditGrantListEntriesPageAsync>> =
            listEntries(CreditGrantListEntriesParams.none())

        /** @see listEntries */
        fun listEntries(
            params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantListEntriesPageAsync>>

        /** @see listEntries */
        fun listEntries(
            params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none()
        ): CompletableFuture<HttpResponseFor<CreditGrantListEntriesPageAsync>> =
            listEntries(params, RequestOptions.none())

        /** @see listEntries */
        fun listEntries(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CreditGrantListEntriesPageAsync>> =
            listEntries(CreditGrantListEntriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/credits/voidGrant`, but is otherwise the same
         * as [CreditGrantServiceAsync.void_].
         */
        fun void_(
            params: CreditGrantVoidParams
        ): CompletableFuture<HttpResponseFor<CreditGrantVoidResponse>> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            params: CreditGrantVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantVoidResponse>>
    }
}
