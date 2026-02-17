// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1CustomerCreditCreateParams
import com.metronome.api.models.V1CustomerCreditCreateResponse
import com.metronome.api.models.V1CustomerCreditListPage
import com.metronome.api.models.V1CustomerCreditListParams
import com.metronome.api.models.V1CustomerCreditUpdateEndDateParams
import com.metronome.api.models.V1CustomerCreditUpdateEndDateResponse

interface CreditService {

    /**
     * Creates customer-level credits that provide spending allowances or free credit balances for
     * customers across their Metronome usage. Note: In most cases, you should add credits directly
     * to customer contracts using the contract/create or contract/edit APIs.
     *
     * ### Use this endpoint to:
     *
     * Use this endpoint when you need to provision credits directly at the customer level that can
     * be applied across multiple contracts or scoped to specific contracts. Customer-level credits
     * are ideal for:
     * - Customer onboarding incentives that apply globally
     * - Flexible spending allowances that aren't tied to a single contract
     * - Migration scenarios where you need to preserve existing customer balances
     *
     * #### Scoping flexibility:
     *
     * Customer-level credits can be configured in two ways:
     * - Contract-specific: Use the applicable_contract_ids field to limit the credit to specific
     *   contracts
     * - Cross-contract: Leave applicable_contract_ids empty to allow the credit to be used across
     *   all of the customer's contracts
     *
     * #### Product Targeting:
     *
     * Credits can be scoped to specific products using `applicable_product_ids` or
     * `applicable_product_tags`, or left unrestricted to apply to all products.
     *
     * #### Priority considerations:
     *
     * When multiple credits are applicable, the one with the lower priority value will be consumed
     * first. If there is a tie, contract level commits and credits will be applied before customer
     * level commits and credits. Plan your priority scheme carefully to ensure credits are applied
     * in the desired order.
     *
     * #### Access Schedule Required:
     *
     * You must provide an `access_schedule` that defines when and how much credit becomes available
     * to the customer over time. This usually is aligned to the contract schedule or starts
     * immediately and is set to expire in the future.
     *
     * ### Usage Guidelines:
     *
     * ⚠️ Preferred Alternative: In most cases, you should add credits directly to contracts using
     * the contract/create or contract/edit APIs instead of creating customer-level credits.
     * Contract-level credits provide better organization, and are easier for finance teams to
     * recognize revenue, and are the recommended approach for most use cases.
     */
    @JvmOverloads
    fun create(
        params: V1CustomerCreditCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CustomerCreditCreateResponse

    /**
     * Retrieve a detailed list of all credits available to a customer, including promotional
     * credits and contract-specific credits. This endpoint provides comprehensive visibility into
     * credit balances, access schedules, and usage rules, enabling you to build credit management
     * interfaces and track available funding.
     *
     * ### Use this endpoint to:
     * - Display all available credits in customer billing dashboards
     * - Show credit balances and expiration dates
     * - Track credit usage history with optional ledger details
     * - Build credit management and reporting tools
     * - Monitor promotional credit utilization • Support customer inquiries about available credits
     *
     * ### Key response fields:
     *
     * An array of Credit objects containing:
     * - Credit details: Name, priority, and which applicable products/tags it applies to
     * - Product ID: The `product_id` of the credit. This is for external mapping into your
     *   quote-to-cash stack, not the product it applies to.
     * - Access schedule: When credits become available and expire
     * - Optional ledger entries: Transaction history (if `include_ledgers=true`)
     * - Balance information: Current available amount (if `include_balance=true`)
     * - Metadata: Custom fields and usage specifiers
     *
     * ### Usage guidelines:
     * - Pagination: Results limited to 25 commits per page; use next_page for more
     * - Date filtering options:
     *     - `covering_date`: Credits active on a specific date
     *     - `starting_at`: Credits with access on/after a date
     *     - `effective_before`: Credits with access before a date (exclusive)
     * - Scope options:
     *     - `include_contract_credits`: Include contract-level credits (not just customer-level)
     *     - `include_archived`: Include archived credits and credits from archived contracts
     * - Performance considerations:
     *     - `include_ledgers`: Adds detailed transaction history (slower)
     *     - `include_balance`: Adds current balance calculation (slower)
     * - Optional filtering: Use credit_id to retrieve a specific commit
     */
    @JvmOverloads
    fun list(
        params: V1CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CustomerCreditListPage

    /**
     * Shortens the end date of an existing customer credit to terminate it earlier than originally
     * scheduled. Only allows moving end dates forward (earlier), not extending them.
     *
     * Note: To extend credit end dates or make comprehensive edits, use the 'edit credit' endpoint
     * instead.
     */
    @JvmOverloads
    fun updateEndDate(
        params: V1CustomerCreditUpdateEndDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CustomerCreditUpdateEndDateResponse
}
