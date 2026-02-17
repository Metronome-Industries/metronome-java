// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Contracts define a customer's products, pricing, discounts, access duration, and billing
 * configuration. Contracts serve as the central billing agreement for both PLG and Enterprise
 * customers, you can automatically customers access to your products and services directly from
 * your product or CRM.
 *
 * ### Use this endpoint to:
 * - PLG onboarding: Automatically provision new self-serve customers with contracts when they sign
 *   up.
 * - Enterprise sales: Push negotiated contracts from Salesforce with custom pricing and commitments
 * - Promotional pricing: Implement time-limited discounts and free trials through overrides
 *
 * ### Key components:
 *
 * #### Contract Term and Billing Schedule
 * - Set contract duration using `starting_at` and `ending_before` fields. PLG contracts typically
 *   use perpetual agreements (no end date), while Enterprise contracts have fixed end dates which
 *   can be edited over time in the case of co-term upsells.
 *
 * #### Rate Card
 *
 * If you are offering usage based pricing, you can set a rate card for the contract to reference
 * through `rate_card_id` or `rate_card_alias`. The rate card is a store of all of your usage based
 * products and their centralized pricing. Any new products or price changes on the rate card can be
 * set to automatically propagate to all associated contracts - this ensures consistent pricing and
 * product launches flow to contracts without manual updates and migrations. The
 * `usage_statement_schedule` determines the cadence on which Metronome will finalize a usage
 * invoice for the customer. This defaults to monthly on the 1st, with options for custom dates,
 * quarterly, or annual cadences. Note: Most usage based billing companies align usage statements to
 * be evaluated aligned to the first of the month. Read more about
 * [Rate Cards](https://docs.metronome.com/pricing-packaging/create-manage-rate-cards/).
 *
 * #### Overrides and discounts
 *
 * Customize pricing on the contract through time-bounded overrides that can target specific
 * products, product families, or complex usage scenarios. Overrides enable two key capabilities:
 * - Discounts: Apply percentage discounts, fixed rate reductions, or quantity-based pricing tiers
 * - Entitlements: Provide special pricing or access to specific products for negotiated deals
 *
 * Read more about
 * [Contract Overrides](https://docs.metronome.com/manage-product-access/add-contract-override/).
 *
 * #### Commits and Credits
 *
 * Using commits, configure prepaid or postpaid spending commitments where customers promise to
 * spend a certain amount over the contract period paid in advance or in arrears. Use credits to
 * provide free spending allowances. Under the hood these are the same mechanisms, however, credits
 * are typically offered for free (SLA or promotional) or as a part of an allotment associated with
 * a Subscription.
 *
 * In Metronome, you can set commits and credits to only be applicable for a subset of usage. Use
 * `applicable_product_ids` or `applicable_product_tags` to create product or product-family
 * specific commits or credits, or you can build complex boolean logic specifiers to target usage
 * based on pricing and presentation group values using `override_specifiers`.
 *
 * These objects can also also be configured to have a recurrence schedule to easily model customer
 * packaging which includes recurring monthly or quarterly allotments.
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
 * select which subscription is applicable to add to each contract. When you add a subscription to a
 * contract you need to:
 * - Define whether the subscription is paid for in-advance or in-arrears (`collection_schedule`)
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
 * trigger an invoice to cover current charges whenever the threshold is reached or you can ensure
 * the customer maintains a minimum prepaid balance using the `prepaid_balance_configuration`.
 *
 * Read more about
 * [Spend Threshold](https://docs.metronome.com/manage-product-access/spend-thresholds/) and
 * [Prepaid Balance Thresholds](https://docs.metronome.com/manage-product-access/prepaid-balance-thresholds/).
 *
 * ### Usage guidelines:
 * - You can always
 *   [Edit Contracts](https://docs.metronome.com/manage-product-access/edit-contract/) after it has
 *   been created, using the `editContract` endpoint. Metronome keeps track of all edits, both in
 *   the audit log and over the `getEditHistory` endpoint.
 * - Customers in Metronome can have multiple concurrent contracts at one time. Use `usage_filters`
 *   to route the correct usage to each contract.
 *   [Read more about usage filters](https://docs.metronome.com/manage-product-access/provision-customer/#create-a-usage-filter).
 */
class V1ContractCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = body.customerId()

    /** inclusive contract start time */
    fun startingAt(): OffsetDateTime = body.startingAt()

    /**
     * The billing provider configuration associated with a contract. Provide either an ID or the
     * provider and delivery method.
     */
    fun billingProviderConfiguration(): Optional<BillingProviderConfiguration> =
        body.billingProviderConfiguration()

    fun commits(): Optional<List<Commit>> = body.commits()

    fun credits(): Optional<List<Credit>> = body.credits()

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /** This field's availability is dependent on your client's configuration. */
    fun discounts(): Optional<List<Discount>> = body.discounts()

    /** exclusive contract end time */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    fun hierarchyConfiguration(): Optional<HierarchyConfiguration> = body.hierarchyConfiguration()

    /**
     * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
     * automatically. EXPLICIT prioritization requires specifying priorities for each multiplier;
     * the one with the lowest priority value will be prioritized first. If tiered overrides are
     * used, prioritization must be explicit.
     */
    fun multiplierOverridePrioritization(): Optional<MultiplierOverridePrioritization> =
        body.multiplierOverridePrioritization()

    fun name(): Optional<String> = body.name()

    fun netPaymentTermsDays(): Optional<Double> = body.netPaymentTermsDays()

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> = body.netsuiteSalesOrderId()

    fun overrides(): Optional<List<Override>> = body.overrides()

    /**
     * Selects the package linked to the specified alias as of the contract's start date. Mutually
     * exclusive with package_id.
     */
    fun packageAlias(): Optional<String> = body.packageAlias()

    /**
     * If provided, provisions a customer on a package instead of creating a traditional contract.
     * When specified, only customer_id, starting_at, package_id, and uniqueness_key are allowed.
     */
    fun packageId(): Optional<String> = body.packageId()

    fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfiguration> =
        body.prepaidBalanceThresholdConfiguration()

    /** This field's availability is dependent on your client's configuration. */
    fun professionalServices(): Optional<List<ProfessionalService>> = body.professionalServices()

    /** Selects the rate card linked to the specified alias as of the contract's start date. */
    fun rateCardAlias(): Optional<String> = body.rateCardAlias()

    fun rateCardId(): Optional<String> = body.rateCardId()

    fun recurringCommits(): Optional<List<RecurringCommit>> = body.recurringCommits()

    fun recurringCredits(): Optional<List<RecurringCredit>> = body.recurringCredits()

    /** This field's availability is dependent on your client's configuration. */
    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> = body.resellerRoyalties()

    /**
     * The revenue system configuration associated with a contract. Provide either an ID or the
     * provider and delivery method.
     */
    fun revenueSystemConfiguration(): Optional<RevenueSystemConfiguration> =
        body.revenueSystemConfiguration()

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> = body.salesforceOpportunityId()

    fun scheduledCharges(): Optional<List<ScheduledCharge>> = body.scheduledCharges()

    /**
     * Determines which scheduled and commit charges to consolidate onto the Contract's usage
     * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
     * consolidation to occur. This field cannot be modified after a Contract has been created. If
     * this field is omitted, charges will appear on a separate invoice from usage charges.
     */
    fun scheduledChargesOnUsageInvoices(): Optional<ScheduledChargesOnUsageInvoices> =
        body.scheduledChargesOnUsageInvoices()

    fun spendThresholdConfiguration(): Optional<SpendThresholdConfiguration> =
        body.spendThresholdConfiguration()

    /**
     * Optional list of
     * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/) to add
     * to the contract.
     */
    fun subscriptions(): Optional<List<Subscription>> = body.subscriptions()

    /** This field's availability is dependent on your client's configuration. */
    fun totalContractValue(): Optional<Double> = body.totalContractValue()

    fun transition(): Optional<Transition> = body.transition()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    fun usageFilter(): Optional<BaseUsageFilter> = body.usageFilter()

    fun usageStatementSchedule(): Optional<UsageStatementSchedule> = body.usageStatementSchedule()

    fun _customerId(): JsonField<String> = body._customerId()

    /** inclusive contract start time */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    /**
     * The billing provider configuration associated with a contract. Provide either an ID or the
     * provider and delivery method.
     */
    fun _billingProviderConfiguration(): JsonField<BillingProviderConfiguration> =
        body._billingProviderConfiguration()

    fun _commits(): JsonField<List<Commit>> = body._commits()

    fun _credits(): JsonField<List<Credit>> = body._credits()

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /** This field's availability is dependent on your client's configuration. */
    fun _discounts(): JsonField<List<Discount>> = body._discounts()

    /** exclusive contract end time */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    fun _hierarchyConfiguration(): JsonField<HierarchyConfiguration> =
        body._hierarchyConfiguration()

    /**
     * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
     * automatically. EXPLICIT prioritization requires specifying priorities for each multiplier;
     * the one with the lowest priority value will be prioritized first. If tiered overrides are
     * used, prioritization must be explicit.
     */
    fun _multiplierOverridePrioritization(): JsonField<MultiplierOverridePrioritization> =
        body._multiplierOverridePrioritization()

    fun _name(): JsonField<String> = body._name()

    fun _netPaymentTermsDays(): JsonField<Double> = body._netPaymentTermsDays()

    /** This field's availability is dependent on your client's configuration. */
    fun _netsuiteSalesOrderId(): JsonField<String> = body._netsuiteSalesOrderId()

    fun _overrides(): JsonField<List<Override>> = body._overrides()

    /**
     * Selects the package linked to the specified alias as of the contract's start date. Mutually
     * exclusive with package_id.
     */
    fun _packageAlias(): JsonField<String> = body._packageAlias()

    /**
     * If provided, provisions a customer on a package instead of creating a traditional contract.
     * When specified, only customer_id, starting_at, package_id, and uniqueness_key are allowed.
     */
    fun _packageId(): JsonField<String> = body._packageId()

    fun _prepaidBalanceThresholdConfiguration(): JsonField<PrepaidBalanceThresholdConfiguration> =
        body._prepaidBalanceThresholdConfiguration()

    /** This field's availability is dependent on your client's configuration. */
    fun _professionalServices(): JsonField<List<ProfessionalService>> = body._professionalServices()

    /** Selects the rate card linked to the specified alias as of the contract's start date. */
    fun _rateCardAlias(): JsonField<String> = body._rateCardAlias()

    fun _rateCardId(): JsonField<String> = body._rateCardId()

    fun _recurringCommits(): JsonField<List<RecurringCommit>> = body._recurringCommits()

    fun _recurringCredits(): JsonField<List<RecurringCredit>> = body._recurringCredits()

    /** This field's availability is dependent on your client's configuration. */
    fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = body._resellerRoyalties()

    /**
     * The revenue system configuration associated with a contract. Provide either an ID or the
     * provider and delivery method.
     */
    fun _revenueSystemConfiguration(): JsonField<RevenueSystemConfiguration> =
        body._revenueSystemConfiguration()

    /** This field's availability is dependent on your client's configuration. */
    fun _salesforceOpportunityId(): JsonField<String> = body._salesforceOpportunityId()

    fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = body._scheduledCharges()

    /**
     * Determines which scheduled and commit charges to consolidate onto the Contract's usage
     * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
     * consolidation to occur. This field cannot be modified after a Contract has been created. If
     * this field is omitted, charges will appear on a separate invoice from usage charges.
     */
    fun _scheduledChargesOnUsageInvoices(): JsonField<ScheduledChargesOnUsageInvoices> =
        body._scheduledChargesOnUsageInvoices()

    fun _spendThresholdConfiguration(): JsonField<SpendThresholdConfiguration> =
        body._spendThresholdConfiguration()

    /**
     * Optional list of
     * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/) to add
     * to the contract.
     */
    fun _subscriptions(): JsonField<List<Subscription>> = body._subscriptions()

    /** This field's availability is dependent on your client's configuration. */
    fun _totalContractValue(): JsonField<Double> = body._totalContractValue()

    fun _transition(): JsonField<Transition> = body._transition()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    fun _usageFilter(): JsonField<BaseUsageFilter> = body._usageFilter()

    fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> =
        body._usageStatementSchedule()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("billing_provider_configuration")
        @ExcludeMissing
        private val billingProviderConfiguration: JsonField<BillingProviderConfiguration> =
            JsonMissing.of(),
        @JsonProperty("commits")
        @ExcludeMissing
        private val commits: JsonField<List<Commit>> = JsonMissing.of(),
        @JsonProperty("credits")
        @ExcludeMissing
        private val credits: JsonField<List<Credit>> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        private val hierarchyConfiguration: JsonField<HierarchyConfiguration> = JsonMissing.of(),
        @JsonProperty("multiplier_override_prioritization")
        @ExcludeMissing
        private val multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization> =
            JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        private val netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overrides")
        @ExcludeMissing
        private val overrides: JsonField<List<Override>> = JsonMissing.of(),
        @JsonProperty("package_alias")
        @ExcludeMissing
        private val packageAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("package_id")
        @ExcludeMissing
        private val packageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prepaid_balance_threshold_configuration")
        @ExcludeMissing
        private val prepaidBalanceThresholdConfiguration:
            JsonField<PrepaidBalanceThresholdConfiguration> =
            JsonMissing.of(),
        @JsonProperty("professional_services")
        @ExcludeMissing
        private val professionalServices: JsonField<List<ProfessionalService>> = JsonMissing.of(),
        @JsonProperty("rate_card_alias")
        @ExcludeMissing
        private val rateCardAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        private val rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recurring_commits")
        @ExcludeMissing
        private val recurringCommits: JsonField<List<RecurringCommit>> = JsonMissing.of(),
        @JsonProperty("recurring_credits")
        @ExcludeMissing
        private val recurringCredits: JsonField<List<RecurringCredit>> = JsonMissing.of(),
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        private val resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of(),
        @JsonProperty("revenue_system_configuration")
        @ExcludeMissing
        private val revenueSystemConfiguration: JsonField<RevenueSystemConfiguration> =
            JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        private val scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
        @JsonProperty("scheduled_charges_on_usage_invoices")
        @ExcludeMissing
        private val scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
            JsonMissing.of(),
        @JsonProperty("spend_threshold_configuration")
        @ExcludeMissing
        private val spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
            JsonMissing.of(),
        @JsonProperty("subscriptions")
        @ExcludeMissing
        private val subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
        @JsonProperty("total_contract_value")
        @ExcludeMissing
        private val totalContractValue: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transition")
        @ExcludeMissing
        private val transition: JsonField<Transition> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage_filter")
        @ExcludeMissing
        private val usageFilter: JsonField<BaseUsageFilter> = JsonMissing.of(),
        @JsonProperty("usage_statement_schedule")
        @ExcludeMissing
        private val usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun customerId(): String = customerId.getRequired("customer_id")

        /** inclusive contract start time */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * The billing provider configuration associated with a contract. Provide either an ID or
         * the provider and delivery method.
         */
        fun billingProviderConfiguration(): Optional<BillingProviderConfiguration> =
            Optional.ofNullable(
                billingProviderConfiguration.getNullable("billing_provider_configuration")
            )

        fun commits(): Optional<List<Commit>> = Optional.ofNullable(commits.getNullable("commits"))

        fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits.getNullable("credits"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(): Optional<List<Discount>> =
            Optional.ofNullable(discounts.getNullable("discounts"))

        /** exclusive contract end time */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun hierarchyConfiguration(): Optional<HierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first. If tiered
         * overrides are used, prioritization must be explicit.
         */
        fun multiplierOverridePrioritization(): Optional<MultiplierOverridePrioritization> =
            Optional.ofNullable(
                multiplierOverridePrioritization.getNullable("multiplier_override_prioritization")
            )

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        fun netPaymentTermsDays(): Optional<Double> =
            Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        fun overrides(): Optional<List<Override>> =
            Optional.ofNullable(overrides.getNullable("overrides"))

        /**
         * Selects the package linked to the specified alias as of the contract's start date.
         * Mutually exclusive with package_id.
         */
        fun packageAlias(): Optional<String> =
            Optional.ofNullable(packageAlias.getNullable("package_alias"))

        /**
         * If provided, provisions a customer on a package instead of creating a traditional
         * contract. When specified, only customer_id, starting_at, package_id, and uniqueness_key
         * are allowed.
         */
        fun packageId(): Optional<String> = Optional.ofNullable(packageId.getNullable("package_id"))

        fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfiguration> =
            Optional.ofNullable(
                prepaidBalanceThresholdConfiguration.getNullable(
                    "prepaid_balance_threshold_configuration"
                )
            )

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(): Optional<List<ProfessionalService>> =
            Optional.ofNullable(professionalServices.getNullable("professional_services"))

        /** Selects the rate card linked to the specified alias as of the contract's start date. */
        fun rateCardAlias(): Optional<String> =
            Optional.ofNullable(rateCardAlias.getNullable("rate_card_alias"))

        fun rateCardId(): Optional<String> =
            Optional.ofNullable(rateCardId.getNullable("rate_card_id"))

        fun recurringCommits(): Optional<List<RecurringCommit>> =
            Optional.ofNullable(recurringCommits.getNullable("recurring_commits"))

        fun recurringCredits(): Optional<List<RecurringCredit>> =
            Optional.ofNullable(recurringCredits.getNullable("recurring_credits"))

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
            Optional.ofNullable(resellerRoyalties.getNullable("reseller_royalties"))

        /**
         * The revenue system configuration associated with a contract. Provide either an ID or the
         * provider and delivery method.
         */
        fun revenueSystemConfiguration(): Optional<RevenueSystemConfiguration> =
            Optional.ofNullable(
                revenueSystemConfiguration.getNullable("revenue_system_configuration")
            )

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

        fun scheduledCharges(): Optional<List<ScheduledCharge>> =
            Optional.ofNullable(scheduledCharges.getNullable("scheduled_charges"))

        /**
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         */
        fun scheduledChargesOnUsageInvoices(): Optional<ScheduledChargesOnUsageInvoices> =
            Optional.ofNullable(
                scheduledChargesOnUsageInvoices.getNullable("scheduled_charges_on_usage_invoices")
            )

        fun spendThresholdConfiguration(): Optional<SpendThresholdConfiguration> =
            Optional.ofNullable(
                spendThresholdConfiguration.getNullable("spend_threshold_configuration")
            )

        /**
         * Optional list of
         * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/) to
         * add to the contract.
         */
        fun subscriptions(): Optional<List<Subscription>> =
            Optional.ofNullable(subscriptions.getNullable("subscriptions"))

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(): Optional<Double> =
            Optional.ofNullable(totalContractValue.getNullable("total_contract_value"))

        fun transition(): Optional<Transition> =
            Optional.ofNullable(transition.getNullable("transition"))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        fun usageFilter(): Optional<BaseUsageFilter> =
            Optional.ofNullable(usageFilter.getNullable("usage_filter"))

        fun usageStatementSchedule(): Optional<UsageStatementSchedule> =
            Optional.ofNullable(usageStatementSchedule.getNullable("usage_statement_schedule"))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** inclusive contract start time */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * The billing provider configuration associated with a contract. Provide either an ID or
         * the provider and delivery method.
         */
        @JsonProperty("billing_provider_configuration")
        @ExcludeMissing
        fun _billingProviderConfiguration(): JsonField<BillingProviderConfiguration> =
            billingProviderConfiguration

        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

        /** exclusive contract end time */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<HierarchyConfiguration> = hierarchyConfiguration

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first. If tiered
         * overrides are used, prioritization must be explicit.
         */
        @JsonProperty("multiplier_override_prioritization")
        @ExcludeMissing
        fun _multiplierOverridePrioritization(): JsonField<MultiplierOverridePrioritization> =
            multiplierOverridePrioritization

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonProperty("overrides")
        @ExcludeMissing
        fun _overrides(): JsonField<List<Override>> = overrides

        /**
         * Selects the package linked to the specified alias as of the contract's start date.
         * Mutually exclusive with package_id.
         */
        @JsonProperty("package_alias")
        @ExcludeMissing
        fun _packageAlias(): JsonField<String> = packageAlias

        /**
         * If provided, provisions a customer on a package instead of creating a traditional
         * contract. When specified, only customer_id, starting_at, package_id, and uniqueness_key
         * are allowed.
         */
        @JsonProperty("package_id") @ExcludeMissing fun _packageId(): JsonField<String> = packageId

        @JsonProperty("prepaid_balance_threshold_configuration")
        @ExcludeMissing
        fun _prepaidBalanceThresholdConfiguration():
            JsonField<PrepaidBalanceThresholdConfiguration> = prepaidBalanceThresholdConfiguration

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        @ExcludeMissing
        fun _professionalServices(): JsonField<List<ProfessionalService>> = professionalServices

        /** Selects the rate card linked to the specified alias as of the contract's start date. */
        @JsonProperty("rate_card_alias")
        @ExcludeMissing
        fun _rateCardAlias(): JsonField<String> = rateCardAlias

        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

        @JsonProperty("recurring_commits")
        @ExcludeMissing
        fun _recurringCommits(): JsonField<List<RecurringCommit>> = recurringCommits

        @JsonProperty("recurring_credits")
        @ExcludeMissing
        fun _recurringCredits(): JsonField<List<RecurringCredit>> = recurringCredits

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = resellerRoyalties

        /**
         * The revenue system configuration associated with a contract. Provide either an ID or the
         * provider and delivery method.
         */
        @JsonProperty("revenue_system_configuration")
        @ExcludeMissing
        fun _revenueSystemConfiguration(): JsonField<RevenueSystemConfiguration> =
            revenueSystemConfiguration

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

        /**
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         */
        @JsonProperty("scheduled_charges_on_usage_invoices")
        @ExcludeMissing
        fun _scheduledChargesOnUsageInvoices(): JsonField<ScheduledChargesOnUsageInvoices> =
            scheduledChargesOnUsageInvoices

        @JsonProperty("spend_threshold_configuration")
        @ExcludeMissing
        fun _spendThresholdConfiguration(): JsonField<SpendThresholdConfiguration> =
            spendThresholdConfiguration

        /**
         * Optional list of
         * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/) to
         * add to the contract.
         */
        @JsonProperty("subscriptions")
        @ExcludeMissing
        fun _subscriptions(): JsonField<List<Subscription>> = subscriptions

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("total_contract_value")
        @ExcludeMissing
        fun _totalContractValue(): JsonField<Double> = totalContractValue

        @JsonProperty("transition")
        @ExcludeMissing
        fun _transition(): JsonField<Transition> = transition

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        @JsonProperty("usage_filter")
        @ExcludeMissing
        fun _usageFilter(): JsonField<BaseUsageFilter> = usageFilter

        @JsonProperty("usage_statement_schedule")
        @ExcludeMissing
        fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> = usageStatementSchedule

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerId()
            startingAt()
            billingProviderConfiguration().ifPresent { it.validate() }
            commits().ifPresent { it.forEach { it.validate() } }
            credits().ifPresent { it.forEach { it.validate() } }
            customFields().ifPresent { it.validate() }
            discounts().ifPresent { it.forEach { it.validate() } }
            endingBefore()
            hierarchyConfiguration().ifPresent { it.validate() }
            multiplierOverridePrioritization()
            name()
            netPaymentTermsDays()
            netsuiteSalesOrderId()
            overrides().ifPresent { it.forEach { it.validate() } }
            packageAlias()
            packageId()
            prepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
            professionalServices().ifPresent { it.forEach { it.validate() } }
            rateCardAlias()
            rateCardId()
            recurringCommits().ifPresent { it.forEach { it.validate() } }
            recurringCredits().ifPresent { it.forEach { it.validate() } }
            resellerRoyalties().ifPresent { it.forEach { it.validate() } }
            revenueSystemConfiguration().ifPresent { it.validate() }
            salesforceOpportunityId()
            scheduledCharges().ifPresent { it.forEach { it.validate() } }
            scheduledChargesOnUsageInvoices()
            spendThresholdConfiguration().ifPresent { it.validate() }
            subscriptions().ifPresent { it.forEach { it.validate() } }
            totalContractValue()
            transition().ifPresent { it.validate() }
            uniquenessKey()
            usageFilter().ifPresent { it.validate() }
            usageStatementSchedule().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var billingProviderConfiguration: JsonField<BillingProviderConfiguration> =
                JsonMissing.of()
            private var commits: JsonField<MutableList<Commit>>? = null
            private var credits: JsonField<MutableList<Credit>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var discounts: JsonField<MutableList<Discount>>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<HierarchyConfiguration> = JsonMissing.of()
            private var multiplierOverridePrioritization:
                JsonField<MultiplierOverridePrioritization> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var overrides: JsonField<MutableList<Override>>? = null
            private var packageAlias: JsonField<String> = JsonMissing.of()
            private var packageId: JsonField<String> = JsonMissing.of()
            private var prepaidBalanceThresholdConfiguration:
                JsonField<PrepaidBalanceThresholdConfiguration> =
                JsonMissing.of()
            private var professionalServices: JsonField<MutableList<ProfessionalService>>? = null
            private var rateCardAlias: JsonField<String> = JsonMissing.of()
            private var rateCardId: JsonField<String> = JsonMissing.of()
            private var recurringCommits: JsonField<MutableList<RecurringCommit>>? = null
            private var recurringCredits: JsonField<MutableList<RecurringCredit>>? = null
            private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
            private var revenueSystemConfiguration: JsonField<RevenueSystemConfiguration> =
                JsonMissing.of()
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
            private var scheduledChargesOnUsageInvoices:
                JsonField<ScheduledChargesOnUsageInvoices> =
                JsonMissing.of()
            private var spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
                JsonMissing.of()
            private var subscriptions: JsonField<MutableList<Subscription>>? = null
            private var totalContractValue: JsonField<Double> = JsonMissing.of()
            private var transition: JsonField<Transition> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var usageFilter: JsonField<BaseUsageFilter> = JsonMissing.of()
            private var usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                startingAt = body.startingAt
                billingProviderConfiguration = body.billingProviderConfiguration
                commits = body.commits.map { it.toMutableList() }
                credits = body.credits.map { it.toMutableList() }
                customFields = body.customFields
                discounts = body.discounts.map { it.toMutableList() }
                endingBefore = body.endingBefore
                hierarchyConfiguration = body.hierarchyConfiguration
                multiplierOverridePrioritization = body.multiplierOverridePrioritization
                name = body.name
                netPaymentTermsDays = body.netPaymentTermsDays
                netsuiteSalesOrderId = body.netsuiteSalesOrderId
                overrides = body.overrides.map { it.toMutableList() }
                packageAlias = body.packageAlias
                packageId = body.packageId
                prepaidBalanceThresholdConfiguration = body.prepaidBalanceThresholdConfiguration
                professionalServices = body.professionalServices.map { it.toMutableList() }
                rateCardAlias = body.rateCardAlias
                rateCardId = body.rateCardId
                recurringCommits = body.recurringCommits.map { it.toMutableList() }
                recurringCredits = body.recurringCredits.map { it.toMutableList() }
                resellerRoyalties = body.resellerRoyalties.map { it.toMutableList() }
                revenueSystemConfiguration = body.revenueSystemConfiguration
                salesforceOpportunityId = body.salesforceOpportunityId
                scheduledCharges = body.scheduledCharges.map { it.toMutableList() }
                scheduledChargesOnUsageInvoices = body.scheduledChargesOnUsageInvoices
                spendThresholdConfiguration = body.spendThresholdConfiguration
                subscriptions = body.subscriptions.map { it.toMutableList() }
                totalContractValue = body.totalContractValue
                transition = body.transition
                uniquenessKey = body.uniquenessKey
                usageFilter = body.usageFilter
                usageStatementSchedule = body.usageStatementSchedule
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** inclusive contract start time */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** inclusive contract start time */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * The billing provider configuration associated with a contract. Provide either an ID
             * or the provider and delivery method.
             */
            fun billingProviderConfiguration(
                billingProviderConfiguration: BillingProviderConfiguration
            ) = billingProviderConfiguration(JsonField.of(billingProviderConfiguration))

            /**
             * The billing provider configuration associated with a contract. Provide either an ID
             * or the provider and delivery method.
             */
            fun billingProviderConfiguration(
                billingProviderConfiguration: JsonField<BillingProviderConfiguration>
            ) = apply { this.billingProviderConfiguration = billingProviderConfiguration }

            fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

            fun commits(commits: JsonField<List<Commit>>) = apply {
                this.commits = commits.map { it.toMutableList() }
            }

            fun addCommit(commit: Commit) = apply {
                commits =
                    (commits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(commit)
                    }
            }

            fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

            fun credits(credits: JsonField<List<Credit>>) = apply {
                this.credits = credits.map { it.toMutableList() }
            }

            fun addCredit(credit: Credit) = apply {
                credits =
                    (credits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(credit)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun addDiscount(discount: Discount) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(discount)
                    }
            }

            /** exclusive contract end time */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** exclusive contract end time */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun hierarchyConfiguration(hierarchyConfiguration: HierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            fun hierarchyConfiguration(hierarchyConfiguration: JsonField<HierarchyConfiguration>) =
                apply {
                    this.hierarchyConfiguration = hierarchyConfiguration
                }

            /**
             * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
             * automatically. EXPLICIT prioritization requires specifying priorities for each
             * multiplier; the one with the lowest priority value will be prioritized first. If
             * tiered overrides are used, prioritization must be explicit.
             */
            fun multiplierOverridePrioritization(
                multiplierOverridePrioritization: MultiplierOverridePrioritization
            ) = multiplierOverridePrioritization(JsonField.of(multiplierOverridePrioritization))

            /**
             * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
             * automatically. EXPLICIT prioritization requires specifying priorities for each
             * multiplier; the one with the lowest priority value will be prioritized first. If
             * tiered overrides are used, prioritization must be explicit.
             */
            fun multiplierOverridePrioritization(
                multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization>
            ) = apply { this.multiplierOverridePrioritization = multiplierOverridePrioritization }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun netPaymentTermsDays(netPaymentTermsDays: Double) =
                netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

            fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
                this.netPaymentTermsDays = netPaymentTermsDays
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun overrides(overrides: List<Override>) = overrides(JsonField.of(overrides))

            fun overrides(overrides: JsonField<List<Override>>) = apply {
                this.overrides = overrides.map { it.toMutableList() }
            }

            fun addOverride(override: Override) = apply {
                overrides =
                    (overrides ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(override)
                    }
            }

            /**
             * Selects the package linked to the specified alias as of the contract's start date.
             * Mutually exclusive with package_id.
             */
            fun packageAlias(packageAlias: String) = packageAlias(JsonField.of(packageAlias))

            /**
             * Selects the package linked to the specified alias as of the contract's start date.
             * Mutually exclusive with package_id.
             */
            fun packageAlias(packageAlias: JsonField<String>) = apply {
                this.packageAlias = packageAlias
            }

            /**
             * If provided, provisions a customer on a package instead of creating a traditional
             * contract. When specified, only customer_id, starting_at, package_id, and
             * uniqueness_key are allowed.
             */
            fun packageId(packageId: String) = packageId(JsonField.of(packageId))

            /**
             * If provided, provisions a customer on a package instead of creating a traditional
             * contract. When specified, only customer_id, starting_at, package_id, and
             * uniqueness_key are allowed.
             */
            fun packageId(packageId: JsonField<String>) = apply { this.packageId = packageId }

            fun prepaidBalanceThresholdConfiguration(
                prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfiguration
            ) =
                prepaidBalanceThresholdConfiguration(
                    JsonField.of(prepaidBalanceThresholdConfiguration)
                )

            fun prepaidBalanceThresholdConfiguration(
                prepaidBalanceThresholdConfiguration:
                    JsonField<PrepaidBalanceThresholdConfiguration>
            ) = apply {
                this.prepaidBalanceThresholdConfiguration = prepaidBalanceThresholdConfiguration
            }

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: List<ProfessionalService>) =
                professionalServices(JsonField.of(professionalServices))

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: JsonField<List<ProfessionalService>>) =
                apply {
                    this.professionalServices = professionalServices.map { it.toMutableList() }
                }

            /** This field's availability is dependent on your client's configuration. */
            fun addProfessionalService(professionalService: ProfessionalService) = apply {
                professionalServices =
                    (professionalServices ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(professionalService)
                    }
            }

            /**
             * Selects the rate card linked to the specified alias as of the contract's start date.
             */
            fun rateCardAlias(rateCardAlias: String) = rateCardAlias(JsonField.of(rateCardAlias))

            /**
             * Selects the rate card linked to the specified alias as of the contract's start date.
             */
            fun rateCardAlias(rateCardAlias: JsonField<String>) = apply {
                this.rateCardAlias = rateCardAlias
            }

            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

            fun recurringCommits(recurringCommits: List<RecurringCommit>) =
                recurringCommits(JsonField.of(recurringCommits))

            fun recurringCommits(recurringCommits: JsonField<List<RecurringCommit>>) = apply {
                this.recurringCommits = recurringCommits.map { it.toMutableList() }
            }

            fun addRecurringCommit(recurringCommit: RecurringCommit) = apply {
                recurringCommits =
                    (recurringCommits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(recurringCommit)
                    }
            }

            fun recurringCredits(recurringCredits: List<RecurringCredit>) =
                recurringCredits(JsonField.of(recurringCredits))

            fun recurringCredits(recurringCredits: JsonField<List<RecurringCredit>>) = apply {
                this.recurringCredits = recurringCredits.map { it.toMutableList() }
            }

            fun addRecurringCredit(recurringCredit: RecurringCredit) = apply {
                recurringCredits =
                    (recurringCredits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(recurringCredit)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) =
                resellerRoyalties(JsonField.of(resellerRoyalties))

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
                this.resellerRoyalties = resellerRoyalties.map { it.toMutableList() }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
                resellerRoyalties =
                    (resellerRoyalties ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(resellerRoyalty)
                    }
            }

            /**
             * The revenue system configuration associated with a contract. Provide either an ID or
             * the provider and delivery method.
             */
            fun revenueSystemConfiguration(revenueSystemConfiguration: RevenueSystemConfiguration) =
                revenueSystemConfiguration(JsonField.of(revenueSystemConfiguration))

            /**
             * The revenue system configuration associated with a contract. Provide either an ID or
             * the provider and delivery method.
             */
            fun revenueSystemConfiguration(
                revenueSystemConfiguration: JsonField<RevenueSystemConfiguration>
            ) = apply { this.revenueSystemConfiguration = revenueSystemConfiguration }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) =
                scheduledCharges(JsonField.of(scheduledCharges))

            fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
                this.scheduledCharges = scheduledCharges.map { it.toMutableList() }
            }

            fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
                scheduledCharges =
                    (scheduledCharges ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(scheduledCharge)
                    }
            }

            /**
             * Determines which scheduled and commit charges to consolidate onto the Contract's
             * usage invoice. The charge's `timestamp` must match the usage invoice's
             * `ending_before` date for consolidation to occur. This field cannot be modified after
             * a Contract has been created. If this field is omitted, charges will appear on a
             * separate invoice from usage charges.
             */
            fun scheduledChargesOnUsageInvoices(
                scheduledChargesOnUsageInvoices: ScheduledChargesOnUsageInvoices
            ) = scheduledChargesOnUsageInvoices(JsonField.of(scheduledChargesOnUsageInvoices))

            /**
             * Determines which scheduled and commit charges to consolidate onto the Contract's
             * usage invoice. The charge's `timestamp` must match the usage invoice's
             * `ending_before` date for consolidation to occur. This field cannot be modified after
             * a Contract has been created. If this field is omitted, charges will appear on a
             * separate invoice from usage charges.
             */
            fun scheduledChargesOnUsageInvoices(
                scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>
            ) = apply { this.scheduledChargesOnUsageInvoices = scheduledChargesOnUsageInvoices }

            fun spendThresholdConfiguration(
                spendThresholdConfiguration: SpendThresholdConfiguration
            ) = spendThresholdConfiguration(JsonField.of(spendThresholdConfiguration))

            fun spendThresholdConfiguration(
                spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>
            ) = apply { this.spendThresholdConfiguration = spendThresholdConfiguration }

            /**
             * Optional list of
             * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/)
             * to add to the contract.
             */
            fun subscriptions(subscriptions: List<Subscription>) =
                subscriptions(JsonField.of(subscriptions))

            /**
             * Optional list of
             * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/)
             * to add to the contract.
             */
            fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
                this.subscriptions = subscriptions.map { it.toMutableList() }
            }

            /**
             * Optional list of
             * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/)
             * to add to the contract.
             */
            fun addSubscription(subscription: Subscription) = apply {
                subscriptions =
                    (subscriptions ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(subscription)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun totalContractValue(totalContractValue: Double) =
                totalContractValue(JsonField.of(totalContractValue))

            /** This field's availability is dependent on your client's configuration. */
            fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
                this.totalContractValue = totalContractValue
            }

            fun transition(transition: Transition) = transition(JsonField.of(transition))

            fun transition(transition: JsonField<Transition>) = apply {
                this.transition = transition
            }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                this.uniquenessKey = uniquenessKey
            }

            fun usageFilter(usageFilter: BaseUsageFilter) = usageFilter(JsonField.of(usageFilter))

            fun usageFilter(usageFilter: JsonField<BaseUsageFilter>) = apply {
                this.usageFilter = usageFilter
            }

            fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) =
                usageStatementSchedule(JsonField.of(usageStatementSchedule))

            fun usageStatementSchedule(usageStatementSchedule: JsonField<UsageStatementSchedule>) =
                apply {
                    this.usageStatementSchedule = usageStatementSchedule
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    checkRequired("startingAt", startingAt),
                    billingProviderConfiguration,
                    (commits ?: JsonMissing.of()).map { it.toImmutable() },
                    (credits ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    endingBefore,
                    hierarchyConfiguration,
                    multiplierOverridePrioritization,
                    name,
                    netPaymentTermsDays,
                    netsuiteSalesOrderId,
                    (overrides ?: JsonMissing.of()).map { it.toImmutable() },
                    packageAlias,
                    packageId,
                    prepaidBalanceThresholdConfiguration,
                    (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                    rateCardAlias,
                    rateCardId,
                    (recurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                    (recurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                    revenueSystemConfiguration,
                    salesforceOpportunityId,
                    (scheduledCharges ?: JsonMissing.of()).map { it.toImmutable() },
                    scheduledChargesOnUsageInvoices,
                    spendThresholdConfiguration,
                    (subscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                    totalContractValue,
                    transition,
                    uniquenessKey,
                    usageFilter,
                    usageStatementSchedule,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && customerId == other.customerId && startingAt == other.startingAt && billingProviderConfiguration == other.billingProviderConfiguration && commits == other.commits && credits == other.credits && customFields == other.customFields && discounts == other.discounts && endingBefore == other.endingBefore && hierarchyConfiguration == other.hierarchyConfiguration && multiplierOverridePrioritization == other.multiplierOverridePrioritization && name == other.name && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && overrides == other.overrides && packageAlias == other.packageAlias && packageId == other.packageId && prepaidBalanceThresholdConfiguration == other.prepaidBalanceThresholdConfiguration && professionalServices == other.professionalServices && rateCardAlias == other.rateCardAlias && rateCardId == other.rateCardId && recurringCommits == other.recurringCommits && recurringCredits == other.recurringCredits && resellerRoyalties == other.resellerRoyalties && revenueSystemConfiguration == other.revenueSystemConfiguration && salesforceOpportunityId == other.salesforceOpportunityId && scheduledCharges == other.scheduledCharges && scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices && spendThresholdConfiguration == other.spendThresholdConfiguration && subscriptions == other.subscriptions && totalContractValue == other.totalContractValue && transition == other.transition && uniquenessKey == other.uniquenessKey && usageFilter == other.usageFilter && usageStatementSchedule == other.usageStatementSchedule && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, startingAt, billingProviderConfiguration, commits, credits, customFields, discounts, endingBefore, hierarchyConfiguration, multiplierOverridePrioritization, name, netPaymentTermsDays, netsuiteSalesOrderId, overrides, packageAlias, packageId, prepaidBalanceThresholdConfiguration, professionalServices, rateCardAlias, rateCardId, recurringCommits, recurringCredits, resellerRoyalties, revenueSystemConfiguration, salesforceOpportunityId, scheduledCharges, scheduledChargesOnUsageInvoices, spendThresholdConfiguration, subscriptions, totalContractValue, transition, uniquenessKey, usageFilter, usageStatementSchedule, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, startingAt=$startingAt, billingProviderConfiguration=$billingProviderConfiguration, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, multiplierOverridePrioritization=$multiplierOverridePrioritization, name=$name, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, packageAlias=$packageAlias, packageId=$packageId, prepaidBalanceThresholdConfiguration=$prepaidBalanceThresholdConfiguration, professionalServices=$professionalServices, rateCardAlias=$rateCardAlias, rateCardId=$rateCardId, recurringCommits=$recurringCommits, recurringCredits=$recurringCredits, resellerRoyalties=$resellerRoyalties, revenueSystemConfiguration=$revenueSystemConfiguration, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, spendThresholdConfiguration=$spendThresholdConfiguration, subscriptions=$subscriptions, totalContractValue=$totalContractValue, transition=$transition, uniquenessKey=$uniquenessKey, usageFilter=$usageFilter, usageStatementSchedule=$usageStatementSchedule, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ContractCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ContractCreateParams: V1ContractCreateParams) = apply {
            body = v1ContractCreateParams.body.toBuilder()
            additionalHeaders = v1ContractCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ContractCreateParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** inclusive contract start time */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /** inclusive contract start time */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        /**
         * The billing provider configuration associated with a contract. Provide either an ID or
         * the provider and delivery method.
         */
        fun billingProviderConfiguration(
            billingProviderConfiguration: BillingProviderConfiguration
        ) = apply { body.billingProviderConfiguration(billingProviderConfiguration) }

        /**
         * The billing provider configuration associated with a contract. Provide either an ID or
         * the provider and delivery method.
         */
        fun billingProviderConfiguration(
            billingProviderConfiguration: JsonField<BillingProviderConfiguration>
        ) = apply { body.billingProviderConfiguration(billingProviderConfiguration) }

        fun commits(commits: List<Commit>) = apply { body.commits(commits) }

        fun commits(commits: JsonField<List<Commit>>) = apply { body.commits(commits) }

        fun addCommit(commit: Commit) = apply { body.addCommit(commit) }

        fun credits(credits: List<Credit>) = apply { body.credits(credits) }

        fun credits(credits: JsonField<List<Credit>>) = apply { body.credits(credits) }

        fun addCredit(credit: Credit) = apply { body.addCredit(credit) }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: List<Discount>) = apply { body.discounts(discounts) }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: JsonField<List<Discount>>) = apply { body.discounts(discounts) }

        /** This field's availability is dependent on your client's configuration. */
        fun addDiscount(discount: Discount) = apply { body.addDiscount(discount) }

        /** exclusive contract end time */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /** exclusive contract end time */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        fun hierarchyConfiguration(hierarchyConfiguration: HierarchyConfiguration) = apply {
            body.hierarchyConfiguration(hierarchyConfiguration)
        }

        fun hierarchyConfiguration(hierarchyConfiguration: JsonField<HierarchyConfiguration>) =
            apply {
                body.hierarchyConfiguration(hierarchyConfiguration)
            }

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first. If tiered
         * overrides are used, prioritization must be explicit.
         */
        fun multiplierOverridePrioritization(
            multiplierOverridePrioritization: MultiplierOverridePrioritization
        ) = apply { body.multiplierOverridePrioritization(multiplierOverridePrioritization) }

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first. If tiered
         * overrides are used, prioritization must be explicit.
         */
        fun multiplierOverridePrioritization(
            multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization>
        ) = apply { body.multiplierOverridePrioritization(multiplierOverridePrioritization) }

        fun name(name: String) = apply { body.name(name) }

        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) = apply {
            body.netPaymentTermsDays(netPaymentTermsDays)
        }

        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            body.netPaymentTermsDays(netPaymentTermsDays)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        fun overrides(overrides: List<Override>) = apply { body.overrides(overrides) }

        fun overrides(overrides: JsonField<List<Override>>) = apply { body.overrides(overrides) }

        fun addOverride(override: Override) = apply { body.addOverride(override) }

        /**
         * Selects the package linked to the specified alias as of the contract's start date.
         * Mutually exclusive with package_id.
         */
        fun packageAlias(packageAlias: String) = apply { body.packageAlias(packageAlias) }

        /**
         * Selects the package linked to the specified alias as of the contract's start date.
         * Mutually exclusive with package_id.
         */
        fun packageAlias(packageAlias: JsonField<String>) = apply {
            body.packageAlias(packageAlias)
        }

        /**
         * If provided, provisions a customer on a package instead of creating a traditional
         * contract. When specified, only customer_id, starting_at, package_id, and uniqueness_key
         * are allowed.
         */
        fun packageId(packageId: String) = apply { body.packageId(packageId) }

        /**
         * If provided, provisions a customer on a package instead of creating a traditional
         * contract. When specified, only customer_id, starting_at, package_id, and uniqueness_key
         * are allowed.
         */
        fun packageId(packageId: JsonField<String>) = apply { body.packageId(packageId) }

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfiguration
        ) = apply {
            body.prepaidBalanceThresholdConfiguration(prepaidBalanceThresholdConfiguration)
        }

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: JsonField<PrepaidBalanceThresholdConfiguration>
        ) = apply {
            body.prepaidBalanceThresholdConfiguration(prepaidBalanceThresholdConfiguration)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: List<ProfessionalService>) = apply {
            body.professionalServices(professionalServices)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: JsonField<List<ProfessionalService>>) =
            apply {
                body.professionalServices(professionalServices)
            }

        /** This field's availability is dependent on your client's configuration. */
        fun addProfessionalService(professionalService: ProfessionalService) = apply {
            body.addProfessionalService(professionalService)
        }

        /** Selects the rate card linked to the specified alias as of the contract's start date. */
        fun rateCardAlias(rateCardAlias: String) = apply { body.rateCardAlias(rateCardAlias) }

        /** Selects the rate card linked to the specified alias as of the contract's start date. */
        fun rateCardAlias(rateCardAlias: JsonField<String>) = apply {
            body.rateCardAlias(rateCardAlias)
        }

        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        fun rateCardId(rateCardId: JsonField<String>) = apply { body.rateCardId(rateCardId) }

        fun recurringCommits(recurringCommits: List<RecurringCommit>) = apply {
            body.recurringCommits(recurringCommits)
        }

        fun recurringCommits(recurringCommits: JsonField<List<RecurringCommit>>) = apply {
            body.recurringCommits(recurringCommits)
        }

        fun addRecurringCommit(recurringCommit: RecurringCommit) = apply {
            body.addRecurringCommit(recurringCommit)
        }

        fun recurringCredits(recurringCredits: List<RecurringCredit>) = apply {
            body.recurringCredits(recurringCredits)
        }

        fun recurringCredits(recurringCredits: JsonField<List<RecurringCredit>>) = apply {
            body.recurringCredits(recurringCredits)
        }

        fun addRecurringCredit(recurringCredit: RecurringCredit) = apply {
            body.addRecurringCredit(recurringCredit)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) = apply {
            body.resellerRoyalties(resellerRoyalties)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
            body.resellerRoyalties(resellerRoyalties)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
            body.addResellerRoyalty(resellerRoyalty)
        }

        /**
         * The revenue system configuration associated with a contract. Provide either an ID or the
         * provider and delivery method.
         */
        fun revenueSystemConfiguration(revenueSystemConfiguration: RevenueSystemConfiguration) =
            apply {
                body.revenueSystemConfiguration(revenueSystemConfiguration)
            }

        /**
         * The revenue system configuration associated with a contract. Provide either an ID or the
         * provider and delivery method.
         */
        fun revenueSystemConfiguration(
            revenueSystemConfiguration: JsonField<RevenueSystemConfiguration>
        ) = apply { body.revenueSystemConfiguration(revenueSystemConfiguration) }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) = apply {
            body.scheduledCharges(scheduledCharges)
        }

        fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
            body.scheduledCharges(scheduledCharges)
        }

        fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
            body.addScheduledCharge(scheduledCharge)
        }

        /**
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         */
        fun scheduledChargesOnUsageInvoices(
            scheduledChargesOnUsageInvoices: ScheduledChargesOnUsageInvoices
        ) = apply { body.scheduledChargesOnUsageInvoices(scheduledChargesOnUsageInvoices) }

        /**
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         */
        fun scheduledChargesOnUsageInvoices(
            scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>
        ) = apply { body.scheduledChargesOnUsageInvoices(scheduledChargesOnUsageInvoices) }

        fun spendThresholdConfiguration(spendThresholdConfiguration: SpendThresholdConfiguration) =
            apply {
                body.spendThresholdConfiguration(spendThresholdConfiguration)
            }

        fun spendThresholdConfiguration(
            spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>
        ) = apply { body.spendThresholdConfiguration(spendThresholdConfiguration) }

        /**
         * Optional list of
         * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/) to
         * add to the contract.
         */
        fun subscriptions(subscriptions: List<Subscription>) = apply {
            body.subscriptions(subscriptions)
        }

        /**
         * Optional list of
         * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/) to
         * add to the contract.
         */
        fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
            body.subscriptions(subscriptions)
        }

        /**
         * Optional list of
         * [subscriptions](https://docs.metronome.com/manage-product-access/create-subscription/) to
         * add to the contract.
         */
        fun addSubscription(subscription: Subscription) = apply {
            body.addSubscription(subscription)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) = apply {
            body.totalContractValue(totalContractValue)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
            body.totalContractValue(totalContractValue)
        }

        fun transition(transition: Transition) = apply { body.transition(transition) }

        fun transition(transition: JsonField<Transition>) = apply { body.transition(transition) }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
            body.uniquenessKey(uniquenessKey)
        }

        fun usageFilter(usageFilter: BaseUsageFilter) = apply { body.usageFilter(usageFilter) }

        fun usageFilter(usageFilter: JsonField<BaseUsageFilter>) = apply {
            body.usageFilter(usageFilter)
        }

        fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) = apply {
            body.usageStatementSchedule(usageStatementSchedule)
        }

        fun usageStatementSchedule(usageStatementSchedule: JsonField<UsageStatementSchedule>) =
            apply {
                body.usageStatementSchedule(usageStatementSchedule)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): V1ContractCreateParams =
            V1ContractCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * The billing provider configuration associated with a contract. Provide either an ID or the
     * provider and delivery method.
     */
    @NoAutoDetect
    class BillingProviderConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("billing_provider")
        @ExcludeMissing
        private val billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
        @JsonProperty("billing_provider_configuration_id")
        @ExcludeMissing
        private val billingProviderConfigurationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("delivery_method")
        @ExcludeMissing
        private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Do not specify if using billing_provider_configuration_id. */
        fun billingProvider(): Optional<BillingProvider> =
            Optional.ofNullable(billingProvider.getNullable("billing_provider"))

        /**
         * The Metronome ID of the billing provider configuration. Use when a customer has multiple
         * configurations with the same billing provider and delivery method. Otherwise, specify the
         * billing_provider and delivery_method.
         */
        fun billingProviderConfigurationId(): Optional<String> =
            Optional.ofNullable(
                billingProviderConfigurationId.getNullable("billing_provider_configuration_id")
            )

        /** Do not specify if using billing_provider_configuration_id. */
        fun deliveryMethod(): Optional<DeliveryMethod> =
            Optional.ofNullable(deliveryMethod.getNullable("delivery_method"))

        /** Do not specify if using billing_provider_configuration_id. */
        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        /**
         * The Metronome ID of the billing provider configuration. Use when a customer has multiple
         * configurations with the same billing provider and delivery method. Otherwise, specify the
         * billing_provider and delivery_method.
         */
        @JsonProperty("billing_provider_configuration_id")
        @ExcludeMissing
        fun _billingProviderConfigurationId(): JsonField<String> = billingProviderConfigurationId

        /** Do not specify if using billing_provider_configuration_id. */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingProviderConfiguration = apply {
            if (validated) {
                return@apply
            }

            billingProvider()
            billingProviderConfigurationId()
            deliveryMethod()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingProviderConfiguration]. */
        class Builder internal constructor() {

            private var billingProvider: JsonField<BillingProvider> = JsonMissing.of()
            private var billingProviderConfigurationId: JsonField<String> = JsonMissing.of()
            private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingProviderConfiguration: BillingProviderConfiguration) = apply {
                billingProvider = billingProviderConfiguration.billingProvider
                billingProviderConfigurationId =
                    billingProviderConfiguration.billingProviderConfigurationId
                deliveryMethod = billingProviderConfiguration.deliveryMethod
                additionalProperties =
                    billingProviderConfiguration.additionalProperties.toMutableMap()
            }

            /** Do not specify if using billing_provider_configuration_id. */
            fun billingProvider(billingProvider: BillingProvider) =
                billingProvider(JsonField.of(billingProvider))

            /** Do not specify if using billing_provider_configuration_id. */
            fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                this.billingProvider = billingProvider
            }

            /**
             * The Metronome ID of the billing provider configuration. Use when a customer has
             * multiple configurations with the same billing provider and delivery method.
             * Otherwise, specify the billing_provider and delivery_method.
             */
            fun billingProviderConfigurationId(billingProviderConfigurationId: String) =
                billingProviderConfigurationId(JsonField.of(billingProviderConfigurationId))

            /**
             * The Metronome ID of the billing provider configuration. Use when a customer has
             * multiple configurations with the same billing provider and delivery method.
             * Otherwise, specify the billing_provider and delivery_method.
             */
            fun billingProviderConfigurationId(billingProviderConfigurationId: JsonField<String>) =
                apply {
                    this.billingProviderConfigurationId = billingProviderConfigurationId
                }

            /** Do not specify if using billing_provider_configuration_id. */
            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            /** Do not specify if using billing_provider_configuration_id. */
            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): BillingProviderConfiguration =
                BillingProviderConfiguration(
                    billingProvider,
                    billingProviderConfigurationId,
                    deliveryMethod,
                    additionalProperties.toImmutable(),
                )
        }

        /** Do not specify if using billing_provider_configuration_id. */
        class BillingProvider
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
            }

            /** An enum containing [BillingProvider]'s known values. */
            enum class Known {
                AWS_MARKETPLACE,
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
            }

            /**
             * An enum containing [BillingProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS_MARKETPLACE,
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
                /**
                 * An enum member indicating that [BillingProvider] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                    AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                    STRIPE -> Value.STRIPE
                    NETSUITE -> Value.NETSUITE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                    AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                    STRIPE -> Known.STRIPE
                    NETSUITE -> Known.NETSUITE
                    else -> throw MetronomeInvalidDataException("Unknown BillingProvider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingProvider && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Do not specify if using billing_provider_configuration_id. */
        class DeliveryMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DIRECT_TO_BILLING_PROVIDER = of("direct_to_billing_provider")

                @JvmField val AWS_SQS = of("aws_sqs")

                @JvmField val TACKLE = of("tackle")

                @JvmField val AWS_SNS = of("aws_sns")

                @JvmStatic fun of(value: String) = DeliveryMethod(JsonField.of(value))
            }

            /** An enum containing [DeliveryMethod]'s known values. */
            enum class Known {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
            }

            /**
             * An enum containing [DeliveryMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeliveryMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
                /**
                 * An enum member indicating that [DeliveryMethod] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Value.AWS_SQS
                    TACKLE -> Value.TACKLE
                    AWS_SNS -> Value.AWS_SNS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Known.AWS_SQS
                    TACKLE -> Known.TACKLE
                    AWS_SNS -> Known.AWS_SNS
                    else -> throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DeliveryMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingProviderConfiguration && billingProvider == other.billingProvider && billingProviderConfigurationId == other.billingProviderConfigurationId && deliveryMethod == other.deliveryMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProvider, billingProviderConfigurationId, deliveryMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingProviderConfiguration{billingProvider=$billingProvider, billingProviderConfigurationId=$billingProviderConfigurationId, deliveryMethod=$deliveryMethod, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Commit
    @JsonCreator
    private constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("access_schedule")
        @ExcludeMissing
        private val accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
            JsonMissing.of(),
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        private val invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_gate_config")
        @ExcludeMissing
        private val paymentGateConfig: JsonField<PaymentGateConfig> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        @JsonProperty("temporary_id")
        @ExcludeMissing
        private val temporaryId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun productId(): String = productId.getRequired("product_id")

        fun type(): Type = type.getRequired("type")

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        fun accessSchedule(): Optional<AccessSchedule> =
            Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

        /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
        fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

        /**
         * Which products the commit applies to. If applicable_product_ids, applicable_product_tags
         * or specifiers are not provided, the commit applies to all products.
         */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /**
         * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags or
         * specifiers are not provided, the commit applies to all products.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Optional configuration for commit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        fun invoiceSchedule(): Optional<InvoiceSchedule> =
            Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

        /** displayed on invoices */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /** optionally payment gate this commit */
        fun paymentGateConfig(): Optional<PaymentGateConfig> =
            Optional.ofNullable(paymentGateConfig.getNullable("payment_gate_config"))

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
        fun rolloverFraction(): Optional<Double> =
            Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /**
         * A temporary ID for the commit that can be used to reference the commit for commit
         * specific overrides.
         */
        fun temporaryId(): Optional<String> =
            Optional.ofNullable(temporaryId.getNullable("temporary_id"))

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Which products the commit applies to. If applicable_product_ids, applicable_product_tags
         * or specifiers are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags or
         * specifiers are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Optional configuration for commit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

        /** displayed on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /** optionally payment gate this commit */
        @JsonProperty("payment_gate_config")
        @ExcludeMissing
        fun _paymentGateConfig(): JsonField<PaymentGateConfig> = paymentGateConfig

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /**
         * A temporary ID for the commit that can be used to reference the commit for commit
         * specific overrides.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            productId()
            type()
            accessSchedule().ifPresent { it.validate() }
            amount()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            invoiceSchedule().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            paymentGateConfig().ifPresent { it.validate() }
            priority()
            rateType()
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            temporaryId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commit]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var accessSchedule: JsonField<AccessSchedule> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var paymentGateConfig: JsonField<PaymentGateConfig> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var temporaryId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                productId = commit.productId
                type = commit.type
                accessSchedule = commit.accessSchedule
                amount = commit.amount
                applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
                customFields = commit.customFields
                description = commit.description
                hierarchyConfiguration = commit.hierarchyConfiguration
                invoiceSchedule = commit.invoiceSchedule
                name = commit.name
                netsuiteSalesOrderId = commit.netsuiteSalesOrderId
                paymentGateConfig = commit.paymentGateConfig
                priority = commit.priority
                rateType = commit.rateType
                rolloverFraction = commit.rolloverFraction
                specifiers = commit.specifiers.map { it.toMutableList() }
                temporaryId = commit.temporaryId
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Required: Schedule for distributing the commit to the customer. For "POSTPAID"
             * commits only one schedule item is allowed and amount must match invoice_schedule
             * total.
             */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * Required: Schedule for distributing the commit to the customer. For "POSTPAID"
             * commits only one schedule item is allowed and amount must match invoice_schedule
             * total.
             */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional configuration for commit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for commit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match access_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) =
                invoiceSchedule(JsonField.of(invoiceSchedule))

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match access_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** optionally payment gate this commit */
            fun paymentGateConfig(paymentGateConfig: PaymentGateConfig) =
                paymentGateConfig(JsonField.of(paymentGateConfig))

            /** optionally payment gate this commit */
            fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfig>) = apply {
                this.paymentGateConfig = paymentGateConfig
            }

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(JsonField.of(rolloverFraction))

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(specifier)
                    }
            }

            /**
             * A temporary ID for the commit that can be used to reference the commit for commit
             * specific overrides.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * A temporary ID for the commit that can be used to reference the commit for commit
             * specific overrides.
             */
            fun temporaryId(temporaryId: JsonField<String>) = apply {
                this.temporaryId = temporaryId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Commit =
                Commit(
                    checkRequired("productId", productId),
                    checkRequired("type", type),
                    accessSchedule,
                    amount,
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    hierarchyConfiguration,
                    invoiceSchedule,
                    name,
                    netsuiteSalesOrderId,
                    paymentGateConfig,
                    priority,
                    rateType,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    temporaryId,
                    additionalProperties.toImmutable(),
                )
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PREPAID = of("PREPAID")

                @JvmField val POSTPAID = of("POSTPAID")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PREPAID,
                POSTPAID,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PREPAID,
                POSTPAID,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PREPAID -> Value.PREPAID
                    POSTPAID -> Value.POSTPAID
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PREPAID -> Known.PREPAID
                    POSTPAID -> Known.POSTPAID
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        @NoAutoDetect
        class AccessSchedule
        @JsonCreator
        private constructor(
            @JsonProperty("schedule_items")
            @ExcludeMissing
            private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /** Defaults to USD (cents) if not passed */
            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /** Defaults to USD (cents) if not passed */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AccessSchedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccessSchedule]. */
            class Builder internal constructor() {

                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    scheduleItems = accessSchedule.scheduleItems.map { it.toMutableList() }
                    creditTypeId = accessSchedule.creditTypeId
                    additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                }

                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                /** RFC 3339 timestamp (exclusive) */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                /** RFC 3339 timestamp (inclusive) */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /** RFC 3339 timestamp (exclusive) */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /** RFC 3339 timestamp (inclusive) */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    endingBefore()
                    startingAt()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        endingBefore = scheduleItem.endingBefore
                        startingAt = scheduleItem.startingAt
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("amount", amount),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("startingAt", startingAt),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && scheduleItems == other.scheduleItems && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(scheduleItems, creditTypeId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        @NoAutoDetect
        class InvoiceSchedule
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            private val doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            private val recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
            @JsonProperty("schedule_items")
            @ExcludeMissing
            private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Defaults to USD (cents) if not passed. */
            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             */
            fun doNotInvoice(): Optional<Boolean> =
                Optional.ofNullable(doNotInvoice.getNullable("do_not_invoice"))

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            fun recurringSchedule(): Optional<RecurringSchedule> =
                Optional.ofNullable(recurringSchedule.getNullable("recurring_schedule"))

            /** Either provide amount or provide both unit_price and quantity. */
            fun scheduleItems(): Optional<List<ScheduleItem>> =
                Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

            /** Defaults to USD (cents) if not passed. */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             */
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InvoiceSchedule = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                doNotInvoice()
                recurringSchedule().ifPresent { it.validate() }
                scheduleItems().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceSchedule]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                    creditTypeId = invoiceSchedule.creditTypeId
                    doNotInvoice = invoiceSchedule.doNotInvoice
                    recurringSchedule = invoiceSchedule.recurringSchedule
                    scheduleItems = invoiceSchedule.scheduleItems.map { it.toMutableList() }
                    additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                    this.doNotInvoice = doNotInvoice
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                    recurringSchedule(JsonField.of(recurringSchedule))

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(scheduleItem)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InvoiceSchedule =
                    InvoiceSchedule(
                        creditTypeId,
                        doNotInvoice,
                        recurringSchedule,
                        (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @NoAutoDetect
            class RecurringSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("amount_distribution")
                @ExcludeMissing
                private val amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                private val frequency: JsonField<Frequency> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amountDistribution(): AmountDistribution =
                    amountDistribution.getRequired("amount_distribution")

                /** RFC 3339 timestamp (exclusive). */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                fun frequency(): Frequency = frequency.getRequired("frequency")

                /** RFC 3339 timestamp (inclusive). */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                @JsonProperty("amount_distribution")
                @ExcludeMissing
                fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<Frequency> = frequency

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): RecurringSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDistribution()
                    endingBefore()
                    frequency()
                    startingAt()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringSchedule]. */
                class Builder internal constructor() {

                    private var amountDistribution: JsonField<AmountDistribution>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var frequency: JsonField<Frequency>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        amountDistribution = recurringSchedule.amountDistribution
                        endingBefore = recurringSchedule.endingBefore
                        frequency = recurringSchedule.frequency
                        startingAt = recurringSchedule.startingAt
                        amount = recurringSchedule.amount
                        quantity = recurringSchedule.quantity
                        unitPrice = recurringSchedule.unitPrice
                        additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                    }

                    fun amountDistribution(amountDistribution: AmountDistribution) =
                        amountDistribution(JsonField.of(amountDistribution))

                    fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) =
                        apply {
                            this.amountDistribution = amountDistribution
                        }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                    fun frequency(frequency: JsonField<Frequency>) = apply {
                        this.frequency = frequency
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkRequired("amountDistribution", amountDistribution),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("frequency", frequency),
                            checkRequired("startingAt", startingAt),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                class AmountDistribution
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    /** An enum containing [AmountDistribution]'s known values. */
                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    /**
                     * An enum containing [AmountDistribution]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [AmountDistribution] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        /**
                         * An enum member indicating that [AmountDistribution] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DIVIDED -> Known.DIVIDED
                            DIVIDED_ROUNDED -> Known.DIVIDED_ROUNDED
                            EACH -> Known.EACH
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown AmountDistribution: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    /** An enum containing [Frequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    /**
                     * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Frequency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        /**
                         * An enum member indicating that [Frequency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && amountDistribution == other.amountDistribution && endingBefore == other.endingBefore && frequency == other.frequency && startingAt == other.startingAt && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDistribution, endingBefore, frequency, startingAt, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** timestamp of the scheduled event */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    timestamp()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        timestamp = scheduleItem.timestamp
                        amount = scheduleItem.amount
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("timestamp", timestamp),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceSchedule && creditTypeId == other.creditTypeId && doNotInvoice == other.doNotInvoice && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceSchedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        /** optionally payment gate this commit */
        @NoAutoDetect
        class PaymentGateConfig
        @JsonCreator
        private constructor(
            @JsonProperty("payment_gate_type")
            @ExcludeMissing
            private val paymentGateType: JsonField<PaymentGateType> = JsonMissing.of(),
            @JsonProperty("precalculated_tax_config")
            @ExcludeMissing
            private val precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig> =
                JsonMissing.of(),
            @JsonProperty("stripe_config")
            @ExcludeMissing
            private val stripeConfig: JsonField<StripeConfig> = JsonMissing.of(),
            @JsonProperty("tax_type")
            @ExcludeMissing
            private val taxType: JsonField<TaxType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Gate access to the commit balance based on successful collection of payment. Select
             * STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate
             * payment using your own payment integration. Select NONE if you do not wish to payment
             * gate the commit balance.
             */
            fun paymentGateType(): PaymentGateType =
                paymentGateType.getRequired("payment_gate_type")

            /** Only applicable if using PRECALCULATED as your tax type. */
            fun precalculatedTaxConfig(): Optional<PrecalculatedTaxConfig> =
                Optional.ofNullable(precalculatedTaxConfig.getNullable("precalculated_tax_config"))

            /** Only applicable if using STRIPE as your payment gate type. */
            fun stripeConfig(): Optional<StripeConfig> =
                Optional.ofNullable(stripeConfig.getNullable("stripe_config"))

            /**
             * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not
             * wish Metronome to calculate tax on your behalf. Leaving this field blank will default
             * to NONE.
             */
            fun taxType(): Optional<TaxType> = Optional.ofNullable(taxType.getNullable("tax_type"))

            /**
             * Gate access to the commit balance based on successful collection of payment. Select
             * STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate
             * payment using your own payment integration. Select NONE if you do not wish to payment
             * gate the commit balance.
             */
            @JsonProperty("payment_gate_type")
            @ExcludeMissing
            fun _paymentGateType(): JsonField<PaymentGateType> = paymentGateType

            /** Only applicable if using PRECALCULATED as your tax type. */
            @JsonProperty("precalculated_tax_config")
            @ExcludeMissing
            fun _precalculatedTaxConfig(): JsonField<PrecalculatedTaxConfig> =
                precalculatedTaxConfig

            /** Only applicable if using STRIPE as your payment gate type. */
            @JsonProperty("stripe_config")
            @ExcludeMissing
            fun _stripeConfig(): JsonField<StripeConfig> = stripeConfig

            /**
             * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not
             * wish Metronome to calculate tax on your behalf. Leaving this field blank will default
             * to NONE.
             */
            @JsonProperty("tax_type") @ExcludeMissing fun _taxType(): JsonField<TaxType> = taxType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PaymentGateConfig = apply {
                if (validated) {
                    return@apply
                }

                paymentGateType()
                precalculatedTaxConfig().ifPresent { it.validate() }
                stripeConfig().ifPresent { it.validate() }
                taxType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PaymentGateConfig]. */
            class Builder internal constructor() {

                private var paymentGateType: JsonField<PaymentGateType>? = null
                private var precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig> =
                    JsonMissing.of()
                private var stripeConfig: JsonField<StripeConfig> = JsonMissing.of()
                private var taxType: JsonField<TaxType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentGateConfig: PaymentGateConfig) = apply {
                    paymentGateType = paymentGateConfig.paymentGateType
                    precalculatedTaxConfig = paymentGateConfig.precalculatedTaxConfig
                    stripeConfig = paymentGateConfig.stripeConfig
                    taxType = paymentGateConfig.taxType
                    additionalProperties = paymentGateConfig.additionalProperties.toMutableMap()
                }

                /**
                 * Gate access to the commit balance based on successful collection of payment.
                 * Select STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to
                 * facilitate payment using your own payment integration. Select NONE if you do not
                 * wish to payment gate the commit balance.
                 */
                fun paymentGateType(paymentGateType: PaymentGateType) =
                    paymentGateType(JsonField.of(paymentGateType))

                /**
                 * Gate access to the commit balance based on successful collection of payment.
                 * Select STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to
                 * facilitate payment using your own payment integration. Select NONE if you do not
                 * wish to payment gate the commit balance.
                 */
                fun paymentGateType(paymentGateType: JsonField<PaymentGateType>) = apply {
                    this.paymentGateType = paymentGateType
                }

                /** Only applicable if using PRECALCULATED as your tax type. */
                fun precalculatedTaxConfig(precalculatedTaxConfig: PrecalculatedTaxConfig) =
                    precalculatedTaxConfig(JsonField.of(precalculatedTaxConfig))

                /** Only applicable if using PRECALCULATED as your tax type. */
                fun precalculatedTaxConfig(
                    precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig>
                ) = apply { this.precalculatedTaxConfig = precalculatedTaxConfig }

                /** Only applicable if using STRIPE as your payment gate type. */
                fun stripeConfig(stripeConfig: StripeConfig) =
                    stripeConfig(JsonField.of(stripeConfig))

                /** Only applicable if using STRIPE as your payment gate type. */
                fun stripeConfig(stripeConfig: JsonField<StripeConfig>) = apply {
                    this.stripeConfig = stripeConfig
                }

                /**
                 * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do
                 * not wish Metronome to calculate tax on your behalf. Leaving this field blank will
                 * default to NONE.
                 */
                fun taxType(taxType: TaxType) = taxType(JsonField.of(taxType))

                /**
                 * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do
                 * not wish Metronome to calculate tax on your behalf. Leaving this field blank will
                 * default to NONE.
                 */
                fun taxType(taxType: JsonField<TaxType>) = apply { this.taxType = taxType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PaymentGateConfig =
                    PaymentGateConfig(
                        checkRequired("paymentGateType", paymentGateType),
                        precalculatedTaxConfig,
                        stripeConfig,
                        taxType,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Gate access to the commit balance based on successful collection of payment. Select
             * STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate
             * payment using your own payment integration. Select NONE if you do not wish to payment
             * gate the commit balance.
             */
            class PaymentGateType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("NONE")

                    @JvmField val STRIPE = of("STRIPE")

                    @JvmField val EXTERNAL = of("EXTERNAL")

                    @JvmStatic fun of(value: String) = PaymentGateType(JsonField.of(value))
                }

                /** An enum containing [PaymentGateType]'s known values. */
                enum class Known {
                    NONE,
                    STRIPE,
                    EXTERNAL,
                }

                /**
                 * An enum containing [PaymentGateType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PaymentGateType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    STRIPE,
                    EXTERNAL,
                    /**
                     * An enum member indicating that [PaymentGateType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        STRIPE -> Value.STRIPE
                        EXTERNAL -> Value.EXTERNAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        STRIPE -> Known.STRIPE
                        EXTERNAL -> Known.EXTERNAL
                        else ->
                            throw MetronomeInvalidDataException("Unknown PaymentGateType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PaymentGateType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Only applicable if using PRECALCULATED as your tax type. */
            @NoAutoDetect
            class PrecalculatedTaxConfig
            @JsonCreator
            private constructor(
                @JsonProperty("tax_amount")
                @ExcludeMissing
                private val taxAmount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tax_name")
                @ExcludeMissing
                private val taxName: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Amount of tax to be applied. This should be in the same currency and denomination
                 * as the commit's invoice schedule
                 */
                fun taxAmount(): Double = taxAmount.getRequired("tax_amount")

                /**
                 * Name of the tax to be applied. This may be used in an invoice line item
                 * description.
                 */
                fun taxName(): Optional<String> =
                    Optional.ofNullable(taxName.getNullable("tax_name"))

                /**
                 * Amount of tax to be applied. This should be in the same currency and denomination
                 * as the commit's invoice schedule
                 */
                @JsonProperty("tax_amount")
                @ExcludeMissing
                fun _taxAmount(): JsonField<Double> = taxAmount

                /**
                 * Name of the tax to be applied. This may be used in an invoice line item
                 * description.
                 */
                @JsonProperty("tax_name")
                @ExcludeMissing
                fun _taxName(): JsonField<String> = taxName

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrecalculatedTaxConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    taxAmount()
                    taxName()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrecalculatedTaxConfig]. */
                class Builder internal constructor() {

                    private var taxAmount: JsonField<Double>? = null
                    private var taxName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(precalculatedTaxConfig: PrecalculatedTaxConfig) = apply {
                        taxAmount = precalculatedTaxConfig.taxAmount
                        taxName = precalculatedTaxConfig.taxName
                        additionalProperties =
                            precalculatedTaxConfig.additionalProperties.toMutableMap()
                    }

                    /**
                     * Amount of tax to be applied. This should be in the same currency and
                     * denomination as the commit's invoice schedule
                     */
                    fun taxAmount(taxAmount: Double) = taxAmount(JsonField.of(taxAmount))

                    /**
                     * Amount of tax to be applied. This should be in the same currency and
                     * denomination as the commit's invoice schedule
                     */
                    fun taxAmount(taxAmount: JsonField<Double>) = apply {
                        this.taxAmount = taxAmount
                    }

                    /**
                     * Name of the tax to be applied. This may be used in an invoice line item
                     * description.
                     */
                    fun taxName(taxName: String) = taxName(JsonField.of(taxName))

                    /**
                     * Name of the tax to be applied. This may be used in an invoice line item
                     * description.
                     */
                    fun taxName(taxName: JsonField<String>) = apply { this.taxName = taxName }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): PrecalculatedTaxConfig =
                        PrecalculatedTaxConfig(
                            checkRequired("taxAmount", taxAmount),
                            taxName,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PrecalculatedTaxConfig && taxAmount == other.taxAmount && taxName == other.taxName && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(taxAmount, taxName, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrecalculatedTaxConfig{taxAmount=$taxAmount, taxName=$taxName, additionalProperties=$additionalProperties}"
            }

            /** Only applicable if using STRIPE as your payment gate type. */
            @NoAutoDetect
            class StripeConfig
            @JsonCreator
            private constructor(
                @JsonProperty("payment_type")
                @ExcludeMissing
                private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
                @JsonProperty("invoice_metadata")
                @ExcludeMissing
                private val invoiceMetadata: JsonField<InvoiceMetadata> = JsonMissing.of(),
                @JsonProperty("on_session_payment")
                @ExcludeMissing
                private val onSessionPayment: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** If left blank, will default to INVOICE */
                fun paymentType(): PaymentType = paymentType.getRequired("payment_type")

                /**
                 * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as
                 * your payment type.
                 */
                fun invoiceMetadata(): Optional<InvoiceMetadata> =
                    Optional.ofNullable(invoiceMetadata.getNullable("invoice_metadata"))

                /**
                 * If true, the payment will be made assuming the customer is present (i.e. on
                 * session).
                 *
                 * If false, the payment will be made assuming the customer is not present (i.e. off
                 * session). For cardholders from a country with an e-mandate requirement (e.g.
                 * India), the payment may be declined.
                 *
                 * If left blank, will default to false.
                 */
                fun onSessionPayment(): Optional<Boolean> =
                    Optional.ofNullable(onSessionPayment.getNullable("on_session_payment"))

                /** If left blank, will default to INVOICE */
                @JsonProperty("payment_type")
                @ExcludeMissing
                fun _paymentType(): JsonField<PaymentType> = paymentType

                /**
                 * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as
                 * your payment type.
                 */
                @JsonProperty("invoice_metadata")
                @ExcludeMissing
                fun _invoiceMetadata(): JsonField<InvoiceMetadata> = invoiceMetadata

                /**
                 * If true, the payment will be made assuming the customer is present (i.e. on
                 * session).
                 *
                 * If false, the payment will be made assuming the customer is not present (i.e. off
                 * session). For cardholders from a country with an e-mandate requirement (e.g.
                 * India), the payment may be declined.
                 *
                 * If left blank, will default to false.
                 */
                @JsonProperty("on_session_payment")
                @ExcludeMissing
                fun _onSessionPayment(): JsonField<Boolean> = onSessionPayment

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): StripeConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    paymentType()
                    invoiceMetadata().ifPresent { it.validate() }
                    onSessionPayment()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StripeConfig]. */
                class Builder internal constructor() {

                    private var paymentType: JsonField<PaymentType>? = null
                    private var invoiceMetadata: JsonField<InvoiceMetadata> = JsonMissing.of()
                    private var onSessionPayment: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stripeConfig: StripeConfig) = apply {
                        paymentType = stripeConfig.paymentType
                        invoiceMetadata = stripeConfig.invoiceMetadata
                        onSessionPayment = stripeConfig.onSessionPayment
                        additionalProperties = stripeConfig.additionalProperties.toMutableMap()
                    }

                    /** If left blank, will default to INVOICE */
                    fun paymentType(paymentType: PaymentType) =
                        paymentType(JsonField.of(paymentType))

                    /** If left blank, will default to INVOICE */
                    fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                        this.paymentType = paymentType
                    }

                    /**
                     * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE
                     * as your payment type.
                     */
                    fun invoiceMetadata(invoiceMetadata: InvoiceMetadata) =
                        invoiceMetadata(JsonField.of(invoiceMetadata))

                    /**
                     * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE
                     * as your payment type.
                     */
                    fun invoiceMetadata(invoiceMetadata: JsonField<InvoiceMetadata>) = apply {
                        this.invoiceMetadata = invoiceMetadata
                    }

                    /**
                     * If true, the payment will be made assuming the customer is present (i.e. on
                     * session).
                     *
                     * If false, the payment will be made assuming the customer is not present (i.e.
                     * off session). For cardholders from a country with an e-mandate requirement
                     * (e.g. India), the payment may be declined.
                     *
                     * If left blank, will default to false.
                     */
                    fun onSessionPayment(onSessionPayment: Boolean) =
                        onSessionPayment(JsonField.of(onSessionPayment))

                    /**
                     * If true, the payment will be made assuming the customer is present (i.e. on
                     * session).
                     *
                     * If false, the payment will be made assuming the customer is not present (i.e.
                     * off session). For cardholders from a country with an e-mandate requirement
                     * (e.g. India), the payment may be declined.
                     *
                     * If left blank, will default to false.
                     */
                    fun onSessionPayment(onSessionPayment: JsonField<Boolean>) = apply {
                        this.onSessionPayment = onSessionPayment
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): StripeConfig =
                        StripeConfig(
                            checkRequired("paymentType", paymentType),
                            invoiceMetadata,
                            onSessionPayment,
                            additionalProperties.toImmutable(),
                        )
                }

                /** If left blank, will default to INVOICE */
                class PaymentType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val INVOICE = of("INVOICE")

                        @JvmField val PAYMENT_INTENT = of("PAYMENT_INTENT")

                        @JvmStatic fun of(value: String) = PaymentType(JsonField.of(value))
                    }

                    /** An enum containing [PaymentType]'s known values. */
                    enum class Known {
                        INVOICE,
                        PAYMENT_INTENT,
                    }

                    /**
                     * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [PaymentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INVOICE,
                        PAYMENT_INTENT,
                        /**
                         * An enum member indicating that [PaymentType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INVOICE -> Value.INVOICE
                            PAYMENT_INTENT -> Value.PAYMENT_INTENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INVOICE -> Known.INVOICE
                            PAYMENT_INTENT -> Known.PAYMENT_INTENT
                            else ->
                                throw MetronomeInvalidDataException("Unknown PaymentType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as
                 * your payment type.
                 */
                @NoAutoDetect
                class InvoiceMetadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): InvoiceMetadata = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InvoiceMetadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(invoiceMetadata: InvoiceMetadata) = apply {
                            additionalProperties =
                                invoiceMetadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): InvoiceMetadata =
                            InvoiceMetadata(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is InvoiceMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InvoiceMetadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StripeConfig && paymentType == other.paymentType && invoiceMetadata == other.invoiceMetadata && onSessionPayment == other.onSessionPayment && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(paymentType, invoiceMetadata, onSessionPayment, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StripeConfig{paymentType=$paymentType, invoiceMetadata=$invoiceMetadata, onSessionPayment=$onSessionPayment, additionalProperties=$additionalProperties}"
            }

            /**
             * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not
             * wish Metronome to calculate tax on your behalf. Leaving this field blank will default
             * to NONE.
             */
            class TaxType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("NONE")

                    @JvmField val STRIPE = of("STRIPE")

                    @JvmField val ANROK = of("ANROK")

                    @JvmField val AVALARA = of("AVALARA")

                    @JvmField val PRECALCULATED = of("PRECALCULATED")

                    @JvmStatic fun of(value: String) = TaxType(JsonField.of(value))
                }

                /** An enum containing [TaxType]'s known values. */
                enum class Known {
                    NONE,
                    STRIPE,
                    ANROK,
                    AVALARA,
                    PRECALCULATED,
                }

                /**
                 * An enum containing [TaxType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [TaxType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    STRIPE,
                    ANROK,
                    AVALARA,
                    PRECALCULATED,
                    /**
                     * An enum member indicating that [TaxType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        STRIPE -> Value.STRIPE
                        ANROK -> Value.ANROK
                        AVALARA -> Value.AVALARA
                        PRECALCULATED -> Value.PRECALCULATED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        STRIPE -> Known.STRIPE
                        ANROK -> Known.ANROK
                        AVALARA -> Known.AVALARA
                        PRECALCULATED -> Known.PRECALCULATED
                        else -> throw MetronomeInvalidDataException("Unknown TaxType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TaxType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentGateConfig && paymentGateType == other.paymentGateType && precalculatedTaxConfig == other.precalculatedTaxConfig && stripeConfig == other.stripeConfig && taxType == other.taxType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(paymentGateType, precalculatedTaxConfig, stripeConfig, taxType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentGateConfig{paymentGateType=$paymentGateType, precalculatedTaxConfig=$precalculatedTaxConfig, stripeConfig=$stripeConfig, taxType=$taxType, additionalProperties=$additionalProperties}"
        }

        class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            /** An enum containing [RateType]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RateType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [RateType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && productId == other.productId && type == other.type && accessSchedule == other.accessSchedule && amount == other.amount && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && paymentGateConfig == other.paymentGateConfig && priority == other.priority && rateType == other.rateType && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && temporaryId == other.temporaryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, type, accessSchedule, amount, applicableProductIds, applicableProductTags, customFields, description, hierarchyConfiguration, invoiceSchedule, name, netsuiteSalesOrderId, paymentGateConfig, priority, rateType, rolloverFraction, specifiers, temporaryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{productId=$productId, type=$type, accessSchedule=$accessSchedule, amount=$amount, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, paymentGateConfig=$paymentGateConfig, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, specifiers=$specifiers, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Credit
    @JsonCreator
    private constructor(
        @JsonProperty("access_schedule")
        @ExcludeMissing
        private val accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
            JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Schedule for distributing the credit to the customer. */
        fun accessSchedule(): AccessSchedule = accessSchedule.getRequired("access_schedule")

        fun productId(): String = productId.getRequired("product_id")

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Optional configuration for credit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /** displayed on invoices */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /** If multiple credits are applicable, the one with the lower priority will apply first. */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** Schedule for distributing the credit to the customer. */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Optional configuration for credit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /** displayed on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /** If multiple credits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Credit = apply {
            if (validated) {
                return@apply
            }

            accessSchedule().validate()
            productId()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            priority()
            rateType()
            specifiers().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Credit]. */
        class Builder internal constructor() {

            private var accessSchedule: JsonField<AccessSchedule>? = null
            private var productId: JsonField<String>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credit: Credit) = apply {
                accessSchedule = credit.accessSchedule
                productId = credit.productId
                applicableProductIds = credit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = credit.applicableProductTags.map { it.toMutableList() }
                customFields = credit.customFields
                description = credit.description
                hierarchyConfiguration = credit.hierarchyConfiguration
                name = credit.name
                netsuiteSalesOrderId = credit.netsuiteSalesOrderId
                priority = credit.priority
                rateType = credit.rateType
                specifiers = credit.specifiers.map { it.toMutableList() }
                additionalProperties = credit.additionalProperties.toMutableMap()
            }

            /** Schedule for distributing the credit to the customer. */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /** Schedule for distributing the credit to the customer. */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(specifier)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Credit =
                Credit(
                    checkRequired("accessSchedule", accessSchedule),
                    checkRequired("productId", productId),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    hierarchyConfiguration,
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    rateType,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        /** Schedule for distributing the credit to the customer. */
        @NoAutoDetect
        class AccessSchedule
        @JsonCreator
        private constructor(
            @JsonProperty("schedule_items")
            @ExcludeMissing
            private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /** Defaults to USD (cents) if not passed */
            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /** Defaults to USD (cents) if not passed */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AccessSchedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccessSchedule]. */
            class Builder internal constructor() {

                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    scheduleItems = accessSchedule.scheduleItems.map { it.toMutableList() }
                    creditTypeId = accessSchedule.creditTypeId
                    additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                }

                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                /** RFC 3339 timestamp (exclusive) */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                /** RFC 3339 timestamp (inclusive) */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /** RFC 3339 timestamp (exclusive) */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /** RFC 3339 timestamp (inclusive) */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    endingBefore()
                    startingAt()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        endingBefore = scheduleItem.endingBefore
                        startingAt = scheduleItem.startingAt
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("amount", amount),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("startingAt", startingAt),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && scheduleItems == other.scheduleItems && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(scheduleItems, creditTypeId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            /** An enum containing [RateType]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RateType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [RateType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Credit && accessSchedule == other.accessSchedule && productId == other.productId && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && specifiers == other.specifiers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessSchedule, productId, applicableProductIds, applicableProductTags, customFields, description, hierarchyConfiguration, name, netsuiteSalesOrderId, priority, rateType, specifiers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credit{accessSchedule=$accessSchedule, productId=$productId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, specifiers=$specifiers, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Discount
    @JsonCreator
    private constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule")
        @ExcludeMissing
        private val schedule: JsonField<Schedule> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun productId(): String = productId.getRequired("product_id")

        /** Must provide either schedule_items or recurring_schedule. */
        fun schedule(): Schedule = schedule.getRequired("schedule")

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** displayed on invoices */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** displayed on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Discount = apply {
            if (validated) {
                return@apply
            }

            productId()
            schedule().validate()
            customFields().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Discount]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var schedule: JsonField<Schedule>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(discount: Discount) = apply {
                productId = discount.productId
                schedule = discount.schedule
                customFields = discount.customFields
                name = discount.name
                netsuiteSalesOrderId = discount.netsuiteSalesOrderId
                additionalProperties = discount.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Discount =
                Discount(
                    checkRequired("productId", productId),
                    checkRequired("schedule", schedule),
                    customFields,
                    name,
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Must provide either schedule_items or recurring_schedule. */
        @NoAutoDetect
        class Schedule
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            private val doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            private val recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
            @JsonProperty("schedule_items")
            @ExcludeMissing
            private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Defaults to USD (cents) if not passed. */
            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             */
            fun doNotInvoice(): Optional<Boolean> =
                Optional.ofNullable(doNotInvoice.getNullable("do_not_invoice"))

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            fun recurringSchedule(): Optional<RecurringSchedule> =
                Optional.ofNullable(recurringSchedule.getNullable("recurring_schedule"))

            /** Either provide amount or provide both unit_price and quantity. */
            fun scheduleItems(): Optional<List<ScheduleItem>> =
                Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

            /** Defaults to USD (cents) if not passed. */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             */
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Schedule = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                doNotInvoice()
                recurringSchedule().ifPresent { it.validate() }
                scheduleItems().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Schedule]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
                    doNotInvoice = schedule.doNotInvoice
                    recurringSchedule = schedule.recurringSchedule
                    scheduleItems = schedule.scheduleItems.map { it.toMutableList() }
                    additionalProperties = schedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                    this.doNotInvoice = doNotInvoice
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                    recurringSchedule(JsonField.of(recurringSchedule))

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(scheduleItem)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        doNotInvoice,
                        recurringSchedule,
                        (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @NoAutoDetect
            class RecurringSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("amount_distribution")
                @ExcludeMissing
                private val amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                private val frequency: JsonField<Frequency> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amountDistribution(): AmountDistribution =
                    amountDistribution.getRequired("amount_distribution")

                /** RFC 3339 timestamp (exclusive). */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                fun frequency(): Frequency = frequency.getRequired("frequency")

                /** RFC 3339 timestamp (inclusive). */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                @JsonProperty("amount_distribution")
                @ExcludeMissing
                fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<Frequency> = frequency

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): RecurringSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDistribution()
                    endingBefore()
                    frequency()
                    startingAt()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringSchedule]. */
                class Builder internal constructor() {

                    private var amountDistribution: JsonField<AmountDistribution>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var frequency: JsonField<Frequency>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        amountDistribution = recurringSchedule.amountDistribution
                        endingBefore = recurringSchedule.endingBefore
                        frequency = recurringSchedule.frequency
                        startingAt = recurringSchedule.startingAt
                        amount = recurringSchedule.amount
                        quantity = recurringSchedule.quantity
                        unitPrice = recurringSchedule.unitPrice
                        additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                    }

                    fun amountDistribution(amountDistribution: AmountDistribution) =
                        amountDistribution(JsonField.of(amountDistribution))

                    fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) =
                        apply {
                            this.amountDistribution = amountDistribution
                        }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                    fun frequency(frequency: JsonField<Frequency>) = apply {
                        this.frequency = frequency
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkRequired("amountDistribution", amountDistribution),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("frequency", frequency),
                            checkRequired("startingAt", startingAt),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                class AmountDistribution
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    /** An enum containing [AmountDistribution]'s known values. */
                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    /**
                     * An enum containing [AmountDistribution]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [AmountDistribution] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        /**
                         * An enum member indicating that [AmountDistribution] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DIVIDED -> Known.DIVIDED
                            DIVIDED_ROUNDED -> Known.DIVIDED_ROUNDED
                            EACH -> Known.EACH
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown AmountDistribution: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    /** An enum containing [Frequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    /**
                     * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Frequency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        /**
                         * An enum member indicating that [Frequency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && amountDistribution == other.amountDistribution && endingBefore == other.endingBefore && frequency == other.frequency && startingAt == other.startingAt && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDistribution, endingBefore, frequency, startingAt, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** timestamp of the scheduled event */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    timestamp()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        timestamp = scheduleItem.timestamp
                        amount = scheduleItem.amount
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("timestamp", timestamp),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && doNotInvoice == other.doNotInvoice && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && productId == other.productId && schedule == other.schedule && customFields == other.customFields && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, schedule, customFields, name, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Discount{productId=$productId, schedule=$schedule, customFields=$customFields, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class HierarchyConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<Parent> = JsonMissing.of(),
        @JsonProperty("parent_behavior")
        @ExcludeMissing
        private val parentBehavior: JsonField<ParentBehavior> = JsonMissing.of(),
        @JsonProperty("payer")
        @ExcludeMissing
        private val payer: JsonField<Payer> = JsonMissing.of(),
        @JsonProperty("usage_statement_behavior")
        @ExcludeMissing
        private val usageStatementBehavior: JsonField<UsageStatementBehavior> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun parent(): Optional<Parent> = Optional.ofNullable(parent.getNullable("parent"))

        fun parentBehavior(): Optional<ParentBehavior> =
            Optional.ofNullable(parentBehavior.getNullable("parent_behavior"))

        /**
         * Indicates which customer should pay for the child's invoice charges
         *
         * **SELF**: The child pays for its own invoice charges
         *
         * **PARENT**: The parent pays for the child's invoice charges
         */
        fun payer(): Optional<Payer> = Optional.ofNullable(payer.getNullable("payer"))

        /**
         * Indicates the behavior of the child's invoice statements on the parent's invoices.
         *
         * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
         * invoices
         *
         * **SEPARATE**: Child's invoice statements will appear not appear on parent's consolidated
         * invoices
         */
        fun usageStatementBehavior(): Optional<UsageStatementBehavior> =
            Optional.ofNullable(usageStatementBehavior.getNullable("usage_statement_behavior"))

        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        @JsonProperty("parent_behavior")
        @ExcludeMissing
        fun _parentBehavior(): JsonField<ParentBehavior> = parentBehavior

        /**
         * Indicates which customer should pay for the child's invoice charges
         *
         * **SELF**: The child pays for its own invoice charges
         *
         * **PARENT**: The parent pays for the child's invoice charges
         */
        @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<Payer> = payer

        /**
         * Indicates the behavior of the child's invoice statements on the parent's invoices.
         *
         * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
         * invoices
         *
         * **SEPARATE**: Child's invoice statements will appear not appear on parent's consolidated
         * invoices
         */
        @JsonProperty("usage_statement_behavior")
        @ExcludeMissing
        fun _usageStatementBehavior(): JsonField<UsageStatementBehavior> = usageStatementBehavior

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): HierarchyConfiguration = apply {
            if (validated) {
                return@apply
            }

            parent().ifPresent { it.validate() }
            parentBehavior().ifPresent { it.validate() }
            payer()
            usageStatementBehavior()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [HierarchyConfiguration]. */
        class Builder internal constructor() {

            private var parent: JsonField<Parent> = JsonMissing.of()
            private var parentBehavior: JsonField<ParentBehavior> = JsonMissing.of()
            private var payer: JsonField<Payer> = JsonMissing.of()
            private var usageStatementBehavior: JsonField<UsageStatementBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hierarchyConfiguration: HierarchyConfiguration) = apply {
                parent = hierarchyConfiguration.parent
                parentBehavior = hierarchyConfiguration.parentBehavior
                payer = hierarchyConfiguration.payer
                usageStatementBehavior = hierarchyConfiguration.usageStatementBehavior
                additionalProperties = hierarchyConfiguration.additionalProperties.toMutableMap()
            }

            fun parent(parent: Parent) = parent(JsonField.of(parent))

            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

            fun parentBehavior(parentBehavior: ParentBehavior) =
                parentBehavior(JsonField.of(parentBehavior))

            fun parentBehavior(parentBehavior: JsonField<ParentBehavior>) = apply {
                this.parentBehavior = parentBehavior
            }

            /**
             * Indicates which customer should pay for the child's invoice charges
             *
             * **SELF**: The child pays for its own invoice charges
             *
             * **PARENT**: The parent pays for the child's invoice charges
             */
            fun payer(payer: Payer) = payer(JsonField.of(payer))

            /**
             * Indicates which customer should pay for the child's invoice charges
             *
             * **SELF**: The child pays for its own invoice charges
             *
             * **PARENT**: The parent pays for the child's invoice charges
             */
            fun payer(payer: JsonField<Payer>) = apply { this.payer = payer }

            /**
             * Indicates the behavior of the child's invoice statements on the parent's invoices.
             *
             * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
             * invoices
             *
             * **SEPARATE**: Child's invoice statements will appear not appear on parent's
             * consolidated invoices
             */
            fun usageStatementBehavior(usageStatementBehavior: UsageStatementBehavior) =
                usageStatementBehavior(JsonField.of(usageStatementBehavior))

            /**
             * Indicates the behavior of the child's invoice statements on the parent's invoices.
             *
             * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
             * invoices
             *
             * **SEPARATE**: Child's invoice statements will appear not appear on parent's
             * consolidated invoices
             */
            fun usageStatementBehavior(usageStatementBehavior: JsonField<UsageStatementBehavior>) =
                apply {
                    this.usageStatementBehavior = usageStatementBehavior
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): HierarchyConfiguration =
                HierarchyConfiguration(
                    parent,
                    parentBehavior,
                    payer,
                    usageStatementBehavior,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Parent
        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            private val customerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun contractId(): String = contractId.getRequired("contract_id")

            fun customerId(): String = customerId.getRequired("customer_id")

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Parent = apply {
                if (validated) {
                    return@apply
                }

                contractId()
                customerId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Parent]. */
            class Builder internal constructor() {

                private var contractId: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parent: Parent) = apply {
                    contractId = parent.contractId
                    customerId = parent.customerId
                    additionalProperties = parent.additionalProperties.toMutableMap()
                }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Parent =
                    Parent(
                        checkRequired("contractId", contractId),
                        checkRequired("customerId", customerId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parent && contractId == other.contractId && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(contractId, customerId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parent{contractId=$contractId, customerId=$customerId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ParentBehavior
        @JsonCreator
        private constructor(
            @JsonProperty("invoice_consolidation_type")
            @ExcludeMissing
            private val invoiceConsolidationType: JsonField<InvoiceConsolidationType> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Indicates the desired behavior of consolidated invoices generated by the parent in a
             * customer hierarchy
             *
             * **CONCATENATE**: Statements on the invoices of child customers will be appended to
             * the consolidated invoice
             *
             * **NONE**: Do not generate consolidated invoices
             */
            fun invoiceConsolidationType(): Optional<InvoiceConsolidationType> =
                Optional.ofNullable(
                    invoiceConsolidationType.getNullable("invoice_consolidation_type")
                )

            /**
             * Indicates the desired behavior of consolidated invoices generated by the parent in a
             * customer hierarchy
             *
             * **CONCATENATE**: Statements on the invoices of child customers will be appended to
             * the consolidated invoice
             *
             * **NONE**: Do not generate consolidated invoices
             */
            @JsonProperty("invoice_consolidation_type")
            @ExcludeMissing
            fun _invoiceConsolidationType(): JsonField<InvoiceConsolidationType> =
                invoiceConsolidationType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ParentBehavior = apply {
                if (validated) {
                    return@apply
                }

                invoiceConsolidationType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ParentBehavior]. */
            class Builder internal constructor() {

                private var invoiceConsolidationType: JsonField<InvoiceConsolidationType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parentBehavior: ParentBehavior) = apply {
                    invoiceConsolidationType = parentBehavior.invoiceConsolidationType
                    additionalProperties = parentBehavior.additionalProperties.toMutableMap()
                }

                /**
                 * Indicates the desired behavior of consolidated invoices generated by the parent
                 * in a customer hierarchy
                 *
                 * **CONCATENATE**: Statements on the invoices of child customers will be appended
                 * to the consolidated invoice
                 *
                 * **NONE**: Do not generate consolidated invoices
                 */
                fun invoiceConsolidationType(invoiceConsolidationType: InvoiceConsolidationType) =
                    invoiceConsolidationType(JsonField.of(invoiceConsolidationType))

                /**
                 * Indicates the desired behavior of consolidated invoices generated by the parent
                 * in a customer hierarchy
                 *
                 * **CONCATENATE**: Statements on the invoices of child customers will be appended
                 * to the consolidated invoice
                 *
                 * **NONE**: Do not generate consolidated invoices
                 */
                fun invoiceConsolidationType(
                    invoiceConsolidationType: JsonField<InvoiceConsolidationType>
                ) = apply { this.invoiceConsolidationType = invoiceConsolidationType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ParentBehavior =
                    ParentBehavior(invoiceConsolidationType, additionalProperties.toImmutable())
            }

            /**
             * Indicates the desired behavior of consolidated invoices generated by the parent in a
             * customer hierarchy
             *
             * **CONCATENATE**: Statements on the invoices of child customers will be appended to
             * the consolidated invoice
             *
             * **NONE**: Do not generate consolidated invoices
             */
            class InvoiceConsolidationType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CONCATENATE = of("CONCATENATE")

                    @JvmField val NONE = of("NONE")

                    @JvmStatic fun of(value: String) = InvoiceConsolidationType(JsonField.of(value))
                }

                /** An enum containing [InvoiceConsolidationType]'s known values. */
                enum class Known {
                    CONCATENATE,
                    NONE,
                }

                /**
                 * An enum containing [InvoiceConsolidationType]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [InvoiceConsolidationType] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONCATENATE,
                    NONE,
                    /**
                     * An enum member indicating that [InvoiceConsolidationType] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONCATENATE -> Value.CONCATENATE
                        NONE -> Value.NONE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONCATENATE -> Known.CONCATENATE
                        NONE -> Known.NONE
                        else ->
                            throw MetronomeInvalidDataException(
                                "Unknown InvoiceConsolidationType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceConsolidationType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ParentBehavior && invoiceConsolidationType == other.invoiceConsolidationType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(invoiceConsolidationType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ParentBehavior{invoiceConsolidationType=$invoiceConsolidationType, additionalProperties=$additionalProperties}"
        }

        /**
         * Indicates which customer should pay for the child's invoice charges
         *
         * **SELF**: The child pays for its own invoice charges
         *
         * **PARENT**: The parent pays for the child's invoice charges
         */
        class Payer @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SELF = of("SELF")

                @JvmField val PARENT = of("PARENT")

                @JvmStatic fun of(value: String) = Payer(JsonField.of(value))
            }

            /** An enum containing [Payer]'s known values. */
            enum class Known {
                SELF,
                PARENT,
            }

            /**
             * An enum containing [Payer]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Payer] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SELF,
                PARENT,
                /**
                 * An enum member indicating that [Payer] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SELF -> Value.SELF
                    PARENT -> Value.PARENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SELF -> Known.SELF
                    PARENT -> Known.PARENT
                    else -> throw MetronomeInvalidDataException("Unknown Payer: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Payer && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Indicates the behavior of the child's invoice statements on the parent's invoices.
         *
         * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
         * invoices
         *
         * **SEPARATE**: Child's invoice statements will appear not appear on parent's consolidated
         * invoices
         */
        class UsageStatementBehavior
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CONSOLIDATE = of("CONSOLIDATE")

                @JvmField val SEPARATE = of("SEPARATE")

                @JvmStatic fun of(value: String) = UsageStatementBehavior(JsonField.of(value))
            }

            /** An enum containing [UsageStatementBehavior]'s known values. */
            enum class Known {
                CONSOLIDATE,
                SEPARATE,
            }

            /**
             * An enum containing [UsageStatementBehavior]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [UsageStatementBehavior] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONSOLIDATE,
                SEPARATE,
                /**
                 * An enum member indicating that [UsageStatementBehavior] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CONSOLIDATE -> Value.CONSOLIDATE
                    SEPARATE -> Value.SEPARATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CONSOLIDATE -> Known.CONSOLIDATE
                    SEPARATE -> Known.SEPARATE
                    else ->
                        throw MetronomeInvalidDataException(
                            "Unknown UsageStatementBehavior: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageStatementBehavior && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HierarchyConfiguration && parent == other.parent && parentBehavior == other.parentBehavior && payer == other.payer && usageStatementBehavior == other.usageStatementBehavior && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parent, parentBehavior, payer, usageStatementBehavior, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "HierarchyConfiguration{parent=$parent, parentBehavior=$parentBehavior, payer=$payer, usageStatementBehavior=$usageStatementBehavior, additionalProperties=$additionalProperties}"
    }

    /**
     * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
     * automatically. EXPLICIT prioritization requires specifying priorities for each multiplier;
     * the one with the lowest priority value will be prioritized first. If tiered overrides are
     * used, prioritization must be explicit.
     */
    class MultiplierOverridePrioritization
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LOWEST_MULTIPLIER = of("LOWEST_MULTIPLIER")

            @JvmField val EXPLICIT = of("EXPLICIT")

            @JvmStatic fun of(value: String) = MultiplierOverridePrioritization(JsonField.of(value))
        }

        /** An enum containing [MultiplierOverridePrioritization]'s known values. */
        enum class Known {
            LOWEST_MULTIPLIER,
            EXPLICIT,
        }

        /**
         * An enum containing [MultiplierOverridePrioritization]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [MultiplierOverridePrioritization] can contain an unknown value in a
         * couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOWEST_MULTIPLIER,
            EXPLICIT,
            /**
             * An enum member indicating that [MultiplierOverridePrioritization] was instantiated
             * with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LOWEST_MULTIPLIER -> Value.LOWEST_MULTIPLIER
                EXPLICIT -> Value.EXPLICIT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LOWEST_MULTIPLIER -> Known.LOWEST_MULTIPLIER
                EXPLICIT -> Known.EXPLICIT
                else ->
                    throw MetronomeInvalidDataException(
                        "Unknown MultiplierOverridePrioritization: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MultiplierOverridePrioritization && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Override
    @JsonCreator
    private constructor(
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entitled")
        @ExcludeMissing
        private val entitled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_commit_specific")
        @ExcludeMissing
        private val isCommitSpecific: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("multiplier")
        @ExcludeMissing
        private val multiplier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("override_specifiers")
        @ExcludeMissing
        private val overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of(),
        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        private val overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target")
        @ExcludeMissing
        private val target: JsonField<Target> = JsonMissing.of(),
        @JsonProperty("tiers")
        @ExcludeMissing
        private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * tags identifying products whose rates are being overridden. Cannot be used in conjunction
         * with override_specifiers.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun entitled(): Optional<Boolean> = Optional.ofNullable(entitled.getNullable("entitled"))

        /**
         * Indicates whether the override should only apply to commits. Defaults to `false`. If
         * `true`, you can specify relevant commits in `override_specifiers` by passing
         * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
         * consuming any prepaid or postpaid commit.
         */
        fun isCommitSpecific(): Optional<Boolean> =
            Optional.ofNullable(isCommitSpecific.getNullable("is_commit_specific"))

        /** Required for MULTIPLIER type. Must be >=0. */
        fun multiplier(): Optional<Double> =
            Optional.ofNullable(multiplier.getNullable("multiplier"))

        /**
         * Cannot be used in conjunction with product_id or applicable_product_tags. If provided,
         * the override will apply to all products with the specified specifiers.
         */
        fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
            Optional.ofNullable(overrideSpecifiers.getNullable("override_specifiers"))

        /** Required for OVERWRITE type. */
        fun overwriteRate(): Optional<OverwriteRate> =
            Optional.ofNullable(overwriteRate.getNullable("overwrite_rate"))

        /**
         * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides. Under
         * EXPLICIT prioritization, overwrites are prioritized first, and then tiered and multiplier
         * overrides are prioritized by their priority value (lowest first). Must be > 0.
         */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        /**
         * ID of the product whose rate is being overridden. Cannot be used in conjunction with
         * override_specifiers.
         */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         */
        fun target(): Optional<Target> = Optional.ofNullable(target.getNullable("target"))

        /** Required for TIERED type. Must have at least one tier. */
        fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

        /** Overwrites are prioritized over multipliers and tiered overrides. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * tags identifying products whose rates are being overridden. Cannot be used in conjunction
         * with override_specifiers.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

        /**
         * Indicates whether the override should only apply to commits. Defaults to `false`. If
         * `true`, you can specify relevant commits in `override_specifiers` by passing
         * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
         * consuming any prepaid or postpaid commit.
         */
        @JsonProperty("is_commit_specific")
        @ExcludeMissing
        fun _isCommitSpecific(): JsonField<Boolean> = isCommitSpecific

        /** Required for MULTIPLIER type. Must be >=0. */
        @JsonProperty("multiplier")
        @ExcludeMissing
        fun _multiplier(): JsonField<Double> = multiplier

        /**
         * Cannot be used in conjunction with product_id or applicable_product_tags. If provided,
         * the override will apply to all products with the specified specifiers.
         */
        @JsonProperty("override_specifiers")
        @ExcludeMissing
        fun _overrideSpecifiers(): JsonField<List<OverrideSpecifier>> = overrideSpecifiers

        /** Required for OVERWRITE type. */
        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        fun _overwriteRate(): JsonField<OverwriteRate> = overwriteRate

        /**
         * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides. Under
         * EXPLICIT prioritization, overwrites are prioritized first, and then tiered and multiplier
         * overrides are prioritized by their priority value (lowest first). Must be > 0.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * ID of the product whose rate is being overridden. Cannot be used in conjunction with
         * override_specifiers.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /** Required for TIERED type. Must have at least one tier. */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        /** Overwrites are prioritized over multipliers and tiered overrides. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Override = apply {
            if (validated) {
                return@apply
            }

            startingAt()
            applicableProductTags()
            endingBefore()
            entitled()
            isCommitSpecific()
            multiplier()
            overrideSpecifiers().ifPresent { it.forEach { it.validate() } }
            overwriteRate().ifPresent { it.validate() }
            priority()
            productId()
            target()
            tiers().ifPresent { it.forEach { it.validate() } }
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Override]. */
        class Builder internal constructor() {

            private var startingAt: JsonField<OffsetDateTime>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var entitled: JsonField<Boolean> = JsonMissing.of()
            private var isCommitSpecific: JsonField<Boolean> = JsonMissing.of()
            private var multiplier: JsonField<Double> = JsonMissing.of()
            private var overrideSpecifiers: JsonField<MutableList<OverrideSpecifier>>? = null
            private var overwriteRate: JsonField<OverwriteRate> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var target: JsonField<Target> = JsonMissing.of()
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                startingAt = override.startingAt
                applicableProductTags = override.applicableProductTags.map { it.toMutableList() }
                endingBefore = override.endingBefore
                entitled = override.entitled
                isCommitSpecific = override.isCommitSpecific
                multiplier = override.multiplier
                overrideSpecifiers = override.overrideSpecifiers.map { it.toMutableList() }
                overwriteRate = override.overwriteRate
                priority = override.priority
                productId = override.productId
                target = override.target
                tiers = override.tiers.map { it.toMutableList() }
                type = override.type
                additionalProperties = override.additionalProperties.toMutableMap()
            }

            /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

            /**
             * Indicates whether the override should only apply to commits. Defaults to `false`. If
             * `true`, you can specify relevant commits in `override_specifiers` by passing
             * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
             * consuming any prepaid or postpaid commit.
             */
            fun isCommitSpecific(isCommitSpecific: Boolean) =
                isCommitSpecific(JsonField.of(isCommitSpecific))

            /**
             * Indicates whether the override should only apply to commits. Defaults to `false`. If
             * `true`, you can specify relevant commits in `override_specifiers` by passing
             * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
             * consuming any prepaid or postpaid commit.
             */
            fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
                this.isCommitSpecific = isCommitSpecific
            }

            /** Required for MULTIPLIER type. Must be >=0. */
            fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

            /** Required for MULTIPLIER type. Must be >=0. */
            fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
                overrideSpecifiers(JsonField.of(overrideSpecifiers))

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
                this.overrideSpecifiers = overrideSpecifiers.map { it.toMutableList() }
            }

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            fun addOverrideSpecifier(overrideSpecifier: OverrideSpecifier) = apply {
                overrideSpecifiers =
                    (overrideSpecifiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(overrideSpecifier)
                    }
            }

            /** Required for OVERWRITE type. */
            fun overwriteRate(overwriteRate: OverwriteRate) =
                overwriteRate(JsonField.of(overwriteRate))

            /** Required for OVERWRITE type. */
            fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
                this.overwriteRate = overwriteRate
            }

            /**
             * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides.
             * Under EXPLICIT prioritization, overwrites are prioritized first, and then tiered and
             * multiplier overrides are prioritized by their priority value (lowest first). Must
             * be > 0.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides.
             * Under EXPLICIT prioritization, overwrites are prioritized first, and then tiered and
             * multiplier overrides are prioritized by their priority value (lowest first). Must
             * be > 0.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            /**
             * ID of the product whose rate is being overridden. Cannot be used in conjunction with
             * override_specifiers.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * ID of the product whose rate is being overridden. Cannot be used in conjunction with
             * override_specifiers.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Indicates whether the override applies to commit rates or list rates. Can only be
             * used for overrides that have `is_commit_specific` set to `true`. Defaults to
             * `"LIST_RATE"`.
             */
            fun target(target: Target) = target(JsonField.of(target))

            /**
             * Indicates whether the override applies to commit rates or list rates. Can only be
             * used for overrides that have `is_commit_specific` set to `true`. Defaults to
             * `"LIST_RATE"`.
             */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            /** Required for TIERED type. Must have at least one tier. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /** Required for TIERED type. Must have at least one tier. */
            fun tiers(tiers: JsonField<List<Tier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /** Required for TIERED type. Must have at least one tier. */
            fun addTier(tier: Tier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(tier)
                    }
            }

            /** Overwrites are prioritized over multipliers and tiered overrides. */
            fun type(type: Type) = type(JsonField.of(type))

            /** Overwrites are prioritized over multipliers and tiered overrides. */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Override =
                Override(
                    checkRequired("startingAt", startingAt),
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    endingBefore,
                    entitled,
                    isCommitSpecific,
                    multiplier,
                    (overrideSpecifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    overwriteRate,
                    priority,
                    productId,
                    target,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class OverrideSpecifier
        @JsonCreator
        private constructor(
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
            @JsonProperty("commit_ids")
            @ExcludeMissing
            private val commitIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            private val presentationGroupValues: JsonField<PresentationGroupValues> =
                JsonMissing.of(),
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            private val productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_tags")
            @ExcludeMissing
            private val productTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("recurring_commit_ids")
            @ExcludeMissing
            private val recurringCommitIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("recurring_credit_ids")
            @ExcludeMissing
            private val recurringCreditIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun billingFrequency(): Optional<BillingFrequency> =
                Optional.ofNullable(billingFrequency.getNullable("billing_frequency"))

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to the
             * specified commits. If not provided, the override will apply to all commits.
             */
            fun commitIds(): Optional<List<String>> =
                Optional.ofNullable(commitIds.getNullable("commit_ids"))

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             */
            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                Optional.ofNullable(
                    presentationGroupValues.getNullable("presentation_group_values")
                )

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            fun pricingGroupValues(): Optional<PricingGroupValues> =
                Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

            /** If provided, the override will only apply to the product with the specified ID. */
            fun productId(): Optional<String> =
                Optional.ofNullable(productId.getNullable("product_id"))

            /**
             * If provided, the override will only apply to products with all the specified tags.
             */
            fun productTags(): Optional<List<String>> =
                Optional.ofNullable(productTags.getNullable("product_tags"))

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to commits
             * created by the specified recurring commit ids.
             */
            fun recurringCommitIds(): Optional<List<String>> =
                Optional.ofNullable(recurringCommitIds.getNullable("recurring_commit_ids"))

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to credits
             * created by the specified recurring credit ids.
             */
            fun recurringCreditIds(): Optional<List<String>> =
                Optional.ofNullable(recurringCreditIds.getNullable("recurring_credit_ids"))

            @JsonProperty("billing_frequency")
            @ExcludeMissing
            fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to the
             * specified commits. If not provided, the override will apply to all commits.
             */
            @JsonProperty("commit_ids")
            @ExcludeMissing
            fun _commitIds(): JsonField<List<String>> = commitIds

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             */
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun _presentationGroupValues(): JsonField<PresentationGroupValues> =
                presentationGroupValues

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

            /** If provided, the override will only apply to the product with the specified ID. */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /**
             * If provided, the override will only apply to products with all the specified tags.
             */
            @JsonProperty("product_tags")
            @ExcludeMissing
            fun _productTags(): JsonField<List<String>> = productTags

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to commits
             * created by the specified recurring commit ids.
             */
            @JsonProperty("recurring_commit_ids")
            @ExcludeMissing
            fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to credits
             * created by the specified recurring credit ids.
             */
            @JsonProperty("recurring_credit_ids")
            @ExcludeMissing
            fun _recurringCreditIds(): JsonField<List<String>> = recurringCreditIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OverrideSpecifier = apply {
                if (validated) {
                    return@apply
                }

                billingFrequency()
                commitIds()
                presentationGroupValues().ifPresent { it.validate() }
                pricingGroupValues().ifPresent { it.validate() }
                productId()
                productTags()
                recurringCommitIds()
                recurringCreditIds()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OverrideSpecifier]. */
            class Builder internal constructor() {

                private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
                private var commitIds: JsonField<MutableList<String>>? = null
                private var presentationGroupValues: JsonField<PresentationGroupValues> =
                    JsonMissing.of()
                private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
                private var productId: JsonField<String> = JsonMissing.of()
                private var productTags: JsonField<MutableList<String>>? = null
                private var recurringCommitIds: JsonField<MutableList<String>>? = null
                private var recurringCreditIds: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideSpecifier: OverrideSpecifier) = apply {
                    billingFrequency = overrideSpecifier.billingFrequency
                    commitIds = overrideSpecifier.commitIds.map { it.toMutableList() }
                    presentationGroupValues = overrideSpecifier.presentationGroupValues
                    pricingGroupValues = overrideSpecifier.pricingGroupValues
                    productId = overrideSpecifier.productId
                    productTags = overrideSpecifier.productTags.map { it.toMutableList() }
                    recurringCommitIds =
                        overrideSpecifier.recurringCommitIds.map { it.toMutableList() }
                    recurringCreditIds =
                        overrideSpecifier.recurringCreditIds.map { it.toMutableList() }
                    additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
                }

                fun billingFrequency(billingFrequency: BillingFrequency) =
                    billingFrequency(JsonField.of(billingFrequency))

                fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                    this.billingFrequency = billingFrequency
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun commitIds(commitIds: JsonField<List<String>>) = apply {
                    this.commitIds = commitIds.map { it.toMutableList() }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun addCommitId(commitId: String) = apply {
                    commitIds =
                        (commitIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(commitId)
                        }
                }

                /**
                 * A map of group names to values. The override will only apply to line items with
                 * the specified presentation group values.
                 */
                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    presentationGroupValues(JsonField.of(presentationGroupValues))

                /**
                 * A map of group names to values. The override will only apply to line items with
                 * the specified presentation group values.
                 */
                fun presentationGroupValues(
                    presentationGroupValues: JsonField<PresentationGroupValues>
                ) = apply { this.presentationGroupValues = presentationGroupValues }

                /**
                 * A map of pricing group names to values. The override will only apply to products
                 * with the specified pricing group values.
                 */
                fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                    pricingGroupValues(JsonField.of(pricingGroupValues))

                /**
                 * A map of pricing group names to values. The override will only apply to products
                 * with the specified pricing group values.
                 */
                fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                /**
                 * If provided, the override will only apply to the product with the specified ID.
                 */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * If provided, the override will only apply to the product with the specified ID.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun productTags(productTags: JsonField<List<String>>) = apply {
                    this.productTags = productTags.map { it.toMutableList() }
                }

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun addProductTag(productTag: String) = apply {
                    productTags =
                        (productTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(productTag)
                        }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to commits
                 * created by the specified recurring commit ids.
                 */
                fun recurringCommitIds(recurringCommitIds: List<String>) =
                    recurringCommitIds(JsonField.of(recurringCommitIds))

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to commits
                 * created by the specified recurring commit ids.
                 */
                fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                    this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to commits
                 * created by the specified recurring commit ids.
                 */
                fun addRecurringCommitId(recurringCommitId: String) = apply {
                    recurringCommitIds =
                        (recurringCommitIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(recurringCommitId)
                        }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to credits
                 * created by the specified recurring credit ids.
                 */
                fun recurringCreditIds(recurringCreditIds: List<String>) =
                    recurringCreditIds(JsonField.of(recurringCreditIds))

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to credits
                 * created by the specified recurring credit ids.
                 */
                fun recurringCreditIds(recurringCreditIds: JsonField<List<String>>) = apply {
                    this.recurringCreditIds = recurringCreditIds.map { it.toMutableList() }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to credits
                 * created by the specified recurring credit ids.
                 */
                fun addRecurringCreditId(recurringCreditId: String) = apply {
                    recurringCreditIds =
                        (recurringCreditIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(recurringCreditId)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): OverrideSpecifier =
                    OverrideSpecifier(
                        billingFrequency,
                        (commitIds ?: JsonMissing.of()).map { it.toImmutable() },
                        presentationGroupValues,
                        pricingGroupValues,
                        productId,
                        (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                        (recurringCommitIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (recurringCreditIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class BillingFrequency
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val QUARTERLY = of("QUARTERLY")

                    @JvmField val ANNUAL = of("ANNUAL")

                    @JvmField val WEEKLY = of("WEEKLY")

                    @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
                }

                /** An enum containing [BillingFrequency]'s known values. */
                enum class Known {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                }

                /**
                 * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BillingFrequency] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                    /**
                     * An enum member indicating that [BillingFrequency] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ANNUAL -> Value.ANNUAL
                        WEEKLY -> Value.WEEKLY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ANNUAL -> Known.ANNUAL
                        WEEKLY -> Known.WEEKLY
                        else ->
                            throw MetronomeInvalidDataException("Unknown BillingFrequency: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillingFrequency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             */
            @NoAutoDetect
            class PresentationGroupValues
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PresentationGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PresentationGroupValues]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                        additionalProperties =
                            presentationGroupValues.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): PresentationGroupValues =
                        PresentationGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PresentationGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PresentationGroupValues{additionalProperties=$additionalProperties}"
            }

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            @NoAutoDetect
            class PricingGroupValues
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PricingGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PricingGroupValues]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                        additionalProperties =
                            pricingGroupValues.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): PricingGroupValues =
                        PricingGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PricingGroupValues{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideSpecifier && billingFrequency == other.billingFrequency && commitIds == other.commitIds && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && productTags == other.productTags && recurringCommitIds == other.recurringCommitIds && recurringCreditIds == other.recurringCreditIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(billingFrequency, commitIds, presentationGroupValues, pricingGroupValues, productId, productTags, recurringCommitIds, recurringCreditIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverrideSpecifier{billingFrequency=$billingFrequency, commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, recurringCommitIds=$recurringCommitIds, recurringCreditIds=$recurringCreditIds, additionalProperties=$additionalProperties}"
        }

        /** Required for OVERWRITE type. */
        @NoAutoDetect
        class OverwriteRate
        @JsonCreator
        private constructor(
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_rate")
            @ExcludeMissing
            private val customRate: JsonField<CustomRate> = JsonMissing.of(),
            @JsonProperty("is_prorated")
            @ExcludeMissing
            private val isProrated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("price")
            @ExcludeMissing
            private val price: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tiers")
            @ExcludeMissing
            private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun rateType(): RateType = rateType.getRequired("rate_type")

            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            fun customRate(): Optional<CustomRate> =
                Optional.ofNullable(customRate.getNullable("custom_rate"))

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            fun isProrated(): Optional<Boolean> =
                Optional.ofNullable(isProrated.getNullable("is_prorated"))

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             */
            fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /** Only set for TIERED rate_type. */
            fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @JsonProperty("custom_rate")
            @ExcludeMissing
            fun _customRate(): JsonField<CustomRate> = customRate

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun _isProrated(): JsonField<Boolean> = isProrated

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OverwriteRate = apply {
                if (validated) {
                    return@apply
                }

                rateType()
                creditTypeId()
                customRate().ifPresent { it.validate() }
                isProrated()
                price()
                quantity()
                tiers().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OverwriteRate]. */
            class Builder internal constructor() {

                private var rateType: JsonField<RateType>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var customRate: JsonField<CustomRate> = JsonMissing.of()
                private var isProrated: JsonField<Boolean> = JsonMissing.of()
                private var price: JsonField<Double> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var tiers: JsonField<MutableList<Tier>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overwriteRate: OverwriteRate) = apply {
                    rateType = overwriteRate.rateType
                    creditTypeId = overwriteRate.creditTypeId
                    customRate = overwriteRate.customRate
                    isProrated = overwriteRate.isProrated
                    price = overwriteRate.price
                    quantity = overwriteRate.quantity
                    tiers = overwriteRate.tiers.map { it.toMutableList() }
                    additionalProperties = overwriteRate.additionalProperties.toMutableMap()
                }

                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                fun customRate(customRate: CustomRate) = customRate(JsonField.of(customRate))

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                fun customRate(customRate: JsonField<CustomRate>) = apply {
                    this.customRate = customRate
                }

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                fun isProrated(isProrated: JsonField<Boolean>) = apply {
                    this.isProrated = isProrated
                }

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                fun price(price: Double) = price(JsonField.of(price))

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                fun price(price: JsonField<Double>) = apply { this.price = price }

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /** Only set for TIERED rate_type. */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /** Only set for TIERED rate_type. */
                fun tiers(tiers: JsonField<List<Tier>>) = apply {
                    this.tiers = tiers.map { it.toMutableList() }
                }

                /** Only set for TIERED rate_type. */
                fun addTier(tier: Tier) = apply {
                    tiers =
                        (tiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(tier)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): OverwriteRate =
                    OverwriteRate(
                        checkRequired("rateType", rateType),
                        creditTypeId,
                        customRate,
                        isProrated,
                        price,
                        quantity,
                        (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FLAT = of("FLAT")

                    @JvmField val PERCENTAGE = of("PERCENTAGE")

                    @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                    @JvmField val TIERED = of("TIERED")

                    @JvmField val TIERED_PERCENTAGE = of("TIERED_PERCENTAGE")

                    @JvmField val CUSTOM = of("CUSTOM")

                    @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
                }

                /** An enum containing [RateType]'s known values. */
                enum class Known {
                    FLAT,
                    PERCENTAGE,
                    SUBSCRIPTION,
                    TIERED,
                    TIERED_PERCENTAGE,
                    CUSTOM,
                }

                /**
                 * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RateType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FLAT,
                    PERCENTAGE,
                    SUBSCRIPTION,
                    TIERED,
                    TIERED_PERCENTAGE,
                    CUSTOM,
                    /**
                     * An enum member indicating that [RateType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FLAT -> Value.FLAT
                        PERCENTAGE -> Value.PERCENTAGE
                        SUBSCRIPTION -> Value.SUBSCRIPTION
                        TIERED -> Value.TIERED
                        TIERED_PERCENTAGE -> Value.TIERED_PERCENTAGE
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FLAT -> Known.FLAT
                        PERCENTAGE -> Known.PERCENTAGE
                        SUBSCRIPTION -> Known.SUBSCRIPTION
                        TIERED -> Known.TIERED
                        TIERED_PERCENTAGE -> Known.TIERED_PERCENTAGE
                        CUSTOM -> Known.CUSTOM
                        else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @NoAutoDetect
            class CustomRate
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CustomRate = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomRate]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customRate: CustomRate) = apply {
                        additionalProperties = customRate.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): CustomRate = CustomRate(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CustomRate && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "CustomRate{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverwriteRate && rateType == other.rateType && creditTypeId == other.creditTypeId && customRate == other.customRate && isProrated == other.isProrated && price == other.price && quantity == other.quantity && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(rateType, creditTypeId, customRate, isProrated, price, quantity, tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverwriteRate{rateType=$rateType, creditTypeId=$creditTypeId, customRate=$customRate, isProrated=$isProrated, price=$price, quantity=$quantity, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         */
        class Target @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = Target(JsonField.of(value))
            }

            /** An enum containing [Target]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [Target]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Target] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [Target] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown Target: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Target && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Tier
        @JsonCreator
        private constructor(
            @JsonProperty("multiplier")
            @ExcludeMissing
            private val multiplier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("size")
            @ExcludeMissing
            private val size: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun multiplier(): Double = multiplier.getRequired("multiplier")

            fun size(): Optional<Double> = Optional.ofNullable(size.getNullable("size"))

            @JsonProperty("multiplier")
            @ExcludeMissing
            fun _multiplier(): JsonField<Double> = multiplier

            @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                multiplier()
                size()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tier]. */
            class Builder internal constructor() {

                private var multiplier: JsonField<Double>? = null
                private var size: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tier: Tier) = apply {
                    multiplier = tier.multiplier
                    size = tier.size
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

                fun multiplier(multiplier: JsonField<Double>) = apply {
                    this.multiplier = multiplier
                }

                fun size(size: Double) = size(JsonField.of(size))

                fun size(size: JsonField<Double>) = apply { this.size = size }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Tier =
                    Tier(
                        checkRequired("multiplier", multiplier),
                        size,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tier && multiplier == other.multiplier && size == other.size && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(multiplier, size, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{multiplier=$multiplier, size=$size, additionalProperties=$additionalProperties}"
        }

        /** Overwrites are prioritized over multipliers and tiered overrides. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val OVERWRITE = of("OVERWRITE")

                @JvmField val MULTIPLIER = of("MULTIPLIER")

                @JvmField val TIERED = of("TIERED")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OVERWRITE,
                MULTIPLIER,
                TIERED,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OVERWRITE,
                MULTIPLIER,
                TIERED,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    OVERWRITE -> Value.OVERWRITE
                    MULTIPLIER -> Value.MULTIPLIER
                    TIERED -> Value.TIERED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    OVERWRITE -> Known.OVERWRITE
                    MULTIPLIER -> Known.MULTIPLIER
                    TIERED -> Known.TIERED
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Override && startingAt == other.startingAt && applicableProductTags == other.applicableProductTags && endingBefore == other.endingBefore && entitled == other.entitled && isCommitSpecific == other.isCommitSpecific && multiplier == other.multiplier && overrideSpecifiers == other.overrideSpecifiers && overwriteRate == other.overwriteRate && priority == other.priority && productId == other.productId && target == other.target && tiers == other.tiers && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startingAt, applicableProductTags, endingBefore, entitled, isCommitSpecific, multiplier, overrideSpecifiers, overwriteRate, priority, productId, target, tiers, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Override{startingAt=$startingAt, applicableProductTags=$applicableProductTags, endingBefore=$endingBefore, entitled=$entitled, isCommitSpecific=$isCommitSpecific, multiplier=$multiplier, overrideSpecifiers=$overrideSpecifiers, overwriteRate=$overwriteRate, priority=$priority, productId=$productId, target=$target, tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ProfessionalService
    @JsonCreator
    private constructor(
        @JsonProperty("max_amount")
        @ExcludeMissing
        private val maxAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit_price")
        @ExcludeMissing
        private val unitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Maximum amount for the term. */
        fun maxAmount(): Double = maxAmount.getRequired("max_amount")

        fun productId(): String = productId.getRequired("product_id")

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        fun unitPrice(): Double = unitPrice.getRequired("unit_price")

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /** Maximum amount for the term. */
        @JsonProperty("max_amount") @ExcludeMissing fun _maxAmount(): JsonField<Double> = maxAmount

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProfessionalService = apply {
            if (validated) {
                return@apply
            }

            maxAmount()
            productId()
            quantity()
            unitPrice()
            customFields().ifPresent { it.validate() }
            description()
            netsuiteSalesOrderId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProfessionalService]. */
        class Builder internal constructor() {

            private var maxAmount: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var unitPrice: JsonField<Double>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(professionalService: ProfessionalService) = apply {
                maxAmount = professionalService.maxAmount
                productId = professionalService.productId
                quantity = professionalService.quantity
                unitPrice = professionalService.unitPrice
                customFields = professionalService.customFields
                description = professionalService.description
                netsuiteSalesOrderId = professionalService.netsuiteSalesOrderId
                additionalProperties = professionalService.additionalProperties.toMutableMap()
            }

            /** Maximum amount for the term. */
            fun maxAmount(maxAmount: Double) = maxAmount(JsonField.of(maxAmount))

            /** Maximum amount for the term. */
            fun maxAmount(maxAmount: JsonField<Double>) = apply { this.maxAmount = maxAmount }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ProfessionalService =
                ProfessionalService(
                    checkRequired("maxAmount", maxAmount),
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    checkRequired("unitPrice", unitPrice),
                    customFields,
                    description,
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProfessionalService && maxAmount == other.maxAmount && productId == other.productId && quantity == other.quantity && unitPrice == other.unitPrice && customFields == other.customFields && description == other.description && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(maxAmount, productId, quantity, unitPrice, customFields, description, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProfessionalService{maxAmount=$maxAmount, productId=$productId, quantity=$quantity, unitPrice=$unitPrice, customFields=$customFields, description=$description, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RecurringCommit
    @JsonCreator
    private constructor(
        @JsonProperty("access_amount")
        @ExcludeMissing
        private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
        @JsonProperty("commit_duration")
        @ExcludeMissing
        private val commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
            JsonMissing.of(),
        @JsonProperty("invoice_amount")
        @ExcludeMissing
        private val invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proration")
        @ExcludeMissing
        private val proration: JsonField<Proration> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        private val recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        @JsonProperty("subscription_config")
        @ExcludeMissing
        private val subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of(),
        @JsonProperty("temporary_id")
        @ExcludeMissing
        private val temporaryId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount of commit to grant. */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

        /** Will be passed down to the individual commits */
        fun priority(): Double = priority.getRequired("priority")

        fun productId(): String = productId.getRequired("product_id")

        /** determines the start time for the first commit */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /** Will be passed down to the individual commits */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /** Will be passed down to the individual commits */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /** Will be passed down to the individual commits */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Determines when the contract will stop creating recurring commits. optional */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** Optional configuration for recurring commit/credit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /** The amount the customer should be billed for the commit. Not required. */
        fun invoiceAmount(): Optional<InvoiceAmount> =
            Optional.ofNullable(invoiceAmount.getNullable("invoice_amount"))

        /** displayed on invoices. will be passed through to the individual commits */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** Will be passed down to the individual commits */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         */
        fun proration(): Optional<Proration> =
            Optional.ofNullable(proration.getNullable("proration"))

        /** Whether the created commits will use the commit rate or list rate */
        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         */
        fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
            Optional.ofNullable(recurrenceFrequency.getNullable("recurrence_frequency"))

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        fun rolloverFraction(): Optional<Double> =
            Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** Attach a subscription to the recurring commit/credit. */
        fun subscriptionConfig(): Optional<SubscriptionConfig> =
            Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

        /**
         * A temporary ID that can be used to reference the recurring commit for commit specific
         * overrides.
         */
        fun temporaryId(): Optional<String> =
            Optional.ofNullable(temporaryId.getNullable("temporary_id"))

        /** The amount of commit to grant. */
        @JsonProperty("access_amount")
        @ExcludeMissing
        fun _accessAmount(): JsonField<AccessAmount> = accessAmount

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        @JsonProperty("commit_duration")
        @ExcludeMissing
        fun _commitDuration(): JsonField<CommitDuration> = commitDuration

        /** Will be passed down to the individual commits */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** determines the start time for the first commit */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /** Will be passed down to the individual commits */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /** Will be passed down to the individual commits */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /** Will be passed down to the individual commits */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Determines when the contract will stop creating recurring commits. optional */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /** Optional configuration for recurring commit/credit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /** The amount the customer should be billed for the commit. Not required. */
        @JsonProperty("invoice_amount")
        @ExcludeMissing
        fun _invoiceAmount(): JsonField<InvoiceAmount> = invoiceAmount

        /** displayed on invoices. will be passed through to the individual commits */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Will be passed down to the individual commits */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         */
        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

        /** Whether the created commits will use the commit rate or list rate */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         */
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        fun _recurrenceFrequency(): JsonField<RecurrenceFrequency> = recurrenceFrequency

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /** Attach a subscription to the recurring commit/credit. */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<SubscriptionConfig> = subscriptionConfig

        /**
         * A temporary ID that can be used to reference the recurring commit for commit specific
         * overrides.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RecurringCommit = apply {
            if (validated) {
                return@apply
            }

            accessAmount().validate()
            commitDuration().validate()
            priority()
            productId()
            startingAt()
            applicableProductIds()
            applicableProductTags()
            description()
            endingBefore()
            hierarchyConfiguration().ifPresent { it.validate() }
            invoiceAmount().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            proration()
            rateType()
            recurrenceFrequency()
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            temporaryId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RecurringCommit]. */
        class Builder internal constructor() {

            private var accessAmount: JsonField<AccessAmount>? = null
            private var commitDuration: JsonField<CommitDuration>? = null
            private var priority: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var proration: JsonField<Proration> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of()
            private var temporaryId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recurringCommit: RecurringCommit) = apply {
                accessAmount = recurringCommit.accessAmount
                commitDuration = recurringCommit.commitDuration
                priority = recurringCommit.priority
                productId = recurringCommit.productId
                startingAt = recurringCommit.startingAt
                applicableProductIds =
                    recurringCommit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    recurringCommit.applicableProductTags.map { it.toMutableList() }
                description = recurringCommit.description
                endingBefore = recurringCommit.endingBefore
                hierarchyConfiguration = recurringCommit.hierarchyConfiguration
                invoiceAmount = recurringCommit.invoiceAmount
                name = recurringCommit.name
                netsuiteSalesOrderId = recurringCommit.netsuiteSalesOrderId
                proration = recurringCommit.proration
                rateType = recurringCommit.rateType
                recurrenceFrequency = recurringCommit.recurrenceFrequency
                rolloverFraction = recurringCommit.rolloverFraction
                specifiers = recurringCommit.specifiers.map { it.toMutableList() }
                subscriptionConfig = recurringCommit.subscriptionConfig
                temporaryId = recurringCommit.temporaryId
                additionalProperties = recurringCommit.additionalProperties.toMutableMap()
            }

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: AccessAmount) = accessAmount(JsonField.of(accessAmount))

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                this.accessAmount = accessAmount
            }

            /**
             * Defines the length of the access schedule for each created commit/credit. The value
             * represents the number of units. Unit defaults to "PERIODS", where the length of a
             * period is determined by the recurrence_frequency.
             */
            fun commitDuration(commitDuration: CommitDuration) =
                commitDuration(JsonField.of(commitDuration))

            /**
             * Defines the length of the access schedule for each created commit/credit. The value
             * represents the number of units. Unit defaults to "PERIODS", where the length of a
             * period is determined by the recurrence_frequency.
             */
            fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                this.commitDuration = commitDuration
            }

            /** Will be passed down to the individual commits */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /** Will be passed down to the individual commits */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** determines the start time for the first commit */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** determines the start time for the first commit */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /** Will be passed down to the individual commits */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /** Will be passed down to the individual commits */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /** Will be passed down to the individual commits */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /** Will be passed down to the individual commits */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /** Will be passed down to the individual commits */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /** Will be passed down to the individual commits */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            /** Will be passed down to the individual commits */
            fun description(description: String) = description(JsonField.of(description))

            /** Will be passed down to the individual commits */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Determines when the contract will stop creating recurring commits. optional */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** Determines when the contract will stop creating recurring commits. optional */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /** Optional configuration for recurring commit/credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for recurring commit/credit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** The amount the customer should be billed for the commit. Not required. */
            fun invoiceAmount(invoiceAmount: InvoiceAmount) =
                invoiceAmount(JsonField.of(invoiceAmount))

            /** The amount the customer should be billed for the commit. Not required. */
            fun invoiceAmount(invoiceAmount: JsonField<InvoiceAmount>) = apply {
                this.invoiceAmount = invoiceAmount
            }

            /** displayed on invoices. will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices. will be passed through to the individual commits */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Will be passed down to the individual commits */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** Will be passed down to the individual commits */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(proration: Proration) = proration(JsonField.of(proration))

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(proration: JsonField<Proration>) = apply { this.proration = proration }

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            fun recurrenceFrequency(recurrenceFrequency: RecurrenceFrequency) =
                recurrenceFrequency(JsonField.of(recurrenceFrequency))

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            fun recurrenceFrequency(recurrenceFrequency: JsonField<RecurrenceFrequency>) = apply {
                this.recurrenceFrequency = recurrenceFrequency
            }

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(JsonField.of(rolloverFraction))

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(specifier)
                    }
            }

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(subscriptionConfig: SubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(subscriptionConfig: JsonField<SubscriptionConfig>) = apply {
                this.subscriptionConfig = subscriptionConfig
            }

            /**
             * A temporary ID that can be used to reference the recurring commit for commit specific
             * overrides.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * A temporary ID that can be used to reference the recurring commit for commit specific
             * overrides.
             */
            fun temporaryId(temporaryId: JsonField<String>) = apply {
                this.temporaryId = temporaryId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): RecurringCommit =
                RecurringCommit(
                    checkRequired("accessAmount", accessAmount),
                    checkRequired("commitDuration", commitDuration),
                    checkRequired("priority", priority),
                    checkRequired("productId", productId),
                    checkRequired("startingAt", startingAt),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    endingBefore,
                    hierarchyConfiguration,
                    invoiceAmount,
                    name,
                    netsuiteSalesOrderId,
                    proration,
                    rateType,
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    temporaryId,
                    additionalProperties.toImmutable(),
                )
        }

        /** The amount of commit to grant. */
        @NoAutoDetect
        class AccessAmount
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            private val unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            fun unitPrice(): Double = unitPrice.getRequired("unit_price")

            /**
             * This field is required unless a subscription is attached via `subscription_config`.
             */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            /**
             * This field is required unless a subscription is attached via `subscription_config`.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AccessAmount = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                unitPrice()
                quantity()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccessAmount]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String>? = null
                private var unitPrice: JsonField<Double>? = null
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessAmount: AccessAmount) = apply {
                    creditTypeId = accessAmount.creditTypeId
                    unitPrice = accessAmount.unitPrice
                    quantity = accessAmount.quantity
                    additionalProperties = accessAmount.additionalProperties.toMutableMap()
                }

                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

                /**
                 * This field is required unless a subscription is attached via
                 * `subscription_config`.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * This field is required unless a subscription is attached via
                 * `subscription_config`.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AccessAmount =
                    AccessAmount(
                        checkRequired("creditTypeId", creditTypeId),
                        checkRequired("unitPrice", unitPrice),
                        quantity,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessAmount && creditTypeId == other.creditTypeId && unitPrice == other.unitPrice && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, unitPrice, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessAmount{creditTypeId=$creditTypeId, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        @NoAutoDetect
        class CommitDuration
        @JsonCreator
        private constructor(
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit")
            @ExcludeMissing
            private val unit: JsonField<Unit> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun value(): Double = value.getRequired("value")

            fun unit(): Optional<Unit> = Optional.ofNullable(unit.getNullable("unit"))

            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CommitDuration = apply {
                if (validated) {
                    return@apply
                }

                value()
                unit()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommitDuration]. */
            class Builder internal constructor() {

                private var value: JsonField<Double>? = null
                private var unit: JsonField<Unit> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commitDuration: CommitDuration) = apply {
                    value = commitDuration.value
                    unit = commitDuration.unit
                    additionalProperties = commitDuration.additionalProperties.toMutableMap()
                }

                fun value(value: Double) = value(JsonField.of(value))

                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CommitDuration =
                    CommitDuration(
                        checkRequired("value", value),
                        unit,
                        additionalProperties.toImmutable(),
                    )
            }

            class Unit @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PERIODS = of("PERIODS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    PERIODS
                }

                /**
                 * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Unit] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERIODS,
                    /**
                     * An enum member indicating that [Unit] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERIODS -> Value.PERIODS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PERIODS -> Known.PERIODS
                        else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Unit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CommitDuration && value == other.value && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(value, unit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
        }

        /** The amount the customer should be billed for the commit. Not required. */
        @NoAutoDetect
        class InvoiceAmount
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            private val unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun unitPrice(): Double = unitPrice.getRequired("unit_price")

            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InvoiceAmount = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                quantity()
                unitPrice()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceAmount]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var unitPrice: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceAmount: InvoiceAmount) = apply {
                    creditTypeId = invoiceAmount.creditTypeId
                    quantity = invoiceAmount.quantity
                    unitPrice = invoiceAmount.unitPrice
                    additionalProperties = invoiceAmount.additionalProperties.toMutableMap()
                }

                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InvoiceAmount =
                    InvoiceAmount(
                        checkRequired("creditTypeId", creditTypeId),
                        checkRequired("quantity", quantity),
                        checkRequired("unitPrice", unitPrice),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceAmount && creditTypeId == other.creditTypeId && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, quantity, unitPrice, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceAmount{creditTypeId=$creditTypeId, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
        }

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         */
        class Proration @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NONE = of("NONE")

                @JvmField val FIRST = of("FIRST")

                @JvmField val LAST = of("LAST")

                @JvmField val FIRST_AND_LAST = of("FIRST_AND_LAST")

                @JvmStatic fun of(value: String) = Proration(JsonField.of(value))
            }

            /** An enum containing [Proration]'s known values. */
            enum class Known {
                NONE,
                FIRST,
                LAST,
                FIRST_AND_LAST,
            }

            /**
             * An enum containing [Proration]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Proration] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                FIRST,
                LAST,
                FIRST_AND_LAST,
                /**
                 * An enum member indicating that [Proration] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NONE -> Value.NONE
                    FIRST -> Value.FIRST
                    LAST -> Value.LAST
                    FIRST_AND_LAST -> Value.FIRST_AND_LAST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NONE -> Known.NONE
                    FIRST -> Known.FIRST
                    LAST -> Known.LAST
                    FIRST_AND_LAST -> Known.FIRST_AND_LAST
                    else -> throw MetronomeInvalidDataException("Unknown Proration: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Proration && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Whether the created commits will use the commit rate or list rate */
        class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            /** An enum containing [RateType]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RateType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [RateType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         */
        class RecurrenceFrequency
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val QUARTERLY = of("QUARTERLY")

                @JvmField val ANNUAL = of("ANNUAL")

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmStatic fun of(value: String) = RecurrenceFrequency(JsonField.of(value))
            }

            /** An enum containing [RecurrenceFrequency]'s known values. */
            enum class Known {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
            }

            /**
             * An enum containing [RecurrenceFrequency]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RecurrenceFrequency] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
                /**
                 * An enum member indicating that [RecurrenceFrequency] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    WEEKLY -> Value.WEEKLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    WEEKLY -> Known.WEEKLY
                    else ->
                        throw MetronomeInvalidDataException("Unknown RecurrenceFrequency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RecurrenceFrequency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Attach a subscription to the recurring commit/credit. */
        @NoAutoDetect
        class SubscriptionConfig
        @JsonCreator
        private constructor(
            @JsonProperty("apply_seat_increase_config")
            @ExcludeMissing
            private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> =
                JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            private val subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation")
            @ExcludeMissing
            private val allocation: JsonField<Allocation> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun applySeatIncreaseConfig(): ApplySeatIncreaseConfig =
                applySeatIncreaseConfig.getRequired("apply_seat_increase_config")

            /** ID of the subscription to configure on the recurring commit/credit. */
            fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             */
            fun allocation(): Optional<Allocation> =
                Optional.ofNullable(allocation.getNullable("allocation"))

            @JsonProperty("apply_seat_increase_config")
            @ExcludeMissing
            fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> =
                applySeatIncreaseConfig

            /** ID of the subscription to configure on the recurring commit/credit. */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             */
            @JsonProperty("allocation")
            @ExcludeMissing
            fun _allocation(): JsonField<Allocation> = allocation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SubscriptionConfig = apply {
                if (validated) {
                    return@apply
                }

                applySeatIncreaseConfig().validate()
                subscriptionId()
                allocation()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SubscriptionConfig]. */
            class Builder internal constructor() {

                private var applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>? = null
                private var subscriptionId: JsonField<String>? = null
                private var allocation: JsonField<Allocation> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subscriptionConfig: SubscriptionConfig) = apply {
                    applySeatIncreaseConfig = subscriptionConfig.applySeatIncreaseConfig
                    subscriptionId = subscriptionConfig.subscriptionId
                    allocation = subscriptionConfig.allocation
                    additionalProperties = subscriptionConfig.additionalProperties.toMutableMap()
                }

                fun applySeatIncreaseConfig(applySeatIncreaseConfig: ApplySeatIncreaseConfig) =
                    applySeatIncreaseConfig(JsonField.of(applySeatIncreaseConfig))

                fun applySeatIncreaseConfig(
                    applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>
                ) = apply { this.applySeatIncreaseConfig = applySeatIncreaseConfig }

                /** ID of the subscription to configure on the recurring commit/credit. */
                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /** ID of the subscription to configure on the recurring commit/credit. */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /**
                 * If set to POOLED, allocation added per seat is pooled across the account. If set
                 * to INDIVIDUAL, each seat in the subscription will have its own allocation.
                 */
                fun allocation(allocation: Allocation) = allocation(JsonField.of(allocation))

                /**
                 * If set to POOLED, allocation added per seat is pooled across the account. If set
                 * to INDIVIDUAL, each seat in the subscription will have its own allocation.
                 */
                fun allocation(allocation: JsonField<Allocation>) = apply {
                    this.allocation = allocation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): SubscriptionConfig =
                    SubscriptionConfig(
                        checkRequired("applySeatIncreaseConfig", applySeatIncreaseConfig),
                        checkRequired("subscriptionId", subscriptionId),
                        allocation,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ApplySeatIncreaseConfig
            @JsonCreator
            private constructor(
                @JsonProperty("is_prorated")
                @ExcludeMissing
                private val isProrated: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Indicates whether a mid-period seat increase should be prorated. */
                fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

                /** Indicates whether a mid-period seat increase should be prorated. */
                @JsonProperty("is_prorated")
                @ExcludeMissing
                fun _isProrated(): JsonField<Boolean> = isProrated

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ApplySeatIncreaseConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    isProrated()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ApplySeatIncreaseConfig]. */
                class Builder internal constructor() {

                    private var isProrated: JsonField<Boolean>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(applySeatIncreaseConfig: ApplySeatIncreaseConfig) = apply {
                        isProrated = applySeatIncreaseConfig.isProrated
                        additionalProperties =
                            applySeatIncreaseConfig.additionalProperties.toMutableMap()
                    }

                    /** Indicates whether a mid-period seat increase should be prorated. */
                    fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                    /** Indicates whether a mid-period seat increase should be prorated. */
                    fun isProrated(isProrated: JsonField<Boolean>) = apply {
                        this.isProrated = isProrated
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ApplySeatIncreaseConfig =
                        ApplySeatIncreaseConfig(
                            checkRequired("isProrated", isProrated),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ApplySeatIncreaseConfig && isProrated == other.isProrated && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ApplySeatIncreaseConfig{isProrated=$isProrated, additionalProperties=$additionalProperties}"
            }

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             */
            class Allocation
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INDIVIDUAL = of("INDIVIDUAL")

                    @JvmField val POOLED = of("POOLED")

                    @JvmStatic fun of(value: String) = Allocation(JsonField.of(value))
                }

                /** An enum containing [Allocation]'s known values. */
                enum class Known {
                    INDIVIDUAL,
                    POOLED,
                }

                /**
                 * An enum containing [Allocation]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Allocation] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INDIVIDUAL,
                    POOLED,
                    /**
                     * An enum member indicating that [Allocation] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INDIVIDUAL -> Value.INDIVIDUAL
                        POOLED -> Value.POOLED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INDIVIDUAL -> Known.INDIVIDUAL
                        POOLED -> Known.POOLED
                        else -> throw MetronomeInvalidDataException("Unknown Allocation: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Allocation && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubscriptionConfig && applySeatIncreaseConfig == other.applySeatIncreaseConfig && subscriptionId == other.subscriptionId && allocation == other.allocation && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(applySeatIncreaseConfig, subscriptionId, allocation, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionConfig{applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, allocation=$allocation, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RecurringCommit && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && productId == other.productId && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && description == other.description && endingBefore == other.endingBefore && hierarchyConfiguration == other.hierarchyConfiguration && invoiceAmount == other.invoiceAmount && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && proration == other.proration && rateType == other.rateType && recurrenceFrequency == other.recurrenceFrequency && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && temporaryId == other.temporaryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessAmount, commitDuration, priority, productId, startingAt, applicableProductIds, applicableProductTags, description, endingBefore, hierarchyConfiguration, invoiceAmount, name, netsuiteSalesOrderId, proration, rateType, recurrenceFrequency, rolloverFraction, specifiers, subscriptionConfig, temporaryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCommit{accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, productId=$productId, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, invoiceAmount=$invoiceAmount, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, rateType=$rateType, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RecurringCredit
    @JsonCreator
    private constructor(
        @JsonProperty("access_amount")
        @ExcludeMissing
        private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
        @JsonProperty("commit_duration")
        @ExcludeMissing
        private val commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
            JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proration")
        @ExcludeMissing
        private val proration: JsonField<Proration> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        private val recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        @JsonProperty("subscription_config")
        @ExcludeMissing
        private val subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of(),
        @JsonProperty("temporary_id")
        @ExcludeMissing
        private val temporaryId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount of commit to grant. */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

        /** Will be passed down to the individual commits */
        fun priority(): Double = priority.getRequired("priority")

        fun productId(): String = productId.getRequired("product_id")

        /** determines the start time for the first commit */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /** Will be passed down to the individual commits */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /** Will be passed down to the individual commits */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /** Will be passed down to the individual commits */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Determines when the contract will stop creating recurring commits. optional */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** Optional configuration for recurring commit/credit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /** displayed on invoices. will be passed through to the individual commits */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** Will be passed down to the individual commits */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         */
        fun proration(): Optional<Proration> =
            Optional.ofNullable(proration.getNullable("proration"))

        /** Whether the created commits will use the commit rate or list rate */
        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         */
        fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
            Optional.ofNullable(recurrenceFrequency.getNullable("recurrence_frequency"))

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        fun rolloverFraction(): Optional<Double> =
            Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** Attach a subscription to the recurring commit/credit. */
        fun subscriptionConfig(): Optional<SubscriptionConfig> =
            Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

        /**
         * A temporary ID that can be used to reference the recurring commit for commit specific
         * overrides.
         */
        fun temporaryId(): Optional<String> =
            Optional.ofNullable(temporaryId.getNullable("temporary_id"))

        /** The amount of commit to grant. */
        @JsonProperty("access_amount")
        @ExcludeMissing
        fun _accessAmount(): JsonField<AccessAmount> = accessAmount

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        @JsonProperty("commit_duration")
        @ExcludeMissing
        fun _commitDuration(): JsonField<CommitDuration> = commitDuration

        /** Will be passed down to the individual commits */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** determines the start time for the first commit */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /** Will be passed down to the individual commits */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /** Will be passed down to the individual commits */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /** Will be passed down to the individual commits */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Determines when the contract will stop creating recurring commits. optional */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /** Optional configuration for recurring commit/credit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /** displayed on invoices. will be passed through to the individual commits */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Will be passed down to the individual commits */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         */
        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

        /** Whether the created commits will use the commit rate or list rate */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         */
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        fun _recurrenceFrequency(): JsonField<RecurrenceFrequency> = recurrenceFrequency

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /** Attach a subscription to the recurring commit/credit. */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<SubscriptionConfig> = subscriptionConfig

        /**
         * A temporary ID that can be used to reference the recurring commit for commit specific
         * overrides.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RecurringCredit = apply {
            if (validated) {
                return@apply
            }

            accessAmount().validate()
            commitDuration().validate()
            priority()
            productId()
            startingAt()
            applicableProductIds()
            applicableProductTags()
            description()
            endingBefore()
            hierarchyConfiguration().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            proration()
            rateType()
            recurrenceFrequency()
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            temporaryId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RecurringCredit]. */
        class Builder internal constructor() {

            private var accessAmount: JsonField<AccessAmount>? = null
            private var commitDuration: JsonField<CommitDuration>? = null
            private var priority: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var proration: JsonField<Proration> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of()
            private var temporaryId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recurringCredit: RecurringCredit) = apply {
                accessAmount = recurringCredit.accessAmount
                commitDuration = recurringCredit.commitDuration
                priority = recurringCredit.priority
                productId = recurringCredit.productId
                startingAt = recurringCredit.startingAt
                applicableProductIds =
                    recurringCredit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    recurringCredit.applicableProductTags.map { it.toMutableList() }
                description = recurringCredit.description
                endingBefore = recurringCredit.endingBefore
                hierarchyConfiguration = recurringCredit.hierarchyConfiguration
                name = recurringCredit.name
                netsuiteSalesOrderId = recurringCredit.netsuiteSalesOrderId
                proration = recurringCredit.proration
                rateType = recurringCredit.rateType
                recurrenceFrequency = recurringCredit.recurrenceFrequency
                rolloverFraction = recurringCredit.rolloverFraction
                specifiers = recurringCredit.specifiers.map { it.toMutableList() }
                subscriptionConfig = recurringCredit.subscriptionConfig
                temporaryId = recurringCredit.temporaryId
                additionalProperties = recurringCredit.additionalProperties.toMutableMap()
            }

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: AccessAmount) = accessAmount(JsonField.of(accessAmount))

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                this.accessAmount = accessAmount
            }

            /**
             * Defines the length of the access schedule for each created commit/credit. The value
             * represents the number of units. Unit defaults to "PERIODS", where the length of a
             * period is determined by the recurrence_frequency.
             */
            fun commitDuration(commitDuration: CommitDuration) =
                commitDuration(JsonField.of(commitDuration))

            /**
             * Defines the length of the access schedule for each created commit/credit. The value
             * represents the number of units. Unit defaults to "PERIODS", where the length of a
             * period is determined by the recurrence_frequency.
             */
            fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                this.commitDuration = commitDuration
            }

            /** Will be passed down to the individual commits */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /** Will be passed down to the individual commits */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** determines the start time for the first commit */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** determines the start time for the first commit */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /** Will be passed down to the individual commits */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /** Will be passed down to the individual commits */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /** Will be passed down to the individual commits */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /** Will be passed down to the individual commits */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /** Will be passed down to the individual commits */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /** Will be passed down to the individual commits */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            /** Will be passed down to the individual commits */
            fun description(description: String) = description(JsonField.of(description))

            /** Will be passed down to the individual commits */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Determines when the contract will stop creating recurring commits. optional */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** Determines when the contract will stop creating recurring commits. optional */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /** Optional configuration for recurring commit/credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for recurring commit/credit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** displayed on invoices. will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices. will be passed through to the individual commits */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Will be passed down to the individual commits */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** Will be passed down to the individual commits */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(proration: Proration) = proration(JsonField.of(proration))

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(proration: JsonField<Proration>) = apply { this.proration = proration }

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            fun recurrenceFrequency(recurrenceFrequency: RecurrenceFrequency) =
                recurrenceFrequency(JsonField.of(recurrenceFrequency))

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            fun recurrenceFrequency(recurrenceFrequency: JsonField<RecurrenceFrequency>) = apply {
                this.recurrenceFrequency = recurrenceFrequency
            }

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(JsonField.of(rolloverFraction))

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(specifier)
                    }
            }

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(subscriptionConfig: SubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(subscriptionConfig: JsonField<SubscriptionConfig>) = apply {
                this.subscriptionConfig = subscriptionConfig
            }

            /**
             * A temporary ID that can be used to reference the recurring commit for commit specific
             * overrides.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * A temporary ID that can be used to reference the recurring commit for commit specific
             * overrides.
             */
            fun temporaryId(temporaryId: JsonField<String>) = apply {
                this.temporaryId = temporaryId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): RecurringCredit =
                RecurringCredit(
                    checkRequired("accessAmount", accessAmount),
                    checkRequired("commitDuration", commitDuration),
                    checkRequired("priority", priority),
                    checkRequired("productId", productId),
                    checkRequired("startingAt", startingAt),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    endingBefore,
                    hierarchyConfiguration,
                    name,
                    netsuiteSalesOrderId,
                    proration,
                    rateType,
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    temporaryId,
                    additionalProperties.toImmutable(),
                )
        }

        /** The amount of commit to grant. */
        @NoAutoDetect
        class AccessAmount
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            private val unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            fun unitPrice(): Double = unitPrice.getRequired("unit_price")

            /**
             * This field is required unless a subscription is attached via `subscription_config`.
             */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            /**
             * This field is required unless a subscription is attached via `subscription_config`.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AccessAmount = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                unitPrice()
                quantity()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccessAmount]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String>? = null
                private var unitPrice: JsonField<Double>? = null
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessAmount: AccessAmount) = apply {
                    creditTypeId = accessAmount.creditTypeId
                    unitPrice = accessAmount.unitPrice
                    quantity = accessAmount.quantity
                    additionalProperties = accessAmount.additionalProperties.toMutableMap()
                }

                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

                /**
                 * This field is required unless a subscription is attached via
                 * `subscription_config`.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * This field is required unless a subscription is attached via
                 * `subscription_config`.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AccessAmount =
                    AccessAmount(
                        checkRequired("creditTypeId", creditTypeId),
                        checkRequired("unitPrice", unitPrice),
                        quantity,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessAmount && creditTypeId == other.creditTypeId && unitPrice == other.unitPrice && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, unitPrice, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessAmount{creditTypeId=$creditTypeId, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        @NoAutoDetect
        class CommitDuration
        @JsonCreator
        private constructor(
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit")
            @ExcludeMissing
            private val unit: JsonField<Unit> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun value(): Double = value.getRequired("value")

            fun unit(): Optional<Unit> = Optional.ofNullable(unit.getNullable("unit"))

            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CommitDuration = apply {
                if (validated) {
                    return@apply
                }

                value()
                unit()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommitDuration]. */
            class Builder internal constructor() {

                private var value: JsonField<Double>? = null
                private var unit: JsonField<Unit> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commitDuration: CommitDuration) = apply {
                    value = commitDuration.value
                    unit = commitDuration.unit
                    additionalProperties = commitDuration.additionalProperties.toMutableMap()
                }

                fun value(value: Double) = value(JsonField.of(value))

                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CommitDuration =
                    CommitDuration(
                        checkRequired("value", value),
                        unit,
                        additionalProperties.toImmutable(),
                    )
            }

            class Unit @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PERIODS = of("PERIODS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    PERIODS
                }

                /**
                 * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Unit] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERIODS,
                    /**
                     * An enum member indicating that [Unit] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERIODS -> Value.PERIODS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PERIODS -> Known.PERIODS
                        else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Unit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CommitDuration && value == other.value && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(value, unit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
        }

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         */
        class Proration @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NONE = of("NONE")

                @JvmField val FIRST = of("FIRST")

                @JvmField val LAST = of("LAST")

                @JvmField val FIRST_AND_LAST = of("FIRST_AND_LAST")

                @JvmStatic fun of(value: String) = Proration(JsonField.of(value))
            }

            /** An enum containing [Proration]'s known values. */
            enum class Known {
                NONE,
                FIRST,
                LAST,
                FIRST_AND_LAST,
            }

            /**
             * An enum containing [Proration]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Proration] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                FIRST,
                LAST,
                FIRST_AND_LAST,
                /**
                 * An enum member indicating that [Proration] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NONE -> Value.NONE
                    FIRST -> Value.FIRST
                    LAST -> Value.LAST
                    FIRST_AND_LAST -> Value.FIRST_AND_LAST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NONE -> Known.NONE
                    FIRST -> Known.FIRST
                    LAST -> Known.LAST
                    FIRST_AND_LAST -> Known.FIRST_AND_LAST
                    else -> throw MetronomeInvalidDataException("Unknown Proration: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Proration && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Whether the created commits will use the commit rate or list rate */
        class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            /** An enum containing [RateType]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RateType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [RateType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         */
        class RecurrenceFrequency
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val QUARTERLY = of("QUARTERLY")

                @JvmField val ANNUAL = of("ANNUAL")

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmStatic fun of(value: String) = RecurrenceFrequency(JsonField.of(value))
            }

            /** An enum containing [RecurrenceFrequency]'s known values. */
            enum class Known {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
            }

            /**
             * An enum containing [RecurrenceFrequency]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RecurrenceFrequency] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
                /**
                 * An enum member indicating that [RecurrenceFrequency] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    WEEKLY -> Value.WEEKLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    WEEKLY -> Known.WEEKLY
                    else ->
                        throw MetronomeInvalidDataException("Unknown RecurrenceFrequency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RecurrenceFrequency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Attach a subscription to the recurring commit/credit. */
        @NoAutoDetect
        class SubscriptionConfig
        @JsonCreator
        private constructor(
            @JsonProperty("apply_seat_increase_config")
            @ExcludeMissing
            private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> =
                JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            private val subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation")
            @ExcludeMissing
            private val allocation: JsonField<Allocation> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun applySeatIncreaseConfig(): ApplySeatIncreaseConfig =
                applySeatIncreaseConfig.getRequired("apply_seat_increase_config")

            /** ID of the subscription to configure on the recurring commit/credit. */
            fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             */
            fun allocation(): Optional<Allocation> =
                Optional.ofNullable(allocation.getNullable("allocation"))

            @JsonProperty("apply_seat_increase_config")
            @ExcludeMissing
            fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> =
                applySeatIncreaseConfig

            /** ID of the subscription to configure on the recurring commit/credit. */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             */
            @JsonProperty("allocation")
            @ExcludeMissing
            fun _allocation(): JsonField<Allocation> = allocation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SubscriptionConfig = apply {
                if (validated) {
                    return@apply
                }

                applySeatIncreaseConfig().validate()
                subscriptionId()
                allocation()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SubscriptionConfig]. */
            class Builder internal constructor() {

                private var applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>? = null
                private var subscriptionId: JsonField<String>? = null
                private var allocation: JsonField<Allocation> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subscriptionConfig: SubscriptionConfig) = apply {
                    applySeatIncreaseConfig = subscriptionConfig.applySeatIncreaseConfig
                    subscriptionId = subscriptionConfig.subscriptionId
                    allocation = subscriptionConfig.allocation
                    additionalProperties = subscriptionConfig.additionalProperties.toMutableMap()
                }

                fun applySeatIncreaseConfig(applySeatIncreaseConfig: ApplySeatIncreaseConfig) =
                    applySeatIncreaseConfig(JsonField.of(applySeatIncreaseConfig))

                fun applySeatIncreaseConfig(
                    applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>
                ) = apply { this.applySeatIncreaseConfig = applySeatIncreaseConfig }

                /** ID of the subscription to configure on the recurring commit/credit. */
                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /** ID of the subscription to configure on the recurring commit/credit. */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /**
                 * If set to POOLED, allocation added per seat is pooled across the account. If set
                 * to INDIVIDUAL, each seat in the subscription will have its own allocation.
                 */
                fun allocation(allocation: Allocation) = allocation(JsonField.of(allocation))

                /**
                 * If set to POOLED, allocation added per seat is pooled across the account. If set
                 * to INDIVIDUAL, each seat in the subscription will have its own allocation.
                 */
                fun allocation(allocation: JsonField<Allocation>) = apply {
                    this.allocation = allocation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): SubscriptionConfig =
                    SubscriptionConfig(
                        checkRequired("applySeatIncreaseConfig", applySeatIncreaseConfig),
                        checkRequired("subscriptionId", subscriptionId),
                        allocation,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ApplySeatIncreaseConfig
            @JsonCreator
            private constructor(
                @JsonProperty("is_prorated")
                @ExcludeMissing
                private val isProrated: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Indicates whether a mid-period seat increase should be prorated. */
                fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

                /** Indicates whether a mid-period seat increase should be prorated. */
                @JsonProperty("is_prorated")
                @ExcludeMissing
                fun _isProrated(): JsonField<Boolean> = isProrated

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ApplySeatIncreaseConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    isProrated()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ApplySeatIncreaseConfig]. */
                class Builder internal constructor() {

                    private var isProrated: JsonField<Boolean>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(applySeatIncreaseConfig: ApplySeatIncreaseConfig) = apply {
                        isProrated = applySeatIncreaseConfig.isProrated
                        additionalProperties =
                            applySeatIncreaseConfig.additionalProperties.toMutableMap()
                    }

                    /** Indicates whether a mid-period seat increase should be prorated. */
                    fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                    /** Indicates whether a mid-period seat increase should be prorated. */
                    fun isProrated(isProrated: JsonField<Boolean>) = apply {
                        this.isProrated = isProrated
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ApplySeatIncreaseConfig =
                        ApplySeatIncreaseConfig(
                            checkRequired("isProrated", isProrated),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ApplySeatIncreaseConfig && isProrated == other.isProrated && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ApplySeatIncreaseConfig{isProrated=$isProrated, additionalProperties=$additionalProperties}"
            }

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             */
            class Allocation
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INDIVIDUAL = of("INDIVIDUAL")

                    @JvmField val POOLED = of("POOLED")

                    @JvmStatic fun of(value: String) = Allocation(JsonField.of(value))
                }

                /** An enum containing [Allocation]'s known values. */
                enum class Known {
                    INDIVIDUAL,
                    POOLED,
                }

                /**
                 * An enum containing [Allocation]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Allocation] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INDIVIDUAL,
                    POOLED,
                    /**
                     * An enum member indicating that [Allocation] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INDIVIDUAL -> Value.INDIVIDUAL
                        POOLED -> Value.POOLED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INDIVIDUAL -> Known.INDIVIDUAL
                        POOLED -> Known.POOLED
                        else -> throw MetronomeInvalidDataException("Unknown Allocation: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Allocation && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubscriptionConfig && applySeatIncreaseConfig == other.applySeatIncreaseConfig && subscriptionId == other.subscriptionId && allocation == other.allocation && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(applySeatIncreaseConfig, subscriptionId, allocation, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionConfig{applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, allocation=$allocation, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RecurringCredit && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && productId == other.productId && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && description == other.description && endingBefore == other.endingBefore && hierarchyConfiguration == other.hierarchyConfiguration && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && proration == other.proration && rateType == other.rateType && recurrenceFrequency == other.recurrenceFrequency && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && temporaryId == other.temporaryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessAmount, commitDuration, priority, productId, startingAt, applicableProductIds, applicableProductTags, description, endingBefore, hierarchyConfiguration, name, netsuiteSalesOrderId, proration, rateType, recurrenceFrequency, rolloverFraction, specifiers, subscriptionConfig, temporaryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCredit{accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, productId=$productId, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, rateType=$rateType, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ResellerRoyalty
    @JsonCreator
    private constructor(
        @JsonProperty("fraction")
        @ExcludeMissing
        private val fraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        private val netsuiteResellerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reseller_type")
        @ExcludeMissing
        private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("aws_options")
        @ExcludeMissing
        private val awsOptions: JsonField<AwsOptions> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("gcp_options")
        @ExcludeMissing
        private val gcpOptions: JsonField<GcpOptions> = JsonMissing.of(),
        @JsonProperty("reseller_contract_value")
        @ExcludeMissing
        private val resellerContractValue: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun fraction(): Double = fraction.getRequired("fraction")

        fun netsuiteResellerId(): String = netsuiteResellerId.getRequired("netsuite_reseller_id")

        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun awsOptions(): Optional<AwsOptions> =
            Optional.ofNullable(awsOptions.getNullable("aws_options"))

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun gcpOptions(): Optional<GcpOptions> =
            Optional.ofNullable(gcpOptions.getNullable("gcp_options"))

        fun resellerContractValue(): Optional<Double> =
            Optional.ofNullable(resellerContractValue.getNullable("reseller_contract_value"))

        @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<Double> = fraction

        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        fun _netsuiteResellerId(): JsonField<String> = netsuiteResellerId

        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        @JsonProperty("aws_options")
        @ExcludeMissing
        fun _awsOptions(): JsonField<AwsOptions> = awsOptions

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("gcp_options")
        @ExcludeMissing
        fun _gcpOptions(): JsonField<GcpOptions> = gcpOptions

        @JsonProperty("reseller_contract_value")
        @ExcludeMissing
        fun _resellerContractValue(): JsonField<Double> = resellerContractValue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ResellerRoyalty = apply {
            if (validated) {
                return@apply
            }

            fraction()
            netsuiteResellerId()
            resellerType()
            startingAt()
            applicableProductIds()
            applicableProductTags()
            awsOptions().ifPresent { it.validate() }
            endingBefore()
            gcpOptions().ifPresent { it.validate() }
            resellerContractValue()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResellerRoyalty]. */
        class Builder internal constructor() {

            private var fraction: JsonField<Double>? = null
            private var netsuiteResellerId: JsonField<String>? = null
            private var resellerType: JsonField<ResellerType>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var awsOptions: JsonField<AwsOptions> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var gcpOptions: JsonField<GcpOptions> = JsonMissing.of()
            private var resellerContractValue: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                fraction = resellerRoyalty.fraction
                netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                resellerType = resellerRoyalty.resellerType
                startingAt = resellerRoyalty.startingAt
                applicableProductIds =
                    resellerRoyalty.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    resellerRoyalty.applicableProductTags.map { it.toMutableList() }
                awsOptions = resellerRoyalty.awsOptions
                endingBefore = resellerRoyalty.endingBefore
                gcpOptions = resellerRoyalty.gcpOptions
                resellerContractValue = resellerRoyalty.resellerContractValue
                additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
            }

            fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

            fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

            fun netsuiteResellerId(netsuiteResellerId: String) =
                netsuiteResellerId(JsonField.of(netsuiteResellerId))

            fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            fun awsOptions(awsOptions: AwsOptions) = awsOptions(JsonField.of(awsOptions))

            fun awsOptions(awsOptions: JsonField<AwsOptions>) = apply {
                this.awsOptions = awsOptions
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun gcpOptions(gcpOptions: GcpOptions) = gcpOptions(JsonField.of(gcpOptions))

            fun gcpOptions(gcpOptions: JsonField<GcpOptions>) = apply {
                this.gcpOptions = gcpOptions
            }

            fun resellerContractValue(resellerContractValue: Double) =
                resellerContractValue(JsonField.of(resellerContractValue))

            fun resellerContractValue(resellerContractValue: JsonField<Double>) = apply {
                this.resellerContractValue = resellerContractValue
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    checkRequired("fraction", fraction),
                    checkRequired("netsuiteResellerId", netsuiteResellerId),
                    checkRequired("resellerType", resellerType),
                    checkRequired("startingAt", startingAt),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    awsOptions,
                    endingBefore,
                    gcpOptions,
                    resellerContractValue,
                    additionalProperties.toImmutable(),
                )
        }

        class ResellerType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS = of("AWS")

                @JvmField val AWS_PRO_SERVICE = of("AWS_PRO_SERVICE")

                @JvmField val GCP = of("GCP")

                @JvmField val GCP_PRO_SERVICE = of("GCP_PRO_SERVICE")

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            /** An enum containing [ResellerType]'s known values. */
            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            /**
             * An enum containing [ResellerType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ResellerType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                /**
                 * An enum member indicating that [ResellerType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class AwsOptions
        @JsonCreator
        private constructor(
            @JsonProperty("aws_account_number")
            @ExcludeMissing
            private val awsAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            private val awsOfferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            private val awsPayerReferenceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun awsAccountNumber(): Optional<String> =
                Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

            fun awsOfferId(): Optional<String> =
                Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

            fun awsPayerReferenceId(): Optional<String> =
                Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            fun _awsOfferId(): JsonField<String> = awsOfferId

            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId(): JsonField<String> = awsPayerReferenceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AwsOptions = apply {
                if (validated) {
                    return@apply
                }

                awsAccountNumber()
                awsOfferId()
                awsPayerReferenceId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AwsOptions]. */
            class Builder internal constructor() {

                private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                private var awsOfferId: JsonField<String> = JsonMissing.of()
                private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(awsOptions: AwsOptions) = apply {
                    awsAccountNumber = awsOptions.awsAccountNumber
                    awsOfferId = awsOptions.awsOfferId
                    awsPayerReferenceId = awsOptions.awsPayerReferenceId
                    additionalProperties = awsOptions.additionalProperties.toMutableMap()
                }

                fun awsAccountNumber(awsAccountNumber: String) =
                    awsAccountNumber(JsonField.of(awsAccountNumber))

                fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                    this.awsOfferId = awsOfferId
                }

                fun awsPayerReferenceId(awsPayerReferenceId: String) =
                    awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

                fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                    this.awsPayerReferenceId = awsPayerReferenceId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AwsOptions =
                    AwsOptions(
                        awsAccountNumber,
                        awsOfferId,
                        awsPayerReferenceId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AwsOptions && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(awsAccountNumber, awsOfferId, awsPayerReferenceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AwsOptions{awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class GcpOptions
        @JsonCreator
        private constructor(
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            private val gcpAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            private val gcpOfferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun gcpAccountId(): Optional<String> =
                Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

            fun gcpOfferId(): Optional<String> =
                Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun _gcpAccountId(): JsonField<String> = gcpAccountId

            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun _gcpOfferId(): JsonField<String> = gcpOfferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GcpOptions = apply {
                if (validated) {
                    return@apply
                }

                gcpAccountId()
                gcpOfferId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GcpOptions]. */
            class Builder internal constructor() {

                private var gcpAccountId: JsonField<String> = JsonMissing.of()
                private var gcpOfferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gcpOptions: GcpOptions) = apply {
                    gcpAccountId = gcpOptions.gcpAccountId
                    gcpOfferId = gcpOptions.gcpOfferId
                    additionalProperties = gcpOptions.additionalProperties.toMutableMap()
                }

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                    this.gcpOfferId = gcpOfferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): GcpOptions =
                    GcpOptions(gcpAccountId, gcpOfferId, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GcpOptions && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(gcpAccountId, gcpOfferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GcpOptions{gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResellerRoyalty && fraction == other.fraction && netsuiteResellerId == other.netsuiteResellerId && resellerType == other.resellerType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && awsOptions == other.awsOptions && endingBefore == other.endingBefore && gcpOptions == other.gcpOptions && resellerContractValue == other.resellerContractValue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fraction, netsuiteResellerId, resellerType, startingAt, applicableProductIds, applicableProductTags, awsOptions, endingBefore, gcpOptions, resellerContractValue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{fraction=$fraction, netsuiteResellerId=$netsuiteResellerId, resellerType=$resellerType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, awsOptions=$awsOptions, endingBefore=$endingBefore, gcpOptions=$gcpOptions, resellerContractValue=$resellerContractValue, additionalProperties=$additionalProperties}"
    }

    /**
     * The revenue system configuration associated with a contract. Provide either an ID or the
     * provider and delivery method.
     */
    @NoAutoDetect
    class RevenueSystemConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("delivery_method")
        @ExcludeMissing
        private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
        @JsonProperty("provider")
        @ExcludeMissing
        private val provider: JsonField<Provider> = JsonMissing.of(),
        @JsonProperty("revenue_system_configuration_id")
        @ExcludeMissing
        private val revenueSystemConfigurationId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * How revenue recognition records should be delivered to the revenue system. Do not specify
         * if using revenue_system_configuration_id.
         */
        fun deliveryMethod(): Optional<DeliveryMethod> =
            Optional.ofNullable(deliveryMethod.getNullable("delivery_method"))

        /**
         * The system that is providing services for revenue recognition. Do not specify if using
         * revenue_system_configuration_id.
         */
        fun provider(): Optional<Provider> = Optional.ofNullable(provider.getNullable("provider"))

        /**
         * The Metronome ID of the revenue system configuration. Use when a customer has multiple
         * configurations with the same provider and delivery method. Otherwise, specify the
         * provider and delivery_method.
         */
        fun revenueSystemConfigurationId(): Optional<String> =
            Optional.ofNullable(
                revenueSystemConfigurationId.getNullable("revenue_system_configuration_id")
            )

        /**
         * How revenue recognition records should be delivered to the revenue system. Do not specify
         * if using revenue_system_configuration_id.
         */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        /**
         * The system that is providing services for revenue recognition. Do not specify if using
         * revenue_system_configuration_id.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * The Metronome ID of the revenue system configuration. Use when a customer has multiple
         * configurations with the same provider and delivery method. Otherwise, specify the
         * provider and delivery_method.
         */
        @JsonProperty("revenue_system_configuration_id")
        @ExcludeMissing
        fun _revenueSystemConfigurationId(): JsonField<String> = revenueSystemConfigurationId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RevenueSystemConfiguration = apply {
            if (validated) {
                return@apply
            }

            deliveryMethod()
            provider()
            revenueSystemConfigurationId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RevenueSystemConfiguration]. */
        class Builder internal constructor() {

            private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var revenueSystemConfigurationId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(revenueSystemConfiguration: RevenueSystemConfiguration) = apply {
                deliveryMethod = revenueSystemConfiguration.deliveryMethod
                provider = revenueSystemConfiguration.provider
                revenueSystemConfigurationId =
                    revenueSystemConfiguration.revenueSystemConfigurationId
                additionalProperties =
                    revenueSystemConfiguration.additionalProperties.toMutableMap()
            }

            /**
             * How revenue recognition records should be delivered to the revenue system. Do not
             * specify if using revenue_system_configuration_id.
             */
            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            /**
             * How revenue recognition records should be delivered to the revenue system. Do not
             * specify if using revenue_system_configuration_id.
             */
            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            /**
             * The system that is providing services for revenue recognition. Do not specify if
             * using revenue_system_configuration_id.
             */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * The system that is providing services for revenue recognition. Do not specify if
             * using revenue_system_configuration_id.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /**
             * The Metronome ID of the revenue system configuration. Use when a customer has
             * multiple configurations with the same provider and delivery method. Otherwise,
             * specify the provider and delivery_method.
             */
            fun revenueSystemConfigurationId(revenueSystemConfigurationId: String) =
                revenueSystemConfigurationId(JsonField.of(revenueSystemConfigurationId))

            /**
             * The Metronome ID of the revenue system configuration. Use when a customer has
             * multiple configurations with the same provider and delivery method. Otherwise,
             * specify the provider and delivery_method.
             */
            fun revenueSystemConfigurationId(revenueSystemConfigurationId: JsonField<String>) =
                apply {
                    this.revenueSystemConfigurationId = revenueSystemConfigurationId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): RevenueSystemConfiguration =
                RevenueSystemConfiguration(
                    deliveryMethod,
                    provider,
                    revenueSystemConfigurationId,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * How revenue recognition records should be delivered to the revenue system. Do not specify
         * if using revenue_system_configuration_id.
         */
        class DeliveryMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DIRECT_TO_BILLING_PROVIDER = of("direct_to_billing_provider")

                @JvmStatic fun of(value: String) = DeliveryMethod(JsonField.of(value))
            }

            /** An enum containing [DeliveryMethod]'s known values. */
            enum class Known {
                DIRECT_TO_BILLING_PROVIDER
            }

            /**
             * An enum containing [DeliveryMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeliveryMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECT_TO_BILLING_PROVIDER,
                /**
                 * An enum member indicating that [DeliveryMethod] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                    else -> throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DeliveryMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The system that is providing services for revenue recognition. Do not specify if using
         * revenue_system_configuration_id.
         */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NETSUITE = of("netsuite")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                NETSUITE
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NETSUITE,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NETSUITE -> Value.NETSUITE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NETSUITE -> Known.NETSUITE
                    else -> throw MetronomeInvalidDataException("Unknown Provider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Provider && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RevenueSystemConfiguration && deliveryMethod == other.deliveryMethod && provider == other.provider && revenueSystemConfigurationId == other.revenueSystemConfigurationId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(deliveryMethod, provider, revenueSystemConfigurationId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RevenueSystemConfiguration{deliveryMethod=$deliveryMethod, provider=$provider, revenueSystemConfigurationId=$revenueSystemConfigurationId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ScheduledCharge
    @JsonCreator
    private constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule")
        @ExcludeMissing
        private val schedule: JsonField<Schedule> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun productId(): String = productId.getRequired("product_id")

        /** Must provide either schedule_items or recurring_schedule. */
        fun schedule(): Schedule = schedule.getRequired("schedule")

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** displayed on invoices */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** displayed on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ScheduledCharge = apply {
            if (validated) {
                return@apply
            }

            productId()
            schedule().validate()
            customFields().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScheduledCharge]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var schedule: JsonField<Schedule>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduledCharge: ScheduledCharge) = apply {
                productId = scheduledCharge.productId
                schedule = scheduledCharge.schedule
                customFields = scheduledCharge.customFields
                name = scheduledCharge.name
                netsuiteSalesOrderId = scheduledCharge.netsuiteSalesOrderId
                additionalProperties = scheduledCharge.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ScheduledCharge =
                ScheduledCharge(
                    checkRequired("productId", productId),
                    checkRequired("schedule", schedule),
                    customFields,
                    name,
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Must provide either schedule_items or recurring_schedule. */
        @NoAutoDetect
        class Schedule
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            private val doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            private val recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
            @JsonProperty("schedule_items")
            @ExcludeMissing
            private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Defaults to USD (cents) if not passed. */
            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             */
            fun doNotInvoice(): Optional<Boolean> =
                Optional.ofNullable(doNotInvoice.getNullable("do_not_invoice"))

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            fun recurringSchedule(): Optional<RecurringSchedule> =
                Optional.ofNullable(recurringSchedule.getNullable("recurring_schedule"))

            /** Either provide amount or provide both unit_price and quantity. */
            fun scheduleItems(): Optional<List<ScheduleItem>> =
                Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

            /** Defaults to USD (cents) if not passed. */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             */
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Schedule = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                doNotInvoice()
                recurringSchedule().ifPresent { it.validate() }
                scheduleItems().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Schedule]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
                    doNotInvoice = schedule.doNotInvoice
                    recurringSchedule = schedule.recurringSchedule
                    scheduleItems = schedule.scheduleItems.map { it.toMutableList() }
                    additionalProperties = schedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                    this.doNotInvoice = doNotInvoice
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                    recurringSchedule(JsonField.of(recurringSchedule))

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(scheduleItem)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        doNotInvoice,
                        recurringSchedule,
                        (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @NoAutoDetect
            class RecurringSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("amount_distribution")
                @ExcludeMissing
                private val amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                private val frequency: JsonField<Frequency> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amountDistribution(): AmountDistribution =
                    amountDistribution.getRequired("amount_distribution")

                /** RFC 3339 timestamp (exclusive). */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                fun frequency(): Frequency = frequency.getRequired("frequency")

                /** RFC 3339 timestamp (inclusive). */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                @JsonProperty("amount_distribution")
                @ExcludeMissing
                fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<Frequency> = frequency

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): RecurringSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDistribution()
                    endingBefore()
                    frequency()
                    startingAt()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringSchedule]. */
                class Builder internal constructor() {

                    private var amountDistribution: JsonField<AmountDistribution>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var frequency: JsonField<Frequency>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        amountDistribution = recurringSchedule.amountDistribution
                        endingBefore = recurringSchedule.endingBefore
                        frequency = recurringSchedule.frequency
                        startingAt = recurringSchedule.startingAt
                        amount = recurringSchedule.amount
                        quantity = recurringSchedule.quantity
                        unitPrice = recurringSchedule.unitPrice
                        additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                    }

                    fun amountDistribution(amountDistribution: AmountDistribution) =
                        amountDistribution(JsonField.of(amountDistribution))

                    fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) =
                        apply {
                            this.amountDistribution = amountDistribution
                        }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                    fun frequency(frequency: JsonField<Frequency>) = apply {
                        this.frequency = frequency
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkRequired("amountDistribution", amountDistribution),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("frequency", frequency),
                            checkRequired("startingAt", startingAt),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                class AmountDistribution
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    /** An enum containing [AmountDistribution]'s known values. */
                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    /**
                     * An enum containing [AmountDistribution]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [AmountDistribution] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        /**
                         * An enum member indicating that [AmountDistribution] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DIVIDED -> Known.DIVIDED
                            DIVIDED_ROUNDED -> Known.DIVIDED_ROUNDED
                            EACH -> Known.EACH
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown AmountDistribution: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    /** An enum containing [Frequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    /**
                     * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Frequency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        /**
                         * An enum member indicating that [Frequency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && amountDistribution == other.amountDistribution && endingBefore == other.endingBefore && frequency == other.frequency && startingAt == other.startingAt && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDistribution, endingBefore, frequency, startingAt, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** timestamp of the scheduled event */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    timestamp()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        timestamp = scheduleItem.timestamp
                        amount = scheduleItem.amount
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("timestamp", timestamp),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && doNotInvoice == other.doNotInvoice && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduledCharge && productId == other.productId && schedule == other.schedule && customFields == other.customFields && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, schedule, customFields, name, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduledCharge{productId=$productId, schedule=$schedule, customFields=$customFields, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    /**
     * Determines which scheduled and commit charges to consolidate onto the Contract's usage
     * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
     * consolidation to occur. This field cannot be modified after a Contract has been created. If
     * this field is omitted, charges will appear on a separate invoice from usage charges.
     */
    class ScheduledChargesOnUsageInvoices
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALL = of("ALL")

            @JvmStatic fun of(value: String) = ScheduledChargesOnUsageInvoices(JsonField.of(value))
        }

        /** An enum containing [ScheduledChargesOnUsageInvoices]'s known values. */
        enum class Known {
            ALL
        }

        /**
         * An enum containing [ScheduledChargesOnUsageInvoices]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ScheduledChargesOnUsageInvoices] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            /**
             * An enum member indicating that [ScheduledChargesOnUsageInvoices] was instantiated
             * with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ALL -> Value.ALL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ALL -> Known.ALL
                else ->
                    throw MetronomeInvalidDataException(
                        "Unknown ScheduledChargesOnUsageInvoices: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduledChargesOnUsageInvoices && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Subscription
    @JsonCreator
    private constructor(
        @JsonProperty("collection_schedule")
        @ExcludeMissing
        private val collectionSchedule: JsonField<CollectionSchedule> = JsonMissing.of(),
        @JsonProperty("proration")
        @ExcludeMissing
        private val proration: JsonField<Proration> = JsonMissing.of(),
        @JsonProperty("subscription_rate")
        @ExcludeMissing
        private val subscriptionRate: JsonField<SubscriptionRate> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("initial_quantity")
        @ExcludeMissing
        private val initialQuantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity_management_mode")
        @ExcludeMissing
        private val quantityManagementMode: JsonField<QuantityManagementMode> = JsonMissing.of(),
        @JsonProperty("seat_config")
        @ExcludeMissing
        private val seatConfig: JsonField<SeatConfig> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("temporary_id")
        @ExcludeMissing
        private val temporaryId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun collectionSchedule(): CollectionSchedule =
            collectionSchedule.getRequired("collection_schedule")

        fun proration(): Proration = proration.getRequired("proration")

        fun subscriptionRate(): SubscriptionRate = subscriptionRate.getRequired("subscription_rate")

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Exclusive end time for the subscription. If not provided, subscription inherits contract
         * end date.
         */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /**
         * The initial quantity for the subscription. It must be non-negative value. Required if
         * quantity_management_mode is QUANTITY_ONLY.
         */
        fun initialQuantity(): Optional<Double> =
            Optional.ofNullable(initialQuantity.getNullable("initial_quantity"))

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
         * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
         * `initial_quantity` must be provided with this option. Compatible with recurring
         * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
         * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
         * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
         * subscription to use a linked recurring credit with an allocation per seat. `seat_config`
         * must be provided with this option.
         */
        fun quantityManagementMode(): Optional<QuantityManagementMode> =
            Optional.ofNullable(quantityManagementMode.getNullable("quantity_management_mode"))

        fun seatConfig(): Optional<SeatConfig> =
            Optional.ofNullable(seatConfig.getNullable("seat_config"))

        /**
         * Inclusive start time for the subscription. If not provided, defaults to contract start
         * date
         */
        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        /**
         * A temporary ID used to reference the subscription in recurring commit/credit subscription
         * configs created within the same payload.
         */
        fun temporaryId(): Optional<String> =
            Optional.ofNullable(temporaryId.getNullable("temporary_id"))

        @JsonProperty("collection_schedule")
        @ExcludeMissing
        fun _collectionSchedule(): JsonField<CollectionSchedule> = collectionSchedule

        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

        @JsonProperty("subscription_rate")
        @ExcludeMissing
        fun _subscriptionRate(): JsonField<SubscriptionRate> = subscriptionRate

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Exclusive end time for the subscription. If not provided, subscription inherits contract
         * end date.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * The initial quantity for the subscription. It must be non-negative value. Required if
         * quantity_management_mode is QUANTITY_ONLY.
         */
        @JsonProperty("initial_quantity")
        @ExcludeMissing
        fun _initialQuantity(): JsonField<Double> = initialQuantity

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
         * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
         * `initial_quantity` must be provided with this option. Compatible with recurring
         * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
         * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
         * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
         * subscription to use a linked recurring credit with an allocation per seat. `seat_config`
         * must be provided with this option.
         */
        @JsonProperty("quantity_management_mode")
        @ExcludeMissing
        fun _quantityManagementMode(): JsonField<QuantityManagementMode> = quantityManagementMode

        @JsonProperty("seat_config")
        @ExcludeMissing
        fun _seatConfig(): JsonField<SeatConfig> = seatConfig

        /**
         * Inclusive start time for the subscription. If not provided, defaults to contract start
         * date
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * A temporary ID used to reference the subscription in recurring commit/credit subscription
         * configs created within the same payload.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (validated) {
                return@apply
            }

            collectionSchedule()
            proration().validate()
            subscriptionRate().validate()
            customFields().ifPresent { it.validate() }
            description()
            endingBefore()
            initialQuantity()
            name()
            quantityManagementMode()
            seatConfig().ifPresent { it.validate() }
            startingAt()
            temporaryId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Subscription]. */
        class Builder internal constructor() {

            private var collectionSchedule: JsonField<CollectionSchedule>? = null
            private var proration: JsonField<Proration>? = null
            private var subscriptionRate: JsonField<SubscriptionRate>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var initialQuantity: JsonField<Double> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var quantityManagementMode: JsonField<QuantityManagementMode> = JsonMissing.of()
            private var seatConfig: JsonField<SeatConfig> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var temporaryId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscription: Subscription) = apply {
                collectionSchedule = subscription.collectionSchedule
                proration = subscription.proration
                subscriptionRate = subscription.subscriptionRate
                customFields = subscription.customFields
                description = subscription.description
                endingBefore = subscription.endingBefore
                initialQuantity = subscription.initialQuantity
                name = subscription.name
                quantityManagementMode = subscription.quantityManagementMode
                seatConfig = subscription.seatConfig
                startingAt = subscription.startingAt
                temporaryId = subscription.temporaryId
                additionalProperties = subscription.additionalProperties.toMutableMap()
            }

            fun collectionSchedule(collectionSchedule: CollectionSchedule) =
                collectionSchedule(JsonField.of(collectionSchedule))

            fun collectionSchedule(collectionSchedule: JsonField<CollectionSchedule>) = apply {
                this.collectionSchedule = collectionSchedule
            }

            fun proration(proration: Proration) = proration(JsonField.of(proration))

            fun proration(proration: JsonField<Proration>) = apply { this.proration = proration }

            fun subscriptionRate(subscriptionRate: SubscriptionRate) =
                subscriptionRate(JsonField.of(subscriptionRate))

            fun subscriptionRate(subscriptionRate: JsonField<SubscriptionRate>) = apply {
                this.subscriptionRate = subscriptionRate
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Exclusive end time for the subscription. If not provided, subscription inherits
             * contract end date.
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Exclusive end time for the subscription. If not provided, subscription inherits
             * contract end date.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * The initial quantity for the subscription. It must be non-negative value. Required if
             * quantity_management_mode is QUANTITY_ONLY.
             */
            fun initialQuantity(initialQuantity: Double) =
                initialQuantity(JsonField.of(initialQuantity))

            /**
             * The initial quantity for the subscription. It must be non-negative value. Required if
             * quantity_management_mode is QUANTITY_ONLY.
             */
            fun initialQuantity(initialQuantity: JsonField<Double>) = apply {
                this.initialQuantity = initialQuantity
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
             * **QUANTITY_ONLY**: The subscription quantity is specified directly on the
             * subscription. `initial_quantity` must be provided with this option. Compatible with
             * recurring commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you
             * want to pass specific seat identifiers (e.g. add user_123) to increment and decrement
             * a subscription quantity, rather than directly providing the quantity. You must use a
             * **SEAT_BASED** subscription to use a linked recurring credit with an allocation per
             * seat. `seat_config` must be provided with this option.
             */
            fun quantityManagementMode(quantityManagementMode: QuantityManagementMode) =
                quantityManagementMode(JsonField.of(quantityManagementMode))

            /**
             * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
             * **QUANTITY_ONLY**: The subscription quantity is specified directly on the
             * subscription. `initial_quantity` must be provided with this option. Compatible with
             * recurring commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you
             * want to pass specific seat identifiers (e.g. add user_123) to increment and decrement
             * a subscription quantity, rather than directly providing the quantity. You must use a
             * **SEAT_BASED** subscription to use a linked recurring credit with an allocation per
             * seat. `seat_config` must be provided with this option.
             */
            fun quantityManagementMode(quantityManagementMode: JsonField<QuantityManagementMode>) =
                apply {
                    this.quantityManagementMode = quantityManagementMode
                }

            fun seatConfig(seatConfig: SeatConfig) = seatConfig(JsonField.of(seatConfig))

            fun seatConfig(seatConfig: JsonField<SeatConfig>) = apply {
                this.seatConfig = seatConfig
            }

            /**
             * Inclusive start time for the subscription. If not provided, defaults to contract
             * start date
             */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Inclusive start time for the subscription. If not provided, defaults to contract
             * start date
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * A temporary ID used to reference the subscription in recurring commit/credit
             * subscription configs created within the same payload.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * A temporary ID used to reference the subscription in recurring commit/credit
             * subscription configs created within the same payload.
             */
            fun temporaryId(temporaryId: JsonField<String>) = apply {
                this.temporaryId = temporaryId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Subscription =
                Subscription(
                    checkRequired("collectionSchedule", collectionSchedule),
                    checkRequired("proration", proration),
                    checkRequired("subscriptionRate", subscriptionRate),
                    customFields,
                    description,
                    endingBefore,
                    initialQuantity,
                    name,
                    quantityManagementMode,
                    seatConfig,
                    startingAt,
                    temporaryId,
                    additionalProperties.toImmutable(),
                )
        }

        class CollectionSchedule
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ADVANCE = of("ADVANCE")

                @JvmField val ARREARS = of("ARREARS")

                @JvmStatic fun of(value: String) = CollectionSchedule(JsonField.of(value))
            }

            /** An enum containing [CollectionSchedule]'s known values. */
            enum class Known {
                ADVANCE,
                ARREARS,
            }

            /**
             * An enum containing [CollectionSchedule]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [CollectionSchedule] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADVANCE,
                ARREARS,
                /**
                 * An enum member indicating that [CollectionSchedule] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ADVANCE -> Value.ADVANCE
                    ARREARS -> Value.ARREARS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ADVANCE -> Known.ADVANCE
                    ARREARS -> Known.ARREARS
                    else ->
                        throw MetronomeInvalidDataException("Unknown CollectionSchedule: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CollectionSchedule && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Proration
        @JsonCreator
        private constructor(
            @JsonProperty("invoice_behavior")
            @ExcludeMissing
            private val invoiceBehavior: JsonField<InvoiceBehavior> = JsonMissing.of(),
            @JsonProperty("is_prorated")
            @ExcludeMissing
            private val isProrated: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Indicates how mid-period quantity adjustments are invoiced. **BILL_IMMEDIATELY**:
             * Only available when collection schedule is `ADVANCE`. The quantity increase will be
             * billed immediately on the scheduled date. **BILL_ON_NEXT_COLLECTION_DATE**: The
             * quantity increase will be billed for in-arrears at the end of the period.
             */
            fun invoiceBehavior(): Optional<InvoiceBehavior> =
                Optional.ofNullable(invoiceBehavior.getNullable("invoice_behavior"))

            /** Indicates if the partial period will be prorated or charged a full amount. */
            fun isProrated(): Optional<Boolean> =
                Optional.ofNullable(isProrated.getNullable("is_prorated"))

            /**
             * Indicates how mid-period quantity adjustments are invoiced. **BILL_IMMEDIATELY**:
             * Only available when collection schedule is `ADVANCE`. The quantity increase will be
             * billed immediately on the scheduled date. **BILL_ON_NEXT_COLLECTION_DATE**: The
             * quantity increase will be billed for in-arrears at the end of the period.
             */
            @JsonProperty("invoice_behavior")
            @ExcludeMissing
            fun _invoiceBehavior(): JsonField<InvoiceBehavior> = invoiceBehavior

            /** Indicates if the partial period will be prorated or charged a full amount. */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun _isProrated(): JsonField<Boolean> = isProrated

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Proration = apply {
                if (validated) {
                    return@apply
                }

                invoiceBehavior()
                isProrated()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Proration]. */
            class Builder internal constructor() {

                private var invoiceBehavior: JsonField<InvoiceBehavior> = JsonMissing.of()
                private var isProrated: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(proration: Proration) = apply {
                    invoiceBehavior = proration.invoiceBehavior
                    isProrated = proration.isProrated
                    additionalProperties = proration.additionalProperties.toMutableMap()
                }

                /**
                 * Indicates how mid-period quantity adjustments are invoiced. **BILL_IMMEDIATELY**:
                 * Only available when collection schedule is `ADVANCE`. The quantity increase will
                 * be billed immediately on the scheduled date. **BILL_ON_NEXT_COLLECTION_DATE**:
                 * The quantity increase will be billed for in-arrears at the end of the period.
                 */
                fun invoiceBehavior(invoiceBehavior: InvoiceBehavior) =
                    invoiceBehavior(JsonField.of(invoiceBehavior))

                /**
                 * Indicates how mid-period quantity adjustments are invoiced. **BILL_IMMEDIATELY**:
                 * Only available when collection schedule is `ADVANCE`. The quantity increase will
                 * be billed immediately on the scheduled date. **BILL_ON_NEXT_COLLECTION_DATE**:
                 * The quantity increase will be billed for in-arrears at the end of the period.
                 */
                fun invoiceBehavior(invoiceBehavior: JsonField<InvoiceBehavior>) = apply {
                    this.invoiceBehavior = invoiceBehavior
                }

                /** Indicates if the partial period will be prorated or charged a full amount. */
                fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                /** Indicates if the partial period will be prorated or charged a full amount. */
                fun isProrated(isProrated: JsonField<Boolean>) = apply {
                    this.isProrated = isProrated
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Proration =
                    Proration(invoiceBehavior, isProrated, additionalProperties.toImmutable())
            }

            /**
             * Indicates how mid-period quantity adjustments are invoiced. **BILL_IMMEDIATELY**:
             * Only available when collection schedule is `ADVANCE`. The quantity increase will be
             * billed immediately on the scheduled date. **BILL_ON_NEXT_COLLECTION_DATE**: The
             * quantity increase will be billed for in-arrears at the end of the period.
             */
            class InvoiceBehavior
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BILL_IMMEDIATELY = of("BILL_IMMEDIATELY")

                    @JvmField val BILL_ON_NEXT_COLLECTION_DATE = of("BILL_ON_NEXT_COLLECTION_DATE")

                    @JvmStatic fun of(value: String) = InvoiceBehavior(JsonField.of(value))
                }

                /** An enum containing [InvoiceBehavior]'s known values. */
                enum class Known {
                    BILL_IMMEDIATELY,
                    BILL_ON_NEXT_COLLECTION_DATE,
                }

                /**
                 * An enum containing [InvoiceBehavior]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [InvoiceBehavior] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BILL_IMMEDIATELY,
                    BILL_ON_NEXT_COLLECTION_DATE,
                    /**
                     * An enum member indicating that [InvoiceBehavior] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BILL_IMMEDIATELY -> Value.BILL_IMMEDIATELY
                        BILL_ON_NEXT_COLLECTION_DATE -> Value.BILL_ON_NEXT_COLLECTION_DATE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        BILL_IMMEDIATELY -> Known.BILL_IMMEDIATELY
                        BILL_ON_NEXT_COLLECTION_DATE -> Known.BILL_ON_NEXT_COLLECTION_DATE
                        else ->
                            throw MetronomeInvalidDataException("Unknown InvoiceBehavior: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceBehavior && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Proration && invoiceBehavior == other.invoiceBehavior && isProrated == other.isProrated && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(invoiceBehavior, isProrated, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Proration{invoiceBehavior=$invoiceBehavior, isProrated=$isProrated, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class SubscriptionRate
        @JsonCreator
        private constructor(
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            private val productId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Frequency to bill subscription with. Together with product_id, must match existing
             * rate on the rate card.
             */
            fun billingFrequency(): BillingFrequency =
                billingFrequency.getRequired("billing_frequency")

            /** Must be subscription type product */
            fun productId(): String = productId.getRequired("product_id")

            /**
             * Frequency to bill subscription with. Together with product_id, must match existing
             * rate on the rate card.
             */
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

            /** Must be subscription type product */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SubscriptionRate = apply {
                if (validated) {
                    return@apply
                }

                billingFrequency()
                productId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SubscriptionRate]. */
            class Builder internal constructor() {

                private var billingFrequency: JsonField<BillingFrequency>? = null
                private var productId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subscriptionRate: SubscriptionRate) = apply {
                    billingFrequency = subscriptionRate.billingFrequency
                    productId = subscriptionRate.productId
                    additionalProperties = subscriptionRate.additionalProperties.toMutableMap()
                }

                /**
                 * Frequency to bill subscription with. Together with product_id, must match
                 * existing rate on the rate card.
                 */
                fun billingFrequency(billingFrequency: BillingFrequency) =
                    billingFrequency(JsonField.of(billingFrequency))

                /**
                 * Frequency to bill subscription with. Together with product_id, must match
                 * existing rate on the rate card.
                 */
                fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                    this.billingFrequency = billingFrequency
                }

                /** Must be subscription type product */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /** Must be subscription type product */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): SubscriptionRate =
                    SubscriptionRate(
                        checkRequired("billingFrequency", billingFrequency),
                        checkRequired("productId", productId),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Frequency to bill subscription with. Together with product_id, must match existing
             * rate on the rate card.
             */
            class BillingFrequency
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val QUARTERLY = of("QUARTERLY")

                    @JvmField val ANNUAL = of("ANNUAL")

                    @JvmField val WEEKLY = of("WEEKLY")

                    @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
                }

                /** An enum containing [BillingFrequency]'s known values. */
                enum class Known {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                }

                /**
                 * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BillingFrequency] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                    /**
                     * An enum member indicating that [BillingFrequency] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ANNUAL -> Value.ANNUAL
                        WEEKLY -> Value.WEEKLY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ANNUAL -> Known.ANNUAL
                        WEEKLY -> Known.WEEKLY
                        else ->
                            throw MetronomeInvalidDataException("Unknown BillingFrequency: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillingFrequency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubscriptionRate && billingFrequency == other.billingFrequency && productId == other.productId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(billingFrequency, productId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionRate{billingFrequency=$billingFrequency, productId=$productId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
         * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
         * `initial_quantity` must be provided with this option. Compatible with recurring
         * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
         * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
         * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
         * subscription to use a linked recurring credit with an allocation per seat. `seat_config`
         * must be provided with this option.
         */
        class QuantityManagementMode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SEAT_BASED = of("SEAT_BASED")

                @JvmField val QUANTITY_ONLY = of("QUANTITY_ONLY")

                @JvmStatic fun of(value: String) = QuantityManagementMode(JsonField.of(value))
            }

            /** An enum containing [QuantityManagementMode]'s known values. */
            enum class Known {
                SEAT_BASED,
                QUANTITY_ONLY,
            }

            /**
             * An enum containing [QuantityManagementMode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [QuantityManagementMode] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SEAT_BASED,
                QUANTITY_ONLY,
                /**
                 * An enum member indicating that [QuantityManagementMode] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SEAT_BASED -> Value.SEAT_BASED
                    QUANTITY_ONLY -> Value.QUANTITY_ONLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SEAT_BASED -> Known.SEAT_BASED
                    QUANTITY_ONLY -> Known.QUANTITY_ONLY
                    else ->
                        throw MetronomeInvalidDataException(
                            "Unknown QuantityManagementMode: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is QuantityManagementMode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class SeatConfig
        @JsonCreator
        private constructor(
            @JsonProperty("initial_seat_ids")
            @ExcludeMissing
            private val initialSeatIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("seat_group_key")
            @ExcludeMissing
            private val seatGroupKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initial_unassigned_seats")
            @ExcludeMissing
            private val initialUnassignedSeats: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The initial assigned seats on this subscription. */
            fun initialSeatIds(): List<String> = initialSeatIds.getRequired("initial_seat_ids")

            /**
             * The property name, sent on usage events, that identifies the seat ID associated with
             * the usage event. For example, the property name might be seat_id or user_id. The
             * property must be set as a group key on billable metrics and a presentation/pricing
             * group key on contract products. This allows linked recurring credits with an
             * allocation per seat to be consumed by only one seat's usage.
             */
            fun seatGroupKey(): String = seatGroupKey.getRequired("seat_group_key")

            /** The initial amount of unassigned seats on this subscription. */
            fun initialUnassignedSeats(): Optional<Double> =
                Optional.ofNullable(initialUnassignedSeats.getNullable("initial_unassigned_seats"))

            /** The initial assigned seats on this subscription. */
            @JsonProperty("initial_seat_ids")
            @ExcludeMissing
            fun _initialSeatIds(): JsonField<List<String>> = initialSeatIds

            /**
             * The property name, sent on usage events, that identifies the seat ID associated with
             * the usage event. For example, the property name might be seat_id or user_id. The
             * property must be set as a group key on billable metrics and a presentation/pricing
             * group key on contract products. This allows linked recurring credits with an
             * allocation per seat to be consumed by only one seat's usage.
             */
            @JsonProperty("seat_group_key")
            @ExcludeMissing
            fun _seatGroupKey(): JsonField<String> = seatGroupKey

            /** The initial amount of unassigned seats on this subscription. */
            @JsonProperty("initial_unassigned_seats")
            @ExcludeMissing
            fun _initialUnassignedSeats(): JsonField<Double> = initialUnassignedSeats

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SeatConfig = apply {
                if (validated) {
                    return@apply
                }

                initialSeatIds()
                seatGroupKey()
                initialUnassignedSeats()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SeatConfig]. */
            class Builder internal constructor() {

                private var initialSeatIds: JsonField<MutableList<String>>? = null
                private var seatGroupKey: JsonField<String>? = null
                private var initialUnassignedSeats: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(seatConfig: SeatConfig) = apply {
                    initialSeatIds = seatConfig.initialSeatIds.map { it.toMutableList() }
                    seatGroupKey = seatConfig.seatGroupKey
                    initialUnassignedSeats = seatConfig.initialUnassignedSeats
                    additionalProperties = seatConfig.additionalProperties.toMutableMap()
                }

                /** The initial assigned seats on this subscription. */
                fun initialSeatIds(initialSeatIds: List<String>) =
                    initialSeatIds(JsonField.of(initialSeatIds))

                /** The initial assigned seats on this subscription. */
                fun initialSeatIds(initialSeatIds: JsonField<List<String>>) = apply {
                    this.initialSeatIds = initialSeatIds.map { it.toMutableList() }
                }

                /** The initial assigned seats on this subscription. */
                fun addInitialSeatId(initialSeatId: String) = apply {
                    initialSeatIds =
                        (initialSeatIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(initialSeatId)
                        }
                }

                /**
                 * The property name, sent on usage events, that identifies the seat ID associated
                 * with the usage event. For example, the property name might be seat_id or user_id.
                 * The property must be set as a group key on billable metrics and a
                 * presentation/pricing group key on contract products. This allows linked recurring
                 * credits with an allocation per seat to be consumed by only one seat's usage.
                 */
                fun seatGroupKey(seatGroupKey: String) = seatGroupKey(JsonField.of(seatGroupKey))

                /**
                 * The property name, sent on usage events, that identifies the seat ID associated
                 * with the usage event. For example, the property name might be seat_id or user_id.
                 * The property must be set as a group key on billable metrics and a
                 * presentation/pricing group key on contract products. This allows linked recurring
                 * credits with an allocation per seat to be consumed by only one seat's usage.
                 */
                fun seatGroupKey(seatGroupKey: JsonField<String>) = apply {
                    this.seatGroupKey = seatGroupKey
                }

                /** The initial amount of unassigned seats on this subscription. */
                fun initialUnassignedSeats(initialUnassignedSeats: Double) =
                    initialUnassignedSeats(JsonField.of(initialUnassignedSeats))

                /** The initial amount of unassigned seats on this subscription. */
                fun initialUnassignedSeats(initialUnassignedSeats: JsonField<Double>) = apply {
                    this.initialUnassignedSeats = initialUnassignedSeats
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): SeatConfig =
                    SeatConfig(
                        checkRequired("initialSeatIds", initialSeatIds).map { it.toImmutable() },
                        checkRequired("seatGroupKey", seatGroupKey),
                        initialUnassignedSeats,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SeatConfig && initialSeatIds == other.initialSeatIds && seatGroupKey == other.seatGroupKey && initialUnassignedSeats == other.initialUnassignedSeats && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(initialSeatIds, seatGroupKey, initialUnassignedSeats, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SeatConfig{initialSeatIds=$initialSeatIds, seatGroupKey=$seatGroupKey, initialUnassignedSeats=$initialUnassignedSeats, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Subscription && collectionSchedule == other.collectionSchedule && proration == other.proration && subscriptionRate == other.subscriptionRate && customFields == other.customFields && description == other.description && endingBefore == other.endingBefore && initialQuantity == other.initialQuantity && name == other.name && quantityManagementMode == other.quantityManagementMode && seatConfig == other.seatConfig && startingAt == other.startingAt && temporaryId == other.temporaryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(collectionSchedule, proration, subscriptionRate, customFields, description, endingBefore, initialQuantity, name, quantityManagementMode, seatConfig, startingAt, temporaryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Subscription{collectionSchedule=$collectionSchedule, proration=$proration, subscriptionRate=$subscriptionRate, customFields=$customFields, description=$description, endingBefore=$endingBefore, initialQuantity=$initialQuantity, name=$name, quantityManagementMode=$quantityManagementMode, seatConfig=$seatConfig, startingAt=$startingAt, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Transition
    @JsonCreator
    private constructor(
        @JsonProperty("from_contract_id")
        @ExcludeMissing
        private val fromContractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("future_invoice_behavior")
        @ExcludeMissing
        private val futureInvoiceBehavior: JsonField<FutureInvoiceBehavior> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun fromContractId(): String = fromContractId.getRequired("from_contract_id")

        /** This field's available values may vary based on your client's configuration. */
        fun type(): Type = type.getRequired("type")

        fun futureInvoiceBehavior(): Optional<FutureInvoiceBehavior> =
            Optional.ofNullable(futureInvoiceBehavior.getNullable("future_invoice_behavior"))

        @JsonProperty("from_contract_id")
        @ExcludeMissing
        fun _fromContractId(): JsonField<String> = fromContractId

        /** This field's available values may vary based on your client's configuration. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonProperty("future_invoice_behavior")
        @ExcludeMissing
        fun _futureInvoiceBehavior(): JsonField<FutureInvoiceBehavior> = futureInvoiceBehavior

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Transition = apply {
            if (validated) {
                return@apply
            }

            fromContractId()
            type()
            futureInvoiceBehavior().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transition]. */
        class Builder internal constructor() {

            private var fromContractId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var futureInvoiceBehavior: JsonField<FutureInvoiceBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transition: Transition) = apply {
                fromContractId = transition.fromContractId
                type = transition.type
                futureInvoiceBehavior = transition.futureInvoiceBehavior
                additionalProperties = transition.additionalProperties.toMutableMap()
            }

            fun fromContractId(fromContractId: String) =
                fromContractId(JsonField.of(fromContractId))

            fun fromContractId(fromContractId: JsonField<String>) = apply {
                this.fromContractId = fromContractId
            }

            /** This field's available values may vary based on your client's configuration. */
            fun type(type: Type) = type(JsonField.of(type))

            /** This field's available values may vary based on your client's configuration. */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun futureInvoiceBehavior(futureInvoiceBehavior: FutureInvoiceBehavior) =
                futureInvoiceBehavior(JsonField.of(futureInvoiceBehavior))

            fun futureInvoiceBehavior(futureInvoiceBehavior: JsonField<FutureInvoiceBehavior>) =
                apply {
                    this.futureInvoiceBehavior = futureInvoiceBehavior
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Transition =
                Transition(
                    checkRequired("fromContractId", fromContractId),
                    checkRequired("type", type),
                    futureInvoiceBehavior,
                    additionalProperties.toImmutable(),
                )
        }

        /** This field's available values may vary based on your client's configuration. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SUPERSEDE = of("SUPERSEDE")

                @JvmField val RENEWAL = of("RENEWAL")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SUPERSEDE,
                RENEWAL,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUPERSEDE,
                RENEWAL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SUPERSEDE -> Value.SUPERSEDE
                    RENEWAL -> Value.RENEWAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SUPERSEDE -> Known.SUPERSEDE
                    RENEWAL -> Known.RENEWAL
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class FutureInvoiceBehavior
        @JsonCreator
        private constructor(
            @JsonProperty("trueup")
            @ExcludeMissing
            private val trueup: JsonField<Trueup> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Controls whether future trueup invoices are billed or removed. Default behavior is
             * AS_IS if not specified.
             */
            fun trueup(): Optional<Trueup> = Optional.ofNullable(trueup.getNullable("trueup"))

            /**
             * Controls whether future trueup invoices are billed or removed. Default behavior is
             * AS_IS if not specified.
             */
            @JsonProperty("trueup") @ExcludeMissing fun _trueup(): JsonField<Trueup> = trueup

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): FutureInvoiceBehavior = apply {
                if (validated) {
                    return@apply
                }

                trueup()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FutureInvoiceBehavior]. */
            class Builder internal constructor() {

                private var trueup: JsonField<Trueup> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(futureInvoiceBehavior: FutureInvoiceBehavior) = apply {
                    trueup = futureInvoiceBehavior.trueup
                    additionalProperties = futureInvoiceBehavior.additionalProperties.toMutableMap()
                }

                /**
                 * Controls whether future trueup invoices are billed or removed. Default behavior
                 * is AS_IS if not specified.
                 */
                fun trueup(trueup: Trueup?) = trueup(JsonField.ofNullable(trueup))

                /**
                 * Controls whether future trueup invoices are billed or removed. Default behavior
                 * is AS_IS if not specified.
                 */
                fun trueup(trueup: Optional<Trueup>) = trueup(trueup.orElse(null))

                /**
                 * Controls whether future trueup invoices are billed or removed. Default behavior
                 * is AS_IS if not specified.
                 */
                fun trueup(trueup: JsonField<Trueup>) = apply { this.trueup = trueup }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): FutureInvoiceBehavior =
                    FutureInvoiceBehavior(trueup, additionalProperties.toImmutable())
            }

            /**
             * Controls whether future trueup invoices are billed or removed. Default behavior is
             * AS_IS if not specified.
             */
            class Trueup @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val REMOVE = of("REMOVE")

                    @JvmField val AS_IS = of("AS_IS")

                    @JvmStatic fun of(value: String) = Trueup(JsonField.of(value))
                }

                /** An enum containing [Trueup]'s known values. */
                enum class Known {
                    REMOVE,
                    AS_IS,
                }

                /**
                 * An enum containing [Trueup]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Trueup] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REMOVE,
                    AS_IS,
                    /**
                     * An enum member indicating that [Trueup] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        REMOVE -> Value.REMOVE
                        AS_IS -> Value.AS_IS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        REMOVE -> Known.REMOVE
                        AS_IS -> Known.AS_IS
                        else -> throw MetronomeInvalidDataException("Unknown Trueup: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Trueup && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FutureInvoiceBehavior && trueup == other.trueup && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(trueup, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FutureInvoiceBehavior{trueup=$trueup, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transition && fromContractId == other.fromContractId && type == other.type && futureInvoiceBehavior == other.futureInvoiceBehavior && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fromContractId, type, futureInvoiceBehavior, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transition{fromContractId=$fromContractId, type=$type, futureInvoiceBehavior=$futureInvoiceBehavior, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class UsageStatementSchedule
    @JsonCreator
    private constructor(
        @JsonProperty("frequency")
        @ExcludeMissing
        private val frequency: JsonField<Frequency> = JsonMissing.of(),
        @JsonProperty("billing_anchor_date")
        @ExcludeMissing
        private val billingAnchorDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("day") @ExcludeMissing private val day: JsonField<Day> = JsonMissing.of(),
        @JsonProperty("invoice_generation_starting_at")
        @ExcludeMissing
        private val invoiceGenerationStartingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun frequency(): Frequency = frequency.getRequired("frequency")

        /**
         * Required when using CUSTOM_DATE. This option lets you set a historical billing anchor
         * date, aligning future billing cycles with a chosen cadence. For example, if a contract
         * starts on 2024-09-15 and you set the anchor date to 2024-09-10 with a MONTHLY frequency,
         * the first usage statement will cover 09-15 to 10-10. Subsequent statements will follow
         * the 10th of each month.
         */
        fun billingAnchorDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(billingAnchorDate.getNullable("billing_anchor_date"))

        /** If not provided, defaults to the first day of the month. */
        fun day(): Optional<Day> = Optional.ofNullable(day.getNullable("day"))

        /**
         * The date Metronome should start generating usage invoices. If unspecified, contract start
         * date will be used. This is useful to set if you want to import historical invoices via
         * our 'Create Historical Invoices' API rather than having Metronome automatically generate
         * them.
         */
        fun invoiceGenerationStartingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                invoiceGenerationStartingAt.getNullable("invoice_generation_starting_at")
            )

        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<Frequency> = frequency

        /**
         * Required when using CUSTOM_DATE. This option lets you set a historical billing anchor
         * date, aligning future billing cycles with a chosen cadence. For example, if a contract
         * starts on 2024-09-15 and you set the anchor date to 2024-09-10 with a MONTHLY frequency,
         * the first usage statement will cover 09-15 to 10-10. Subsequent statements will follow
         * the 10th of each month.
         */
        @JsonProperty("billing_anchor_date")
        @ExcludeMissing
        fun _billingAnchorDate(): JsonField<OffsetDateTime> = billingAnchorDate

        /** If not provided, defaults to the first day of the month. */
        @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Day> = day

        /**
         * The date Metronome should start generating usage invoices. If unspecified, contract start
         * date will be used. This is useful to set if you want to import historical invoices via
         * our 'Create Historical Invoices' API rather than having Metronome automatically generate
         * them.
         */
        @JsonProperty("invoice_generation_starting_at")
        @ExcludeMissing
        fun _invoiceGenerationStartingAt(): JsonField<OffsetDateTime> = invoiceGenerationStartingAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UsageStatementSchedule = apply {
            if (validated) {
                return@apply
            }

            frequency()
            billingAnchorDate()
            day()
            invoiceGenerationStartingAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UsageStatementSchedule]. */
        class Builder internal constructor() {

            private var frequency: JsonField<Frequency>? = null
            private var billingAnchorDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var day: JsonField<Day> = JsonMissing.of()
            private var invoiceGenerationStartingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageStatementSchedule: UsageStatementSchedule) = apply {
                frequency = usageStatementSchedule.frequency
                billingAnchorDate = usageStatementSchedule.billingAnchorDate
                day = usageStatementSchedule.day
                invoiceGenerationStartingAt = usageStatementSchedule.invoiceGenerationStartingAt
                additionalProperties = usageStatementSchedule.additionalProperties.toMutableMap()
            }

            fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

            fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

            /**
             * Required when using CUSTOM_DATE. This option lets you set a historical billing anchor
             * date, aligning future billing cycles with a chosen cadence. For example, if a
             * contract starts on 2024-09-15 and you set the anchor date to 2024-09-10 with a
             * MONTHLY frequency, the first usage statement will cover 09-15 to 10-10. Subsequent
             * statements will follow the 10th of each month.
             */
            fun billingAnchorDate(billingAnchorDate: OffsetDateTime) =
                billingAnchorDate(JsonField.of(billingAnchorDate))

            /**
             * Required when using CUSTOM_DATE. This option lets you set a historical billing anchor
             * date, aligning future billing cycles with a chosen cadence. For example, if a
             * contract starts on 2024-09-15 and you set the anchor date to 2024-09-10 with a
             * MONTHLY frequency, the first usage statement will cover 09-15 to 10-10. Subsequent
             * statements will follow the 10th of each month.
             */
            fun billingAnchorDate(billingAnchorDate: JsonField<OffsetDateTime>) = apply {
                this.billingAnchorDate = billingAnchorDate
            }

            /** If not provided, defaults to the first day of the month. */
            fun day(day: Day) = day(JsonField.of(day))

            /** If not provided, defaults to the first day of the month. */
            fun day(day: JsonField<Day>) = apply { this.day = day }

            /**
             * The date Metronome should start generating usage invoices. If unspecified, contract
             * start date will be used. This is useful to set if you want to import historical
             * invoices via our 'Create Historical Invoices' API rather than having Metronome
             * automatically generate them.
             */
            fun invoiceGenerationStartingAt(invoiceGenerationStartingAt: OffsetDateTime) =
                invoiceGenerationStartingAt(JsonField.of(invoiceGenerationStartingAt))

            /**
             * The date Metronome should start generating usage invoices. If unspecified, contract
             * start date will be used. This is useful to set if you want to import historical
             * invoices via our 'Create Historical Invoices' API rather than having Metronome
             * automatically generate them.
             */
            fun invoiceGenerationStartingAt(
                invoiceGenerationStartingAt: JsonField<OffsetDateTime>
            ) = apply { this.invoiceGenerationStartingAt = invoiceGenerationStartingAt }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): UsageStatementSchedule =
                UsageStatementSchedule(
                    checkRequired("frequency", frequency),
                    billingAnchorDate,
                    day,
                    invoiceGenerationStartingAt,
                    additionalProperties.toImmutable(),
                )
        }

        class Frequency @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val QUARTERLY = of("QUARTERLY")

                @JvmField val ANNUAL = of("ANNUAL")

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
            }

            /** An enum containing [Frequency]'s known values. */
            enum class Known {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
            }

            /**
             * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Frequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
                /**
                 * An enum member indicating that [Frequency] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    WEEKLY -> Value.WEEKLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    WEEKLY -> Known.WEEKLY
                    else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** If not provided, defaults to the first day of the month. */
        class Day @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FIRST_OF_MONTH = of("FIRST_OF_MONTH")

                @JvmField val CONTRACT_START = of("CONTRACT_START")

                @JvmField val CUSTOM_DATE = of("CUSTOM_DATE")

                @JvmStatic fun of(value: String) = Day(JsonField.of(value))
            }

            /** An enum containing [Day]'s known values. */
            enum class Known {
                FIRST_OF_MONTH,
                CONTRACT_START,
                CUSTOM_DATE,
            }

            /**
             * An enum containing [Day]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Day] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FIRST_OF_MONTH,
                CONTRACT_START,
                CUSTOM_DATE,
                /** An enum member indicating that [Day] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FIRST_OF_MONTH -> Value.FIRST_OF_MONTH
                    CONTRACT_START -> Value.CONTRACT_START
                    CUSTOM_DATE -> Value.CUSTOM_DATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    FIRST_OF_MONTH -> Known.FIRST_OF_MONTH
                    CONTRACT_START -> Known.CONTRACT_START
                    CUSTOM_DATE -> Known.CUSTOM_DATE
                    else -> throw MetronomeInvalidDataException("Unknown Day: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Day && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageStatementSchedule && frequency == other.frequency && billingAnchorDate == other.billingAnchorDate && day == other.day && invoiceGenerationStartingAt == other.invoiceGenerationStartingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(frequency, billingAnchorDate, day, invoiceGenerationStartingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageStatementSchedule{frequency=$frequency, billingAnchorDate=$billingAnchorDate, day=$day, invoiceGenerationStartingAt=$invoiceGenerationStartingAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1ContractCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1ContractCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
