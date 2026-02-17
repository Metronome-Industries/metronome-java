// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

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
import com.metronome.api.models.V1CustomerCommitCreateParams
import com.metronome.api.models.V1CustomerCommitCreateResponse
import com.metronome.api.models.V1CustomerCommitListPage
import com.metronome.api.models.V1CustomerCommitListParams
import com.metronome.api.models.V1CustomerCommitUpdateEndDateParams
import com.metronome.api.models.V1CustomerCommitUpdateEndDateResponse

class CommitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<V1CustomerCommitCreateResponse> =
        jsonHandler<V1CustomerCommitCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Creates customer-level commits that establish spending commitments for customers across their
     * Metronome usage. Commits represent contracted spending obligations that can be either prepaid
     * (paid upfront) or postpaid (billed later).
     *
     * Note: In most cases, you should add commitments directly to customer contracts using the
     * contract/create or contract/edit APIs.
     *
     * ### Use this endpoint to:
     *
     * Use this endpoint when you need to establish customer-level spending commitments that can be
     * applied across multiple contracts or scoped to specific contracts. Customer-level commits are
     * ideal for:
     * - Enterprise-wide minimum spending agreements that span multiple contracts
     * - Multi-contract volume commitments with shared spending pools
     * - Cross-contract discount tiers based on aggregate usage
     *
     * #### Commit type Requirements:
     * - You must specify either "prepaid" or "postpaid" as the commit type:
     * - Prepaid commits: Customer pays upfront; invoice_schedule is optional (if omitted, creates a
     *   commit without an invoice)
     * - Postpaid commits: Customer pays when the commitment expires (the end of the
     *   access_schedule); invoice_schedule is required and must match access_schedule totals.
     *
     * #### Billing configuration:
     * - invoice_contract_id is required for postpaid commits and for prepaid commits with billing
     *   (only optional for free prepaid commits) unless do_not_invoice is set to true
     * - For postpaid commits: access_schedule and invoice_schedule must have matching amounts
     * - For postpaid commits: only one schedule item is allowed in both schedules.
     *
     * #### Scoping flexibility:
     *
     * Customer-level commits can be configured in a few ways:
     * - Contract-specific: Use the `applicable_contract_ids` field to limit the commit to specific
     *   contracts
     * - Cross-contract: Leave `applicable_contract_ids` empty to allow the commit to be used across
     *   all of the customer's contracts
     *
     * #### Product targeting:
     *
     * Commits can be scoped to specific products using applicable_product_ids,
     * applicable_product_tags, or specifiers, or left unrestricted to apply to all products.
     *
     * #### Priority considerations:
     *
     * When multiple commits are applicable, the one with the lower priority value will be consumed
     * first. If there is a tie, contract level commits and credits will be applied before customer
     * level commits and credits. Plan your priority scheme carefully to ensure commits are applied
     * in the desired order.
     *
     * ### Usage guidelines:
     *
     * ⚠️ Preferred Alternative: In most cases, you should add commits directly to contracts using
     * the create contract or edit contract APIs instead of creating customer-level commits.
     * Contract-level commits provide better organization and are the recommended approach for
     * standard use cases.
     */
    override fun create(
        params: V1CustomerCommitCreateParams,
        requestOptions: RequestOptions,
    ): V1CustomerCommitCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contracts", "customerCommits", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<V1CustomerCommitListPage.Response> =
        jsonHandler<V1CustomerCommitListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve all commit agreements for a customer, including both prepaid and postpaid
     * commitments. This endpoint provides comprehensive visibility into contractual spending
     * obligations, enabling you to track commitment utilization and manage customer contracts
     * effectively.
     *
     * ### Use this endpoint to:
     * - Display commitment balances and utilization in customer dashboards
     * - Track prepaid commitment drawdown and remaining balances
     * - Monitor postpaid commitment progress toward minimum thresholds
     * - Build commitment tracking and forecasting tools
     * - Show commitment history with optional ledger details
     * - Manage rollover balances between contract periods
     *
     * ### Key response fields:
     *
     * An array of Commit objects containing:
     * - Commit type: PREPAID (pay upfront) or POSTPAID (pay at true-up)
     * - Rate type: COMMIT_RATE (discounted) or LIST_RATE (standard pricing)
     * - Access schedule: When commitment funds become available
     * - Invoice schedule: When the customer is billed
     * - Product targeting: Which product(s) usage is eligible to draw from this commit
     * - Optional ledger entries: Transaction history (if `include_ledgers=true`)
     * - Balance information: Current available amount (if `include_balance=true`)
     * - Rollover settings: Fraction of unused amount that carries forward
     *
     * ### Usage guidelines:
     * - Pagination: Results limited to 25 commits per page; use 'next_page' for more
     * - Date filtering options:
     *     - `covering_date`: Commits active on a specific date
     *     - `starting_at`: Commits with access on/after a date
     *     - `effective_before`: Commits with access before a date (exclusive)
     * - Scope options:
     *     - `include_contract_commits`: Include contract-level commits (not just customer-level)
     *     - `include_archived`: Include archived commits and commits from archived contracts
     * - Performance considerations:
     *     - include_ledgers: Adds detailed transaction history (slower)
     *     - include_balance: Adds current balance calculation (slower)
     * - Optional filtering: Use commit_id to retrieve a specific commit
     */
    override fun list(
        params: V1CustomerCommitListParams,
        requestOptions: RequestOptions,
    ): V1CustomerCommitListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contracts", "customerCommits", "list")
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
            .let { V1CustomerCommitListPage.of(this, params, it) }
    }

    private val updateEndDateHandler: Handler<V1CustomerCommitUpdateEndDateResponse> =
        jsonHandler<V1CustomerCommitUpdateEndDateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Shortens the end date of a prepaid commit to terminate it earlier than originally scheduled.
     * Use this endpoint when you need to cancel or reduce the duration of an existing prepaid
     * commit. Only works with prepaid commit types and can only move the end date forward
     * (earlier), not extend it.
     *
     * ### Usage guidelines:
     *
     * To extend commit end dates or make other comprehensive edits, use the 'edit commit' endpoint
     * instead.
     */
    override fun updateEndDate(
        params: V1CustomerCommitUpdateEndDateParams,
        requestOptions: RequestOptions,
    ): V1CustomerCommitUpdateEndDateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contracts", "customerCommits", "updateEndDate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateEndDateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
