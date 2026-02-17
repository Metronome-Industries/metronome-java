// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v2

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V2ContractEditCommitParams
import com.metronome.api.models.V2ContractEditCommitResponse
import com.metronome.api.models.V2ContractEditCreditParams
import com.metronome.api.models.V2ContractEditCreditResponse
import com.metronome.api.models.V2ContractEditParams
import com.metronome.api.models.V2ContractEditResponse
import com.metronome.api.models.V2ContractGetEditHistoryParams
import com.metronome.api.models.V2ContractGetEditHistoryResponse
import com.metronome.api.models.V2ContractListParams
import com.metronome.api.models.V2ContractListResponse
import com.metronome.api.models.V2ContractRetrieveParams
import com.metronome.api.models.V2ContractRetrieveResponse

interface ContractService {

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
    @JvmOverloads
    fun retrieve(
        params: V2ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ContractRetrieveResponse

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
     *
     * Use the `starting_at`, `covering_date`, and `include_archived` parameters to filter the list
     * of returned contracts. For example, to list only currently active contracts, pass
     * `covering_date` equal to the current time.
     */
    @JvmOverloads
    fun list(
        params: V2ContractListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ContractListResponse

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
    @JvmOverloads
    fun edit(
        params: V2ContractEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ContractEditResponse

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
    @JvmOverloads
    fun editCommit(
        params: V2ContractEditCommitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ContractEditCommitResponse

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
    @JvmOverloads
    fun editCredit(
        params: V2ContractEditCreditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ContractEditCreditResponse

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
    @JvmOverloads
    fun getEditHistory(
        params: V2ContractGetEditHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ContractGetEditHistoryResponse
}
