// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v2.contracts.ContractEditCommitParams
import com.metronome.api.models.v2.contracts.ContractEditCommitResponse
import com.metronome.api.models.v2.contracts.ContractEditCreditParams
import com.metronome.api.models.v2.contracts.ContractEditCreditResponse
import com.metronome.api.models.v2.contracts.ContractEditParams
import com.metronome.api.models.v2.contracts.ContractEditResponse
import com.metronome.api.models.v2.contracts.ContractGetEditHistoryParams
import com.metronome.api.models.v2.contracts.ContractGetEditHistoryResponse
import com.metronome.api.models.v2.contracts.ContractListParams
import com.metronome.api.models.v2.contracts.ContractListResponse
import com.metronome.api.models.v2.contracts.ContractRetrieveParams
import com.metronome.api.models.v2.contracts.ContractRetrieveResponse
import java.util.function.Consumer

interface ContractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService

    /**
     * Gets the details for a specific contract, including contract term, rate card information,
     * credits and commits, and more.
     *
     * ### Use this endpoint to:
     * - Check the duration of a customer's current contract
     * - Get details on contract terms, including access schedule amounts for commitments and
     *   credits
     * - Understand the state of a contract at a past time. As you can evolve the terms of a
     *   contract over time through editing, use the `as_of_date` parameter to view the full
     *   contract configuration as of that point in time.
     *
     * ### Usage guidelines:
     * - Optionally, use the `include_balance` and `include_ledger` fields to include balances and
     *   ledgers in the credit and commit responses. Using these fields will cause the query to be
     *   slower.
     */
    fun retrieve(params: ContractRetrieveParams): ContractRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractRetrieveResponse

    /**
     * For a given customer, lists all of their contracts in chronological order.
     *
     * ### Use this endpoint to:
     * - Check if a customer is provisioned with any contract, and at which tier
     * - Check the duration and terms of a customer's current contract
     * - Power a page in your end customer experience that shows the customer's history of tiers
     *   (e.g. this customer started out on the Pro Plan, then downgraded to the Starter plan).
     *
     * ### Usage guidelines:
     * Use the `starting_at`, `covering_date`, and `include_archived` parameters to filter the list
     * of returned contracts. For example, to list only currently active contracts, pass
     * `covering_date` equal to the current time.
     */
    fun list(params: ContractListParams): ContractListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ContractListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractListResponse

    /**
     * The ability to edit a contract helps you react quickly to the needs of your customers and
     * your business.
     *
     * ### Use this endpoint to:
     * - Encode mid-term commitment and discount changes
     * - Fix configuration mistakes and easily roll back packaging changes
     *
     * ### Key response fields:
     * - The `id` of the edit
     * - Complete edit details. For example, if you edited the contract to add new overrides and
     *   credits, you will receive the IDs of those overrides and credits in the response.
     *
     * ### Usage guidelines:
     * - When you edit a contract, any draft invoices update immediately to reflect that edit.
     *   Finalized invoices remain unchanged - you must void and regenerate them in the UI or API to
     *   reflect the edit.
     * - Contract editing must be enabled to use this endpoint. Reach out to your Metronome
     *   representative to learn more.
     */
    fun edit(params: ContractEditParams): ContractEditResponse = edit(params, RequestOptions.none())

    /** @see edit */
    fun edit(
        params: ContractEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractEditResponse

    /**
     * Edit specific details for a contract-level or customer-level commit. Use this endpoint to
     * modify individual commit access schedules, invoice schedules, applicable products, invoicing
     * contracts, or other fields.
     *
     * ### Usage guidelines:
     * - As with all edits in Metronome, draft invoices will reflect the edit immediately, while
     *   finalized invoices are untouched unless voided and regenerated.
     * - If a commit's invoice schedule item is associated with a finalized invoice, you cannot
     *   remove or update the invoice schedule item.
     * - If a commit's invoice schedule item is associated with a voided invoice, you cannot remove
     *   the invoice schedule item.
     * - You cannot remove an commit access schedule segment that was applied to a finalized
     *   invoice. You can void the invoice beforehand and then remove the access schedule segment.
     */
    fun editCommit(params: ContractEditCommitParams): ContractEditCommitResponse =
        editCommit(params, RequestOptions.none())

    /** @see editCommit */
    fun editCommit(
        params: ContractEditCommitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractEditCommitResponse

    /**
     * Edit details for a contract-level or customer-level credit.
     *
     * ### Use this endpoint to:
     * - Extend the duration or the amount of an existing free credit like a trial
     * - Modify individual credit access schedules, applicable products, priority, or other fields.
     *
     * ### Usage guidelines:
     * - As with all edits in Metronome, draft invoices will reflect the edit immediately, while
     *   finalized invoices are untouched unless voided and regenerated.
     * - You cannot remove an access schedule segment that was applied to a finalized invoice. You
     *   can void the invoice beforehand and then remove the access schedule segment.
     */
    fun editCredit(params: ContractEditCreditParams): ContractEditCreditResponse =
        editCredit(params, RequestOptions.none())

    /** @see editCredit */
    fun editCredit(
        params: ContractEditCreditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractEditCreditResponse

    /**
     * List all the edits made to a contract over time. In Metronome, you can edit a contract at any
     * point after it's created to fix mistakes or reflect changes in terms. Metronome stores a full
     * history of all edits that were ever made to a contract, whether through the UI,
     * `editContract` endpoint, or other endpoints like `updateContractEndDate`.
     *
     * ### Use this endpoint to:
     * - Understand what changes were made to a contract, when, and by who
     *
     * ### Key response fields:
     * - An array of every edit ever made to the contract
     * - Details on each individual edit - for example showing that in one edit, a user added two
     *   discounts and incremented a subscription quantity.
     */
    fun getEditHistory(params: ContractGetEditHistoryParams): ContractGetEditHistoryResponse =
        getEditHistory(params, RequestOptions.none())

    /** @see getEditHistory */
    fun getEditHistory(
        params: ContractGetEditHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractGetEditHistoryResponse

    /** A view of [ContractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/contracts/get`, but is otherwise the same as
         * [ContractService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ContractRetrieveParams): HttpResponseFor<ContractRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /v2/contracts/list`, but is otherwise the same as
         * [ContractService.list].
         */
        @MustBeClosed
        fun list(params: ContractListParams): HttpResponseFor<ContractListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContractListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractListResponse>

        /**
         * Returns a raw HTTP response for `post /v2/contracts/edit`, but is otherwise the same as
         * [ContractService.edit].
         */
        @MustBeClosed
        fun edit(params: ContractEditParams): HttpResponseFor<ContractEditResponse> =
            edit(params, RequestOptions.none())

        /** @see edit */
        @MustBeClosed
        fun edit(
            params: ContractEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractEditResponse>

        /**
         * Returns a raw HTTP response for `post /v2/contracts/commits/edit`, but is otherwise the
         * same as [ContractService.editCommit].
         */
        @MustBeClosed
        fun editCommit(
            params: ContractEditCommitParams
        ): HttpResponseFor<ContractEditCommitResponse> = editCommit(params, RequestOptions.none())

        /** @see editCommit */
        @MustBeClosed
        fun editCommit(
            params: ContractEditCommitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractEditCommitResponse>

        /**
         * Returns a raw HTTP response for `post /v2/contracts/credits/edit`, but is otherwise the
         * same as [ContractService.editCredit].
         */
        @MustBeClosed
        fun editCredit(
            params: ContractEditCreditParams
        ): HttpResponseFor<ContractEditCreditResponse> = editCredit(params, RequestOptions.none())

        /** @see editCredit */
        @MustBeClosed
        fun editCredit(
            params: ContractEditCreditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractEditCreditResponse>

        /**
         * Returns a raw HTTP response for `post /v2/contracts/getEditHistory`, but is otherwise the
         * same as [ContractService.getEditHistory].
         */
        @MustBeClosed
        fun getEditHistory(
            params: ContractGetEditHistoryParams
        ): HttpResponseFor<ContractGetEditHistoryResponse> =
            getEditHistory(params, RequestOptions.none())

        /** @see getEditHistory */
        @MustBeClosed
        fun getEditHistory(
            params: ContractGetEditHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractGetEditHistoryResponse>
    }
}
