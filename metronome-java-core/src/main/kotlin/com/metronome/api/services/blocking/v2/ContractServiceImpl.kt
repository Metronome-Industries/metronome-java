// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
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

class ContractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<V2ContractRetrieveResponse> =
        jsonHandler<V2ContractRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun retrieve(
        params: V2ContractRetrieveParams,
        requestOptions: RequestOptions,
    ): V2ContractRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "contracts", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<V2ContractListResponse> =
        jsonHandler<V2ContractListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
    override fun list(
        params: V2ContractListParams,
        requestOptions: RequestOptions,
    ): V2ContractListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "contracts", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val editHandler: Handler<V2ContractEditResponse> =
        jsonHandler<V2ContractEditResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
    override fun edit(
        params: V2ContractEditParams,
        requestOptions: RequestOptions,
    ): V2ContractEditResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "contracts", "edit")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { editHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val editCommitHandler: Handler<V2ContractEditCommitResponse> =
        jsonHandler<V2ContractEditCommitResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun editCommit(
        params: V2ContractEditCommitParams,
        requestOptions: RequestOptions,
    ): V2ContractEditCommitResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "contracts", "commits", "edit")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { editCommitHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val editCreditHandler: Handler<V2ContractEditCreditResponse> =
        jsonHandler<V2ContractEditCreditResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun editCredit(
        params: V2ContractEditCreditParams,
        requestOptions: RequestOptions,
    ): V2ContractEditCreditResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "contracts", "credits", "edit")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { editCreditHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val getEditHistoryHandler: Handler<V2ContractGetEditHistoryResponse> =
        jsonHandler<V2ContractGetEditHistoryResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun getEditHistory(
        params: V2ContractGetEditHistoryParams,
        requestOptions: RequestOptions,
    ): V2ContractGetEditHistoryResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "contracts", "getEditHistory")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getEditHistoryHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
