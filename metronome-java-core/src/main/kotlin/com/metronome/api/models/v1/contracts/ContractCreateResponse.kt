// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.Commit
import com.metronome.api.models.CommitHierarchyConfiguration
import com.metronome.api.models.CommitSpecifier
import com.metronome.api.models.Credit
import com.metronome.api.models.HierarchyConfiguration
import com.metronome.api.models.Override
import com.metronome.api.models.PrepaidBalanceThresholdConfiguration
import com.metronome.api.models.RecurringCommitSubscriptionConfig
import com.metronome.api.models.ScheduledCharge
import com.metronome.api.models.SpendThresholdConfiguration
import com.metronome.api.models.Subscription
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContractCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [ContractCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractCreateResponse: ContractCreateResponse) = apply {
            data = contractCreateResponse.data
            additionalProperties = contractCreateResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [ContractCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractCreateResponse =
            ContractCreateResponse(checkRequired("data", data), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ContractCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val contract: JsonField<Contract>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contract")
            @ExcludeMissing
            contract: JsonField<Contract> = JsonMissing.of(),
        ) : this(id, contract, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The created contract.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contract(): Optional<Contract> = contract.getOptional("contract")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [contract].
         *
         * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var contract: JsonField<Contract> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                contract = data.contract
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The created contract. */
            fun contract(contract: Contract) = contract(JsonField.of(contract))

            /**
             * Sets [Builder.contract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contract] with a well-typed [Contract] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(checkRequired("id", id), contract, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            contract().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (contract.asKnown().getOrNull()?.validity() ?: 0)

        /** The created contract. */
        class Contract
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val commits: JsonField<List<Commit>>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val customerId: JsonField<String>,
            private val overrides: JsonField<List<Override>>,
            private val scheduledCharges: JsonField<List<ScheduledCharge>>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val transitions: JsonField<List<Transition>>,
            private val usageFilter: JsonField<List<UsageFilter>>,
            private val usageStatementSchedule: JsonField<UsageStatementSchedule>,
            private val credits: JsonField<List<Credit>>,
            private val customFields: JsonField<CustomFields>,
            private val customerBillingProviderConfiguration:
                JsonField<CustomerBillingProviderConfiguration>,
            private val endingBefore: JsonField<OffsetDateTime>,
            private val hasMore: JsonField<HasMore>,
            private val hierarchyConfiguration: JsonField<HierarchyConfiguration>,
            private val multiplierOverridePrioritization:
                JsonField<MultiplierOverridePrioritization>,
            private val name: JsonField<String>,
            private val netPaymentTermsDays: JsonField<Double>,
            private val packageId: JsonField<String>,
            private val prepaidBalanceThresholdConfiguration:
                JsonField<PrepaidBalanceThresholdConfiguration>,
            private val rateCardId: JsonField<String>,
            private val recurringCommits: JsonField<List<RecurringCommit>>,
            private val recurringCredits: JsonField<List<RecurringCredit>>,
            private val scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>,
            private val spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>,
            private val subscriptions: JsonField<List<Subscription>>,
            private val uniquenessKey: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("commits")
                @ExcludeMissing
                commits: JsonField<List<Commit>> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_by")
                @ExcludeMissing
                createdBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("overrides")
                @ExcludeMissing
                overrides: JsonField<List<Override>> = JsonMissing.of(),
                @JsonProperty("scheduled_charges")
                @ExcludeMissing
                scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("transitions")
                @ExcludeMissing
                transitions: JsonField<List<Transition>> = JsonMissing.of(),
                @JsonProperty("usage_filter")
                @ExcludeMissing
                usageFilter: JsonField<List<UsageFilter>> = JsonMissing.of(),
                @JsonProperty("usage_statement_schedule")
                @ExcludeMissing
                usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of(),
                @JsonProperty("credits")
                @ExcludeMissing
                credits: JsonField<List<Credit>> = JsonMissing.of(),
                @JsonProperty("custom_fields")
                @ExcludeMissing
                customFields: JsonField<CustomFields> = JsonMissing.of(),
                @JsonProperty("customer_billing_provider_configuration")
                @ExcludeMissing
                customerBillingProviderConfiguration:
                    JsonField<CustomerBillingProviderConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("has_more")
                @ExcludeMissing
                hasMore: JsonField<HasMore> = JsonMissing.of(),
                @JsonProperty("hierarchy_configuration")
                @ExcludeMissing
                hierarchyConfiguration: JsonField<HierarchyConfiguration> = JsonMissing.of(),
                @JsonProperty("multiplier_override_prioritization")
                @ExcludeMissing
                multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization> =
                    JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("net_payment_terms_days")
                @ExcludeMissing
                netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("package_id")
                @ExcludeMissing
                packageId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prepaid_balance_threshold_configuration")
                @ExcludeMissing
                prepaidBalanceThresholdConfiguration:
                    JsonField<PrepaidBalanceThresholdConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("rate_card_id")
                @ExcludeMissing
                rateCardId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("recurring_commits")
                @ExcludeMissing
                recurringCommits: JsonField<List<RecurringCommit>> = JsonMissing.of(),
                @JsonProperty("recurring_credits")
                @ExcludeMissing
                recurringCredits: JsonField<List<RecurringCredit>> = JsonMissing.of(),
                @JsonProperty("scheduled_charges_on_usage_invoices")
                @ExcludeMissing
                scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
                    JsonMissing.of(),
                @JsonProperty("spend_threshold_configuration")
                @ExcludeMissing
                spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("subscriptions")
                @ExcludeMissing
                subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
                @JsonProperty("uniqueness_key")
                @ExcludeMissing
                uniquenessKey: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                commits,
                createdAt,
                createdBy,
                customerId,
                overrides,
                scheduledCharges,
                startingAt,
                transitions,
                usageFilter,
                usageStatementSchedule,
                credits,
                customFields,
                customerBillingProviderConfiguration,
                endingBefore,
                hasMore,
                hierarchyConfiguration,
                multiplierOverridePrioritization,
                name,
                netPaymentTermsDays,
                packageId,
                prepaidBalanceThresholdConfiguration,
                rateCardId,
                recurringCommits,
                recurringCredits,
                scheduledChargesOnUsageInvoices,
                spendThresholdConfiguration,
                subscriptions,
                uniquenessKey,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun commits(): List<Commit> = commits.getRequired("commits")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdBy(): String = createdBy.getRequired("created_by")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun overrides(): List<Override> = overrides.getRequired("overrides")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduledCharges(): List<ScheduledCharge> =
                scheduledCharges.getRequired("scheduled_charges")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transitions(): List<Transition> = transitions.getRequired("transitions")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageFilter(): List<UsageFilter> = usageFilter.getRequired("usage_filter")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageStatementSchedule(): UsageStatementSchedule =
                usageStatementSchedule.getRequired("usage_statement_schedule")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun credits(): Optional<List<Credit>> = credits.getOptional("credits")

            /**
             * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun customerBillingProviderConfiguration():
                Optional<CustomerBillingProviderConfiguration> =
                customerBillingProviderConfiguration.getOptional(
                    "customer_billing_provider_configuration"
                )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

            /**
             * Indicates whether there are more items than the limit for this endpoint. Use the
             * respective list endpoints to get the full lists.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun hasMore(): Optional<HasMore> = hasMore.getOptional("has_more")

            /**
             * Either a **parent** configuration with a list of children or a **child**
             * configuration with a single parent.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun hierarchyConfiguration(): Optional<HierarchyConfiguration> =
                hierarchyConfiguration.getOptional("hierarchy_configuration")

            /**
             * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
             * automatically. EXPLICIT prioritization requires specifying priorities for each
             * multiplier; the one with the lowest priority value will be prioritized first.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun multiplierOverridePrioritization(): Optional<MultiplierOverridePrioritization> =
                multiplierOverridePrioritization.getOptional("multiplier_override_prioritization")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun netPaymentTermsDays(): Optional<Double> =
                netPaymentTermsDays.getOptional("net_payment_terms_days")

            /**
             * ID of the package this contract was created from, if applicable.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun packageId(): Optional<String> = packageId.getOptional("package_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun prepaidBalanceThresholdConfiguration():
                Optional<PrepaidBalanceThresholdConfiguration> =
                prepaidBalanceThresholdConfiguration.getOptional(
                    "prepaid_balance_threshold_configuration"
                )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun rateCardId(): Optional<String> = rateCardId.getOptional("rate_card_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recurringCommits(): Optional<List<RecurringCommit>> =
                recurringCommits.getOptional("recurring_commits")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recurringCredits(): Optional<List<RecurringCredit>> =
                recurringCredits.getOptional("recurring_credits")

            /**
             * Determines which scheduled and commit charges to consolidate onto the Contract's
             * usage invoice. The charge's `timestamp` must match the usage invoice's
             * `ending_before` date for consolidation to occur. This field cannot be modified after
             * a Contract has been created. If this field is omitted, charges will appear on a
             * separate invoice from usage charges.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun scheduledChargesOnUsageInvoices(): Optional<ScheduledChargesOnUsageInvoices> =
                scheduledChargesOnUsageInvoices.getOptional("scheduled_charges_on_usage_invoices")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun spendThresholdConfiguration(): Optional<SpendThresholdConfiguration> =
                spendThresholdConfiguration.getOptional("spend_threshold_configuration")

            /**
             * List of subscriptions on the contract.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun subscriptions(): Optional<List<Subscription>> =
                subscriptions.getOptional("subscriptions")

            /**
             * Optional uniqueness key to prevent duplicate contract creations.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun uniquenessKey(): Optional<String> = uniquenessKey.getOptional("uniqueness_key")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [commits].
             *
             * Unlike [commits], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("commits")
            @ExcludeMissing
            fun _commits(): JsonField<List<Commit>> = commits

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [createdBy].
             *
             * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_by")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [overrides].
             *
             * Unlike [overrides], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("overrides")
            @ExcludeMissing
            fun _overrides(): JsonField<List<Override>> = overrides

            /**
             * Returns the raw JSON value of [scheduledCharges].
             *
             * Unlike [scheduledCharges], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("scheduled_charges")
            @ExcludeMissing
            fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            /**
             * Returns the raw JSON value of [transitions].
             *
             * Unlike [transitions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transitions")
            @ExcludeMissing
            fun _transitions(): JsonField<List<Transition>> = transitions

            /**
             * Returns the raw JSON value of [usageFilter].
             *
             * Unlike [usageFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_filter")
            @ExcludeMissing
            fun _usageFilter(): JsonField<List<UsageFilter>> = usageFilter

            /**
             * Returns the raw JSON value of [usageStatementSchedule].
             *
             * Unlike [usageStatementSchedule], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usage_statement_schedule")
            @ExcludeMissing
            fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> =
                usageStatementSchedule

            /**
             * Returns the raw JSON value of [credits].
             *
             * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("credits")
            @ExcludeMissing
            fun _credits(): JsonField<List<Credit>> = credits

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
             * Returns the raw JSON value of [customerBillingProviderConfiguration].
             *
             * Unlike [customerBillingProviderConfiguration], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("customer_billing_provider_configuration")
            @ExcludeMissing
            fun _customerBillingProviderConfiguration():
                JsonField<CustomerBillingProviderConfiguration> =
                customerBillingProviderConfiguration

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
             * Returns the raw JSON value of [hasMore].
             *
             * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<HasMore> = hasMore

            /**
             * Returns the raw JSON value of [hierarchyConfiguration].
             *
             * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            fun _hierarchyConfiguration(): JsonField<HierarchyConfiguration> =
                hierarchyConfiguration

            /**
             * Returns the raw JSON value of [multiplierOverridePrioritization].
             *
             * Unlike [multiplierOverridePrioritization], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("multiplier_override_prioritization")
            @ExcludeMissing
            fun _multiplierOverridePrioritization(): JsonField<MultiplierOverridePrioritization> =
                multiplierOverridePrioritization

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns the raw JSON value of [packageId].
             *
             * Unlike [packageId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("package_id")
            @ExcludeMissing
            fun _packageId(): JsonField<String> = packageId

            /**
             * Returns the raw JSON value of [prepaidBalanceThresholdConfiguration].
             *
             * Unlike [prepaidBalanceThresholdConfiguration], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("prepaid_balance_threshold_configuration")
            @ExcludeMissing
            fun _prepaidBalanceThresholdConfiguration():
                JsonField<PrepaidBalanceThresholdConfiguration> =
                prepaidBalanceThresholdConfiguration

            /**
             * Returns the raw JSON value of [rateCardId].
             *
             * Unlike [rateCardId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rate_card_id")
            @ExcludeMissing
            fun _rateCardId(): JsonField<String> = rateCardId

            /**
             * Returns the raw JSON value of [recurringCommits].
             *
             * Unlike [recurringCommits], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_commits")
            @ExcludeMissing
            fun _recurringCommits(): JsonField<List<RecurringCommit>> = recurringCommits

            /**
             * Returns the raw JSON value of [recurringCredits].
             *
             * Unlike [recurringCredits], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_credits")
            @ExcludeMissing
            fun _recurringCredits(): JsonField<List<RecurringCredit>> = recurringCredits

            /**
             * Returns the raw JSON value of [scheduledChargesOnUsageInvoices].
             *
             * Unlike [scheduledChargesOnUsageInvoices], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("scheduled_charges_on_usage_invoices")
            @ExcludeMissing
            fun _scheduledChargesOnUsageInvoices(): JsonField<ScheduledChargesOnUsageInvoices> =
                scheduledChargesOnUsageInvoices

            /**
             * Returns the raw JSON value of [spendThresholdConfiguration].
             *
             * Unlike [spendThresholdConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Contract].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .commits()
                 * .createdAt()
                 * .createdBy()
                 * .customerId()
                 * .overrides()
                 * .scheduledCharges()
                 * .startingAt()
                 * .transitions()
                 * .usageFilter()
                 * .usageStatementSchedule()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contract]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var commits: JsonField<MutableList<Commit>>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var createdBy: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var overrides: JsonField<MutableList<Override>>? = null
                private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var transitions: JsonField<MutableList<Transition>>? = null
                private var usageFilter: JsonField<MutableList<UsageFilter>>? = null
                private var usageStatementSchedule: JsonField<UsageStatementSchedule>? = null
                private var credits: JsonField<MutableList<Credit>>? = null
                private var customFields: JsonField<CustomFields> = JsonMissing.of()
                private var customerBillingProviderConfiguration:
                    JsonField<CustomerBillingProviderConfiguration> =
                    JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var hasMore: JsonField<HasMore> = JsonMissing.of()
                private var hierarchyConfiguration: JsonField<HierarchyConfiguration> =
                    JsonMissing.of()
                private var multiplierOverridePrioritization:
                    JsonField<MultiplierOverridePrioritization> =
                    JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
                private var packageId: JsonField<String> = JsonMissing.of()
                private var prepaidBalanceThresholdConfiguration:
                    JsonField<PrepaidBalanceThresholdConfiguration> =
                    JsonMissing.of()
                private var rateCardId: JsonField<String> = JsonMissing.of()
                private var recurringCommits: JsonField<MutableList<RecurringCommit>>? = null
                private var recurringCredits: JsonField<MutableList<RecurringCredit>>? = null
                private var scheduledChargesOnUsageInvoices:
                    JsonField<ScheduledChargesOnUsageInvoices> =
                    JsonMissing.of()
                private var spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
                    JsonMissing.of()
                private var subscriptions: JsonField<MutableList<Subscription>>? = null
                private var uniquenessKey: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contract: Contract) = apply {
                    id = contract.id
                    commits = contract.commits.map { it.toMutableList() }
                    createdAt = contract.createdAt
                    createdBy = contract.createdBy
                    customerId = contract.customerId
                    overrides = contract.overrides.map { it.toMutableList() }
                    scheduledCharges = contract.scheduledCharges.map { it.toMutableList() }
                    startingAt = contract.startingAt
                    transitions = contract.transitions.map { it.toMutableList() }
                    usageFilter = contract.usageFilter.map { it.toMutableList() }
                    usageStatementSchedule = contract.usageStatementSchedule
                    credits = contract.credits.map { it.toMutableList() }
                    customFields = contract.customFields
                    customerBillingProviderConfiguration =
                        contract.customerBillingProviderConfiguration
                    endingBefore = contract.endingBefore
                    hasMore = contract.hasMore
                    hierarchyConfiguration = contract.hierarchyConfiguration
                    multiplierOverridePrioritization = contract.multiplierOverridePrioritization
                    name = contract.name
                    netPaymentTermsDays = contract.netPaymentTermsDays
                    packageId = contract.packageId
                    prepaidBalanceThresholdConfiguration =
                        contract.prepaidBalanceThresholdConfiguration
                    rateCardId = contract.rateCardId
                    recurringCommits = contract.recurringCommits.map { it.toMutableList() }
                    recurringCredits = contract.recurringCredits.map { it.toMutableList() }
                    scheduledChargesOnUsageInvoices = contract.scheduledChargesOnUsageInvoices
                    spendThresholdConfiguration = contract.spendThresholdConfiguration
                    subscriptions = contract.subscriptions.map { it.toMutableList() }
                    uniquenessKey = contract.uniquenessKey
                    additionalProperties = contract.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

                /**
                 * Sets [Builder.commits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commits] with a well-typed `List<Commit>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                /**
                 * Sets [Builder.createdBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                fun overrides(overrides: List<Override>) = overrides(JsonField.of(overrides))

                /**
                 * Sets [Builder.overrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overrides] with a well-typed `List<Override>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) =
                    scheduledCharges(JsonField.of(scheduledCharges))

                /**
                 * Sets [Builder.scheduledCharges] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledCharges] with a well-typed
                 * `List<ScheduledCharge>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                fun transitions(transitions: List<Transition>) =
                    transitions(JsonField.of(transitions))

                /**
                 * Sets [Builder.transitions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transitions] with a well-typed
                 * `List<Transition>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun transitions(transitions: JsonField<List<Transition>>) = apply {
                    this.transitions = transitions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Transition] to [transitions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTransition(transition: Transition) = apply {
                    transitions =
                        (transitions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("transitions", it).add(transition)
                        }
                }

                fun usageFilter(usageFilter: List<UsageFilter>) =
                    usageFilter(JsonField.of(usageFilter))

                /**
                 * Sets [Builder.usageFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageFilter] with a well-typed
                 * `List<UsageFilter>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun usageFilter(usageFilter: JsonField<List<UsageFilter>>) = apply {
                    this.usageFilter = usageFilter.map { it.toMutableList() }
                }

                /**
                 * Adds a single [UsageFilter] to [Builder.usageFilter].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUsageFilter(usageFilter: UsageFilter) = apply {
                    this.usageFilter =
                        (this.usageFilter ?: JsonField.of(mutableListOf())).also {
                            checkKnown("usageFilter", it).add(usageFilter)
                        }
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
                fun usageStatementSchedule(
                    usageStatementSchedule: JsonField<UsageStatementSchedule>
                ) = apply { this.usageStatementSchedule = usageStatementSchedule }

                fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

                /**
                 * Sets [Builder.credits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.credits] with a well-typed `List<Credit>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
                fun customFields(customFields: CustomFields) =
                    customFields(JsonField.of(customFields))

                /**
                 * Sets [Builder.customFields] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customFields] with a well-typed [CustomFields]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customFields(customFields: JsonField<CustomFields>) = apply {
                    this.customFields = customFields
                }

                fun customerBillingProviderConfiguration(
                    customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
                ) =
                    customerBillingProviderConfiguration(
                        JsonField.of(customerBillingProviderConfiguration)
                    )

                /**
                 * Sets [Builder.customerBillingProviderConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerBillingProviderConfiguration] with a
                 * well-typed [CustomerBillingProviderConfiguration] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun customerBillingProviderConfiguration(
                    customerBillingProviderConfiguration:
                        JsonField<CustomerBillingProviderConfiguration>
                ) = apply {
                    this.customerBillingProviderConfiguration = customerBillingProviderConfiguration
                }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * Sets [Builder.endingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                /**
                 * Indicates whether there are more items than the limit for this endpoint. Use the
                 * respective list endpoints to get the full lists.
                 */
                fun hasMore(hasMore: HasMore) = hasMore(JsonField.of(hasMore))

                /**
                 * Sets [Builder.hasMore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasMore] with a well-typed [HasMore] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasMore(hasMore: JsonField<HasMore>) = apply { this.hasMore = hasMore }

                /**
                 * Either a **parent** configuration with a list of children or a **child**
                 * configuration with a single parent.
                 */
                fun hierarchyConfiguration(hierarchyConfiguration: HierarchyConfiguration) =
                    hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                /**
                 * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hierarchyConfiguration] with a well-typed
                 * [HierarchyConfiguration] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun hierarchyConfiguration(
                    hierarchyConfiguration: JsonField<HierarchyConfiguration>
                ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                /**
                 * Alias for calling [hierarchyConfiguration] with
                 * `HierarchyConfiguration.ofParent(parent)`.
                 */
                fun hierarchyConfiguration(
                    parent: HierarchyConfiguration.ParentHierarchyConfiguration
                ) = hierarchyConfiguration(HierarchyConfiguration.ofParent(parent))

                /**
                 * Alias for calling [hierarchyConfiguration] with
                 * `HierarchyConfiguration.ofChild(child)`.
                 */
                fun hierarchyConfiguration(
                    child: HierarchyConfiguration.ChildHierarchyConfiguration
                ) = hierarchyConfiguration(HierarchyConfiguration.ofChild(child))

                /**
                 * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
                 * automatically. EXPLICIT prioritization requires specifying priorities for each
                 * multiplier; the one with the lowest priority value will be prioritized first.
                 */
                fun multiplierOverridePrioritization(
                    multiplierOverridePrioritization: MultiplierOverridePrioritization
                ) = multiplierOverridePrioritization(JsonField.of(multiplierOverridePrioritization))

                /**
                 * Sets [Builder.multiplierOverridePrioritization] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiplierOverridePrioritization] with a
                 * well-typed [MultiplierOverridePrioritization] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun multiplierOverridePrioritization(
                    multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization>
                ) = apply {
                    this.multiplierOverridePrioritization = multiplierOverridePrioritization
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun netPaymentTermsDays(netPaymentTermsDays: Double) =
                    netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

                /**
                 * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
                    this.netPaymentTermsDays = netPaymentTermsDays
                }

                /** ID of the package this contract was created from, if applicable. */
                fun packageId(packageId: String) = packageId(JsonField.of(packageId))

                /**
                 * Sets [Builder.packageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.packageId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun packageId(packageId: JsonField<String>) = apply { this.packageId = packageId }

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

                fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

                /**
                 * Sets [Builder.rateCardId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rateCardId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rateCardId(rateCardId: JsonField<String>) = apply {
                    this.rateCardId = rateCardId
                }

                fun recurringCommits(recurringCommits: List<RecurringCommit>) =
                    recurringCommits(JsonField.of(recurringCommits))

                /**
                 * Sets [Builder.recurringCommits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurringCommits] with a well-typed
                 * `List<RecurringCommit>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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
                 * `List<RecurringCredit>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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

                /**
                 * Determines which scheduled and commit charges to consolidate onto the Contract's
                 * usage invoice. The charge's `timestamp` must match the usage invoice's
                 * `ending_before` date for consolidation to occur. This field cannot be modified
                 * after a Contract has been created. If this field is omitted, charges will appear
                 * on a separate invoice from usage charges.
                 */
                fun scheduledChargesOnUsageInvoices(
                    scheduledChargesOnUsageInvoices: ScheduledChargesOnUsageInvoices
                ) = scheduledChargesOnUsageInvoices(JsonField.of(scheduledChargesOnUsageInvoices))

                /**
                 * Sets [Builder.scheduledChargesOnUsageInvoices] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledChargesOnUsageInvoices] with a
                 * well-typed [ScheduledChargesOnUsageInvoices] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
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
                 * [SpendThresholdConfiguration] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun spendThresholdConfiguration(
                    spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>
                ) = apply { this.spendThresholdConfiguration = spendThresholdConfiguration }

                /** List of subscriptions on the contract. */
                fun subscriptions(subscriptions: List<Subscription>) =
                    subscriptions(JsonField.of(subscriptions))

                /**
                 * Sets [Builder.subscriptions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptions] with a well-typed
                 * `List<Subscription>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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

                /** Optional uniqueness key to prevent duplicate contract creations. */
                fun uniquenessKey(uniquenessKey: String) =
                    uniquenessKey(JsonField.of(uniquenessKey))

                /**
                 * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uniquenessKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                    this.uniquenessKey = uniquenessKey
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
                 * Returns an immutable instance of [Contract].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .commits()
                 * .createdAt()
                 * .createdBy()
                 * .customerId()
                 * .overrides()
                 * .scheduledCharges()
                 * .startingAt()
                 * .transitions()
                 * .usageFilter()
                 * .usageStatementSchedule()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Contract =
                    Contract(
                        checkRequired("id", id),
                        checkRequired("commits", commits).map { it.toImmutable() },
                        checkRequired("createdAt", createdAt),
                        checkRequired("createdBy", createdBy),
                        checkRequired("customerId", customerId),
                        checkRequired("overrides", overrides).map { it.toImmutable() },
                        checkRequired("scheduledCharges", scheduledCharges).map {
                            it.toImmutable()
                        },
                        checkRequired("startingAt", startingAt),
                        checkRequired("transitions", transitions).map { it.toImmutable() },
                        checkRequired("usageFilter", usageFilter).map { it.toImmutable() },
                        checkRequired("usageStatementSchedule", usageStatementSchedule),
                        (credits ?: JsonMissing.of()).map { it.toImmutable() },
                        customFields,
                        customerBillingProviderConfiguration,
                        endingBefore,
                        hasMore,
                        hierarchyConfiguration,
                        multiplierOverridePrioritization,
                        name,
                        netPaymentTermsDays,
                        packageId,
                        prepaidBalanceThresholdConfiguration,
                        rateCardId,
                        (recurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                        (recurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                        scheduledChargesOnUsageInvoices,
                        spendThresholdConfiguration,
                        (subscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                        uniquenessKey,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Contract = apply {
                if (validated) {
                    return@apply
                }

                id()
                commits().forEach { it.validate() }
                createdAt()
                createdBy()
                customerId()
                overrides().forEach { it.validate() }
                scheduledCharges().forEach { it.validate() }
                startingAt()
                transitions().forEach { it.validate() }
                usageFilter().forEach { it.validate() }
                usageStatementSchedule().validate()
                credits().ifPresent { it.forEach { it.validate() } }
                customFields().ifPresent { it.validate() }
                customerBillingProviderConfiguration().ifPresent { it.validate() }
                endingBefore()
                hasMore().ifPresent { it.validate() }
                hierarchyConfiguration().ifPresent { it.validate() }
                multiplierOverridePrioritization().ifPresent { it.validate() }
                name()
                netPaymentTermsDays()
                packageId()
                prepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
                rateCardId()
                recurringCommits().ifPresent { it.forEach { it.validate() } }
                recurringCredits().ifPresent { it.forEach { it.validate() } }
                scheduledChargesOnUsageInvoices().ifPresent { it.validate() }
                spendThresholdConfiguration().ifPresent { it.validate() }
                subscriptions().ifPresent { it.forEach { it.validate() } }
                uniquenessKey()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (commits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (createdBy.asKnown().isPresent) 1 else 0) +
                    (if (customerId.asKnown().isPresent) 1 else 0) +
                    (overrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (scheduledCharges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0) +
                    (transitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (usageFilter.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (usageStatementSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                    (credits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                    (customerBillingProviderConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (hasMore.asKnown().getOrNull()?.validity() ?: 0) +
                    (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (multiplierOverridePrioritization.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (netPaymentTermsDays.asKnown().isPresent) 1 else 0) +
                    (if (packageId.asKnown().isPresent) 1 else 0) +
                    (prepaidBalanceThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (rateCardId.asKnown().isPresent) 1 else 0) +
                    (recurringCommits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (recurringCredits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (scheduledChargesOnUsageInvoices.asKnown().getOrNull()?.validity() ?: 0) +
                    (spendThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                    (subscriptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (uniquenessKey.asKnown().isPresent) 1 else 0)

            class Transition
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val fromContractId: JsonField<String>,
                private val toContractId: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("from_contract_id")
                    @ExcludeMissing
                    fromContractId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("to_contract_id")
                    @ExcludeMissing
                    toContractId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(fromContractId, toContractId, type, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fromContractId(): String = fromContractId.getRequired("from_contract_id")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun toContractId(): String = toContractId.getRequired("to_contract_id")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [fromContractId].
                 *
                 * Unlike [fromContractId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("from_contract_id")
                @ExcludeMissing
                fun _fromContractId(): JsonField<String> = fromContractId

                /**
                 * Returns the raw JSON value of [toContractId].
                 *
                 * Unlike [toContractId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("to_contract_id")
                @ExcludeMissing
                fun _toContractId(): JsonField<String> = toContractId

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [Transition].
                     *
                     * The following fields are required:
                     * ```java
                     * .fromContractId()
                     * .toContractId()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Transition]. */
                class Builder internal constructor() {

                    private var fromContractId: JsonField<String>? = null
                    private var toContractId: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(transition: Transition) = apply {
                        fromContractId = transition.fromContractId
                        toContractId = transition.toContractId
                        type = transition.type
                        additionalProperties = transition.additionalProperties.toMutableMap()
                    }

                    fun fromContractId(fromContractId: String) =
                        fromContractId(JsonField.of(fromContractId))

                    /**
                     * Sets [Builder.fromContractId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fromContractId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fromContractId(fromContractId: JsonField<String>) = apply {
                        this.fromContractId = fromContractId
                    }

                    fun toContractId(toContractId: String) =
                        toContractId(JsonField.of(toContractId))

                    /**
                     * Sets [Builder.toContractId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.toContractId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun toContractId(toContractId: JsonField<String>) = apply {
                        this.toContractId = toContractId
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [Transition].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .fromContractId()
                     * .toContractId()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Transition =
                        Transition(
                            checkRequired("fromContractId", fromContractId),
                            checkRequired("toContractId", toContractId),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Transition = apply {
                    if (validated) {
                        return@apply
                    }

                    fromContractId()
                    toContractId()
                    type().validate()
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
                    (if (fromContractId.asKnown().isPresent) 1 else 0) +
                        (if (toContractId.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

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

                        @JvmField val RENEWAL = of("RENEWAL")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        RENEWAL
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        RENEWAL,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
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
                            RENEWAL -> Value.RENEWAL
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
                            RENEWAL -> Known.RENEWAL
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is Transition &&
                        fromContractId == other.fromContractId &&
                        toContractId == other.toContractId &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(fromContractId, toContractId, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Transition{fromContractId=$fromContractId, toContractId=$toContractId, type=$type, additionalProperties=$additionalProperties}"
            }

            class UsageFilter
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groupKey: JsonField<String>,
                private val groupValues: JsonField<List<String>>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("group_key")
                    @ExcludeMissing
                    groupKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("group_values")
                    @ExcludeMissing
                    groupValues: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(groupKey, groupValues, startingAt, endingBefore, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun groupKey(): String = groupKey.getRequired("group_key")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun groupValues(): List<String> = groupValues.getRequired("group_values")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endingBefore(): Optional<OffsetDateTime> =
                    endingBefore.getOptional("ending_before")

                /**
                 * Returns the raw JSON value of [groupKey].
                 *
                 * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("group_key")
                @ExcludeMissing
                fun _groupKey(): JsonField<String> = groupKey

                /**
                 * Returns the raw JSON value of [groupValues].
                 *
                 * Unlike [groupValues], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("group_values")
                @ExcludeMissing
                fun _groupValues(): JsonField<List<String>> = groupValues

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

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
                     * Returns a mutable builder for constructing an instance of [UsageFilter].
                     *
                     * The following fields are required:
                     * ```java
                     * .groupKey()
                     * .groupValues()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UsageFilter]. */
                class Builder internal constructor() {

                    private var groupKey: JsonField<String>? = null
                    private var groupValues: JsonField<MutableList<String>>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usageFilter: UsageFilter) = apply {
                        groupKey = usageFilter.groupKey
                        groupValues = usageFilter.groupValues.map { it.toMutableList() }
                        startingAt = usageFilter.startingAt
                        endingBefore = usageFilter.endingBefore
                        additionalProperties = usageFilter.additionalProperties.toMutableMap()
                    }

                    fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

                    /**
                     * Sets [Builder.groupKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

                    fun groupValues(groupValues: List<String>) =
                        groupValues(JsonField.of(groupValues))

                    /**
                     * Sets [Builder.groupValues] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupValues] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun groupValues(groupValues: JsonField<List<String>>) = apply {
                        this.groupValues = groupValues.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [groupValues].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addGroupValue(groupValue: String) = apply {
                        groupValues =
                            (groupValues ?: JsonField.of(mutableListOf())).also {
                                checkKnown("groupValues", it).add(groupValue)
                            }
                    }

                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
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
                     * Returns an immutable instance of [UsageFilter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .groupKey()
                     * .groupValues()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): UsageFilter =
                        UsageFilter(
                            checkRequired("groupKey", groupKey),
                            checkRequired("groupValues", groupValues).map { it.toImmutable() },
                            checkRequired("startingAt", startingAt),
                            endingBefore,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): UsageFilter = apply {
                    if (validated) {
                        return@apply
                    }

                    groupKey()
                    groupValues()
                    startingAt()
                    endingBefore()
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
                    (if (groupKey.asKnown().isPresent) 1 else 0) +
                        (groupValues.asKnown().getOrNull()?.size ?: 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UsageFilter &&
                        groupKey == other.groupKey &&
                        groupValues == other.groupValues &&
                        startingAt == other.startingAt &&
                        endingBefore == other.endingBefore &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        groupKey,
                        groupValues,
                        startingAt,
                        endingBefore,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageFilter{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            class UsageStatementSchedule
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val billingAnchorDate: JsonField<OffsetDateTime>,
                private val frequency: JsonField<Frequency>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("billing_anchor_date")
                    @ExcludeMissing
                    billingAnchorDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    frequency: JsonField<Frequency> = JsonMissing.of(),
                ) : this(billingAnchorDate, frequency, mutableMapOf())

                /**
                 * Contract usage statements follow a selected cadence based on this date.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun billingAnchorDate(): OffsetDateTime =
                    billingAnchorDate.getRequired("billing_anchor_date")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun frequency(): Frequency = frequency.getRequired("frequency")

                /**
                 * Returns the raw JSON value of [billingAnchorDate].
                 *
                 * Unlike [billingAnchorDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billing_anchor_date")
                @ExcludeMissing
                fun _billingAnchorDate(): JsonField<OffsetDateTime> = billingAnchorDate

                /**
                 * Returns the raw JSON value of [frequency].
                 *
                 * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<Frequency> = frequency

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
                     * [UsageStatementSchedule].
                     *
                     * The following fields are required:
                     * ```java
                     * .billingAnchorDate()
                     * .frequency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UsageStatementSchedule]. */
                class Builder internal constructor() {

                    private var billingAnchorDate: JsonField<OffsetDateTime>? = null
                    private var frequency: JsonField<Frequency>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usageStatementSchedule: UsageStatementSchedule) = apply {
                        billingAnchorDate = usageStatementSchedule.billingAnchorDate
                        frequency = usageStatementSchedule.frequency
                        additionalProperties =
                            usageStatementSchedule.additionalProperties.toMutableMap()
                    }

                    /** Contract usage statements follow a selected cadence based on this date. */
                    fun billingAnchorDate(billingAnchorDate: OffsetDateTime) =
                        billingAnchorDate(JsonField.of(billingAnchorDate))

                    /**
                     * Sets [Builder.billingAnchorDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingAnchorDate] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun billingAnchorDate(billingAnchorDate: JsonField<OffsetDateTime>) = apply {
                        this.billingAnchorDate = billingAnchorDate
                    }

                    fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                    /**
                     * Sets [Builder.frequency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.frequency] with a well-typed [Frequency]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun frequency(frequency: JsonField<Frequency>) = apply {
                        this.frequency = frequency
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
                     * Returns an immutable instance of [UsageStatementSchedule].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .billingAnchorDate()
                     * .frequency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): UsageStatementSchedule =
                        UsageStatementSchedule(
                            checkRequired("billingAnchorDate", billingAnchorDate),
                            checkRequired("frequency", frequency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): UsageStatementSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    billingAnchorDate()
                    frequency().validate()
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
                    (if (billingAnchorDate.asKnown().isPresent) 1 else 0) +
                        (frequency.asKnown().getOrNull()?.validity() ?: 0)

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
                        ANNUAL,
                        WEEKLY,
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
                            ANNUAL -> Value.ANNUAL
                            WEEKLY -> Value.WEEKLY
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
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Frequency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UsageStatementSchedule &&
                        billingAnchorDate == other.billingAnchorDate &&
                        frequency == other.frequency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(billingAnchorDate, frequency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageStatementSchedule{billingAnchorDate=$billingAnchorDate, frequency=$frequency, additionalProperties=$additionalProperties}"
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomFields &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
            }

            class CustomerBillingProviderConfiguration
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val archivedAt: JsonField<OffsetDateTime>,
                private val billingProvider: JsonField<BillingProvider>,
                private val configuration: JsonField<Configuration>,
                private val customerId: JsonField<String>,
                private val deliveryMethod: JsonField<DeliveryMethod>,
                private val deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration>,
                private val deliveryMethodId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("archived_at")
                    @ExcludeMissing
                    archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("billing_provider")
                    @ExcludeMissing
                    billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
                    @JsonProperty("configuration")
                    @ExcludeMissing
                    configuration: JsonField<Configuration> = JsonMissing.of(),
                    @JsonProperty("customer_id")
                    @ExcludeMissing
                    customerId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("delivery_method")
                    @ExcludeMissing
                    deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
                    @JsonProperty("delivery_method_configuration")
                    @ExcludeMissing
                    deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("delivery_method_id")
                    @ExcludeMissing
                    deliveryMethodId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    archivedAt,
                    billingProvider,
                    configuration,
                    customerId,
                    deliveryMethod,
                    deliveryMethodConfiguration,
                    deliveryMethodId,
                    mutableMapOf(),
                )

                /**
                 * ID of this configuration; can be provided as the
                 * billing_provider_configuration_id when creating a contract.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archived_at")

                /**
                 * The billing provider set for this configuration.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun billingProvider(): BillingProvider =
                    billingProvider.getRequired("billing_provider")

                /**
                 * Configuration for the billing provider. The structure of this object is specific
                 * to the billing provider.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun configuration(): Configuration = configuration.getRequired("configuration")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun customerId(): String = customerId.getRequired("customer_id")

                /**
                 * The method to use for delivering invoices to this customer.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

                /**
                 * Configuration for the delivery method. The structure of this object is specific
                 * to the delivery method.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun deliveryMethodConfiguration(): DeliveryMethodConfiguration =
                    deliveryMethodConfiguration.getRequired("delivery_method_configuration")

                /**
                 * ID of the delivery method to use for this customer.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun deliveryMethodId(): String = deliveryMethodId.getRequired("delivery_method_id")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [archivedAt].
                 *
                 * Unlike [archivedAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("archived_at")
                @ExcludeMissing
                fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

                /**
                 * Returns the raw JSON value of [billingProvider].
                 *
                 * Unlike [billingProvider], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billing_provider")
                @ExcludeMissing
                fun _billingProvider(): JsonField<BillingProvider> = billingProvider

                /**
                 * Returns the raw JSON value of [configuration].
                 *
                 * Unlike [configuration], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("configuration")
                @ExcludeMissing
                fun _configuration(): JsonField<Configuration> = configuration

                /**
                 * Returns the raw JSON value of [customerId].
                 *
                 * Unlike [customerId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("customer_id")
                @ExcludeMissing
                fun _customerId(): JsonField<String> = customerId

                /**
                 * Returns the raw JSON value of [deliveryMethod].
                 *
                 * Unlike [deliveryMethod], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("delivery_method")
                @ExcludeMissing
                fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

                /**
                 * Returns the raw JSON value of [deliveryMethodConfiguration].
                 *
                 * Unlike [deliveryMethodConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("delivery_method_configuration")
                @ExcludeMissing
                fun _deliveryMethodConfiguration(): JsonField<DeliveryMethodConfiguration> =
                    deliveryMethodConfiguration

                /**
                 * Returns the raw JSON value of [deliveryMethodId].
                 *
                 * Unlike [deliveryMethodId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("delivery_method_id")
                @ExcludeMissing
                fun _deliveryMethodId(): JsonField<String> = deliveryMethodId

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
                     * [CustomerBillingProviderConfiguration].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .archivedAt()
                     * .billingProvider()
                     * .configuration()
                     * .customerId()
                     * .deliveryMethod()
                     * .deliveryMethodConfiguration()
                     * .deliveryMethodId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomerBillingProviderConfiguration]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var archivedAt: JsonField<OffsetDateTime>? = null
                    private var billingProvider: JsonField<BillingProvider>? = null
                    private var configuration: JsonField<Configuration>? = null
                    private var customerId: JsonField<String>? = null
                    private var deliveryMethod: JsonField<DeliveryMethod>? = null
                    private var deliveryMethodConfiguration:
                        JsonField<DeliveryMethodConfiguration>? =
                        null
                    private var deliveryMethodId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
                    ) = apply {
                        id = customerBillingProviderConfiguration.id
                        archivedAt = customerBillingProviderConfiguration.archivedAt
                        billingProvider = customerBillingProviderConfiguration.billingProvider
                        configuration = customerBillingProviderConfiguration.configuration
                        customerId = customerBillingProviderConfiguration.customerId
                        deliveryMethod = customerBillingProviderConfiguration.deliveryMethod
                        deliveryMethodConfiguration =
                            customerBillingProviderConfiguration.deliveryMethodConfiguration
                        deliveryMethodId = customerBillingProviderConfiguration.deliveryMethodId
                        additionalProperties =
                            customerBillingProviderConfiguration.additionalProperties.toMutableMap()
                    }

                    /**
                     * ID of this configuration; can be provided as the
                     * billing_provider_configuration_id when creating a contract.
                     */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun archivedAt(archivedAt: OffsetDateTime?) =
                        archivedAt(JsonField.ofNullable(archivedAt))

                    /** Alias for calling [Builder.archivedAt] with `archivedAt.orElse(null)`. */
                    fun archivedAt(archivedAt: Optional<OffsetDateTime>) =
                        archivedAt(archivedAt.getOrNull())

                    /**
                     * Sets [Builder.archivedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.archivedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                        this.archivedAt = archivedAt
                    }

                    /** The billing provider set for this configuration. */
                    fun billingProvider(billingProvider: BillingProvider) =
                        billingProvider(JsonField.of(billingProvider))

                    /**
                     * Sets [Builder.billingProvider] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingProvider] with a well-typed
                     * [BillingProvider] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                        this.billingProvider = billingProvider
                    }

                    /**
                     * Configuration for the billing provider. The structure of this object is
                     * specific to the billing provider.
                     */
                    fun configuration(configuration: Configuration) =
                        configuration(JsonField.of(configuration))

                    /**
                     * Sets [Builder.configuration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.configuration] with a well-typed
                     * [Configuration] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun configuration(configuration: JsonField<Configuration>) = apply {
                        this.configuration = configuration
                    }

                    fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                    /**
                     * Sets [Builder.customerId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customerId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun customerId(customerId: JsonField<String>) = apply {
                        this.customerId = customerId
                    }

                    /** The method to use for delivering invoices to this customer. */
                    fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                        deliveryMethod(JsonField.of(deliveryMethod))

                    /**
                     * Sets [Builder.deliveryMethod] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deliveryMethod] with a well-typed
                     * [DeliveryMethod] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                        this.deliveryMethod = deliveryMethod
                    }

                    /**
                     * Configuration for the delivery method. The structure of this object is
                     * specific to the delivery method.
                     */
                    fun deliveryMethodConfiguration(
                        deliveryMethodConfiguration: DeliveryMethodConfiguration
                    ) = deliveryMethodConfiguration(JsonField.of(deliveryMethodConfiguration))

                    /**
                     * Sets [Builder.deliveryMethodConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deliveryMethodConfiguration] with a
                     * well-typed [DeliveryMethodConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun deliveryMethodConfiguration(
                        deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration>
                    ) = apply { this.deliveryMethodConfiguration = deliveryMethodConfiguration }

                    /** ID of the delivery method to use for this customer. */
                    fun deliveryMethodId(deliveryMethodId: String) =
                        deliveryMethodId(JsonField.of(deliveryMethodId))

                    /**
                     * Sets [Builder.deliveryMethodId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deliveryMethodId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun deliveryMethodId(deliveryMethodId: JsonField<String>) = apply {
                        this.deliveryMethodId = deliveryMethodId
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
                     * Returns an immutable instance of [CustomerBillingProviderConfiguration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .archivedAt()
                     * .billingProvider()
                     * .configuration()
                     * .customerId()
                     * .deliveryMethod()
                     * .deliveryMethodConfiguration()
                     * .deliveryMethodId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CustomerBillingProviderConfiguration =
                        CustomerBillingProviderConfiguration(
                            checkRequired("id", id),
                            checkRequired("archivedAt", archivedAt),
                            checkRequired("billingProvider", billingProvider),
                            checkRequired("configuration", configuration),
                            checkRequired("customerId", customerId),
                            checkRequired("deliveryMethod", deliveryMethod),
                            checkRequired(
                                "deliveryMethodConfiguration",
                                deliveryMethodConfiguration,
                            ),
                            checkRequired("deliveryMethodId", deliveryMethodId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): CustomerBillingProviderConfiguration = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    archivedAt()
                    billingProvider().validate()
                    configuration().validate()
                    customerId()
                    deliveryMethod().validate()
                    deliveryMethodConfiguration().validate()
                    deliveryMethodId()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (archivedAt.asKnown().isPresent) 1 else 0) +
                        (billingProvider.asKnown().getOrNull()?.validity() ?: 0) +
                        (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (customerId.asKnown().isPresent) 1 else 0) +
                        (deliveryMethod.asKnown().getOrNull()?.validity() ?: 0) +
                        (deliveryMethodConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (deliveryMethodId.asKnown().isPresent) 1 else 0)

                /** The billing provider set for this configuration. */
                class BillingProvider
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

                        @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                        @JvmField val STRIPE = of("stripe")

                        @JvmField val NETSUITE = of("netsuite")

                        @JvmField val CUSTOM = of("custom")

                        @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                        @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

                        @JvmField val WORKDAY = of("workday")

                        @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                        @JvmField val METRONOME = of("metronome")

                        @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
                    }

                    /** An enum containing [BillingProvider]'s known values. */
                    enum class Known {
                        AWS_MARKETPLACE,
                        STRIPE,
                        NETSUITE,
                        CUSTOM,
                        AZURE_MARKETPLACE,
                        QUICKBOOKS_ONLINE,
                        WORKDAY,
                        GCP_MARKETPLACE,
                        METRONOME,
                    }

                    /**
                     * An enum containing [BillingProvider]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [BillingProvider] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AWS_MARKETPLACE,
                        STRIPE,
                        NETSUITE,
                        CUSTOM,
                        AZURE_MARKETPLACE,
                        QUICKBOOKS_ONLINE,
                        WORKDAY,
                        GCP_MARKETPLACE,
                        METRONOME,
                        /**
                         * An enum member indicating that [BillingProvider] was instantiated with an
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
                            AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                            STRIPE -> Value.STRIPE
                            NETSUITE -> Value.NETSUITE
                            CUSTOM -> Value.CUSTOM
                            AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                            QUICKBOOKS_ONLINE -> Value.QUICKBOOKS_ONLINE
                            WORKDAY -> Value.WORKDAY
                            GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                            METRONOME -> Value.METRONOME
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
                            AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                            STRIPE -> Known.STRIPE
                            NETSUITE -> Known.NETSUITE
                            CUSTOM -> Known.CUSTOM
                            AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                            QUICKBOOKS_ONLINE -> Known.QUICKBOOKS_ONLINE
                            WORKDAY -> Known.WORKDAY
                            GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                            METRONOME -> Known.METRONOME
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown BillingProvider: $value"
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

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BillingProvider && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Configuration for the billing provider. The structure of this object is specific
                 * to the billing provider.
                 */
                class Configuration
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
                         * [Configuration].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Configuration]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(configuration: Configuration) = apply {
                            additionalProperties = configuration.additionalProperties.toMutableMap()
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

                        /**
                         * Returns an immutable instance of [Configuration].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Configuration =
                            Configuration(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Configuration = apply {
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

                        return other is Configuration &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Configuration{additionalProperties=$additionalProperties}"
                }

                /** The method to use for delivering invoices to this customer. */
                class DeliveryMethod
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
                     * An enum containing [DeliveryMethod]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [DeliveryMethod] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DIRECT_TO_BILLING_PROVIDER,
                        AWS_SQS,
                        TACKLE,
                        AWS_SNS,
                        /**
                         * An enum member indicating that [DeliveryMethod] was instantiated with an
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
                            DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                            AWS_SQS -> Value.AWS_SQS
                            TACKLE -> Value.TACKLE
                            AWS_SNS -> Value.AWS_SNS
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
                            DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                            AWS_SQS -> Known.AWS_SQS
                            TACKLE -> Known.TACKLE
                            AWS_SNS -> Known.AWS_SNS
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown DeliveryMethod: $value"
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

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DeliveryMethod && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Configuration for the delivery method. The structure of this object is specific
                 * to the delivery method.
                 */
                class DeliveryMethodConfiguration
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
                         * [DeliveryMethodConfiguration].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DeliveryMethodConfiguration]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            deliveryMethodConfiguration: DeliveryMethodConfiguration
                        ) = apply {
                            additionalProperties =
                                deliveryMethodConfiguration.additionalProperties.toMutableMap()
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

                        /**
                         * Returns an immutable instance of [DeliveryMethodConfiguration].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): DeliveryMethodConfiguration =
                            DeliveryMethodConfiguration(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): DeliveryMethodConfiguration = apply {
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

                        return other is DeliveryMethodConfiguration &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DeliveryMethodConfiguration{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomerBillingProviderConfiguration &&
                        id == other.id &&
                        archivedAt == other.archivedAt &&
                        billingProvider == other.billingProvider &&
                        configuration == other.configuration &&
                        customerId == other.customerId &&
                        deliveryMethod == other.deliveryMethod &&
                        deliveryMethodConfiguration == other.deliveryMethodConfiguration &&
                        deliveryMethodId == other.deliveryMethodId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        archivedAt,
                        billingProvider,
                        configuration,
                        customerId,
                        deliveryMethod,
                        deliveryMethodConfiguration,
                        deliveryMethodId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CustomerBillingProviderConfiguration{id=$id, archivedAt=$archivedAt, billingProvider=$billingProvider, configuration=$configuration, customerId=$customerId, deliveryMethod=$deliveryMethod, deliveryMethodConfiguration=$deliveryMethodConfiguration, deliveryMethodId=$deliveryMethodId, additionalProperties=$additionalProperties}"
            }

            /**
             * Indicates whether there are more items than the limit for this endpoint. Use the
             * respective list endpoints to get the full lists.
             */
            class HasMore
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val commits: JsonField<Boolean>,
                private val credits: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("commits")
                    @ExcludeMissing
                    commits: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("credits")
                    @ExcludeMissing
                    credits: JsonField<Boolean> = JsonMissing.of(),
                ) : this(commits, credits, mutableMapOf())

                /**
                 * Whether there are more commits on this contract than the limit for this endpoint.
                 * Use the /contracts/customerCommits/list endpoint to get the full list of commits.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun commits(): Boolean = commits.getRequired("commits")

                /**
                 * Whether there are more credits on this contract than the limit for this endpoint.
                 * Use the /contracts/customerCredits/list endpoint to get the full list of credits.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun credits(): Boolean = credits.getRequired("credits")

                /**
                 * Returns the raw JSON value of [commits].
                 *
                 * Unlike [commits], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("commits")
                @ExcludeMissing
                fun _commits(): JsonField<Boolean> = commits

                /**
                 * Returns the raw JSON value of [credits].
                 *
                 * Unlike [credits], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("credits")
                @ExcludeMissing
                fun _credits(): JsonField<Boolean> = credits

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
                     * Returns a mutable builder for constructing an instance of [HasMore].
                     *
                     * The following fields are required:
                     * ```java
                     * .commits()
                     * .credits()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [HasMore]. */
                class Builder internal constructor() {

                    private var commits: JsonField<Boolean>? = null
                    private var credits: JsonField<Boolean>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(hasMore: HasMore) = apply {
                        commits = hasMore.commits
                        credits = hasMore.credits
                        additionalProperties = hasMore.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether there are more commits on this contract than the limit for this
                     * endpoint. Use the /contracts/customerCommits/list endpoint to get the full
                     * list of commits.
                     */
                    fun commits(commits: Boolean) = commits(JsonField.of(commits))

                    /**
                     * Sets [Builder.commits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.commits] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun commits(commits: JsonField<Boolean>) = apply { this.commits = commits }

                    /**
                     * Whether there are more credits on this contract than the limit for this
                     * endpoint. Use the /contracts/customerCredits/list endpoint to get the full
                     * list of credits.
                     */
                    fun credits(credits: Boolean) = credits(JsonField.of(credits))

                    /**
                     * Sets [Builder.credits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.credits] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun credits(credits: JsonField<Boolean>) = apply { this.credits = credits }

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
                     * Returns an immutable instance of [HasMore].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .commits()
                     * .credits()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): HasMore =
                        HasMore(
                            checkRequired("commits", commits),
                            checkRequired("credits", credits),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): HasMore = apply {
                    if (validated) {
                        return@apply
                    }

                    commits()
                    credits()
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
                    (if (commits.asKnown().isPresent) 1 else 0) +
                        (if (credits.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is HasMore &&
                        commits == other.commits &&
                        credits == other.credits &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(commits, credits, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "HasMore{commits=$commits, credits=$credits, additionalProperties=$additionalProperties}"
            }

            /**
             * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
             * automatically. EXPLICIT prioritization requires specifying priorities for each
             * multiplier; the one with the lowest priority value will be prioritized first.
             */
            class MultiplierOverridePrioritization
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

                    @JvmField val LOWEST_MULTIPLIER = of("LOWEST_MULTIPLIER")

                    @JvmField val EXPLICIT = of("EXPLICIT")

                    @JvmStatic
                    fun of(value: String) = MultiplierOverridePrioritization(JsonField.of(value))
                }

                /** An enum containing [MultiplierOverridePrioritization]'s known values. */
                enum class Known {
                    LOWEST_MULTIPLIER,
                    EXPLICIT,
                }

                /**
                 * An enum containing [MultiplierOverridePrioritization]'s known values, as well as
                 * an [_UNKNOWN] member.
                 *
                 * An instance of [MultiplierOverridePrioritization] can contain an unknown value in
                 * a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LOWEST_MULTIPLIER,
                    EXPLICIT,
                    /**
                     * An enum member indicating that [MultiplierOverridePrioritization] was
                     * instantiated with an unknown value.
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
                        LOWEST_MULTIPLIER -> Value.LOWEST_MULTIPLIER
                        EXPLICIT -> Value.EXPLICIT
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

            class RecurringCommit
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val accessAmount: JsonField<AccessAmount>,
                private val commitDuration: JsonField<CommitDuration>,
                private val priority: JsonField<Double>,
                private val product: JsonField<Product>,
                private val rateType: JsonField<RateType>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val applicableProductIds: JsonField<List<String>>,
                private val applicableProductTags: JsonField<List<String>>,
                private val contract: JsonField<InnerContract>,
                private val description: JsonField<String>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
                private val invoiceAmount: JsonField<InvoiceAmount>,
                private val name: JsonField<String>,
                private val netsuiteSalesOrderId: JsonField<String>,
                private val proration: JsonField<Proration>,
                private val prorationRounding: JsonField<ProrationRounding>,
                private val recurrenceFrequency: JsonField<RecurrenceFrequency>,
                private val rolloverFraction: JsonField<Double>,
                private val specifiers: JsonField<List<CommitSpecifier>>,
                private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("access_amount")
                    @ExcludeMissing
                    accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
                    @JsonProperty("commit_duration")
                    @ExcludeMissing
                    commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
                    @JsonProperty("priority")
                    @ExcludeMissing
                    priority: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("product")
                    @ExcludeMissing
                    product: JsonField<Product> = JsonMissing.of(),
                    @JsonProperty("rate_type")
                    @ExcludeMissing
                    rateType: JsonField<RateType> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("applicable_product_ids")
                    @ExcludeMissing
                    applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("applicable_product_tags")
                    @ExcludeMissing
                    applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("contract")
                    @ExcludeMissing
                    contract: JsonField<InnerContract> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("hierarchy_configuration")
                    @ExcludeMissing
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("invoice_amount")
                    @ExcludeMissing
                    invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("netsuite_sales_order_id")
                    @ExcludeMissing
                    netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("proration")
                    @ExcludeMissing
                    proration: JsonField<Proration> = JsonMissing.of(),
                    @JsonProperty("proration_rounding")
                    @ExcludeMissing
                    prorationRounding: JsonField<ProrationRounding> = JsonMissing.of(),
                    @JsonProperty("recurrence_frequency")
                    @ExcludeMissing
                    recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
                    @JsonProperty("rollover_fraction")
                    @ExcludeMissing
                    rolloverFraction: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("specifiers")
                    @ExcludeMissing
                    specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
                    @JsonProperty("subscription_config")
                    @ExcludeMissing
                    subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                        JsonMissing.of(),
                ) : this(
                    id,
                    accessAmount,
                    commitDuration,
                    priority,
                    product,
                    rateType,
                    startingAt,
                    applicableProductIds,
                    applicableProductTags,
                    contract,
                    description,
                    endingBefore,
                    hierarchyConfiguration,
                    invoiceAmount,
                    name,
                    netsuiteSalesOrderId,
                    proration,
                    prorationRounding,
                    recurrenceFrequency,
                    rolloverFraction,
                    specifiers,
                    subscriptionConfig,
                    mutableMapOf(),
                )

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The amount of commit to grant.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

                /**
                 * The amount of time the created commits will be valid for
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun priority(): Double = priority.getRequired("priority")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun product(): Product = product.getRequired("product")

                /**
                 * Whether the created commits will use the commit rate or list rate
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun rateType(): RateType = rateType.getRequired("rate_type")

                /**
                 * Determines the start time for the first commit
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicableProductIds(): Optional<List<String>> =
                    applicableProductIds.getOptional("applicable_product_ids")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicableProductTags(): Optional<List<String>> =
                    applicableProductTags.getOptional("applicable_product_tags")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun contract(): Optional<InnerContract> = contract.getOptional("contract")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * Determines when the contract will stop creating recurring commits. Optional
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endingBefore(): Optional<OffsetDateTime> =
                    endingBefore.getOptional("ending_before")

                /**
                 * Optional configuration for recurring commit/credit hierarchy access control
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                    hierarchyConfiguration.getOptional("hierarchy_configuration")

                /**
                 * The amount the customer should be billed for the commit. Not required.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun invoiceAmount(): Optional<InvoiceAmount> =
                    invoiceAmount.getOptional("invoice_amount")

                /**
                 * Displayed on invoices. Will be passed through to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun netsuiteSalesOrderId(): Optional<String> =
                    netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

                /**
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun proration(): Optional<Proration> = proration.getOptional("proration")

                /**
                 * Rounding configuration for prorated recurring commit amounts.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prorationRounding(): Optional<ProrationRounding> =
                    prorationRounding.getOptional("proration_rounding")

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates. - Daily recurring commits have a limit of one per contract, and
                 * are unable to be created with seat-based subscriptions
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
                    recurrenceFrequency.getOptional("recurrence_frequency")

                /**
                 * Will be passed down to the individual commits. This controls how much of an
                 * individual unexpired commit will roll over upon contract transition. Must be
                 * between 0 and 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun rolloverFraction(): Optional<Double> =
                    rolloverFraction.getOptional("rollover_fraction")

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun specifiers(): Optional<List<CommitSpecifier>> =
                    specifiers.getOptional("specifiers")

                /**
                 * Attach a subscription to the recurring commit/credit.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
                    subscriptionConfig.getOptional("subscription_config")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [accessAmount].
                 *
                 * Unlike [accessAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_amount")
                @ExcludeMissing
                fun _accessAmount(): JsonField<AccessAmount> = accessAmount

                /**
                 * Returns the raw JSON value of [commitDuration].
                 *
                 * Unlike [commitDuration], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("commit_duration")
                @ExcludeMissing
                fun _commitDuration(): JsonField<CommitDuration> = commitDuration

                /**
                 * Returns the raw JSON value of [priority].
                 *
                 * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("priority")
                @ExcludeMissing
                fun _priority(): JsonField<Double> = priority

                /**
                 * Returns the raw JSON value of [product].
                 *
                 * Unlike [product], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("product")
                @ExcludeMissing
                fun _product(): JsonField<Product> = product

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
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
                 * Unlike [applicableProductTags], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("applicable_product_tags")
                @ExcludeMissing
                fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

                /**
                 * Returns the raw JSON value of [contract].
                 *
                 * Unlike [contract], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("contract")
                @ExcludeMissing
                fun _contract(): JsonField<InnerContract> = contract

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /**
                 * Returns the raw JSON value of [hierarchyConfiguration].
                 *
                 * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("hierarchy_configuration")
                @ExcludeMissing
                fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                    hierarchyConfiguration

                /**
                 * Returns the raw JSON value of [invoiceAmount].
                 *
                 * Unlike [invoiceAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_amount")
                @ExcludeMissing
                fun _invoiceAmount(): JsonField<InvoiceAmount> = invoiceAmount

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [netsuiteSalesOrderId].
                 *
                 * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("netsuite_sales_order_id")
                @ExcludeMissing
                fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

                /**
                 * Returns the raw JSON value of [proration].
                 *
                 * Unlike [proration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("proration")
                @ExcludeMissing
                fun _proration(): JsonField<Proration> = proration

                /**
                 * Returns the raw JSON value of [prorationRounding].
                 *
                 * Unlike [prorationRounding], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("proration_rounding")
                @ExcludeMissing
                fun _prorationRounding(): JsonField<ProrationRounding> = prorationRounding

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
                 * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("rollover_fraction")
                @ExcludeMissing
                fun _rolloverFraction(): JsonField<Double> = rolloverFraction

                /**
                 * Returns the raw JSON value of [specifiers].
                 *
                 * Unlike [specifiers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("specifiers")
                @ExcludeMissing
                fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

                /**
                 * Returns the raw JSON value of [subscriptionConfig].
                 *
                 * Unlike [subscriptionConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subscription_config")
                @ExcludeMissing
                fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> =
                    subscriptionConfig

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
                     * .id()
                     * .accessAmount()
                     * .commitDuration()
                     * .priority()
                     * .product()
                     * .rateType()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringCommit]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var accessAmount: JsonField<AccessAmount>? = null
                    private var commitDuration: JsonField<CommitDuration>? = null
                    private var priority: JsonField<Double>? = null
                    private var product: JsonField<Product>? = null
                    private var rateType: JsonField<RateType>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var applicableProductIds: JsonField<MutableList<String>>? = null
                    private var applicableProductTags: JsonField<MutableList<String>>? = null
                    private var contract: JsonField<InnerContract> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                        JsonMissing.of()
                    private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                    private var proration: JsonField<Proration> = JsonMissing.of()
                    private var prorationRounding: JsonField<ProrationRounding> = JsonMissing.of()
                    private var recurrenceFrequency: JsonField<RecurrenceFrequency> =
                        JsonMissing.of()
                    private var rolloverFraction: JsonField<Double> = JsonMissing.of()
                    private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
                    private var subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringCommit: RecurringCommit) = apply {
                        id = recurringCommit.id
                        accessAmount = recurringCommit.accessAmount
                        commitDuration = recurringCommit.commitDuration
                        priority = recurringCommit.priority
                        product = recurringCommit.product
                        rateType = recurringCommit.rateType
                        startingAt = recurringCommit.startingAt
                        applicableProductIds =
                            recurringCommit.applicableProductIds.map { it.toMutableList() }
                        applicableProductTags =
                            recurringCommit.applicableProductTags.map { it.toMutableList() }
                        contract = recurringCommit.contract
                        description = recurringCommit.description
                        endingBefore = recurringCommit.endingBefore
                        hierarchyConfiguration = recurringCommit.hierarchyConfiguration
                        invoiceAmount = recurringCommit.invoiceAmount
                        name = recurringCommit.name
                        netsuiteSalesOrderId = recurringCommit.netsuiteSalesOrderId
                        proration = recurringCommit.proration
                        prorationRounding = recurringCommit.prorationRounding
                        recurrenceFrequency = recurringCommit.recurrenceFrequency
                        rolloverFraction = recurringCommit.rolloverFraction
                        specifiers = recurringCommit.specifiers.map { it.toMutableList() }
                        subscriptionConfig = recurringCommit.subscriptionConfig
                        additionalProperties = recurringCommit.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The amount of commit to grant. */
                    fun accessAmount(accessAmount: AccessAmount) =
                        accessAmount(JsonField.of(accessAmount))

                    /**
                     * Sets [Builder.accessAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessAmount] with a well-typed
                     * [AccessAmount] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                        this.accessAmount = accessAmount
                    }

                    /** The amount of time the created commits will be valid for */
                    fun commitDuration(commitDuration: CommitDuration) =
                        commitDuration(JsonField.of(commitDuration))

                    /**
                     * Sets [Builder.commitDuration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.commitDuration] with a well-typed
                     * [CommitDuration] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                        this.commitDuration = commitDuration
                    }

                    /** Will be passed down to the individual commits */
                    fun priority(priority: Double) = priority(JsonField.of(priority))

                    /**
                     * Sets [Builder.priority] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.priority] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                    fun product(product: Product) = product(JsonField.of(product))

                    /**
                     * Sets [Builder.product] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.product] with a well-typed [Product] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun product(product: JsonField<Product>) = apply { this.product = product }

                    /** Whether the created commits will use the commit rate or list rate */
                    fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                    /**
                     * Sets [Builder.rateType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rateType] with a well-typed [RateType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                    /** Determines the start time for the first commit */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /** Will be passed down to the individual commits */
                    fun applicableProductIds(applicableProductIds: List<String>) =
                        applicableProductIds(JsonField.of(applicableProductIds))

                    /**
                     * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicableProductIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun applicableProductIds(applicableProductIds: JsonField<List<String>>) =
                        apply {
                            this.applicableProductIds =
                                applicableProductIds.map { it.toMutableList() }
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
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun applicableProductTags(applicableProductTags: JsonField<List<String>>) =
                        apply {
                            this.applicableProductTags =
                                applicableProductTags.map { it.toMutableList() }
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

                    fun contract(contract: InnerContract) = contract(JsonField.of(contract))

                    /**
                     * Sets [Builder.contract] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contract] with a well-typed [InnerContract]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contract(contract: JsonField<InnerContract>) = apply {
                        this.contract = contract
                    }

                    /** Will be passed down to the individual commits */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Determines when the contract will stop creating recurring commits. Optional
                     */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    /**
                     * Optional configuration for recurring commit/credit hierarchy access control
                     */
                    fun hierarchyConfiguration(
                        hierarchyConfiguration: CommitHierarchyConfiguration
                    ) = hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                    /**
                     * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hierarchyConfiguration] with a well-typed
                     * [CommitHierarchyConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun hierarchyConfiguration(
                        hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                    ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                    /** The amount the customer should be billed for the commit. Not required. */
                    fun invoiceAmount(invoiceAmount: InvoiceAmount) =
                        invoiceAmount(JsonField.of(invoiceAmount))

                    /**
                     * Sets [Builder.invoiceAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceAmount] with a well-typed
                     * [InvoiceAmount] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun invoiceAmount(invoiceAmount: JsonField<InvoiceAmount>) = apply {
                        this.invoiceAmount = invoiceAmount
                    }

                    /** Displayed on invoices. Will be passed through to the individual commits */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Will be passed down to the individual commits */
                    fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                        netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                    /**
                     * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                        this.netsuiteSalesOrderId = netsuiteSalesOrderId
                    }

                    /**
                     * Determines whether the first and last commit will be prorated. If not
                     * provided, the default is FIRST_AND_LAST (i.e. prorate both the first and last
                     * commits).
                     */
                    fun proration(proration: Proration) = proration(JsonField.of(proration))

                    /**
                     * Sets [Builder.proration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.proration] with a well-typed [Proration]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun proration(proration: JsonField<Proration>) = apply {
                        this.proration = proration
                    }

                    /** Rounding configuration for prorated recurring commit amounts. */
                    fun prorationRounding(prorationRounding: ProrationRounding?) =
                        prorationRounding(JsonField.ofNullable(prorationRounding))

                    /**
                     * Alias for calling [Builder.prorationRounding] with
                     * `prorationRounding.orElse(null)`.
                     */
                    fun prorationRounding(prorationRounding: Optional<ProrationRounding>) =
                        prorationRounding(prorationRounding.getOrNull())

                    /**
                     * Sets [Builder.prorationRounding] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prorationRounding] with a well-typed
                     * [ProrationRounding] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun prorationRounding(prorationRounding: JsonField<ProrationRounding>) = apply {
                        this.prorationRounding = prorationRounding
                    }

                    /**
                     * The frequency at which the recurring commits will be created. If not
                     * provided: - The commits will be created on the usage invoice frequency. If
                     * provided: - The period defined in the duration will correspond to this
                     * frequency. - Commits will be created aligned with the recurring commit's
                     * starting_at rather than the usage invoice dates. - Daily recurring commits
                     * have a limit of one per contract, and are unable to be created with
                     * seat-based subscriptions
                     */
                    fun recurrenceFrequency(recurrenceFrequency: RecurrenceFrequency) =
                        recurrenceFrequency(JsonField.of(recurrenceFrequency))

                    /**
                     * Sets [Builder.recurrenceFrequency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recurrenceFrequency] with a well-typed
                     * [RecurrenceFrequency] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun recurrenceFrequency(recurrenceFrequency: JsonField<RecurrenceFrequency>) =
                        apply {
                            this.recurrenceFrequency = recurrenceFrequency
                        }

                    /**
                     * Will be passed down to the individual commits. This controls how much of an
                     * individual unexpired commit will roll over upon contract transition. Must be
                     * between 0 and 1.
                     */
                    fun rolloverFraction(rolloverFraction: Double) =
                        rolloverFraction(JsonField.of(rolloverFraction))

                    /**
                     * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rolloverFraction] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                        this.rolloverFraction = rolloverFraction
                    }

                    /**
                     * List of filters that determine what kind of customer usage draws down a
                     * commit or credit. A customer's usage needs to meet the condition of at least
                     * one of the specifiers to contribute to a commit's or credit's drawdown.
                     */
                    fun specifiers(specifiers: List<CommitSpecifier>) =
                        specifiers(JsonField.of(specifiers))

                    /**
                     * Sets [Builder.specifiers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specifiers] with a well-typed
                     * `List<CommitSpecifier>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                        this.specifiers = specifiers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [CommitSpecifier] to [specifiers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSpecifier(specifier: CommitSpecifier) = apply {
                        specifiers =
                            (specifiers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("specifiers", it).add(specifier)
                            }
                    }

                    /** Attach a subscription to the recurring commit/credit. */
                    fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                        subscriptionConfig(JsonField.of(subscriptionConfig))

                    /**
                     * Sets [Builder.subscriptionConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subscriptionConfig] with a well-typed
                     * [RecurringCommitSubscriptionConfig] value instead. This method is primarily
                     * for setting the field to an undocumented or not yet supported value.
                     */
                    fun subscriptionConfig(
                        subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig>
                    ) = apply { this.subscriptionConfig = subscriptionConfig }

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
                     * Returns an immutable instance of [RecurringCommit].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .accessAmount()
                     * .commitDuration()
                     * .priority()
                     * .product()
                     * .rateType()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RecurringCommit =
                        RecurringCommit(
                            checkRequired("id", id),
                            checkRequired("accessAmount", accessAmount),
                            checkRequired("commitDuration", commitDuration),
                            checkRequired("priority", priority),
                            checkRequired("product", product),
                            checkRequired("rateType", rateType),
                            checkRequired("startingAt", startingAt),
                            (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                            (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                            contract,
                            description,
                            endingBefore,
                            hierarchyConfiguration,
                            invoiceAmount,
                            name,
                            netsuiteSalesOrderId,
                            proration,
                            prorationRounding,
                            recurrenceFrequency,
                            rolloverFraction,
                            (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                            subscriptionConfig,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): RecurringCommit = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    accessAmount().validate()
                    commitDuration().validate()
                    priority()
                    product().validate()
                    rateType().validate()
                    startingAt()
                    applicableProductIds()
                    applicableProductTags()
                    contract().ifPresent { it.validate() }
                    description()
                    endingBefore()
                    hierarchyConfiguration().ifPresent { it.validate() }
                    invoiceAmount().ifPresent { it.validate() }
                    name()
                    netsuiteSalesOrderId()
                    proration().ifPresent { it.validate() }
                    prorationRounding().ifPresent { it.validate() }
                    recurrenceFrequency().ifPresent { it.validate() }
                    rolloverFraction()
                    specifiers().ifPresent { it.forEach { it.validate() } }
                    subscriptionConfig().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (accessAmount.asKnown().getOrNull()?.validity() ?: 0) +
                        (commitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (priority.asKnown().isPresent) 1 else 0) +
                        (product.asKnown().getOrNull()?.validity() ?: 0) +
                        (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                        (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                        (contract.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0) +
                        (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                        (invoiceAmount.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                        (proration.asKnown().getOrNull()?.validity() ?: 0) +
                        (prorationRounding.asKnown().getOrNull()?.validity() ?: 0) +
                        (recurrenceFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                        (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (subscriptionConfig.asKnown().getOrNull()?.validity() ?: 0)

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
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                    /**
                     * Returns the raw JSON value of [creditTypeId].
                     *
                     * Unlike [creditTypeId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("credit_type_id")
                    @ExcludeMissing
                    fun _creditTypeId(): JsonField<String> = creditTypeId

                    /**
                     * Returns the raw JSON value of [unitPrice].
                     *
                     * Unlike [unitPrice], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    /**
                     * Returns the raw JSON value of [quantity].
                     *
                     * Unlike [quantity], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accessAmount: AccessAmount) = apply {
                            creditTypeId = accessAmount.creditTypeId
                            unitPrice = accessAmount.unitPrice
                            quantity = accessAmount.quantity
                            additionalProperties = accessAmount.additionalProperties.toMutableMap()
                        }

                        fun creditTypeId(creditTypeId: String) =
                            creditTypeId(JsonField.of(creditTypeId))

                        /**
                         * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.creditTypeId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                            this.creditTypeId = creditTypeId
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        /**
                         * Sets [Builder.unitPrice] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitPrice] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
                        }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        /**
                         * Sets [Builder.quantity] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.quantity] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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

                /** The amount of time the created commits will be valid for */
                class CommitDuration
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val value: JsonField<Double>,
                    private val unit: JsonField<Unit>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                    ) : this(value, unit, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Double = value.getRequired("value")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun unit(): Optional<Unit> = unit.getOptional("unit")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [CommitDuration].
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(commitDuration: CommitDuration) = apply {
                            value = commitDuration.value
                            unit = commitDuration.unit
                            additionalProperties =
                                commitDuration.additionalProperties.toMutableMap()
                        }

                        fun value(value: Double) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Double>) = apply { this.value = value }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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

                            @JvmField val PERIODS = of("PERIODS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            PERIODS
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
                            PERIODS,
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
                                PERIODS -> Value.PERIODS
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
                                PERIODS -> Known.PERIODS
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

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws MetronomeInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
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

                        return other is CommitDuration &&
                            value == other.value &&
                            unit == other.unit &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(value, unit, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
                }

                class Product
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                    ) : this(id, name, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [Product].
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Product]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(product: Product) = apply {
                            id = product.id
                            name = product.name
                            additionalProperties = product.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

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
                         * Returns an immutable instance of [Product].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Product =
                            Product(
                                checkRequired("id", id),
                                checkRequired("name", name),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Product = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
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
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Product &&
                            id == other.id &&
                            name == other.name &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(id, name, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
                }

                /** Whether the created commits will use the commit rate or list rate */
                class RateType
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
                     * An enum containing [RateType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [RateType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        COMMIT_RATE,
                        LIST_RATE,
                        /**
                         * An enum member indicating that [RateType] was instantiated with an
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
                            COMMIT_RATE -> Value.COMMIT_RATE
                            LIST_RATE -> Value.LIST_RATE
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
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RateType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class InnerContract
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
                    ) : this(id, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                         * [InnerContract].
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerContract]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerContract: InnerContract) = apply {
                            id = innerContract.id
                            additionalProperties = innerContract.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

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
                         * Returns an immutable instance of [InnerContract].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): InnerContract =
                            InnerContract(
                                checkRequired("id", id),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): InnerContract = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
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
                    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InnerContract &&
                            id == other.id &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerContract{id=$id, additionalProperties=$additionalProperties}"
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
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun quantity(): Double = quantity.getRequired("quantity")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                    /**
                     * Returns the raw JSON value of [creditTypeId].
                     *
                     * Unlike [creditTypeId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("credit_type_id")
                    @ExcludeMissing
                    fun _creditTypeId(): JsonField<String> = creditTypeId

                    /**
                     * Returns the raw JSON value of [quantity].
                     *
                     * Unlike [quantity], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    /**
                     * Returns the raw JSON value of [unitPrice].
                     *
                     * Unlike [unitPrice], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [InvoiceAmount].
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(invoiceAmount: InvoiceAmount) = apply {
                            creditTypeId = invoiceAmount.creditTypeId
                            quantity = invoiceAmount.quantity
                            unitPrice = invoiceAmount.unitPrice
                            additionalProperties = invoiceAmount.additionalProperties.toMutableMap()
                        }

                        fun creditTypeId(creditTypeId: String) =
                            creditTypeId(JsonField.of(creditTypeId))

                        /**
                         * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.creditTypeId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                            this.creditTypeId = creditTypeId
                        }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        /**
                         * Sets [Builder.quantity] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.quantity] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        /**
                         * Sets [Builder.unitPrice] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitPrice] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 */
                class Proration
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
                     * An enum containing [Proration]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Proration] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NONE,
                        FIRST,
                        LAST,
                        FIRST_AND_LAST,
                        /**
                         * An enum member indicating that [Proration] was instantiated with an
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
                            NONE -> Value.NONE
                            FIRST -> Value.FIRST
                            LAST -> Value.LAST
                            FIRST_AND_LAST -> Value.FIRST_AND_LAST
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
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Proration && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Rounding configuration for prorated recurring commit amounts. */
                class ProrationRounding
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val access: JsonField<Access>,
                    private val invoice: JsonField<Invoice>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("access")
                        @ExcludeMissing
                        access: JsonField<Access> = JsonMissing.of(),
                        @JsonProperty("invoice")
                        @ExcludeMissing
                        invoice: JsonField<Invoice> = JsonMissing.of(),
                    ) : this(access, invoice, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun access(): Optional<Access> = access.getOptional("access")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun invoice(): Optional<Invoice> = invoice.getOptional("invoice")

                    /**
                     * Returns the raw JSON value of [access].
                     *
                     * Unlike [access], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("access")
                    @ExcludeMissing
                    fun _access(): JsonField<Access> = access

                    /**
                     * Returns the raw JSON value of [invoice].
                     *
                     * Unlike [invoice], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("invoice")
                    @ExcludeMissing
                    fun _invoice(): JsonField<Invoice> = invoice

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
                         * [ProrationRounding].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ProrationRounding]. */
                    class Builder internal constructor() {

                        private var access: JsonField<Access> = JsonMissing.of()
                        private var invoice: JsonField<Invoice> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(prorationRounding: ProrationRounding) = apply {
                            access = prorationRounding.access
                            invoice = prorationRounding.invoice
                            additionalProperties =
                                prorationRounding.additionalProperties.toMutableMap()
                        }

                        fun access(access: Access) = access(JsonField.of(access))

                        /**
                         * Sets [Builder.access] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.access] with a well-typed [Access] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun access(access: JsonField<Access>) = apply { this.access = access }

                        fun invoice(invoice: Invoice) = invoice(JsonField.of(invoice))

                        /**
                         * Sets [Builder.invoice] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.invoice] with a well-typed [Invoice]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

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
                         * Returns an immutable instance of [ProrationRounding].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ProrationRounding =
                            ProrationRounding(access, invoice, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ProrationRounding = apply {
                        if (validated) {
                            return@apply
                        }

                        access().ifPresent { it.validate() }
                        invoice().ifPresent { it.validate() }
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
                        (access.asKnown().getOrNull()?.validity() ?: 0) +
                            (invoice.asKnown().getOrNull()?.validity() ?: 0)

                    class Access
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val decimalPlaces: JsonField<Double>,
                        private val roundingMethod: JsonField<RoundingMethod>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("decimal_places")
                            @ExcludeMissing
                            decimalPlaces: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("rounding_method")
                            @ExcludeMissing
                            roundingMethod: JsonField<RoundingMethod> = JsonMissing.of(),
                        ) : this(decimalPlaces, roundingMethod, mutableMapOf())

                        /**
                         * Number of decimal places to round to. Applied directly to the stored
                         * monetary representation. Negative values round to powers of 10 (e.g., -2
                         * rounds to nearest 100 in the stored unit. For USD, this means rounding to
                         * the nearest dollar).
                         *
                         * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun decimalPlaces(): Double = decimalPlaces.getRequired("decimal_places")

                        /**
                         * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun roundingMethod(): RoundingMethod =
                            roundingMethod.getRequired("rounding_method")

                        /**
                         * Returns the raw JSON value of [decimalPlaces].
                         *
                         * Unlike [decimalPlaces], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("decimal_places")
                        @ExcludeMissing
                        fun _decimalPlaces(): JsonField<Double> = decimalPlaces

                        /**
                         * Returns the raw JSON value of [roundingMethod].
                         *
                         * Unlike [roundingMethod], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("rounding_method")
                        @ExcludeMissing
                        fun _roundingMethod(): JsonField<RoundingMethod> = roundingMethod

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
                             * Returns a mutable builder for constructing an instance of [Access].
                             *
                             * The following fields are required:
                             * ```java
                             * .decimalPlaces()
                             * .roundingMethod()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Access]. */
                        class Builder internal constructor() {

                            private var decimalPlaces: JsonField<Double>? = null
                            private var roundingMethod: JsonField<RoundingMethod>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(access: Access) = apply {
                                decimalPlaces = access.decimalPlaces
                                roundingMethod = access.roundingMethod
                                additionalProperties = access.additionalProperties.toMutableMap()
                            }

                            /**
                             * Number of decimal places to round to. Applied directly to the stored
                             * monetary representation. Negative values round to powers of 10 (e.g.,
                             * -2 rounds to nearest 100 in the stored unit. For USD, this means
                             * rounding to the nearest dollar).
                             */
                            fun decimalPlaces(decimalPlaces: Double) =
                                decimalPlaces(JsonField.of(decimalPlaces))

                            /**
                             * Sets [Builder.decimalPlaces] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.decimalPlaces] with a well-typed
                             * [Double] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun decimalPlaces(decimalPlaces: JsonField<Double>) = apply {
                                this.decimalPlaces = decimalPlaces
                            }

                            fun roundingMethod(roundingMethod: RoundingMethod) =
                                roundingMethod(JsonField.of(roundingMethod))

                            /**
                             * Sets [Builder.roundingMethod] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.roundingMethod] with a well-typed
                             * [RoundingMethod] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun roundingMethod(roundingMethod: JsonField<RoundingMethod>) = apply {
                                this.roundingMethod = roundingMethod
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

                            /**
                             * Returns an immutable instance of [Access].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .decimalPlaces()
                             * .roundingMethod()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Access =
                                Access(
                                    checkRequired("decimalPlaces", decimalPlaces),
                                    checkRequired("roundingMethod", roundingMethod),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws MetronomeInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Access = apply {
                            if (validated) {
                                return@apply
                            }

                            decimalPlaces()
                            roundingMethod().validate()
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
                        internal fun validity(): Int =
                            (if (decimalPlaces.asKnown().isPresent) 1 else 0) +
                                (roundingMethod.asKnown().getOrNull()?.validity() ?: 0)

                        class RoundingMethod
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val HALF_UP = of("HALF_UP")

                                @JvmField val FLOOR = of("FLOOR")

                                @JvmField val CEILING = of("CEILING")

                                @JvmStatic
                                fun of(value: String) = RoundingMethod(JsonField.of(value))
                            }

                            /** An enum containing [RoundingMethod]'s known values. */
                            enum class Known {
                                HALF_UP,
                                FLOOR,
                                CEILING,
                            }

                            /**
                             * An enum containing [RoundingMethod]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [RoundingMethod] can contain an unknown value in a
                             * couple of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                HALF_UP,
                                FLOOR,
                                CEILING,
                                /**
                                 * An enum member indicating that [RoundingMethod] was instantiated
                                 * with an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    HALF_UP -> Value.HALF_UP
                                    FLOOR -> Value.FLOOR
                                    CEILING -> Value.CEILING
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws MetronomeInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    HALF_UP -> Known.HALF_UP
                                    FLOOR -> Known.FLOOR
                                    CEILING -> Known.CEILING
                                    else ->
                                        throw MetronomeInvalidDataException(
                                            "Unknown RoundingMethod: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws MetronomeInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    MetronomeInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws MetronomeInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): RoundingMethod = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is RoundingMethod && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Access &&
                                decimalPlaces == other.decimalPlaces &&
                                roundingMethod == other.roundingMethod &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(decimalPlaces, roundingMethod, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Access{decimalPlaces=$decimalPlaces, roundingMethod=$roundingMethod, additionalProperties=$additionalProperties}"
                    }

                    class Invoice
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val decimalPlaces: JsonField<Double>,
                        private val roundingMethod: JsonField<RoundingMethod>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("decimal_places")
                            @ExcludeMissing
                            decimalPlaces: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("rounding_method")
                            @ExcludeMissing
                            roundingMethod: JsonField<RoundingMethod> = JsonMissing.of(),
                        ) : this(decimalPlaces, roundingMethod, mutableMapOf())

                        /**
                         * Number of decimal places to round to. Applied directly to the stored
                         * monetary representation. Negative values round to powers of 10 (e.g., -2
                         * rounds to nearest 100 in the stored unit. For USD, this means rounding to
                         * the nearest dollar).
                         *
                         * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun decimalPlaces(): Double = decimalPlaces.getRequired("decimal_places")

                        /**
                         * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun roundingMethod(): RoundingMethod =
                            roundingMethod.getRequired("rounding_method")

                        /**
                         * Returns the raw JSON value of [decimalPlaces].
                         *
                         * Unlike [decimalPlaces], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("decimal_places")
                        @ExcludeMissing
                        fun _decimalPlaces(): JsonField<Double> = decimalPlaces

                        /**
                         * Returns the raw JSON value of [roundingMethod].
                         *
                         * Unlike [roundingMethod], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("rounding_method")
                        @ExcludeMissing
                        fun _roundingMethod(): JsonField<RoundingMethod> = roundingMethod

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
                             * Returns a mutable builder for constructing an instance of [Invoice].
                             *
                             * The following fields are required:
                             * ```java
                             * .decimalPlaces()
                             * .roundingMethod()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Invoice]. */
                        class Builder internal constructor() {

                            private var decimalPlaces: JsonField<Double>? = null
                            private var roundingMethod: JsonField<RoundingMethod>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(invoice: Invoice) = apply {
                                decimalPlaces = invoice.decimalPlaces
                                roundingMethod = invoice.roundingMethod
                                additionalProperties = invoice.additionalProperties.toMutableMap()
                            }

                            /**
                             * Number of decimal places to round to. Applied directly to the stored
                             * monetary representation. Negative values round to powers of 10 (e.g.,
                             * -2 rounds to nearest 100 in the stored unit. For USD, this means
                             * rounding to the nearest dollar).
                             */
                            fun decimalPlaces(decimalPlaces: Double) =
                                decimalPlaces(JsonField.of(decimalPlaces))

                            /**
                             * Sets [Builder.decimalPlaces] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.decimalPlaces] with a well-typed
                             * [Double] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun decimalPlaces(decimalPlaces: JsonField<Double>) = apply {
                                this.decimalPlaces = decimalPlaces
                            }

                            fun roundingMethod(roundingMethod: RoundingMethod) =
                                roundingMethod(JsonField.of(roundingMethod))

                            /**
                             * Sets [Builder.roundingMethod] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.roundingMethod] with a well-typed
                             * [RoundingMethod] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun roundingMethod(roundingMethod: JsonField<RoundingMethod>) = apply {
                                this.roundingMethod = roundingMethod
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

                            /**
                             * Returns an immutable instance of [Invoice].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .decimalPlaces()
                             * .roundingMethod()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Invoice =
                                Invoice(
                                    checkRequired("decimalPlaces", decimalPlaces),
                                    checkRequired("roundingMethod", roundingMethod),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws MetronomeInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Invoice = apply {
                            if (validated) {
                                return@apply
                            }

                            decimalPlaces()
                            roundingMethod().validate()
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
                        internal fun validity(): Int =
                            (if (decimalPlaces.asKnown().isPresent) 1 else 0) +
                                (roundingMethod.asKnown().getOrNull()?.validity() ?: 0)

                        class RoundingMethod
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val HALF_UP = of("HALF_UP")

                                @JvmField val FLOOR = of("FLOOR")

                                @JvmField val CEILING = of("CEILING")

                                @JvmStatic
                                fun of(value: String) = RoundingMethod(JsonField.of(value))
                            }

                            /** An enum containing [RoundingMethod]'s known values. */
                            enum class Known {
                                HALF_UP,
                                FLOOR,
                                CEILING,
                            }

                            /**
                             * An enum containing [RoundingMethod]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [RoundingMethod] can contain an unknown value in a
                             * couple of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                HALF_UP,
                                FLOOR,
                                CEILING,
                                /**
                                 * An enum member indicating that [RoundingMethod] was instantiated
                                 * with an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    HALF_UP -> Value.HALF_UP
                                    FLOOR -> Value.FLOOR
                                    CEILING -> Value.CEILING
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws MetronomeInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    HALF_UP -> Known.HALF_UP
                                    FLOOR -> Known.FLOOR
                                    CEILING -> Known.CEILING
                                    else ->
                                        throw MetronomeInvalidDataException(
                                            "Unknown RoundingMethod: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws MetronomeInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    MetronomeInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws MetronomeInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): RoundingMethod = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is RoundingMethod && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Invoice &&
                                decimalPlaces == other.decimalPlaces &&
                                roundingMethod == other.roundingMethod &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(decimalPlaces, roundingMethod, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Invoice{decimalPlaces=$decimalPlaces, roundingMethod=$roundingMethod, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ProrationRounding &&
                            access == other.access &&
                            invoice == other.invoice &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(access, invoice, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ProrationRounding{access=$access, invoice=$invoice, additionalProperties=$additionalProperties}"
                }

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates. - Daily recurring commits have a limit of one per contract, and
                 * are unable to be created with seat-based subscriptions
                 */
                class RecurrenceFrequency
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

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmField val WEEKLY = of("WEEKLY")

                        @JvmField val DAILY = of("DAILY")

                        @JvmStatic fun of(value: String) = RecurrenceFrequency(JsonField.of(value))
                    }

                    /** An enum containing [RecurrenceFrequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        ANNUAL,
                        WEEKLY,
                        DAILY,
                    }

                    /**
                     * An enum containing [RecurrenceFrequency]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [RecurrenceFrequency] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        ANNUAL,
                        WEEKLY,
                        DAILY,
                        /**
                         * An enum member indicating that [RecurrenceFrequency] was instantiated
                         * with an unknown value.
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
                            ANNUAL -> Value.ANNUAL
                            WEEKLY -> Value.WEEKLY
                            DAILY -> Value.DAILY
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
                            ANNUAL -> Known.ANNUAL
                            WEEKLY -> Known.WEEKLY
                            DAILY -> Known.DAILY
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown RecurrenceFrequency: $value"
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

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RecurrenceFrequency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecurringCommit &&
                        id == other.id &&
                        accessAmount == other.accessAmount &&
                        commitDuration == other.commitDuration &&
                        priority == other.priority &&
                        product == other.product &&
                        rateType == other.rateType &&
                        startingAt == other.startingAt &&
                        applicableProductIds == other.applicableProductIds &&
                        applicableProductTags == other.applicableProductTags &&
                        contract == other.contract &&
                        description == other.description &&
                        endingBefore == other.endingBefore &&
                        hierarchyConfiguration == other.hierarchyConfiguration &&
                        invoiceAmount == other.invoiceAmount &&
                        name == other.name &&
                        netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                        proration == other.proration &&
                        prorationRounding == other.prorationRounding &&
                        recurrenceFrequency == other.recurrenceFrequency &&
                        rolloverFraction == other.rolloverFraction &&
                        specifiers == other.specifiers &&
                        subscriptionConfig == other.subscriptionConfig &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        accessAmount,
                        commitDuration,
                        priority,
                        product,
                        rateType,
                        startingAt,
                        applicableProductIds,
                        applicableProductTags,
                        contract,
                        description,
                        endingBefore,
                        hierarchyConfiguration,
                        invoiceAmount,
                        name,
                        netsuiteSalesOrderId,
                        proration,
                        prorationRounding,
                        recurrenceFrequency,
                        rolloverFraction,
                        specifiers,
                        subscriptionConfig,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringCommit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, invoiceAmount=$invoiceAmount, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, prorationRounding=$prorationRounding, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
            }

            class RecurringCredit
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val accessAmount: JsonField<AccessAmount>,
                private val commitDuration: JsonField<CommitDuration>,
                private val priority: JsonField<Double>,
                private val product: JsonField<Product>,
                private val rateType: JsonField<RateType>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val applicableProductIds: JsonField<List<String>>,
                private val applicableProductTags: JsonField<List<String>>,
                private val contract: JsonField<InnerContract>,
                private val description: JsonField<String>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
                private val name: JsonField<String>,
                private val netsuiteSalesOrderId: JsonField<String>,
                private val proration: JsonField<Proration>,
                private val prorationRounding: JsonField<ProrationRounding>,
                private val recurrenceFrequency: JsonField<RecurrenceFrequency>,
                private val rolloverFraction: JsonField<Double>,
                private val specifiers: JsonField<List<CommitSpecifier>>,
                private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("access_amount")
                    @ExcludeMissing
                    accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
                    @JsonProperty("commit_duration")
                    @ExcludeMissing
                    commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
                    @JsonProperty("priority")
                    @ExcludeMissing
                    priority: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("product")
                    @ExcludeMissing
                    product: JsonField<Product> = JsonMissing.of(),
                    @JsonProperty("rate_type")
                    @ExcludeMissing
                    rateType: JsonField<RateType> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("applicable_product_ids")
                    @ExcludeMissing
                    applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("applicable_product_tags")
                    @ExcludeMissing
                    applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("contract")
                    @ExcludeMissing
                    contract: JsonField<InnerContract> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("hierarchy_configuration")
                    @ExcludeMissing
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("netsuite_sales_order_id")
                    @ExcludeMissing
                    netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("proration")
                    @ExcludeMissing
                    proration: JsonField<Proration> = JsonMissing.of(),
                    @JsonProperty("proration_rounding")
                    @ExcludeMissing
                    prorationRounding: JsonField<ProrationRounding> = JsonMissing.of(),
                    @JsonProperty("recurrence_frequency")
                    @ExcludeMissing
                    recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
                    @JsonProperty("rollover_fraction")
                    @ExcludeMissing
                    rolloverFraction: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("specifiers")
                    @ExcludeMissing
                    specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
                    @JsonProperty("subscription_config")
                    @ExcludeMissing
                    subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                        JsonMissing.of(),
                ) : this(
                    id,
                    accessAmount,
                    commitDuration,
                    priority,
                    product,
                    rateType,
                    startingAt,
                    applicableProductIds,
                    applicableProductTags,
                    contract,
                    description,
                    endingBefore,
                    hierarchyConfiguration,
                    name,
                    netsuiteSalesOrderId,
                    proration,
                    prorationRounding,
                    recurrenceFrequency,
                    rolloverFraction,
                    specifiers,
                    subscriptionConfig,
                    mutableMapOf(),
                )

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The amount of commit to grant.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

                /**
                 * The amount of time the created commits will be valid for
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun priority(): Double = priority.getRequired("priority")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun product(): Product = product.getRequired("product")

                /**
                 * Whether the created commits will use the commit rate or list rate
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun rateType(): RateType = rateType.getRequired("rate_type")

                /**
                 * Determines the start time for the first commit
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicableProductIds(): Optional<List<String>> =
                    applicableProductIds.getOptional("applicable_product_ids")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicableProductTags(): Optional<List<String>> =
                    applicableProductTags.getOptional("applicable_product_tags")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun contract(): Optional<InnerContract> = contract.getOptional("contract")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * Determines when the contract will stop creating recurring commits. Optional
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endingBefore(): Optional<OffsetDateTime> =
                    endingBefore.getOptional("ending_before")

                /**
                 * Optional configuration for recurring commit/credit hierarchy access control
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                    hierarchyConfiguration.getOptional("hierarchy_configuration")

                /**
                 * Displayed on invoices. Will be passed through to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Will be passed down to the individual commits
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun netsuiteSalesOrderId(): Optional<String> =
                    netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

                /**
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun proration(): Optional<Proration> = proration.getOptional("proration")

                /**
                 * Rounding configuration for prorated recurring credit amounts.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prorationRounding(): Optional<ProrationRounding> =
                    prorationRounding.getOptional("proration_rounding")

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates. - Daily recurring commits have a limit of one per contract, and
                 * are unable to be created with seat-based subscriptions
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
                    recurrenceFrequency.getOptional("recurrence_frequency")

                /**
                 * Will be passed down to the individual commits. This controls how much of an
                 * individual unexpired commit will roll over upon contract transition. Must be
                 * between 0 and 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun rolloverFraction(): Optional<Double> =
                    rolloverFraction.getOptional("rollover_fraction")

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun specifiers(): Optional<List<CommitSpecifier>> =
                    specifiers.getOptional("specifiers")

                /**
                 * Attach a subscription to the recurring commit/credit.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
                    subscriptionConfig.getOptional("subscription_config")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [accessAmount].
                 *
                 * Unlike [accessAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_amount")
                @ExcludeMissing
                fun _accessAmount(): JsonField<AccessAmount> = accessAmount

                /**
                 * Returns the raw JSON value of [commitDuration].
                 *
                 * Unlike [commitDuration], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("commit_duration")
                @ExcludeMissing
                fun _commitDuration(): JsonField<CommitDuration> = commitDuration

                /**
                 * Returns the raw JSON value of [priority].
                 *
                 * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("priority")
                @ExcludeMissing
                fun _priority(): JsonField<Double> = priority

                /**
                 * Returns the raw JSON value of [product].
                 *
                 * Unlike [product], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("product")
                @ExcludeMissing
                fun _product(): JsonField<Product> = product

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
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
                 * Unlike [applicableProductTags], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("applicable_product_tags")
                @ExcludeMissing
                fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

                /**
                 * Returns the raw JSON value of [contract].
                 *
                 * Unlike [contract], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("contract")
                @ExcludeMissing
                fun _contract(): JsonField<InnerContract> = contract

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /**
                 * Returns the raw JSON value of [hierarchyConfiguration].
                 *
                 * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("hierarchy_configuration")
                @ExcludeMissing
                fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                    hierarchyConfiguration

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [netsuiteSalesOrderId].
                 *
                 * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("netsuite_sales_order_id")
                @ExcludeMissing
                fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

                /**
                 * Returns the raw JSON value of [proration].
                 *
                 * Unlike [proration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("proration")
                @ExcludeMissing
                fun _proration(): JsonField<Proration> = proration

                /**
                 * Returns the raw JSON value of [prorationRounding].
                 *
                 * Unlike [prorationRounding], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("proration_rounding")
                @ExcludeMissing
                fun _prorationRounding(): JsonField<ProrationRounding> = prorationRounding

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
                 * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("rollover_fraction")
                @ExcludeMissing
                fun _rolloverFraction(): JsonField<Double> = rolloverFraction

                /**
                 * Returns the raw JSON value of [specifiers].
                 *
                 * Unlike [specifiers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("specifiers")
                @ExcludeMissing
                fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

                /**
                 * Returns the raw JSON value of [subscriptionConfig].
                 *
                 * Unlike [subscriptionConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subscription_config")
                @ExcludeMissing
                fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> =
                    subscriptionConfig

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
                     * .id()
                     * .accessAmount()
                     * .commitDuration()
                     * .priority()
                     * .product()
                     * .rateType()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringCredit]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var accessAmount: JsonField<AccessAmount>? = null
                    private var commitDuration: JsonField<CommitDuration>? = null
                    private var priority: JsonField<Double>? = null
                    private var product: JsonField<Product>? = null
                    private var rateType: JsonField<RateType>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var applicableProductIds: JsonField<MutableList<String>>? = null
                    private var applicableProductTags: JsonField<MutableList<String>>? = null
                    private var contract: JsonField<InnerContract> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                        JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                    private var proration: JsonField<Proration> = JsonMissing.of()
                    private var prorationRounding: JsonField<ProrationRounding> = JsonMissing.of()
                    private var recurrenceFrequency: JsonField<RecurrenceFrequency> =
                        JsonMissing.of()
                    private var rolloverFraction: JsonField<Double> = JsonMissing.of()
                    private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
                    private var subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringCredit: RecurringCredit) = apply {
                        id = recurringCredit.id
                        accessAmount = recurringCredit.accessAmount
                        commitDuration = recurringCredit.commitDuration
                        priority = recurringCredit.priority
                        product = recurringCredit.product
                        rateType = recurringCredit.rateType
                        startingAt = recurringCredit.startingAt
                        applicableProductIds =
                            recurringCredit.applicableProductIds.map { it.toMutableList() }
                        applicableProductTags =
                            recurringCredit.applicableProductTags.map { it.toMutableList() }
                        contract = recurringCredit.contract
                        description = recurringCredit.description
                        endingBefore = recurringCredit.endingBefore
                        hierarchyConfiguration = recurringCredit.hierarchyConfiguration
                        name = recurringCredit.name
                        netsuiteSalesOrderId = recurringCredit.netsuiteSalesOrderId
                        proration = recurringCredit.proration
                        prorationRounding = recurringCredit.prorationRounding
                        recurrenceFrequency = recurringCredit.recurrenceFrequency
                        rolloverFraction = recurringCredit.rolloverFraction
                        specifiers = recurringCredit.specifiers.map { it.toMutableList() }
                        subscriptionConfig = recurringCredit.subscriptionConfig
                        additionalProperties = recurringCredit.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The amount of commit to grant. */
                    fun accessAmount(accessAmount: AccessAmount) =
                        accessAmount(JsonField.of(accessAmount))

                    /**
                     * Sets [Builder.accessAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessAmount] with a well-typed
                     * [AccessAmount] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                        this.accessAmount = accessAmount
                    }

                    /** The amount of time the created commits will be valid for */
                    fun commitDuration(commitDuration: CommitDuration) =
                        commitDuration(JsonField.of(commitDuration))

                    /**
                     * Sets [Builder.commitDuration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.commitDuration] with a well-typed
                     * [CommitDuration] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                        this.commitDuration = commitDuration
                    }

                    /** Will be passed down to the individual commits */
                    fun priority(priority: Double) = priority(JsonField.of(priority))

                    /**
                     * Sets [Builder.priority] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.priority] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                    fun product(product: Product) = product(JsonField.of(product))

                    /**
                     * Sets [Builder.product] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.product] with a well-typed [Product] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun product(product: JsonField<Product>) = apply { this.product = product }

                    /** Whether the created commits will use the commit rate or list rate */
                    fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                    /**
                     * Sets [Builder.rateType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rateType] with a well-typed [RateType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                    /** Determines the start time for the first commit */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /** Will be passed down to the individual commits */
                    fun applicableProductIds(applicableProductIds: List<String>) =
                        applicableProductIds(JsonField.of(applicableProductIds))

                    /**
                     * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicableProductIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun applicableProductIds(applicableProductIds: JsonField<List<String>>) =
                        apply {
                            this.applicableProductIds =
                                applicableProductIds.map { it.toMutableList() }
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
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun applicableProductTags(applicableProductTags: JsonField<List<String>>) =
                        apply {
                            this.applicableProductTags =
                                applicableProductTags.map { it.toMutableList() }
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

                    fun contract(contract: InnerContract) = contract(JsonField.of(contract))

                    /**
                     * Sets [Builder.contract] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contract] with a well-typed [InnerContract]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contract(contract: JsonField<InnerContract>) = apply {
                        this.contract = contract
                    }

                    /** Will be passed down to the individual commits */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Determines when the contract will stop creating recurring commits. Optional
                     */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    /**
                     * Optional configuration for recurring commit/credit hierarchy access control
                     */
                    fun hierarchyConfiguration(
                        hierarchyConfiguration: CommitHierarchyConfiguration
                    ) = hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                    /**
                     * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hierarchyConfiguration] with a well-typed
                     * [CommitHierarchyConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun hierarchyConfiguration(
                        hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                    ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                    /** Displayed on invoices. Will be passed through to the individual commits */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Will be passed down to the individual commits */
                    fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                        netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                    /**
                     * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                        this.netsuiteSalesOrderId = netsuiteSalesOrderId
                    }

                    /**
                     * Determines whether the first and last commit will be prorated. If not
                     * provided, the default is FIRST_AND_LAST (i.e. prorate both the first and last
                     * commits).
                     */
                    fun proration(proration: Proration) = proration(JsonField.of(proration))

                    /**
                     * Sets [Builder.proration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.proration] with a well-typed [Proration]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun proration(proration: JsonField<Proration>) = apply {
                        this.proration = proration
                    }

                    /** Rounding configuration for prorated recurring credit amounts. */
                    fun prorationRounding(prorationRounding: ProrationRounding?) =
                        prorationRounding(JsonField.ofNullable(prorationRounding))

                    /**
                     * Alias for calling [Builder.prorationRounding] with
                     * `prorationRounding.orElse(null)`.
                     */
                    fun prorationRounding(prorationRounding: Optional<ProrationRounding>) =
                        prorationRounding(prorationRounding.getOrNull())

                    /**
                     * Sets [Builder.prorationRounding] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prorationRounding] with a well-typed
                     * [ProrationRounding] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun prorationRounding(prorationRounding: JsonField<ProrationRounding>) = apply {
                        this.prorationRounding = prorationRounding
                    }

                    /**
                     * The frequency at which the recurring commits will be created. If not
                     * provided: - The commits will be created on the usage invoice frequency. If
                     * provided: - The period defined in the duration will correspond to this
                     * frequency. - Commits will be created aligned with the recurring commit's
                     * starting_at rather than the usage invoice dates. - Daily recurring commits
                     * have a limit of one per contract, and are unable to be created with
                     * seat-based subscriptions
                     */
                    fun recurrenceFrequency(recurrenceFrequency: RecurrenceFrequency) =
                        recurrenceFrequency(JsonField.of(recurrenceFrequency))

                    /**
                     * Sets [Builder.recurrenceFrequency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recurrenceFrequency] with a well-typed
                     * [RecurrenceFrequency] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun recurrenceFrequency(recurrenceFrequency: JsonField<RecurrenceFrequency>) =
                        apply {
                            this.recurrenceFrequency = recurrenceFrequency
                        }

                    /**
                     * Will be passed down to the individual commits. This controls how much of an
                     * individual unexpired commit will roll over upon contract transition. Must be
                     * between 0 and 1.
                     */
                    fun rolloverFraction(rolloverFraction: Double) =
                        rolloverFraction(JsonField.of(rolloverFraction))

                    /**
                     * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rolloverFraction] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                        this.rolloverFraction = rolloverFraction
                    }

                    /**
                     * List of filters that determine what kind of customer usage draws down a
                     * commit or credit. A customer's usage needs to meet the condition of at least
                     * one of the specifiers to contribute to a commit's or credit's drawdown.
                     */
                    fun specifiers(specifiers: List<CommitSpecifier>) =
                        specifiers(JsonField.of(specifiers))

                    /**
                     * Sets [Builder.specifiers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specifiers] with a well-typed
                     * `List<CommitSpecifier>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                        this.specifiers = specifiers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [CommitSpecifier] to [specifiers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSpecifier(specifier: CommitSpecifier) = apply {
                        specifiers =
                            (specifiers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("specifiers", it).add(specifier)
                            }
                    }

                    /** Attach a subscription to the recurring commit/credit. */
                    fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                        subscriptionConfig(JsonField.of(subscriptionConfig))

                    /**
                     * Sets [Builder.subscriptionConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subscriptionConfig] with a well-typed
                     * [RecurringCommitSubscriptionConfig] value instead. This method is primarily
                     * for setting the field to an undocumented or not yet supported value.
                     */
                    fun subscriptionConfig(
                        subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig>
                    ) = apply { this.subscriptionConfig = subscriptionConfig }

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
                     * Returns an immutable instance of [RecurringCredit].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .accessAmount()
                     * .commitDuration()
                     * .priority()
                     * .product()
                     * .rateType()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RecurringCredit =
                        RecurringCredit(
                            checkRequired("id", id),
                            checkRequired("accessAmount", accessAmount),
                            checkRequired("commitDuration", commitDuration),
                            checkRequired("priority", priority),
                            checkRequired("product", product),
                            checkRequired("rateType", rateType),
                            checkRequired("startingAt", startingAt),
                            (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                            (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                            contract,
                            description,
                            endingBefore,
                            hierarchyConfiguration,
                            name,
                            netsuiteSalesOrderId,
                            proration,
                            prorationRounding,
                            recurrenceFrequency,
                            rolloverFraction,
                            (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                            subscriptionConfig,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): RecurringCredit = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    accessAmount().validate()
                    commitDuration().validate()
                    priority()
                    product().validate()
                    rateType().validate()
                    startingAt()
                    applicableProductIds()
                    applicableProductTags()
                    contract().ifPresent { it.validate() }
                    description()
                    endingBefore()
                    hierarchyConfiguration().ifPresent { it.validate() }
                    name()
                    netsuiteSalesOrderId()
                    proration().ifPresent { it.validate() }
                    prorationRounding().ifPresent { it.validate() }
                    recurrenceFrequency().ifPresent { it.validate() }
                    rolloverFraction()
                    specifiers().ifPresent { it.forEach { it.validate() } }
                    subscriptionConfig().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (accessAmount.asKnown().getOrNull()?.validity() ?: 0) +
                        (commitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (priority.asKnown().isPresent) 1 else 0) +
                        (product.asKnown().getOrNull()?.validity() ?: 0) +
                        (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                        (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                        (contract.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0) +
                        (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                        (proration.asKnown().getOrNull()?.validity() ?: 0) +
                        (prorationRounding.asKnown().getOrNull()?.validity() ?: 0) +
                        (recurrenceFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                        (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (subscriptionConfig.asKnown().getOrNull()?.validity() ?: 0)

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
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                    /**
                     * Returns the raw JSON value of [creditTypeId].
                     *
                     * Unlike [creditTypeId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("credit_type_id")
                    @ExcludeMissing
                    fun _creditTypeId(): JsonField<String> = creditTypeId

                    /**
                     * Returns the raw JSON value of [unitPrice].
                     *
                     * Unlike [unitPrice], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    /**
                     * Returns the raw JSON value of [quantity].
                     *
                     * Unlike [quantity], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accessAmount: AccessAmount) = apply {
                            creditTypeId = accessAmount.creditTypeId
                            unitPrice = accessAmount.unitPrice
                            quantity = accessAmount.quantity
                            additionalProperties = accessAmount.additionalProperties.toMutableMap()
                        }

                        fun creditTypeId(creditTypeId: String) =
                            creditTypeId(JsonField.of(creditTypeId))

                        /**
                         * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.creditTypeId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                            this.creditTypeId = creditTypeId
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        /**
                         * Sets [Builder.unitPrice] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitPrice] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
                        }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        /**
                         * Sets [Builder.quantity] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.quantity] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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

                /** The amount of time the created commits will be valid for */
                class CommitDuration
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val value: JsonField<Double>,
                    private val unit: JsonField<Unit>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<Unit> = JsonMissing.of(),
                    ) : this(value, unit, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Double = value.getRequired("value")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun unit(): Optional<Unit> = unit.getOptional("unit")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [CommitDuration].
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(commitDuration: CommitDuration) = apply {
                            value = commitDuration.value
                            unit = commitDuration.unit
                            additionalProperties =
                                commitDuration.additionalProperties.toMutableMap()
                        }

                        fun value(value: Double) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Double>) = apply { this.value = value }

                        fun unit(unit: Unit) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [Unit] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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

                            @JvmField val PERIODS = of("PERIODS")

                            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                        }

                        /** An enum containing [Unit]'s known values. */
                        enum class Known {
                            PERIODS
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
                            PERIODS,
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
                                PERIODS -> Value.PERIODS
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
                                PERIODS -> Known.PERIODS
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

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws MetronomeInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
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

                        return other is CommitDuration &&
                            value == other.value &&
                            unit == other.unit &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(value, unit, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
                }

                class Product
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                    ) : this(id, name, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [Product].
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Product]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(product: Product) = apply {
                            id = product.id
                            name = product.name
                            additionalProperties = product.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

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
                         * Returns an immutable instance of [Product].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Product =
                            Product(
                                checkRequired("id", id),
                                checkRequired("name", name),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Product = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
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
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Product &&
                            id == other.id &&
                            name == other.name &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(id, name, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
                }

                /** Whether the created commits will use the commit rate or list rate */
                class RateType
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
                     * An enum containing [RateType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [RateType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        COMMIT_RATE,
                        LIST_RATE,
                        /**
                         * An enum member indicating that [RateType] was instantiated with an
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
                            COMMIT_RATE -> Value.COMMIT_RATE
                            LIST_RATE -> Value.LIST_RATE
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
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RateType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class InnerContract
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
                    ) : this(id, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                         * [InnerContract].
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerContract]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerContract: InnerContract) = apply {
                            id = innerContract.id
                            additionalProperties = innerContract.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

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
                         * Returns an immutable instance of [InnerContract].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): InnerContract =
                            InnerContract(
                                checkRequired("id", id),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): InnerContract = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
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
                    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InnerContract &&
                            id == other.id &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerContract{id=$id, additionalProperties=$additionalProperties}"
                }

                /**
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 */
                class Proration
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
                     * An enum containing [Proration]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Proration] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NONE,
                        FIRST,
                        LAST,
                        FIRST_AND_LAST,
                        /**
                         * An enum member indicating that [Proration] was instantiated with an
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
                            NONE -> Value.NONE
                            FIRST -> Value.FIRST
                            LAST -> Value.LAST
                            FIRST_AND_LAST -> Value.FIRST_AND_LAST
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
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Proration && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Rounding configuration for prorated recurring credit amounts. */
                class ProrationRounding
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val access: JsonField<Access>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("access")
                        @ExcludeMissing
                        access: JsonField<Access> = JsonMissing.of()
                    ) : this(access, mutableMapOf())

                    /**
                     * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun access(): Optional<Access> = access.getOptional("access")

                    /**
                     * Returns the raw JSON value of [access].
                     *
                     * Unlike [access], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("access")
                    @ExcludeMissing
                    fun _access(): JsonField<Access> = access

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
                         * [ProrationRounding].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ProrationRounding]. */
                    class Builder internal constructor() {

                        private var access: JsonField<Access> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(prorationRounding: ProrationRounding) = apply {
                            access = prorationRounding.access
                            additionalProperties =
                                prorationRounding.additionalProperties.toMutableMap()
                        }

                        fun access(access: Access) = access(JsonField.of(access))

                        /**
                         * Sets [Builder.access] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.access] with a well-typed [Access] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun access(access: JsonField<Access>) = apply { this.access = access }

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
                         * Returns an immutable instance of [ProrationRounding].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ProrationRounding =
                            ProrationRounding(access, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ProrationRounding = apply {
                        if (validated) {
                            return@apply
                        }

                        access().ifPresent { it.validate() }
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
                    internal fun validity(): Int = (access.asKnown().getOrNull()?.validity() ?: 0)

                    class Access
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val decimalPlaces: JsonField<Double>,
                        private val roundingMethod: JsonField<RoundingMethod>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("decimal_places")
                            @ExcludeMissing
                            decimalPlaces: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("rounding_method")
                            @ExcludeMissing
                            roundingMethod: JsonField<RoundingMethod> = JsonMissing.of(),
                        ) : this(decimalPlaces, roundingMethod, mutableMapOf())

                        /**
                         * Number of decimal places to round to. Applied directly to the stored
                         * monetary representation. Negative values round to powers of 10 (e.g., -2
                         * rounds to nearest 100 in the stored unit. For USD, this means rounding to
                         * the nearest dollar).
                         *
                         * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun decimalPlaces(): Double = decimalPlaces.getRequired("decimal_places")

                        /**
                         * @throws MetronomeInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun roundingMethod(): RoundingMethod =
                            roundingMethod.getRequired("rounding_method")

                        /**
                         * Returns the raw JSON value of [decimalPlaces].
                         *
                         * Unlike [decimalPlaces], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("decimal_places")
                        @ExcludeMissing
                        fun _decimalPlaces(): JsonField<Double> = decimalPlaces

                        /**
                         * Returns the raw JSON value of [roundingMethod].
                         *
                         * Unlike [roundingMethod], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("rounding_method")
                        @ExcludeMissing
                        fun _roundingMethod(): JsonField<RoundingMethod> = roundingMethod

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
                             * Returns a mutable builder for constructing an instance of [Access].
                             *
                             * The following fields are required:
                             * ```java
                             * .decimalPlaces()
                             * .roundingMethod()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Access]. */
                        class Builder internal constructor() {

                            private var decimalPlaces: JsonField<Double>? = null
                            private var roundingMethod: JsonField<RoundingMethod>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(access: Access) = apply {
                                decimalPlaces = access.decimalPlaces
                                roundingMethod = access.roundingMethod
                                additionalProperties = access.additionalProperties.toMutableMap()
                            }

                            /**
                             * Number of decimal places to round to. Applied directly to the stored
                             * monetary representation. Negative values round to powers of 10 (e.g.,
                             * -2 rounds to nearest 100 in the stored unit. For USD, this means
                             * rounding to the nearest dollar).
                             */
                            fun decimalPlaces(decimalPlaces: Double) =
                                decimalPlaces(JsonField.of(decimalPlaces))

                            /**
                             * Sets [Builder.decimalPlaces] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.decimalPlaces] with a well-typed
                             * [Double] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun decimalPlaces(decimalPlaces: JsonField<Double>) = apply {
                                this.decimalPlaces = decimalPlaces
                            }

                            fun roundingMethod(roundingMethod: RoundingMethod) =
                                roundingMethod(JsonField.of(roundingMethod))

                            /**
                             * Sets [Builder.roundingMethod] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.roundingMethod] with a well-typed
                             * [RoundingMethod] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun roundingMethod(roundingMethod: JsonField<RoundingMethod>) = apply {
                                this.roundingMethod = roundingMethod
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

                            /**
                             * Returns an immutable instance of [Access].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .decimalPlaces()
                             * .roundingMethod()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Access =
                                Access(
                                    checkRequired("decimalPlaces", decimalPlaces),
                                    checkRequired("roundingMethod", roundingMethod),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws MetronomeInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Access = apply {
                            if (validated) {
                                return@apply
                            }

                            decimalPlaces()
                            roundingMethod().validate()
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
                        internal fun validity(): Int =
                            (if (decimalPlaces.asKnown().isPresent) 1 else 0) +
                                (roundingMethod.asKnown().getOrNull()?.validity() ?: 0)

                        class RoundingMethod
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val HALF_UP = of("HALF_UP")

                                @JvmField val FLOOR = of("FLOOR")

                                @JvmField val CEILING = of("CEILING")

                                @JvmStatic
                                fun of(value: String) = RoundingMethod(JsonField.of(value))
                            }

                            /** An enum containing [RoundingMethod]'s known values. */
                            enum class Known {
                                HALF_UP,
                                FLOOR,
                                CEILING,
                            }

                            /**
                             * An enum containing [RoundingMethod]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [RoundingMethod] can contain an unknown value in a
                             * couple of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                HALF_UP,
                                FLOOR,
                                CEILING,
                                /**
                                 * An enum member indicating that [RoundingMethod] was instantiated
                                 * with an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    HALF_UP -> Value.HALF_UP
                                    FLOOR -> Value.FLOOR
                                    CEILING -> Value.CEILING
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws MetronomeInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    HALF_UP -> Known.HALF_UP
                                    FLOOR -> Known.FLOOR
                                    CEILING -> Known.CEILING
                                    else ->
                                        throw MetronomeInvalidDataException(
                                            "Unknown RoundingMethod: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws MetronomeInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    MetronomeInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws MetronomeInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): RoundingMethod = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is RoundingMethod && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Access &&
                                decimalPlaces == other.decimalPlaces &&
                                roundingMethod == other.roundingMethod &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(decimalPlaces, roundingMethod, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Access{decimalPlaces=$decimalPlaces, roundingMethod=$roundingMethod, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ProrationRounding &&
                            access == other.access &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(access, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ProrationRounding{access=$access, additionalProperties=$additionalProperties}"
                }

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates. - Daily recurring commits have a limit of one per contract, and
                 * are unable to be created with seat-based subscriptions
                 */
                class RecurrenceFrequency
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

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmField val WEEKLY = of("WEEKLY")

                        @JvmField val DAILY = of("DAILY")

                        @JvmStatic fun of(value: String) = RecurrenceFrequency(JsonField.of(value))
                    }

                    /** An enum containing [RecurrenceFrequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        ANNUAL,
                        WEEKLY,
                        DAILY,
                    }

                    /**
                     * An enum containing [RecurrenceFrequency]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [RecurrenceFrequency] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        ANNUAL,
                        WEEKLY,
                        DAILY,
                        /**
                         * An enum member indicating that [RecurrenceFrequency] was instantiated
                         * with an unknown value.
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
                            ANNUAL -> Value.ANNUAL
                            WEEKLY -> Value.WEEKLY
                            DAILY -> Value.DAILY
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
                            ANNUAL -> Known.ANNUAL
                            WEEKLY -> Known.WEEKLY
                            DAILY -> Known.DAILY
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown RecurrenceFrequency: $value"
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

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RecurrenceFrequency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecurringCredit &&
                        id == other.id &&
                        accessAmount == other.accessAmount &&
                        commitDuration == other.commitDuration &&
                        priority == other.priority &&
                        product == other.product &&
                        rateType == other.rateType &&
                        startingAt == other.startingAt &&
                        applicableProductIds == other.applicableProductIds &&
                        applicableProductTags == other.applicableProductTags &&
                        contract == other.contract &&
                        description == other.description &&
                        endingBefore == other.endingBefore &&
                        hierarchyConfiguration == other.hierarchyConfiguration &&
                        name == other.name &&
                        netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                        proration == other.proration &&
                        prorationRounding == other.prorationRounding &&
                        recurrenceFrequency == other.recurrenceFrequency &&
                        rolloverFraction == other.rolloverFraction &&
                        specifiers == other.specifiers &&
                        subscriptionConfig == other.subscriptionConfig &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        accessAmount,
                        commitDuration,
                        priority,
                        product,
                        rateType,
                        startingAt,
                        applicableProductIds,
                        applicableProductTags,
                        contract,
                        description,
                        endingBefore,
                        hierarchyConfiguration,
                        name,
                        netsuiteSalesOrderId,
                        proration,
                        prorationRounding,
                        recurrenceFrequency,
                        rolloverFraction,
                        specifiers,
                        subscriptionConfig,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringCredit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, prorationRounding=$prorationRounding, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
            }

            /**
             * Determines which scheduled and commit charges to consolidate onto the Contract's
             * usage invoice. The charge's `timestamp` must match the usage invoice's
             * `ending_before` date for consolidation to occur. This field cannot be modified after
             * a Contract has been created. If this field is omitted, charges will appear on a
             * separate invoice from usage charges.
             */
            class ScheduledChargesOnUsageInvoices
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

                    @JvmField val ALL = of("ALL")

                    @JvmStatic
                    fun of(value: String) = ScheduledChargesOnUsageInvoices(JsonField.of(value))
                }

                /** An enum containing [ScheduledChargesOnUsageInvoices]'s known values. */
                enum class Known {
                    ALL
                }

                /**
                 * An enum containing [ScheduledChargesOnUsageInvoices]'s known values, as well as
                 * an [_UNKNOWN] member.
                 *
                 * An instance of [ScheduledChargesOnUsageInvoices] can contain an unknown value in
                 * a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALL,
                    /**
                     * An enum member indicating that [ScheduledChargesOnUsageInvoices] was
                     * instantiated with an unknown value.
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
                        ALL -> Value.ALL
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
                        ALL -> Known.ALL
                        else ->
                            throw MetronomeInvalidDataException(
                                "Unknown ScheduledChargesOnUsageInvoices: $value"
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contract &&
                    id == other.id &&
                    commits == other.commits &&
                    createdAt == other.createdAt &&
                    createdBy == other.createdBy &&
                    customerId == other.customerId &&
                    overrides == other.overrides &&
                    scheduledCharges == other.scheduledCharges &&
                    startingAt == other.startingAt &&
                    transitions == other.transitions &&
                    usageFilter == other.usageFilter &&
                    usageStatementSchedule == other.usageStatementSchedule &&
                    credits == other.credits &&
                    customFields == other.customFields &&
                    customerBillingProviderConfiguration ==
                        other.customerBillingProviderConfiguration &&
                    endingBefore == other.endingBefore &&
                    hasMore == other.hasMore &&
                    hierarchyConfiguration == other.hierarchyConfiguration &&
                    multiplierOverridePrioritization == other.multiplierOverridePrioritization &&
                    name == other.name &&
                    netPaymentTermsDays == other.netPaymentTermsDays &&
                    packageId == other.packageId &&
                    prepaidBalanceThresholdConfiguration ==
                        other.prepaidBalanceThresholdConfiguration &&
                    rateCardId == other.rateCardId &&
                    recurringCommits == other.recurringCommits &&
                    recurringCredits == other.recurringCredits &&
                    scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices &&
                    spendThresholdConfiguration == other.spendThresholdConfiguration &&
                    subscriptions == other.subscriptions &&
                    uniquenessKey == other.uniquenessKey &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    commits,
                    createdAt,
                    createdBy,
                    customerId,
                    overrides,
                    scheduledCharges,
                    startingAt,
                    transitions,
                    usageFilter,
                    usageStatementSchedule,
                    credits,
                    customFields,
                    customerBillingProviderConfiguration,
                    endingBefore,
                    hasMore,
                    hierarchyConfiguration,
                    multiplierOverridePrioritization,
                    name,
                    netPaymentTermsDays,
                    packageId,
                    prepaidBalanceThresholdConfiguration,
                    rateCardId,
                    recurringCommits,
                    recurringCredits,
                    scheduledChargesOnUsageInvoices,
                    spendThresholdConfiguration,
                    subscriptions,
                    uniquenessKey,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Contract{id=$id, commits=$commits, createdAt=$createdAt, createdBy=$createdBy, customerId=$customerId, overrides=$overrides, scheduledCharges=$scheduledCharges, startingAt=$startingAt, transitions=$transitions, usageFilter=$usageFilter, usageStatementSchedule=$usageStatementSchedule, credits=$credits, customFields=$customFields, customerBillingProviderConfiguration=$customerBillingProviderConfiguration, endingBefore=$endingBefore, hasMore=$hasMore, hierarchyConfiguration=$hierarchyConfiguration, multiplierOverridePrioritization=$multiplierOverridePrioritization, name=$name, netPaymentTermsDays=$netPaymentTermsDays, packageId=$packageId, prepaidBalanceThresholdConfiguration=$prepaidBalanceThresholdConfiguration, rateCardId=$rateCardId, recurringCommits=$recurringCommits, recurringCredits=$recurringCredits, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, spendThresholdConfiguration=$spendThresholdConfiguration, subscriptions=$subscriptions, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                contract == other.contract &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, contract, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, contract=$contract, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
