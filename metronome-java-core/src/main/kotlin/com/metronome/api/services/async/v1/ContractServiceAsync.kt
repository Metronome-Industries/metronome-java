// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1ContractAddManualBalanceEntryParams
import com.metronome.api.models.V1ContractAmendParams
import com.metronome.api.models.V1ContractAmendResponse
import com.metronome.api.models.V1ContractArchiveParams
import com.metronome.api.models.V1ContractArchiveResponse
import com.metronome.api.models.V1ContractCreateHistoricalInvoicesParams
import com.metronome.api.models.V1ContractCreateHistoricalInvoicesResponse
import com.metronome.api.models.V1ContractCreateParams
import com.metronome.api.models.V1ContractCreateResponse
import com.metronome.api.models.V1ContractGetNetBalanceParams
import com.metronome.api.models.V1ContractGetNetBalanceResponse
import com.metronome.api.models.V1ContractListBalancesPageAsync
import com.metronome.api.models.V1ContractListBalancesParams
import com.metronome.api.models.V1ContractListParams
import com.metronome.api.models.V1ContractListResponse
import com.metronome.api.models.V1ContractRetrieveParams
import com.metronome.api.models.V1ContractRetrieveRateScheduleParams
import com.metronome.api.models.V1ContractRetrieveRateScheduleResponse
import com.metronome.api.models.V1ContractRetrieveResponse
import com.metronome.api.models.V1ContractRetrieveSubscriptionQuantityHistoryParams
import com.metronome.api.models.V1ContractRetrieveSubscriptionQuantityHistoryResponse
import com.metronome.api.models.V1ContractScheduleProServicesInvoiceParams
import com.metronome.api.models.V1ContractScheduleProServicesInvoiceResponse
import com.metronome.api.models.V1ContractSetUsageFilterParams
import com.metronome.api.models.V1ContractUpdateEndDateParams
import com.metronome.api.models.V1ContractUpdateEndDateResponse
import com.metronome.api.services.async.v1.contracts.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.contracts.ProductServiceAsync
import com.metronome.api.services.async.v1.contracts.RateCardServiceAsync
import java.util.concurrent.CompletableFuture

interface ContractServiceAsync {

    fun products(): ProductServiceAsync

    fun rateCards(): RateCardServiceAsync

    fun namedSchedules(): NamedScheduleServiceAsync

