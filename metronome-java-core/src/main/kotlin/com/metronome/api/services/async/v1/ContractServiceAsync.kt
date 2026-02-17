// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.contracts.ContractAddManualBalanceEntryParams
import com.metronome.api.models.v1.contracts.ContractAmendParams
import com.metronome.api.models.v1.contracts.ContractAmendResponse
import com.metronome.api.models.v1.contracts.ContractArchiveParams
import com.metronome.api.models.v1.contracts.ContractArchiveResponse
import com.metronome.api.models.v1.contracts.ContractCreateHistoricalInvoicesParams
import com.metronome.api.models.v1.contracts.ContractCreateHistoricalInvoicesResponse
import com.metronome.api.models.v1.contracts.ContractCreateParams
import com.metronome.api.models.v1.contracts.ContractCreateResponse
import com.metronome.api.models.v1.contracts.ContractGetNetBalanceParams
import com.metronome.api.models.v1.contracts.ContractGetNetBalanceResponse
import com.metronome.api.models.v1.contracts.ContractListBalancesPageAsync
import com.metronome.api.models.v1.contracts.ContractListBalancesParams
import com.metronome.api.models.v1.contracts.ContractListParams
import com.metronome.api.models.v1.contracts.ContractListResponse
import com.metronome.api.models.v1.contracts.ContractRetrieveParams
import com.metronome.api.models.v1.contracts.ContractRetrieveRateScheduleParams
import com.metronome.api.models.v1.contracts.ContractRetrieveRateScheduleResponse
import com.metronome.api.models.v1.contracts.ContractRetrieveResponse
import com.metronome.api.models.v1.contracts.ContractRetrieveSubscriptionQuantityHistoryParams
import com.metronome.api.models.v1.contracts.ContractRetrieveSubscriptionQuantityHistoryResponse
import com.metronome.api.models.v1.contracts.ContractScheduleProServicesInvoiceParams
import com.metronome.api.models.v1.contracts.ContractScheduleProServicesInvoiceResponse
import com.metronome.api.models.v1.contracts.ContractSetUsageFilterParams
import com.metronome.api.models.v1.contracts.ContractUpdateEndDateParams
import com.metronome.api.models.v1.contracts.ContractUpdateEndDateResponse
import com.metronome.api.services.async.v1.contracts.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.contracts.ProductServiceAsync
import com.metronome.api.services.async.v1.contracts.RateCardServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractServiceAsync

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
     * Set up one-time, recurring, or entirely custom charges that occur on specific dates, separate
     * from usage-based billing or commitments. These can be used to model non-recurring platform
     * charges or professional services.
     *
     * #### Threshold Billing
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
    fun create(params: ContractCreateParams): CompletableFuture<ContractCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractCreateResponse>

    /**
     * This is the v1 endpoint to get a contract. New clients should implement using the v2
     * endpoint.
     */
    fun retrieve(params: ContractRetrieveParams): CompletableFuture<ContractRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRetrieveResponse>

    /**
     * Retrieves all contracts for a specific customer, including pricing, terms, credits, and
     * commitments. Use this to view a customer's contract history and current agreements for
     * billing management. Returns contract details with optional ledgers and balance information.
     *
     * ⚠️ Note: This is the legacy v1 endpoint - new integrations should use the v2 endpoint for
     * enhanced features.
     */
    fun list(params: ContractListParams): CompletableFuture<ContractListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ContractListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractListResponse>

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
     * Manual ledger entries can be extremely useful for resolving discrepancies in Metronome.
     * However, most corrections to inaccurate billings can be modified upstream of the commit,
     * whether that is via contract editing, rate editing, or other actions that cause an invoice to
     * be recalculated.
     */
    fun addManualBalanceEntry(
        params: ContractAddManualBalanceEntryParams
    ): CompletableFuture<Void?> = addManualBalanceEntry(params, RequestOptions.none())

    /** @see addManualBalanceEntry */
    fun addManualBalanceEntry(
        params: ContractAddManualBalanceEntryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Amendments will be replaced by Contract editing. New clients should implement using the
     * `editContract` endpoint. Read more about the migration to contract editing
     * [here](/guides/implement-metronome/migrate-amendments-to-edits/) and reach out to your
     * Metronome representative for more details. Once contract editing is enabled, access to this
     * endpoint will be removed.
     */
    fun amend(params: ContractAmendParams): CompletableFuture<ContractAmendResponse> =
        amend(params, RequestOptions.none())

    /** @see amend */
    fun amend(
        params: ContractAmendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractAmendResponse>

    /**
     * Permanently end and archive a contract along with all its terms. Any draft invoices will be
     * canceled, and all upcoming scheduled invoices will be voided–also all finalized invoices can
     * optionally be voided. Use this in the event a contract was incorrectly created and needed to
     * be removed from a customer.
     *
     * #### Impact on commits and credits:
     * When archiving a contract, all associated commits and credits are also archived. For prepaid
     * commits with active segments, Metronome automatically generates expiration ledger entries to
     * close out any remaining balances, ensuring accurate accounting of unused prepaid amounts.
     * These ledger entries will appear in the commit's transaction history with type
     * `PREPAID_COMMIT_EXPIRATION`.
     *
     * #### Archived contract visibility:
     * Archived contracts remain accessible for historical reporting and audit purposes. They can be
     * retrieved using the `ListContracts` endpoint by setting the `include_archived` parameter to
     * `true` or in the Metronome UI when the "Show archived" option is enabled.
     */
    fun archive(params: ContractArchiveParams): CompletableFuture<ContractArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: ContractArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractArchiveResponse>

    /**
     * Create historical usage invoices for past billing periods on specific contracts. Use this
     * endpoint to generate retroactive invoices with custom usage line items, quantities, and date
     * ranges. Supports preview mode to validate invoice data before creation. Ideal for billing
     * migrations or correcting past billing periods.
     */
    fun createHistoricalInvoices(
        params: ContractCreateHistoricalInvoicesParams
    ): CompletableFuture<ContractCreateHistoricalInvoicesResponse> =
        createHistoricalInvoices(params, RequestOptions.none())

    /** @see createHistoricalInvoices */
    fun createHistoricalInvoices(
        params: ContractCreateHistoricalInvoicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractCreateHistoricalInvoicesResponse>

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
    fun getNetBalance(
        params: ContractGetNetBalanceParams
    ): CompletableFuture<ContractGetNetBalanceResponse> =
        getNetBalance(params, RequestOptions.none())

    /** @see getNetBalance */
    fun getNetBalance(
        params: ContractGetNetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractGetNetBalanceResponse>

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
    fun listBalances(
        params: ContractListBalancesParams
    ): CompletableFuture<ContractListBalancesPageAsync> =
        listBalances(params, RequestOptions.none())

    /** @see listBalances */
    fun listBalances(
        params: ContractListBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractListBalancesPageAsync>

    /**
     * For a specific customer and contract, get the rates at a specific point in time. This
     * endpoint takes the contract's rate card into consideration, including scheduled changes. It
     * also takes into account overrides on the contract.
     *
     * For example, if you want to show your customer a summary of the prices they are paying,
     * inclusive of any negotiated discounts or promotions, use this endpoint. This endpoint only
     * returns rates that are entitled.
     */
    fun retrieveRateSchedule(
        params: ContractRetrieveRateScheduleParams
    ): CompletableFuture<ContractRetrieveRateScheduleResponse> =
        retrieveRateSchedule(params, RequestOptions.none())

    /** @see retrieveRateSchedule */
    fun retrieveRateSchedule(
        params: ContractRetrieveRateScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRetrieveRateScheduleResponse>

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
    fun retrieveSubscriptionQuantityHistory(
        params: ContractRetrieveSubscriptionQuantityHistoryParams
    ): CompletableFuture<ContractRetrieveSubscriptionQuantityHistoryResponse> =
        retrieveSubscriptionQuantityHistory(params, RequestOptions.none())

    /** @see retrieveSubscriptionQuantityHistory */
    fun retrieveSubscriptionQuantityHistory(
        params: ContractRetrieveSubscriptionQuantityHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRetrieveSubscriptionQuantityHistoryResponse>

    /**
     * Create a new scheduled invoice for Professional Services terms on a contract. This endpoint's
     * availability is dependent on your client's configuration.
     */
    fun scheduleProServicesInvoice(
        params: ContractScheduleProServicesInvoiceParams
    ): CompletableFuture<ContractScheduleProServicesInvoiceResponse> =
        scheduleProServicesInvoice(params, RequestOptions.none())

    /** @see scheduleProServicesInvoice */
    fun scheduleProServicesInvoice(
        params: ContractScheduleProServicesInvoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractScheduleProServicesInvoiceResponse>

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
     * To use usage filters, the `group_key` must be defined on the billable metrics underlying the
     * rate card on the contracts.
     */
    fun setUsageFilter(params: ContractSetUsageFilterParams): CompletableFuture<Void?> =
        setUsageFilter(params, RequestOptions.none())

    /** @see setUsageFilter */
    fun setUsageFilter(
        params: ContractSetUsageFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Update or add an end date to a contract. Ending a contract early will impact draft usage
     * statements, truncate any terms, and remove upcoming scheduled invoices. Moving the date into
     * the future will only extend the contract length. Terms and scheduled invoices are not
     * extended. In-advance subscriptions will not be extended. Use this if a contract's end date
     * has changed or if a perpetual contract ends.
     */
    fun updateEndDate(
        params: ContractUpdateEndDateParams
    ): CompletableFuture<ContractUpdateEndDateResponse> =
        updateEndDate(params, RequestOptions.none())

    /** @see updateEndDate */
    fun updateEndDate(
        params: ContractUpdateEndDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractUpdateEndDateResponse>

    /**
     * A view of [ContractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractServiceAsync.WithRawResponse

        fun products(): ProductServiceAsync.WithRawResponse

        fun rateCards(): RateCardServiceAsync.WithRawResponse

        fun namedSchedules(): NamedScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contracts/create`, but is otherwise the same as
         * [ContractServiceAsync.create].
         */
        fun create(
            params: ContractCreateParams
        ): CompletableFuture<HttpResponseFor<ContractCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/get`, but is otherwise the same as
         * [ContractServiceAsync.retrieve].
         */
        fun retrieve(
            params: ContractRetrieveParams
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/list`, but is otherwise the same as
         * [ContractServiceAsync.list].
         */
        fun list(
            params: ContractListParams
        ): CompletableFuture<HttpResponseFor<ContractListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ContractListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractListResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/addManualBalanceLedgerEntry`, but is
         * otherwise the same as [ContractServiceAsync.addManualBalanceEntry].
         */
        fun addManualBalanceEntry(
            params: ContractAddManualBalanceEntryParams
        ): CompletableFuture<HttpResponse> = addManualBalanceEntry(params, RequestOptions.none())

        /** @see addManualBalanceEntry */
        fun addManualBalanceEntry(
            params: ContractAddManualBalanceEntryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/amend`, but is otherwise the same as
         * [ContractServiceAsync.amend].
         */
        fun amend(
            params: ContractAmendParams
        ): CompletableFuture<HttpResponseFor<ContractAmendResponse>> =
            amend(params, RequestOptions.none())

        /** @see amend */
        fun amend(
            params: ContractAmendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractAmendResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/archive`, but is otherwise the same
         * as [ContractServiceAsync.archive].
         */
        fun archive(
            params: ContractArchiveParams
        ): CompletableFuture<HttpResponseFor<ContractArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: ContractArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractArchiveResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/createHistoricalInvoices`, but is
         * otherwise the same as [ContractServiceAsync.createHistoricalInvoices].
         */
        fun createHistoricalInvoices(
            params: ContractCreateHistoricalInvoicesParams
        ): CompletableFuture<HttpResponseFor<ContractCreateHistoricalInvoicesResponse>> =
            createHistoricalInvoices(params, RequestOptions.none())

        /** @see createHistoricalInvoices */
        fun createHistoricalInvoices(
            params: ContractCreateHistoricalInvoicesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractCreateHistoricalInvoicesResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/customerBalances/getNetBalance`, but
         * is otherwise the same as [ContractServiceAsync.getNetBalance].
         */
        fun getNetBalance(
            params: ContractGetNetBalanceParams
        ): CompletableFuture<HttpResponseFor<ContractGetNetBalanceResponse>> =
            getNetBalance(params, RequestOptions.none())

        /** @see getNetBalance */
        fun getNetBalance(
            params: ContractGetNetBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractGetNetBalanceResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/customerBalances/list`, but is
         * otherwise the same as [ContractServiceAsync.listBalances].
         */
        fun listBalances(
            params: ContractListBalancesParams
        ): CompletableFuture<HttpResponseFor<ContractListBalancesPageAsync>> =
            listBalances(params, RequestOptions.none())

        /** @see listBalances */
        fun listBalances(
            params: ContractListBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractListBalancesPageAsync>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/getContractRateSchedule`, but is
         * otherwise the same as [ContractServiceAsync.retrieveRateSchedule].
         */
        fun retrieveRateSchedule(
            params: ContractRetrieveRateScheduleParams
        ): CompletableFuture<HttpResponseFor<ContractRetrieveRateScheduleResponse>> =
            retrieveRateSchedule(params, RequestOptions.none())

        /** @see retrieveRateSchedule */
        fun retrieveRateSchedule(
            params: ContractRetrieveRateScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractRetrieveRateScheduleResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/getSubscriptionQuantityHistory`, but
         * is otherwise the same as [ContractServiceAsync.retrieveSubscriptionQuantityHistory].
         */
        fun retrieveSubscriptionQuantityHistory(
            params: ContractRetrieveSubscriptionQuantityHistoryParams
        ): CompletableFuture<HttpResponseFor<ContractRetrieveSubscriptionQuantityHistoryResponse>> =
            retrieveSubscriptionQuantityHistory(params, RequestOptions.none())

        /** @see retrieveSubscriptionQuantityHistory */
        fun retrieveSubscriptionQuantityHistory(
            params: ContractRetrieveSubscriptionQuantityHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractRetrieveSubscriptionQuantityHistoryResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/scheduleProServicesInvoice`, but is
         * otherwise the same as [ContractServiceAsync.scheduleProServicesInvoice].
         */
        fun scheduleProServicesInvoice(
            params: ContractScheduleProServicesInvoiceParams
        ): CompletableFuture<HttpResponseFor<ContractScheduleProServicesInvoiceResponse>> =
            scheduleProServicesInvoice(params, RequestOptions.none())

        /** @see scheduleProServicesInvoice */
        fun scheduleProServicesInvoice(
            params: ContractScheduleProServicesInvoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractScheduleProServicesInvoiceResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/setUsageFilter`, but is otherwise the
         * same as [ContractServiceAsync.setUsageFilter].
         */
        fun setUsageFilter(params: ContractSetUsageFilterParams): CompletableFuture<HttpResponse> =
            setUsageFilter(params, RequestOptions.none())

        /** @see setUsageFilter */
        fun setUsageFilter(
            params: ContractSetUsageFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/contracts/updateEndDate`, but is otherwise the
         * same as [ContractServiceAsync.updateEndDate].
         */
        fun updateEndDate(
            params: ContractUpdateEndDateParams
        ): CompletableFuture<HttpResponseFor<ContractUpdateEndDateResponse>> =
            updateEndDate(params, RequestOptions.none())

        /** @see updateEndDate */
        fun updateEndDate(
            params: ContractUpdateEndDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractUpdateEndDateResponse>>
    }
}
