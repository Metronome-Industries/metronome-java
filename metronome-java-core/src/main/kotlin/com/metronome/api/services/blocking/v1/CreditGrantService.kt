// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateParams
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantEditParams
import com.metronome.api.models.v1.creditgrants.CreditGrantEditResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesPage
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesParams
import com.metronome.api.models.v1.creditgrants.CreditGrantListPage
import com.metronome.api.models.v1.creditgrants.CreditGrantListParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidResponse
import java.util.function.Consumer

/**
 * [Credit grants](https://docs.metronome.com/invoicing/how-billing-works/manage-credits/) adjust a
 * customer balance for prepayments, reimbursements, promotions, and so on. Use these endpoints to
 * create, retrieve, update, and delete credit grants.
 */
interface CreditGrantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditGrantService

    /**
     * Create a new credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    fun create(params: CreditGrantCreateParams): CreditGrantCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CreditGrantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantCreateResponse

    /**
     * List credit grants. This list does not included voided grants. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    fun list(): CreditGrantListPage = list(CreditGrantListParams.none())

    /** @see list */
    fun list(
        params: CreditGrantListParams = CreditGrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantListPage

    /** @see list */
    fun list(params: CreditGrantListParams = CreditGrantListParams.none()): CreditGrantListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CreditGrantListPage =
        list(CreditGrantListParams.none(), requestOptions)

    /**
     * Edit an existing credit grant. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    fun edit(params: CreditGrantEditParams): CreditGrantEditResponse =
        edit(params, RequestOptions.none())

    /** @see edit */
    fun edit(
        params: CreditGrantEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantEditResponse

    /**
     * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger
     * entries are returned in chronological order. Ledger entries associated with voided credit
     * grants are not included. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun listEntries(): CreditGrantListEntriesPage = listEntries(CreditGrantListEntriesParams.none())

    /** @see listEntries */
    fun listEntries(
        params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantListEntriesPage

    /** @see listEntries */
    fun listEntries(
        params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none()
    ): CreditGrantListEntriesPage = listEntries(params, RequestOptions.none())

    /** @see listEntries */
    fun listEntries(requestOptions: RequestOptions): CreditGrantListEntriesPage =
        listEntries(CreditGrantListEntriesParams.none(), requestOptions)

    /**
     * Void a credit grant. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    fun void_(params: CreditGrantVoidParams): CreditGrantVoidResponse =
        void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: CreditGrantVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantVoidResponse

    /**
     * A view of [CreditGrantService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditGrantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/credits/createGrant`, but is otherwise the same
         * as [CreditGrantService.create].
         */
        @MustBeClosed
        fun create(params: CreditGrantCreateParams): HttpResponseFor<CreditGrantCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CreditGrantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/credits/listGrants`, but is otherwise the same
         * as [CreditGrantService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CreditGrantListPage> = list(CreditGrantListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CreditGrantListParams = CreditGrantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CreditGrantListParams = CreditGrantListParams.none()
        ): HttpResponseFor<CreditGrantListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CreditGrantListPage> =
            list(CreditGrantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/credits/editGrant`, but is otherwise the same
         * as [CreditGrantService.edit].
         */
        @MustBeClosed
        fun edit(params: CreditGrantEditParams): HttpResponseFor<CreditGrantEditResponse> =
            edit(params, RequestOptions.none())

        /** @see edit */
        @MustBeClosed
        fun edit(
            params: CreditGrantEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantEditResponse>

        /**
         * Returns a raw HTTP response for `post /v1/credits/listEntries`, but is otherwise the same
         * as [CreditGrantService.listEntries].
         */
        @MustBeClosed
        fun listEntries(): HttpResponseFor<CreditGrantListEntriesPage> =
            listEntries(CreditGrantListEntriesParams.none())

        /** @see listEntries */
        @MustBeClosed
        fun listEntries(
            params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantListEntriesPage>

        /** @see listEntries */
        @MustBeClosed
        fun listEntries(
            params: CreditGrantListEntriesParams = CreditGrantListEntriesParams.none()
        ): HttpResponseFor<CreditGrantListEntriesPage> = listEntries(params, RequestOptions.none())

        /** @see listEntries */
        @MustBeClosed
        fun listEntries(
            requestOptions: RequestOptions
        ): HttpResponseFor<CreditGrantListEntriesPage> =
            listEntries(CreditGrantListEntriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/credits/voidGrant`, but is otherwise the same
         * as [CreditGrantService.void_].
         */
        @MustBeClosed
        fun void_(params: CreditGrantVoidParams): HttpResponseFor<CreditGrantVoidResponse> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        @MustBeClosed
        fun void_(
            params: CreditGrantVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantVoidResponse>
    }
}
