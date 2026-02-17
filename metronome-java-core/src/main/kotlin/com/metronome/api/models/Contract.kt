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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Contract
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amendments")
    @ExcludeMissing
    private val amendments: JsonField<List<Amendment>> = JsonMissing.of(),
    @JsonProperty("current")
    @ExcludeMissing
    private val current: JsonField<ContractWithoutAmendments> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("initial")
    @ExcludeMissing
    private val initial: JsonField<ContractWithoutAmendments> = JsonMissing.of(),
    @JsonProperty("archived_at")
    @ExcludeMissing
    private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("customer_billing_provider_configuration")
    @ExcludeMissing
    private val customerBillingProviderConfiguration:
        JsonField<CustomerBillingProviderConfiguration> =
        JsonMissing.of(),
    @JsonProperty("package_id")
    @ExcludeMissing
    private val packageId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("prepaid_balance_threshold_configuration")
    @ExcludeMissing
    private val prepaidBalanceThresholdConfiguration:
        JsonField<PrepaidBalanceThresholdConfiguration> =
        JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
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
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    private val uniquenessKey: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun amendments(): List<Amendment> = amendments.getRequired("amendments")

    fun current(): ContractWithoutAmendments = current.getRequired("current")

    fun customerId(): String = customerId.getRequired("customer_id")

    fun initial(): ContractWithoutAmendments = initial.getRequired("initial")

    /**
     * RFC 3339 timestamp indicating when the contract was archived. If not returned, the contract
     * is not archived.
     */
    fun archivedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(archivedAt.getNullable("archived_at"))

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** The billing provider configuration associated with a contract. */
    fun customerBillingProviderConfiguration(): Optional<CustomerBillingProviderConfiguration> =
        Optional.ofNullable(
            customerBillingProviderConfiguration.getNullable(
                "customer_billing_provider_configuration"
            )
        )

    /** ID of the package this contract was created from, if applicable. */
    fun packageId(): Optional<String> = Optional.ofNullable(packageId.getNullable("package_id"))

    fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfiguration> =
        Optional.ofNullable(
            prepaidBalanceThresholdConfiguration.getNullable(
                "prepaid_balance_threshold_configuration"
            )
        )

    /** Priority of the contract. */
    fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

    /**
     * Determines which scheduled and commit charges to consolidate onto the Contract's usage
     * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
     * consolidation to occur. This field cannot be modified after a Contract has been created. If
     * this field is omitted, charges will appear on a separate invoice from usage charges.
     */
    fun scheduledChargesOnUsageInvoices(): Optional<ScheduledChargesOnUsageInvoices> =
        Optional.ofNullable(
            scheduledChargesOnUsageInvoices.getNullable("scheduled_charges_on_usage_invoices")
        )

    fun spendThresholdConfiguration(): Optional<SpendThresholdConfiguration> =
        Optional.ofNullable(
            spendThresholdConfiguration.getNullable("spend_threshold_configuration")
        )

    /** List of subscriptions on the contract. */
    fun subscriptions(): Optional<List<Subscription>> =
        Optional.ofNullable(subscriptions.getNullable("subscriptions"))

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun uniquenessKey(): Optional<String> =
        Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("amendments")
    @ExcludeMissing
    fun _amendments(): JsonField<List<Amendment>> = amendments

    @JsonProperty("current")
    @ExcludeMissing
    fun _current(): JsonField<ContractWithoutAmendments> = current

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonProperty("initial")
    @ExcludeMissing
    fun _initial(): JsonField<ContractWithoutAmendments> = initial

    /**
     * RFC 3339 timestamp indicating when the contract was archived. If not returned, the contract
     * is not archived.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** The billing provider configuration associated with a contract. */
    @JsonProperty("customer_billing_provider_configuration")
    @ExcludeMissing
    fun _customerBillingProviderConfiguration(): JsonField<CustomerBillingProviderConfiguration> =
        customerBillingProviderConfiguration

    /** ID of the package this contract was created from, if applicable. */
    @JsonProperty("package_id") @ExcludeMissing fun _packageId(): JsonField<String> = packageId

    @JsonProperty("prepaid_balance_threshold_configuration")
    @ExcludeMissing
    fun _prepaidBalanceThresholdConfiguration(): JsonField<PrepaidBalanceThresholdConfiguration> =
        prepaidBalanceThresholdConfiguration

    /** Priority of the contract. */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    /**
     * Determines which scheduled and commit charges to consolidate onto the Contract's usage
     * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
     * consolidation to occur. This field cannot be modified after a Contract has been created. If
     * this field is omitted, charges will appear on a separate invoice from usage charges.
     */
    @JsonProperty("scheduled_charges_on_usage_invoices")
    @ExcludeMissing
    fun _scheduledChargesOnUsageInvoices(): JsonField<ScheduledChargesOnUsageInvoices> =
        scheduledChargesOnUsageInvoices

    @JsonProperty("spend_threshold_configuration")
    @ExcludeMissing
    fun _spendThresholdConfiguration(): JsonField<SpendThresholdConfiguration> =
        spendThresholdConfiguration

    /** List of subscriptions on the contract. */
    @JsonProperty("subscriptions")
    @ExcludeMissing
    fun _subscriptions(): JsonField<List<Subscription>> = subscriptions

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    fun _uniquenessKey(): JsonField<String> = uniquenessKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
        priority()
        scheduledChargesOnUsageInvoices()
        spendThresholdConfiguration().ifPresent { it.validate() }
        subscriptions().ifPresent { it.forEach { it.validate() } }
        uniquenessKey()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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
        private var priority: JsonField<Double> = JsonMissing.of()
        private var scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
            JsonMissing.of()
        private var spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
            JsonMissing.of()
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
            priority = contract.priority
            scheduledChargesOnUsageInvoices = contract.scheduledChargesOnUsageInvoices
            spendThresholdConfiguration = contract.spendThresholdConfiguration
            subscriptions = contract.subscriptions.map { it.toMutableList() }
            uniquenessKey = contract.uniquenessKey
            additionalProperties = contract.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amendments(amendments: List<Amendment>) = amendments(JsonField.of(amendments))

        fun amendments(amendments: JsonField<List<Amendment>>) = apply {
            this.amendments = amendments.map { it.toMutableList() }
        }

        fun addAmendment(amendment: Amendment) = apply {
            amendments =
                (amendments ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(amendment)
                }
        }

        fun current(current: ContractWithoutAmendments) = current(JsonField.of(current))

        fun current(current: JsonField<ContractWithoutAmendments>) = apply {
            this.current = current
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun initial(initial: ContractWithoutAmendments) = initial(JsonField.of(initial))

        fun initial(initial: JsonField<ContractWithoutAmendments>) = apply {
            this.initial = initial
        }

        /**
         * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
         * contract is not archived.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
         * contract is not archived.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** The billing provider configuration associated with a contract. */
        fun customerBillingProviderConfiguration(
            customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
        ) = customerBillingProviderConfiguration(JsonField.of(customerBillingProviderConfiguration))

        /** The billing provider configuration associated with a contract. */
        fun customerBillingProviderConfiguration(
            customerBillingProviderConfiguration: JsonField<CustomerBillingProviderConfiguration>
        ) = apply {
            this.customerBillingProviderConfiguration = customerBillingProviderConfiguration
        }

        /** ID of the package this contract was created from, if applicable. */
        fun packageId(packageId: String) = packageId(JsonField.of(packageId))

        /** ID of the package this contract was created from, if applicable. */
        fun packageId(packageId: JsonField<String>) = apply { this.packageId = packageId }

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfiguration
        ) = prepaidBalanceThresholdConfiguration(JsonField.of(prepaidBalanceThresholdConfiguration))

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: JsonField<PrepaidBalanceThresholdConfiguration>
        ) = apply {
            this.prepaidBalanceThresholdConfiguration = prepaidBalanceThresholdConfiguration
        }

        /** Priority of the contract. */
        fun priority(priority: Double) = priority(JsonField.of(priority))

        /** Priority of the contract. */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

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
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         */
        fun scheduledChargesOnUsageInvoices(
            scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>
        ) = apply { this.scheduledChargesOnUsageInvoices = scheduledChargesOnUsageInvoices }

        fun spendThresholdConfiguration(spendThresholdConfiguration: SpendThresholdConfiguration) =
            spendThresholdConfiguration(JsonField.of(spendThresholdConfiguration))

        fun spendThresholdConfiguration(
            spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>
        ) = apply { this.spendThresholdConfiguration = spendThresholdConfiguration }

        /** List of subscriptions on the contract. */
        fun subscriptions(subscriptions: List<Subscription>) =
            subscriptions(JsonField.of(subscriptions))

        /** List of subscriptions on the contract. */
        fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
            this.subscriptions = subscriptions.map { it.toMutableList() }
        }

        /** List of subscriptions on the contract. */
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
                priority,
                scheduledChargesOnUsageInvoices,
                spendThresholdConfiguration,
                (subscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                uniquenessKey,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Amendment
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commits")
        @ExcludeMissing
        private val commits: JsonField<List<Commit>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by")
        @ExcludeMissing
        private val createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overrides")
        @ExcludeMissing
        private val overrides: JsonField<List<Override>> = JsonMissing.of(),
        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        private val scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credits")
        @ExcludeMissing
        private val credits: JsonField<List<Credit>> = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("professional_services")
        @ExcludeMissing
        private val professionalServices: JsonField<List<ProService>> = JsonMissing.of(),
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        private val resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun commits(): List<Commit> = commits.getRequired("commits")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun createdBy(): String = createdBy.getRequired("created_by")

        fun overrides(): List<Override> = overrides.getRequired("overrides")

        fun scheduledCharges(): List<ScheduledCharge> =
            scheduledCharges.getRequired("scheduled_charges")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits.getNullable("credits"))

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(): Optional<List<Discount>> =
            Optional.ofNullable(discounts.getNullable("discounts"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(): Optional<List<ProService>> =
            Optional.ofNullable(professionalServices.getNullable("professional_services"))

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
            Optional.ofNullable(resellerRoyalties.getNullable("reseller_royalties"))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        @JsonProperty("overrides")
        @ExcludeMissing
        fun _overrides(): JsonField<List<Override>> = overrides

        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        @ExcludeMissing
        fun _professionalServices(): JsonField<List<ProService>> = professionalServices

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = resellerRoyalties

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

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

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
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

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: List<ProService>) =
                professionalServices(JsonField.of(professionalServices))

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: JsonField<List<ProService>>) = apply {
                this.professionalServices = professionalServices.map { it.toMutableList() }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun addProfessionalService(professionalService: ProService) = apply {
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

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /** This field's availability is dependent on your client's configuration. */
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
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ResellerRoyalty
        @JsonCreator
        private constructor(
            @JsonProperty("reseller_type")
            @ExcludeMissing
            private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
            @JsonProperty("aws_account_number")
            @ExcludeMissing
            private val awsAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            private val awsOfferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            private val awsPayerReferenceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("fraction")
            @ExcludeMissing
            private val fraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            private val gcpAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            private val gcpOfferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            private val netsuiteResellerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            private val resellerContractValue: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

            fun awsAccountNumber(): Optional<String> =
                Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

            fun awsOfferId(): Optional<String> =
                Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

            fun awsPayerReferenceId(): Optional<String> =
                Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun fraction(): Optional<Double> = Optional.ofNullable(fraction.getNullable("fraction"))

            fun gcpAccountId(): Optional<String> =
                Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

            fun gcpOfferId(): Optional<String> =
                Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

            fun netsuiteResellerId(): Optional<String> =
                Optional.ofNullable(netsuiteResellerId.getNullable("netsuite_reseller_id"))

            fun resellerContractValue(): Optional<Double> =
                Optional.ofNullable(resellerContractValue.getNullable("reseller_contract_value"))

            fun startingAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(startingAt.getNullable("starting_at"))

            @JsonProperty("reseller_type")
            @ExcludeMissing
            fun _resellerType(): JsonField<ResellerType> = resellerType

            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            fun _awsOfferId(): JsonField<String> = awsOfferId

            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId(): JsonField<String> = awsPayerReferenceId

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<Double> = fraction

            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun _gcpAccountId(): JsonField<String> = gcpAccountId

            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun _gcpOfferId(): JsonField<String> = gcpOfferId

            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            fun _netsuiteResellerId(): JsonField<String> = netsuiteResellerId

            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            fun _resellerContractValue(): JsonField<Double> = resellerContractValue

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ResellerRoyalty = apply {
                if (validated) {
                    return@apply
                }

                resellerType()
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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                    this.resellerType = resellerType
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

                fun endingBefore(endingBefore: OffsetDateTime?) =
                    endingBefore(JsonField.ofNullable(endingBefore))

                fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                    endingBefore(endingBefore.orElse(null))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

                fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                    this.gcpOfferId = gcpOfferId
                }

                fun netsuiteResellerId(netsuiteResellerId: String) =
                    netsuiteResellerId(JsonField.of(netsuiteResellerId))

                fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                    this.netsuiteResellerId = netsuiteResellerId
                }

                fun resellerContractValue(resellerContractValue: Double) =
                    resellerContractValue(JsonField.of(resellerContractValue))

                fun resellerContractValue(resellerContractValue: JsonField<Double>) = apply {
                    this.resellerContractValue = resellerContractValue
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

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
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResellerType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerRoyalty && resellerType == other.resellerType && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && endingBefore == other.endingBefore && fraction == other.fraction && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && netsuiteResellerId == other.netsuiteResellerId && resellerContractValue == other.resellerContractValue && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(resellerType, awsAccountNumber, awsOfferId, awsPayerReferenceId, endingBefore, fraction, gcpAccountId, gcpOfferId, netsuiteResellerId, resellerContractValue, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ResellerRoyalty{resellerType=$resellerType, awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, endingBefore=$endingBefore, fraction=$fraction, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, netsuiteResellerId=$netsuiteResellerId, resellerContractValue=$resellerContractValue, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Amendment && id == other.id && commits == other.commits && createdAt == other.createdAt && createdBy == other.createdBy && overrides == other.overrides && scheduledCharges == other.scheduledCharges && startingAt == other.startingAt && credits == other.credits && discounts == other.discounts && netsuiteSalesOrderId == other.netsuiteSalesOrderId && professionalServices == other.professionalServices && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, commits, createdAt, createdBy, overrides, scheduledCharges, startingAt, credits, discounts, netsuiteSalesOrderId, professionalServices, resellerRoyalties, salesforceOpportunityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amendment{id=$id, commits=$commits, createdAt=$createdAt, createdBy=$createdBy, overrides=$overrides, scheduledCharges=$scheduledCharges, startingAt=$startingAt, credits=$credits, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, additionalProperties=$additionalProperties}"
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

    /** The billing provider configuration associated with a contract. */
    @NoAutoDetect
    class CustomerBillingProviderConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("archived_at")
        @ExcludeMissing
        private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("billing_provider")
        @ExcludeMissing
        private val billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
        @JsonProperty("delivery_method")
        @ExcludeMissing
        private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        private val configuration: JsonField<Configuration> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun archivedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(archivedAt.getNullable("archived_at"))

        fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

        fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider.
         */
        fun configuration(): Optional<Configuration> =
            Optional.ofNullable(configuration.getNullable("configuration"))

        @JsonProperty("archived_at")
        @ExcludeMissing
        fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerBillingProviderConfiguration = apply {
            if (validated) {
                return@apply
            }

            archivedAt()
            billingProvider()
            deliveryMethod()
            id()
            configuration().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun archivedAt(archivedAt: Optional<OffsetDateTime>) =
                archivedAt(archivedAt.orElse(null))

            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
            }

            fun billingProvider(billingProvider: BillingProvider) =
                billingProvider(JsonField.of(billingProvider))

            fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                this.billingProvider = billingProvider
            }

            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider.
             */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider.
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

            fun build(): CustomerBillingProviderConfiguration =
                CustomerBillingProviderConfiguration(
                    checkRequired("archivedAt", archivedAt),
                    checkRequired("billingProvider", billingProvider),
                    checkRequired("deliveryMethod", deliveryMethod),
                    id,
                    configuration,
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingProvider && value == other.value /* spotless:on */
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
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider.
         */
        @NoAutoDetect
        class Configuration
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Configuration = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Configuration = Configuration(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Configuration && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Configuration{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerBillingProviderConfiguration && archivedAt == other.archivedAt && billingProvider == other.billingProvider && deliveryMethod == other.deliveryMethod && id == other.id && configuration == other.configuration && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(archivedAt, billingProvider, deliveryMethod, id, configuration, additionalProperties) }
        /* spotless:on */

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduledChargesOnUsageInvoices && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Contract && id == other.id && amendments == other.amendments && current == other.current && customerId == other.customerId && initial == other.initial && archivedAt == other.archivedAt && customFields == other.customFields && customerBillingProviderConfiguration == other.customerBillingProviderConfiguration && packageId == other.packageId && prepaidBalanceThresholdConfiguration == other.prepaidBalanceThresholdConfiguration && priority == other.priority && scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices && spendThresholdConfiguration == other.spendThresholdConfiguration && subscriptions == other.subscriptions && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amendments, current, customerId, initial, archivedAt, customFields, customerBillingProviderConfiguration, packageId, prepaidBalanceThresholdConfiguration, priority, scheduledChargesOnUsageInvoices, spendThresholdConfiguration, subscriptions, uniquenessKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Contract{id=$id, amendments=$amendments, current=$current, customerId=$customerId, initial=$initial, archivedAt=$archivedAt, customFields=$customFields, customerBillingProviderConfiguration=$customerBillingProviderConfiguration, packageId=$packageId, prepaidBalanceThresholdConfiguration=$prepaidBalanceThresholdConfiguration, priority=$priority, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, spendThresholdConfiguration=$spendThresholdConfiguration, subscriptions=$subscriptions, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