    /**
     * Contracts define a customer's products, pricing, discounts, access duration, and billing
     * configuration. Contracts serve as the central billing agreement for both PLG and Enterprise
     * customers, you can automatically customers access to your products and services directly from
     * your product or CRM.
     *
     * ### Use this endpoint to:
     * - PLG onboarding: Automatically provision new self-serve customers with contracts when they
     *   sign up.
     * - Enterprise sales: Push negotiated contracts from Salesforce with custom pricing and
     *   commitments
     * - Promotional pricing: Implement time-limited discounts and free trials through overrides
     *
     * ### Key components:
     *
     * #### Contract Term and Billing Schedule
     * - Set contract duration using `starting_at` and `ending_before` fields. PLG contracts
     *   typically use perpetual agreements (no end date), while Enterprise contracts have fixed end
     *   dates which can be edited over time in the case of co-term upsells.
     *
     * #### Rate Card
     *
     * If you are offering usage based pricing, you can set a rate card for the contract to
     * reference through `rate_card_id` or `rate_card_alias`. The rate card is a store of all of
     * your usage based products and their centralized pricing. Any new products or price changes on
     * the rate card can be set to automatically propagate to all associated contracts - this
     * ensures consistent pricing and product launches flow to contracts without manual updates and
     * migrations. The `usage_statement_schedule` determines the cadence on which Metronome will
     * finalize a usage invoice for the customer. This defaults to monthly on the 1st, with options
     * for custom dates, quarterly, or annual cadences. Note: Most usage based billing companies
     * align usage statements to be evaluated aligned to the first of the month. Read more about
     * [Rate Cards](https://docs.metronome.com/pricing-packaging/create-manage-rate-cards/).
     *
     * #### Overrides and discounts
     *
     * Customize pricing on the contract through time-bounded overrides that can target specific
     * products, product families, or complex usage scenarios. Overrides enable two key
     * capabilities:
     * - Discounts: Apply percentage discounts, fixed rate reductions, or quantity-based pricing
     *   tiers
     * - Entitlements: Provide special pricing or access to specific products for negotiated deals
     *
     * Read more about
     * [Contract Overrides](https://docs.metronome.com/manage-product-access/add-contract-override/).
     *
     * #### Commits and Credits
     *
     * Using commits, configure prepaid or postpaid spending commitments where customers promise to
     * spend a certain amount over the contract period paid in advance or in arrears. Use credits to
     * provide free spending allowances. Under the hood these are the same mechanisms, however,
     * credits are typically offered for free (SLA or promotional) or as a part of an allotment
     * associated with a Subscription.
     *
     * In Metronome, you can set commits and credits to only be applicable for a subset of usage.
     * Use `applicable_product_ids` or `applicable_product_tags` to create product or product-family
     * specific commits or credits, or you can build complex boolean logic specifiers to target
     * usage based on pricing and presentation group values using `override_specifiers`.
     *
     * These objects can also also be configured to have a recurrence schedule to easily model
     * customer packaging which includes recurring monthly or quarterly allotments.
     *
     * Commits support rollover settings (`rollover_fraction`) to transfer unused balances between
     * contract periods, either entirely or as a percentage.
     *
     * Read more about
     * [Credits and Commits](https://docs.metronome.com/pricing-packaging/apply-credits-commits/).
     *
     * #### Subscriptions
     *
     * You can add a fixed recurring charge to a contract, like monthly licenses or seat-based fees,
     * using the subscription charge. Subscription charges are defined on your rate card and you can
     * select which subscription is applicable to add to each contract. When you add a subscription
     * to a contract you need to:
     * - Define whether the subscription is paid for in-advance or in-arrears
     *   (`collection_schedule`)
     * - Define the proration behavior (`proration`)
     * - Specify an initial quantity (`initial_quantity`)
     * - Define which subscription rate on the rate card should be used (`subscription_rate`)
     *
     * Read more about
     * [Subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/).
     *
     * #### Scheduled Charges
     *
     * Set up one-time, recurring, or entirely custom charges that occur on specific dates, separate
     * from usage-based billing or commitments. These can be used to model non-recurring platform
     * charges or professional services.
     *
     * #### Threshold Billing
     *
     * Metronome allows you to configure automatic billing triggers when customers reach spending
     * thresholds to prevent fraud and manage risk. You can use `spend_threshold_configuration` to
     * trigger an invoice to cover current charges whenever the threshold is reached or you can
     * ensure the customer maintains a minimum prepaid balance using the
     * `prepaid_balance_configuration`.
     *
     * Read more about
     * [Spend Threshold](https://docs.metronome.com/manage-product-access/spend-thresholds/) and
     * [Prepaid Balance Thresholds](https://docs.metronome.com/manage-product-access/prepaid-balance-thresholds/).
     *
     * ### Usage guidelines:
     * - You can always
     *   [Edit Contracts](https://docs.metronome.com/manage-product-access/edit-contract/) after it
     *   has been created, using the `editContract` endpoint. Metronome keeps track of all edits,
     *   both in the audit log and over the `getEditHistory` endpoint.
     * - Customers in Metronome can have multiple concurrent contracts at one time. Use
     *   `usage_filters` to route the correct usage to each contract.
     *   [Read more about usage filters](https://docs.metronome.com/manage-product-access/provision-customer/#create-a-usage-filter).
     */
    @JvmOverloads
    fun create(
        params: V1ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractCreateResponse>

    /**
     * This is the v1 endpoint to get a contract. New clients should implement using the v2
     * endpoint.
     */
    @JvmOverloads
    fun retrieve(
        params: V1ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractRetrieveResponse>

    /**
     * Retrieves all contracts for a specific customer, including pricing, terms, credits, and
     * commitments. Use this to view a customer's contract history and current agreements for
     * billing management. Returns contract details with optional ledgers and balance information.
     *
     * ⚠️ Note: This is the legacy v1 endpoint - new integrations should use the v2 endpoint for
     * enhanced features.
     */
    @JvmOverloads
    fun list(
        params: V1ContractListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractListResponse>

    /**
     * Manually adjust the available balance on a commit or credit. This entry is appended to the
     * commit ledger as a new event. Optionally include a description that provides the reasoning
     * for the entry.
     *
     * ### Use this endpoint to:
     * - Address incorrect usage burn-down caused by malformed usage or invalid config
     * - Decrease available balance to account for outages where usage may have not been tracked or
     *   sent to Metronome
     * - Issue credits to customers in the form of increased balance on existing commit or credit
     *
     * ### Usage guidelines:
     *
     * Manual ledger entries can be extremely useful for resolving discrepancies in Metronome.
     * However, most corrections to inaccurate billings can be modified upstream of the commit,
     * whether that is via contract editing, rate editing, or other actions that cause an invoice to
     * be recalculated.
     */
    @JvmOverloads
    fun addManualBalanceEntry(
        params: V1ContractAddManualBalanceEntryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Amendments will be replaced by Contract editing. New clients should implement using the
     * `editContract` endpoint. Read more about the migration to contract editing
     * [here](/guides/implement-metronome/migrate-amendments-to-edits/) and reach out to your
     * Metronome representative for more details. Once contract editing is enabled, access to this
     * endpoint will be removed.
     */
    @JvmOverloads
    fun amend(
        params: V1ContractAmendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractAmendResponse>

    /**
     * Permanently end and archive a contract along with all its terms. Any draft invoices will be
     * canceled, and all upcoming scheduled invoices will be voided–also all finalized invoices can
     * optionally be voided. Use this in the event a contract was incorrectly created and needed to
     * be removed from a customer.
     *
     * #### Impact on commits and credits:
     *
     * When archiving a contract, all associated commits and credits are also archived. For prepaid
     * commits with active segments, Metronome automatically generates expiration ledger entries to
     * close out any remaining balances, ensuring accurate accounting of unused prepaid amounts.
     * These ledger entries will appear in the commit's transaction history with type
     * `PREPAID_COMMIT_EXPIRATION`.
     *
     * #### Archived contract visibility:
     *
     * Archived contracts remain accessible for historical reporting and audit purposes. They can be
     * retrieved using the `ListContracts` endpoint by setting the `include_archived` parameter to
     * `true` or in the Metronome UI when the "Show archived" option is enabled.
     */
    @JvmOverloads
    fun archive(
        params: V1ContractArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractArchiveResponse>

    /**
     * Create historical usage invoices for past billing periods on specific contracts. Use this
     * endpoint to generate retroactive invoices with custom usage line items, quantities, and date
     * ranges. Supports preview mode to validate invoice data before creation. Ideal for billing
     * migrations or correcting past billing periods.
     */
    @JvmOverloads
    fun createHistoricalInvoices(
        params: V1ContractCreateHistoricalInvoicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractCreateHistoricalInvoicesResponse>

    /**
     * Retrieve the combined current balance across any grouping of credits and commits for a
     * customer in a single API call.
     * - Display real-time available balance to customers in billing dashboards
     * - Build finance dashboards showing credit utilization across customer segments
     * - Validate expected vs. actual balance during billing reconciliation
     *
     * ### Key response fields:
     * - `balance`: The combined net balance available to use at this moment across all matching
     *   commits and credits
     * - `credit_type_id`: The credit type (fiat or custom pricing unit) the balance is denominated
     *   in
     *
     * ### Filtering options:
     *
     * Balance filters allow you to scope the calculation to specific subsets of commits and
     * credits. When using multiple filter objects, they are OR'd together — if a commit or credit
     * matches any filter, it's included in the net balance. Within a single filter object, all
     * specified conditions are AND'd together.
     * - **Balance types**: Include any combination of `PREPAID_COMMIT`, `POSTPAID_COMMIT`, and
     *   `CREDIT` (e.g., `["PREPAID_COMMIT", "CREDIT"]` to exclude postpaid commits). If not
     *   specified, all balance types are included.
     * - **Specific IDs**: Target exact commit or credit IDs for precise balance queries
     * - **Custom fields**: Filter by custom field key-value pairs; when multiple pairs are
     *   provided, commits must match all of them
     *
     * **Example**: To get the balance of all free-trial credits OR all signup-promotion commits,
     * you'd pass two filter objects — one filtering for CREDIT with custom field campaign:
     * free-trial, and another filtering for PREPAID_COMMIT with custom field campaign:
     * signup-promotion.
     *
     * ### Usage guidelines:
     * - **Draft invoice handling**: Use `invoice_inclusion_mode` to control whether pending draft
     *   invoice deductions are included (`FINALIZED_AND_DRAFT`, the default) or excluded
     *   (`FINALIZED`) from the balance calculation
     * - **Account hierarchies**: When querying a child customer, shared commits from parent
     *   contracts are not included — query the parent customer directly to see shared commit
     *   balances
     * - **Negative balances**: Manual ledger entries can cause negative segment balances; these are
     *   treated as zero when calculating the net balance
     * - **Credit types**: If `credit_type_id` is not specified, the balance defaults to USD (cents)
     */
    @JvmOverloads
    fun getNetBalance(
        params: V1ContractGetNetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractGetNetBalanceResponse>

    /**
     * Retrieve a comprehensive view of all available balances (commits and credits) for a customer.
     * This endpoint provides real-time visibility into prepaid funds, postpaid commitments,
     * promotional credits, and other balance types that can offset usage charges, helping you build
     * transparent billing experiences.
     *
     * ### Use this endpoint to:
     * - Display current available balances in customer dashboards
     * - Verify available funds before approving high-usage operations
     * - Generate balance reports for finance teams
     * - Filter balances by contract or date ranges
     *
     * ### Key response fields:
     *
     * An array of balance objects (all credits and commits) containing:
     * - Balance details: Current available amount for each commit or credit
     * - Metadata: Product associations, priorities, applicable date ranges
     * - Optional ledger entries: Detailed transaction history (if `include_ledgers=true`)
     * - Balance calculations: Including pending transactions and future-dated entries
     * - Custom fields: Any additional metadata attached to balances
     *
     * ### Usage guidelines:
     * - Date filtering: Use `effective_before` to include only balances with access before a
     *   specific date (exclusive)
     * - Set `include_balance=true` for calculated balance amounts on each commit or credit
     * - Set `include_ledgers=true` for full transaction history
     * - Set `include_contract_balances = true` to see contract level balances
     * - Balance logic: Reflects currently accessible amounts, excluding expired/future segments
     * - Manual adjustments: Includes all manual ledger entries, even future-dated ones
     */
    @JvmOverloads
    fun listBalances(
        params: V1ContractListBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractListBalancesPageAsync>

    /**
     * For a specific customer and contract, get the rates at a specific point in time. This
     * endpoint takes the contract's rate card into consideration, including scheduled changes. It
     * also takes into account overrides on the contract.
     *
     * For example, if you want to show your customer a summary of the prices they are paying,
     * inclusive of any negotiated discounts or promotions, use this endpoint. This endpoint only
     * returns rates that are entitled.
     */
    @JvmOverloads
    fun retrieveRateSchedule(
        params: V1ContractRetrieveRateScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractRetrieveRateScheduleResponse>

    /**
     * Get the history of subscription quantities and prices over time for a given
     * `subscription_id`. This endpoint can be used to power an in-product experience where you show
     * a customer their historical changes to seat count. Future changes are not included in this
     * endpoint - use the `getContract` endpoint to view the future scheduled changes to a
     * subscription's quantity.
     *
     * Subscriptions are used to model fixed recurring fees as well as seat-based recurring fees. To
     * model changes to the number of seats in Metronome, you can increment or decrement the
     * quantity on a subscription at any point in the past or future.
     */
    @JvmOverloads
    fun retrieveSubscriptionQuantityHistory(
        params: V1ContractRetrieveSubscriptionQuantityHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractRetrieveSubscriptionQuantityHistoryResponse>

    /**
     * Create a new scheduled invoice for Professional Services terms on a contract. This endpoint's
     * availability is dependent on your client's configuration.
     */
    @JvmOverloads
    fun scheduleProServicesInvoice(
        params: V1ContractScheduleProServicesInvoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractScheduleProServicesInvoiceResponse>

    /**
     * If a customer has multiple contracts with overlapping rates, the usage filter routes usage to
     * the appropriate contract based on a predefined group key.
     *
     * As an example, imagine you have a customer associated with two projects. Each project is
     * associated with its own contract. You can create a usage filter with group key `project_id`
     * on each contract, and route usage for `project_1` to the first contract and `project_2` to
     * the second contract.
     *
     * ### Use this endpoint to:
     * - Support enterprise contracting scenarios where multiple contracts are associated to the
     *   same customer with the same rates.
     * - Update the usage filter associated with the contract over time.
     *
     * ### Usage guidelines:
     *
     * To use usage filters, the `group_key` must be defined on the billable metrics underlying the
     * rate card on the contracts.
     */
    @JvmOverloads
    fun setUsageFilter(
        params: V1ContractSetUsageFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Update or add an end date to a contract. Ending a contract early will impact draft usage
     * statements, truncate any terms, and remove upcoming scheduled invoices. Moving the date into
     * the future will only extend the contract length. Terms and scheduled invoices are not
     * extended. In-advance subscriptions will not be extended. Use this if a contract's end date
     * has changed or if a perpetual contract ends.
     */
    @JvmOverloads
    fun updateEndDate(
        params: V1ContractUpdateEndDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ContractUpdateEndDateResponse>
}
