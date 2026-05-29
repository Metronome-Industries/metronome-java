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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Contract
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amendments: JsonField<List<Amendment>>,
    private val current: JsonField<ContractWithoutAmendments>,
    private val customerId: JsonField<String>,
    private val initial: JsonField<ContractWithoutAmendments>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val customFields: JsonField<CustomFields>,
    private val customerBillingProviderConfiguration:
        JsonField<CustomerBillingProviderConfiguration>,
    private val packageId: JsonField<String>,
    private val prepaidBalanceThresholdConfiguration:
        JsonField<PrepaidBalanceThresholdConfiguration>,
    private val scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>,
    private val spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>,
    private val spendTrackers: JsonField<List<SpendTracker>>,
    private val subscriptions: JsonField<List<Subscription>>,
    private val uniquenessKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amendments")
        @ExcludeMissing
        amendments: JsonField<List<Amendment>> = JsonMissing.of(),
        @JsonProperty("current")
        @ExcludeMissing
        current: JsonField<ContractWithoutAmendments> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initial")
        @ExcludeMissing
        initial: JsonField<ContractWithoutAmendments> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_billing_provider_configuration")
        @ExcludeMissing
        customerBillingProviderConfiguration: JsonField<CustomerBillingProviderConfiguration> =
            JsonMissing.of(),
        @JsonProperty("package_id") @ExcludeMissing packageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prepaid_balance_threshold_configuration")
        @ExcludeMissing
        prepaidBalanceThresholdConfiguration: JsonField<PrepaidBalanceThresholdConfiguration> =
            JsonMissing.of(),
        @JsonProperty("scheduled_charges_on_usage_invoices")
        @ExcludeMissing
        scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
            JsonMissing.of(),
        @JsonProperty("spend_threshold_configuration")
        @ExcludeMissing
        spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> = JsonMissing.of(),
        @JsonProperty("spend_trackers")
        @ExcludeMissing
        spendTrackers: JsonField<List<SpendTracker>> = JsonMissing.of(),
        @JsonProperty("subscriptions")
        @ExcludeMissing
        subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        uniquenessKey: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amendments,
        current,
        customerId,
        initial,
        archivedAt,
        customFields,
        customerBillingProviderConfiguration,
        packageId,
        prepaidBalanceThresholdConfiguration,
        scheduledChargesOnUsageInvoices,
        spendThresholdConfiguration,
        spendTrackers,
        subscriptions,
        uniquenessKey,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amendments(): List<Amendment> = amendments.getRequired("amendments")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun current(): ContractWithoutAmendments = current.getRequired("current")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initial(): ContractWithoutAmendments = initial.getRequired("initial")

    /**
     * RFC 3339 timestamp indicating when the contract was archived. If not returned, the contract
     * is not archived.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archived_at")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

    /**
     * The billing provider configuration associated with a contract.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerBillingProviderConfiguration(): Optional<CustomerBillingProviderConfiguration> =
        customerBillingProviderConfiguration.getOptional("customer_billing_provider_configuration")

    /**
     * ID of the package this contract was created from, if applicable.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun packageId(): Optional<String> = packageId.getOptional("package_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfiguration> =
        prepaidBalanceThresholdConfiguration.getOptional("prepaid_balance_threshold_configuration")

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
        scheduledChargesOnUsageInvoices.getOptional("scheduled_charges_on_usage_invoices")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendThresholdConfiguration(): Optional<SpendThresholdConfiguration> =
        spendThresholdConfiguration.getOptional("spend_threshold_configuration")

    /**
     * Spend trackers attached to this contract.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendTrackers(): Optional<List<SpendTracker>> = spendTrackers.getOptional("spend_trackers")

    /**
     * List of subscriptions on the contract.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptions(): Optional<List<Subscription>> = subscriptions.getOptional("subscriptions")

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniquenessKey(): Optional<String> = uniquenessKey.getOptional("uniqueness_key")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amendments].
     *
     * Unlike [amendments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amendments")
    @ExcludeMissing
    fun _amendments(): JsonField<List<Amendment>> = amendments

    /**
     * Returns the raw JSON value of [current].
     *
     * Unlike [current], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current")
    @ExcludeMissing
    fun _current(): JsonField<ContractWithoutAmendments> = current

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [initial].
     *
     * Unlike [initial], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("initial")
    @ExcludeMissing
    fun _initial(): JsonField<ContractWithoutAmendments> = initial

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [customerBillingProviderConfiguration].
     *
     * Unlike [customerBillingProviderConfiguration], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("customer_billing_provider_configuration")
    @ExcludeMissing
    fun _customerBillingProviderConfiguration(): JsonField<CustomerBillingProviderConfiguration> =
        customerBillingProviderConfiguration

    /**
     * Returns the raw JSON value of [packageId].
     *
     * Unlike [packageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("package_id") @ExcludeMissing fun _packageId(): JsonField<String> = packageId

    /**
     * Returns the raw JSON value of [prepaidBalanceThresholdConfiguration].
     *
     * Unlike [prepaidBalanceThresholdConfiguration], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("prepaid_balance_threshold_configuration")
    @ExcludeMissing
    fun _prepaidBalanceThresholdConfiguration(): JsonField<PrepaidBalanceThresholdConfiguration> =
        prepaidBalanceThresholdConfiguration

    /**
     * Returns the raw JSON value of [scheduledChargesOnUsageInvoices].
     *
     * Unlike [scheduledChargesOnUsageInvoices], this method doesn't throw if the JSON field has an
     * unexpected type.
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
     * Returns the raw JSON value of [spendTrackers].
     *
     * Unlike [spendTrackers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_trackers")
    @ExcludeMissing
    fun _spendTrackers(): JsonField<List<SpendTracker>> = spendTrackers

    /**
     * Returns the raw JSON value of [subscriptions].
     *
     * Unlike [subscriptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptions")
    @ExcludeMissing
    fun _subscriptions(): JsonField<List<Subscription>> = subscriptions

    /**
     * Returns the raw JSON value of [uniquenessKey].
     *
     * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected type.
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
         * .amendments()
         * .current()
         * .customerId()
         * .initial()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Contract]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amendments: JsonField<MutableList<Amendment>>? = null
        private var current: JsonField<ContractWithoutAmendments>? = null
        private var customerId: JsonField<String>? = null
        private var initial: JsonField<ContractWithoutAmendments>? = null
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var customerBillingProviderConfiguration:
            JsonField<CustomerBillingProviderConfiguration> =
            JsonMissing.of()
        private var packageId: JsonField<String> = JsonMissing.of()
        private var prepaidBalanceThresholdConfiguration:
            JsonField<PrepaidBalanceThresholdConfiguration> =
            JsonMissing.of()
        private var scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
            JsonMissing.of()
        private var spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
            JsonMissing.of()
        private var spendTrackers: JsonField<MutableList<SpendTracker>>? = null
        private var subscriptions: JsonField<MutableList<Subscription>>? = null
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contract: Contract) = apply {
            id = contract.id
            amendments = contract.amendments.map { it.toMutableList() }
            current = contract.current
            customerId = contract.customerId
            initial = contract.initial
            archivedAt = contract.archivedAt
            customFields = contract.customFields
            customerBillingProviderConfiguration = contract.customerBillingProviderConfiguration
            packageId = contract.packageId
            prepaidBalanceThresholdConfiguration = contract.prepaidBalanceThresholdConfiguration
            scheduledChargesOnUsageInvoices = contract.scheduledChargesOnUsageInvoices
            spendThresholdConfiguration = contract.spendThresholdConfiguration
            spendTrackers = contract.spendTrackers.map { it.toMutableList() }
            subscriptions = contract.subscriptions.map { it.toMutableList() }
            uniquenessKey = contract.uniquenessKey
            additionalProperties = contract.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amendments(amendments: List<Amendment>) = amendments(JsonField.of(amendments))

        /**
         * Sets [Builder.amendments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amendments] with a well-typed `List<Amendment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amendments(amendments: JsonField<List<Amendment>>) = apply {
            this.amendments = amendments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Amendment] to [amendments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAmendment(amendment: Amendment) = apply {
            amendments =
                (amendments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("amendments", it).add(amendment)
                }
        }

        fun current(current: ContractWithoutAmendments) = current(JsonField.of(current))

        /**
         * Sets [Builder.current] to an arbitrary JSON value.
         *
         * You should usually call [Builder.current] with a well-typed [ContractWithoutAmendments]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun current(current: JsonField<ContractWithoutAmendments>) = apply {
            this.current = current
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun initial(initial: ContractWithoutAmendments) = initial(JsonField.of(initial))

        /**
         * Sets [Builder.initial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initial] with a well-typed [ContractWithoutAmendments]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun initial(initial: JsonField<ContractWithoutAmendments>) = apply {
            this.initial = initial
        }

        /**
         * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
         * contract is not archived.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
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

        /** The billing provider configuration associated with a contract. */
        fun customerBillingProviderConfiguration(
            customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
        ) = customerBillingProviderConfiguration(JsonField.of(customerBillingProviderConfiguration))

        /**
         * Sets [Builder.customerBillingProviderConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerBillingProviderConfiguration] with a well-typed
         * [CustomerBillingProviderConfiguration] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun customerBillingProviderConfiguration(
            customerBillingProviderConfiguration: JsonField<CustomerBillingProviderConfiguration>
        ) = apply {
            this.customerBillingProviderConfiguration = customerBillingProviderConfiguration
        }

        /** ID of the package this contract was created from, if applicable. */
        fun packageId(packageId: String) = packageId(JsonField.of(packageId))

        /**
         * Sets [Builder.packageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.packageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun packageId(packageId: JsonField<String>) = apply { this.packageId = packageId }

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfiguration
        ) = prepaidBalanceThresholdConfiguration(JsonField.of(prepaidBalanceThresholdConfiguration))

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
            this.prepaidBalanceThresholdConfiguration = prepaidBalanceThresholdConfiguration
        }

        /**
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         */
        fun scheduledChargesOnUsageInvoices(
            scheduledChargesOnUsageInvoices: ScheduledChargesOnUsageInvoices
        ) = scheduledChargesOnUsageInvoices(JsonField.of(scheduledChargesOnUsageInvoices))

        /**
         * Sets [Builder.scheduledChargesOnUsageInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledChargesOnUsageInvoices] with a well-typed
         * [ScheduledChargesOnUsageInvoices] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun scheduledChargesOnUsageInvoices(
            scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>
        ) = apply { this.scheduledChargesOnUsageInvoices = scheduledChargesOnUsageInvoices }

        fun spendThresholdConfiguration(spendThresholdConfiguration: SpendThresholdConfiguration) =
            spendThresholdConfiguration(JsonField.of(spendThresholdConfiguration))

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

        /** Spend trackers attached to this contract. */
        fun spendTrackers(spendTrackers: List<SpendTracker>) =
            spendTrackers(JsonField.of(spendTrackers))

        /**
         * Sets [Builder.spendTrackers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendTrackers] with a well-typed `List<SpendTracker>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun spendTrackers(spendTrackers: JsonField<List<SpendTracker>>) = apply {
            this.spendTrackers = spendTrackers.map { it.toMutableList() }
        }

        /**
         * Adds a single [SpendTracker] to [spendTrackers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpendTracker(spendTracker: SpendTracker) = apply {
            spendTrackers =
                (spendTrackers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("spendTrackers", it).add(spendTracker)
                }
        }

        /** List of subscriptions on the contract. */
        fun subscriptions(subscriptions: List<Subscription>) =
            subscriptions(JsonField.of(subscriptions))

        /**
         * Sets [Builder.subscriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptions] with a well-typed `List<Subscription>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * You should usually call [Builder.uniquenessKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * .amendments()
         * .current()
         * .customerId()
         * .initial()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Contract =
            Contract(
                checkRequired("id", id),
                checkRequired("amendments", amendments).map { it.toImmutable() },
                checkRequired("current", current),
                checkRequired("customerId", customerId),
                checkRequired("initial", initial),
                archivedAt,
                customFields,
                customerBillingProviderConfiguration,
                packageId,
                prepaidBalanceThresholdConfiguration,
                scheduledChargesOnUsageInvoices,
                spendThresholdConfiguration,
                (spendTrackers ?: JsonMissing.of()).map { it.toImmutable() },
                (subscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                uniquenessKey,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): Contract = apply {
        if (validated) {
            return@apply
        }

        id()
        amendments().forEach { it.validate() }
        current().validate()
        customerId()
        initial().validate()
        archivedAt()
        customFields().ifPresent { it.validate() }
        customerBillingProviderConfiguration().ifPresent { it.validate() }
        packageId()
        prepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
        scheduledChargesOnUsageInvoices().ifPresent { it.validate() }
        spendThresholdConfiguration().ifPresent { it.validate() }
        spendTrackers().ifPresent { it.forEach { it.validate() } }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (amendments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (current.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (initial.asKnown().getOrNull()?.validity() ?: 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (customerBillingProviderConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (packageId.asKnown().isPresent) 1 else 0) +
            (prepaidBalanceThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (scheduledChargesOnUsageInvoices.asKnown().getOrNull()?.validity() ?: 0) +
            (spendThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (spendTrackers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (subscriptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (uniquenessKey.asKnown().isPresent) 1 else 0)

    class Amendment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val commits: JsonField<List<Commit>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val overrides: JsonField<List<Override>>,
        private val scheduledCharges: JsonField<List<ScheduledCharge>>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val credits: JsonField<List<Credit>>,
        private val discounts: JsonField<List<Discount>>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val professionalServices: JsonField<List<ProService>>,
        private val resellerRoyalties: JsonField<List<ResellerRoyalty>>,
        private val salesforceOpportunityId: JsonField<String>,
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
            @JsonProperty("overrides")
            @ExcludeMissing
            overrides: JsonField<List<Override>> = JsonMissing.of(),
            @JsonProperty("scheduled_charges")
            @ExcludeMissing
            scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credits")
            @ExcludeMissing
            credits: JsonField<List<Credit>> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<Discount>> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("professional_services")
            @ExcludeMissing
            professionalServices: JsonField<List<ProService>> = JsonMissing.of(),
            @JsonProperty("reseller_royalties")
            @ExcludeMissing
            resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of(),
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            commits,
            createdAt,
            createdBy,
            overrides,
            scheduledCharges,
            startingAt,
            credits,
            discounts,
            netsuiteSalesOrderId,
            professionalServices,
            resellerRoyalties,
            salesforceOpportunityId,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commits(): List<Commit> = commits.getRequired("commits")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): String = createdBy.getRequired("created_by")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overrides(): List<Override> = overrides.getRequired("overrides")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scheduledCharges(): List<ScheduledCharge> =
            scheduledCharges.getRequired("scheduled_charges")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun credits(): Optional<List<Credit>> = credits.getOptional("credits")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discounts(): Optional<List<Discount>> = discounts.getOptional("discounts")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun professionalServices(): Optional<List<ProService>> =
            professionalServices.getOptional("professional_services")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
            resellerRoyalties.getOptional("reseller_royalties")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesforceOpportunityId(): Optional<String> =
            salesforceOpportunityId.getOptional("salesforce_opportunity_id")

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
        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [overrides].
         *
         * Unlike [overrides], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overrides")
        @ExcludeMissing
        fun _overrides(): JsonField<List<Override>> = overrides

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
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Returns the raw JSON value of [credits].
         *
         * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

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
         * Returns the raw JSON value of [professionalServices].
         *
         * Unlike [professionalServices], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("professional_services")
        @ExcludeMissing
        fun _professionalServices(): JsonField<List<ProService>> = professionalServices

        /**
         * Returns the raw JSON value of [resellerRoyalties].
         *
         * Unlike [resellerRoyalties], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = resellerRoyalties

        /**
         * Returns the raw JSON value of [salesforceOpportunityId].
         *
         * Unlike [salesforceOpportunityId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

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
             * Returns a mutable builder for constructing an instance of [Amendment].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .commits()
             * .createdAt()
             * .createdBy()
             * .overrides()
             * .scheduledCharges()
             * .startingAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Amendment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var commits: JsonField<MutableList<Commit>>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var createdBy: JsonField<String>? = null
            private var overrides: JsonField<MutableList<Override>>? = null
            private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var credits: JsonField<MutableList<Credit>>? = null
            private var discounts: JsonField<MutableList<Discount>>? = null
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var professionalServices: JsonField<MutableList<ProService>>? = null
            private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amendment: Amendment) = apply {
                id = amendment.id
                commits = amendment.commits.map { it.toMutableList() }
                createdAt = amendment.createdAt
                createdBy = amendment.createdBy
                overrides = amendment.overrides.map { it.toMutableList() }
                scheduledCharges = amendment.scheduledCharges.map { it.toMutableList() }
                startingAt = amendment.startingAt
                credits = amendment.credits.map { it.toMutableList() }
                discounts = amendment.discounts.map { it.toMutableList() }
                netsuiteSalesOrderId = amendment.netsuiteSalesOrderId
                professionalServices = amendment.professionalServices.map { it.toMutableList() }
                resellerRoyalties = amendment.resellerRoyalties.map { it.toMutableList() }
                salesforceOpportunityId = amendment.salesforceOpportunityId
                additionalProperties = amendment.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

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

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed `List<Discount>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Discount] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiscount(discount: Discount) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: List<ProService>) =
                professionalServices(JsonField.of(professionalServices))

            /**
             * Sets [Builder.professionalServices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.professionalServices] with a well-typed
             * `List<ProService>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun professionalServices(professionalServices: JsonField<List<ProService>>) = apply {
                this.professionalServices = professionalServices.map { it.toMutableList() }
            }

            /**
             * Adds a single [ProService] to [professionalServices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProfessionalService(professionalService: ProService) = apply {
                professionalServices =
                    (professionalServices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("professionalServices", it).add(professionalService)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) =
                resellerRoyalties(JsonField.of(resellerRoyalties))

            /**
             * Sets [Builder.resellerRoyalties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerRoyalties] with a well-typed
             * `List<ResellerRoyalty>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
                this.resellerRoyalties = resellerRoyalties.map { it.toMutableList() }
            }

            /**
             * Adds a single [ResellerRoyalty] to [resellerRoyalties].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
                resellerRoyalties =
                    (resellerRoyalties ?: JsonField.of(mutableListOf())).also {
                        checkKnown("resellerRoyalties", it).add(resellerRoyalty)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /**
             * Sets [Builder.salesforceOpportunityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesforceOpportunityId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
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
             * Returns an immutable instance of [Amendment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .commits()
             * .createdAt()
             * .createdBy()
             * .overrides()
             * .scheduledCharges()
             * .startingAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Amendment =
                Amendment(
                    checkRequired("id", id),
                    checkRequired("commits", commits).map { it.toImmutable() },
                    checkRequired("createdAt", createdAt),
                    checkRequired("createdBy", createdBy),
                    checkRequired("overrides", overrides).map { it.toImmutable() },
                    checkRequired("scheduledCharges", scheduledCharges).map { it.toImmutable() },
                    checkRequired("startingAt", startingAt),
                    (credits ?: JsonMissing.of()).map { it.toImmutable() },
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    netsuiteSalesOrderId,
                    (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                    (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                    salesforceOpportunityId,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Amendment = apply {
            if (validated) {
                return@apply
            }

            id()
            commits().forEach { it.validate() }
            createdAt()
            createdBy()
            overrides().forEach { it.validate() }
            scheduledCharges().forEach { it.validate() }
            startingAt()
            credits().ifPresent { it.forEach { it.validate() } }
            discounts().ifPresent { it.forEach { it.validate() } }
            netsuiteSalesOrderId()
            professionalServices().ifPresent { it.forEach { it.validate() } }
            resellerRoyalties().ifPresent { it.forEach { it.validate() } }
            salesforceOpportunityId()
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
                (overrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (scheduledCharges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0) +
                (credits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                (professionalServices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (resellerRoyalties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (salesforceOpportunityId.asKnown().isPresent) 1 else 0)

        class ResellerRoyalty
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val resellerType: JsonField<ResellerType>,
            private val awsAccountNumber: JsonField<String>,
            private val awsOfferId: JsonField<String>,
            private val awsPayerReferenceId: JsonField<String>,
            private val endingBefore: JsonField<OffsetDateTime>,
            private val fraction: JsonField<Double>,
            private val gcpAccountId: JsonField<String>,
            private val gcpOfferId: JsonField<String>,
            private val netsuiteResellerId: JsonField<String>,
            private val resellerContractValue: JsonField<Double>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reseller_type")
                @ExcludeMissing
                resellerType: JsonField<ResellerType> = JsonMissing.of(),
                @JsonProperty("aws_account_number")
                @ExcludeMissing
                awsAccountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_offer_id")
                @ExcludeMissing
                awsOfferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_payer_reference_id")
                @ExcludeMissing
                awsPayerReferenceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fraction")
                @ExcludeMissing
                fraction: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("gcp_account_id")
                @ExcludeMissing
                gcpAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gcp_offer_id")
                @ExcludeMissing
                gcpOfferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("netsuite_reseller_id")
                @ExcludeMissing
                netsuiteResellerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reseller_contract_value")
                @ExcludeMissing
                resellerContractValue: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                resellerType,
                awsAccountNumber,
                awsOfferId,
                awsPayerReferenceId,
                endingBefore,
                fraction,
                gcpAccountId,
                gcpOfferId,
                netsuiteResellerId,
                resellerContractValue,
                startingAt,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsAccountNumber(): Optional<String> =
                awsAccountNumber.getOptional("aws_account_number")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsOfferId(): Optional<String> = awsOfferId.getOptional("aws_offer_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsPayerReferenceId(): Optional<String> =
                awsPayerReferenceId.getOptional("aws_payer_reference_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun fraction(): Optional<Double> = fraction.getOptional("fraction")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcpAccountId(): Optional<String> = gcpAccountId.getOptional("gcp_account_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcpOfferId(): Optional<String> = gcpOfferId.getOptional("gcp_offer_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun netsuiteResellerId(): Optional<String> =
                netsuiteResellerId.getOptional("netsuite_reseller_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun resellerContractValue(): Optional<Double> =
                resellerContractValue.getOptional("reseller_contract_value")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

            /**
             * Returns the raw JSON value of [resellerType].
             *
             * Unlike [resellerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reseller_type")
            @ExcludeMissing
            fun _resellerType(): JsonField<ResellerType> = resellerType

            /**
             * Returns the raw JSON value of [awsAccountNumber].
             *
             * Unlike [awsAccountNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

            /**
             * Returns the raw JSON value of [awsOfferId].
             *
             * Unlike [awsOfferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            fun _awsOfferId(): JsonField<String> = awsOfferId

            /**
             * Returns the raw JSON value of [awsPayerReferenceId].
             *
             * Unlike [awsPayerReferenceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId(): JsonField<String> = awsPayerReferenceId

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
             * Returns the raw JSON value of [fraction].
             *
             * Unlike [fraction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<Double> = fraction

            /**
             * Returns the raw JSON value of [gcpAccountId].
             *
             * Unlike [gcpAccountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun _gcpAccountId(): JsonField<String> = gcpAccountId

            /**
             * Returns the raw JSON value of [gcpOfferId].
             *
             * Unlike [gcpOfferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun _gcpOfferId(): JsonField<String> = gcpOfferId

            /**
             * Returns the raw JSON value of [netsuiteResellerId].
             *
             * Unlike [netsuiteResellerId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            fun _netsuiteResellerId(): JsonField<String> = netsuiteResellerId

            /**
             * Returns the raw JSON value of [resellerContractValue].
             *
             * Unlike [resellerContractValue], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            fun _resellerContractValue(): JsonField<Double> = resellerContractValue

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [ResellerRoyalty].
                 *
                 * The following fields are required:
                 * ```java
                 * .resellerType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ResellerRoyalty]. */
            class Builder internal constructor() {

                private var resellerType: JsonField<ResellerType>? = null
                private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                private var awsOfferId: JsonField<String> = JsonMissing.of()
                private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fraction: JsonField<Double> = JsonMissing.of()
                private var gcpAccountId: JsonField<String> = JsonMissing.of()
                private var gcpOfferId: JsonField<String> = JsonMissing.of()
                private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
                private var resellerContractValue: JsonField<Double> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                    resellerType = resellerRoyalty.resellerType
                    awsAccountNumber = resellerRoyalty.awsAccountNumber
                    awsOfferId = resellerRoyalty.awsOfferId
                    awsPayerReferenceId = resellerRoyalty.awsPayerReferenceId
                    endingBefore = resellerRoyalty.endingBefore
                    fraction = resellerRoyalty.fraction
                    gcpAccountId = resellerRoyalty.gcpAccountId
                    gcpOfferId = resellerRoyalty.gcpOfferId
                    netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                    resellerContractValue = resellerRoyalty.resellerContractValue
                    startingAt = resellerRoyalty.startingAt
                    additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
                }

                fun resellerType(resellerType: ResellerType) =
                    resellerType(JsonField.of(resellerType))

                /**
                 * Sets [Builder.resellerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resellerType] with a well-typed [ResellerType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                    this.resellerType = resellerType
                }

                fun awsAccountNumber(awsAccountNumber: String) =
                    awsAccountNumber(JsonField.of(awsAccountNumber))

                /**
                 * Sets [Builder.awsAccountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsAccountNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                /**
                 * Sets [Builder.awsOfferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsOfferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                    this.awsOfferId = awsOfferId
                }

                fun awsPayerReferenceId(awsPayerReferenceId: String) =
                    awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

                /**
                 * Sets [Builder.awsPayerReferenceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsPayerReferenceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                    this.awsPayerReferenceId = awsPayerReferenceId
                }

                fun endingBefore(endingBefore: OffsetDateTime?) =
                    endingBefore(JsonField.ofNullable(endingBefore))

                /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
                fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                    endingBefore(endingBefore.getOrNull())

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

                fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

                /**
                 * Sets [Builder.fraction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fraction] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

                /**
                 * Sets [Builder.gcpAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcpAccountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                /**
                 * Sets [Builder.gcpOfferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcpOfferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                    this.gcpOfferId = gcpOfferId
                }

                fun netsuiteResellerId(netsuiteResellerId: String) =
                    netsuiteResellerId(JsonField.of(netsuiteResellerId))

                /**
                 * Sets [Builder.netsuiteResellerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.netsuiteResellerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                    this.netsuiteResellerId = netsuiteResellerId
                }

                fun resellerContractValue(resellerContractValue: Double) =
                    resellerContractValue(JsonField.of(resellerContractValue))

                /**
                 * Sets [Builder.resellerContractValue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resellerContractValue] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun resellerContractValue(resellerContractValue: JsonField<Double>) = apply {
                    this.resellerContractValue = resellerContractValue
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
                 * Returns an immutable instance of [ResellerRoyalty].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .resellerType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ResellerRoyalty =
                    ResellerRoyalty(
                        checkRequired("resellerType", resellerType),
                        awsAccountNumber,
                        awsOfferId,
                        awsPayerReferenceId,
                        endingBefore,
                        fraction,
                        gcpAccountId,
                        gcpOfferId,
                        netsuiteResellerId,
                        resellerContractValue,
                        startingAt,
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
            fun validate(): ResellerRoyalty = apply {
                if (validated) {
                    return@apply
                }

                resellerType().validate()
                awsAccountNumber()
                awsOfferId()
                awsPayerReferenceId()
                endingBefore()
                fraction()
                gcpAccountId()
                gcpOfferId()
                netsuiteResellerId()
                resellerContractValue()
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
                (resellerType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (awsAccountNumber.asKnown().isPresent) 1 else 0) +
                    (if (awsOfferId.asKnown().isPresent) 1 else 0) +
                    (if (awsPayerReferenceId.asKnown().isPresent) 1 else 0) +
                    (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (if (fraction.asKnown().isPresent) 1 else 0) +
                    (if (gcpAccountId.asKnown().isPresent) 1 else 0) +
                    (if (gcpOfferId.asKnown().isPresent) 1 else 0) +
                    (if (netsuiteResellerId.asKnown().isPresent) 1 else 0) +
                    (if (resellerContractValue.asKnown().isPresent) 1 else 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            class ResellerType
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
                 * An enum containing [ResellerType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResellerType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AWS,
                    AWS_PRO_SERVICE,
                    GCP,
                    GCP_PRO_SERVICE,
                    /**
                     * An enum member indicating that [ResellerType] was instantiated with an
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                fun validate(): ResellerType = apply {
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

                    return other is ResellerType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResellerRoyalty &&
                    resellerType == other.resellerType &&
                    awsAccountNumber == other.awsAccountNumber &&
                    awsOfferId == other.awsOfferId &&
                    awsPayerReferenceId == other.awsPayerReferenceId &&
                    endingBefore == other.endingBefore &&
                    fraction == other.fraction &&
                    gcpAccountId == other.gcpAccountId &&
                    gcpOfferId == other.gcpOfferId &&
                    netsuiteResellerId == other.netsuiteResellerId &&
                    resellerContractValue == other.resellerContractValue &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    resellerType,
                    awsAccountNumber,
                    awsOfferId,
                    awsPayerReferenceId,
                    endingBefore,
                    fraction,
                    gcpAccountId,
                    gcpOfferId,
                    netsuiteResellerId,
                    resellerContractValue,
                    startingAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ResellerRoyalty{resellerType=$resellerType, awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, endingBefore=$endingBefore, fraction=$fraction, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, netsuiteResellerId=$netsuiteResellerId, resellerContractValue=$resellerContractValue, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Amendment &&
                id == other.id &&
                commits == other.commits &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                overrides == other.overrides &&
                scheduledCharges == other.scheduledCharges &&
                startingAt == other.startingAt &&
                credits == other.credits &&
                discounts == other.discounts &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                professionalServices == other.professionalServices &&
                resellerRoyalties == other.resellerRoyalties &&
                salesforceOpportunityId == other.salesforceOpportunityId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                commits,
                createdAt,
                createdBy,
                overrides,
                scheduledCharges,
                startingAt,
                credits,
                discounts,
                netsuiteSalesOrderId,
                professionalServices,
                resellerRoyalties,
                salesforceOpportunityId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amendment{id=$id, commits=$commits, createdAt=$createdAt, createdBy=$createdBy, overrides=$overrides, scheduledCharges=$scheduledCharges, startingAt=$startingAt, credits=$credits, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, additionalProperties=$additionalProperties}"
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

    /** The billing provider configuration associated with a contract. */
    class CustomerBillingProviderConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val archivedAt: JsonField<OffsetDateTime>,
        private val billingProvider: JsonField<BillingProvider>,
        private val deliveryMethod: JsonField<DeliveryMethod>,
        private val id: JsonField<String>,
        private val configuration: JsonField<Configuration>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("archived_at")
            @ExcludeMissing
            archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("billing_provider")
            @ExcludeMissing
            billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
            @JsonProperty("delivery_method")
            @ExcludeMissing
            deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
        ) : this(archivedAt, billingProvider, deliveryMethod, id, configuration, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archived_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configuration(): Optional<Configuration> = configuration.getOptional("configuration")

        /**
         * Returns the raw JSON value of [archivedAt].
         *
         * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("archived_at")
        @ExcludeMissing
        fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

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
         * Returns the raw JSON value of [deliveryMethod].
         *
         * Unlike [deliveryMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

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
             * .archivedAt()
             * .billingProvider()
             * .deliveryMethod()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerBillingProviderConfiguration]. */
        class Builder internal constructor() {

            private var archivedAt: JsonField<OffsetDateTime>? = null
            private var billingProvider: JsonField<BillingProvider>? = null
            private var deliveryMethod: JsonField<DeliveryMethod>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
            ) = apply {
                archivedAt = customerBillingProviderConfiguration.archivedAt
                billingProvider = customerBillingProviderConfiguration.billingProvider
                deliveryMethod = customerBillingProviderConfiguration.deliveryMethod
                id = customerBillingProviderConfiguration.id
                configuration = customerBillingProviderConfiguration.configuration
                additionalProperties =
                    customerBillingProviderConfiguration.additionalProperties.toMutableMap()
            }

            fun archivedAt(archivedAt: OffsetDateTime?) =
                archivedAt(JsonField.ofNullable(archivedAt))

            /** Alias for calling [Builder.archivedAt] with `archivedAt.orElse(null)`. */
            fun archivedAt(archivedAt: Optional<OffsetDateTime>) =
                archivedAt(archivedAt.getOrNull())

            /**
             * Sets [Builder.archivedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
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

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider.
             */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
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
             * Returns an immutable instance of [CustomerBillingProviderConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .archivedAt()
             * .billingProvider()
             * .deliveryMethod()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerBillingProviderConfiguration =
                CustomerBillingProviderConfiguration(
                    checkRequired("archivedAt", archivedAt),
                    checkRequired("billingProvider", billingProvider),
                    checkRequired("deliveryMethod", deliveryMethod),
                    id,
                    configuration,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): CustomerBillingProviderConfiguration = apply {
            if (validated) {
                return@apply
            }

            archivedAt()
            billingProvider().validate()
            deliveryMethod().validate()
            id()
            configuration().ifPresent { it.validate() }
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
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
                (billingProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (deliveryMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (configuration.asKnown().getOrNull()?.validity() ?: 0)

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
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                METRONOME,
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
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

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider.
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

                /** Returns a mutable builder for constructing an instance of [Configuration]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(configuration: Configuration) = apply {
                    additionalProperties = configuration.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Configuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Configuration = Configuration(additionalProperties.toImmutable())
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Configuration && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Configuration{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerBillingProviderConfiguration &&
                archivedAt == other.archivedAt &&
                billingProvider == other.billingProvider &&
                deliveryMethod == other.deliveryMethod &&
                id == other.id &&
                configuration == other.configuration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                archivedAt,
                billingProvider,
                deliveryMethod,
                id,
                configuration,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBillingProviderConfiguration{archivedAt=$archivedAt, billingProvider=$billingProvider, deliveryMethod=$deliveryMethod, id=$id, configuration=$configuration, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

    class SpendTracker
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val alias: JsonField<String>,
        private val applicableSpendSpecifiers: JsonField<List<ApplicableSpendSpecifier>>,
        private val creditTypeId: JsonField<String>,
        private val resetFrequency: JsonField<ResetFrequency>,
        private val accumulatedSpend: JsonField<AccumulatedSpend>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applicable_spend_specifiers")
            @ExcludeMissing
            applicableSpendSpecifiers: JsonField<List<ApplicableSpendSpecifier>> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reset_frequency")
            @ExcludeMissing
            resetFrequency: JsonField<ResetFrequency> = JsonMissing.of(),
            @JsonProperty("accumulated_spend")
            @ExcludeMissing
            accumulatedSpend: JsonField<AccumulatedSpend> = JsonMissing.of(),
        ) : this(
            alias,
            applicableSpendSpecifiers,
            creditTypeId,
            resetFrequency,
            accumulatedSpend,
            mutableMapOf(),
        )

        /**
         * Human-readable identifier, unique per contract.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun alias(): String = alias.getRequired("alias")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun applicableSpendSpecifiers(): List<ApplicableSpendSpecifier> =
            applicableSpendSpecifiers.getRequired("applicable_spend_specifiers")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resetFrequency(): ResetFrequency = resetFrequency.getRequired("reset_frequency")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accumulatedSpend(): Optional<AccumulatedSpend> =
            accumulatedSpend.getOptional("accumulated_spend")

        /**
         * Returns the raw JSON value of [alias].
         *
         * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

        /**
         * Returns the raw JSON value of [applicableSpendSpecifiers].
         *
         * Unlike [applicableSpendSpecifiers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_spend_specifiers")
        @ExcludeMissing
        fun _applicableSpendSpecifiers(): JsonField<List<ApplicableSpendSpecifier>> =
            applicableSpendSpecifiers

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
         * Returns the raw JSON value of [resetFrequency].
         *
         * Unlike [resetFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reset_frequency")
        @ExcludeMissing
        fun _resetFrequency(): JsonField<ResetFrequency> = resetFrequency

        /**
         * Returns the raw JSON value of [accumulatedSpend].
         *
         * Unlike [accumulatedSpend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accumulated_spend")
        @ExcludeMissing
        fun _accumulatedSpend(): JsonField<AccumulatedSpend> = accumulatedSpend

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
             * Returns a mutable builder for constructing an instance of [SpendTracker].
             *
             * The following fields are required:
             * ```java
             * .alias()
             * .applicableSpendSpecifiers()
             * .creditTypeId()
             * .resetFrequency()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpendTracker]. */
        class Builder internal constructor() {

            private var alias: JsonField<String>? = null
            private var applicableSpendSpecifiers:
                JsonField<MutableList<ApplicableSpendSpecifier>>? =
                null
            private var creditTypeId: JsonField<String>? = null
            private var resetFrequency: JsonField<ResetFrequency>? = null
            private var accumulatedSpend: JsonField<AccumulatedSpend> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendTracker: SpendTracker) = apply {
                alias = spendTracker.alias
                applicableSpendSpecifiers =
                    spendTracker.applicableSpendSpecifiers.map { it.toMutableList() }
                creditTypeId = spendTracker.creditTypeId
                resetFrequency = spendTracker.resetFrequency
                accumulatedSpend = spendTracker.accumulatedSpend
                additionalProperties = spendTracker.additionalProperties.toMutableMap()
            }

            /** Human-readable identifier, unique per contract. */
            fun alias(alias: String) = alias(JsonField.of(alias))

            /**
             * Sets [Builder.alias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alias(alias: JsonField<String>) = apply { this.alias = alias }

            fun applicableSpendSpecifiers(
                applicableSpendSpecifiers: List<ApplicableSpendSpecifier>
            ) = applicableSpendSpecifiers(JsonField.of(applicableSpendSpecifiers))

            /**
             * Sets [Builder.applicableSpendSpecifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableSpendSpecifiers] with a well-typed
             * `List<ApplicableSpendSpecifier>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun applicableSpendSpecifiers(
                applicableSpendSpecifiers: JsonField<List<ApplicableSpendSpecifier>>
            ) = apply {
                this.applicableSpendSpecifiers =
                    applicableSpendSpecifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [ApplicableSpendSpecifier] to [applicableSpendSpecifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableSpendSpecifier(applicableSpendSpecifier: ApplicableSpendSpecifier) =
                apply {
                    applicableSpendSpecifiers =
                        (applicableSpendSpecifiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("applicableSpendSpecifiers", it)
                                .add(applicableSpendSpecifier)
                        }
                }

            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * Sets [Builder.creditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            fun resetFrequency(resetFrequency: ResetFrequency) =
                resetFrequency(JsonField.of(resetFrequency))

            /**
             * Sets [Builder.resetFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resetFrequency] with a well-typed [ResetFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun resetFrequency(resetFrequency: JsonField<ResetFrequency>) = apply {
                this.resetFrequency = resetFrequency
            }

            fun accumulatedSpend(accumulatedSpend: AccumulatedSpend) =
                accumulatedSpend(JsonField.of(accumulatedSpend))

            /**
             * Sets [Builder.accumulatedSpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accumulatedSpend] with a well-typed
             * [AccumulatedSpend] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun accumulatedSpend(accumulatedSpend: JsonField<AccumulatedSpend>) = apply {
                this.accumulatedSpend = accumulatedSpend
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
             * Returns an immutable instance of [SpendTracker].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .alias()
             * .applicableSpendSpecifiers()
             * .creditTypeId()
             * .resetFrequency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SpendTracker =
                SpendTracker(
                    checkRequired("alias", alias),
                    checkRequired("applicableSpendSpecifiers", applicableSpendSpecifiers).map {
                        it.toImmutable()
                    },
                    checkRequired("creditTypeId", creditTypeId),
                    checkRequired("resetFrequency", resetFrequency),
                    accumulatedSpend,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): SpendTracker = apply {
            if (validated) {
                return@apply
            }

            alias()
            applicableSpendSpecifiers().forEach { it.validate() }
            creditTypeId()
            resetFrequency().validate()
            accumulatedSpend().ifPresent { it.validate() }
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
            (if (alias.asKnown().isPresent) 1 else 0) +
                (applicableSpendSpecifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                (resetFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (accumulatedSpend.asKnown().getOrNull()?.validity() ?: 0)

        class ApplicableSpendSpecifier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val sources: JsonField<List<Source>>,
            private val spendType: JsonField<SpendType>,
            private val discounted: JsonField<Discounted>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("sources")
                @ExcludeMissing
                sources: JsonField<List<Source>> = JsonMissing.of(),
                @JsonProperty("spend_type")
                @ExcludeMissing
                spendType: JsonField<SpendType> = JsonMissing.of(),
                @JsonProperty("discounted")
                @ExcludeMissing
                discounted: JsonField<Discounted> = JsonMissing.of(),
            ) : this(sources, spendType, discounted, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sources(): List<Source> = sources.getRequired("sources")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun spendType(): SpendType = spendType.getRequired("spend_type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun discounted(): Optional<Discounted> = discounted.getOptional("discounted")

            /**
             * Returns the raw JSON value of [sources].
             *
             * Unlike [sources], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sources")
            @ExcludeMissing
            fun _sources(): JsonField<List<Source>> = sources

            /**
             * Returns the raw JSON value of [spendType].
             *
             * Unlike [spendType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("spend_type")
            @ExcludeMissing
            fun _spendType(): JsonField<SpendType> = spendType

            /**
             * Returns the raw JSON value of [discounted].
             *
             * Unlike [discounted], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discounted")
            @ExcludeMissing
            fun _discounted(): JsonField<Discounted> = discounted

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
                 * [ApplicableSpendSpecifier].
                 *
                 * The following fields are required:
                 * ```java
                 * .sources()
                 * .spendType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApplicableSpendSpecifier]. */
            class Builder internal constructor() {

                private var sources: JsonField<MutableList<Source>>? = null
                private var spendType: JsonField<SpendType>? = null
                private var discounted: JsonField<Discounted> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(applicableSpendSpecifier: ApplicableSpendSpecifier) = apply {
                    sources = applicableSpendSpecifier.sources.map { it.toMutableList() }
                    spendType = applicableSpendSpecifier.spendType
                    discounted = applicableSpendSpecifier.discounted
                    additionalProperties =
                        applicableSpendSpecifier.additionalProperties.toMutableMap()
                }

                fun sources(sources: List<Source>) = sources(JsonField.of(sources))

                /**
                 * Sets [Builder.sources] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sources] with a well-typed `List<Source>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sources(sources: JsonField<List<Source>>) = apply {
                    this.sources = sources.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Source] to [sources].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSource(source: Source) = apply {
                    sources =
                        (sources ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sources", it).add(source)
                        }
                }

                fun spendType(spendType: SpendType) = spendType(JsonField.of(spendType))

                /**
                 * Sets [Builder.spendType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spendType] with a well-typed [SpendType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun spendType(spendType: JsonField<SpendType>) = apply {
                    this.spendType = spendType
                }

                fun discounted(discounted: Discounted) = discounted(JsonField.of(discounted))

                /**
                 * Sets [Builder.discounted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discounted] with a well-typed [Discounted] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun discounted(discounted: JsonField<Discounted>) = apply {
                    this.discounted = discounted
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
                 * Returns an immutable instance of [ApplicableSpendSpecifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .sources()
                 * .spendType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApplicableSpendSpecifier =
                    ApplicableSpendSpecifier(
                        checkRequired("sources", sources).map { it.toImmutable() },
                        checkRequired("spendType", spendType),
                        discounted,
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
            fun validate(): ApplicableSpendSpecifier = apply {
                if (validated) {
                    return@apply
                }

                sources().forEach { it.validate() }
                spendType().validate()
                discounted().ifPresent { it.validate() }
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
                (sources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (spendType.asKnown().getOrNull()?.validity() ?: 0) +
                    (discounted.asKnown().getOrNull()?.validity() ?: 0)

            class Source @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val THRESHOLD_RECHARGE = of("THRESHOLD_RECHARGE")

                    @JvmField val MANUAL = of("MANUAL")

                    @JvmStatic fun of(value: String) = Source(JsonField.of(value))
                }

                /** An enum containing [Source]'s known values. */
                enum class Known {
                    THRESHOLD_RECHARGE,
                    MANUAL,
                }

                /**
                 * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Source] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    THRESHOLD_RECHARGE,
                    MANUAL,
                    /**
                     * An enum member indicating that [Source] was instantiated with an unknown
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
                        THRESHOLD_RECHARGE -> Value.THRESHOLD_RECHARGE
                        MANUAL -> Value.MANUAL
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
                        THRESHOLD_RECHARGE -> Known.THRESHOLD_RECHARGE
                        MANUAL -> Known.MANUAL
                        else -> throw MetronomeInvalidDataException("Unknown Source: $value")
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
                fun validate(): Source = apply {
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

                    return other is Source && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class SpendType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val COMMIT_PURCHASE = of("COMMIT_PURCHASE")

                    @JvmStatic fun of(value: String) = SpendType(JsonField.of(value))
                }

                /** An enum containing [SpendType]'s known values. */
                enum class Known {
                    COMMIT_PURCHASE
                }

                /**
                 * An enum containing [SpendType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SpendType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMMIT_PURCHASE,
                    /**
                     * An enum member indicating that [SpendType] was instantiated with an unknown
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
                        COMMIT_PURCHASE -> Value.COMMIT_PURCHASE
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
                        COMMIT_PURCHASE -> Known.COMMIT_PURCHASE
                        else -> throw MetronomeInvalidDataException("Unknown SpendType: $value")
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
                fun validate(): SpendType = apply {
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

                    return other is SpendType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Discounted
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

                    @JvmField val ANY = of("ANY")

                    @JvmField val DISCOUNTED_ONLY = of("DISCOUNTED_ONLY")

                    @JvmField val UNDISCOUNTED_ONLY = of("UNDISCOUNTED_ONLY")

                    @JvmStatic fun of(value: String) = Discounted(JsonField.of(value))
                }

                /** An enum containing [Discounted]'s known values. */
                enum class Known {
                    ANY,
                    DISCOUNTED_ONLY,
                    UNDISCOUNTED_ONLY,
                }

                /**
                 * An enum containing [Discounted]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Discounted] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANY,
                    DISCOUNTED_ONLY,
                    UNDISCOUNTED_ONLY,
                    /**
                     * An enum member indicating that [Discounted] was instantiated with an unknown
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
                        ANY -> Value.ANY
                        DISCOUNTED_ONLY -> Value.DISCOUNTED_ONLY
                        UNDISCOUNTED_ONLY -> Value.UNDISCOUNTED_ONLY
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
                        ANY -> Known.ANY
                        DISCOUNTED_ONLY -> Known.DISCOUNTED_ONLY
                        UNDISCOUNTED_ONLY -> Known.UNDISCOUNTED_ONLY
                        else -> throw MetronomeInvalidDataException("Unknown Discounted: $value")
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
                fun validate(): Discounted = apply {
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

                    return other is Discounted && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApplicableSpendSpecifier &&
                    sources == other.sources &&
                    spendType == other.spendType &&
                    discounted == other.discounted &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(sources, spendType, discounted, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplicableSpendSpecifier{sources=$sources, spendType=$spendType, discounted=$discounted, additionalProperties=$additionalProperties}"
        }

        class ResetFrequency
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

                @JvmField val BILLING_PERIOD = of("BILLING_PERIOD")

                @JvmStatic fun of(value: String) = ResetFrequency(JsonField.of(value))
            }

            /** An enum containing [ResetFrequency]'s known values. */
            enum class Known {
                BILLING_PERIOD
            }

            /**
             * An enum containing [ResetFrequency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ResetFrequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BILLING_PERIOD,
                /**
                 * An enum member indicating that [ResetFrequency] was instantiated with an unknown
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
                    BILLING_PERIOD -> Value.BILLING_PERIOD
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
                    BILLING_PERIOD -> Known.BILLING_PERIOD
                    else -> throw MetronomeInvalidDataException("Unknown ResetFrequency: $value")
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
            fun validate(): ResetFrequency = apply {
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

                return other is ResetFrequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AccumulatedSpend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val periodEndingBefore: JsonField<OffsetDateTime>,
            private val periodStartingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("period_ending_before")
                @ExcludeMissing
                periodEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("period_starting_at")
                @ExcludeMissing
                periodStartingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(amount, periodEndingBefore, periodStartingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun periodEndingBefore(): OffsetDateTime =
                periodEndingBefore.getRequired("period_ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun periodStartingAt(): OffsetDateTime =
                periodStartingAt.getRequired("period_starting_at")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [periodEndingBefore].
             *
             * Unlike [periodEndingBefore], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("period_ending_before")
            @ExcludeMissing
            fun _periodEndingBefore(): JsonField<OffsetDateTime> = periodEndingBefore

            /**
             * Returns the raw JSON value of [periodStartingAt].
             *
             * Unlike [periodStartingAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("period_starting_at")
            @ExcludeMissing
            fun _periodStartingAt(): JsonField<OffsetDateTime> = periodStartingAt

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
                 * Returns a mutable builder for constructing an instance of [AccumulatedSpend].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .periodEndingBefore()
                 * .periodStartingAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccumulatedSpend]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var periodEndingBefore: JsonField<OffsetDateTime>? = null
                private var periodStartingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accumulatedSpend: AccumulatedSpend) = apply {
                    amount = accumulatedSpend.amount
                    periodEndingBefore = accumulatedSpend.periodEndingBefore
                    periodStartingAt = accumulatedSpend.periodStartingAt
                    additionalProperties = accumulatedSpend.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun periodEndingBefore(periodEndingBefore: OffsetDateTime) =
                    periodEndingBefore(JsonField.of(periodEndingBefore))

                /**
                 * Sets [Builder.periodEndingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.periodEndingBefore] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun periodEndingBefore(periodEndingBefore: JsonField<OffsetDateTime>) = apply {
                    this.periodEndingBefore = periodEndingBefore
                }

                fun periodStartingAt(periodStartingAt: OffsetDateTime) =
                    periodStartingAt(JsonField.of(periodStartingAt))

                /**
                 * Sets [Builder.periodStartingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.periodStartingAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun periodStartingAt(periodStartingAt: JsonField<OffsetDateTime>) = apply {
                    this.periodStartingAt = periodStartingAt
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
                 * Returns an immutable instance of [AccumulatedSpend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .periodEndingBefore()
                 * .periodStartingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccumulatedSpend =
                    AccumulatedSpend(
                        checkRequired("amount", amount),
                        checkRequired("periodEndingBefore", periodEndingBefore),
                        checkRequired("periodStartingAt", periodStartingAt),
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
            fun validate(): AccumulatedSpend = apply {
                if (validated) {
                    return@apply
                }

                amount()
                periodEndingBefore()
                periodStartingAt()
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
                    (if (periodEndingBefore.asKnown().isPresent) 1 else 0) +
                    (if (periodStartingAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccumulatedSpend &&
                    amount == other.amount &&
                    periodEndingBefore == other.periodEndingBefore &&
                    periodStartingAt == other.periodStartingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, periodEndingBefore, periodStartingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccumulatedSpend{amount=$amount, periodEndingBefore=$periodEndingBefore, periodStartingAt=$periodStartingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendTracker &&
                alias == other.alias &&
                applicableSpendSpecifiers == other.applicableSpendSpecifiers &&
                creditTypeId == other.creditTypeId &&
                resetFrequency == other.resetFrequency &&
                accumulatedSpend == other.accumulatedSpend &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                alias,
                applicableSpendSpecifiers,
                creditTypeId,
                resetFrequency,
                accumulatedSpend,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendTracker{alias=$alias, applicableSpendSpecifiers=$applicableSpendSpecifiers, creditTypeId=$creditTypeId, resetFrequency=$resetFrequency, accumulatedSpend=$accumulatedSpend, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Contract &&
            id == other.id &&
            amendments == other.amendments &&
            current == other.current &&
            customerId == other.customerId &&
            initial == other.initial &&
            archivedAt == other.archivedAt &&
            customFields == other.customFields &&
            customerBillingProviderConfiguration == other.customerBillingProviderConfiguration &&
            packageId == other.packageId &&
            prepaidBalanceThresholdConfiguration == other.prepaidBalanceThresholdConfiguration &&
            scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices &&
            spendThresholdConfiguration == other.spendThresholdConfiguration &&
            spendTrackers == other.spendTrackers &&
            subscriptions == other.subscriptions &&
            uniquenessKey == other.uniquenessKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amendments,
            current,
            customerId,
            initial,
            archivedAt,
            customFields,
            customerBillingProviderConfiguration,
            packageId,
            prepaidBalanceThresholdConfiguration,
            scheduledChargesOnUsageInvoices,
            spendThresholdConfiguration,
            spendTrackers,
            subscriptions,
            uniquenessKey,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Contract{id=$id, amendments=$amendments, current=$current, customerId=$customerId, initial=$initial, archivedAt=$archivedAt, customFields=$customFields, customerBillingProviderConfiguration=$customerBillingProviderConfiguration, packageId=$packageId, prepaidBalanceThresholdConfiguration=$prepaidBalanceThresholdConfiguration, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, spendThresholdConfiguration=$spendThresholdConfiguration, spendTrackers=$spendTrackers, subscriptions=$subscriptions, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
