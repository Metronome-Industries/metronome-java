// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CommitSpecifierInput
import com.metronome.api.models.PrepaidBalanceThresholdConfiguration
import com.metronome.api.models.SpendThresholdConfiguration
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a package that defines a set of reusable, time-relative contract terms that can be used
 * across cohorts of customers. Packages provide an abstraction layer on top of rate cards to
 * provide an easy way to provision customers with standard pricing.
 *
 * ### **Use this endpoint to:**
 * - Model standard pay-as-you-go pricing packages that can be easily reused across customers
 * - Define standardized contract terms and discounting for sales-led motions
 * - Set aliases for the package to facilitate easy package transition. Aliases are human-readable
 *   names that you can use in the place of the id of the package when provisioning a customer’s
 *   contract. By using an alias, you can easily create a contract and provision a customer by
 *   choosing the “Starter Plan” package, without storing the package ID in your internal systems.
 *   This is helpful when launching terms for a package, as you can create a new package with the
 *   “Starter Plan” alias scheduled to be assigned without updating your provisioning code.
 *
 * ### Key input fields:
 * - `starting_at_offset`: Starting date relative to contract start. Generates the `starting_at`
 *   date when a contract is provisioned using a package.
 * - `duration`: Duration starting from `starting_at_offset`. Generates the `ending_before` date
 *   when a contract is provisioned using a package.
 * - `date_offset`: Date relative to contract start. Used for point-in-time dates without a
 *   duration.
 * - `aliases`: Human-readable name to use when provisioning contracts with a package.
 *
 * ### Usage guidelines:
 * - Use packages for standard self-serve use cases where customers have consistent terms. For
 *   customers with negotiated custom contract terms, use the `createContract` endpoint for maximum
 *   flexibility.
 * - Billing provider configuration can be set when creating a package by using `billing_provider`
 *   and `delivery_method`. To provision a customer successfully with a package, the customer must
 *   have one and only one billing provider configuration that matches the billing provider
 *   configuration set on the package.
 * - A package alias can only be used by one package at a time. If you create a new package with an
 *   alias that is already in use by another package, the original package’s alias schedule will be
 *   updated. The alias will reference the package to which it was most recently assigned.
 * - Terms can only be specified using times relative to the contract start date. Supported
 *   granularities are: `days`, `weeks`, `months`, `years`
 * - Packages cannot be edited once created. Use the rate card to easily add new rates across all of
 *   your customers or make direct edits to a contract after provisioning with a package. Edited
 *   contracts will still be associated with the package used during provisioning.
 */
class PackageCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Reference this alias when creating a contract. If the same alias is assigned to multiple
     * packages, it will reference the package to which it was most recently assigned. It is not
     * exposed to end customers.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aliases(): Optional<List<Alias>> = body.aliases()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingProvider(): Optional<BillingProvider> = body.billingProvider()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commits(): Optional<List<Commit>> = body.commits()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractName(): Optional<String> = body.contractName()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credits(): Optional<List<Credit>> = body.credits()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryMethod(): Optional<DeliveryMethod> = body.deliveryMethod()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<Duration> = body.duration()

    /**
     * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
     * automatically. EXPLICIT prioritization requires specifying priorities for each multiplier;
     * the one with the lowest priority value will be prioritized first. If tiered overrides are
     * used, prioritization must be explicit.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiplierOverridePrioritization(): Optional<MultiplierOverridePrioritization> =
        body.multiplierOverridePrioritization()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPaymentTermsDays(): Optional<Double> = body.netPaymentTermsDays()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrides(): Optional<List<Override>> = body.overrides()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfiguration> =
        body.prepaidBalanceThresholdConfiguration()

    /**
     * Selects the rate card linked to the specified alias as of the contract's start date.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rateCardAlias(): Optional<String> = body.rateCardAlias()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rateCardId(): Optional<String> = body.rateCardId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recurringCommits(): Optional<List<RecurringCommit>> = body.recurringCommits()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recurringCredits(): Optional<List<RecurringCredit>> = body.recurringCredits()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledCharges(): Optional<List<ScheduledCharge>> = body.scheduledCharges()

    /**
     * Determines which scheduled and commit charges to consolidate onto the Contract's usage
     * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
     * consolidation to occur. This field cannot be modified after a Contract has been created. If
     * this field is omitted, charges will appear on a separate invoice from usage charges.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledChargesOnUsageInvoices(): Optional<ScheduledChargesOnUsageInvoices> =
        body.scheduledChargesOnUsageInvoices()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendThresholdConfiguration(): Optional<SpendThresholdConfiguration> =
        body.spendThresholdConfiguration()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptions(): Optional<List<Subscription>> = body.subscriptions()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usageStatementSchedule(): Optional<UsageStatementSchedule> = body.usageStatementSchedule()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [aliases].
     *
     * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aliases(): JsonField<List<Alias>> = body._aliases()

    /**
     * Returns the raw JSON value of [billingProvider].
     *
     * Unlike [billingProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingProvider(): JsonField<BillingProvider> = body._billingProvider()

    /**
     * Returns the raw JSON value of [commits].
     *
     * Unlike [commits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commits(): JsonField<List<Commit>> = body._commits()

    /**
     * Returns the raw JSON value of [contractName].
     *
     * Unlike [contractName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractName(): JsonField<String> = body._contractName()

    /**
     * Returns the raw JSON value of [credits].
     *
     * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _credits(): JsonField<List<Credit>> = body._credits()

    /**
     * Returns the raw JSON value of [deliveryMethod].
     *
     * Unlike [deliveryMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deliveryMethod(): JsonField<DeliveryMethod> = body._deliveryMethod()

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _duration(): JsonField<Duration> = body._duration()

    /**
     * Returns the raw JSON value of [multiplierOverridePrioritization].
     *
     * Unlike [multiplierOverridePrioritization], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _multiplierOverridePrioritization(): JsonField<MultiplierOverridePrioritization> =
        body._multiplierOverridePrioritization()

    /**
     * Returns the raw JSON value of [netPaymentTermsDays].
     *
     * Unlike [netPaymentTermsDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _netPaymentTermsDays(): JsonField<Double> = body._netPaymentTermsDays()

    /**
     * Returns the raw JSON value of [overrides].
     *
     * Unlike [overrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overrides(): JsonField<List<Override>> = body._overrides()

    /**
     * Returns the raw JSON value of [prepaidBalanceThresholdConfiguration].
     *
     * Unlike [prepaidBalanceThresholdConfiguration], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _prepaidBalanceThresholdConfiguration(): JsonField<PrepaidBalanceThresholdConfiguration> =
        body._prepaidBalanceThresholdConfiguration()

    /**
     * Returns the raw JSON value of [rateCardAlias].
     *
     * Unlike [rateCardAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rateCardAlias(): JsonField<String> = body._rateCardAlias()

    /**
     * Returns the raw JSON value of [rateCardId].
     *
     * Unlike [rateCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rateCardId(): JsonField<String> = body._rateCardId()

    /**
     * Returns the raw JSON value of [recurringCommits].
     *
     * Unlike [recurringCommits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recurringCommits(): JsonField<List<RecurringCommit>> = body._recurringCommits()

    /**
     * Returns the raw JSON value of [recurringCredits].
     *
     * Unlike [recurringCredits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recurringCredits(): JsonField<List<RecurringCredit>> = body._recurringCredits()

    /**
     * Returns the raw JSON value of [scheduledCharges].
     *
     * Unlike [scheduledCharges], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = body._scheduledCharges()

    /**
     * Returns the raw JSON value of [scheduledChargesOnUsageInvoices].
     *
     * Unlike [scheduledChargesOnUsageInvoices], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _scheduledChargesOnUsageInvoices(): JsonField<ScheduledChargesOnUsageInvoices> =
        body._scheduledChargesOnUsageInvoices()

    /**
     * Returns the raw JSON value of [spendThresholdConfiguration].
     *
     * Unlike [spendThresholdConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _spendThresholdConfiguration(): JsonField<SpendThresholdConfiguration> =
        body._spendThresholdConfiguration()

    /**
     * Returns the raw JSON value of [subscriptions].
     *
     * Unlike [subscriptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriptions(): JsonField<List<Subscription>> = body._subscriptions()

    /**
     * Returns the raw JSON value of [uniquenessKey].
     *
     * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    /**
     * Returns the raw JSON value of [usageStatementSchedule].
     *
     * Unlike [usageStatementSchedule], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> =
        body._usageStatementSchedule()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PackageCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PackageCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(packageCreateParams: PackageCreateParams) = apply {
            body = packageCreateParams.body.toBuilder()
            additionalHeaders = packageCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = packageCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [aliases]
         * - [billingProvider]
         * - [commits]
         * - [contractName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * packages, it will reference the package to which it was most recently assigned. It is not
         * exposed to end customers.
         */
        fun aliases(aliases: List<Alias>) = apply { body.aliases(aliases) }

        /**
         * Sets [Builder.aliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aliases] with a well-typed `List<Alias>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aliases(aliases: JsonField<List<Alias>>) = apply { body.aliases(aliases) }

        /**
         * Adds a single [Alias] to [aliases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlias(alias: Alias) = apply { body.addAlias(alias) }

        fun billingProvider(billingProvider: BillingProvider) = apply {
            body.billingProvider(billingProvider)
        }

        /**
         * Sets [Builder.billingProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingProvider] with a well-typed [BillingProvider]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
            body.billingProvider(billingProvider)
        }

        fun commits(commits: List<Commit>) = apply { body.commits(commits) }

        /**
         * Sets [Builder.commits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commits] with a well-typed `List<Commit>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commits(commits: JsonField<List<Commit>>) = apply { body.commits(commits) }

        /**
         * Adds a single [Commit] to [commits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommit(commit: Commit) = apply { body.addCommit(commit) }

        fun contractName(contractName: String) = apply { body.contractName(contractName) }

        /**
         * Sets [Builder.contractName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractName(contractName: JsonField<String>) = apply {
            body.contractName(contractName)
        }

        fun credits(credits: List<Credit>) = apply { body.credits(credits) }

        /**
         * Sets [Builder.credits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credits] with a well-typed `List<Credit>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun credits(credits: JsonField<List<Credit>>) = apply { body.credits(credits) }

        /**
         * Adds a single [Credit] to [credits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCredit(credit: Credit) = apply { body.addCredit(credit) }

        fun deliveryMethod(deliveryMethod: DeliveryMethod) = apply {
            body.deliveryMethod(deliveryMethod)
        }

        /**
         * Sets [Builder.deliveryMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryMethod] with a well-typed [DeliveryMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
            body.deliveryMethod(deliveryMethod)
        }

        fun duration(duration: Duration) = apply { body.duration(duration) }

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Duration] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun duration(duration: JsonField<Duration>) = apply { body.duration(duration) }

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
         * Sets [Builder.multiplierOverridePrioritization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplierOverridePrioritization] with a well-typed
         * [MultiplierOverridePrioritization] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun multiplierOverridePrioritization(
            multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization>
        ) = apply { body.multiplierOverridePrioritization(multiplierOverridePrioritization) }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) = apply {
            body.netPaymentTermsDays(netPaymentTermsDays)
        }

        /**
         * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            body.netPaymentTermsDays(netPaymentTermsDays)
        }

        fun overrides(overrides: List<Override>) = apply { body.overrides(overrides) }

        /**
         * Sets [Builder.overrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrides] with a well-typed `List<Override>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overrides(overrides: JsonField<List<Override>>) = apply { body.overrides(overrides) }

        /**
         * Adds a single [Override] to [overrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOverride(override: Override) = apply { body.addOverride(override) }

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfiguration
        ) = apply {
            body.prepaidBalanceThresholdConfiguration(prepaidBalanceThresholdConfiguration)
        }

        /**
         * Sets [Builder.prepaidBalanceThresholdConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prepaidBalanceThresholdConfiguration] with a well-typed
         * [PrepaidBalanceThresholdConfiguration] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: JsonField<PrepaidBalanceThresholdConfiguration>
        ) = apply {
            body.prepaidBalanceThresholdConfiguration(prepaidBalanceThresholdConfiguration)
        }

        /** Selects the rate card linked to the specified alias as of the contract's start date. */
        fun rateCardAlias(rateCardAlias: String) = apply { body.rateCardAlias(rateCardAlias) }

        /**
         * Sets [Builder.rateCardAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateCardAlias] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateCardAlias(rateCardAlias: JsonField<String>) = apply {
            body.rateCardAlias(rateCardAlias)
        }

        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        /**
         * Sets [Builder.rateCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateCardId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateCardId(rateCardId: JsonField<String>) = apply { body.rateCardId(rateCardId) }

        fun recurringCommits(recurringCommits: List<RecurringCommit>) = apply {
            body.recurringCommits(recurringCommits)
        }

        /**
         * Sets [Builder.recurringCommits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringCommits] with a well-typed
         * `List<RecurringCommit>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun recurringCommits(recurringCommits: JsonField<List<RecurringCommit>>) = apply {
            body.recurringCommits(recurringCommits)
        }

        /**
         * Adds a single [RecurringCommit] to [recurringCommits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecurringCommit(recurringCommit: RecurringCommit) = apply {
            body.addRecurringCommit(recurringCommit)
        }

        fun recurringCredits(recurringCredits: List<RecurringCredit>) = apply {
            body.recurringCredits(recurringCredits)
        }

        /**
         * Sets [Builder.recurringCredits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringCredits] with a well-typed
         * `List<RecurringCredit>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun recurringCredits(recurringCredits: JsonField<List<RecurringCredit>>) = apply {
            body.recurringCredits(recurringCredits)
        }

        /**
         * Adds a single [RecurringCredit] to [recurringCredits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecurringCredit(recurringCredit: RecurringCredit) = apply {
            body.addRecurringCredit(recurringCredit)
        }

        fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) = apply {
            body.scheduledCharges(scheduledCharges)
        }

        /**
         * Sets [Builder.scheduledCharges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledCharges] with a well-typed
         * `List<ScheduledCharge>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
            body.scheduledCharges(scheduledCharges)
        }

        /**
         * Adds a single [ScheduledCharge] to [scheduledCharges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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
         * Sets [Builder.scheduledChargesOnUsageInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledChargesOnUsageInvoices] with a well-typed
         * [ScheduledChargesOnUsageInvoices] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun scheduledChargesOnUsageInvoices(
            scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>
        ) = apply { body.scheduledChargesOnUsageInvoices(scheduledChargesOnUsageInvoices) }

        fun spendThresholdConfiguration(spendThresholdConfiguration: SpendThresholdConfiguration) =
            apply {
                body.spendThresholdConfiguration(spendThresholdConfiguration)
            }

        /**
         * Sets [Builder.spendThresholdConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendThresholdConfiguration] with a well-typed
         * [SpendThresholdConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun spendThresholdConfiguration(
            spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>
        ) = apply { body.spendThresholdConfiguration(spendThresholdConfiguration) }

        fun subscriptions(subscriptions: List<Subscription>) = apply {
            body.subscriptions(subscriptions)
        }

        /**
         * Sets [Builder.subscriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptions] with a well-typed `List<Subscription>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
            body.subscriptions(subscriptions)
        }

        /**
         * Adds a single [Subscription] to [subscriptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscription(subscription: Subscription) = apply {
            body.addSubscription(subscription)
        }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

        /**
         * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniquenessKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
            body.uniquenessKey(uniquenessKey)
        }

        fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) = apply {
            body.usageStatementSchedule(usageStatementSchedule)
        }

        /**
         * Sets [Builder.usageStatementSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageStatementSchedule] with a well-typed
         * [UsageStatementSchedule] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [PackageCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PackageCreateParams =
            PackageCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val aliases: JsonField<List<Alias>>,
        private val billingProvider: JsonField<BillingProvider>,
        private val commits: JsonField<List<Commit>>,
        private val contractName: JsonField<String>,
        private val credits: JsonField<List<Credit>>,
        private val deliveryMethod: JsonField<DeliveryMethod>,
        private val duration: JsonField<Duration>,
        private val multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization>,
        private val netPaymentTermsDays: JsonField<Double>,
        private val overrides: JsonField<List<Override>>,
        private val prepaidBalanceThresholdConfiguration:
            JsonField<PrepaidBalanceThresholdConfiguration>,
        private val rateCardAlias: JsonField<String>,
        private val rateCardId: JsonField<String>,
        private val recurringCommits: JsonField<List<RecurringCommit>>,
        private val recurringCredits: JsonField<List<RecurringCredit>>,
        private val scheduledCharges: JsonField<List<ScheduledCharge>>,
        private val scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>,
        private val spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>,
        private val subscriptions: JsonField<List<Subscription>>,
        private val uniquenessKey: JsonField<String>,
        private val usageStatementSchedule: JsonField<UsageStatementSchedule>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aliases")
            @ExcludeMissing
            aliases: JsonField<List<Alias>> = JsonMissing.of(),
            @JsonProperty("billing_provider")
            @ExcludeMissing
            billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
            @JsonProperty("commits")
            @ExcludeMissing
            commits: JsonField<List<Commit>> = JsonMissing.of(),
            @JsonProperty("contract_name")
            @ExcludeMissing
            contractName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits")
            @ExcludeMissing
            credits: JsonField<List<Credit>> = JsonMissing.of(),
            @JsonProperty("delivery_method")
            @ExcludeMissing
            deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Duration> = JsonMissing.of(),
            @JsonProperty("multiplier_override_prioritization")
            @ExcludeMissing
            multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization> =
                JsonMissing.of(),
            @JsonProperty("net_payment_terms_days")
            @ExcludeMissing
            netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("overrides")
            @ExcludeMissing
            overrides: JsonField<List<Override>> = JsonMissing.of(),
            @JsonProperty("prepaid_balance_threshold_configuration")
            @ExcludeMissing
            prepaidBalanceThresholdConfiguration: JsonField<PrepaidBalanceThresholdConfiguration> =
                JsonMissing.of(),
            @JsonProperty("rate_card_alias")
            @ExcludeMissing
            rateCardAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_card_id")
            @ExcludeMissing
            rateCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recurring_commits")
            @ExcludeMissing
            recurringCommits: JsonField<List<RecurringCommit>> = JsonMissing.of(),
            @JsonProperty("recurring_credits")
            @ExcludeMissing
            recurringCredits: JsonField<List<RecurringCredit>> = JsonMissing.of(),
            @JsonProperty("scheduled_charges")
            @ExcludeMissing
            scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
            @JsonProperty("scheduled_charges_on_usage_invoices")
            @ExcludeMissing
            scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
                JsonMissing.of(),
            @JsonProperty("spend_threshold_configuration")
            @ExcludeMissing
            spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> = JsonMissing.of(),
            @JsonProperty("subscriptions")
            @ExcludeMissing
            subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
            @JsonProperty("uniqueness_key")
            @ExcludeMissing
            uniquenessKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usage_statement_schedule")
            @ExcludeMissing
            usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of(),
        ) : this(
            name,
            aliases,
            billingProvider,
            commits,
            contractName,
            credits,
            deliveryMethod,
            duration,
            multiplierOverridePrioritization,
            netPaymentTermsDays,
            overrides,
            prepaidBalanceThresholdConfiguration,
            rateCardAlias,
            rateCardId,
            recurringCommits,
            recurringCredits,
            scheduledCharges,
            scheduledChargesOnUsageInvoices,
            spendThresholdConfiguration,
            subscriptions,
            uniquenessKey,
            usageStatementSchedule,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Reference this alias when creating a contract. If the same alias is assigned to multiple
         * packages, it will reference the package to which it was most recently assigned. It is not
         * exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aliases(): Optional<List<Alias>> = aliases.getOptional("aliases")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingProvider(): Optional<BillingProvider> =
            billingProvider.getOptional("billing_provider")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commits(): Optional<List<Commit>> = commits.getOptional("commits")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contractName(): Optional<String> = contractName.getOptional("contract_name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun credits(): Optional<List<Credit>> = credits.getOptional("credits")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deliveryMethod(): Optional<DeliveryMethod> =
            deliveryMethod.getOptional("delivery_method")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun duration(): Optional<Duration> = duration.getOptional("duration")

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first. If tiered
         * overrides are used, prioritization must be explicit.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun multiplierOverridePrioritization(): Optional<MultiplierOverridePrioritization> =
            multiplierOverridePrioritization.getOptional("multiplier_override_prioritization")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netPaymentTermsDays(): Optional<Double> =
            netPaymentTermsDays.getOptional("net_payment_terms_days")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overrides(): Optional<List<Override>> = overrides.getOptional("overrides")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfiguration> =
            prepaidBalanceThresholdConfiguration.getOptional(
                "prepaid_balance_threshold_configuration"
            )

        /**
         * Selects the rate card linked to the specified alias as of the contract's start date.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateCardAlias(): Optional<String> = rateCardAlias.getOptional("rate_card_alias")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateCardId(): Optional<String> = rateCardId.getOptional("rate_card_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurringCommits(): Optional<List<RecurringCommit>> =
            recurringCommits.getOptional("recurring_commits")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurringCredits(): Optional<List<RecurringCredit>> =
            recurringCredits.getOptional("recurring_credits")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scheduledCharges(): Optional<List<ScheduledCharge>> =
            scheduledCharges.getOptional("scheduled_charges")

        /**
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scheduledChargesOnUsageInvoices(): Optional<ScheduledChargesOnUsageInvoices> =
            scheduledChargesOnUsageInvoices.getOptional("scheduled_charges_on_usage_invoices")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun spendThresholdConfiguration(): Optional<SpendThresholdConfiguration> =
            spendThresholdConfiguration.getOptional("spend_threshold_configuration")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptions(): Optional<List<Subscription>> =
            subscriptions.getOptional("subscriptions")

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniquenessKey(): Optional<String> = uniquenessKey.getOptional("uniqueness_key")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun usageStatementSchedule(): Optional<UsageStatementSchedule> =
            usageStatementSchedule.getOptional("usage_statement_schedule")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [aliases].
         *
         * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<List<Alias>> = aliases

        /**
         * Returns the raw JSON value of [billingProvider].
         *
         * Unlike [billingProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        /**
         * Returns the raw JSON value of [commits].
         *
         * Unlike [commits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

        /**
         * Returns the raw JSON value of [contractName].
         *
         * Unlike [contractName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contract_name")
        @ExcludeMissing
        fun _contractName(): JsonField<String> = contractName

        /**
         * Returns the raw JSON value of [credits].
         *
         * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

        /**
         * Returns the raw JSON value of [deliveryMethod].
         *
         * Unlike [deliveryMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Duration> = duration

        /**
         * Returns the raw JSON value of [multiplierOverridePrioritization].
         *
         * Unlike [multiplierOverridePrioritization], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("multiplier_override_prioritization")
        @ExcludeMissing
        fun _multiplierOverridePrioritization(): JsonField<MultiplierOverridePrioritization> =
            multiplierOverridePrioritization

        /**
         * Returns the raw JSON value of [netPaymentTermsDays].
         *
         * Unlike [netPaymentTermsDays], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

        /**
         * Returns the raw JSON value of [overrides].
         *
         * Unlike [overrides], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overrides")
        @ExcludeMissing
        fun _overrides(): JsonField<List<Override>> = overrides

        /**
         * Returns the raw JSON value of [prepaidBalanceThresholdConfiguration].
         *
         * Unlike [prepaidBalanceThresholdConfiguration], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("prepaid_balance_threshold_configuration")
        @ExcludeMissing
        fun _prepaidBalanceThresholdConfiguration():
            JsonField<PrepaidBalanceThresholdConfiguration> = prepaidBalanceThresholdConfiguration

        /**
         * Returns the raw JSON value of [rateCardAlias].
         *
         * Unlike [rateCardAlias], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rate_card_alias")
        @ExcludeMissing
        fun _rateCardAlias(): JsonField<String> = rateCardAlias

        /**
         * Returns the raw JSON value of [rateCardId].
         *
         * Unlike [rateCardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

        /**
         * Returns the raw JSON value of [recurringCommits].
         *
         * Unlike [recurringCommits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recurring_commits")
        @ExcludeMissing
        fun _recurringCommits(): JsonField<List<RecurringCommit>> = recurringCommits

        /**
         * Returns the raw JSON value of [recurringCredits].
         *
         * Unlike [recurringCredits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recurring_credits")
        @ExcludeMissing
        fun _recurringCredits(): JsonField<List<RecurringCredit>> = recurringCredits

        /**
         * Returns the raw JSON value of [scheduledCharges].
         *
         * Unlike [scheduledCharges], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

        /**
         * Returns the raw JSON value of [scheduledChargesOnUsageInvoices].
         *
         * Unlike [scheduledChargesOnUsageInvoices], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("scheduled_charges_on_usage_invoices")
        @ExcludeMissing
        fun _scheduledChargesOnUsageInvoices(): JsonField<ScheduledChargesOnUsageInvoices> =
            scheduledChargesOnUsageInvoices

        /**
         * Returns the raw JSON value of [spendThresholdConfiguration].
         *
         * Unlike [spendThresholdConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("spend_threshold_configuration")
        @ExcludeMissing
        fun _spendThresholdConfiguration(): JsonField<SpendThresholdConfiguration> =
            spendThresholdConfiguration

        /**
         * Returns the raw JSON value of [subscriptions].
         *
         * Unlike [subscriptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriptions")
        @ExcludeMissing
        fun _subscriptions(): JsonField<List<Subscription>> = subscriptions

        /**
         * Returns the raw JSON value of [uniquenessKey].
         *
         * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        /**
         * Returns the raw JSON value of [usageStatementSchedule].
         *
         * Unlike [usageStatementSchedule], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("usage_statement_schedule")
        @ExcludeMissing
        fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> = usageStatementSchedule

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var aliases: JsonField<MutableList<Alias>>? = null
            private var billingProvider: JsonField<BillingProvider> = JsonMissing.of()
            private var commits: JsonField<MutableList<Commit>>? = null
            private var contractName: JsonField<String> = JsonMissing.of()
            private var credits: JsonField<MutableList<Credit>>? = null
            private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
            private var duration: JsonField<Duration> = JsonMissing.of()
            private var multiplierOverridePrioritization:
                JsonField<MultiplierOverridePrioritization> =
                JsonMissing.of()
            private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
            private var overrides: JsonField<MutableList<Override>>? = null
            private var prepaidBalanceThresholdConfiguration:
                JsonField<PrepaidBalanceThresholdConfiguration> =
                JsonMissing.of()
            private var rateCardAlias: JsonField<String> = JsonMissing.of()
            private var rateCardId: JsonField<String> = JsonMissing.of()
            private var recurringCommits: JsonField<MutableList<RecurringCommit>>? = null
            private var recurringCredits: JsonField<MutableList<RecurringCredit>>? = null
            private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
            private var scheduledChargesOnUsageInvoices:
                JsonField<ScheduledChargesOnUsageInvoices> =
                JsonMissing.of()
            private var spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
                JsonMissing.of()
            private var subscriptions: JsonField<MutableList<Subscription>>? = null
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                aliases = body.aliases.map { it.toMutableList() }
                billingProvider = body.billingProvider
                commits = body.commits.map { it.toMutableList() }
                contractName = body.contractName
                credits = body.credits.map { it.toMutableList() }
                deliveryMethod = body.deliveryMethod
                duration = body.duration
                multiplierOverridePrioritization = body.multiplierOverridePrioritization
                netPaymentTermsDays = body.netPaymentTermsDays
                overrides = body.overrides.map { it.toMutableList() }
                prepaidBalanceThresholdConfiguration = body.prepaidBalanceThresholdConfiguration
                rateCardAlias = body.rateCardAlias
                rateCardId = body.rateCardId
                recurringCommits = body.recurringCommits.map { it.toMutableList() }
                recurringCredits = body.recurringCredits.map { it.toMutableList() }
                scheduledCharges = body.scheduledCharges.map { it.toMutableList() }
                scheduledChargesOnUsageInvoices = body.scheduledChargesOnUsageInvoices
                spendThresholdConfiguration = body.spendThresholdConfiguration
                subscriptions = body.subscriptions.map { it.toMutableList() }
                uniquenessKey = body.uniquenessKey
                usageStatementSchedule = body.usageStatementSchedule
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Reference this alias when creating a contract. If the same alias is assigned to
             * multiple packages, it will reference the package to which it was most recently
             * assigned. It is not exposed to end customers.
             */
            fun aliases(aliases: List<Alias>) = aliases(JsonField.of(aliases))

            /**
             * Sets [Builder.aliases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aliases] with a well-typed `List<Alias>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aliases(aliases: JsonField<List<Alias>>) = apply {
                this.aliases = aliases.map { it.toMutableList() }
            }

            /**
             * Adds a single [Alias] to [aliases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAlias(alias: Alias) = apply {
                aliases =
                    (aliases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("aliases", it).add(alias)
                    }
            }

            fun billingProvider(billingProvider: BillingProvider) =
                billingProvider(JsonField.of(billingProvider))

            /**
             * Sets [Builder.billingProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProvider] with a well-typed [BillingProvider]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                this.billingProvider = billingProvider
            }

            fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

            /**
             * Sets [Builder.commits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commits] with a well-typed `List<Commit>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commits(commits: JsonField<List<Commit>>) = apply {
                this.commits = commits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Commit] to [commits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCommit(commit: Commit) = apply {
                commits =
                    (commits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("commits", it).add(commit)
                    }
            }

            fun contractName(contractName: String) = contractName(JsonField.of(contractName))

            /**
             * Sets [Builder.contractName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractName(contractName: JsonField<String>) = apply {
                this.contractName = contractName
            }

            fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

            /**
             * Sets [Builder.credits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credits] with a well-typed `List<Credit>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credits(credits: JsonField<List<Credit>>) = apply {
                this.credits = credits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Credit] to [credits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCredit(credit: Credit) = apply {
                credits =
                    (credits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("credits", it).add(credit)
                    }
            }

            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            /**
             * Sets [Builder.deliveryMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethod] with a well-typed [DeliveryMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            fun duration(duration: Duration) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Duration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

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
             * Sets [Builder.multiplierOverridePrioritization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multiplierOverridePrioritization] with a well-typed
             * [MultiplierOverridePrioritization] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun multiplierOverridePrioritization(
                multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization>
            ) = apply { this.multiplierOverridePrioritization = multiplierOverridePrioritization }

            fun netPaymentTermsDays(netPaymentTermsDays: Double) =
                netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

            /**
             * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
                this.netPaymentTermsDays = netPaymentTermsDays
            }

            fun overrides(overrides: List<Override>) = overrides(JsonField.of(overrides))

            /**
             * Sets [Builder.overrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overrides] with a well-typed `List<Override>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overrides(overrides: JsonField<List<Override>>) = apply {
                this.overrides = overrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [Override] to [overrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOverride(override: Override) = apply {
                overrides =
                    (overrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("overrides", it).add(override)
                    }
            }

            fun prepaidBalanceThresholdConfiguration(
                prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfiguration
            ) =
                prepaidBalanceThresholdConfiguration(
                    JsonField.of(prepaidBalanceThresholdConfiguration)
                )

            /**
             * Sets [Builder.prepaidBalanceThresholdConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prepaidBalanceThresholdConfiguration] with a
             * well-typed [PrepaidBalanceThresholdConfiguration] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun prepaidBalanceThresholdConfiguration(
                prepaidBalanceThresholdConfiguration:
                    JsonField<PrepaidBalanceThresholdConfiguration>
            ) = apply {
                this.prepaidBalanceThresholdConfiguration = prepaidBalanceThresholdConfiguration
            }

            /**
             * Selects the rate card linked to the specified alias as of the contract's start date.
             */
            fun rateCardAlias(rateCardAlias: String) = rateCardAlias(JsonField.of(rateCardAlias))

            /**
             * Sets [Builder.rateCardAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateCardAlias] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateCardAlias(rateCardAlias: JsonField<String>) = apply {
                this.rateCardAlias = rateCardAlias
            }

            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            /**
             * Sets [Builder.rateCardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateCardId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

            fun recurringCommits(recurringCommits: List<RecurringCommit>) =
                recurringCommits(JsonField.of(recurringCommits))

            /**
             * Sets [Builder.recurringCommits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringCommits] with a well-typed
             * `List<RecurringCommit>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun recurringCommits(recurringCommits: JsonField<List<RecurringCommit>>) = apply {
                this.recurringCommits = recurringCommits.map { it.toMutableList() }
            }

            /**
             * Adds a single [RecurringCommit] to [recurringCommits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecurringCommit(recurringCommit: RecurringCommit) = apply {
                recurringCommits =
                    (recurringCommits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("recurringCommits", it).add(recurringCommit)
                    }
            }

            fun recurringCredits(recurringCredits: List<RecurringCredit>) =
                recurringCredits(JsonField.of(recurringCredits))

            /**
             * Sets [Builder.recurringCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringCredits] with a well-typed
             * `List<RecurringCredit>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun recurringCredits(recurringCredits: JsonField<List<RecurringCredit>>) = apply {
                this.recurringCredits = recurringCredits.map { it.toMutableList() }
            }

            /**
             * Adds a single [RecurringCredit] to [recurringCredits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecurringCredit(recurringCredit: RecurringCredit) = apply {
                recurringCredits =
                    (recurringCredits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("recurringCredits", it).add(recurringCredit)
                    }
            }

            fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) =
                scheduledCharges(JsonField.of(scheduledCharges))

            /**
             * Sets [Builder.scheduledCharges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledCharges] with a well-typed
             * `List<ScheduledCharge>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
                this.scheduledCharges = scheduledCharges.map { it.toMutableList() }
            }

            /**
             * Adds a single [ScheduledCharge] to [scheduledCharges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
                scheduledCharges =
                    (scheduledCharges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scheduledCharges", it).add(scheduledCharge)
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
             * Sets [Builder.scheduledChargesOnUsageInvoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledChargesOnUsageInvoices] with a well-typed
             * [ScheduledChargesOnUsageInvoices] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun scheduledChargesOnUsageInvoices(
                scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>
            ) = apply { this.scheduledChargesOnUsageInvoices = scheduledChargesOnUsageInvoices }

            fun spendThresholdConfiguration(
                spendThresholdConfiguration: SpendThresholdConfiguration
            ) = spendThresholdConfiguration(JsonField.of(spendThresholdConfiguration))

            /**
             * Sets [Builder.spendThresholdConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendThresholdConfiguration] with a well-typed
             * [SpendThresholdConfiguration] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun spendThresholdConfiguration(
                spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>
            ) = apply { this.spendThresholdConfiguration = spendThresholdConfiguration }

            fun subscriptions(subscriptions: List<Subscription>) =
                subscriptions(JsonField.of(subscriptions))

            /**
             * Sets [Builder.subscriptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptions] with a well-typed
             * `List<Subscription>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
                this.subscriptions = subscriptions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Subscription] to [subscriptions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubscription(subscription: Subscription) = apply {
                subscriptions =
                    (subscriptions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subscriptions", it).add(subscription)
                    }
            }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

            /**
             * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniquenessKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                this.uniquenessKey = uniquenessKey
            }

            fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) =
                usageStatementSchedule(JsonField.of(usageStatementSchedule))

            /**
             * Sets [Builder.usageStatementSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageStatementSchedule] with a well-typed
             * [UsageStatementSchedule] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    (aliases ?: JsonMissing.of()).map { it.toImmutable() },
                    billingProvider,
                    (commits ?: JsonMissing.of()).map { it.toImmutable() },
                    contractName,
                    (credits ?: JsonMissing.of()).map { it.toImmutable() },
                    deliveryMethod,
                    duration,
                    multiplierOverridePrioritization,
                    netPaymentTermsDays,
                    (overrides ?: JsonMissing.of()).map { it.toImmutable() },
                    prepaidBalanceThresholdConfiguration,
                    rateCardAlias,
                    rateCardId,
                    (recurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                    (recurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    (scheduledCharges ?: JsonMissing.of()).map { it.toImmutable() },
                    scheduledChargesOnUsageInvoices,
                    spendThresholdConfiguration,
                    (subscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                    uniquenessKey,
                    usageStatementSchedule,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            aliases().ifPresent { it.forEach { it.validate() } }
            billingProvider().ifPresent { it.validate() }
            commits().ifPresent { it.forEach { it.validate() } }
            contractName()
            credits().ifPresent { it.forEach { it.validate() } }
            deliveryMethod().ifPresent { it.validate() }
            duration().ifPresent { it.validate() }
            multiplierOverridePrioritization().ifPresent { it.validate() }
            netPaymentTermsDays()
            overrides().ifPresent { it.forEach { it.validate() } }
            prepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
            rateCardAlias()
            rateCardId()
            recurringCommits().ifPresent { it.forEach { it.validate() } }
            recurringCredits().ifPresent { it.forEach { it.validate() } }
            scheduledCharges().ifPresent { it.forEach { it.validate() } }
            scheduledChargesOnUsageInvoices().ifPresent { it.validate() }
            spendThresholdConfiguration().ifPresent { it.validate() }
            subscriptions().ifPresent { it.forEach { it.validate() } }
            uniquenessKey()
            usageStatementSchedule().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (aliases.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (billingProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (commits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (contractName.asKnown().isPresent) 1 else 0) +
                (credits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (deliveryMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (duration.asKnown().getOrNull()?.validity() ?: 0) +
                (multiplierOverridePrioritization.asKnown().getOrNull()?.validity() ?: 0) +
                (if (netPaymentTermsDays.asKnown().isPresent) 1 else 0) +
                (overrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (prepaidBalanceThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rateCardAlias.asKnown().isPresent) 1 else 0) +
                (if (rateCardId.asKnown().isPresent) 1 else 0) +
                (recurringCommits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (recurringCredits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (scheduledCharges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (scheduledChargesOnUsageInvoices.asKnown().getOrNull()?.validity() ?: 0) +
                (spendThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (subscriptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (uniquenessKey.asKnown().isPresent) 1 else 0) +
                (usageStatementSchedule.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                aliases == other.aliases &&
                billingProvider == other.billingProvider &&
                commits == other.commits &&
                contractName == other.contractName &&
                credits == other.credits &&
                deliveryMethod == other.deliveryMethod &&
                duration == other.duration &&
                multiplierOverridePrioritization == other.multiplierOverridePrioritization &&
                netPaymentTermsDays == other.netPaymentTermsDays &&
                overrides == other.overrides &&
                prepaidBalanceThresholdConfiguration ==
                    other.prepaidBalanceThresholdConfiguration &&
                rateCardAlias == other.rateCardAlias &&
                rateCardId == other.rateCardId &&
                recurringCommits == other.recurringCommits &&
                recurringCredits == other.recurringCredits &&
                scheduledCharges == other.scheduledCharges &&
                scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices &&
                spendThresholdConfiguration == other.spendThresholdConfiguration &&
                subscriptions == other.subscriptions &&
                uniquenessKey == other.uniquenessKey &&
                usageStatementSchedule == other.usageStatementSchedule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                aliases,
                billingProvider,
                commits,
                contractName,
                credits,
                deliveryMethod,
                duration,
                multiplierOverridePrioritization,
                netPaymentTermsDays,
                overrides,
                prepaidBalanceThresholdConfiguration,
                rateCardAlias,
                rateCardId,
                recurringCommits,
                recurringCredits,
                scheduledCharges,
                scheduledChargesOnUsageInvoices,
                spendThresholdConfiguration,
                subscriptions,
                uniquenessKey,
                usageStatementSchedule,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, aliases=$aliases, billingProvider=$billingProvider, commits=$commits, contractName=$contractName, credits=$credits, deliveryMethod=$deliveryMethod, duration=$duration, multiplierOverridePrioritization=$multiplierOverridePrioritization, netPaymentTermsDays=$netPaymentTermsDays, overrides=$overrides, prepaidBalanceThresholdConfiguration=$prepaidBalanceThresholdConfiguration, rateCardAlias=$rateCardAlias, rateCardId=$rateCardId, recurringCommits=$recurringCommits, recurringCredits=$recurringCredits, scheduledCharges=$scheduledCharges, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, spendThresholdConfiguration=$spendThresholdConfiguration, subscriptions=$subscriptions, uniquenessKey=$uniquenessKey, usageStatementSchedule=$usageStatementSchedule, additionalProperties=$additionalProperties}"
    }

    class Alias
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(name, endingBefore, startingAt, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Alias].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Alias]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alias: Alias) = apply {
                name = alias.name
                endingBefore = alias.endingBefore
                startingAt = alias.startingAt
                additionalProperties = alias.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Alias].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Alias =
                Alias(
                    checkRequired("name", name),
                    endingBefore,
                    startingAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Alias = apply {
            if (validated) {
                return@apply
            }

            name()
            endingBefore()
            startingAt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Alias &&
                name == other.name &&
                endingBefore == other.endingBefore &&
                startingAt == other.startingAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, endingBefore, startingAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Alias{name=$name, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    class BillingProvider @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

        private var validated: Boolean = false

        fun validate(): BillingProvider = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingProvider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Commit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessSchedule: JsonField<AccessSchedule>,
        private val productId: JsonField<String>,
        private val type: JsonField<Type>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val invoiceSchedule: JsonField<InvoiceSchedule>,
        private val name: JsonField<String>,
        private val priority: JsonField<Double>,
        private val rateType: JsonField<RateType>,
        private val rolloverFraction: JsonField<Double>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val temporaryId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_schedule")
            @ExcludeMissing
            accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonProperty("temporary_id")
            @ExcludeMissing
            temporaryId: JsonField<String> = JsonMissing.of(),
        ) : this(
            accessSchedule,
            productId,
            type,
            applicableProductIds,
            applicableProductTags,
            customFields,
            description,
            invoiceSchedule,
            name,
            priority,
            rateType,
            rolloverFraction,
            specifiers,
            temporaryId,
            mutableMapOf(),
        )

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessSchedule(): AccessSchedule = accessSchedule.getRequired("access_schedule")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Which products the commit applies to. If applicable_product_ids, applicable_product_tags
         * or specifiers are not provided, the commit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags or
         * specifiers are not provided, the commit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Used only in UI/API. It is not exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceSchedule(): Optional<InvoiceSchedule> =
            invoiceSchedule.getOptional("invoice_schedule")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * If multiple commits are applicable, the one with the lower priority will apply first.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * Fraction of unused segments that will be rolled over. Must be between 0 and 1.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rolloverFraction(): Optional<Double> = rolloverFraction.getOptional("rollover_fraction")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * A temporary ID for the commit that can be used to reference the commit for commit
         * specific overrides.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun temporaryId(): Optional<String> = temporaryId.getOptional("temporary_id")

        /**
         * Returns the raw JSON value of [accessSchedule].
         *
         * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [invoiceSchedule].
         *
         * Unlike [invoiceSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [rolloverFraction].
         *
         * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /**
         * Returns the raw JSON value of [temporaryId].
         *
         * Unlike [temporaryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Commit].
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .productId()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commit]. */
        class Builder internal constructor() {

            private var accessSchedule: JsonField<AccessSchedule>? = null
            private var productId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var temporaryId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                accessSchedule = commit.accessSchedule
                productId = commit.productId
                type = commit.type
                applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
                customFields = commit.customFields
                description = commit.description
                invoiceSchedule = commit.invoiceSchedule
                name = commit.name
                priority = commit.priority
                rateType = commit.rateType
                rolloverFraction = commit.rolloverFraction
                specifiers = commit.specifiers.map { it.toMutableList() }
                temporaryId = commit.temporaryId
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            /**
             * Required: Schedule for distributing the commit to the customer. For "POSTPAID"
             * commits only one schedule item is allowed and amount must match invoice_schedule
             * total.
             */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * Sets [Builder.accessSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessSchedule] with a well-typed [AccessSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
                    }
            }

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match access_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) =
                invoiceSchedule(JsonField.of(invoiceSchedule))

            /**
             * Sets [Builder.invoiceSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceSchedule] with a well-typed [InvoiceSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(JsonField.of(rolloverFraction))

            /**
             * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverFraction] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
                    }
            }

            /**
             * A temporary ID for the commit that can be used to reference the commit for commit
             * specific overrides.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * Sets [Builder.temporaryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temporaryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Commit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .productId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Commit =
                Commit(
                    checkRequired("accessSchedule", accessSchedule),
                    checkRequired("productId", productId),
                    checkRequired("type", type),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    invoiceSchedule,
                    name,
                    priority,
                    rateType,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    temporaryId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            accessSchedule().validate()
            productId()
            type().validate()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            invoiceSchedule().ifPresent { it.validate() }
            name()
            priority()
            rateType().ifPresent { it.validate() }
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            temporaryId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (invoiceSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (temporaryId.asKnown().isPresent) 1 else 0)

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        class AccessSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val creditTypeId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
            ) : this(scheduleItems, creditTypeId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /**
             * Defaults to USD (cents) if not passed
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccessSchedule].
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 */
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

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [AccessSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccessSchedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0)

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val duration: JsonField<Duration>,
                private val startingAtOffset: JsonField<StartingAtOffset>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<Duration> = JsonMissing.of(),
                    @JsonProperty("starting_at_offset")
                    @ExcludeMissing
                    startingAtOffset: JsonField<StartingAtOffset> = JsonMissing.of(),
                ) : this(amount, duration, startingAtOffset, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * Offset relative to the start of this segment indicating when it should end.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun duration(): Duration = duration.getRequired("duration")

                /**
                 * Date relative to the contract start date indicating the start of this schedule
                 * segment.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAtOffset(): StartingAtOffset =
                    startingAtOffset.getRequired("starting_at_offset")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [duration].
                 *
                 * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("duration")
                @ExcludeMissing
                fun _duration(): JsonField<Duration> = duration

                /**
                 * Returns the raw JSON value of [startingAtOffset].
                 *
                 * Unlike [startingAtOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at_offset")
                @ExcludeMissing
                fun _startingAtOffset(): JsonField<StartingAtOffset> = startingAtOffset

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .duration()
                     * .startingAtOffset()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var duration: JsonField<Duration>? = null
                    private var startingAtOffset: JsonField<StartingAtOffset>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        duration = scheduleItem.duration
                        startingAtOffset = scheduleItem.startingAtOffset
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Offset relative to the start of this segment indicating when it should end.
                     */
                    fun duration(duration: Duration) = duration(JsonField.of(duration))

                    /**
                     * Sets [Builder.duration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.duration] with a well-typed [Duration] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

                    /**
                     * Date relative to the contract start date indicating the start of this
                     * schedule segment.
                     */
                    fun startingAtOffset(startingAtOffset: StartingAtOffset) =
                        startingAtOffset(JsonField.of(startingAtOffset))

                    /**
                     * Sets [Builder.startingAtOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAtOffset] with a well-typed
                     * [StartingAtOffset] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAtOffset(startingAtOffset: JsonField<StartingAtOffset>) = apply {
                        this.startingAtOffset = startingAtOffset
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

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .duration()
                     * .startingAtOffset()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("amount", amount),
                            checkRequired("duration", duration),
                            checkRequired("startingAtOffset", startingAtOffset),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    duration().validate()
                    startingAtOffset().validate()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (duration.asKnown().getOrNull()?.validity() ?: 0) +
                        (startingAtOffset.asKnown().getOrNull()?.validity() ?: 0)

                /** Offset relative to the start of this segment indicating when it should end. */
                class Duration
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unit: JsonField<Unit>,
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of(),
                    ) : this(unit, value, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unit(): Unit = unit.getRequired("unit")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Long = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Duration].
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Duration]. */
                    class Builder internal constructor() {

                        private var unit: JsonField<Unit>? = null
                        private var value: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(duration: Duration) = apply {
                            unit = duration.unit
                            value = duration.value
                            additionalProperties = duration.additionalProperties.toMutableMap()
                        }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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

                        /**
                         * Returns an immutable instance of [Duration].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Duration =
                            Duration(
                                checkRequired("unit", unit),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Duration = apply {
                        if (validated) {
                            return@apply
                        }

                        unit().validate()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (unit.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Unit
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DAYS = of("DAYS")

                            @JvmField val WEEKS = of("WEEKS")

                            @JvmField val MONTHS = of("MONTHS")

                            @JvmField val YEARS = of("YEARS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                        }

                        /**
                         * An enum containing [Unit]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Unit] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                            /**
                             * An enum member indicating that [Unit] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                DAYS -> Value.DAYS
                                WEEKS -> Value.WEEKS
                                MONTHS -> Value.MONTHS
                                YEARS -> Value.YEARS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                DAYS -> Known.DAYS
                                WEEKS -> Known.WEEKS
                                MONTHS -> Known.MONTHS
                                YEARS -> Known.YEARS
                                else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Unit = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: MetronomeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Unit && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Duration &&
                            unit == other.unit &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(unit, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Duration{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
                }

                /**
                 * Date relative to the contract start date indicating the start of this schedule
                 * segment.
                 */
                class StartingAtOffset
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unit: JsonField<Unit>,
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of(),
                    ) : this(unit, value, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unit(): Unit = unit.getRequired("unit")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Long = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [StartingAtOffset].
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StartingAtOffset]. */
                    class Builder internal constructor() {

                        private var unit: JsonField<Unit>? = null
                        private var value: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(startingAtOffset: StartingAtOffset) = apply {
                            unit = startingAtOffset.unit
                            value = startingAtOffset.value
                            additionalProperties =
                                startingAtOffset.additionalProperties.toMutableMap()
                        }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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

                        /**
                         * Returns an immutable instance of [StartingAtOffset].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): StartingAtOffset =
                            StartingAtOffset(
                                checkRequired("unit", unit),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): StartingAtOffset = apply {
                        if (validated) {
                            return@apply
                        }

                        unit().validate()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (unit.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Unit
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DAYS = of("DAYS")

                            @JvmField val WEEKS = of("WEEKS")

                            @JvmField val MONTHS = of("MONTHS")

                            @JvmField val YEARS = of("YEARS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                        }

                        /**
                         * An enum containing [Unit]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Unit] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                            /**
                             * An enum member indicating that [Unit] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                DAYS -> Value.DAYS
                                WEEKS -> Value.WEEKS
                                MONTHS -> Value.MONTHS
                                YEARS -> Value.YEARS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                DAYS -> Known.DAYS
                                WEEKS -> Known.WEEKS
                                MONTHS -> Known.MONTHS
                                YEARS -> Known.YEARS
                                else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Unit = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: MetronomeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Unit && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is StartingAtOffset &&
                            unit == other.unit &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(unit, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StartingAtOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        amount == other.amount &&
                        duration == other.duration &&
                        startingAtOffset == other.startingAtOffset &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, duration, startingAtOffset, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, duration=$duration, startingAtOffset=$startingAtOffset, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessSchedule &&
                    scheduleItems == other.scheduleItems &&
                    creditTypeId == other.creditTypeId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(scheduleItems, creditTypeId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
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

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        class InvoiceSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val creditTypeId: JsonField<String>,
            private val doNotInvoice: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
            ) : this(scheduleItems, creditTypeId, doNotInvoice, mutableMapOf())

            /**
             * Either provide amount or provide both unit_price and quantity.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /**
             * Defaults to USD (cents) if not passed.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * If true, this schedule will not generate an invoice.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun doNotInvoice(): Optional<Boolean> = doNotInvoice.getOptional("do_not_invoice")

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [doNotInvoice].
             *
             * Unlike [doNotInvoice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [InvoiceSchedule].
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceSchedule]. */
            class Builder internal constructor() {

                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                    scheduleItems = invoiceSchedule.scheduleItems.map { it.toMutableList() }
                    creditTypeId = invoiceSchedule.creditTypeId
                    doNotInvoice = invoiceSchedule.doNotInvoice
                    additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /** If true, this schedule will not generate an invoice. */
                fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

                /**
                 * Sets [Builder.doNotInvoice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doNotInvoice] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                    this.doNotInvoice = doNotInvoice
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

                /**
                 * Returns an immutable instance of [InvoiceSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InvoiceSchedule =
                    InvoiceSchedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        doNotInvoice,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InvoiceSchedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                doNotInvoice()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (doNotInvoice.asKnown().isPresent) 1 else 0)

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val dateOffset: JsonField<DateOffset>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("date_offset")
                    @ExcludeMissing
                    dateOffset: JsonField<DateOffset> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(dateOffset, quantity, unitPrice, mutableMapOf())

                /**
                 * Date relative to the contract start date.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun dateOffset(): DateOffset = dateOffset.getRequired("date_offset")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the
                 * amount.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the
                 * amount.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                /**
                 * Returns the raw JSON value of [dateOffset].
                 *
                 * Unlike [dateOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("date_offset")
                @ExcludeMissing
                fun _dateOffset(): JsonField<DateOffset> = dateOffset

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .dateOffset()
                     * .quantity()
                     * .unitPrice()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var dateOffset: JsonField<DateOffset>? = null
                    private var quantity: JsonField<Double>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        dateOffset = scheduleItem.dateOffset
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** Date relative to the contract start date. */
                    fun dateOffset(dateOffset: DateOffset) = dateOffset(JsonField.of(dateOffset))

                    /**
                     * Sets [Builder.dateOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dateOffset] with a well-typed [DateOffset]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun dateOffset(dateOffset: JsonField<DateOffset>) = apply {
                        this.dateOffset = dateOffset
                    }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .dateOffset()
                     * .quantity()
                     * .unitPrice()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("dateOffset", dateOffset),
                            checkRequired("quantity", quantity),
                            checkRequired("unitPrice", unitPrice),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    dateOffset().validate()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (dateOffset.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                /** Date relative to the contract start date. */
                class DateOffset
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unit: JsonField<Unit>,
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of(),
                    ) : this(unit, value, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unit(): Unit = unit.getRequired("unit")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Long = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [DateOffset].
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DateOffset]. */
                    class Builder internal constructor() {

                        private var unit: JsonField<Unit>? = null
                        private var value: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(dateOffset: DateOffset) = apply {
                            unit = dateOffset.unit
                            value = dateOffset.value
                            additionalProperties = dateOffset.additionalProperties.toMutableMap()
                        }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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

                        /**
                         * Returns an immutable instance of [DateOffset].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): DateOffset =
                            DateOffset(
                                checkRequired("unit", unit),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): DateOffset = apply {
                        if (validated) {
                            return@apply
                        }

                        unit().validate()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (unit.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Unit
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DAYS = of("DAYS")

                            @JvmField val WEEKS = of("WEEKS")

                            @JvmField val MONTHS = of("MONTHS")

                            @JvmField val YEARS = of("YEARS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                        }

                        /**
                         * An enum containing [Unit]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Unit] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                            /**
                             * An enum member indicating that [Unit] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                DAYS -> Value.DAYS
                                WEEKS -> Value.WEEKS
                                MONTHS -> Value.MONTHS
                                YEARS -> Value.YEARS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                DAYS -> Known.DAYS
                                WEEKS -> Known.WEEKS
                                MONTHS -> Known.MONTHS
                                YEARS -> Known.YEARS
                                else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Unit = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: MetronomeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Unit && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DateOffset &&
                            unit == other.unit &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(unit, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DateOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        dateOffset == other.dateOffset &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(dateOffset, quantity, unitPrice, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{dateOffset=$dateOffset, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InvoiceSchedule &&
                    scheduleItems == other.scheduleItems &&
                    creditTypeId == other.creditTypeId &&
                    doNotInvoice == other.doNotInvoice &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(scheduleItems, creditTypeId, doNotInvoice, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, additionalProperties=$additionalProperties}"
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

            private var validated: Boolean = false

            fun validate(): RateType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RateType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Commit &&
                accessSchedule == other.accessSchedule &&
                productId == other.productId &&
                type == other.type &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                customFields == other.customFields &&
                description == other.description &&
                invoiceSchedule == other.invoiceSchedule &&
                name == other.name &&
                priority == other.priority &&
                rateType == other.rateType &&
                rolloverFraction == other.rolloverFraction &&
                specifiers == other.specifiers &&
                temporaryId == other.temporaryId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessSchedule,
                productId,
                type,
                applicableProductIds,
                applicableProductTags,
                customFields,
                description,
                invoiceSchedule,
                name,
                priority,
                rateType,
                rolloverFraction,
                specifiers,
                temporaryId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{accessSchedule=$accessSchedule, productId=$productId, type=$type, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, invoiceSchedule=$invoiceSchedule, name=$name, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, specifiers=$specifiers, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    class Credit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessSchedule: JsonField<AccessSchedule>,
        private val productId: JsonField<String>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val priority: JsonField<Double>,
        private val rateType: JsonField<RateType>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_schedule")
            @ExcludeMissing
            accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        ) : this(
            accessSchedule,
            productId,
            applicableProductIds,
            applicableProductTags,
            customFields,
            description,
            name,
            priority,
            rateType,
            specifiers,
            mutableMapOf(),
        )

        /**
         * Schedule for distributing the credit to the customer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessSchedule(): AccessSchedule = accessSchedule.getRequired("access_schedule")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Used only in UI/API. It is not exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * If multiple credits are applicable, the one with the lower priority will apply first.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * Returns the raw JSON value of [accessSchedule].
         *
         * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Credit].
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .productId()
             * ```
             */
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
            private var name: JsonField<String> = JsonMissing.of()
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
                name = credit.name
                priority = credit.priority
                rateType = credit.rateType
                specifiers = credit.specifiers.map { it.toMutableList() }
                additionalProperties = credit.additionalProperties.toMutableMap()
            }

            /** Schedule for distributing the credit to the customer. */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * Sets [Builder.accessSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessSchedule] with a well-typed [AccessSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
                    }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
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

            /**
             * Returns an immutable instance of [Credit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .productId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Credit =
                Credit(
                    checkRequired("accessSchedule", accessSchedule),
                    checkRequired("productId", productId),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    name,
                    priority,
                    rateType,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

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
            name()
            priority()
            rateType().ifPresent { it.validate() }
            specifiers().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** Schedule for distributing the credit to the customer. */
        class AccessSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val creditTypeId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
            ) : this(scheduleItems, creditTypeId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /**
             * Defaults to USD (cents) if not passed
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccessSchedule].
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 */
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

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [AccessSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccessSchedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0)

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val duration: JsonField<Duration>,
                private val startingAtOffset: JsonField<StartingAtOffset>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<Duration> = JsonMissing.of(),
                    @JsonProperty("starting_at_offset")
                    @ExcludeMissing
                    startingAtOffset: JsonField<StartingAtOffset> = JsonMissing.of(),
                ) : this(amount, duration, startingAtOffset, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * Offset relative to the start of this segment indicating when it should end.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun duration(): Duration = duration.getRequired("duration")

                /**
                 * Date relative to the contract start date indicating the start of this schedule
                 * segment.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAtOffset(): StartingAtOffset =
                    startingAtOffset.getRequired("starting_at_offset")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [duration].
                 *
                 * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("duration")
                @ExcludeMissing
                fun _duration(): JsonField<Duration> = duration

                /**
                 * Returns the raw JSON value of [startingAtOffset].
                 *
                 * Unlike [startingAtOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at_offset")
                @ExcludeMissing
                fun _startingAtOffset(): JsonField<StartingAtOffset> = startingAtOffset

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .duration()
                     * .startingAtOffset()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var duration: JsonField<Duration>? = null
                    private var startingAtOffset: JsonField<StartingAtOffset>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        duration = scheduleItem.duration
                        startingAtOffset = scheduleItem.startingAtOffset
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Offset relative to the start of this segment indicating when it should end.
                     */
                    fun duration(duration: Duration) = duration(JsonField.of(duration))

                    /**
                     * Sets [Builder.duration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.duration] with a well-typed [Duration] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

                    /**
                     * Date relative to the contract start date indicating the start of this
                     * schedule segment.
                     */
                    fun startingAtOffset(startingAtOffset: StartingAtOffset) =
                        startingAtOffset(JsonField.of(startingAtOffset))

                    /**
                     * Sets [Builder.startingAtOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAtOffset] with a well-typed
                     * [StartingAtOffset] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAtOffset(startingAtOffset: JsonField<StartingAtOffset>) = apply {
                        this.startingAtOffset = startingAtOffset
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

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .duration()
                     * .startingAtOffset()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("amount", amount),
                            checkRequired("duration", duration),
                            checkRequired("startingAtOffset", startingAtOffset),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    duration().validate()
                    startingAtOffset().validate()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (duration.asKnown().getOrNull()?.validity() ?: 0) +
                        (startingAtOffset.asKnown().getOrNull()?.validity() ?: 0)

                /** Offset relative to the start of this segment indicating when it should end. */
                class Duration
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unit: JsonField<Unit>,
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of(),
                    ) : this(unit, value, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unit(): Unit = unit.getRequired("unit")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Long = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Duration].
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Duration]. */
                    class Builder internal constructor() {

                        private var unit: JsonField<Unit>? = null
                        private var value: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(duration: Duration) = apply {
                            unit = duration.unit
                            value = duration.value
                            additionalProperties = duration.additionalProperties.toMutableMap()
                        }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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

                        /**
                         * Returns an immutable instance of [Duration].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Duration =
                            Duration(
                                checkRequired("unit", unit),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Duration = apply {
                        if (validated) {
                            return@apply
                        }

                        unit().validate()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (unit.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Unit
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DAYS = of("DAYS")

                            @JvmField val WEEKS = of("WEEKS")

                            @JvmField val MONTHS = of("MONTHS")

                            @JvmField val YEARS = of("YEARS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                        }

                        /**
                         * An enum containing [Unit]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Unit] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                            /**
                             * An enum member indicating that [Unit] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                DAYS -> Value.DAYS
                                WEEKS -> Value.WEEKS
                                MONTHS -> Value.MONTHS
                                YEARS -> Value.YEARS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                DAYS -> Known.DAYS
                                WEEKS -> Known.WEEKS
                                MONTHS -> Known.MONTHS
                                YEARS -> Known.YEARS
                                else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Unit = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: MetronomeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Unit && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Duration &&
                            unit == other.unit &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(unit, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Duration{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
                }

                /**
                 * Date relative to the contract start date indicating the start of this schedule
                 * segment.
                 */
                class StartingAtOffset
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unit: JsonField<Unit>,
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of(),
                    ) : this(unit, value, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unit(): Unit = unit.getRequired("unit")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Long = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [StartingAtOffset].
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StartingAtOffset]. */
                    class Builder internal constructor() {

                        private var unit: JsonField<Unit>? = null
                        private var value: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(startingAtOffset: StartingAtOffset) = apply {
                            unit = startingAtOffset.unit
                            value = startingAtOffset.value
                            additionalProperties =
                                startingAtOffset.additionalProperties.toMutableMap()
                        }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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

                        /**
                         * Returns an immutable instance of [StartingAtOffset].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): StartingAtOffset =
                            StartingAtOffset(
                                checkRequired("unit", unit),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): StartingAtOffset = apply {
                        if (validated) {
                            return@apply
                        }

                        unit().validate()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (unit.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Unit
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DAYS = of("DAYS")

                            @JvmField val WEEKS = of("WEEKS")

                            @JvmField val MONTHS = of("MONTHS")

                            @JvmField val YEARS = of("YEARS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                        }

                        /**
                         * An enum containing [Unit]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Unit] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                            /**
                             * An enum member indicating that [Unit] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                DAYS -> Value.DAYS
                                WEEKS -> Value.WEEKS
                                MONTHS -> Value.MONTHS
                                YEARS -> Value.YEARS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                DAYS -> Known.DAYS
                                WEEKS -> Known.WEEKS
                                MONTHS -> Known.MONTHS
                                YEARS -> Known.YEARS
                                else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Unit = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: MetronomeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Unit && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is StartingAtOffset &&
                            unit == other.unit &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(unit, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StartingAtOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        amount == other.amount &&
                        duration == other.duration &&
                        startingAtOffset == other.startingAtOffset &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, duration, startingAtOffset, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, duration=$duration, startingAtOffset=$startingAtOffset, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessSchedule &&
                    scheduleItems == other.scheduleItems &&
                    creditTypeId == other.creditTypeId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(scheduleItems, creditTypeId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

            private var validated: Boolean = false

            fun validate(): RateType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RateType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Credit &&
                accessSchedule == other.accessSchedule &&
                productId == other.productId &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                customFields == other.customFields &&
                description == other.description &&
                name == other.name &&
                priority == other.priority &&
                rateType == other.rateType &&
                specifiers == other.specifiers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessSchedule,
                productId,
                applicableProductIds,
                applicableProductTags,
                customFields,
                description,
                name,
                priority,
                rateType,
                specifiers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credit{accessSchedule=$accessSchedule, productId=$productId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, name=$name, priority=$priority, rateType=$rateType, specifiers=$specifiers, additionalProperties=$additionalProperties}"
    }

    class DeliveryMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

        private var validated: Boolean = false

        fun validate(): DeliveryMethod = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeliveryMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Duration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val unit: JsonField<Unit>,
        private val value: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
        ) : this(unit, value, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unit(): Unit = unit.getRequired("unit")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Duration].
             *
             * The following fields are required:
             * ```java
             * .unit()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Duration]. */
        class Builder internal constructor() {

            private var unit: JsonField<Unit>? = null
            private var value: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(duration: Duration) = apply {
                unit = duration.unit
                value = duration.value
                additionalProperties = duration.additionalProperties.toMutableMap()
            }

            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

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

            /**
             * Returns an immutable instance of [Duration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .unit()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Duration =
                Duration(
                    checkRequired("unit", unit),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Duration = apply {
            if (validated) {
                return@apply
            }

            unit().validate()
            value()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (unit.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DAYS = of("DAYS")

                @JvmField val WEEKS = of("WEEKS")

                @JvmField val MONTHS = of("MONTHS")

                @JvmField val YEARS = of("YEARS")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                DAYS,
                WEEKS,
                MONTHS,
                YEARS,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAYS,
                WEEKS,
                MONTHS,
                YEARS,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
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
                    DAYS -> Value.DAYS
                    WEEKS -> Value.WEEKS
                    MONTHS -> Value.MONTHS
                    YEARS -> Value.YEARS
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
                    DAYS -> Known.DAYS
                    WEEKS -> Known.WEEKS
                    MONTHS -> Known.MONTHS
                    YEARS -> Known.YEARS
                    else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
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

            private var validated: Boolean = false

            fun validate(): Unit = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Duration &&
                unit == other.unit &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Duration{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

        fun validate(): MultiplierOverridePrioritization = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MultiplierOverridePrioritization && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Override
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val overrideSpecifiers: JsonField<List<OverrideSpecifier>>,
        private val startingAtOffset: JsonField<StartingAtOffset>,
        private val duration: JsonField<Duration>,
        private val entitled: JsonField<Boolean>,
        private val isCommitSpecific: JsonField<Boolean>,
        private val multiplier: JsonField<Double>,
        private val overwriteRate: JsonField<OverwriteRate>,
        private val priority: JsonField<Double>,
        private val target: JsonField<Target>,
        private val tiers: JsonField<List<Tier>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("override_specifiers")
            @ExcludeMissing
            overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of(),
            @JsonProperty("starting_at_offset")
            @ExcludeMissing
            startingAtOffset: JsonField<StartingAtOffset> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Duration> = JsonMissing.of(),
            @JsonProperty("entitled")
            @ExcludeMissing
            entitled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_commit_specific")
            @ExcludeMissing
            isCommitSpecific: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("multiplier")
            @ExcludeMissing
            multiplier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("overwrite_rate")
            @ExcludeMissing
            overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
            @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            overrideSpecifiers,
            startingAtOffset,
            duration,
            entitled,
            isCommitSpecific,
            multiplier,
            overwriteRate,
            priority,
            target,
            tiers,
            type,
            mutableMapOf(),
        )

        /**
         * Specifies which products the override will apply to.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overrideSpecifiers(): List<OverrideSpecifier> =
            overrideSpecifiers.getRequired("override_specifiers")

        /**
         * Offset relative to contract start date indicating when the override will start applying
         * (inclusive)
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAtOffset(): StartingAtOffset =
            startingAtOffset.getRequired("starting_at_offset")

        /**
         * Offset relative to override start indicating when the override will stop applying
         * (exclusive)
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun duration(): Optional<Duration> = duration.getOptional("duration")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entitled(): Optional<Boolean> = entitled.getOptional("entitled")

        /**
         * Indicates whether the override should only apply to commits. Defaults to `false`. If
         * `true`, you can specify relevant commits in `override_specifiers` by passing
         * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
         * consuming any prepaid or postpaid commit.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isCommitSpecific(): Optional<Boolean> =
            isCommitSpecific.getOptional("is_commit_specific")

        /**
         * Required for MULTIPLIER type. Must be >=0.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun multiplier(): Optional<Double> = multiplier.getOptional("multiplier")

        /**
         * Required for OVERWRITE type.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overwriteRate(): Optional<OverwriteRate> = overwriteRate.getOptional("overwrite_rate")

        /**
         * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides. Under
         * EXPLICIT prioritization, overwrites are prioritized first, and then tiered and multiplier
         * overrides are prioritized by their priority value (lowest first). Must be > 0.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun target(): Optional<Target> = target.getOptional("target")

        /**
         * Required for TIERED type. Must have at least one tier.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

        /**
         * Overwrites are prioritized over multipliers and tiered overrides.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [overrideSpecifiers].
         *
         * Unlike [overrideSpecifiers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("override_specifiers")
        @ExcludeMissing
        fun _overrideSpecifiers(): JsonField<List<OverrideSpecifier>> = overrideSpecifiers

        /**
         * Returns the raw JSON value of [startingAtOffset].
         *
         * Unlike [startingAtOffset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_at_offset")
        @ExcludeMissing
        fun _startingAtOffset(): JsonField<StartingAtOffset> = startingAtOffset

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Duration> = duration

        /**
         * Returns the raw JSON value of [entitled].
         *
         * Unlike [entitled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

        /**
         * Returns the raw JSON value of [isCommitSpecific].
         *
         * Unlike [isCommitSpecific], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_commit_specific")
        @ExcludeMissing
        fun _isCommitSpecific(): JsonField<Boolean> = isCommitSpecific

        /**
         * Returns the raw JSON value of [multiplier].
         *
         * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("multiplier")
        @ExcludeMissing
        fun _multiplier(): JsonField<Double> = multiplier

        /**
         * Returns the raw JSON value of [overwriteRate].
         *
         * Unlike [overwriteRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        fun _overwriteRate(): JsonField<OverwriteRate> = overwriteRate

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /**
         * Returns the raw JSON value of [tiers].
         *
         * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Override].
             *
             * The following fields are required:
             * ```java
             * .overrideSpecifiers()
             * .startingAtOffset()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Override]. */
        class Builder internal constructor() {

            private var overrideSpecifiers: JsonField<MutableList<OverrideSpecifier>>? = null
            private var startingAtOffset: JsonField<StartingAtOffset>? = null
            private var duration: JsonField<Duration> = JsonMissing.of()
            private var entitled: JsonField<Boolean> = JsonMissing.of()
            private var isCommitSpecific: JsonField<Boolean> = JsonMissing.of()
            private var multiplier: JsonField<Double> = JsonMissing.of()
            private var overwriteRate: JsonField<OverwriteRate> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var target: JsonField<Target> = JsonMissing.of()
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                overrideSpecifiers = override.overrideSpecifiers.map { it.toMutableList() }
                startingAtOffset = override.startingAtOffset
                duration = override.duration
                entitled = override.entitled
                isCommitSpecific = override.isCommitSpecific
                multiplier = override.multiplier
                overwriteRate = override.overwriteRate
                priority = override.priority
                target = override.target
                tiers = override.tiers.map { it.toMutableList() }
                type = override.type
                additionalProperties = override.additionalProperties.toMutableMap()
            }

            /** Specifies which products the override will apply to. */
            fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
                overrideSpecifiers(JsonField.of(overrideSpecifiers))

            /**
             * Sets [Builder.overrideSpecifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overrideSpecifiers] with a well-typed
             * `List<OverrideSpecifier>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
                this.overrideSpecifiers = overrideSpecifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [OverrideSpecifier] to [overrideSpecifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOverrideSpecifier(overrideSpecifier: OverrideSpecifier) = apply {
                overrideSpecifiers =
                    (overrideSpecifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("overrideSpecifiers", it).add(overrideSpecifier)
                    }
            }

            /**
             * Offset relative to contract start date indicating when the override will start
             * applying (inclusive)
             */
            fun startingAtOffset(startingAtOffset: StartingAtOffset) =
                startingAtOffset(JsonField.of(startingAtOffset))

            /**
             * Sets [Builder.startingAtOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAtOffset] with a well-typed
             * [StartingAtOffset] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun startingAtOffset(startingAtOffset: JsonField<StartingAtOffset>) = apply {
                this.startingAtOffset = startingAtOffset
            }

            /**
             * Offset relative to override start indicating when the override will stop applying
             * (exclusive)
             */
            fun duration(duration: Duration) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Duration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            /**
             * Sets [Builder.entitled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entitled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.isCommitSpecific] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isCommitSpecific] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
                this.isCommitSpecific = isCommitSpecific
            }

            /** Required for MULTIPLIER type. Must be >=0. */
            fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

            /**
             * Sets [Builder.multiplier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multiplier] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

            /** Required for OVERWRITE type. */
            fun overwriteRate(overwriteRate: OverwriteRate) =
                overwriteRate(JsonField.of(overwriteRate))

            /**
             * Sets [Builder.overwriteRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overwriteRate] with a well-typed [OverwriteRate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            /**
             * Indicates whether the override applies to commit rates or list rates. Can only be
             * used for overrides that have `is_commit_specific` set to `true`. Defaults to
             * `"LIST_RATE"`.
             */
            fun target(target: Target) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [Target] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            /** Required for TIERED type. Must have at least one tier. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /**
             * Sets [Builder.tiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiers(tiers: JsonField<List<Tier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tier] to [tiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTier(tier: Tier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tiers", it).add(tier)
                    }
            }

            /** Overwrites are prioritized over multipliers and tiered overrides. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Override].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .overrideSpecifiers()
             * .startingAtOffset()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Override =
                Override(
                    checkRequired("overrideSpecifiers", overrideSpecifiers).map {
                        it.toImmutable()
                    },
                    checkRequired("startingAtOffset", startingAtOffset),
                    duration,
                    entitled,
                    isCommitSpecific,
                    multiplier,
                    overwriteRate,
                    priority,
                    target,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Override = apply {
            if (validated) {
                return@apply
            }

            overrideSpecifiers().forEach { it.validate() }
            startingAtOffset().validate()
            duration().ifPresent { it.validate() }
            entitled()
            isCommitSpecific()
            multiplier()
            overwriteRate().ifPresent { it.validate() }
            priority()
            target().ifPresent { it.validate() }
            tiers().ifPresent { it.forEach { it.validate() } }
            type().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (overrideSpecifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (startingAtOffset.asKnown().getOrNull()?.validity() ?: 0) +
                (duration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (entitled.asKnown().isPresent) 1 else 0) +
                (if (isCommitSpecific.asKnown().isPresent) 1 else 0) +
                (if (multiplier.asKnown().isPresent) 1 else 0) +
                (overwriteRate.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (target.asKnown().getOrNull()?.validity() ?: 0) +
                (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class OverrideSpecifier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingFrequency: JsonField<BillingFrequency>,
            private val commitIds: JsonField<List<String>>,
            private val presentationGroupValues: JsonField<PresentationGroupValues>,
            private val pricingGroupValues: JsonField<PricingGroupValues>,
            private val productId: JsonField<String>,
            private val productTags: JsonField<List<String>>,
            private val recurringCommitIds: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billing_frequency")
                @ExcludeMissing
                billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
                @JsonProperty("commit_ids")
                @ExcludeMissing
                commitIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("presentation_group_values")
                @ExcludeMissing
                presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
                @JsonProperty("pricing_group_values")
                @ExcludeMissing
                pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("product_tags")
                @ExcludeMissing
                productTags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("recurring_commit_ids")
                @ExcludeMissing
                recurringCommitIds: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                billingFrequency,
                commitIds,
                presentationGroupValues,
                pricingGroupValues,
                productId,
                productTags,
                recurringCommitIds,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun billingFrequency(): Optional<BillingFrequency> =
                billingFrequency.getOptional("billing_frequency")

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to the
             * specified commits. If not provided, the override will apply to all commits.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun commitIds(): Optional<List<String>> = commitIds.getOptional("commit_ids")

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                presentationGroupValues.getOptional("presentation_group_values")

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pricingGroupValues(): Optional<PricingGroupValues> =
                pricingGroupValues.getOptional("pricing_group_values")

            /**
             * If provided, the override will only apply to the product with the specified ID.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun productId(): Optional<String> = productId.getOptional("product_id")

            /**
             * If provided, the override will only apply to products with all the specified tags.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun productTags(): Optional<List<String>> = productTags.getOptional("product_tags")

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to commits
             * created by the specified recurring commit ids.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recurringCommitIds(): Optional<List<String>> =
                recurringCommitIds.getOptional("recurring_commit_ids")

            /**
             * Returns the raw JSON value of [billingFrequency].
             *
             * Unlike [billingFrequency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

            /**
             * Returns the raw JSON value of [commitIds].
             *
             * Unlike [commitIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("commit_ids")
            @ExcludeMissing
            fun _commitIds(): JsonField<List<String>> = commitIds

            /**
             * Returns the raw JSON value of [presentationGroupValues].
             *
             * Unlike [presentationGroupValues], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun _presentationGroupValues(): JsonField<PresentationGroupValues> =
                presentationGroupValues

            /**
             * Returns the raw JSON value of [pricingGroupValues].
             *
             * Unlike [pricingGroupValues], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

            /**
             * Returns the raw JSON value of [productId].
             *
             * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /**
             * Returns the raw JSON value of [productTags].
             *
             * Unlike [productTags], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_tags")
            @ExcludeMissing
            fun _productTags(): JsonField<List<String>> = productTags

            /**
             * Returns the raw JSON value of [recurringCommitIds].
             *
             * Unlike [recurringCommitIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_commit_ids")
            @ExcludeMissing
            fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OverrideSpecifier].
                 */
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
                    additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
                }

                fun billingFrequency(billingFrequency: BillingFrequency) =
                    billingFrequency(JsonField.of(billingFrequency))

                /**
                 * Sets [Builder.billingFrequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingFrequency] with a well-typed
                 * [BillingFrequency] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
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
                 * Sets [Builder.commitIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commitIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun commitIds(commitIds: JsonField<List<String>>) = apply {
                    this.commitIds = commitIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [commitIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCommitId(commitId: String) = apply {
                    commitIds =
                        (commitIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("commitIds", it).add(commitId)
                        }
                }

                /**
                 * A map of group names to values. The override will only apply to line items with
                 * the specified presentation group values.
                 */
                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    presentationGroupValues(JsonField.of(presentationGroupValues))

                /**
                 * Sets [Builder.presentationGroupValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.presentationGroupValues] with a well-typed
                 * [PresentationGroupValues] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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
                 * Sets [Builder.pricingGroupValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pricingGroupValues] with a well-typed
                 * [PricingGroupValues] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                /**
                 * If provided, the override will only apply to the product with the specified ID.
                 */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

                /**
                 * Sets [Builder.productTags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productTags] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun productTags(productTags: JsonField<List<String>>) = apply {
                    this.productTags = productTags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [productTags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProductTag(productTag: String) = apply {
                    productTags =
                        (productTags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("productTags", it).add(productTag)
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
                 * Sets [Builder.recurringCommitIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurringCommitIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                    this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [recurringCommitIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRecurringCommitId(recurringCommitId: String) = apply {
                    recurringCommitIds =
                        (recurringCommitIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("recurringCommitIds", it).add(recurringCommitId)
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

                /**
                 * Returns an immutable instance of [OverrideSpecifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OverrideSpecifier =
                    OverrideSpecifier(
                        billingFrequency,
                        (commitIds ?: JsonMissing.of()).map { it.toImmutable() },
                        presentationGroupValues,
                        pricingGroupValues,
                        productId,
                        (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                        (recurringCommitIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OverrideSpecifier = apply {
                if (validated) {
                    return@apply
                }

                billingFrequency().ifPresent { it.validate() }
                commitIds()
                presentationGroupValues().ifPresent { it.validate() }
                pricingGroupValues().ifPresent { it.validate() }
                productId()
                productTags()
                recurringCommitIds()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                    (commitIds.asKnown().getOrNull()?.size ?: 0) +
                    (presentationGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                    (pricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (productId.asKnown().isPresent) 1 else 0) +
                    (productTags.asKnown().getOrNull()?.size ?: 0) +
                    (recurringCommitIds.asKnown().getOrNull()?.size ?: 0)

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

                private var validated: Boolean = false

                fun validate(): BillingFrequency = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BillingFrequency && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             */
            class PresentationGroupValues
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PresentationGroupValues].
                     */
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

                    /**
                     * Returns an immutable instance of [PresentationGroupValues].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PresentationGroupValues =
                        PresentationGroupValues(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): PresentationGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PresentationGroupValues &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PresentationGroupValues{additionalProperties=$additionalProperties}"
            }

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            class PricingGroupValues
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PricingGroupValues].
                     */
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

                    /**
                     * Returns an immutable instance of [PricingGroupValues].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PricingGroupValues =
                        PricingGroupValues(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): PricingGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PricingGroupValues &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PricingGroupValues{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideSpecifier &&
                    billingFrequency == other.billingFrequency &&
                    commitIds == other.commitIds &&
                    presentationGroupValues == other.presentationGroupValues &&
                    pricingGroupValues == other.pricingGroupValues &&
                    productId == other.productId &&
                    productTags == other.productTags &&
                    recurringCommitIds == other.recurringCommitIds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingFrequency,
                    commitIds,
                    presentationGroupValues,
                    pricingGroupValues,
                    productId,
                    productTags,
                    recurringCommitIds,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverrideSpecifier{billingFrequency=$billingFrequency, commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, recurringCommitIds=$recurringCommitIds, additionalProperties=$additionalProperties}"
        }

        /**
         * Offset relative to contract start date indicating when the override will start applying
         * (inclusive)
         */
        class StartingAtOffset
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [StartingAtOffset].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartingAtOffset]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(startingAtOffset: StartingAtOffset) = apply {
                    unit = startingAtOffset.unit
                    value = startingAtOffset.value
                    additionalProperties = startingAtOffset.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [StartingAtOffset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StartingAtOffset =
                    StartingAtOffset(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): StartingAtOffset = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartingAtOffset &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartingAtOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        /**
         * Offset relative to override start indicating when the override will stop applying
         * (exclusive)
         */
        class Duration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Duration].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Duration]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(duration: Duration) = apply {
                    unit = duration.unit
                    value = duration.value
                    additionalProperties = duration.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [Duration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Duration =
                    Duration(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Duration = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Duration &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Duration{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        /** Required for OVERWRITE type. */
        class OverwriteRate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val rateType: JsonField<RateType>,
            private val creditTypeId: JsonField<String>,
            private val customRate: JsonField<CustomRate>,
            private val isProrated: JsonField<Boolean>,
            private val price: JsonField<Double>,
            private val quantity: JsonField<Double>,
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("rate_type")
                @ExcludeMissing
                rateType: JsonField<RateType> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("custom_rate")
                @ExcludeMissing
                customRate: JsonField<CustomRate> = JsonMissing.of(),
                @JsonProperty("is_prorated")
                @ExcludeMissing
                isProrated: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tiers")
                @ExcludeMissing
                tiers: JsonField<List<Tier>> = JsonMissing.of(),
            ) : this(
                rateType,
                creditTypeId,
                customRate,
                isProrated,
                price,
                quantity,
                tiers,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rateType(): RateType = rateType.getRequired("rate_type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun customRate(): Optional<CustomRate> = customRate.getOptional("custom_rate")

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun isProrated(): Optional<Boolean> = isProrated.getOptional("is_prorated")

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun price(): Optional<Double> = price.getOptional("price")

            /**
             * Default quantity. For SUBSCRIPTION rate_type, this must be >=0.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Double> = quantity.getOptional("quantity")

            /**
             * Only set for TIERED rate_type.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

            /**
             * Returns the raw JSON value of [rateType].
             *
             * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [customRate].
             *
             * Unlike [customRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("custom_rate")
            @ExcludeMissing
            fun _customRate(): JsonField<CustomRate> = customRate

            /**
             * Returns the raw JSON value of [isProrated].
             *
             * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun _isProrated(): JsonField<Boolean> = isProrated

            /**
             * Returns the raw JSON value of [price].
             *
             * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [tiers].
             *
             * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OverwriteRate].
                 *
                 * The following fields are required:
                 * ```java
                 * .rateType()
                 * ```
                 */
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

                /**
                 * Sets [Builder.rateType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rateType] with a well-typed [RateType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                fun customRate(customRate: CustomRate) = customRate(JsonField.of(customRate))

                /**
                 * Sets [Builder.customRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customRate] with a well-typed [CustomRate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Sets [Builder.isProrated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isProrated] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Sets [Builder.price] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.price] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun price(price: JsonField<Double>) = apply { this.price = price }

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /** Only set for TIERED rate_type. */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Sets [Builder.tiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tiers(tiers: JsonField<List<Tier>>) = apply {
                    this.tiers = tiers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Tier] to [tiers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTier(tier: Tier) = apply {
                    tiers =
                        (tiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tiers", it).add(tier)
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

                /**
                 * Returns an immutable instance of [OverwriteRate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .rateType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OverwriteRate =
                    OverwriteRate(
                        checkRequired("rateType", rateType),
                        creditTypeId,
                        customRate,
                        isProrated,
                        price,
                        quantity,
                        (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OverwriteRate = apply {
                if (validated) {
                    return@apply
                }

                rateType().validate()
                creditTypeId()
                customRate().ifPresent { it.validate() }
                isProrated()
                price()
                quantity()
                tiers().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (customRate.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (isProrated.asKnown().isPresent) 1 else 0) +
                    (if (price.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

                private var validated: Boolean = false

                fun validate(): RateType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RateType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            class CustomRate
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [CustomRate]. */
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

                    /**
                     * Returns an immutable instance of [CustomRate].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CustomRate = CustomRate(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): CustomRate = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomRate && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "CustomRate{additionalProperties=$additionalProperties}"
            }

            class Tier
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val price: JsonField<Double>,
                private val size: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("price")
                    @ExcludeMissing
                    price: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("size") @ExcludeMissing size: JsonField<Double> = JsonMissing.of(),
                ) : this(price, size, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun price(): Double = price.getRequired("price")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun size(): Optional<Double> = size.getOptional("size")

                /**
                 * Returns the raw JSON value of [price].
                 *
                 * Unlike [price], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

                /**
                 * Returns the raw JSON value of [size].
                 *
                 * Unlike [size], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Tier].
                     *
                     * The following fields are required:
                     * ```java
                     * .price()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tier]. */
                class Builder internal constructor() {

                    private var price: JsonField<Double>? = null
                    private var size: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tier: Tier) = apply {
                        price = tier.price
                        size = tier.size
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    fun price(price: Double) = price(JsonField.of(price))

                    /**
                     * Sets [Builder.price] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.price] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun price(price: JsonField<Double>) = apply { this.price = price }

                    fun size(size: Double) = size(JsonField.of(size))

                    /**
                     * Sets [Builder.size] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.size] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Tier].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .price()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tier =
                        Tier(
                            checkRequired("price", price),
                            size,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Tier = apply {
                    if (validated) {
                        return@apply
                    }

                    price()
                    size()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (price.asKnown().isPresent) 1 else 0) +
                        (if (size.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        price == other.price &&
                        size == other.size &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(price, size, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{price=$price, size=$size, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverwriteRate &&
                    rateType == other.rateType &&
                    creditTypeId == other.creditTypeId &&
                    customRate == other.customRate &&
                    isProrated == other.isProrated &&
                    price == other.price &&
                    quantity == other.quantity &&
                    tiers == other.tiers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    rateType,
                    creditTypeId,
                    customRate,
                    isProrated,
                    price,
                    quantity,
                    tiers,
                    additionalProperties,
                )
            }

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

            private var validated: Boolean = false

            fun validate(): Target = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Target && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Tier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val multiplier: JsonField<Double>,
            private val size: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("multiplier")
                @ExcludeMissing
                multiplier: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("size") @ExcludeMissing size: JsonField<Double> = JsonMissing.of(),
            ) : this(multiplier, size, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun multiplier(): Double = multiplier.getRequired("multiplier")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun size(): Optional<Double> = size.getOptional("size")

            /**
             * Returns the raw JSON value of [multiplier].
             *
             * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("multiplier")
            @ExcludeMissing
            fun _multiplier(): JsonField<Double> = multiplier

            /**
             * Returns the raw JSON value of [size].
             *
             * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Tier].
                 *
                 * The following fields are required:
                 * ```java
                 * .multiplier()
                 * ```
                 */
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

                /**
                 * Sets [Builder.multiplier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiplier] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun multiplier(multiplier: JsonField<Double>) = apply {
                    this.multiplier = multiplier
                }

                fun size(size: Double) = size(JsonField.of(size))

                /**
                 * Sets [Builder.size] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.size] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Tier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .multiplier()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tier =
                    Tier(
                        checkRequired("multiplier", multiplier),
                        size,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                multiplier()
                size()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (multiplier.asKnown().isPresent) 1 else 0) +
                    (if (size.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tier &&
                    multiplier == other.multiplier &&
                    size == other.size &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(multiplier, size, additionalProperties)
            }

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

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Override &&
                overrideSpecifiers == other.overrideSpecifiers &&
                startingAtOffset == other.startingAtOffset &&
                duration == other.duration &&
                entitled == other.entitled &&
                isCommitSpecific == other.isCommitSpecific &&
                multiplier == other.multiplier &&
                overwriteRate == other.overwriteRate &&
                priority == other.priority &&
                target == other.target &&
                tiers == other.tiers &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                overrideSpecifiers,
                startingAtOffset,
                duration,
                entitled,
                isCommitSpecific,
                multiplier,
                overwriteRate,
                priority,
                target,
                tiers,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Override{overrideSpecifiers=$overrideSpecifiers, startingAtOffset=$startingAtOffset, duration=$duration, entitled=$entitled, isCommitSpecific=$isCommitSpecific, multiplier=$multiplier, overwriteRate=$overwriteRate, priority=$priority, target=$target, tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
    }

    class RecurringCommit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessAmount: JsonField<AccessAmount>,
        private val commitDuration: JsonField<CommitDuration>,
        private val priority: JsonField<Double>,
        private val productId: JsonField<String>,
        private val startingAtOffset: JsonField<StartingAtOffset>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val description: JsonField<String>,
        private val duration: JsonField<Duration>,
        private val invoiceAmount: JsonField<InvoiceAmount>,
        private val name: JsonField<String>,
        private val proration: JsonField<Proration>,
        private val rateType: JsonField<RateType>,
        private val recurrenceFrequency: JsonField<RecurrenceFrequency>,
        private val rolloverFraction: JsonField<Double>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val subscriptionConfig: JsonField<SubscriptionConfig>,
        private val temporaryId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_amount")
            @ExcludeMissing
            accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
            @JsonProperty("commit_duration")
            @ExcludeMissing
            commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_at_offset")
            @ExcludeMissing
            startingAtOffset: JsonField<StartingAtOffset> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Duration> = JsonMissing.of(),
            @JsonProperty("invoice_amount")
            @ExcludeMissing
            invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proration")
            @ExcludeMissing
            proration: JsonField<Proration> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("recurrence_frequency")
            @ExcludeMissing
            recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonProperty("subscription_config")
            @ExcludeMissing
            subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of(),
            @JsonProperty("temporary_id")
            @ExcludeMissing
            temporaryId: JsonField<String> = JsonMissing.of(),
        ) : this(
            accessAmount,
            commitDuration,
            priority,
            productId,
            startingAtOffset,
            applicableProductIds,
            applicableProductTags,
            description,
            duration,
            invoiceAmount,
            name,
            proration,
            rateType,
            recurrenceFrequency,
            rolloverFraction,
            specifiers,
            subscriptionConfig,
            temporaryId,
            mutableMapOf(),
        )

        /**
         * The amount of commit to grant.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Double = priority.getRequired("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Offset relative to the contract start date that determines the start time for the first
         * commit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAtOffset(): StartingAtOffset =
            startingAtOffset.getRequired("starting_at_offset")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Offset relative to the recurring credit start that determines when the contract will stop
         * creating recurring commits. optional
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun duration(): Optional<Duration> = duration.getOptional("duration")

        /**
         * The amount the customer should be billed for the commit. Not required.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceAmount(): Optional<InvoiceAmount> = invoiceAmount.getOptional("invoice_amount")

        /**
         * displayed on invoices. will be passed through to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proration(): Optional<Proration> = proration.getOptional("proration")

        /**
         * Whether the created commits will use the commit rate or list rate
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
            recurrenceFrequency.getOptional("recurrence_frequency")

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rolloverFraction(): Optional<Double> = rolloverFraction.getOptional("rollover_fraction")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * Attach a subscription to the recurring commit/credit.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionConfig(): Optional<SubscriptionConfig> =
            subscriptionConfig.getOptional("subscription_config")

        /**
         * A temporary ID that can be used to reference the recurring commit for commit specific
         * overrides.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun temporaryId(): Optional<String> = temporaryId.getOptional("temporary_id")

        /**
         * Returns the raw JSON value of [accessAmount].
         *
         * Unlike [accessAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_amount")
        @ExcludeMissing
        fun _accessAmount(): JsonField<AccessAmount> = accessAmount

        /**
         * Returns the raw JSON value of [commitDuration].
         *
         * Unlike [commitDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commit_duration")
        @ExcludeMissing
        fun _commitDuration(): JsonField<CommitDuration> = commitDuration

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [startingAtOffset].
         *
         * Unlike [startingAtOffset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_at_offset")
        @ExcludeMissing
        fun _startingAtOffset(): JsonField<StartingAtOffset> = startingAtOffset

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Duration> = duration

        /**
         * Returns the raw JSON value of [invoiceAmount].
         *
         * Unlike [invoiceAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_amount")
        @ExcludeMissing
        fun _invoiceAmount(): JsonField<InvoiceAmount> = invoiceAmount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [proration].
         *
         * Unlike [proration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [recurrenceFrequency].
         *
         * Unlike [recurrenceFrequency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        fun _recurrenceFrequency(): JsonField<RecurrenceFrequency> = recurrenceFrequency

        /**
         * Returns the raw JSON value of [rolloverFraction].
         *
         * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /**
         * Returns the raw JSON value of [subscriptionConfig].
         *
         * Unlike [subscriptionConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<SubscriptionConfig> = subscriptionConfig

        /**
         * Returns the raw JSON value of [temporaryId].
         *
         * Unlike [temporaryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [RecurringCommit].
             *
             * The following fields are required:
             * ```java
             * .accessAmount()
             * .commitDuration()
             * .priority()
             * .productId()
             * .startingAtOffset()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RecurringCommit]. */
        class Builder internal constructor() {

            private var accessAmount: JsonField<AccessAmount>? = null
            private var commitDuration: JsonField<CommitDuration>? = null
            private var priority: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var startingAtOffset: JsonField<StartingAtOffset>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Duration> = JsonMissing.of()
            private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
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
                startingAtOffset = recurringCommit.startingAtOffset
                applicableProductIds =
                    recurringCommit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    recurringCommit.applicableProductTags.map { it.toMutableList() }
                description = recurringCommit.description
                duration = recurringCommit.duration
                invoiceAmount = recurringCommit.invoiceAmount
                name = recurringCommit.name
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

            /**
             * Sets [Builder.accessAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessAmount] with a well-typed [AccessAmount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.commitDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitDuration] with a well-typed [CommitDuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                this.commitDuration = commitDuration
            }

            /** Will be passed down to the individual commits */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Offset relative to the contract start date that determines the start time for the
             * first commit
             */
            fun startingAtOffset(startingAtOffset: StartingAtOffset) =
                startingAtOffset(JsonField.of(startingAtOffset))

            /**
             * Sets [Builder.startingAtOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAtOffset] with a well-typed
             * [StartingAtOffset] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun startingAtOffset(startingAtOffset: JsonField<StartingAtOffset>) = apply {
                this.startingAtOffset = startingAtOffset
            }

            /** Will be passed down to the individual commits */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
                    }
            }

            /** Will be passed down to the individual commits */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            /** Will be passed down to the individual commits */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Offset relative to the recurring credit start that determines when the contract will
             * stop creating recurring commits. optional
             */
            fun duration(duration: Duration) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Duration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

            /** The amount the customer should be billed for the commit. Not required. */
            fun invoiceAmount(invoiceAmount: InvoiceAmount) =
                invoiceAmount(JsonField.of(invoiceAmount))

            /**
             * Sets [Builder.invoiceAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceAmount] with a well-typed [InvoiceAmount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceAmount(invoiceAmount: JsonField<InvoiceAmount>) = apply {
                this.invoiceAmount = invoiceAmount
            }

            /** displayed on invoices. will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(proration: Proration) = proration(JsonField.of(proration))

            /**
             * Sets [Builder.proration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proration] with a well-typed [Proration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proration(proration: JsonField<Proration>) = apply { this.proration = proration }

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.recurrenceFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurrenceFrequency] with a well-typed
             * [RecurrenceFrequency] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverFraction] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
                    }
            }

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(subscriptionConfig: SubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /**
             * Sets [Builder.subscriptionConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionConfig] with a well-typed
             * [SubscriptionConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun subscriptionConfig(subscriptionConfig: JsonField<SubscriptionConfig>) = apply {
                this.subscriptionConfig = subscriptionConfig
            }

            /**
             * A temporary ID that can be used to reference the recurring commit for commit specific
             * overrides.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * Sets [Builder.temporaryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temporaryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [RecurringCommit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accessAmount()
             * .commitDuration()
             * .priority()
             * .productId()
             * .startingAtOffset()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RecurringCommit =
                RecurringCommit(
                    checkRequired("accessAmount", accessAmount),
                    checkRequired("commitDuration", commitDuration),
                    checkRequired("priority", priority),
                    checkRequired("productId", productId),
                    checkRequired("startingAtOffset", startingAtOffset),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    duration,
                    invoiceAmount,
                    name,
                    proration,
                    rateType,
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    temporaryId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RecurringCommit = apply {
            if (validated) {
                return@apply
            }

            accessAmount().validate()
            commitDuration().validate()
            priority()
            productId()
            startingAtOffset().validate()
            applicableProductIds()
            applicableProductTags()
            description()
            duration().ifPresent { it.validate() }
            invoiceAmount().ifPresent { it.validate() }
            name()
            proration().ifPresent { it.validate() }
            rateType().ifPresent { it.validate() }
            recurrenceFrequency().ifPresent { it.validate() }
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            temporaryId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accessAmount.asKnown().getOrNull()?.validity() ?: 0) +
                (commitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (startingAtOffset.asKnown().getOrNull()?.validity() ?: 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (duration.asKnown().getOrNull()?.validity() ?: 0) +
                (invoiceAmount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (proration.asKnown().getOrNull()?.validity() ?: 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (recurrenceFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (subscriptionConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (temporaryId.asKnown().isPresent) 1 else 0)

        /** The amount of commit to grant. */
        class AccessAmount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditTypeId: JsonField<String>,
            private val unitPrice: JsonField<Double>,
            private val quantity: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
            ) : this(creditTypeId, unitPrice, quantity, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unitPrice(): Double = unitPrice.getRequired("unit_price")

            /**
             * This field is required unless a subscription is attached via `subscription_config`.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Double> = quantity.getOptional("quantity")

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccessAmount].
                 *
                 * The following fields are required:
                 * ```java
                 * .creditTypeId()
                 * .unitPrice()
                 * ```
                 */
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

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

                /**
                 * This field is required unless a subscription is attached via
                 * `subscription_config`.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [AccessAmount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .creditTypeId()
                 * .unitPrice()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccessAmount =
                    AccessAmount(
                        checkRequired("creditTypeId", creditTypeId),
                        checkRequired("unitPrice", unitPrice),
                        quantity,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (unitPrice.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessAmount &&
                    creditTypeId == other.creditTypeId &&
                    unitPrice == other.unitPrice &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(creditTypeId, unitPrice, quantity, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessAmount{creditTypeId=$creditTypeId, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        class CommitDuration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val value: JsonField<Double>,
            private val unit: JsonField<Unit>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
            ) : this(value, unit, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Double = value.getRequired("value")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun unit(): Optional<Unit> = unit.getOptional("unit")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [CommitDuration].
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 */
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

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [CommitDuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CommitDuration =
                    CommitDuration(
                        checkRequired("value", value),
                        unit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CommitDuration = apply {
                if (validated) {
                    return@apply
                }

                value()
                unit().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (value.asKnown().isPresent) 1 else 0) +
                    (unit.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CommitDuration &&
                    value == other.value &&
                    unit == other.unit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(value, unit, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
        }

        /**
         * Offset relative to the contract start date that determines the start time for the first
         * commit
         */
        class StartingAtOffset
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [StartingAtOffset].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartingAtOffset]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(startingAtOffset: StartingAtOffset) = apply {
                    unit = startingAtOffset.unit
                    value = startingAtOffset.value
                    additionalProperties = startingAtOffset.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [StartingAtOffset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StartingAtOffset =
                    StartingAtOffset(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): StartingAtOffset = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartingAtOffset &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartingAtOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        /**
         * Offset relative to the recurring credit start that determines when the contract will stop
         * creating recurring commits. optional
         */
        class Duration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Duration].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Duration]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(duration: Duration) = apply {
                    unit = duration.unit
                    value = duration.value
                    additionalProperties = duration.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [Duration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Duration =
                    Duration(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Duration = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Duration &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Duration{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        /** The amount the customer should be billed for the commit. Not required. */
        class InvoiceAmount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditTypeId: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val unitPrice: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                unitPrice: JsonField<Double> = JsonMissing.of(),
            ) : this(creditTypeId, quantity, unitPrice, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Double = quantity.getRequired("quantity")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unitPrice(): Double = unitPrice.getRequired("unit_price")

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [InvoiceAmount].
                 *
                 * The following fields are required:
                 * ```java
                 * .creditTypeId()
                 * .quantity()
                 * .unitPrice()
                 * ```
                 */
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

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [InvoiceAmount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .creditTypeId()
                 * .quantity()
                 * .unitPrice()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InvoiceAmount =
                    InvoiceAmount(
                        checkRequired("creditTypeId", creditTypeId),
                        checkRequired("quantity", quantity),
                        checkRequired("unitPrice", unitPrice),
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (if (unitPrice.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InvoiceAmount &&
                    creditTypeId == other.creditTypeId &&
                    quantity == other.quantity &&
                    unitPrice == other.unitPrice &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(creditTypeId, quantity, unitPrice, additionalProperties)
            }

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

            private var validated: Boolean = false

            fun validate(): Proration = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Proration && value == other.value
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

            private var validated: Boolean = false

            fun validate(): RateType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RateType && value == other.value
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

            private var validated: Boolean = false

            fun validate(): RecurrenceFrequency = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RecurrenceFrequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Attach a subscription to the recurring commit/credit. */
        class SubscriptionConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>,
            private val subscriptionId: JsonField<String>,
            private val allocation: JsonField<Allocation>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("apply_seat_increase_config")
                @ExcludeMissing
                applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("allocation")
                @ExcludeMissing
                allocation: JsonField<Allocation> = JsonMissing.of(),
            ) : this(applySeatIncreaseConfig, subscriptionId, allocation, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun applySeatIncreaseConfig(): ApplySeatIncreaseConfig =
                applySeatIncreaseConfig.getRequired("apply_seat_increase_config")

            /**
             * ID of the subscription to configure on the recurring commit/credit.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allocation(): Optional<Allocation> = allocation.getOptional("allocation")

            /**
             * Returns the raw JSON value of [applySeatIncreaseConfig].
             *
             * Unlike [applySeatIncreaseConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("apply_seat_increase_config")
            @ExcludeMissing
            fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> =
                applySeatIncreaseConfig

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [allocation].
             *
             * Unlike [allocation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allocation")
            @ExcludeMissing
            fun _allocation(): JsonField<Allocation> = allocation

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SubscriptionConfig].
                 *
                 * The following fields are required:
                 * ```java
                 * .applySeatIncreaseConfig()
                 * .subscriptionId()
                 * ```
                 */
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

                /**
                 * Sets [Builder.applySeatIncreaseConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.applySeatIncreaseConfig] with a well-typed
                 * [ApplySeatIncreaseConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun applySeatIncreaseConfig(
                    applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>
                ) = apply { this.applySeatIncreaseConfig = applySeatIncreaseConfig }

                /** ID of the subscription to configure on the recurring commit/credit. */
                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /**
                 * If set to POOLED, allocation added per seat is pooled across the account. If set
                 * to INDIVIDUAL, each seat in the subscription will have its own allocation.
                 */
                fun allocation(allocation: Allocation) = allocation(JsonField.of(allocation))

                /**
                 * Sets [Builder.allocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allocation] with a well-typed [Allocation] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [SubscriptionConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .applySeatIncreaseConfig()
                 * .subscriptionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SubscriptionConfig =
                    SubscriptionConfig(
                        checkRequired("applySeatIncreaseConfig", applySeatIncreaseConfig),
                        checkRequired("subscriptionId", subscriptionId),
                        allocation,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SubscriptionConfig = apply {
                if (validated) {
                    return@apply
                }

                applySeatIncreaseConfig().validate()
                subscriptionId()
                allocation().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (applySeatIncreaseConfig.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown().isPresent) 1 else 0) +
                    (allocation.asKnown().getOrNull()?.validity() ?: 0)

            class ApplySeatIncreaseConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val isProrated: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("is_prorated")
                    @ExcludeMissing
                    isProrated: JsonField<Boolean> = JsonMissing.of()
                ) : this(isProrated, mutableMapOf())

                /**
                 * Indicates whether a mid-period seat increase should be prorated.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

                /**
                 * Returns the raw JSON value of [isProrated].
                 *
                 * Unlike [isProrated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_prorated")
                @ExcludeMissing
                fun _isProrated(): JsonField<Boolean> = isProrated

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [ApplySeatIncreaseConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .isProrated()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.isProrated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isProrated] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [ApplySeatIncreaseConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .isProrated()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ApplySeatIncreaseConfig =
                        ApplySeatIncreaseConfig(
                            checkRequired("isProrated", isProrated),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ApplySeatIncreaseConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    isProrated()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (isProrated.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ApplySeatIncreaseConfig &&
                        isProrated == other.isProrated &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }

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

                private var validated: Boolean = false

                fun validate(): Allocation = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Allocation && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SubscriptionConfig &&
                    applySeatIncreaseConfig == other.applySeatIncreaseConfig &&
                    subscriptionId == other.subscriptionId &&
                    allocation == other.allocation &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    applySeatIncreaseConfig,
                    subscriptionId,
                    allocation,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionConfig{applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, allocation=$allocation, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecurringCommit &&
                accessAmount == other.accessAmount &&
                commitDuration == other.commitDuration &&
                priority == other.priority &&
                productId == other.productId &&
                startingAtOffset == other.startingAtOffset &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                description == other.description &&
                duration == other.duration &&
                invoiceAmount == other.invoiceAmount &&
                name == other.name &&
                proration == other.proration &&
                rateType == other.rateType &&
                recurrenceFrequency == other.recurrenceFrequency &&
                rolloverFraction == other.rolloverFraction &&
                specifiers == other.specifiers &&
                subscriptionConfig == other.subscriptionConfig &&
                temporaryId == other.temporaryId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessAmount,
                commitDuration,
                priority,
                productId,
                startingAtOffset,
                applicableProductIds,
                applicableProductTags,
                description,
                duration,
                invoiceAmount,
                name,
                proration,
                rateType,
                recurrenceFrequency,
                rolloverFraction,
                specifiers,
                subscriptionConfig,
                temporaryId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCommit{accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, productId=$productId, startingAtOffset=$startingAtOffset, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, duration=$duration, invoiceAmount=$invoiceAmount, name=$name, proration=$proration, rateType=$rateType, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    class RecurringCredit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessAmount: JsonField<AccessAmount>,
        private val commitDuration: JsonField<CommitDuration>,
        private val priority: JsonField<Double>,
        private val productId: JsonField<String>,
        private val startingAtOffset: JsonField<StartingAtOffset>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val description: JsonField<String>,
        private val duration: JsonField<Duration>,
        private val name: JsonField<String>,
        private val proration: JsonField<Proration>,
        private val rateType: JsonField<RateType>,
        private val recurrenceFrequency: JsonField<RecurrenceFrequency>,
        private val rolloverFraction: JsonField<Double>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val subscriptionConfig: JsonField<SubscriptionConfig>,
        private val temporaryId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_amount")
            @ExcludeMissing
            accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
            @JsonProperty("commit_duration")
            @ExcludeMissing
            commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_at_offset")
            @ExcludeMissing
            startingAtOffset: JsonField<StartingAtOffset> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Duration> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proration")
            @ExcludeMissing
            proration: JsonField<Proration> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("recurrence_frequency")
            @ExcludeMissing
            recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonProperty("subscription_config")
            @ExcludeMissing
            subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of(),
            @JsonProperty("temporary_id")
            @ExcludeMissing
            temporaryId: JsonField<String> = JsonMissing.of(),
        ) : this(
            accessAmount,
            commitDuration,
            priority,
            productId,
            startingAtOffset,
            applicableProductIds,
            applicableProductTags,
            description,
            duration,
            name,
            proration,
            rateType,
            recurrenceFrequency,
            rolloverFraction,
            specifiers,
            subscriptionConfig,
            temporaryId,
            mutableMapOf(),
        )

        /**
         * The amount of commit to grant.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Double = priority.getRequired("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Offset relative to the contract start date that determines the start time for the first
         * commit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAtOffset(): StartingAtOffset =
            startingAtOffset.getRequired("starting_at_offset")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Offset relative to the recurring credit start that determines when the contract will stop
         * creating recurring commits. optional
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun duration(): Optional<Duration> = duration.getOptional("duration")

        /**
         * displayed on invoices. will be passed through to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proration(): Optional<Proration> = proration.getOptional("proration")

        /**
         * Whether the created commits will use the commit rate or list rate
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * The frequency at which the recurring commits will be created. If not provided: - The
         * commits will be created on the usage invoice frequency. If provided: - The period defined
         * in the duration will correspond to this frequency. - Commits will be created aligned with
         * the recurring commit's starting_at rather than the usage invoice dates.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
            recurrenceFrequency.getOptional("recurrence_frequency")

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rolloverFraction(): Optional<Double> = rolloverFraction.getOptional("rollover_fraction")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * Attach a subscription to the recurring commit/credit.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionConfig(): Optional<SubscriptionConfig> =
            subscriptionConfig.getOptional("subscription_config")

        /**
         * A temporary ID that can be used to reference the recurring commit for commit specific
         * overrides.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun temporaryId(): Optional<String> = temporaryId.getOptional("temporary_id")

        /**
         * Returns the raw JSON value of [accessAmount].
         *
         * Unlike [accessAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_amount")
        @ExcludeMissing
        fun _accessAmount(): JsonField<AccessAmount> = accessAmount

        /**
         * Returns the raw JSON value of [commitDuration].
         *
         * Unlike [commitDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commit_duration")
        @ExcludeMissing
        fun _commitDuration(): JsonField<CommitDuration> = commitDuration

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [startingAtOffset].
         *
         * Unlike [startingAtOffset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_at_offset")
        @ExcludeMissing
        fun _startingAtOffset(): JsonField<StartingAtOffset> = startingAtOffset

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Duration> = duration

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [proration].
         *
         * Unlike [proration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [recurrenceFrequency].
         *
         * Unlike [recurrenceFrequency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        fun _recurrenceFrequency(): JsonField<RecurrenceFrequency> = recurrenceFrequency

        /**
         * Returns the raw JSON value of [rolloverFraction].
         *
         * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /**
         * Returns the raw JSON value of [subscriptionConfig].
         *
         * Unlike [subscriptionConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<SubscriptionConfig> = subscriptionConfig

        /**
         * Returns the raw JSON value of [temporaryId].
         *
         * Unlike [temporaryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [RecurringCredit].
             *
             * The following fields are required:
             * ```java
             * .accessAmount()
             * .commitDuration()
             * .priority()
             * .productId()
             * .startingAtOffset()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RecurringCredit]. */
        class Builder internal constructor() {

            private var accessAmount: JsonField<AccessAmount>? = null
            private var commitDuration: JsonField<CommitDuration>? = null
            private var priority: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var startingAtOffset: JsonField<StartingAtOffset>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Duration> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
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
                startingAtOffset = recurringCredit.startingAtOffset
                applicableProductIds =
                    recurringCredit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    recurringCredit.applicableProductTags.map { it.toMutableList() }
                description = recurringCredit.description
                duration = recurringCredit.duration
                name = recurringCredit.name
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

            /**
             * Sets [Builder.accessAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessAmount] with a well-typed [AccessAmount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.commitDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitDuration] with a well-typed [CommitDuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                this.commitDuration = commitDuration
            }

            /** Will be passed down to the individual commits */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Offset relative to the contract start date that determines the start time for the
             * first commit
             */
            fun startingAtOffset(startingAtOffset: StartingAtOffset) =
                startingAtOffset(JsonField.of(startingAtOffset))

            /**
             * Sets [Builder.startingAtOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAtOffset] with a well-typed
             * [StartingAtOffset] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun startingAtOffset(startingAtOffset: JsonField<StartingAtOffset>) = apply {
                this.startingAtOffset = startingAtOffset
            }

            /** Will be passed down to the individual commits */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
                    }
            }

            /** Will be passed down to the individual commits */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            /** Will be passed down to the individual commits */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Offset relative to the recurring credit start that determines when the contract will
             * stop creating recurring commits. optional
             */
            fun duration(duration: Duration) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Duration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

            /** displayed on invoices. will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(proration: Proration) = proration(JsonField.of(proration))

            /**
             * Sets [Builder.proration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proration] with a well-typed [Proration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proration(proration: JsonField<Proration>) = apply { this.proration = proration }

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.recurrenceFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurrenceFrequency] with a well-typed
             * [RecurrenceFrequency] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverFraction] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
                    }
            }

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(subscriptionConfig: SubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /**
             * Sets [Builder.subscriptionConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionConfig] with a well-typed
             * [SubscriptionConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun subscriptionConfig(subscriptionConfig: JsonField<SubscriptionConfig>) = apply {
                this.subscriptionConfig = subscriptionConfig
            }

            /**
             * A temporary ID that can be used to reference the recurring commit for commit specific
             * overrides.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * Sets [Builder.temporaryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temporaryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [RecurringCredit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accessAmount()
             * .commitDuration()
             * .priority()
             * .productId()
             * .startingAtOffset()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RecurringCredit =
                RecurringCredit(
                    checkRequired("accessAmount", accessAmount),
                    checkRequired("commitDuration", commitDuration),
                    checkRequired("priority", priority),
                    checkRequired("productId", productId),
                    checkRequired("startingAtOffset", startingAtOffset),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    duration,
                    name,
                    proration,
                    rateType,
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    temporaryId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RecurringCredit = apply {
            if (validated) {
                return@apply
            }

            accessAmount().validate()
            commitDuration().validate()
            priority()
            productId()
            startingAtOffset().validate()
            applicableProductIds()
            applicableProductTags()
            description()
            duration().ifPresent { it.validate() }
            name()
            proration().ifPresent { it.validate() }
            rateType().ifPresent { it.validate() }
            recurrenceFrequency().ifPresent { it.validate() }
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            temporaryId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accessAmount.asKnown().getOrNull()?.validity() ?: 0) +
                (commitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (startingAtOffset.asKnown().getOrNull()?.validity() ?: 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (duration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (proration.asKnown().getOrNull()?.validity() ?: 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (recurrenceFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (subscriptionConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (temporaryId.asKnown().isPresent) 1 else 0)

        /** The amount of commit to grant. */
        class AccessAmount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditTypeId: JsonField<String>,
            private val unitPrice: JsonField<Double>,
            private val quantity: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
            ) : this(creditTypeId, unitPrice, quantity, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unitPrice(): Double = unitPrice.getRequired("unit_price")

            /**
             * This field is required unless a subscription is attached via `subscription_config`.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Double> = quantity.getOptional("quantity")

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccessAmount].
                 *
                 * The following fields are required:
                 * ```java
                 * .creditTypeId()
                 * .unitPrice()
                 * ```
                 */
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

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

                /**
                 * This field is required unless a subscription is attached via
                 * `subscription_config`.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [AccessAmount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .creditTypeId()
                 * .unitPrice()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccessAmount =
                    AccessAmount(
                        checkRequired("creditTypeId", creditTypeId),
                        checkRequired("unitPrice", unitPrice),
                        quantity,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (unitPrice.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessAmount &&
                    creditTypeId == other.creditTypeId &&
                    unitPrice == other.unitPrice &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(creditTypeId, unitPrice, quantity, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessAmount{creditTypeId=$creditTypeId, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /**
         * Defines the length of the access schedule for each created commit/credit. The value
         * represents the number of units. Unit defaults to "PERIODS", where the length of a period
         * is determined by the recurrence_frequency.
         */
        class CommitDuration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val value: JsonField<Double>,
            private val unit: JsonField<Unit>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
            ) : this(value, unit, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Double = value.getRequired("value")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun unit(): Optional<Unit> = unit.getOptional("unit")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [CommitDuration].
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 */
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

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [CommitDuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CommitDuration =
                    CommitDuration(
                        checkRequired("value", value),
                        unit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CommitDuration = apply {
                if (validated) {
                    return@apply
                }

                value()
                unit().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (value.asKnown().isPresent) 1 else 0) +
                    (unit.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CommitDuration &&
                    value == other.value &&
                    unit == other.unit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(value, unit, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
        }

        /**
         * Offset relative to the contract start date that determines the start time for the first
         * commit
         */
        class StartingAtOffset
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [StartingAtOffset].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartingAtOffset]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(startingAtOffset: StartingAtOffset) = apply {
                    unit = startingAtOffset.unit
                    value = startingAtOffset.value
                    additionalProperties = startingAtOffset.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [StartingAtOffset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StartingAtOffset =
                    StartingAtOffset(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): StartingAtOffset = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartingAtOffset &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartingAtOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        /**
         * Offset relative to the recurring credit start that determines when the contract will stop
         * creating recurring commits. optional
         */
        class Duration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Duration].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Duration]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(duration: Duration) = apply {
                    unit = duration.unit
                    value = duration.value
                    additionalProperties = duration.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [Duration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Duration =
                    Duration(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Duration = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Duration &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Duration{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
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

            private var validated: Boolean = false

            fun validate(): Proration = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Proration && value == other.value
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

            private var validated: Boolean = false

            fun validate(): RateType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RateType && value == other.value
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

            private var validated: Boolean = false

            fun validate(): RecurrenceFrequency = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RecurrenceFrequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Attach a subscription to the recurring commit/credit. */
        class SubscriptionConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>,
            private val subscriptionId: JsonField<String>,
            private val allocation: JsonField<Allocation>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("apply_seat_increase_config")
                @ExcludeMissing
                applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("allocation")
                @ExcludeMissing
                allocation: JsonField<Allocation> = JsonMissing.of(),
            ) : this(applySeatIncreaseConfig, subscriptionId, allocation, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun applySeatIncreaseConfig(): ApplySeatIncreaseConfig =
                applySeatIncreaseConfig.getRequired("apply_seat_increase_config")

            /**
             * ID of the subscription to configure on the recurring commit/credit.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

            /**
             * If set to POOLED, allocation added per seat is pooled across the account. If set to
             * INDIVIDUAL, each seat in the subscription will have its own allocation.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allocation(): Optional<Allocation> = allocation.getOptional("allocation")

            /**
             * Returns the raw JSON value of [applySeatIncreaseConfig].
             *
             * Unlike [applySeatIncreaseConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("apply_seat_increase_config")
            @ExcludeMissing
            fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> =
                applySeatIncreaseConfig

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [allocation].
             *
             * Unlike [allocation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allocation")
            @ExcludeMissing
            fun _allocation(): JsonField<Allocation> = allocation

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SubscriptionConfig].
                 *
                 * The following fields are required:
                 * ```java
                 * .applySeatIncreaseConfig()
                 * .subscriptionId()
                 * ```
                 */
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

                /**
                 * Sets [Builder.applySeatIncreaseConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.applySeatIncreaseConfig] with a well-typed
                 * [ApplySeatIncreaseConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun applySeatIncreaseConfig(
                    applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>
                ) = apply { this.applySeatIncreaseConfig = applySeatIncreaseConfig }

                /** ID of the subscription to configure on the recurring commit/credit. */
                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /**
                 * If set to POOLED, allocation added per seat is pooled across the account. If set
                 * to INDIVIDUAL, each seat in the subscription will have its own allocation.
                 */
                fun allocation(allocation: Allocation) = allocation(JsonField.of(allocation))

                /**
                 * Sets [Builder.allocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allocation] with a well-typed [Allocation] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [SubscriptionConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .applySeatIncreaseConfig()
                 * .subscriptionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SubscriptionConfig =
                    SubscriptionConfig(
                        checkRequired("applySeatIncreaseConfig", applySeatIncreaseConfig),
                        checkRequired("subscriptionId", subscriptionId),
                        allocation,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SubscriptionConfig = apply {
                if (validated) {
                    return@apply
                }

                applySeatIncreaseConfig().validate()
                subscriptionId()
                allocation().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (applySeatIncreaseConfig.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown().isPresent) 1 else 0) +
                    (allocation.asKnown().getOrNull()?.validity() ?: 0)

            class ApplySeatIncreaseConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val isProrated: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("is_prorated")
                    @ExcludeMissing
                    isProrated: JsonField<Boolean> = JsonMissing.of()
                ) : this(isProrated, mutableMapOf())

                /**
                 * Indicates whether a mid-period seat increase should be prorated.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

                /**
                 * Returns the raw JSON value of [isProrated].
                 *
                 * Unlike [isProrated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_prorated")
                @ExcludeMissing
                fun _isProrated(): JsonField<Boolean> = isProrated

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [ApplySeatIncreaseConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .isProrated()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.isProrated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isProrated] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [ApplySeatIncreaseConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .isProrated()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ApplySeatIncreaseConfig =
                        ApplySeatIncreaseConfig(
                            checkRequired("isProrated", isProrated),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ApplySeatIncreaseConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    isProrated()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (isProrated.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ApplySeatIncreaseConfig &&
                        isProrated == other.isProrated &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }

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

                private var validated: Boolean = false

                fun validate(): Allocation = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Allocation && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SubscriptionConfig &&
                    applySeatIncreaseConfig == other.applySeatIncreaseConfig &&
                    subscriptionId == other.subscriptionId &&
                    allocation == other.allocation &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    applySeatIncreaseConfig,
                    subscriptionId,
                    allocation,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionConfig{applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, allocation=$allocation, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecurringCredit &&
                accessAmount == other.accessAmount &&
                commitDuration == other.commitDuration &&
                priority == other.priority &&
                productId == other.productId &&
                startingAtOffset == other.startingAtOffset &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                description == other.description &&
                duration == other.duration &&
                name == other.name &&
                proration == other.proration &&
                rateType == other.rateType &&
                recurrenceFrequency == other.recurrenceFrequency &&
                rolloverFraction == other.rolloverFraction &&
                specifiers == other.specifiers &&
                subscriptionConfig == other.subscriptionConfig &&
                temporaryId == other.temporaryId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessAmount,
                commitDuration,
                priority,
                productId,
                startingAtOffset,
                applicableProductIds,
                applicableProductTags,
                description,
                duration,
                name,
                proration,
                rateType,
                recurrenceFrequency,
                rolloverFraction,
                specifiers,
                subscriptionConfig,
                temporaryId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCredit{accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, productId=$productId, startingAtOffset=$startingAtOffset, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, duration=$duration, name=$name, proration=$proration, rateType=$rateType, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    class ScheduledCharge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val productId: JsonField<String>,
        private val schedule: JsonField<Schedule>,
        private val customFields: JsonField<CustomFields>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            schedule: JsonField<Schedule> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(productId, schedule, customFields, name, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Must provide schedule_items.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schedule(): Schedule = schedule.getRequired("schedule")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [schedule].
         *
         * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ScheduledCharge].
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .schedule()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScheduledCharge]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var schedule: JsonField<Schedule>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduledCharge: ScheduledCharge) = apply {
                productId = scheduledCharge.productId
                schedule = scheduledCharge.schedule
                customFields = scheduledCharge.customFields
                name = scheduledCharge.name
                additionalProperties = scheduledCharge.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Must provide schedule_items. */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /**
             * Sets [Builder.schedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schedule] with a well-typed [Schedule] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            /**
             * Returns an immutable instance of [ScheduledCharge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .schedule()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ScheduledCharge =
                ScheduledCharge(
                    checkRequired("productId", productId),
                    checkRequired("schedule", schedule),
                    customFields,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ScheduledCharge = apply {
            if (validated) {
                return@apply
            }

            productId()
            schedule().validate()
            customFields().ifPresent { it.validate() }
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (productId.asKnown().isPresent) 1 else 0) +
                (schedule.asKnown().getOrNull()?.validity() ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** Must provide schedule_items. */
        class Schedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val creditTypeId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
            ) : this(scheduleItems, creditTypeId, mutableMapOf())

            /**
             * Either provide amount or provide both unit_price and quantity.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /**
             * Defaults to USD (cents) if not passed.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Schedule].
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Schedule]. */
            class Builder internal constructor() {

                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    scheduleItems = schedule.scheduleItems.map { it.toMutableList() }
                    creditTypeId = schedule.creditTypeId
                    additionalProperties = schedule.additionalProperties.toMutableMap()
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Schedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Schedule =
                    Schedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Schedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0)

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val dateOffset: JsonField<DateOffset>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("date_offset")
                    @ExcludeMissing
                    dateOffset: JsonField<DateOffset> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(dateOffset, quantity, unitPrice, mutableMapOf())

                /**
                 * Date relative to the contract start date.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun dateOffset(): DateOffset = dateOffset.getRequired("date_offset")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the
                 * amount.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the
                 * amount.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                /**
                 * Returns the raw JSON value of [dateOffset].
                 *
                 * Unlike [dateOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("date_offset")
                @ExcludeMissing
                fun _dateOffset(): JsonField<DateOffset> = dateOffset

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .dateOffset()
                     * .quantity()
                     * .unitPrice()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var dateOffset: JsonField<DateOffset>? = null
                    private var quantity: JsonField<Double>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        dateOffset = scheduleItem.dateOffset
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** Date relative to the contract start date. */
                    fun dateOffset(dateOffset: DateOffset) = dateOffset(JsonField.of(dateOffset))

                    /**
                     * Sets [Builder.dateOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dateOffset] with a well-typed [DateOffset]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun dateOffset(dateOffset: JsonField<DateOffset>) = apply {
                        this.dateOffset = dateOffset
                    }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .dateOffset()
                     * .quantity()
                     * .unitPrice()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("dateOffset", dateOffset),
                            checkRequired("quantity", quantity),
                            checkRequired("unitPrice", unitPrice),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    dateOffset().validate()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (dateOffset.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                /** Date relative to the contract start date. */
                class DateOffset
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unit: JsonField<Unit>,
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of(),
                    ) : this(unit, value, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unit(): Unit = unit.getRequired("unit")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Long = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [DateOffset].
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DateOffset]. */
                    class Builder internal constructor() {

                        private var unit: JsonField<Unit>? = null
                        private var value: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(dateOffset: DateOffset) = apply {
                            unit = dateOffset.unit
                            value = dateOffset.value
                            additionalProperties = dateOffset.additionalProperties.toMutableMap()
                        }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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

                        /**
                         * Returns an immutable instance of [DateOffset].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .unit()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): DateOffset =
                            DateOffset(
                                checkRequired("unit", unit),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): DateOffset = apply {
                        if (validated) {
                            return@apply
                        }

                        unit().validate()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (unit.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Unit
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DAYS = of("DAYS")

                            @JvmField val WEEKS = of("WEEKS")

                            @JvmField val MONTHS = of("MONTHS")

                            @JvmField val YEARS = of("YEARS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                        }

                        /**
                         * An enum containing [Unit]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Unit] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DAYS,
                            WEEKS,
                            MONTHS,
                            YEARS,
                            /**
                             * An enum member indicating that [Unit] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                DAYS -> Value.DAYS
                                WEEKS -> Value.WEEKS
                                MONTHS -> Value.MONTHS
                                YEARS -> Value.YEARS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                DAYS -> Known.DAYS
                                WEEKS -> Known.WEEKS
                                MONTHS -> Known.MONTHS
                                YEARS -> Known.YEARS
                                else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Unit = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: MetronomeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Unit && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DateOffset &&
                            unit == other.unit &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(unit, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DateOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        dateOffset == other.dateOffset &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(dateOffset, quantity, unitPrice, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{dateOffset=$dateOffset, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Schedule &&
                    scheduleItems == other.scheduleItems &&
                    creditTypeId == other.creditTypeId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(scheduleItems, creditTypeId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScheduledCharge &&
                productId == other.productId &&
                schedule == other.schedule &&
                customFields == other.customFields &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(productId, schedule, customFields, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduledCharge{productId=$productId, schedule=$schedule, customFields=$customFields, name=$name, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

        fun validate(): ScheduledChargesOnUsageInvoices = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScheduledChargesOnUsageInvoices && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Subscription
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val collectionSchedule: JsonField<CollectionSchedule>,
        private val proration: JsonField<Proration>,
        private val subscriptionRate: JsonField<SubscriptionRate>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val duration: JsonField<Duration>,
        private val initialQuantity: JsonField<Double>,
        private val name: JsonField<String>,
        private val quantityManagementMode: JsonField<QuantityManagementMode>,
        private val seatConfig: JsonField<SeatConfig>,
        private val startingAtOffset: JsonField<StartingAtOffset>,
        private val temporaryId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("collection_schedule")
            @ExcludeMissing
            collectionSchedule: JsonField<CollectionSchedule> = JsonMissing.of(),
            @JsonProperty("proration")
            @ExcludeMissing
            proration: JsonField<Proration> = JsonMissing.of(),
            @JsonProperty("subscription_rate")
            @ExcludeMissing
            subscriptionRate: JsonField<SubscriptionRate> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Duration> = JsonMissing.of(),
            @JsonProperty("initial_quantity")
            @ExcludeMissing
            initialQuantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity_management_mode")
            @ExcludeMissing
            quantityManagementMode: JsonField<QuantityManagementMode> = JsonMissing.of(),
            @JsonProperty("seat_config")
            @ExcludeMissing
            seatConfig: JsonField<SeatConfig> = JsonMissing.of(),
            @JsonProperty("starting_at_offset")
            @ExcludeMissing
            startingAtOffset: JsonField<StartingAtOffset> = JsonMissing.of(),
            @JsonProperty("temporary_id")
            @ExcludeMissing
            temporaryId: JsonField<String> = JsonMissing.of(),
        ) : this(
            collectionSchedule,
            proration,
            subscriptionRate,
            customFields,
            description,
            duration,
            initialQuantity,
            name,
            quantityManagementMode,
            seatConfig,
            startingAtOffset,
            temporaryId,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun collectionSchedule(): CollectionSchedule =
            collectionSchedule.getRequired("collection_schedule")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun proration(): Proration = proration.getRequired("proration")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionRate(): SubscriptionRate = subscriptionRate.getRequired("subscription_rate")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Lifetime of the subscription from its start. If not provided, subscription inherits
         * contract end date.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun duration(): Optional<Duration> = duration.getOptional("duration")

        /**
         * The initial quantity for the subscription. It must be non-negative value. Required if
         * quantity_management_mode is QUANTITY_ONLY.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun initialQuantity(): Optional<Double> = initialQuantity.getOptional("initial_quantity")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
         * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
         * `initial_quantity` must be provided with this option. Compatible with recurring
         * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
         * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
         * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
         * subscription to use a linked recurring credit with an allocation per seat. `seat_config`
         * must be provided with this option.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantityManagementMode(): Optional<QuantityManagementMode> =
            quantityManagementMode.getOptional("quantity_management_mode")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun seatConfig(): Optional<SeatConfig> = seatConfig.getOptional("seat_config")

        /**
         * Relative date from contract start date corresponding to the inclusive start time for the
         * subscription. If not provided, defaults to contract start date
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAtOffset(): Optional<StartingAtOffset> =
            startingAtOffset.getOptional("starting_at_offset")

        /**
         * A temporary ID used to reference the subscription in recurring commit/credit subscription
         * configs created within the same payload.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun temporaryId(): Optional<String> = temporaryId.getOptional("temporary_id")

        /**
         * Returns the raw JSON value of [collectionSchedule].
         *
         * Unlike [collectionSchedule], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("collection_schedule")
        @ExcludeMissing
        fun _collectionSchedule(): JsonField<CollectionSchedule> = collectionSchedule

        /**
         * Returns the raw JSON value of [proration].
         *
         * Unlike [proration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

        /**
         * Returns the raw JSON value of [subscriptionRate].
         *
         * Unlike [subscriptionRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_rate")
        @ExcludeMissing
        fun _subscriptionRate(): JsonField<SubscriptionRate> = subscriptionRate

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Duration> = duration

        /**
         * Returns the raw JSON value of [initialQuantity].
         *
         * Unlike [initialQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initial_quantity")
        @ExcludeMissing
        fun _initialQuantity(): JsonField<Double> = initialQuantity

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [quantityManagementMode].
         *
         * Unlike [quantityManagementMode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("quantity_management_mode")
        @ExcludeMissing
        fun _quantityManagementMode(): JsonField<QuantityManagementMode> = quantityManagementMode

        /**
         * Returns the raw JSON value of [seatConfig].
         *
         * Unlike [seatConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seat_config")
        @ExcludeMissing
        fun _seatConfig(): JsonField<SeatConfig> = seatConfig

        /**
         * Returns the raw JSON value of [startingAtOffset].
         *
         * Unlike [startingAtOffset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_at_offset")
        @ExcludeMissing
        fun _startingAtOffset(): JsonField<StartingAtOffset> = startingAtOffset

        /**
         * Returns the raw JSON value of [temporaryId].
         *
         * Unlike [temporaryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Subscription].
             *
             * The following fields are required:
             * ```java
             * .collectionSchedule()
             * .proration()
             * .subscriptionRate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Subscription]. */
        class Builder internal constructor() {

            private var collectionSchedule: JsonField<CollectionSchedule>? = null
            private var proration: JsonField<Proration>? = null
            private var subscriptionRate: JsonField<SubscriptionRate>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Duration> = JsonMissing.of()
            private var initialQuantity: JsonField<Double> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var quantityManagementMode: JsonField<QuantityManagementMode> = JsonMissing.of()
            private var seatConfig: JsonField<SeatConfig> = JsonMissing.of()
            private var startingAtOffset: JsonField<StartingAtOffset> = JsonMissing.of()
            private var temporaryId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscription: Subscription) = apply {
                collectionSchedule = subscription.collectionSchedule
                proration = subscription.proration
                subscriptionRate = subscription.subscriptionRate
                customFields = subscription.customFields
                description = subscription.description
                duration = subscription.duration
                initialQuantity = subscription.initialQuantity
                name = subscription.name
                quantityManagementMode = subscription.quantityManagementMode
                seatConfig = subscription.seatConfig
                startingAtOffset = subscription.startingAtOffset
                temporaryId = subscription.temporaryId
                additionalProperties = subscription.additionalProperties.toMutableMap()
            }

            fun collectionSchedule(collectionSchedule: CollectionSchedule) =
                collectionSchedule(JsonField.of(collectionSchedule))

            /**
             * Sets [Builder.collectionSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionSchedule] with a well-typed
             * [CollectionSchedule] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun collectionSchedule(collectionSchedule: JsonField<CollectionSchedule>) = apply {
                this.collectionSchedule = collectionSchedule
            }

            fun proration(proration: Proration) = proration(JsonField.of(proration))

            /**
             * Sets [Builder.proration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proration] with a well-typed [Proration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proration(proration: JsonField<Proration>) = apply { this.proration = proration }

            fun subscriptionRate(subscriptionRate: SubscriptionRate) =
                subscriptionRate(JsonField.of(subscriptionRate))

            /**
             * Sets [Builder.subscriptionRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionRate] with a well-typed
             * [SubscriptionRate] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun subscriptionRate(subscriptionRate: JsonField<SubscriptionRate>) = apply {
                this.subscriptionRate = subscriptionRate
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Lifetime of the subscription from its start. If not provided, subscription inherits
             * contract end date.
             */
            fun duration(duration: Duration) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Duration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

            /**
             * The initial quantity for the subscription. It must be non-negative value. Required if
             * quantity_management_mode is QUANTITY_ONLY.
             */
            fun initialQuantity(initialQuantity: Double) =
                initialQuantity(JsonField.of(initialQuantity))

            /**
             * Sets [Builder.initialQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialQuantity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initialQuantity(initialQuantity: JsonField<Double>) = apply {
                this.initialQuantity = initialQuantity
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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
             * Sets [Builder.quantityManagementMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantityManagementMode] with a well-typed
             * [QuantityManagementMode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun quantityManagementMode(quantityManagementMode: JsonField<QuantityManagementMode>) =
                apply {
                    this.quantityManagementMode = quantityManagementMode
                }

            fun seatConfig(seatConfig: SeatConfig) = seatConfig(JsonField.of(seatConfig))

            /**
             * Sets [Builder.seatConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatConfig] with a well-typed [SeatConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seatConfig(seatConfig: JsonField<SeatConfig>) = apply {
                this.seatConfig = seatConfig
            }

            /**
             * Relative date from contract start date corresponding to the inclusive start time for
             * the subscription. If not provided, defaults to contract start date
             */
            fun startingAtOffset(startingAtOffset: StartingAtOffset) =
                startingAtOffset(JsonField.of(startingAtOffset))

            /**
             * Sets [Builder.startingAtOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAtOffset] with a well-typed
             * [StartingAtOffset] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun startingAtOffset(startingAtOffset: JsonField<StartingAtOffset>) = apply {
                this.startingAtOffset = startingAtOffset
            }

            /**
             * A temporary ID used to reference the subscription in recurring commit/credit
             * subscription configs created within the same payload.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * Sets [Builder.temporaryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temporaryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Subscription].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .collectionSchedule()
             * .proration()
             * .subscriptionRate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Subscription =
                Subscription(
                    checkRequired("collectionSchedule", collectionSchedule),
                    checkRequired("proration", proration),
                    checkRequired("subscriptionRate", subscriptionRate),
                    customFields,
                    description,
                    duration,
                    initialQuantity,
                    name,
                    quantityManagementMode,
                    seatConfig,
                    startingAtOffset,
                    temporaryId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (validated) {
                return@apply
            }

            collectionSchedule().validate()
            proration().validate()
            subscriptionRate().validate()
            customFields().ifPresent { it.validate() }
            description()
            duration().ifPresent { it.validate() }
            initialQuantity()
            name()
            quantityManagementMode().ifPresent { it.validate() }
            seatConfig().ifPresent { it.validate() }
            startingAtOffset().ifPresent { it.validate() }
            temporaryId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (collectionSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (proration.asKnown().getOrNull()?.validity() ?: 0) +
                (subscriptionRate.asKnown().getOrNull()?.validity() ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (duration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (initialQuantity.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (quantityManagementMode.asKnown().getOrNull()?.validity() ?: 0) +
                (seatConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (startingAtOffset.asKnown().getOrNull()?.validity() ?: 0) +
                (if (temporaryId.asKnown().isPresent) 1 else 0)

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

            private var validated: Boolean = false

            fun validate(): CollectionSchedule = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CollectionSchedule && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Proration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val invoiceBehavior: JsonField<InvoiceBehavior>,
            private val isProrated: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("invoice_behavior")
                @ExcludeMissing
                invoiceBehavior: JsonField<InvoiceBehavior> = JsonMissing.of(),
                @JsonProperty("is_prorated")
                @ExcludeMissing
                isProrated: JsonField<Boolean> = JsonMissing.of(),
            ) : this(invoiceBehavior, isProrated, mutableMapOf())

            /**
             * Indicates how mid-period quantity adjustments are invoiced. **BILL_IMMEDIATELY**:
             * Only available when collection schedule is `ADVANCE`. The quantity increase will be
             * billed immediately on the scheduled date. **BILL_ON_NEXT_COLLECTION_DATE**: The
             * quantity increase will be billed for in-arrears at the end of the period.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun invoiceBehavior(): Optional<InvoiceBehavior> =
                invoiceBehavior.getOptional("invoice_behavior")

            /**
             * Indicates if the partial period will be prorated or charged a full amount.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun isProrated(): Optional<Boolean> = isProrated.getOptional("is_prorated")

            /**
             * Returns the raw JSON value of [invoiceBehavior].
             *
             * Unlike [invoiceBehavior], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_behavior")
            @ExcludeMissing
            fun _invoiceBehavior(): JsonField<InvoiceBehavior> = invoiceBehavior

            /**
             * Returns the raw JSON value of [isProrated].
             *
             * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun _isProrated(): JsonField<Boolean> = isProrated

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Proration]. */
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
                 * Sets [Builder.invoiceBehavior] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceBehavior] with a well-typed
                 * [InvoiceBehavior] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun invoiceBehavior(invoiceBehavior: JsonField<InvoiceBehavior>) = apply {
                    this.invoiceBehavior = invoiceBehavior
                }

                /** Indicates if the partial period will be prorated or charged a full amount. */
                fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                /**
                 * Sets [Builder.isProrated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isProrated] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Proration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Proration =
                    Proration(invoiceBehavior, isProrated, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Proration = apply {
                if (validated) {
                    return@apply
                }

                invoiceBehavior().ifPresent { it.validate() }
                isProrated()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (invoiceBehavior.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (isProrated.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                fun validate(): InvoiceBehavior = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InvoiceBehavior && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Proration &&
                    invoiceBehavior == other.invoiceBehavior &&
                    isProrated == other.isProrated &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(invoiceBehavior, isProrated, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Proration{invoiceBehavior=$invoiceBehavior, isProrated=$isProrated, additionalProperties=$additionalProperties}"
        }

        class SubscriptionRate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingFrequency: JsonField<BillingFrequency>,
            private val productId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billing_frequency")
                @ExcludeMissing
                billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
            ) : this(billingFrequency, productId, mutableMapOf())

            /**
             * Frequency to bill subscription with. Together with product_id, must match existing
             * rate on the rate card.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billingFrequency(): BillingFrequency =
                billingFrequency.getRequired("billing_frequency")

            /**
             * Must be subscription type product
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun productId(): String = productId.getRequired("product_id")

            /**
             * Returns the raw JSON value of [billingFrequency].
             *
             * Unlike [billingFrequency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

            /**
             * Returns the raw JSON value of [productId].
             *
             * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SubscriptionRate].
                 *
                 * The following fields are required:
                 * ```java
                 * .billingFrequency()
                 * .productId()
                 * ```
                 */
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
                 * Sets [Builder.billingFrequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingFrequency] with a well-typed
                 * [BillingFrequency] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                    this.billingFrequency = billingFrequency
                }

                /** Must be subscription type product */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [SubscriptionRate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .billingFrequency()
                 * .productId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SubscriptionRate =
                    SubscriptionRate(
                        checkRequired("billingFrequency", billingFrequency),
                        checkRequired("productId", productId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SubscriptionRate = apply {
                if (validated) {
                    return@apply
                }

                billingFrequency().validate()
                productId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (productId.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                fun validate(): BillingFrequency = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BillingFrequency && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SubscriptionRate &&
                    billingFrequency == other.billingFrequency &&
                    productId == other.productId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(billingFrequency, productId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionRate{billingFrequency=$billingFrequency, productId=$productId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Lifetime of the subscription from its start. If not provided, subscription inherits
         * contract end date.
         */
        class Duration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Duration].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Duration]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(duration: Duration) = apply {
                    unit = duration.unit
                    value = duration.value
                    additionalProperties = duration.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [Duration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Duration =
                    Duration(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Duration = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Duration &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Duration{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
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

            private var validated: Boolean = false

            fun validate(): QuantityManagementMode = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is QuantityManagementMode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class SeatConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val seatGroupKey: JsonField<String>,
            private val initialUnassignedSeats: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("seat_group_key")
                @ExcludeMissing
                seatGroupKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("initial_unassigned_seats")
                @ExcludeMissing
                initialUnassignedSeats: JsonField<Double> = JsonMissing.of(),
            ) : this(seatGroupKey, initialUnassignedSeats, mutableMapOf())

            /**
             * The property name, sent on usage events, that identifies the seat ID associated with
             * the usage event. For example, the property name might be seat_id or user_id. The
             * property must be set as a group key on billable metrics and a presentation/pricing
             * group key on contract products. This allows linked recurring credits with an
             * allocation per seat to be consumed by only one seat's usage.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun seatGroupKey(): String = seatGroupKey.getRequired("seat_group_key")

            /**
             * The initial amount of unassigned seats on this subscription.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun initialUnassignedSeats(): Optional<Double> =
                initialUnassignedSeats.getOptional("initial_unassigned_seats")

            /**
             * Returns the raw JSON value of [seatGroupKey].
             *
             * Unlike [seatGroupKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("seat_group_key")
            @ExcludeMissing
            fun _seatGroupKey(): JsonField<String> = seatGroupKey

            /**
             * Returns the raw JSON value of [initialUnassignedSeats].
             *
             * Unlike [initialUnassignedSeats], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("initial_unassigned_seats")
            @ExcludeMissing
            fun _initialUnassignedSeats(): JsonField<Double> = initialUnassignedSeats

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SeatConfig].
                 *
                 * The following fields are required:
                 * ```java
                 * .seatGroupKey()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SeatConfig]. */
            class Builder internal constructor() {

                private var seatGroupKey: JsonField<String>? = null
                private var initialUnassignedSeats: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(seatConfig: SeatConfig) = apply {
                    seatGroupKey = seatConfig.seatGroupKey
                    initialUnassignedSeats = seatConfig.initialUnassignedSeats
                    additionalProperties = seatConfig.additionalProperties.toMutableMap()
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
                 * Sets [Builder.seatGroupKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seatGroupKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun seatGroupKey(seatGroupKey: JsonField<String>) = apply {
                    this.seatGroupKey = seatGroupKey
                }

                /** The initial amount of unassigned seats on this subscription. */
                fun initialUnassignedSeats(initialUnassignedSeats: Double) =
                    initialUnassignedSeats(JsonField.of(initialUnassignedSeats))

                /**
                 * Sets [Builder.initialUnassignedSeats] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.initialUnassignedSeats] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [SeatConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .seatGroupKey()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SeatConfig =
                    SeatConfig(
                        checkRequired("seatGroupKey", seatGroupKey),
                        initialUnassignedSeats,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SeatConfig = apply {
                if (validated) {
                    return@apply
                }

                seatGroupKey()
                initialUnassignedSeats()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (seatGroupKey.asKnown().isPresent) 1 else 0) +
                    (if (initialUnassignedSeats.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SeatConfig &&
                    seatGroupKey == other.seatGroupKey &&
                    initialUnassignedSeats == other.initialUnassignedSeats &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(seatGroupKey, initialUnassignedSeats, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SeatConfig{seatGroupKey=$seatGroupKey, initialUnassignedSeats=$initialUnassignedSeats, additionalProperties=$additionalProperties}"
        }

        /**
         * Relative date from contract start date corresponding to the inclusive start time for the
         * subscription. If not provided, defaults to contract start date
         */
        class StartingAtOffset
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [StartingAtOffset].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartingAtOffset]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(startingAtOffset: StartingAtOffset) = apply {
                    unit = startingAtOffset.unit
                    value = startingAtOffset.value
                    additionalProperties = startingAtOffset.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [StartingAtOffset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StartingAtOffset =
                    StartingAtOffset(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): StartingAtOffset = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartingAtOffset &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartingAtOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Subscription &&
                collectionSchedule == other.collectionSchedule &&
                proration == other.proration &&
                subscriptionRate == other.subscriptionRate &&
                customFields == other.customFields &&
                description == other.description &&
                duration == other.duration &&
                initialQuantity == other.initialQuantity &&
                name == other.name &&
                quantityManagementMode == other.quantityManagementMode &&
                seatConfig == other.seatConfig &&
                startingAtOffset == other.startingAtOffset &&
                temporaryId == other.temporaryId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                collectionSchedule,
                proration,
                subscriptionRate,
                customFields,
                description,
                duration,
                initialQuantity,
                name,
                quantityManagementMode,
                seatConfig,
                startingAtOffset,
                temporaryId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Subscription{collectionSchedule=$collectionSchedule, proration=$proration, subscriptionRate=$subscriptionRate, customFields=$customFields, description=$description, duration=$duration, initialQuantity=$initialQuantity, name=$name, quantityManagementMode=$quantityManagementMode, seatConfig=$seatConfig, startingAtOffset=$startingAtOffset, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    class UsageStatementSchedule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val frequency: JsonField<Frequency>,
        private val day: JsonField<Day>,
        private val invoiceGenerationStartingAtOffset: JsonField<InvoiceGenerationStartingAtOffset>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("frequency")
            @ExcludeMissing
            frequency: JsonField<Frequency> = JsonMissing.of(),
            @JsonProperty("day") @ExcludeMissing day: JsonField<Day> = JsonMissing.of(),
            @JsonProperty("invoice_generation_starting_at_offset")
            @ExcludeMissing
            invoiceGenerationStartingAtOffset: JsonField<InvoiceGenerationStartingAtOffset> =
                JsonMissing.of(),
        ) : this(frequency, day, invoiceGenerationStartingAtOffset, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frequency(): Frequency = frequency.getRequired("frequency")

        /**
         * If not provided, defaults to the first day of the month.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun day(): Optional<Day> = day.getOptional("day")

        /**
         * The offset at which Metronome should start generating usage invoices, relative to the
         * contract start date. If unspecified, contract start date will be used. This is useful to
         * set if you want to import historical invoices via our 'Create Historical Invoices' API
         * rather than having Metronome automatically generate them.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceGenerationStartingAtOffset(): Optional<InvoiceGenerationStartingAtOffset> =
            invoiceGenerationStartingAtOffset.getOptional("invoice_generation_starting_at_offset")

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<Frequency> = frequency

        /**
         * Returns the raw JSON value of [day].
         *
         * Unlike [day], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Day> = day

        /**
         * Returns the raw JSON value of [invoiceGenerationStartingAtOffset].
         *
         * Unlike [invoiceGenerationStartingAtOffset], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("invoice_generation_starting_at_offset")
        @ExcludeMissing
        fun _invoiceGenerationStartingAtOffset(): JsonField<InvoiceGenerationStartingAtOffset> =
            invoiceGenerationStartingAtOffset

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [UsageStatementSchedule].
             *
             * The following fields are required:
             * ```java
             * .frequency()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UsageStatementSchedule]. */
        class Builder internal constructor() {

            private var frequency: JsonField<Frequency>? = null
            private var day: JsonField<Day> = JsonMissing.of()
            private var invoiceGenerationStartingAtOffset:
                JsonField<InvoiceGenerationStartingAtOffset> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageStatementSchedule: UsageStatementSchedule) = apply {
                frequency = usageStatementSchedule.frequency
                day = usageStatementSchedule.day
                invoiceGenerationStartingAtOffset =
                    usageStatementSchedule.invoiceGenerationStartingAtOffset
                additionalProperties = usageStatementSchedule.additionalProperties.toMutableMap()
            }

            fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

            /**
             * Sets [Builder.frequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequency] with a well-typed [Frequency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

            /** If not provided, defaults to the first day of the month. */
            fun day(day: Day) = day(JsonField.of(day))

            /**
             * Sets [Builder.day] to an arbitrary JSON value.
             *
             * You should usually call [Builder.day] with a well-typed [Day] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun day(day: JsonField<Day>) = apply { this.day = day }

            /**
             * The offset at which Metronome should start generating usage invoices, relative to the
             * contract start date. If unspecified, contract start date will be used. This is useful
             * to set if you want to import historical invoices via our 'Create Historical Invoices'
             * API rather than having Metronome automatically generate them.
             */
            fun invoiceGenerationStartingAtOffset(
                invoiceGenerationStartingAtOffset: InvoiceGenerationStartingAtOffset
            ) = invoiceGenerationStartingAtOffset(JsonField.of(invoiceGenerationStartingAtOffset))

            /**
             * Sets [Builder.invoiceGenerationStartingAtOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceGenerationStartingAtOffset] with a well-typed
             * [InvoiceGenerationStartingAtOffset] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun invoiceGenerationStartingAtOffset(
                invoiceGenerationStartingAtOffset: JsonField<InvoiceGenerationStartingAtOffset>
            ) = apply { this.invoiceGenerationStartingAtOffset = invoiceGenerationStartingAtOffset }

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

            /**
             * Returns an immutable instance of [UsageStatementSchedule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .frequency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UsageStatementSchedule =
                UsageStatementSchedule(
                    checkRequired("frequency", frequency),
                    day,
                    invoiceGenerationStartingAtOffset,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UsageStatementSchedule = apply {
            if (validated) {
                return@apply
            }

            frequency().validate()
            day().ifPresent { it.validate() }
            invoiceGenerationStartingAtOffset().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                (day.asKnown().getOrNull()?.validity() ?: 0) +
                (invoiceGenerationStartingAtOffset.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): Frequency = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Frequency && value == other.value
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

                @JvmStatic fun of(value: String) = Day(JsonField.of(value))
            }

            /** An enum containing [Day]'s known values. */
            enum class Known {
                FIRST_OF_MONTH,
                CONTRACT_START,
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

            private var validated: Boolean = false

            fun validate(): Day = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Day && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The offset at which Metronome should start generating usage invoices, relative to the
         * contract start date. If unspecified, contract start date will be used. This is useful to
         * set if you want to import historical invoices via our 'Create Historical Invoices' API
         * rather than having Metronome automatically generate them.
         */
        class InvoiceGenerationStartingAtOffset
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Long = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [InvoiceGenerationStartingAtOffset].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceGenerationStartingAtOffset]. */
            class Builder internal constructor() {

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    invoiceGenerationStartingAtOffset: InvoiceGenerationStartingAtOffset
                ) = apply {
                    unit = invoiceGenerationStartingAtOffset.unit
                    value = invoiceGenerationStartingAtOffset.value
                    additionalProperties =
                        invoiceGenerationStartingAtOffset.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

                fun value(value: Long) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [InvoiceGenerationStartingAtOffset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InvoiceGenerationStartingAtOffset =
                    InvoiceGenerationStartingAtOffset(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InvoiceGenerationStartingAtOffset = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                    @JvmField val DAYS = of("DAYS")

                    @JvmField val WEEKS = of("WEEKS")

                    @JvmField val MONTHS = of("MONTHS")

                    @JvmField val YEARS = of("YEARS")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                    DAYS,
                    WEEKS,
                    MONTHS,
                    YEARS,
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
                        DAYS -> Value.DAYS
                        WEEKS -> Value.WEEKS
                        MONTHS -> Value.MONTHS
                        YEARS -> Value.YEARS
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
                        DAYS -> Known.DAYS
                        WEEKS -> Known.WEEKS
                        MONTHS -> Known.MONTHS
                        YEARS -> Known.YEARS
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

                private var validated: Boolean = false

                fun validate(): Unit = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InvoiceGenerationStartingAtOffset &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceGenerationStartingAtOffset{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageStatementSchedule &&
                frequency == other.frequency &&
                day == other.day &&
                invoiceGenerationStartingAtOffset == other.invoiceGenerationStartingAtOffset &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(frequency, day, invoiceGenerationStartingAtOffset, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageStatementSchedule{frequency=$frequency, day=$day, invoiceGenerationStartingAtOffset=$invoiceGenerationStartingAtOffset, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PackageCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PackageCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
