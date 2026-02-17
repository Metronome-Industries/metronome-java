// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.BaseDeserializer
import com.metronome.api.core.BaseSerializer
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ContractV2
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
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("overrides")
    @ExcludeMissing
    private val overrides: JsonField<List<Override>> = JsonMissing.of(),
    @JsonProperty("scheduled_charges")
    @ExcludeMissing
    private val scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
    @JsonProperty("starting_at")
    @ExcludeMissing
    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("transitions")
    @ExcludeMissing
    private val transitions: JsonField<List<Transition>> = JsonMissing.of(),
    @JsonProperty("usage_filter")
    @ExcludeMissing
    private val usageFilter: JsonField<List<UsageFilter>> = JsonMissing.of(),
    @JsonProperty("usage_statement_schedule")
    @ExcludeMissing
    private val usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of(),
    @JsonProperty("archived_at")
    @ExcludeMissing
    private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credits")
    @ExcludeMissing
    private val credits: JsonField<List<Credit>> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("customer_billing_provider_configuration")
    @ExcludeMissing
    private val customerBillingProviderConfiguration:
        JsonField<CustomerBillingProviderConfiguration> =
        JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("has_more")
    @ExcludeMissing
    private val hasMore: JsonField<HasMore> = JsonMissing.of(),
    @JsonProperty("hierarchy_configuration")
    @ExcludeMissing
    private val hierarchyConfiguration: JsonField<HierarchyConfiguration> = JsonMissing.of(),
    @JsonProperty("multiplier_override_prioritization")
    @ExcludeMissing
    private val multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization> =
        JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    private val netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("prepaid_balance_threshold_configuration")
    @ExcludeMissing
    private val prepaidBalanceThresholdConfiguration:
        JsonField<PrepaidBalanceThresholdConfigurationV2> =
        JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("professional_services")
    @ExcludeMissing
    private val professionalServices: JsonField<List<ProService>> = JsonMissing.of(),
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
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("scheduled_charges_on_usage_invoices")
    @ExcludeMissing
    private val scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
        JsonMissing.of(),
    @JsonProperty("spend_threshold_configuration")
    @ExcludeMissing
    private val spendThresholdConfiguration: JsonField<SpendThresholdConfigurationV2> =
        JsonMissing.of(),
    @JsonProperty("subscriptions")
    @ExcludeMissing
    private val subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
    @JsonProperty("total_contract_value")
    @ExcludeMissing
    private val totalContractValue: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    private val uniquenessKey: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun commits(): List<Commit> = commits.getRequired("commits")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun createdBy(): String = createdBy.getRequired("created_by")

    fun customerId(): String = customerId.getRequired("customer_id")

    fun overrides(): List<Override> = overrides.getRequired("overrides")

    fun scheduledCharges(): List<ScheduledCharge> =
        scheduledCharges.getRequired("scheduled_charges")

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun transitions(): List<Transition> = transitions.getRequired("transitions")

    fun usageFilter(): List<UsageFilter> = usageFilter.getRequired("usage_filter")

    fun usageStatementSchedule(): UsageStatementSchedule =
        usageStatementSchedule.getRequired("usage_statement_schedule")

    fun archivedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(archivedAt.getNullable("archived_at"))

    fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits.getNullable("credits"))

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** This field's availability is dependent on your client's configuration. */
    fun customerBillingProviderConfiguration(): Optional<CustomerBillingProviderConfiguration> =
        Optional.ofNullable(
            customerBillingProviderConfiguration.getNullable(
                "customer_billing_provider_configuration"
            )
        )

    /** This field's availability is dependent on your client's configuration. */
    fun discounts(): Optional<List<Discount>> =
        Optional.ofNullable(discounts.getNullable("discounts"))

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    /**
     * Indicates whether there are more items than the limit for this endpoint. Use the respective
     * list endpoints to get the full lists.
     */
    fun hasMore(): Optional<HasMore> = Optional.ofNullable(hasMore.getNullable("has_more"))

    /**
     * Either a **parent** configuration with a list of children or a **child** configuration with a
     * single parent.
     */
    fun hierarchyConfiguration(): Optional<HierarchyConfiguration> =
        Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

    /**
     * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
     * automatically. EXPLICIT prioritization requires specifying priorities for each multiplier;
     * the one with the lowest priority value will be prioritized first.
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

    fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfigurationV2> =
        Optional.ofNullable(
            prepaidBalanceThresholdConfiguration.getNullable(
                "prepaid_balance_threshold_configuration"
            )
        )

    /** Priority of the contract. */
    fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

    /** This field's availability is dependent on your client's configuration. */
    fun professionalServices(): Optional<List<ProService>> =
        Optional.ofNullable(professionalServices.getNullable("professional_services"))

    fun rateCardId(): Optional<String> = Optional.ofNullable(rateCardId.getNullable("rate_card_id"))

    fun recurringCommits(): Optional<List<RecurringCommit>> =
        Optional.ofNullable(recurringCommits.getNullable("recurring_commits"))

    fun recurringCredits(): Optional<List<RecurringCredit>> =
        Optional.ofNullable(recurringCredits.getNullable("recurring_credits"))

    /** This field's availability is dependent on your client's configuration. */
    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
        Optional.ofNullable(resellerRoyalties.getNullable("reseller_royalties"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

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

    fun spendThresholdConfiguration(): Optional<SpendThresholdConfigurationV2> =
        Optional.ofNullable(
            spendThresholdConfiguration.getNullable("spend_threshold_configuration")
        )

    /** List of subscriptions on the contract. */
    fun subscriptions(): Optional<List<Subscription>> =
        Optional.ofNullable(subscriptions.getNullable("subscriptions"))

    fun totalContractValue(): Optional<Double> =
        Optional.ofNullable(totalContractValue.getNullable("total_contract_value"))

    /** Optional uniqueness key to prevent duplicate contract creations. */
    fun uniquenessKey(): Optional<String> =
        Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonProperty("overrides")
    @ExcludeMissing
    fun _overrides(): JsonField<List<Override>> = overrides

    @JsonProperty("scheduled_charges")
    @ExcludeMissing
    fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

    @JsonProperty("transitions")
    @ExcludeMissing
    fun _transitions(): JsonField<List<Transition>> = transitions

    @JsonProperty("usage_filter")
    @ExcludeMissing
    fun _usageFilter(): JsonField<List<UsageFilter>> = usageFilter

    @JsonProperty("usage_statement_schedule")
    @ExcludeMissing
    fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> = usageStatementSchedule

    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("customer_billing_provider_configuration")
    @ExcludeMissing
    fun _customerBillingProviderConfiguration(): JsonField<CustomerBillingProviderConfiguration> =
        customerBillingProviderConfiguration

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<Discount>> = discounts

    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    /**
     * Indicates whether there are more items than the limit for this endpoint. Use the respective
     * list endpoints to get the full lists.
     */
    @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<HasMore> = hasMore

    /**
     * Either a **parent** configuration with a list of children or a **child** configuration with a
     * single parent.
     */
    @JsonProperty("hierarchy_configuration")
    @ExcludeMissing
    fun _hierarchyConfiguration(): JsonField<HierarchyConfiguration> = hierarchyConfiguration

    /**
     * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
     * automatically. EXPLICIT prioritization requires specifying priorities for each multiplier;
     * the one with the lowest priority value will be prioritized first.
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

    @JsonProperty("prepaid_balance_threshold_configuration")
    @ExcludeMissing
    fun _prepaidBalanceThresholdConfiguration(): JsonField<PrepaidBalanceThresholdConfigurationV2> =
        prepaidBalanceThresholdConfiguration

    /** Priority of the contract. */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("professional_services")
    @ExcludeMissing
    fun _professionalServices(): JsonField<List<ProService>> = professionalServices

    @JsonProperty("rate_card_id") @ExcludeMissing fun _rateCardId(): JsonField<String> = rateCardId

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

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

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
    fun _spendThresholdConfiguration(): JsonField<SpendThresholdConfigurationV2> =
        spendThresholdConfiguration

    /** List of subscriptions on the contract. */
    @JsonProperty("subscriptions")
    @ExcludeMissing
    fun _subscriptions(): JsonField<List<Subscription>> = subscriptions

    @JsonProperty("total_contract_value")
    @ExcludeMissing
    fun _totalContractValue(): JsonField<Double> = totalContractValue

    /** Optional uniqueness key to prevent duplicate contract creations. */
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    fun _uniquenessKey(): JsonField<String> = uniquenessKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ContractV2 = apply {
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
        archivedAt()
        credits().ifPresent { it.forEach { it.validate() } }
        customFields().ifPresent { it.validate() }
        customerBillingProviderConfiguration().ifPresent { it.validate() }
        discounts().ifPresent { it.forEach { it.validate() } }
        endingBefore()
        hasMore().ifPresent { it.validate() }
        hierarchyConfiguration().ifPresent { it.validate() }
        multiplierOverridePrioritization()
        name()
        netPaymentTermsDays()
        netsuiteSalesOrderId()
        prepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
        priority()
        professionalServices().ifPresent { it.forEach { it.validate() } }
        rateCardId()
        recurringCommits().ifPresent { it.forEach { it.validate() } }
        recurringCredits().ifPresent { it.forEach { it.validate() } }
        resellerRoyalties().ifPresent { it.forEach { it.validate() } }
        salesforceOpportunityId()
        scheduledChargesOnUsageInvoices()
        spendThresholdConfiguration().ifPresent { it.validate() }
        subscriptions().ifPresent { it.forEach { it.validate() } }
        totalContractValue()
        uniquenessKey()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractV2]. */
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
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var credits: JsonField<MutableList<Credit>>? = null
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var customerBillingProviderConfiguration:
            JsonField<CustomerBillingProviderConfiguration> =
            JsonMissing.of()
        private var discounts: JsonField<MutableList<Discount>>? = null
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var hasMore: JsonField<HasMore> = JsonMissing.of()
        private var hierarchyConfiguration: JsonField<HierarchyConfiguration> = JsonMissing.of()
        private var multiplierOverridePrioritization: JsonField<MultiplierOverridePrioritization> =
            JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var prepaidBalanceThresholdConfiguration:
            JsonField<PrepaidBalanceThresholdConfigurationV2> =
            JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var professionalServices: JsonField<MutableList<ProService>>? = null
        private var rateCardId: JsonField<String> = JsonMissing.of()
        private var recurringCommits: JsonField<MutableList<RecurringCommit>>? = null
        private var recurringCredits: JsonField<MutableList<RecurringCredit>>? = null
        private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
            JsonMissing.of()
        private var spendThresholdConfiguration: JsonField<SpendThresholdConfigurationV2> =
            JsonMissing.of()
        private var subscriptions: JsonField<MutableList<Subscription>>? = null
        private var totalContractValue: JsonField<Double> = JsonMissing.of()
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractV2: ContractV2) = apply {
            id = contractV2.id
            commits = contractV2.commits.map { it.toMutableList() }
            createdAt = contractV2.createdAt
            createdBy = contractV2.createdBy
            customerId = contractV2.customerId
            overrides = contractV2.overrides.map { it.toMutableList() }
            scheduledCharges = contractV2.scheduledCharges.map { it.toMutableList() }
            startingAt = contractV2.startingAt
            transitions = contractV2.transitions.map { it.toMutableList() }
            usageFilter = contractV2.usageFilter.map { it.toMutableList() }
            usageStatementSchedule = contractV2.usageStatementSchedule
            archivedAt = contractV2.archivedAt
            credits = contractV2.credits.map { it.toMutableList() }
            customFields = contractV2.customFields
            customerBillingProviderConfiguration = contractV2.customerBillingProviderConfiguration
            discounts = contractV2.discounts.map { it.toMutableList() }
            endingBefore = contractV2.endingBefore
            hasMore = contractV2.hasMore
            hierarchyConfiguration = contractV2.hierarchyConfiguration
            multiplierOverridePrioritization = contractV2.multiplierOverridePrioritization
            name = contractV2.name
            netPaymentTermsDays = contractV2.netPaymentTermsDays
            netsuiteSalesOrderId = contractV2.netsuiteSalesOrderId
            prepaidBalanceThresholdConfiguration = contractV2.prepaidBalanceThresholdConfiguration
            priority = contractV2.priority
            professionalServices = contractV2.professionalServices.map { it.toMutableList() }
            rateCardId = contractV2.rateCardId
            recurringCommits = contractV2.recurringCommits.map { it.toMutableList() }
            recurringCredits = contractV2.recurringCredits.map { it.toMutableList() }
            resellerRoyalties = contractV2.resellerRoyalties.map { it.toMutableList() }
            salesforceOpportunityId = contractV2.salesforceOpportunityId
            scheduledChargesOnUsageInvoices = contractV2.scheduledChargesOnUsageInvoices
            spendThresholdConfiguration = contractV2.spendThresholdConfiguration
            subscriptions = contractV2.subscriptions.map { it.toMutableList() }
            totalContractValue = contractV2.totalContractValue
            uniquenessKey = contractV2.uniquenessKey
            additionalProperties = contractV2.additionalProperties.toMutableMap()
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

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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

        fun transitions(transitions: List<Transition>) = transitions(JsonField.of(transitions))

        fun transitions(transitions: JsonField<List<Transition>>) = apply {
            this.transitions = transitions.map { it.toMutableList() }
        }

        fun addTransition(transition: Transition) = apply {
            transitions =
                (transitions ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(transition)
                }
        }

        fun usageFilter(usageFilter: List<UsageFilter>) = usageFilter(JsonField.of(usageFilter))

        fun usageFilter(usageFilter: JsonField<List<UsageFilter>>) = apply {
            this.usageFilter = usageFilter.map { it.toMutableList() }
        }

        fun addUsageFilter(usageFilter: UsageFilter) = apply {
            this.usageFilter =
                (this.usageFilter ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(usageFilter)
                }
        }

        fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) =
            usageStatementSchedule(JsonField.of(usageStatementSchedule))

        fun usageStatementSchedule(usageStatementSchedule: JsonField<UsageStatementSchedule>) =
            apply {
                this.usageStatementSchedule = usageStatementSchedule
            }

        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
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
        fun customerBillingProviderConfiguration(
            customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
        ) = customerBillingProviderConfiguration(JsonField.of(customerBillingProviderConfiguration))

        /** This field's availability is dependent on your client's configuration. */
        fun customerBillingProviderConfiguration(
            customerBillingProviderConfiguration: JsonField<CustomerBillingProviderConfiguration>
        ) = apply {
            this.customerBillingProviderConfiguration = customerBillingProviderConfiguration
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

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        /**
         * Indicates whether there are more items than the limit for this endpoint. Use the
         * respective list endpoints to get the full lists.
         */
        fun hasMore(hasMore: HasMore) = hasMore(JsonField.of(hasMore))

        /**
         * Indicates whether there are more items than the limit for this endpoint. Use the
         * respective list endpoints to get the full lists.
         */
        fun hasMore(hasMore: JsonField<HasMore>) = apply { this.hasMore = hasMore }

        /**
         * Either a **parent** configuration with a list of children or a **child** configuration
         * with a single parent.
         */
        fun hierarchyConfiguration(hierarchyConfiguration: HierarchyConfiguration) =
            hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

        /**
         * Either a **parent** configuration with a list of children or a **child** configuration
         * with a single parent.
         */
        fun hierarchyConfiguration(hierarchyConfiguration: JsonField<HierarchyConfiguration>) =
            apply {
                this.hierarchyConfiguration = hierarchyConfiguration
            }

        /**
         * Either a **parent** configuration with a list of children or a **child** configuration
         * with a single parent.
         */
        fun hierarchyConfiguration(parent: HierarchyConfiguration.ParentHierarchyConfiguration) =
            hierarchyConfiguration(HierarchyConfiguration.ofParent(parent))

        /**
         * Either a **parent** configuration with a list of children or a **child** configuration
         * with a single parent.
         */
        fun hierarchyConfiguration(
            childHierarchyConfigurationV2: HierarchyConfiguration.ChildHierarchyConfigurationV2
        ) =
            hierarchyConfiguration(
                HierarchyConfiguration.ofChildHierarchyConfigurationV2(
                    childHierarchyConfigurationV2
                )
            )

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first.
         */
        fun multiplierOverridePrioritization(
            multiplierOverridePrioritization: MultiplierOverridePrioritization
        ) = multiplierOverridePrioritization(JsonField.of(multiplierOverridePrioritization))

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first.
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

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfigurationV2
        ) = prepaidBalanceThresholdConfiguration(JsonField.of(prepaidBalanceThresholdConfiguration))

        fun prepaidBalanceThresholdConfiguration(
            prepaidBalanceThresholdConfiguration: JsonField<PrepaidBalanceThresholdConfigurationV2>
        ) = apply {
            this.prepaidBalanceThresholdConfiguration = prepaidBalanceThresholdConfiguration
        }

        /** Priority of the contract. */
        fun priority(priority: Double) = priority(JsonField.of(priority))

        /** Priority of the contract. */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

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

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
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
         * Determines which scheduled and commit charges to consolidate onto the Contract's usage
         * invoice. The charge's `timestamp` must match the usage invoice's `ending_before` date for
         * consolidation to occur. This field cannot be modified after a Contract has been created.
         * If this field is omitted, charges will appear on a separate invoice from usage charges.
         */
        fun scheduledChargesOnUsageInvoices(
            scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>
        ) = apply { this.scheduledChargesOnUsageInvoices = scheduledChargesOnUsageInvoices }

        fun spendThresholdConfiguration(
            spendThresholdConfiguration: SpendThresholdConfigurationV2
        ) = spendThresholdConfiguration(JsonField.of(spendThresholdConfiguration))

        fun spendThresholdConfiguration(
            spendThresholdConfiguration: JsonField<SpendThresholdConfigurationV2>
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

        fun totalContractValue(totalContractValue: Double) =
            totalContractValue(JsonField.of(totalContractValue))

        fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
            this.totalContractValue = totalContractValue
        }

        /** Optional uniqueness key to prevent duplicate contract creations. */
        fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

        /** Optional uniqueness key to prevent duplicate contract creations. */
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

        fun build(): ContractV2 =
            ContractV2(
                checkRequired("id", id),
                checkRequired("commits", commits).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("customerId", customerId),
                checkRequired("overrides", overrides).map { it.toImmutable() },
                checkRequired("scheduledCharges", scheduledCharges).map { it.toImmutable() },
                checkRequired("startingAt", startingAt),
                checkRequired("transitions", transitions).map { it.toImmutable() },
                checkRequired("usageFilter", usageFilter).map { it.toImmutable() },
                checkRequired("usageStatementSchedule", usageStatementSchedule),
                archivedAt,
                (credits ?: JsonMissing.of()).map { it.toImmutable() },
                customFields,
                customerBillingProviderConfiguration,
                (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                endingBefore,
                hasMore,
                hierarchyConfiguration,
                multiplierOverridePrioritization,
                name,
                netPaymentTermsDays,
                netsuiteSalesOrderId,
                prepaidBalanceThresholdConfiguration,
                priority,
                (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                rateCardId,
                (recurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                (recurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                salesforceOpportunityId,
                scheduledChargesOnUsageInvoices,
                spendThresholdConfiguration,
                (subscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                totalContractValue,
                uniquenessKey,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Commit
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("product")
        @ExcludeMissing
        private val product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("access_schedule")
        @ExcludeMissing
        private val accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        private val applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("balance")
        @ExcludeMissing
        private val balance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("contract")
        @ExcludeMissing
        private val contract: JsonField<Contract> = JsonMissing.of(),
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
        @JsonProperty("invoice_contract")
        @ExcludeMissing
        private val invoiceContract: JsonField<InvoiceContract> = JsonMissing.of(),
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        private val invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of(),
        @JsonProperty("ledger")
        @ExcludeMissing
        private val ledger: JsonField<List<Ledger>> = JsonMissing.of(),
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
        @JsonProperty("recurring_commit_id")
        @ExcludeMissing
        private val recurringCommitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rolled_over_from")
        @ExcludeMissing
        private val rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
        @JsonProperty("subscription_config")
        @ExcludeMissing
        private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /**
         * Timestamp of when the commit was created.
         * - Recurring commits: latter of commit service period date and parent commit start date
         * - Rollover commits: when the new contract started
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun product(): Product = product.getRequired("product")

        fun type(): Type = type.getRequired("type")

        /**
         * The schedule that the customer will gain access to the credits purposed with this commit.
         */
        fun accessSchedule(): Optional<ScheduleDuration> =
            Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

        fun applicableContractIds(): Optional<List<String>> =
            Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun archivedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(archivedAt.getNullable("archived_at"))

        /**
         * The current balance of the credit or commit. This balance reflects the amount of credit
         * or commit that the customer has access to use at this moment - thus, expired and upcoming
         * credit or commit segments contribute 0 to the balance. The balance will match the sum of
         * all ledger entries with the exception of the case where the sum of negative manual ledger
         * entries exceeds the positive amount remaining on the credit or commit - in that case, the
         * balance will be 0. All manual ledger entries associated with active credit or commit
         * segments are included in the balance, including future-dated manual ledger entries.
         */
        fun balance(): Optional<Double> = Optional.ofNullable(balance.getNullable("balance"))

        fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Optional configuration for commit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /** The contract that this commit will be billed on. */
        fun invoiceContract(): Optional<InvoiceContract> =
            Optional.ofNullable(invoiceContract.getNullable("invoice_contract"))

        /** The schedule that the customer will be invoiced for this commit. */
        fun invoiceSchedule(): Optional<SchedulePointInTime> =
            Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun ledger(): Optional<List<Ledger>> = Optional.ofNullable(ledger.getNullable("ledger"))

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /** The ID of the recurring commit that created this commit */
        fun recurringCommitId(): Optional<String> =
            Optional.ofNullable(recurringCommitId.getNullable("recurring_commit_id"))

        fun rolledOverFrom(): Optional<RolledOverFrom> =
            Optional.ofNullable(rolledOverFrom.getNullable("rolled_over_from"))

        fun rolloverFraction(): Optional<Double> =
            Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown.
         */
        fun specifiers(): Optional<List<CommitSpecifier>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** Attach a subscription to the recurring commit/credit. */
        fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
            Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Timestamp of when the commit was created.
         * - Recurring commits: latter of commit service period date and parent commit start date
         * - Rollover commits: when the new contract started
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * The schedule that the customer will gain access to the credits purposed with this commit.
         */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<ScheduleDuration> = accessSchedule

        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        @JsonProperty("archived_at")
        @ExcludeMissing
        fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

        /**
         * The current balance of the credit or commit. This balance reflects the amount of credit
         * or commit that the customer has access to use at this moment - thus, expired and upcoming
         * credit or commit segments contribute 0 to the balance. The balance will match the sum of
         * all ledger entries with the exception of the case where the sum of negative manual ledger
         * entries exceeds the positive amount remaining on the credit or commit - in that case, the
         * balance will be 0. All manual ledger entries associated with active credit or commit
         * segments are included in the balance, including future-dated manual ledger entries.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Optional configuration for commit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /** The contract that this commit will be billed on. */
        @JsonProperty("invoice_contract")
        @ExcludeMissing
        fun _invoiceContract(): JsonField<InvoiceContract> = invoiceContract

        /** The schedule that the customer will be invoiced for this commit. */
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        fun _invoiceSchedule(): JsonField<SchedulePointInTime> = invoiceSchedule

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        @JsonProperty("ledger") @ExcludeMissing fun _ledger(): JsonField<List<Ledger>> = ledger

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** The ID of the recurring commit that created this commit */
        @JsonProperty("recurring_commit_id")
        @ExcludeMissing
        fun _recurringCommitId(): JsonField<String> = recurringCommitId

        @JsonProperty("rolled_over_from")
        @ExcludeMissing
        fun _rolledOverFrom(): JsonField<RolledOverFrom> = rolledOverFrom

        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

        /** Attach a subscription to the recurring commit/credit. */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> = subscriptionConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            product().validate()
            type()
            accessSchedule().ifPresent { it.validate() }
            applicableContractIds()
            applicableProductIds()
            applicableProductTags()
            archivedAt()
            balance()
            contract().ifPresent { it.validate() }
            customFields().ifPresent { it.validate() }
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            invoiceContract().ifPresent { it.validate() }
            invoiceSchedule().ifPresent { it.validate() }
            ledger().ifPresent { it.forEach { it.validate() } }
            name()
            netsuiteSalesOrderId()
            priority()
            rateType()
            recurringCommitId()
            rolledOverFrom().ifPresent { it.validate() }
            rolloverFraction()
            salesforceOpportunityId()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commit]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var product: JsonField<Product>? = null
            private var type: JsonField<Type>? = null
            private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
            private var applicableContractIds: JsonField<MutableList<String>>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var balance: JsonField<Double> = JsonMissing.of()
            private var contract: JsonField<Contract> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var invoiceContract: JsonField<InvoiceContract> = JsonMissing.of()
            private var invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of()
            private var ledger: JsonField<MutableList<Ledger>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var recurringCommitId: JsonField<String> = JsonMissing.of()
            private var rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
            private var subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                id = commit.id
                createdAt = commit.createdAt
                product = commit.product
                type = commit.type
                accessSchedule = commit.accessSchedule
                applicableContractIds = commit.applicableContractIds.map { it.toMutableList() }
                applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
                archivedAt = commit.archivedAt
                balance = commit.balance
                contract = commit.contract
                customFields = commit.customFields
                description = commit.description
                hierarchyConfiguration = commit.hierarchyConfiguration
                invoiceContract = commit.invoiceContract
                invoiceSchedule = commit.invoiceSchedule
                ledger = commit.ledger.map { it.toMutableList() }
                name = commit.name
                netsuiteSalesOrderId = commit.netsuiteSalesOrderId
                priority = commit.priority
                rateType = commit.rateType
                recurringCommitId = commit.recurringCommitId
                rolledOverFrom = commit.rolledOverFrom
                rolloverFraction = commit.rolloverFraction
                salesforceOpportunityId = commit.salesforceOpportunityId
                specifiers = commit.specifiers.map { it.toMutableList() }
                subscriptionConfig = commit.subscriptionConfig
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Timestamp of when the commit was created.
             * - Recurring commits: latter of commit service period date and parent commit start
             *   date
             * - Rollover commits: when the new contract started
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Timestamp of when the commit was created.
             * - Recurring commits: latter of commit service period date and parent commit start
             *   date
             * - Rollover commits: when the new contract started
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun product(product: Product) = product(JsonField.of(product))

            fun product(product: JsonField<Product>) = apply { this.product = product }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The schedule that the customer will gain access to the credits purposed with this
             * commit.
             */
            fun accessSchedule(accessSchedule: ScheduleDuration) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * The schedule that the customer will gain access to the credits purposed with this
             * commit.
             */
            fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun applicableContractIds(applicableContractIds: List<String>) =
                applicableContractIds(JsonField.of(applicableContractIds))

            fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
                this.applicableContractIds = applicableContractIds.map { it.toMutableList() }
            }

            fun addApplicableContractId(applicableContractId: String) = apply {
                applicableContractIds =
                    (applicableContractIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableContractId)
                    }
            }

            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

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

            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

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

            fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
            }

            /**
             * The current balance of the credit or commit. This balance reflects the amount of
             * credit or commit that the customer has access to use at this moment - thus, expired
             * and upcoming credit or commit segments contribute 0 to the balance. The balance will
             * match the sum of all ledger entries with the exception of the case where the sum of
             * negative manual ledger entries exceeds the positive amount remaining on the credit or
             * commit - in that case, the balance will be 0. All manual ledger entries associated
             * with active credit or commit segments are included in the balance, including
             * future-dated manual ledger entries.
             */
            fun balance(balance: Double) = balance(JsonField.of(balance))

            /**
             * The current balance of the credit or commit. This balance reflects the amount of
             * credit or commit that the customer has access to use at this moment - thus, expired
             * and upcoming credit or commit segments contribute 0 to the balance. The balance will
             * match the sum of all ledger entries with the exception of the case where the sum of
             * negative manual ledger entries exceeds the positive amount remaining on the credit or
             * commit - in that case, the balance will be 0. All manual ledger entries associated
             * with active credit or commit segments are included in the balance, including
             * future-dated manual ledger entries.
             */
            fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

            fun contract(contract: Contract) = contract(JsonField.of(contract))

            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

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

            /** Optional configuration for commit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for commit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** The contract that this commit will be billed on. */
            fun invoiceContract(invoiceContract: InvoiceContract) =
                invoiceContract(JsonField.of(invoiceContract))

            /** The contract that this commit will be billed on. */
            fun invoiceContract(invoiceContract: JsonField<InvoiceContract>) = apply {
                this.invoiceContract = invoiceContract
            }

            /** The schedule that the customer will be invoiced for this commit. */
            fun invoiceSchedule(invoiceSchedule: SchedulePointInTime) =
                invoiceSchedule(JsonField.of(invoiceSchedule))

            /** The schedule that the customer will be invoiced for this commit. */
            fun invoiceSchedule(invoiceSchedule: JsonField<SchedulePointInTime>) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun ledger(ledger: List<Ledger>) = ledger(JsonField.of(ledger))

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun ledger(ledger: JsonField<List<Ledger>>) = apply {
                this.ledger = ledger.map { it.toMutableList() }
            }

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(ledger: Ledger) = apply {
                this.ledger =
                    (this.ledger ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(ledger)
                    }
            }

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                prepaidCommitSegmentStartLedgerEntry: Ledger.PrepaidCommitSegmentStartLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPrepaidCommitSegmentStartLedgerEntry(
                        prepaidCommitSegmentStartLedgerEntry
                    )
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                    Ledger.PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                    )
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                prepaidCommitRolloverLedgerEntry: Ledger.PrepaidCommitRolloverLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPrepaidCommitRolloverLedgerEntry(prepaidCommitRolloverLedgerEntry)
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                prepaidCommitExpirationLedgerEntry: Ledger.PrepaidCommitExpirationLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPrepaidCommitExpirationLedgerEntry(prepaidCommitExpirationLedgerEntry)
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                prepaidCommitCanceledLedgerEntry: Ledger.PrepaidCommitCanceledLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPrepaidCommitCanceledLedgerEntry(prepaidCommitCanceledLedgerEntry)
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                prepaidCommitCreditedLedgerEntry: Ledger.PrepaidCommitCreditedLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPrepaidCommitCreditedLedgerEntry(prepaidCommitCreditedLedgerEntry)
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                prepaidCommitSeatBasedAdjustmentLedgerEntry:
                    Ledger.PrepaidCommitSeatBasedAdjustmentLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                        prepaidCommitSeatBasedAdjustmentLedgerEntry
                    )
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                postpaidCommitInitialBalanceLedgerEntry:
                    Ledger.PostpaidCommitInitialBalanceLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPostpaidCommitInitialBalanceLedgerEntry(
                        postpaidCommitInitialBalanceLedgerEntry
                    )
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                    Ledger.PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                    )
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                postpaidCommitRolloverLedgerEntry: Ledger.PostpaidCommitRolloverLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPostpaidCommitRolloverLedgerEntry(postpaidCommitRolloverLedgerEntry)
                )

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(postpaidCommitTrueupLedgerEntry: Ledger.PostpaidCommitTrueupLedgerEntry) =
                addLedger(Ledger.ofPostpaidCommitTrueupLedgerEntry(postpaidCommitTrueupLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(prepaidCommitManualLedgerEntry: Ledger.PrepaidCommitManualLedgerEntry) =
                addLedger(Ledger.ofPrepaidCommitManualLedgerEntry(prepaidCommitManualLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(postpaidCommitManualLedgerEntry: Ledger.PostpaidCommitManualLedgerEntry) =
                addLedger(Ledger.ofPostpaidCommitManualLedgerEntry(postpaidCommitManualLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a commit. For example, an invoice
             * deduction or a rollover.
             */
            fun addLedger(
                postpaidCommitExpirationLedgerEntry: Ledger.PostpaidCommitExpirationLedgerEntry
            ) =
                addLedger(
                    Ledger.ofPostpaidCommitExpirationLedgerEntry(
                        postpaidCommitExpirationLedgerEntry
                    )
                )

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** The ID of the recurring commit that created this commit */
            fun recurringCommitId(recurringCommitId: String) =
                recurringCommitId(JsonField.of(recurringCommitId))

            /** The ID of the recurring commit that created this commit */
            fun recurringCommitId(recurringCommitId: JsonField<String>) = apply {
                this.recurringCommitId = recurringCommitId
            }

            fun rolledOverFrom(rolledOverFrom: RolledOverFrom) =
                rolledOverFrom(JsonField.of(rolledOverFrom))

            fun rolledOverFrom(rolledOverFrom: JsonField<RolledOverFrom>) = apply {
                this.rolledOverFrom = rolledOverFrom
            }

            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(JsonField.of(rolloverFraction))

            fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: List<CommitSpecifier>) = specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun addSpecifier(specifier: CommitSpecifier) = apply {
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
            fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /** Attach a subscription to the recurring commit/credit. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Commit =
                Commit(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("product", product),
                    checkRequired("type", type),
                    accessSchedule,
                    (applicableContractIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    archivedAt,
                    balance,
                    contract,
                    customFields,
                    description,
                    hierarchyConfiguration,
                    invoiceContract,
                    invoiceSchedule,
                    (ledger ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    rateType,
                    recurringCommitId,
                    rolledOverFrom,
                    rolloverFraction,
                    salesforceOpportunityId,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Product
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Product = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Product]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(product: Product) = apply {
                    id = product.id
                    name = product.name
                    additionalProperties = product.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Product =
                    Product(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
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

        @NoAutoDetect
        class Contract
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Contract = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contract]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contract: Contract) = apply {
                    id = contract.id
                    additionalProperties = contract.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Contract =
                    Contract(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Contract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"
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

        /** The contract that this commit will be billed on. */
        @NoAutoDetect
        class InvoiceContract
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InvoiceContract = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceContract]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceContract: InvoiceContract) = apply {
                    id = invoiceContract.id
                    additionalProperties = invoiceContract.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): InvoiceContract =
                    InvoiceContract(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceContract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceContract{id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = Ledger.Deserializer::class)
        @JsonSerialize(using = Ledger.Serializer::class)
        class Ledger
        private constructor(
            private val prepaidCommitSegmentStartLedgerEntry:
                PrepaidCommitSegmentStartLedgerEntry? =
                null,
            private val prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                PrepaidCommitAutomatedInvoiceDeductionLedgerEntry? =
                null,
            private val prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry? = null,
            private val prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry? =
                null,
            private val prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry? = null,
            private val prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry? = null,
            private val prepaidCommitSeatBasedAdjustmentLedgerEntry:
                PrepaidCommitSeatBasedAdjustmentLedgerEntry? =
                null,
            private val postpaidCommitInitialBalanceLedgerEntry:
                PostpaidCommitInitialBalanceLedgerEntry? =
                null,
            private val postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                PostpaidCommitAutomatedInvoiceDeductionLedgerEntry? =
                null,
            private val postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry? =
                null,
            private val postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry? = null,
            private val prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry? = null,
            private val postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry? = null,
            private val postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun prepaidCommitSegmentStartLedgerEntry():
                Optional<PrepaidCommitSegmentStartLedgerEntry> =
                Optional.ofNullable(prepaidCommitSegmentStartLedgerEntry)

            fun prepaidCommitAutomatedInvoiceDeductionLedgerEntry():
                Optional<PrepaidCommitAutomatedInvoiceDeductionLedgerEntry> =
                Optional.ofNullable(prepaidCommitAutomatedInvoiceDeductionLedgerEntry)

            fun prepaidCommitRolloverLedgerEntry(): Optional<PrepaidCommitRolloverLedgerEntry> =
                Optional.ofNullable(prepaidCommitRolloverLedgerEntry)

            fun prepaidCommitExpirationLedgerEntry(): Optional<PrepaidCommitExpirationLedgerEntry> =
                Optional.ofNullable(prepaidCommitExpirationLedgerEntry)

            fun prepaidCommitCanceledLedgerEntry(): Optional<PrepaidCommitCanceledLedgerEntry> =
                Optional.ofNullable(prepaidCommitCanceledLedgerEntry)

            fun prepaidCommitCreditedLedgerEntry(): Optional<PrepaidCommitCreditedLedgerEntry> =
                Optional.ofNullable(prepaidCommitCreditedLedgerEntry)

            fun prepaidCommitSeatBasedAdjustmentLedgerEntry():
                Optional<PrepaidCommitSeatBasedAdjustmentLedgerEntry> =
                Optional.ofNullable(prepaidCommitSeatBasedAdjustmentLedgerEntry)

            fun postpaidCommitInitialBalanceLedgerEntry():
                Optional<PostpaidCommitInitialBalanceLedgerEntry> =
                Optional.ofNullable(postpaidCommitInitialBalanceLedgerEntry)

            fun postpaidCommitAutomatedInvoiceDeductionLedgerEntry():
                Optional<PostpaidCommitAutomatedInvoiceDeductionLedgerEntry> =
                Optional.ofNullable(postpaidCommitAutomatedInvoiceDeductionLedgerEntry)

            fun postpaidCommitRolloverLedgerEntry(): Optional<PostpaidCommitRolloverLedgerEntry> =
                Optional.ofNullable(postpaidCommitRolloverLedgerEntry)

            fun postpaidCommitTrueupLedgerEntry(): Optional<PostpaidCommitTrueupLedgerEntry> =
                Optional.ofNullable(postpaidCommitTrueupLedgerEntry)

            fun prepaidCommitManualLedgerEntry(): Optional<PrepaidCommitManualLedgerEntry> =
                Optional.ofNullable(prepaidCommitManualLedgerEntry)

            fun postpaidCommitManualLedgerEntry(): Optional<PostpaidCommitManualLedgerEntry> =
                Optional.ofNullable(postpaidCommitManualLedgerEntry)

            fun postpaidCommitExpirationLedgerEntry():
                Optional<PostpaidCommitExpirationLedgerEntry> =
                Optional.ofNullable(postpaidCommitExpirationLedgerEntry)

            fun isPrepaidCommitSegmentStartLedgerEntry(): Boolean =
                prepaidCommitSegmentStartLedgerEntry != null

            fun isPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(): Boolean =
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null

            fun isPrepaidCommitRolloverLedgerEntry(): Boolean =
                prepaidCommitRolloverLedgerEntry != null

            fun isPrepaidCommitExpirationLedgerEntry(): Boolean =
                prepaidCommitExpirationLedgerEntry != null

            fun isPrepaidCommitCanceledLedgerEntry(): Boolean =
                prepaidCommitCanceledLedgerEntry != null

            fun isPrepaidCommitCreditedLedgerEntry(): Boolean =
                prepaidCommitCreditedLedgerEntry != null

            fun isPrepaidCommitSeatBasedAdjustmentLedgerEntry(): Boolean =
                prepaidCommitSeatBasedAdjustmentLedgerEntry != null

            fun isPostpaidCommitInitialBalanceLedgerEntry(): Boolean =
                postpaidCommitInitialBalanceLedgerEntry != null

            fun isPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(): Boolean =
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null

            fun isPostpaidCommitRolloverLedgerEntry(): Boolean =
                postpaidCommitRolloverLedgerEntry != null

            fun isPostpaidCommitTrueupLedgerEntry(): Boolean =
                postpaidCommitTrueupLedgerEntry != null

            fun isPrepaidCommitManualLedgerEntry(): Boolean = prepaidCommitManualLedgerEntry != null

            fun isPostpaidCommitManualLedgerEntry(): Boolean =
                postpaidCommitManualLedgerEntry != null

            fun isPostpaidCommitExpirationLedgerEntry(): Boolean =
                postpaidCommitExpirationLedgerEntry != null

            fun asPrepaidCommitSegmentStartLedgerEntry(): PrepaidCommitSegmentStartLedgerEntry =
                prepaidCommitSegmentStartLedgerEntry.getOrThrow(
                    "prepaidCommitSegmentStartLedgerEntry"
                )

            fun asPrepaidCommitAutomatedInvoiceDeductionLedgerEntry():
                PrepaidCommitAutomatedInvoiceDeductionLedgerEntry =
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry.getOrThrow(
                    "prepaidCommitAutomatedInvoiceDeductionLedgerEntry"
                )

            fun asPrepaidCommitRolloverLedgerEntry(): PrepaidCommitRolloverLedgerEntry =
                prepaidCommitRolloverLedgerEntry.getOrThrow("prepaidCommitRolloverLedgerEntry")

            fun asPrepaidCommitExpirationLedgerEntry(): PrepaidCommitExpirationLedgerEntry =
                prepaidCommitExpirationLedgerEntry.getOrThrow("prepaidCommitExpirationLedgerEntry")

            fun asPrepaidCommitCanceledLedgerEntry(): PrepaidCommitCanceledLedgerEntry =
                prepaidCommitCanceledLedgerEntry.getOrThrow("prepaidCommitCanceledLedgerEntry")

            fun asPrepaidCommitCreditedLedgerEntry(): PrepaidCommitCreditedLedgerEntry =
                prepaidCommitCreditedLedgerEntry.getOrThrow("prepaidCommitCreditedLedgerEntry")

            fun asPrepaidCommitSeatBasedAdjustmentLedgerEntry():
                PrepaidCommitSeatBasedAdjustmentLedgerEntry =
                prepaidCommitSeatBasedAdjustmentLedgerEntry.getOrThrow(
                    "prepaidCommitSeatBasedAdjustmentLedgerEntry"
                )

            fun asPostpaidCommitInitialBalanceLedgerEntry():
                PostpaidCommitInitialBalanceLedgerEntry =
                postpaidCommitInitialBalanceLedgerEntry.getOrThrow(
                    "postpaidCommitInitialBalanceLedgerEntry"
                )

            fun asPostpaidCommitAutomatedInvoiceDeductionLedgerEntry():
                PostpaidCommitAutomatedInvoiceDeductionLedgerEntry =
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry.getOrThrow(
                    "postpaidCommitAutomatedInvoiceDeductionLedgerEntry"
                )

            fun asPostpaidCommitRolloverLedgerEntry(): PostpaidCommitRolloverLedgerEntry =
                postpaidCommitRolloverLedgerEntry.getOrThrow("postpaidCommitRolloverLedgerEntry")

            fun asPostpaidCommitTrueupLedgerEntry(): PostpaidCommitTrueupLedgerEntry =
                postpaidCommitTrueupLedgerEntry.getOrThrow("postpaidCommitTrueupLedgerEntry")

            fun asPrepaidCommitManualLedgerEntry(): PrepaidCommitManualLedgerEntry =
                prepaidCommitManualLedgerEntry.getOrThrow("prepaidCommitManualLedgerEntry")

            fun asPostpaidCommitManualLedgerEntry(): PostpaidCommitManualLedgerEntry =
                postpaidCommitManualLedgerEntry.getOrThrow("postpaidCommitManualLedgerEntry")

            fun asPostpaidCommitExpirationLedgerEntry(): PostpaidCommitExpirationLedgerEntry =
                postpaidCommitExpirationLedgerEntry.getOrThrow(
                    "postpaidCommitExpirationLedgerEntry"
                )

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    prepaidCommitSegmentStartLedgerEntry != null ->
                        visitor.visitPrepaidCommitSegmentStartLedgerEntry(
                            prepaidCommitSegmentStartLedgerEntry
                        )
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                        visitor.visitPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                            prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                        )
                    prepaidCommitRolloverLedgerEntry != null ->
                        visitor.visitPrepaidCommitRolloverLedgerEntry(
                            prepaidCommitRolloverLedgerEntry
                        )
                    prepaidCommitExpirationLedgerEntry != null ->
                        visitor.visitPrepaidCommitExpirationLedgerEntry(
                            prepaidCommitExpirationLedgerEntry
                        )
                    prepaidCommitCanceledLedgerEntry != null ->
                        visitor.visitPrepaidCommitCanceledLedgerEntry(
                            prepaidCommitCanceledLedgerEntry
                        )
                    prepaidCommitCreditedLedgerEntry != null ->
                        visitor.visitPrepaidCommitCreditedLedgerEntry(
                            prepaidCommitCreditedLedgerEntry
                        )
                    prepaidCommitSeatBasedAdjustmentLedgerEntry != null ->
                        visitor.visitPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                            prepaidCommitSeatBasedAdjustmentLedgerEntry
                        )
                    postpaidCommitInitialBalanceLedgerEntry != null ->
                        visitor.visitPostpaidCommitInitialBalanceLedgerEntry(
                            postpaidCommitInitialBalanceLedgerEntry
                        )
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                        visitor.visitPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                            postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                        )
                    postpaidCommitRolloverLedgerEntry != null ->
                        visitor.visitPostpaidCommitRolloverLedgerEntry(
                            postpaidCommitRolloverLedgerEntry
                        )
                    postpaidCommitTrueupLedgerEntry != null ->
                        visitor.visitPostpaidCommitTrueupLedgerEntry(
                            postpaidCommitTrueupLedgerEntry
                        )
                    prepaidCommitManualLedgerEntry != null ->
                        visitor.visitPrepaidCommitManualLedgerEntry(prepaidCommitManualLedgerEntry)
                    postpaidCommitManualLedgerEntry != null ->
                        visitor.visitPostpaidCommitManualLedgerEntry(
                            postpaidCommitManualLedgerEntry
                        )
                    postpaidCommitExpirationLedgerEntry != null ->
                        visitor.visitPostpaidCommitExpirationLedgerEntry(
                            postpaidCommitExpirationLedgerEntry
                        )
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Ledger = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitPrepaidCommitSegmentStartLedgerEntry(
                            prepaidCommitSegmentStartLedgerEntry:
                                PrepaidCommitSegmentStartLedgerEntry
                        ) {
                            prepaidCommitSegmentStartLedgerEntry.validate()
                        }

                        override fun visitPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                            prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                                PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                        ) {
                            prepaidCommitAutomatedInvoiceDeductionLedgerEntry.validate()
                        }

                        override fun visitPrepaidCommitRolloverLedgerEntry(
                            prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                        ) {
                            prepaidCommitRolloverLedgerEntry.validate()
                        }

                        override fun visitPrepaidCommitExpirationLedgerEntry(
                            prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                        ) {
                            prepaidCommitExpirationLedgerEntry.validate()
                        }

                        override fun visitPrepaidCommitCanceledLedgerEntry(
                            prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                        ) {
                            prepaidCommitCanceledLedgerEntry.validate()
                        }

                        override fun visitPrepaidCommitCreditedLedgerEntry(
                            prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                        ) {
                            prepaidCommitCreditedLedgerEntry.validate()
                        }

                        override fun visitPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                            prepaidCommitSeatBasedAdjustmentLedgerEntry:
                                PrepaidCommitSeatBasedAdjustmentLedgerEntry
                        ) {
                            prepaidCommitSeatBasedAdjustmentLedgerEntry.validate()
                        }

                        override fun visitPostpaidCommitInitialBalanceLedgerEntry(
                            postpaidCommitInitialBalanceLedgerEntry:
                                PostpaidCommitInitialBalanceLedgerEntry
                        ) {
                            postpaidCommitInitialBalanceLedgerEntry.validate()
                        }

                        override fun visitPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                            postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                                PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                        ) {
                            postpaidCommitAutomatedInvoiceDeductionLedgerEntry.validate()
                        }

                        override fun visitPostpaidCommitRolloverLedgerEntry(
                            postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                        ) {
                            postpaidCommitRolloverLedgerEntry.validate()
                        }

                        override fun visitPostpaidCommitTrueupLedgerEntry(
                            postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                        ) {
                            postpaidCommitTrueupLedgerEntry.validate()
                        }

                        override fun visitPrepaidCommitManualLedgerEntry(
                            prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
                        ) {
                            prepaidCommitManualLedgerEntry.validate()
                        }

                        override fun visitPostpaidCommitManualLedgerEntry(
                            postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                        ) {
                            postpaidCommitManualLedgerEntry.validate()
                        }

                        override fun visitPostpaidCommitExpirationLedgerEntry(
                            postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                        ) {
                            postpaidCommitExpirationLedgerEntry.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Ledger && prepaidCommitSegmentStartLedgerEntry == other.prepaidCommitSegmentStartLedgerEntry && prepaidCommitAutomatedInvoiceDeductionLedgerEntry == other.prepaidCommitAutomatedInvoiceDeductionLedgerEntry && prepaidCommitRolloverLedgerEntry == other.prepaidCommitRolloverLedgerEntry && prepaidCommitExpirationLedgerEntry == other.prepaidCommitExpirationLedgerEntry && prepaidCommitCanceledLedgerEntry == other.prepaidCommitCanceledLedgerEntry && prepaidCommitCreditedLedgerEntry == other.prepaidCommitCreditedLedgerEntry && prepaidCommitSeatBasedAdjustmentLedgerEntry == other.prepaidCommitSeatBasedAdjustmentLedgerEntry && postpaidCommitInitialBalanceLedgerEntry == other.postpaidCommitInitialBalanceLedgerEntry && postpaidCommitAutomatedInvoiceDeductionLedgerEntry == other.postpaidCommitAutomatedInvoiceDeductionLedgerEntry && postpaidCommitRolloverLedgerEntry == other.postpaidCommitRolloverLedgerEntry && postpaidCommitTrueupLedgerEntry == other.postpaidCommitTrueupLedgerEntry && prepaidCommitManualLedgerEntry == other.prepaidCommitManualLedgerEntry && postpaidCommitManualLedgerEntry == other.postpaidCommitManualLedgerEntry && postpaidCommitExpirationLedgerEntry == other.postpaidCommitExpirationLedgerEntry /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(prepaidCommitSegmentStartLedgerEntry, prepaidCommitAutomatedInvoiceDeductionLedgerEntry, prepaidCommitRolloverLedgerEntry, prepaidCommitExpirationLedgerEntry, prepaidCommitCanceledLedgerEntry, prepaidCommitCreditedLedgerEntry, prepaidCommitSeatBasedAdjustmentLedgerEntry, postpaidCommitInitialBalanceLedgerEntry, postpaidCommitAutomatedInvoiceDeductionLedgerEntry, postpaidCommitRolloverLedgerEntry, postpaidCommitTrueupLedgerEntry, prepaidCommitManualLedgerEntry, postpaidCommitManualLedgerEntry, postpaidCommitExpirationLedgerEntry) /* spotless:on */

            override fun toString(): String =
                when {
                    prepaidCommitSegmentStartLedgerEntry != null ->
                        "Ledger{prepaidCommitSegmentStartLedgerEntry=$prepaidCommitSegmentStartLedgerEntry}"
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                        "Ledger{prepaidCommitAutomatedInvoiceDeductionLedgerEntry=$prepaidCommitAutomatedInvoiceDeductionLedgerEntry}"
                    prepaidCommitRolloverLedgerEntry != null ->
                        "Ledger{prepaidCommitRolloverLedgerEntry=$prepaidCommitRolloverLedgerEntry}"
                    prepaidCommitExpirationLedgerEntry != null ->
                        "Ledger{prepaidCommitExpirationLedgerEntry=$prepaidCommitExpirationLedgerEntry}"
                    prepaidCommitCanceledLedgerEntry != null ->
                        "Ledger{prepaidCommitCanceledLedgerEntry=$prepaidCommitCanceledLedgerEntry}"
                    prepaidCommitCreditedLedgerEntry != null ->
                        "Ledger{prepaidCommitCreditedLedgerEntry=$prepaidCommitCreditedLedgerEntry}"
                    prepaidCommitSeatBasedAdjustmentLedgerEntry != null ->
                        "Ledger{prepaidCommitSeatBasedAdjustmentLedgerEntry=$prepaidCommitSeatBasedAdjustmentLedgerEntry}"
                    postpaidCommitInitialBalanceLedgerEntry != null ->
                        "Ledger{postpaidCommitInitialBalanceLedgerEntry=$postpaidCommitInitialBalanceLedgerEntry}"
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                        "Ledger{postpaidCommitAutomatedInvoiceDeductionLedgerEntry=$postpaidCommitAutomatedInvoiceDeductionLedgerEntry}"
                    postpaidCommitRolloverLedgerEntry != null ->
                        "Ledger{postpaidCommitRolloverLedgerEntry=$postpaidCommitRolloverLedgerEntry}"
                    postpaidCommitTrueupLedgerEntry != null ->
                        "Ledger{postpaidCommitTrueupLedgerEntry=$postpaidCommitTrueupLedgerEntry}"
                    prepaidCommitManualLedgerEntry != null ->
                        "Ledger{prepaidCommitManualLedgerEntry=$prepaidCommitManualLedgerEntry}"
                    postpaidCommitManualLedgerEntry != null ->
                        "Ledger{postpaidCommitManualLedgerEntry=$postpaidCommitManualLedgerEntry}"
                    postpaidCommitExpirationLedgerEntry != null ->
                        "Ledger{postpaidCommitExpirationLedgerEntry=$postpaidCommitExpirationLedgerEntry}"
                    _json != null -> "Ledger{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Ledger")
                }

            companion object {

                @JvmStatic
                fun ofPrepaidCommitSegmentStartLedgerEntry(
                    prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
                ) =
                    Ledger(
                        prepaidCommitSegmentStartLedgerEntry = prepaidCommitSegmentStartLedgerEntry
                    )

                @JvmStatic
                fun ofPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                ) =
                    Ledger(
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry =
                            prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                    )

                @JvmStatic
                fun ofPrepaidCommitRolloverLedgerEntry(
                    prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                ) = Ledger(prepaidCommitRolloverLedgerEntry = prepaidCommitRolloverLedgerEntry)

                @JvmStatic
                fun ofPrepaidCommitExpirationLedgerEntry(
                    prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                ) = Ledger(prepaidCommitExpirationLedgerEntry = prepaidCommitExpirationLedgerEntry)

                @JvmStatic
                fun ofPrepaidCommitCanceledLedgerEntry(
                    prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                ) = Ledger(prepaidCommitCanceledLedgerEntry = prepaidCommitCanceledLedgerEntry)

                @JvmStatic
                fun ofPrepaidCommitCreditedLedgerEntry(
                    prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                ) = Ledger(prepaidCommitCreditedLedgerEntry = prepaidCommitCreditedLedgerEntry)

                @JvmStatic
                fun ofPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                    prepaidCommitSeatBasedAdjustmentLedgerEntry:
                        PrepaidCommitSeatBasedAdjustmentLedgerEntry
                ) =
                    Ledger(
                        prepaidCommitSeatBasedAdjustmentLedgerEntry =
                            prepaidCommitSeatBasedAdjustmentLedgerEntry
                    )

                @JvmStatic
                fun ofPostpaidCommitInitialBalanceLedgerEntry(
                    postpaidCommitInitialBalanceLedgerEntry: PostpaidCommitInitialBalanceLedgerEntry
                ) =
                    Ledger(
                        postpaidCommitInitialBalanceLedgerEntry =
                            postpaidCommitInitialBalanceLedgerEntry
                    )

                @JvmStatic
                fun ofPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                ) =
                    Ledger(
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry =
                            postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                    )

                @JvmStatic
                fun ofPostpaidCommitRolloverLedgerEntry(
                    postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                ) = Ledger(postpaidCommitRolloverLedgerEntry = postpaidCommitRolloverLedgerEntry)

                @JvmStatic
                fun ofPostpaidCommitTrueupLedgerEntry(
                    postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                ) = Ledger(postpaidCommitTrueupLedgerEntry = postpaidCommitTrueupLedgerEntry)

                @JvmStatic
                fun ofPrepaidCommitManualLedgerEntry(
                    prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
                ) = Ledger(prepaidCommitManualLedgerEntry = prepaidCommitManualLedgerEntry)

                @JvmStatic
                fun ofPostpaidCommitManualLedgerEntry(
                    postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                ) = Ledger(postpaidCommitManualLedgerEntry = postpaidCommitManualLedgerEntry)

                @JvmStatic
                fun ofPostpaidCommitExpirationLedgerEntry(
                    postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                ) =
                    Ledger(
                        postpaidCommitExpirationLedgerEntry = postpaidCommitExpirationLedgerEntry
                    )
            }

            /**
             * An interface that defines how to map each variant of [Ledger] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitPrepaidCommitSegmentStartLedgerEntry(
                    prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
                ): T

                fun visitPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                ): T

                fun visitPrepaidCommitRolloverLedgerEntry(
                    prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                ): T

                fun visitPrepaidCommitExpirationLedgerEntry(
                    prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                ): T

                fun visitPrepaidCommitCanceledLedgerEntry(
                    prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                ): T

                fun visitPrepaidCommitCreditedLedgerEntry(
                    prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                ): T

                fun visitPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                    prepaidCommitSeatBasedAdjustmentLedgerEntry:
                        PrepaidCommitSeatBasedAdjustmentLedgerEntry
                ): T

                fun visitPostpaidCommitInitialBalanceLedgerEntry(
                    postpaidCommitInitialBalanceLedgerEntry: PostpaidCommitInitialBalanceLedgerEntry
                ): T

                fun visitPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                ): T

                fun visitPostpaidCommitRolloverLedgerEntry(
                    postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                ): T

                fun visitPostpaidCommitTrueupLedgerEntry(
                    postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                ): T

                fun visitPrepaidCommitManualLedgerEntry(
                    prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
                ): T

                fun visitPostpaidCommitManualLedgerEntry(
                    postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                ): T

                fun visitPostpaidCommitExpirationLedgerEntry(
                    postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                ): T

                /**
                 * Maps an unknown variant of [Ledger] to a value of type [T].
                 *
                 * An instance of [Ledger] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws MetronomeInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw MetronomeInvalidDataException("Unknown Ledger: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Ledger>(Ledger::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Ledger {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<PrepaidCommitSegmentStartLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(prepaidCommitSegmentStartLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(
                            node,
                            jacksonTypeRef<PrepaidCommitAutomatedInvoiceDeductionLedgerEntry>(),
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(
                                prepaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                                _json = json,
                            )
                        }
                    tryDeserialize(node, jacksonTypeRef<PrepaidCommitRolloverLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(prepaidCommitRolloverLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PrepaidCommitExpirationLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(prepaidCommitExpirationLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PrepaidCommitCanceledLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(prepaidCommitCanceledLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PrepaidCommitCreditedLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(prepaidCommitCreditedLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(
                            node,
                            jacksonTypeRef<PrepaidCommitSeatBasedAdjustmentLedgerEntry>(),
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(
                                prepaidCommitSeatBasedAdjustmentLedgerEntry = it,
                                _json = json,
                            )
                        }
                    tryDeserialize(
                            node,
                            jacksonTypeRef<PostpaidCommitInitialBalanceLedgerEntry>(),
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(
                                postpaidCommitInitialBalanceLedgerEntry = it,
                                _json = json,
                            )
                        }
                    tryDeserialize(
                            node,
                            jacksonTypeRef<PostpaidCommitAutomatedInvoiceDeductionLedgerEntry>(),
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(
                                postpaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                                _json = json,
                            )
                        }
                    tryDeserialize(node, jacksonTypeRef<PostpaidCommitRolloverLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(postpaidCommitRolloverLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PostpaidCommitTrueupLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(postpaidCommitTrueupLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PrepaidCommitManualLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(prepaidCommitManualLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PostpaidCommitManualLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(postpaidCommitManualLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PostpaidCommitExpirationLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(postpaidCommitExpirationLedgerEntry = it, _json = json)
                        }

                    return Ledger(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Ledger>(Ledger::class) {

                override fun serialize(
                    value: Ledger,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.prepaidCommitSegmentStartLedgerEntry != null ->
                            generator.writeObject(value.prepaidCommitSegmentStartLedgerEntry)
                        value.prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                            generator.writeObject(
                                value.prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                            )
                        value.prepaidCommitRolloverLedgerEntry != null ->
                            generator.writeObject(value.prepaidCommitRolloverLedgerEntry)
                        value.prepaidCommitExpirationLedgerEntry != null ->
                            generator.writeObject(value.prepaidCommitExpirationLedgerEntry)
                        value.prepaidCommitCanceledLedgerEntry != null ->
                            generator.writeObject(value.prepaidCommitCanceledLedgerEntry)
                        value.prepaidCommitCreditedLedgerEntry != null ->
                            generator.writeObject(value.prepaidCommitCreditedLedgerEntry)
                        value.prepaidCommitSeatBasedAdjustmentLedgerEntry != null ->
                            generator.writeObject(value.prepaidCommitSeatBasedAdjustmentLedgerEntry)
                        value.postpaidCommitInitialBalanceLedgerEntry != null ->
                            generator.writeObject(value.postpaidCommitInitialBalanceLedgerEntry)
                        value.postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                            generator.writeObject(
                                value.postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                            )
                        value.postpaidCommitRolloverLedgerEntry != null ->
                            generator.writeObject(value.postpaidCommitRolloverLedgerEntry)
                        value.postpaidCommitTrueupLedgerEntry != null ->
                            generator.writeObject(value.postpaidCommitTrueupLedgerEntry)
                        value.prepaidCommitManualLedgerEntry != null ->
                            generator.writeObject(value.prepaidCommitManualLedgerEntry)
                        value.postpaidCommitManualLedgerEntry != null ->
                            generator.writeObject(value.postpaidCommitManualLedgerEntry)
                        value.postpaidCommitExpirationLedgerEntry != null ->
                            generator.writeObject(value.postpaidCommitExpirationLedgerEntry)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Ledger")
                    }
                }
            }

            @NoAutoDetect
            class PrepaidCommitSegmentStartLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitSegmentStartLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitSegmentStartLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
                    ) = apply {
                        amount = prepaidCommitSegmentStartLedgerEntry.amount
                        segmentId = prepaidCommitSegmentStartLedgerEntry.segmentId
                        timestamp = prepaidCommitSegmentStartLedgerEntry.timestamp
                        type = prepaidCommitSegmentStartLedgerEntry.type
                        additionalProperties =
                            prepaidCommitSegmentStartLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PrepaidCommitSegmentStartLedgerEntry =
                        PrepaidCommitSegmentStartLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField
                        val PREPAID_COMMIT_SEGMENT_START = of("PREPAID_COMMIT_SEGMENT_START")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_SEGMENT_START
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
                        PREPAID_COMMIT_SEGMENT_START,
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
                            PREPAID_COMMIT_SEGMENT_START -> Value.PREPAID_COMMIT_SEGMENT_START
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
                            PREPAID_COMMIT_SEGMENT_START -> Known.PREPAID_COMMIT_SEGMENT_START
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

                    return /* spotless:off */ other is PrepaidCommitSegmentStartLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitSegmentStartLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitAutomatedInvoiceDeductionLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                            PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                    ) = apply {
                        amount = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.amount
                        invoiceId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.invoiceId
                        segmentId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.segmentId
                        timestamp = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.timestamp
                        type = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.type
                        contractId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.contractId
                        additionalProperties =
                            prepaidCommitAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                                .toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry =
                        PrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField
                        val PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION =
                            of("PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
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
                            PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Value.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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
                            PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Known.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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

                    return /* spotless:off */ other is PrepaidCommitAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PrepaidCommitRolloverLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("new_contract_id")
                @ExcludeMissing
                private val newContractId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun newContractId(): String = newContractId.getRequired("new_contract_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("new_contract_id")
                @ExcludeMissing
                fun _newContractId(): JsonField<String> = newContractId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitRolloverLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    newContractId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitRolloverLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var newContractId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                    ) = apply {
                        amount = prepaidCommitRolloverLedgerEntry.amount
                        newContractId = prepaidCommitRolloverLedgerEntry.newContractId
                        segmentId = prepaidCommitRolloverLedgerEntry.segmentId
                        timestamp = prepaidCommitRolloverLedgerEntry.timestamp
                        type = prepaidCommitRolloverLedgerEntry.type
                        additionalProperties =
                            prepaidCommitRolloverLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun newContractId(newContractId: String) =
                        newContractId(JsonField.of(newContractId))

                    fun newContractId(newContractId: JsonField<String>) = apply {
                        this.newContractId = newContractId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PrepaidCommitRolloverLedgerEntry =
                        PrepaidCommitRolloverLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("newContractId", newContractId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val PREPAID_COMMIT_ROLLOVER = of("PREPAID_COMMIT_ROLLOVER")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_ROLLOVER
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
                        PREPAID_COMMIT_ROLLOVER,
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
                            PREPAID_COMMIT_ROLLOVER -> Value.PREPAID_COMMIT_ROLLOVER
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
                            PREPAID_COMMIT_ROLLOVER -> Known.PREPAID_COMMIT_ROLLOVER
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

                    return /* spotless:off */ other is PrepaidCommitRolloverLedgerEntry && amount == other.amount && newContractId == other.newContractId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, newContractId, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitRolloverLedgerEntry{amount=$amount, newContractId=$newContractId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PrepaidCommitExpirationLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitExpirationLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitExpirationLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                    ) = apply {
                        amount = prepaidCommitExpirationLedgerEntry.amount
                        segmentId = prepaidCommitExpirationLedgerEntry.segmentId
                        timestamp = prepaidCommitExpirationLedgerEntry.timestamp
                        type = prepaidCommitExpirationLedgerEntry.type
                        additionalProperties =
                            prepaidCommitExpirationLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PrepaidCommitExpirationLedgerEntry =
                        PrepaidCommitExpirationLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val PREPAID_COMMIT_EXPIRATION = of("PREPAID_COMMIT_EXPIRATION")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_EXPIRATION
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
                        PREPAID_COMMIT_EXPIRATION,
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
                            PREPAID_COMMIT_EXPIRATION -> Value.PREPAID_COMMIT_EXPIRATION
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
                            PREPAID_COMMIT_EXPIRATION -> Known.PREPAID_COMMIT_EXPIRATION
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

                    return /* spotless:off */ other is PrepaidCommitExpirationLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitExpirationLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PrepaidCommitCanceledLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitCanceledLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitCanceledLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                    ) = apply {
                        amount = prepaidCommitCanceledLedgerEntry.amount
                        invoiceId = prepaidCommitCanceledLedgerEntry.invoiceId
                        segmentId = prepaidCommitCanceledLedgerEntry.segmentId
                        timestamp = prepaidCommitCanceledLedgerEntry.timestamp
                        type = prepaidCommitCanceledLedgerEntry.type
                        contractId = prepaidCommitCanceledLedgerEntry.contractId
                        additionalProperties =
                            prepaidCommitCanceledLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): PrepaidCommitCanceledLedgerEntry =
                        PrepaidCommitCanceledLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val PREPAID_COMMIT_CANCELED = of("PREPAID_COMMIT_CANCELED")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_CANCELED
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
                        PREPAID_COMMIT_CANCELED,
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
                            PREPAID_COMMIT_CANCELED -> Value.PREPAID_COMMIT_CANCELED
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
                            PREPAID_COMMIT_CANCELED -> Known.PREPAID_COMMIT_CANCELED
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

                    return /* spotless:off */ other is PrepaidCommitCanceledLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitCanceledLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PrepaidCommitCreditedLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitCreditedLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitCreditedLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                    ) = apply {
                        amount = prepaidCommitCreditedLedgerEntry.amount
                        invoiceId = prepaidCommitCreditedLedgerEntry.invoiceId
                        segmentId = prepaidCommitCreditedLedgerEntry.segmentId
                        timestamp = prepaidCommitCreditedLedgerEntry.timestamp
                        type = prepaidCommitCreditedLedgerEntry.type
                        contractId = prepaidCommitCreditedLedgerEntry.contractId
                        additionalProperties =
                            prepaidCommitCreditedLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): PrepaidCommitCreditedLedgerEntry =
                        PrepaidCommitCreditedLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val PREPAID_COMMIT_CREDITED = of("PREPAID_COMMIT_CREDITED")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_CREDITED
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
                        PREPAID_COMMIT_CREDITED,
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
                            PREPAID_COMMIT_CREDITED -> Value.PREPAID_COMMIT_CREDITED
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
                            PREPAID_COMMIT_CREDITED -> Known.PREPAID_COMMIT_CREDITED
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

                    return /* spotless:off */ other is PrepaidCommitCreditedLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitCreditedLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PrepaidCommitSeatBasedAdjustmentLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitSeatBasedAdjustmentLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitSeatBasedAdjustmentLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitSeatBasedAdjustmentLedgerEntry:
                            PrepaidCommitSeatBasedAdjustmentLedgerEntry
                    ) = apply {
                        amount = prepaidCommitSeatBasedAdjustmentLedgerEntry.amount
                        segmentId = prepaidCommitSeatBasedAdjustmentLedgerEntry.segmentId
                        timestamp = prepaidCommitSeatBasedAdjustmentLedgerEntry.timestamp
                        type = prepaidCommitSeatBasedAdjustmentLedgerEntry.type
                        additionalProperties =
                            prepaidCommitSeatBasedAdjustmentLedgerEntry.additionalProperties
                                .toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PrepaidCommitSeatBasedAdjustmentLedgerEntry =
                        PrepaidCommitSeatBasedAdjustmentLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField
                        val PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT =
                            of("PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
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
                        PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT,
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
                            PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT ->
                                Value.PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
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
                            PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT ->
                                Known.PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
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

                    return /* spotless:off */ other is PrepaidCommitSeatBasedAdjustmentLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitSeatBasedAdjustmentLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PostpaidCommitInitialBalanceLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PostpaidCommitInitialBalanceLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PostpaidCommitInitialBalanceLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        postpaidCommitInitialBalanceLedgerEntry:
                            PostpaidCommitInitialBalanceLedgerEntry
                    ) = apply {
                        amount = postpaidCommitInitialBalanceLedgerEntry.amount
                        timestamp = postpaidCommitInitialBalanceLedgerEntry.timestamp
                        type = postpaidCommitInitialBalanceLedgerEntry.type
                        additionalProperties =
                            postpaidCommitInitialBalanceLedgerEntry.additionalProperties
                                .toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PostpaidCommitInitialBalanceLedgerEntry =
                        PostpaidCommitInitialBalanceLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField
                        val POSTPAID_COMMIT_INITIAL_BALANCE = of("POSTPAID_COMMIT_INITIAL_BALANCE")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        POSTPAID_COMMIT_INITIAL_BALANCE
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
                        POSTPAID_COMMIT_INITIAL_BALANCE,
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
                            POSTPAID_COMMIT_INITIAL_BALANCE -> Value.POSTPAID_COMMIT_INITIAL_BALANCE
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
                            POSTPAID_COMMIT_INITIAL_BALANCE -> Known.POSTPAID_COMMIT_INITIAL_BALANCE
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

                    return /* spotless:off */ other is PostpaidCommitInitialBalanceLedgerEntry && amount == other.amount && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PostpaidCommitInitialBalanceLedgerEntry{amount=$amount, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PostpaidCommitAutomatedInvoiceDeductionLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                            PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                    ) = apply {
                        amount = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.amount
                        invoiceId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.invoiceId
                        segmentId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.segmentId
                        timestamp = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.timestamp
                        type = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.type
                        contractId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.contractId
                        additionalProperties =
                            postpaidCommitAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                                .toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry =
                        PostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField
                        val POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION =
                            of("POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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
                        POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
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
                            POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Value.POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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
                            POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Known.POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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

                    return /* spotless:off */ other is PostpaidCommitAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PostpaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PostpaidCommitRolloverLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("new_contract_id")
                @ExcludeMissing
                private val newContractId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun newContractId(): String = newContractId.getRequired("new_contract_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("new_contract_id")
                @ExcludeMissing
                fun _newContractId(): JsonField<String> = newContractId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PostpaidCommitRolloverLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    newContractId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PostpaidCommitRolloverLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var newContractId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                    ) = apply {
                        amount = postpaidCommitRolloverLedgerEntry.amount
                        newContractId = postpaidCommitRolloverLedgerEntry.newContractId
                        segmentId = postpaidCommitRolloverLedgerEntry.segmentId
                        timestamp = postpaidCommitRolloverLedgerEntry.timestamp
                        type = postpaidCommitRolloverLedgerEntry.type
                        additionalProperties =
                            postpaidCommitRolloverLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun newContractId(newContractId: String) =
                        newContractId(JsonField.of(newContractId))

                    fun newContractId(newContractId: JsonField<String>) = apply {
                        this.newContractId = newContractId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PostpaidCommitRolloverLedgerEntry =
                        PostpaidCommitRolloverLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("newContractId", newContractId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val POSTPAID_COMMIT_ROLLOVER = of("POSTPAID_COMMIT_ROLLOVER")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        POSTPAID_COMMIT_ROLLOVER
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
                        POSTPAID_COMMIT_ROLLOVER,
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
                            POSTPAID_COMMIT_ROLLOVER -> Value.POSTPAID_COMMIT_ROLLOVER
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
                            POSTPAID_COMMIT_ROLLOVER -> Known.POSTPAID_COMMIT_ROLLOVER
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

                    return /* spotless:off */ other is PostpaidCommitRolloverLedgerEntry && amount == other.amount && newContractId == other.newContractId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, newContractId, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PostpaidCommitRolloverLedgerEntry{amount=$amount, newContractId=$newContractId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PostpaidCommitTrueupLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PostpaidCommitTrueupLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PostpaidCommitTrueupLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                    ) = apply {
                        amount = postpaidCommitTrueupLedgerEntry.amount
                        invoiceId = postpaidCommitTrueupLedgerEntry.invoiceId
                        timestamp = postpaidCommitTrueupLedgerEntry.timestamp
                        type = postpaidCommitTrueupLedgerEntry.type
                        contractId = postpaidCommitTrueupLedgerEntry.contractId
                        additionalProperties =
                            postpaidCommitTrueupLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): PostpaidCommitTrueupLedgerEntry =
                        PostpaidCommitTrueupLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val POSTPAID_COMMIT_TRUEUP = of("POSTPAID_COMMIT_TRUEUP")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        POSTPAID_COMMIT_TRUEUP
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
                        POSTPAID_COMMIT_TRUEUP,
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
                            POSTPAID_COMMIT_TRUEUP -> Value.POSTPAID_COMMIT_TRUEUP
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
                            POSTPAID_COMMIT_TRUEUP -> Known.POSTPAID_COMMIT_TRUEUP
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

                    return /* spotless:off */ other is PostpaidCommitTrueupLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PostpaidCommitTrueupLedgerEntry{amount=$amount, invoiceId=$invoiceId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PrepaidCommitManualLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun reason(): String = reason.getRequired("reason")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PrepaidCommitManualLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    reason()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrepaidCommitManualLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var reason: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
                    ) = apply {
                        amount = prepaidCommitManualLedgerEntry.amount
                        reason = prepaidCommitManualLedgerEntry.reason
                        timestamp = prepaidCommitManualLedgerEntry.timestamp
                        type = prepaidCommitManualLedgerEntry.type
                        additionalProperties =
                            prepaidCommitManualLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun reason(reason: String) = reason(JsonField.of(reason))

                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PrepaidCommitManualLedgerEntry =
                        PrepaidCommitManualLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("reason", reason),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val PREPAID_COMMIT_MANUAL = of("PREPAID_COMMIT_MANUAL")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PREPAID_COMMIT_MANUAL
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
                        PREPAID_COMMIT_MANUAL,
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
                            PREPAID_COMMIT_MANUAL -> Value.PREPAID_COMMIT_MANUAL
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
                            PREPAID_COMMIT_MANUAL -> Known.PREPAID_COMMIT_MANUAL
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

                    return /* spotless:off */ other is PrepaidCommitManualLedgerEntry && amount == other.amount && reason == other.reason && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, reason, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrepaidCommitManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PostpaidCommitManualLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun reason(): String = reason.getRequired("reason")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PostpaidCommitManualLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    reason()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PostpaidCommitManualLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var reason: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                    ) = apply {
                        amount = postpaidCommitManualLedgerEntry.amount
                        reason = postpaidCommitManualLedgerEntry.reason
                        timestamp = postpaidCommitManualLedgerEntry.timestamp
                        type = postpaidCommitManualLedgerEntry.type
                        additionalProperties =
                            postpaidCommitManualLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun reason(reason: String) = reason(JsonField.of(reason))

                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PostpaidCommitManualLedgerEntry =
                        PostpaidCommitManualLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("reason", reason),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val POSTPAID_COMMIT_MANUAL = of("POSTPAID_COMMIT_MANUAL")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        POSTPAID_COMMIT_MANUAL
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
                        POSTPAID_COMMIT_MANUAL,
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
                            POSTPAID_COMMIT_MANUAL -> Value.POSTPAID_COMMIT_MANUAL
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
                            POSTPAID_COMMIT_MANUAL -> Known.POSTPAID_COMMIT_MANUAL
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

                    return /* spotless:off */ other is PostpaidCommitManualLedgerEntry && amount == other.amount && reason == other.reason && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, reason, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PostpaidCommitManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PostpaidCommitExpirationLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PostpaidCommitExpirationLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PostpaidCommitExpirationLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                    ) = apply {
                        amount = postpaidCommitExpirationLedgerEntry.amount
                        timestamp = postpaidCommitExpirationLedgerEntry.timestamp
                        type = postpaidCommitExpirationLedgerEntry.type
                        additionalProperties =
                            postpaidCommitExpirationLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): PostpaidCommitExpirationLedgerEntry =
                        PostpaidCommitExpirationLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val POSTPAID_COMMIT_EXPIRATION = of("POSTPAID_COMMIT_EXPIRATION")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        POSTPAID_COMMIT_EXPIRATION
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
                        POSTPAID_COMMIT_EXPIRATION,
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
                            POSTPAID_COMMIT_EXPIRATION -> Value.POSTPAID_COMMIT_EXPIRATION
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
                            POSTPAID_COMMIT_EXPIRATION -> Known.POSTPAID_COMMIT_EXPIRATION
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

                    return /* spotless:off */ other is PostpaidCommitExpirationLedgerEntry && amount == other.amount && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PostpaidCommitExpirationLedgerEntry{amount=$amount, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }
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

        @NoAutoDetect
        class RolledOverFrom
        @JsonCreator
        private constructor(
            @JsonProperty("commit_id")
            @ExcludeMissing
            private val commitId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun commitId(): String = commitId.getRequired("commit_id")

            fun contractId(): String = contractId.getRequired("contract_id")

            @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RolledOverFrom = apply {
                if (validated) {
                    return@apply
                }

                commitId()
                contractId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RolledOverFrom]. */
            class Builder internal constructor() {

                private var commitId: JsonField<String>? = null
                private var contractId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rolledOverFrom: RolledOverFrom) = apply {
                    commitId = rolledOverFrom.commitId
                    contractId = rolledOverFrom.contractId
                    additionalProperties = rolledOverFrom.additionalProperties.toMutableMap()
                }

                fun commitId(commitId: String) = commitId(JsonField.of(commitId))

                fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
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

                fun build(): RolledOverFrom =
                    RolledOverFrom(
                        checkRequired("commitId", commitId),
                        checkRequired("contractId", contractId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RolledOverFrom && commitId == other.commitId && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(commitId, contractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RolledOverFrom{commitId=$commitId, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && id == other.id && createdAt == other.createdAt && product == other.product && type == other.type && accessSchedule == other.accessSchedule && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && archivedAt == other.archivedAt && balance == other.balance && contract == other.contract && customFields == other.customFields && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && invoiceContract == other.invoiceContract && invoiceSchedule == other.invoiceSchedule && ledger == other.ledger && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && recurringCommitId == other.recurringCommitId && rolledOverFrom == other.rolledOverFrom && rolloverFraction == other.rolloverFraction && salesforceOpportunityId == other.salesforceOpportunityId && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, product, type, accessSchedule, applicableContractIds, applicableProductIds, applicableProductTags, archivedAt, balance, contract, customFields, description, hierarchyConfiguration, invoiceContract, invoiceSchedule, ledger, name, netsuiteSalesOrderId, priority, rateType, recurringCommitId, rolledOverFrom, rolloverFraction, salesforceOpportunityId, specifiers, subscriptionConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{id=$id, createdAt=$createdAt, product=$product, type=$type, accessSchedule=$accessSchedule, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, archivedAt=$archivedAt, balance=$balance, contract=$contract, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, invoiceContract=$invoiceContract, invoiceSchedule=$invoiceSchedule, ledger=$ledger, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, recurringCommitId=$recurringCommitId, rolledOverFrom=$rolledOverFrom, rolloverFraction=$rolloverFraction, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Override
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("override_tiers")
        @ExcludeMissing
        private val overrideTiers: JsonField<List<OverrideTier>> = JsonMissing.of(),
        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        private val overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product")
        @ExcludeMissing
        private val product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("target")
        @ExcludeMissing
        private val target: JsonField<Target> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun entitled(): Optional<Boolean> = Optional.ofNullable(entitled.getNullable("entitled"))

        fun isCommitSpecific(): Optional<Boolean> =
            Optional.ofNullable(isCommitSpecific.getNullable("is_commit_specific"))

        fun multiplier(): Optional<Double> =
            Optional.ofNullable(multiplier.getNullable("multiplier"))

        fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
            Optional.ofNullable(overrideSpecifiers.getNullable("override_specifiers"))

        fun overrideTiers(): Optional<List<OverrideTier>> =
            Optional.ofNullable(overrideTiers.getNullable("override_tiers"))

        fun overwriteRate(): Optional<OverwriteRate> =
            Optional.ofNullable(overwriteRate.getNullable("overwrite_rate"))

        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun product(): Optional<Product> = Optional.ofNullable(product.getNullable("product"))

        fun target(): Optional<Target> = Optional.ofNullable(target.getNullable("target"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

        @JsonProperty("is_commit_specific")
        @ExcludeMissing
        fun _isCommitSpecific(): JsonField<Boolean> = isCommitSpecific

        @JsonProperty("multiplier")
        @ExcludeMissing
        fun _multiplier(): JsonField<Double> = multiplier

        @JsonProperty("override_specifiers")
        @ExcludeMissing
        fun _overrideSpecifiers(): JsonField<List<OverrideSpecifier>> = overrideSpecifiers

        @JsonProperty("override_tiers")
        @ExcludeMissing
        fun _overrideTiers(): JsonField<List<OverrideTier>> = overrideTiers

        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        fun _overwriteRate(): JsonField<OverwriteRate> = overwriteRate

        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Override = apply {
            if (validated) {
                return@apply
            }

            id()
            startingAt()
            applicableProductTags()
            endingBefore()
            entitled()
            isCommitSpecific()
            multiplier()
            overrideSpecifiers().ifPresent { it.forEach { it.validate() } }
            overrideTiers().ifPresent { it.forEach { it.validate() } }
            overwriteRate().ifPresent { it.validate() }
            priority()
            product().ifPresent { it.validate() }
            target()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Override]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var entitled: JsonField<Boolean> = JsonMissing.of()
            private var isCommitSpecific: JsonField<Boolean> = JsonMissing.of()
            private var multiplier: JsonField<Double> = JsonMissing.of()
            private var overrideSpecifiers: JsonField<MutableList<OverrideSpecifier>>? = null
            private var overrideTiers: JsonField<MutableList<OverrideTier>>? = null
            private var overwriteRate: JsonField<OverwriteRate> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var product: JsonField<Product> = JsonMissing.of()
            private var target: JsonField<Target> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                id = override.id
                startingAt = override.startingAt
                applicableProductTags = override.applicableProductTags.map { it.toMutableList() }
                endingBefore = override.endingBefore
                entitled = override.entitled
                isCommitSpecific = override.isCommitSpecific
                multiplier = override.multiplier
                overrideSpecifiers = override.overrideSpecifiers.map { it.toMutableList() }
                overrideTiers = override.overrideTiers.map { it.toMutableList() }
                overwriteRate = override.overwriteRate
                priority = override.priority
                product = override.product
                target = override.target
                type = override.type
                additionalProperties = override.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

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

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

            fun isCommitSpecific(isCommitSpecific: Boolean) =
                isCommitSpecific(JsonField.of(isCommitSpecific))

            fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
                this.isCommitSpecific = isCommitSpecific
            }

            fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

            fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

            fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
                overrideSpecifiers(JsonField.of(overrideSpecifiers))

            fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
                this.overrideSpecifiers = overrideSpecifiers.map { it.toMutableList() }
            }

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

            fun overrideTiers(overrideTiers: List<OverrideTier>) =
                overrideTiers(JsonField.of(overrideTiers))

            fun overrideTiers(overrideTiers: JsonField<List<OverrideTier>>) = apply {
                this.overrideTiers = overrideTiers.map { it.toMutableList() }
            }

            fun addOverrideTier(overrideTier: OverrideTier) = apply {
                overrideTiers =
                    (overrideTiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(overrideTier)
                    }
            }

            fun overwriteRate(overwriteRate: OverwriteRate) =
                overwriteRate(JsonField.of(overwriteRate))

            fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
                this.overwriteRate = overwriteRate
            }

            fun priority(priority: Double) = priority(JsonField.of(priority))

            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun product(product: Product) = product(JsonField.of(product))

            fun product(product: JsonField<Product>) = apply { this.product = product }

            fun target(target: Target) = target(JsonField.of(target))

            fun target(target: JsonField<Target>) = apply { this.target = target }

            fun type(type: Type) = type(JsonField.of(type))

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
                    checkRequired("id", id),
                    checkRequired("startingAt", startingAt),
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    endingBefore,
                    entitled,
                    isCommitSpecific,
                    multiplier,
                    (overrideSpecifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    (overrideTiers ?: JsonMissing.of()).map { it.toImmutable() },
                    overwriteRate,
                    priority,
                    product,
                    target,
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

            fun commitIds(): Optional<List<String>> =
                Optional.ofNullable(commitIds.getNullable("commit_ids"))

            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                Optional.ofNullable(
                    presentationGroupValues.getNullable("presentation_group_values")
                )

            fun pricingGroupValues(): Optional<PricingGroupValues> =
                Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

            fun productId(): Optional<String> =
                Optional.ofNullable(productId.getNullable("product_id"))

            fun productTags(): Optional<List<String>> =
                Optional.ofNullable(productTags.getNullable("product_tags"))

            fun recurringCommitIds(): Optional<List<String>> =
                Optional.ofNullable(recurringCommitIds.getNullable("recurring_commit_ids"))

            fun recurringCreditIds(): Optional<List<String>> =
                Optional.ofNullable(recurringCreditIds.getNullable("recurring_credit_ids"))

            @JsonProperty("billing_frequency")
            @ExcludeMissing
            fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

            @JsonProperty("commit_ids")
            @ExcludeMissing
            fun _commitIds(): JsonField<List<String>> = commitIds

            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun _presentationGroupValues(): JsonField<PresentationGroupValues> =
                presentationGroupValues

            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            @JsonProperty("product_tags")
            @ExcludeMissing
            fun _productTags(): JsonField<List<String>> = productTags

            @JsonProperty("recurring_commit_ids")
            @ExcludeMissing
            fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

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

                fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

                fun commitIds(commitIds: JsonField<List<String>>) = apply {
                    this.commitIds = commitIds.map { it.toMutableList() }
                }

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

                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    presentationGroupValues(JsonField.of(presentationGroupValues))

                fun presentationGroupValues(
                    presentationGroupValues: JsonField<PresentationGroupValues>
                ) = apply { this.presentationGroupValues = presentationGroupValues }

                fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                    pricingGroupValues(JsonField.of(pricingGroupValues))

                fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                fun productId(productId: String) = productId(JsonField.of(productId))

                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

                fun productTags(productTags: JsonField<List<String>>) = apply {
                    this.productTags = productTags.map { it.toMutableList() }
                }

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

                fun recurringCommitIds(recurringCommitIds: List<String>) =
                    recurringCommitIds(JsonField.of(recurringCommitIds))

                fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                    this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
                }

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

                fun recurringCreditIds(recurringCreditIds: List<String>) =
                    recurringCreditIds(JsonField.of(recurringCreditIds))

                fun recurringCreditIds(recurringCreditIds: JsonField<List<String>>) = apply {
                    this.recurringCreditIds = recurringCreditIds.map { it.toMutableList() }
                }

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

        @NoAutoDetect
        class OverwriteRate
        @JsonCreator
        private constructor(
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("credit_type")
            @ExcludeMissing
            private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
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

            fun creditType(): Optional<CreditTypeData> =
                Optional.ofNullable(creditType.getNullable("credit_type"))

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

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun _creditType(): JsonField<CreditTypeData> = creditType

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
                creditType().ifPresent { it.validate() }
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
                private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
                private var customRate: JsonField<CustomRate> = JsonMissing.of()
                private var isProrated: JsonField<Boolean> = JsonMissing.of()
                private var price: JsonField<Double> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var tiers: JsonField<MutableList<Tier>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overwriteRate: OverwriteRate) = apply {
                    rateType = overwriteRate.rateType
                    creditType = overwriteRate.creditType
                    customRate = overwriteRate.customRate
                    isProrated = overwriteRate.isProrated
                    price = overwriteRate.price
                    quantity = overwriteRate.quantity
                    tiers = overwriteRate.tiers.map { it.toMutableList() }
                    additionalProperties = overwriteRate.additionalProperties.toMutableMap()
                }

                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

                fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                    this.creditType = creditType
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
                        creditType,
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

                return /* spotless:off */ other is OverwriteRate && rateType == other.rateType && creditType == other.creditType && customRate == other.customRate && isProrated == other.isProrated && price == other.price && quantity == other.quantity && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(rateType, creditType, customRate, isProrated, price, quantity, tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverwriteRate{rateType=$rateType, creditType=$creditType, customRate=$customRate, isProrated=$isProrated, price=$price, quantity=$quantity, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Product
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Product = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Product]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(product: Product) = apply {
                    id = product.id
                    name = product.name
                    additionalProperties = product.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Product =
                    Product(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

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

            return /* spotless:off */ other is Override && id == other.id && startingAt == other.startingAt && applicableProductTags == other.applicableProductTags && endingBefore == other.endingBefore && entitled == other.entitled && isCommitSpecific == other.isCommitSpecific && multiplier == other.multiplier && overrideSpecifiers == other.overrideSpecifiers && overrideTiers == other.overrideTiers && overwriteRate == other.overwriteRate && priority == other.priority && product == other.product && target == other.target && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, startingAt, applicableProductTags, endingBefore, entitled, isCommitSpecific, multiplier, overrideSpecifiers, overrideTiers, overwriteRate, priority, product, target, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Override{id=$id, startingAt=$startingAt, applicableProductTags=$applicableProductTags, endingBefore=$endingBefore, entitled=$entitled, isCommitSpecific=$isCommitSpecific, multiplier=$multiplier, overrideSpecifiers=$overrideSpecifiers, overrideTiers=$overrideTiers, overwriteRate=$overwriteRate, priority=$priority, product=$product, target=$target, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Transition
    @JsonCreator
    private constructor(
        @JsonProperty("from_contract_id")
        @ExcludeMissing
        private val fromContractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to_contract_id")
        @ExcludeMissing
        private val toContractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun fromContractId(): String = fromContractId.getRequired("from_contract_id")

        fun toContractId(): String = toContractId.getRequired("to_contract_id")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("from_contract_id")
        @ExcludeMissing
        fun _fromContractId(): JsonField<String> = fromContractId

        @JsonProperty("to_contract_id")
        @ExcludeMissing
        fun _toContractId(): JsonField<String> = toContractId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Transition = apply {
            if (validated) {
                return@apply
            }

            fromContractId()
            toContractId()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun fromContractId(fromContractId: JsonField<String>) = apply {
                this.fromContractId = fromContractId
            }

            fun toContractId(toContractId: String) = toContractId(JsonField.of(toContractId))

            fun toContractId(toContractId: JsonField<String>) = apply {
                this.toContractId = toContractId
            }

            fun type(type: Type) = type(JsonField.of(type))

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

            fun build(): Transition =
                Transition(
                    checkRequired("fromContractId", fromContractId),
                    checkRequired("toContractId", toContractId),
                    checkRequired("type", type),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transition && fromContractId == other.fromContractId && toContractId == other.toContractId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fromContractId, toContractId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transition{fromContractId=$fromContractId, toContractId=$toContractId, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class UsageFilter
    @JsonCreator
    private constructor(
        @JsonProperty("group_key")
        @ExcludeMissing
        private val groupKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_values")
        @ExcludeMissing
        private val groupValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun groupKey(): String = groupKey.getRequired("group_key")

        fun groupValues(): List<String> = groupValues.getRequired("group_values")

        /**
         * This will match contract starting_at value if usage filter is active from the beginning
         * of the contract.
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * This will match contract ending_before value if usage filter is active until the end of
         * the contract. It will be undefined if the contract is open-ended.
         */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

        @JsonProperty("group_values")
        @ExcludeMissing
        fun _groupValues(): JsonField<List<String>> = groupValues

        /**
         * This will match contract starting_at value if usage filter is active from the beginning
         * of the contract.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * This will match contract ending_before value if usage filter is active until the end of
         * the contract. It will be undefined if the contract is open-ended.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

            fun groupValues(groupValues: List<String>) = groupValues(JsonField.of(groupValues))

            fun groupValues(groupValues: JsonField<List<String>>) = apply {
                this.groupValues = groupValues.map { it.toMutableList() }
            }

            fun addGroupValue(groupValue: String) = apply {
                groupValues =
                    (groupValues ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(groupValue)
                    }
            }

            /**
             * This will match contract starting_at value if usage filter is active from the
             * beginning of the contract.
             */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * This will match contract starting_at value if usage filter is active from the
             * beginning of the contract.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * This will match contract ending_before value if usage filter is active until the end
             * of the contract. It will be undefined if the contract is open-ended.
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * This will match contract ending_before value if usage filter is active until the end
             * of the contract. It will be undefined if the contract is open-ended.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): UsageFilter =
                UsageFilter(
                    checkRequired("groupKey", groupKey),
                    checkRequired("groupValues", groupValues).map { it.toImmutable() },
                    checkRequired("startingAt", startingAt),
                    endingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageFilter && groupKey == other.groupKey && groupValues == other.groupValues && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(groupKey, groupValues, startingAt, endingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageFilter{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class UsageStatementSchedule
    @JsonCreator
    private constructor(
        @JsonProperty("billing_anchor_date")
        @ExcludeMissing
        private val billingAnchorDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        private val frequency: JsonField<Frequency> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Contract usage statements follow a selected cadence based on this date. */
        fun billingAnchorDate(): OffsetDateTime =
            billingAnchorDate.getRequired("billing_anchor_date")

        fun frequency(): Frequency = frequency.getRequired("frequency")

        /** Contract usage statements follow a selected cadence based on this date. */
        @JsonProperty("billing_anchor_date")
        @ExcludeMissing
        fun _billingAnchorDate(): JsonField<OffsetDateTime> = billingAnchorDate

        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<Frequency> = frequency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UsageStatementSchedule = apply {
            if (validated) {
                return@apply
            }

            billingAnchorDate()
            frequency()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                additionalProperties = usageStatementSchedule.additionalProperties.toMutableMap()
            }

            /** Contract usage statements follow a selected cadence based on this date. */
            fun billingAnchorDate(billingAnchorDate: OffsetDateTime) =
                billingAnchorDate(JsonField.of(billingAnchorDate))

            /** Contract usage statements follow a selected cadence based on this date. */
            fun billingAnchorDate(billingAnchorDate: JsonField<OffsetDateTime>) = apply {
                this.billingAnchorDate = billingAnchorDate
            }

            fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

            fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

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
                    checkRequired("billingAnchorDate", billingAnchorDate),
                    checkRequired("frequency", frequency),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageStatementSchedule && billingAnchorDate == other.billingAnchorDate && frequency == other.frequency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingAnchorDate, frequency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageStatementSchedule{billingAnchorDate=$billingAnchorDate, frequency=$frequency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Credit
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product")
        @ExcludeMissing
        private val product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("access_schedule")
        @ExcludeMissing
        private val accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        private val applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("balance")
        @ExcludeMissing
        private val balance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("contract")
        @ExcludeMissing
        private val contract: JsonField<Contract> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        @JsonProperty("ledger")
        @ExcludeMissing
        private val ledger: JsonField<List<Ledger>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("recurring_credit_id")
        @ExcludeMissing
        private val recurringCreditId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
        @JsonProperty("subscription_config")
        @ExcludeMissing
        private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun product(): Product = product.getRequired("product")

        fun type(): Type = type.getRequired("type")

        /** The schedule that the customer will gain access to the credits. */
        fun accessSchedule(): Optional<ScheduleDuration> =
            Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

        fun applicableContractIds(): Optional<List<String>> =
            Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /**
         * The current balance of the credit or commit. This balance reflects the amount of credit
         * or commit that the customer has access to use at this moment - thus, expired and upcoming
         * credit or commit segments contribute 0 to the balance. The balance will match the sum of
         * all ledger entries with the exception of the case where the sum of negative manual ledger
         * entries exceeds the positive amount remaining on the credit or commit - in that case, the
         * balance will be 0. All manual ledger entries associated with active credit or commit
         * segments are included in the balance, including future-dated manual ledger entries.
         */
        fun balance(): Optional<Double> = Optional.ofNullable(balance.getNullable("balance"))

        fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

        /**
         * Timestamp of when the credit was created.
         * - Recurring credits: latter of credit service period date and parent credit start date
         */
        fun createdAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(createdAt.getNullable("created_at"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Optional configuration for credit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun ledger(): Optional<List<Ledger>> = Optional.ofNullable(ledger.getNullable("ledger"))

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        /** The ID of the recurring credit that created this credit */
        fun recurringCreditId(): Optional<String> =
            Optional.ofNullable(recurringCreditId.getNullable("recurring_credit_id"))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown.
         */
        fun specifiers(): Optional<List<CommitSpecifier>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** Attach a subscription to the recurring commit/credit. */
        fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
            Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /** The schedule that the customer will gain access to the credits. */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<ScheduleDuration> = accessSchedule

        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * The current balance of the credit or commit. This balance reflects the amount of credit
         * or commit that the customer has access to use at this moment - thus, expired and upcoming
         * credit or commit segments contribute 0 to the balance. The balance will match the sum of
         * all ledger entries with the exception of the case where the sum of negative manual ledger
         * entries exceeds the positive amount remaining on the credit or commit - in that case, the
         * balance will be 0. All manual ledger entries associated with active credit or commit
         * segments are included in the balance, including future-dated manual ledger entries.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

        /**
         * Timestamp of when the credit was created.
         * - Recurring credits: latter of credit service period date and parent credit start date
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Optional configuration for credit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        @JsonProperty("ledger") @ExcludeMissing fun _ledger(): JsonField<List<Ledger>> = ledger

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /** The ID of the recurring credit that created this credit */
        @JsonProperty("recurring_credit_id")
        @ExcludeMissing
        fun _recurringCreditId(): JsonField<String> = recurringCreditId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

        /** Attach a subscription to the recurring commit/credit. */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> = subscriptionConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Credit = apply {
            if (validated) {
                return@apply
            }

            id()
            product().validate()
            type()
            accessSchedule().ifPresent { it.validate() }
            applicableContractIds()
            applicableProductIds()
            applicableProductTags()
            balance()
            contract().ifPresent { it.validate() }
            createdAt()
            customFields().ifPresent { it.validate() }
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            ledger().ifPresent { it.forEach { it.validate() } }
            name()
            netsuiteSalesOrderId()
            priority()
            recurringCreditId()
            salesforceOpportunityId()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Credit]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var product: JsonField<Product>? = null
            private var type: JsonField<Type>? = null
            private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
            private var applicableContractIds: JsonField<MutableList<String>>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var balance: JsonField<Double> = JsonMissing.of()
            private var contract: JsonField<Contract> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var ledger: JsonField<MutableList<Ledger>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var recurringCreditId: JsonField<String> = JsonMissing.of()
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
            private var subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credit: Credit) = apply {
                id = credit.id
                product = credit.product
                type = credit.type
                accessSchedule = credit.accessSchedule
                applicableContractIds = credit.applicableContractIds.map { it.toMutableList() }
                applicableProductIds = credit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = credit.applicableProductTags.map { it.toMutableList() }
                balance = credit.balance
                contract = credit.contract
                createdAt = credit.createdAt
                customFields = credit.customFields
                description = credit.description
                hierarchyConfiguration = credit.hierarchyConfiguration
                ledger = credit.ledger.map { it.toMutableList() }
                name = credit.name
                netsuiteSalesOrderId = credit.netsuiteSalesOrderId
                priority = credit.priority
                recurringCreditId = credit.recurringCreditId
                salesforceOpportunityId = credit.salesforceOpportunityId
                specifiers = credit.specifiers.map { it.toMutableList() }
                subscriptionConfig = credit.subscriptionConfig
                additionalProperties = credit.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun product(product: Product) = product(JsonField.of(product))

            fun product(product: JsonField<Product>) = apply { this.product = product }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The schedule that the customer will gain access to the credits. */
            fun accessSchedule(accessSchedule: ScheduleDuration) =
                accessSchedule(JsonField.of(accessSchedule))

            /** The schedule that the customer will gain access to the credits. */
            fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun applicableContractIds(applicableContractIds: List<String>) =
                applicableContractIds(JsonField.of(applicableContractIds))

            fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
                this.applicableContractIds = applicableContractIds.map { it.toMutableList() }
            }

            fun addApplicableContractId(applicableContractId: String) = apply {
                applicableContractIds =
                    (applicableContractIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableContractId)
                    }
            }

            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

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

            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

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

            /**
             * The current balance of the credit or commit. This balance reflects the amount of
             * credit or commit that the customer has access to use at this moment - thus, expired
             * and upcoming credit or commit segments contribute 0 to the balance. The balance will
             * match the sum of all ledger entries with the exception of the case where the sum of
             * negative manual ledger entries exceeds the positive amount remaining on the credit or
             * commit - in that case, the balance will be 0. All manual ledger entries associated
             * with active credit or commit segments are included in the balance, including
             * future-dated manual ledger entries.
             */
            fun balance(balance: Double) = balance(JsonField.of(balance))

            /**
             * The current balance of the credit or commit. This balance reflects the amount of
             * credit or commit that the customer has access to use at this moment - thus, expired
             * and upcoming credit or commit segments contribute 0 to the balance. The balance will
             * match the sum of all ledger entries with the exception of the case where the sum of
             * negative manual ledger entries exceeds the positive amount remaining on the credit or
             * commit - in that case, the balance will be 0. All manual ledger entries associated
             * with active credit or commit segments are included in the balance, including
             * future-dated manual ledger entries.
             */
            fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

            fun contract(contract: Contract) = contract(JsonField.of(contract))

            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

            /**
             * Timestamp of when the credit was created.
             * - Recurring credits: latter of credit service period date and parent credit start
             *   date
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Timestamp of when the credit was created.
             * - Recurring credits: latter of credit service period date and parent credit start
             *   date
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun ledger(ledger: List<Ledger>) = ledger(JsonField.of(ledger))

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun ledger(ledger: JsonField<List<Ledger>>) = apply {
                this.ledger = ledger.map { it.toMutableList() }
            }

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(ledger: Ledger) = apply {
                this.ledger =
                    (this.ledger ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(ledger)
                    }
            }

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(creditSegmentStartLedgerEntry: Ledger.CreditSegmentStartLedgerEntry) =
                addLedger(Ledger.ofCreditSegmentStartLedgerEntry(creditSegmentStartLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(
                creditAutomatedInvoiceDeductionLedgerEntry:
                    Ledger.CreditAutomatedInvoiceDeductionLedgerEntry
            ) =
                addLedger(
                    Ledger.ofCreditAutomatedInvoiceDeductionLedgerEntry(
                        creditAutomatedInvoiceDeductionLedgerEntry
                    )
                )

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(creditExpirationLedgerEntry: Ledger.CreditExpirationLedgerEntry) =
                addLedger(Ledger.ofCreditExpirationLedgerEntry(creditExpirationLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(creditCanceledLedgerEntry: Ledger.CreditCanceledLedgerEntry) =
                addLedger(Ledger.ofCreditCanceledLedgerEntry(creditCanceledLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(creditCreditedLedgerEntry: Ledger.CreditCreditedLedgerEntry) =
                addLedger(Ledger.ofCreditCreditedLedgerEntry(creditCreditedLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(creditManualLedgerEntry: Ledger.CreditManualLedgerEntry) =
                addLedger(Ledger.ofCreditManualLedgerEntry(creditManualLedgerEntry))

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun addLedger(
                creditSeatBasedAdjustmentLedgerEntry: Ledger.CreditSeatBasedAdjustmentLedgerEntry
            ) =
                addLedger(
                    Ledger.ofCreditSeatBasedAdjustmentLedgerEntry(
                        creditSeatBasedAdjustmentLedgerEntry
                    )
                )

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            /** The ID of the recurring credit that created this credit */
            fun recurringCreditId(recurringCreditId: String) =
                recurringCreditId(JsonField.of(recurringCreditId))

            /** The ID of the recurring credit that created this credit */
            fun recurringCreditId(recurringCreditId: JsonField<String>) = apply {
                this.recurringCreditId = recurringCreditId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: List<CommitSpecifier>) = specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun addSpecifier(specifier: CommitSpecifier) = apply {
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
            fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /** Attach a subscription to the recurring commit/credit. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Credit =
                Credit(
                    checkRequired("id", id),
                    checkRequired("product", product),
                    checkRequired("type", type),
                    accessSchedule,
                    (applicableContractIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    balance,
                    contract,
                    createdAt,
                    customFields,
                    description,
                    hierarchyConfiguration,
                    (ledger ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    recurringCreditId,
                    salesforceOpportunityId,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Product
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Product = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Product]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(product: Product) = apply {
                    id = product.id
                    name = product.name
                    additionalProperties = product.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Product =
                    Product(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
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

                @JvmField val CREDIT = of("CREDIT")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CREDIT
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
                CREDIT,
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
                    CREDIT -> Value.CREDIT
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
                    CREDIT -> Known.CREDIT
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
        class Contract
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Contract = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contract]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contract: Contract) = apply {
                    id = contract.id
                    additionalProperties = contract.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Contract =
                    Contract(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Contract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"
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

        @JsonDeserialize(using = Ledger.Deserializer::class)
        @JsonSerialize(using = Ledger.Serializer::class)
        class Ledger
        private constructor(
            private val creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry? = null,
            private val creditAutomatedInvoiceDeductionLedgerEntry:
                CreditAutomatedInvoiceDeductionLedgerEntry? =
                null,
            private val creditExpirationLedgerEntry: CreditExpirationLedgerEntry? = null,
            private val creditCanceledLedgerEntry: CreditCanceledLedgerEntry? = null,
            private val creditCreditedLedgerEntry: CreditCreditedLedgerEntry? = null,
            private val creditManualLedgerEntry: CreditManualLedgerEntry? = null,
            private val creditSeatBasedAdjustmentLedgerEntry:
                CreditSeatBasedAdjustmentLedgerEntry? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun creditSegmentStartLedgerEntry(): Optional<CreditSegmentStartLedgerEntry> =
                Optional.ofNullable(creditSegmentStartLedgerEntry)

            fun creditAutomatedInvoiceDeductionLedgerEntry():
                Optional<CreditAutomatedInvoiceDeductionLedgerEntry> =
                Optional.ofNullable(creditAutomatedInvoiceDeductionLedgerEntry)

            fun creditExpirationLedgerEntry(): Optional<CreditExpirationLedgerEntry> =
                Optional.ofNullable(creditExpirationLedgerEntry)

            fun creditCanceledLedgerEntry(): Optional<CreditCanceledLedgerEntry> =
                Optional.ofNullable(creditCanceledLedgerEntry)

            fun creditCreditedLedgerEntry(): Optional<CreditCreditedLedgerEntry> =
                Optional.ofNullable(creditCreditedLedgerEntry)

            fun creditManualLedgerEntry(): Optional<CreditManualLedgerEntry> =
                Optional.ofNullable(creditManualLedgerEntry)

            fun creditSeatBasedAdjustmentLedgerEntry():
                Optional<CreditSeatBasedAdjustmentLedgerEntry> =
                Optional.ofNullable(creditSeatBasedAdjustmentLedgerEntry)

            fun isCreditSegmentStartLedgerEntry(): Boolean = creditSegmentStartLedgerEntry != null

            fun isCreditAutomatedInvoiceDeductionLedgerEntry(): Boolean =
                creditAutomatedInvoiceDeductionLedgerEntry != null

            fun isCreditExpirationLedgerEntry(): Boolean = creditExpirationLedgerEntry != null

            fun isCreditCanceledLedgerEntry(): Boolean = creditCanceledLedgerEntry != null

            fun isCreditCreditedLedgerEntry(): Boolean = creditCreditedLedgerEntry != null

            fun isCreditManualLedgerEntry(): Boolean = creditManualLedgerEntry != null

            fun isCreditSeatBasedAdjustmentLedgerEntry(): Boolean =
                creditSeatBasedAdjustmentLedgerEntry != null

            fun asCreditSegmentStartLedgerEntry(): CreditSegmentStartLedgerEntry =
                creditSegmentStartLedgerEntry.getOrThrow("creditSegmentStartLedgerEntry")

            fun asCreditAutomatedInvoiceDeductionLedgerEntry():
                CreditAutomatedInvoiceDeductionLedgerEntry =
                creditAutomatedInvoiceDeductionLedgerEntry.getOrThrow(
                    "creditAutomatedInvoiceDeductionLedgerEntry"
                )

            fun asCreditExpirationLedgerEntry(): CreditExpirationLedgerEntry =
                creditExpirationLedgerEntry.getOrThrow("creditExpirationLedgerEntry")

            fun asCreditCanceledLedgerEntry(): CreditCanceledLedgerEntry =
                creditCanceledLedgerEntry.getOrThrow("creditCanceledLedgerEntry")

            fun asCreditCreditedLedgerEntry(): CreditCreditedLedgerEntry =
                creditCreditedLedgerEntry.getOrThrow("creditCreditedLedgerEntry")

            fun asCreditManualLedgerEntry(): CreditManualLedgerEntry =
                creditManualLedgerEntry.getOrThrow("creditManualLedgerEntry")

            fun asCreditSeatBasedAdjustmentLedgerEntry(): CreditSeatBasedAdjustmentLedgerEntry =
                creditSeatBasedAdjustmentLedgerEntry.getOrThrow(
                    "creditSeatBasedAdjustmentLedgerEntry"
                )

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    creditSegmentStartLedgerEntry != null ->
                        visitor.visitCreditSegmentStartLedgerEntry(creditSegmentStartLedgerEntry)
                    creditAutomatedInvoiceDeductionLedgerEntry != null ->
                        visitor.visitCreditAutomatedInvoiceDeductionLedgerEntry(
                            creditAutomatedInvoiceDeductionLedgerEntry
                        )
                    creditExpirationLedgerEntry != null ->
                        visitor.visitCreditExpirationLedgerEntry(creditExpirationLedgerEntry)
                    creditCanceledLedgerEntry != null ->
                        visitor.visitCreditCanceledLedgerEntry(creditCanceledLedgerEntry)
                    creditCreditedLedgerEntry != null ->
                        visitor.visitCreditCreditedLedgerEntry(creditCreditedLedgerEntry)
                    creditManualLedgerEntry != null ->
                        visitor.visitCreditManualLedgerEntry(creditManualLedgerEntry)
                    creditSeatBasedAdjustmentLedgerEntry != null ->
                        visitor.visitCreditSeatBasedAdjustmentLedgerEntry(
                            creditSeatBasedAdjustmentLedgerEntry
                        )
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Ledger = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitCreditSegmentStartLedgerEntry(
                            creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
                        ) {
                            creditSegmentStartLedgerEntry.validate()
                        }

                        override fun visitCreditAutomatedInvoiceDeductionLedgerEntry(
                            creditAutomatedInvoiceDeductionLedgerEntry:
                                CreditAutomatedInvoiceDeductionLedgerEntry
                        ) {
                            creditAutomatedInvoiceDeductionLedgerEntry.validate()
                        }

                        override fun visitCreditExpirationLedgerEntry(
                            creditExpirationLedgerEntry: CreditExpirationLedgerEntry
                        ) {
                            creditExpirationLedgerEntry.validate()
                        }

                        override fun visitCreditCanceledLedgerEntry(
                            creditCanceledLedgerEntry: CreditCanceledLedgerEntry
                        ) {
                            creditCanceledLedgerEntry.validate()
                        }

                        override fun visitCreditCreditedLedgerEntry(
                            creditCreditedLedgerEntry: CreditCreditedLedgerEntry
                        ) {
                            creditCreditedLedgerEntry.validate()
                        }

                        override fun visitCreditManualLedgerEntry(
                            creditManualLedgerEntry: CreditManualLedgerEntry
                        ) {
                            creditManualLedgerEntry.validate()
                        }

                        override fun visitCreditSeatBasedAdjustmentLedgerEntry(
                            creditSeatBasedAdjustmentLedgerEntry:
                                CreditSeatBasedAdjustmentLedgerEntry
                        ) {
                            creditSeatBasedAdjustmentLedgerEntry.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Ledger && creditSegmentStartLedgerEntry == other.creditSegmentStartLedgerEntry && creditAutomatedInvoiceDeductionLedgerEntry == other.creditAutomatedInvoiceDeductionLedgerEntry && creditExpirationLedgerEntry == other.creditExpirationLedgerEntry && creditCanceledLedgerEntry == other.creditCanceledLedgerEntry && creditCreditedLedgerEntry == other.creditCreditedLedgerEntry && creditManualLedgerEntry == other.creditManualLedgerEntry && creditSeatBasedAdjustmentLedgerEntry == other.creditSeatBasedAdjustmentLedgerEntry /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditSegmentStartLedgerEntry, creditAutomatedInvoiceDeductionLedgerEntry, creditExpirationLedgerEntry, creditCanceledLedgerEntry, creditCreditedLedgerEntry, creditManualLedgerEntry, creditSeatBasedAdjustmentLedgerEntry) /* spotless:on */

            override fun toString(): String =
                when {
                    creditSegmentStartLedgerEntry != null ->
                        "Ledger{creditSegmentStartLedgerEntry=$creditSegmentStartLedgerEntry}"
                    creditAutomatedInvoiceDeductionLedgerEntry != null ->
                        "Ledger{creditAutomatedInvoiceDeductionLedgerEntry=$creditAutomatedInvoiceDeductionLedgerEntry}"
                    creditExpirationLedgerEntry != null ->
                        "Ledger{creditExpirationLedgerEntry=$creditExpirationLedgerEntry}"
                    creditCanceledLedgerEntry != null ->
                        "Ledger{creditCanceledLedgerEntry=$creditCanceledLedgerEntry}"
                    creditCreditedLedgerEntry != null ->
                        "Ledger{creditCreditedLedgerEntry=$creditCreditedLedgerEntry}"
                    creditManualLedgerEntry != null ->
                        "Ledger{creditManualLedgerEntry=$creditManualLedgerEntry}"
                    creditSeatBasedAdjustmentLedgerEntry != null ->
                        "Ledger{creditSeatBasedAdjustmentLedgerEntry=$creditSeatBasedAdjustmentLedgerEntry}"
                    _json != null -> "Ledger{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Ledger")
                }

            companion object {

                @JvmStatic
                fun ofCreditSegmentStartLedgerEntry(
                    creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
                ) = Ledger(creditSegmentStartLedgerEntry = creditSegmentStartLedgerEntry)

                @JvmStatic
                fun ofCreditAutomatedInvoiceDeductionLedgerEntry(
                    creditAutomatedInvoiceDeductionLedgerEntry:
                        CreditAutomatedInvoiceDeductionLedgerEntry
                ) =
                    Ledger(
                        creditAutomatedInvoiceDeductionLedgerEntry =
                            creditAutomatedInvoiceDeductionLedgerEntry
                    )

                @JvmStatic
                fun ofCreditExpirationLedgerEntry(
                    creditExpirationLedgerEntry: CreditExpirationLedgerEntry
                ) = Ledger(creditExpirationLedgerEntry = creditExpirationLedgerEntry)

                @JvmStatic
                fun ofCreditCanceledLedgerEntry(
                    creditCanceledLedgerEntry: CreditCanceledLedgerEntry
                ) = Ledger(creditCanceledLedgerEntry = creditCanceledLedgerEntry)

                @JvmStatic
                fun ofCreditCreditedLedgerEntry(
                    creditCreditedLedgerEntry: CreditCreditedLedgerEntry
                ) = Ledger(creditCreditedLedgerEntry = creditCreditedLedgerEntry)

                @JvmStatic
                fun ofCreditManualLedgerEntry(creditManualLedgerEntry: CreditManualLedgerEntry) =
                    Ledger(creditManualLedgerEntry = creditManualLedgerEntry)

                @JvmStatic
                fun ofCreditSeatBasedAdjustmentLedgerEntry(
                    creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
                ) =
                    Ledger(
                        creditSeatBasedAdjustmentLedgerEntry = creditSeatBasedAdjustmentLedgerEntry
                    )
            }

            /**
             * An interface that defines how to map each variant of [Ledger] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitCreditSegmentStartLedgerEntry(
                    creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
                ): T

                fun visitCreditAutomatedInvoiceDeductionLedgerEntry(
                    creditAutomatedInvoiceDeductionLedgerEntry:
                        CreditAutomatedInvoiceDeductionLedgerEntry
                ): T

                fun visitCreditExpirationLedgerEntry(
                    creditExpirationLedgerEntry: CreditExpirationLedgerEntry
                ): T

                fun visitCreditCanceledLedgerEntry(
                    creditCanceledLedgerEntry: CreditCanceledLedgerEntry
                ): T

                fun visitCreditCreditedLedgerEntry(
                    creditCreditedLedgerEntry: CreditCreditedLedgerEntry
                ): T

                fun visitCreditManualLedgerEntry(
                    creditManualLedgerEntry: CreditManualLedgerEntry
                ): T

                fun visitCreditSeatBasedAdjustmentLedgerEntry(
                    creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
                ): T

                /**
                 * Maps an unknown variant of [Ledger] to a value of type [T].
                 *
                 * An instance of [Ledger] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws MetronomeInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw MetronomeInvalidDataException("Unknown Ledger: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Ledger>(Ledger::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Ledger {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<CreditSegmentStartLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(creditSegmentStartLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(
                            node,
                            jacksonTypeRef<CreditAutomatedInvoiceDeductionLedgerEntry>(),
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(
                                creditAutomatedInvoiceDeductionLedgerEntry = it,
                                _json = json,
                            )
                        }
                    tryDeserialize(node, jacksonTypeRef<CreditExpirationLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(creditExpirationLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<CreditCanceledLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(creditCanceledLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<CreditCreditedLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(creditCreditedLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<CreditManualLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(creditManualLedgerEntry = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<CreditSeatBasedAdjustmentLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(creditSeatBasedAdjustmentLedgerEntry = it, _json = json)
                        }

                    return Ledger(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Ledger>(Ledger::class) {

                override fun serialize(
                    value: Ledger,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.creditSegmentStartLedgerEntry != null ->
                            generator.writeObject(value.creditSegmentStartLedgerEntry)
                        value.creditAutomatedInvoiceDeductionLedgerEntry != null ->
                            generator.writeObject(value.creditAutomatedInvoiceDeductionLedgerEntry)
                        value.creditExpirationLedgerEntry != null ->
                            generator.writeObject(value.creditExpirationLedgerEntry)
                        value.creditCanceledLedgerEntry != null ->
                            generator.writeObject(value.creditCanceledLedgerEntry)
                        value.creditCreditedLedgerEntry != null ->
                            generator.writeObject(value.creditCreditedLedgerEntry)
                        value.creditManualLedgerEntry != null ->
                            generator.writeObject(value.creditManualLedgerEntry)
                        value.creditSeatBasedAdjustmentLedgerEntry != null ->
                            generator.writeObject(value.creditSeatBasedAdjustmentLedgerEntry)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Ledger")
                    }
                }
            }

            @NoAutoDetect
            class CreditSegmentStartLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CreditSegmentStartLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditSegmentStartLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
                    ) = apply {
                        amount = creditSegmentStartLedgerEntry.amount
                        segmentId = creditSegmentStartLedgerEntry.segmentId
                        timestamp = creditSegmentStartLedgerEntry.timestamp
                        type = creditSegmentStartLedgerEntry.type
                        additionalProperties =
                            creditSegmentStartLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): CreditSegmentStartLedgerEntry =
                        CreditSegmentStartLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val CREDIT_SEGMENT_START = of("CREDIT_SEGMENT_START")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_SEGMENT_START
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
                        CREDIT_SEGMENT_START,
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
                            CREDIT_SEGMENT_START -> Value.CREDIT_SEGMENT_START
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
                            CREDIT_SEGMENT_START -> Known.CREDIT_SEGMENT_START
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

                    return /* spotless:off */ other is CreditSegmentStartLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditSegmentStartLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class CreditAutomatedInvoiceDeductionLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CreditAutomatedInvoiceDeductionLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditAutomatedInvoiceDeductionLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        creditAutomatedInvoiceDeductionLedgerEntry:
                            CreditAutomatedInvoiceDeductionLedgerEntry
                    ) = apply {
                        amount = creditAutomatedInvoiceDeductionLedgerEntry.amount
                        invoiceId = creditAutomatedInvoiceDeductionLedgerEntry.invoiceId
                        segmentId = creditAutomatedInvoiceDeductionLedgerEntry.segmentId
                        timestamp = creditAutomatedInvoiceDeductionLedgerEntry.timestamp
                        type = creditAutomatedInvoiceDeductionLedgerEntry.type
                        contractId = creditAutomatedInvoiceDeductionLedgerEntry.contractId
                        additionalProperties =
                            creditAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                                .toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): CreditAutomatedInvoiceDeductionLedgerEntry =
                        CreditAutomatedInvoiceDeductionLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField
                        val CREDIT_AUTOMATED_INVOICE_DEDUCTION =
                            of("CREDIT_AUTOMATED_INVOICE_DEDUCTION")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION
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
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION,
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
                            CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Value.CREDIT_AUTOMATED_INVOICE_DEDUCTION
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
                            CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Known.CREDIT_AUTOMATED_INVOICE_DEDUCTION
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

                    return /* spotless:off */ other is CreditAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class CreditExpirationLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CreditExpirationLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditExpirationLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditExpirationLedgerEntry: CreditExpirationLedgerEntry) =
                        apply {
                            amount = creditExpirationLedgerEntry.amount
                            segmentId = creditExpirationLedgerEntry.segmentId
                            timestamp = creditExpirationLedgerEntry.timestamp
                            type = creditExpirationLedgerEntry.type
                            additionalProperties =
                                creditExpirationLedgerEntry.additionalProperties.toMutableMap()
                        }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): CreditExpirationLedgerEntry =
                        CreditExpirationLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val CREDIT_EXPIRATION = of("CREDIT_EXPIRATION")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_EXPIRATION
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
                        CREDIT_EXPIRATION,
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
                            CREDIT_EXPIRATION -> Value.CREDIT_EXPIRATION
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
                            CREDIT_EXPIRATION -> Known.CREDIT_EXPIRATION
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

                    return /* spotless:off */ other is CreditExpirationLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditExpirationLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class CreditCanceledLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CreditCanceledLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditCanceledLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditCanceledLedgerEntry: CreditCanceledLedgerEntry) =
                        apply {
                            amount = creditCanceledLedgerEntry.amount
                            invoiceId = creditCanceledLedgerEntry.invoiceId
                            segmentId = creditCanceledLedgerEntry.segmentId
                            timestamp = creditCanceledLedgerEntry.timestamp
                            type = creditCanceledLedgerEntry.type
                            contractId = creditCanceledLedgerEntry.contractId
                            additionalProperties =
                                creditCanceledLedgerEntry.additionalProperties.toMutableMap()
                        }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): CreditCanceledLedgerEntry =
                        CreditCanceledLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val CREDIT_CANCELED = of("CREDIT_CANCELED")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_CANCELED
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
                        CREDIT_CANCELED,
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
                            CREDIT_CANCELED -> Value.CREDIT_CANCELED
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
                            CREDIT_CANCELED -> Known.CREDIT_CANCELED
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

                    return /* spotless:off */ other is CreditCanceledLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditCanceledLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class CreditCreditedLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                private val invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                private val contractId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                fun contractId(): Optional<String> =
                    Optional.ofNullable(contractId.getNullable("contract_id"))

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun _invoiceId(): JsonField<String> = invoiceId

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("contract_id")
                @ExcludeMissing
                fun _contractId(): JsonField<String> = contractId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CreditCreditedLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    contractId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditCreditedLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var invoiceId: JsonField<String>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var contractId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditCreditedLedgerEntry: CreditCreditedLedgerEntry) =
                        apply {
                            amount = creditCreditedLedgerEntry.amount
                            invoiceId = creditCreditedLedgerEntry.invoiceId
                            segmentId = creditCreditedLedgerEntry.segmentId
                            timestamp = creditCreditedLedgerEntry.timestamp
                            type = creditCreditedLedgerEntry.type
                            contractId = creditCreditedLedgerEntry.contractId
                            additionalProperties =
                                creditCreditedLedgerEntry.additionalProperties.toMutableMap()
                        }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
                    }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                    fun contractId(contractId: JsonField<String>) = apply {
                        this.contractId = contractId
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

                    fun build(): CreditCreditedLedgerEntry =
                        CreditCreditedLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("invoiceId", invoiceId),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            contractId,
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val CREDIT_CREDITED = of("CREDIT_CREDITED")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_CREDITED
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
                        CREDIT_CREDITED,
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
                            CREDIT_CREDITED -> Value.CREDIT_CREDITED
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
                            CREDIT_CREDITED -> Known.CREDIT_CREDITED
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

                    return /* spotless:off */ other is CreditCreditedLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditCreditedLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class CreditManualLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun reason(): String = reason.getRequired("reason")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CreditManualLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    reason()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditManualLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var reason: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditManualLedgerEntry: CreditManualLedgerEntry) = apply {
                        amount = creditManualLedgerEntry.amount
                        reason = creditManualLedgerEntry.reason
                        timestamp = creditManualLedgerEntry.timestamp
                        type = creditManualLedgerEntry.type
                        additionalProperties =
                            creditManualLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun reason(reason: String) = reason(JsonField.of(reason))

                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): CreditManualLedgerEntry =
                        CreditManualLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("reason", reason),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField val CREDIT_MANUAL = of("CREDIT_MANUAL")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_MANUAL
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
                        CREDIT_MANUAL,
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
                            CREDIT_MANUAL -> Value.CREDIT_MANUAL
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
                            CREDIT_MANUAL -> Known.CREDIT_MANUAL
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

                    return /* spotless:off */ other is CreditManualLedgerEntry && amount == other.amount && reason == other.reason && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, reason, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class CreditSeatBasedAdjustmentLedgerEntry
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                private val segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun _segmentId(): JsonField<String> = segmentId

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CreditSeatBasedAdjustmentLedgerEntry = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditSeatBasedAdjustmentLedgerEntry]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var segmentId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
                    ) = apply {
                        amount = creditSeatBasedAdjustmentLedgerEntry.amount
                        segmentId = creditSeatBasedAdjustmentLedgerEntry.segmentId
                        timestamp = creditSeatBasedAdjustmentLedgerEntry.timestamp
                        type = creditSeatBasedAdjustmentLedgerEntry.type
                        additionalProperties =
                            creditSeatBasedAdjustmentLedgerEntry.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun type(type: Type) = type(JsonField.of(type))

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

                    fun build(): CreditSeatBasedAdjustmentLedgerEntry =
                        CreditSeatBasedAdjustmentLedgerEntry(
                            checkRequired("amount", amount),
                            checkRequired("segmentId", segmentId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

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

                        @JvmField
                        val CREDIT_SEAT_BASED_ADJUSTMENT = of("CREDIT_SEAT_BASED_ADJUSTMENT")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        CREDIT_SEAT_BASED_ADJUSTMENT
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
                        CREDIT_SEAT_BASED_ADJUSTMENT,
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
                            CREDIT_SEAT_BASED_ADJUSTMENT -> Value.CREDIT_SEAT_BASED_ADJUSTMENT
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
                            CREDIT_SEAT_BASED_ADJUSTMENT -> Known.CREDIT_SEAT_BASED_ADJUSTMENT
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

                    return /* spotless:off */ other is CreditSeatBasedAdjustmentLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditSeatBasedAdjustmentLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Credit && id == other.id && product == other.product && type == other.type && accessSchedule == other.accessSchedule && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && balance == other.balance && contract == other.contract && createdAt == other.createdAt && customFields == other.customFields && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && ledger == other.ledger && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && recurringCreditId == other.recurringCreditId && salesforceOpportunityId == other.salesforceOpportunityId && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, product, type, accessSchedule, applicableContractIds, applicableProductIds, applicableProductTags, balance, contract, createdAt, customFields, description, hierarchyConfiguration, ledger, name, netsuiteSalesOrderId, priority, recurringCreditId, salesforceOpportunityId, specifiers, subscriptionConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credit{id=$id, product=$product, type=$type, accessSchedule=$accessSchedule, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, balance=$balance, contract=$contract, createdAt=$createdAt, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, ledger=$ledger, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, recurringCreditId=$recurringCreditId, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
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

    /** This field's availability is dependent on your client's configuration. */
    @NoAutoDetect
    class CustomerBillingProviderConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_provider")
        @ExcludeMissing
        private val billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
        @JsonProperty("delivery_method")
        @ExcludeMissing
        private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of Customer's billing provider configuration. */
        fun id(): String = id.getRequired("id")

        fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

        fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

        /** ID of Customer's billing provider configuration. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerBillingProviderConfiguration = apply {
            if (validated) {
                return@apply
            }

            id()
            billingProvider()
            deliveryMethod()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerBillingProviderConfiguration]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var billingProvider: JsonField<BillingProvider>? = null
            private var deliveryMethod: JsonField<DeliveryMethod>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
            ) = apply {
                id = customerBillingProviderConfiguration.id
                billingProvider = customerBillingProviderConfiguration.billingProvider
                deliveryMethod = customerBillingProviderConfiguration.deliveryMethod
                additionalProperties =
                    customerBillingProviderConfiguration.additionalProperties.toMutableMap()
            }

            /** ID of Customer's billing provider configuration. */
            fun id(id: String) = id(JsonField.of(id))

            /** ID of Customer's billing provider configuration. */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
                    checkRequired("id", id),
                    checkRequired("billingProvider", billingProvider),
                    checkRequired("deliveryMethod", deliveryMethod),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerBillingProviderConfiguration && id == other.id && billingProvider == other.billingProvider && deliveryMethod == other.deliveryMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, billingProvider, deliveryMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBillingProviderConfiguration{id=$id, billingProvider=$billingProvider, deliveryMethod=$deliveryMethod, additionalProperties=$additionalProperties}"
    }

    /**
     * Indicates whether there are more items than the limit for this endpoint. Use the respective
     * list endpoints to get the full lists.
     */
    @NoAutoDetect
    class HasMore
    @JsonCreator
    private constructor(
        @JsonProperty("commits")
        @ExcludeMissing
        private val commits: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("credits")
        @ExcludeMissing
        private val credits: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Whether there are more commits on this contract than the limit for this endpoint. Use the
         * /contracts/customerCommits/list endpoint to get the full list of commits.
         */
        fun commits(): Boolean = commits.getRequired("commits")

        /**
         * Whether there are more credits on this contract than the limit for this endpoint. Use the
         * /contracts/customerCredits/list endpoint to get the full list of credits.
         */
        fun credits(): Boolean = credits.getRequired("credits")

        /**
         * Whether there are more commits on this contract than the limit for this endpoint. Use the
         * /contracts/customerCommits/list endpoint to get the full list of commits.
         */
        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<Boolean> = commits

        /**
         * Whether there are more credits on this contract than the limit for this endpoint. Use the
         * /contracts/customerCredits/list endpoint to get the full list of credits.
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Boolean> = credits

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): HasMore = apply {
            if (validated) {
                return@apply
            }

            commits()
            credits()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
             * Whether there are more commits on this contract than the limit for this endpoint. Use
             * the /contracts/customerCommits/list endpoint to get the full list of commits.
             */
            fun commits(commits: Boolean) = commits(JsonField.of(commits))

            /**
             * Whether there are more commits on this contract than the limit for this endpoint. Use
             * the /contracts/customerCommits/list endpoint to get the full list of commits.
             */
            fun commits(commits: JsonField<Boolean>) = apply { this.commits = commits }

            /**
             * Whether there are more credits on this contract than the limit for this endpoint. Use
             * the /contracts/customerCredits/list endpoint to get the full list of credits.
             */
            fun credits(credits: Boolean) = credits(JsonField.of(credits))

            /**
             * Whether there are more credits on this contract than the limit for this endpoint. Use
             * the /contracts/customerCredits/list endpoint to get the full list of credits.
             */
            fun credits(credits: JsonField<Boolean>) = apply { this.credits = credits }

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

            fun build(): HasMore =
                HasMore(
                    checkRequired("commits", commits),
                    checkRequired("credits", credits),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HasMore && commits == other.commits && credits == other.credits && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(commits, credits, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "HasMore{commits=$commits, credits=$credits, additionalProperties=$additionalProperties}"
    }

    /**
     * Either a **parent** configuration with a list of children or a **child** configuration with a
     * single parent.
     */
    @JsonDeserialize(using = HierarchyConfiguration.Deserializer::class)
    @JsonSerialize(using = HierarchyConfiguration.Serializer::class)
    class HierarchyConfiguration
    private constructor(
        private val parent: ParentHierarchyConfiguration? = null,
        private val childHierarchyConfigurationV2: ChildHierarchyConfigurationV2? = null,
        private val _json: JsonValue? = null,
    ) {

        fun parent(): Optional<ParentHierarchyConfiguration> = Optional.ofNullable(parent)

        fun childHierarchyConfigurationV2(): Optional<ChildHierarchyConfigurationV2> =
            Optional.ofNullable(childHierarchyConfigurationV2)

        fun isParent(): Boolean = parent != null

        fun isChildHierarchyConfigurationV2(): Boolean = childHierarchyConfigurationV2 != null

        fun asParent(): ParentHierarchyConfiguration = parent.getOrThrow("parent")

        fun asChildHierarchyConfigurationV2(): ChildHierarchyConfigurationV2 =
            childHierarchyConfigurationV2.getOrThrow("childHierarchyConfigurationV2")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                parent != null -> visitor.visitParent(parent)
                childHierarchyConfigurationV2 != null ->
                    visitor.visitChildHierarchyConfigurationV2(childHierarchyConfigurationV2)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): HierarchyConfiguration = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitParent(parent: ParentHierarchyConfiguration) {
                        parent.validate()
                    }

                    override fun visitChildHierarchyConfigurationV2(
                        childHierarchyConfigurationV2: ChildHierarchyConfigurationV2
                    ) {
                        childHierarchyConfigurationV2.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HierarchyConfiguration && parent == other.parent && childHierarchyConfigurationV2 == other.childHierarchyConfigurationV2 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(parent, childHierarchyConfigurationV2) /* spotless:on */

        override fun toString(): String =
            when {
                parent != null -> "HierarchyConfiguration{parent=$parent}"
                childHierarchyConfigurationV2 != null ->
                    "HierarchyConfiguration{childHierarchyConfigurationV2=$childHierarchyConfigurationV2}"
                _json != null -> "HierarchyConfiguration{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid HierarchyConfiguration")
            }

        companion object {

            @JvmStatic
            fun ofParent(parent: ParentHierarchyConfiguration) =
                HierarchyConfiguration(parent = parent)

            @JvmStatic
            fun ofChildHierarchyConfigurationV2(
                childHierarchyConfigurationV2: ChildHierarchyConfigurationV2
            ) =
                HierarchyConfiguration(
                    childHierarchyConfigurationV2 = childHierarchyConfigurationV2
                )
        }

        /**
         * An interface that defines how to map each variant of [HierarchyConfiguration] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitParent(parent: ParentHierarchyConfiguration): T

            fun visitChildHierarchyConfigurationV2(
                childHierarchyConfigurationV2: ChildHierarchyConfigurationV2
            ): T

            /**
             * Maps an unknown variant of [HierarchyConfiguration] to a value of type [T].
             *
             * An instance of [HierarchyConfiguration] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws MetronomeInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw MetronomeInvalidDataException("Unknown HierarchyConfiguration: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<HierarchyConfiguration>(HierarchyConfiguration::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): HierarchyConfiguration {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<ParentHierarchyConfiguration>()) {
                        it.validate()
                    }
                    ?.let {
                        return HierarchyConfiguration(parent = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ChildHierarchyConfigurationV2>()) {
                        it.validate()
                    }
                    ?.let {
                        return HierarchyConfiguration(
                            childHierarchyConfigurationV2 = it,
                            _json = json,
                        )
                    }

                return HierarchyConfiguration(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<HierarchyConfiguration>(HierarchyConfiguration::class) {

            override fun serialize(
                value: HierarchyConfiguration,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.parent != null -> generator.writeObject(value.parent)
                    value.childHierarchyConfigurationV2 != null ->
                        generator.writeObject(value.childHierarchyConfigurationV2)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid HierarchyConfiguration")
                }
            }
        }

        @NoAutoDetect
        class ParentHierarchyConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("children")
            @ExcludeMissing
            private val children: JsonField<List<Child>> = JsonMissing.of(),
            @JsonProperty("parent_behavior")
            @ExcludeMissing
            private val parentBehavior: JsonField<ParentBehavior> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** List of contracts that belong to this parent. */
            fun children(): List<Child> = children.getRequired("children")

            fun parentBehavior(): Optional<ParentBehavior> =
                Optional.ofNullable(parentBehavior.getNullable("parent_behavior"))

            /** List of contracts that belong to this parent. */
            @JsonProperty("children")
            @ExcludeMissing
            fun _children(): JsonField<List<Child>> = children

            @JsonProperty("parent_behavior")
            @ExcludeMissing
            fun _parentBehavior(): JsonField<ParentBehavior> = parentBehavior

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ParentHierarchyConfiguration = apply {
                if (validated) {
                    return@apply
                }

                children().forEach { it.validate() }
                parentBehavior().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ParentHierarchyConfiguration]. */
            class Builder internal constructor() {

                private var children: JsonField<MutableList<Child>>? = null
                private var parentBehavior: JsonField<ParentBehavior> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parentHierarchyConfiguration: ParentHierarchyConfiguration) =
                    apply {
                        children = parentHierarchyConfiguration.children.map { it.toMutableList() }
                        parentBehavior = parentHierarchyConfiguration.parentBehavior
                        additionalProperties =
                            parentHierarchyConfiguration.additionalProperties.toMutableMap()
                    }

                /** List of contracts that belong to this parent. */
                fun children(children: List<Child>) = children(JsonField.of(children))

                /** List of contracts that belong to this parent. */
                fun children(children: JsonField<List<Child>>) = apply {
                    this.children = children.map { it.toMutableList() }
                }

                /** List of contracts that belong to this parent. */
                fun addChild(child: Child) = apply {
                    children =
                        (children ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(child)
                        }
                }

                fun parentBehavior(parentBehavior: ParentBehavior) =
                    parentBehavior(JsonField.of(parentBehavior))

                fun parentBehavior(parentBehavior: JsonField<ParentBehavior>) = apply {
                    this.parentBehavior = parentBehavior
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

                fun build(): ParentHierarchyConfiguration =
                    ParentHierarchyConfiguration(
                        checkRequired("children", children).map { it.toImmutable() },
                        parentBehavior,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Child
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

                fun validate(): Child = apply {
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

                /** A builder for [Child]. */
                class Builder internal constructor() {

                    private var contractId: JsonField<String>? = null
                    private var customerId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(child: Child) = apply {
                        contractId = child.contractId
                        customerId = child.customerId
                        additionalProperties = child.additionalProperties.toMutableMap()
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

                    fun build(): Child =
                        Child(
                            checkRequired("contractId", contractId),
                            checkRequired("customerId", customerId),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Child && contractId == other.contractId && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(contractId, customerId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Child{contractId=$contractId, customerId=$customerId, additionalProperties=$additionalProperties}"
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
                 * Indicates the desired behavior of consolidated invoices generated by the parent
                 * in a customer hierarchy
                 *
                 * **CONCATENATE**: Statements on the invoices of child customers will be appended
                 * to the consolidated invoice
                 *
                 * **NONE**: Do not generate consolidated invoices
                 */
                fun invoiceConsolidationType(): Optional<InvoiceConsolidationType> =
                    Optional.ofNullable(
                        invoiceConsolidationType.getNullable("invoice_consolidation_type")
                    )

                /**
                 * Indicates the desired behavior of consolidated invoices generated by the parent
                 * in a customer hierarchy
                 *
                 * **CONCATENATE**: Statements on the invoices of child customers will be appended
                 * to the consolidated invoice
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
                     * Indicates the desired behavior of consolidated invoices generated by the
                     * parent in a customer hierarchy
                     *
                     * **CONCATENATE**: Statements on the invoices of child customers will be
                     * appended to the consolidated invoice
                     *
                     * **NONE**: Do not generate consolidated invoices
                     */
                    fun invoiceConsolidationType(
                        invoiceConsolidationType: InvoiceConsolidationType
                    ) = invoiceConsolidationType(JsonField.of(invoiceConsolidationType))

                    /**
                     * Indicates the desired behavior of consolidated invoices generated by the
                     * parent in a customer hierarchy
                     *
                     * **CONCATENATE**: Statements on the invoices of child customers will be
                     * appended to the consolidated invoice
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
                 * Indicates the desired behavior of consolidated invoices generated by the parent
                 * in a customer hierarchy
                 *
                 * **CONCATENATE**: Statements on the invoices of child customers will be appended
                 * to the consolidated invoice
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CONCATENATE = of("CONCATENATE")

                        @JvmField val NONE = of("NONE")

                        @JvmStatic
                        fun of(value: String) = InvoiceConsolidationType(JsonField.of(value))
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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CONCATENATE,
                        NONE,
                        /**
                         * An enum member indicating that [InvoiceConsolidationType] was
                         * instantiated with an unknown value.
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
                            CONCATENATE -> Value.CONCATENATE
                            NONE -> Value.NONE
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ParentHierarchyConfiguration && children == other.children && parentBehavior == other.parentBehavior && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(children, parentBehavior, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ParentHierarchyConfiguration{children=$children, parentBehavior=$parentBehavior, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ChildHierarchyConfigurationV2
        @JsonCreator
        private constructor(
            @JsonProperty("parent")
            @ExcludeMissing
            private val parent: JsonField<Parent> = JsonMissing.of(),
            @JsonProperty("payer")
            @ExcludeMissing
            private val payer: JsonField<Payer> = JsonMissing.of(),
            @JsonProperty("usage_statement_behavior")
            @ExcludeMissing
            private val usageStatementBehavior: JsonField<UsageStatementBehavior> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The single parent contract/customer for this child. */
            fun parent(): Parent = parent.getRequired("parent")

            /**
             * Indicates which customer should pay for the child's invoice charges **SELF**: The
             * child pays for its own invoice charges **PARENT**: The parent pays for the child's
             * invoice charges
             */
            fun payer(): Optional<Payer> = Optional.ofNullable(payer.getNullable("payer"))

            /**
             * Indicates the behavior of the child's invoice statements on the parent's invoices.
             *
             * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
             * invoices
             *
             * **SEPARATE**: Child's invoice statements will appear not appear on parent's
             * consolidated invoices
             */
            fun usageStatementBehavior(): Optional<UsageStatementBehavior> =
                Optional.ofNullable(usageStatementBehavior.getNullable("usage_statement_behavior"))

            /** The single parent contract/customer for this child. */
            @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

            /**
             * Indicates which customer should pay for the child's invoice charges **SELF**: The
             * child pays for its own invoice charges **PARENT**: The parent pays for the child's
             * invoice charges
             */
            @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<Payer> = payer

            /**
             * Indicates the behavior of the child's invoice statements on the parent's invoices.
             *
             * **CONSOLIDATE**: Child's invoice statements will be added to parent's consolidated
             * invoices
             *
             * **SEPARATE**: Child's invoice statements will appear not appear on parent's
             * consolidated invoices
             */
            @JsonProperty("usage_statement_behavior")
            @ExcludeMissing
            fun _usageStatementBehavior(): JsonField<UsageStatementBehavior> =
                usageStatementBehavior

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ChildHierarchyConfigurationV2 = apply {
                if (validated) {
                    return@apply
                }

                parent().validate()
                payer()
                usageStatementBehavior()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ChildHierarchyConfigurationV2]. */
            class Builder internal constructor() {

                private var parent: JsonField<Parent>? = null
                private var payer: JsonField<Payer> = JsonMissing.of()
                private var usageStatementBehavior: JsonField<UsageStatementBehavior> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(childHierarchyConfigurationV2: ChildHierarchyConfigurationV2) =
                    apply {
                        parent = childHierarchyConfigurationV2.parent
                        payer = childHierarchyConfigurationV2.payer
                        usageStatementBehavior =
                            childHierarchyConfigurationV2.usageStatementBehavior
                        additionalProperties =
                            childHierarchyConfigurationV2.additionalProperties.toMutableMap()
                    }

                /** The single parent contract/customer for this child. */
                fun parent(parent: Parent) = parent(JsonField.of(parent))

                /** The single parent contract/customer for this child. */
                fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

                /**
                 * Indicates which customer should pay for the child's invoice charges **SELF**: The
                 * child pays for its own invoice charges **PARENT**: The parent pays for the
                 * child's invoice charges
                 */
                fun payer(payer: Payer) = payer(JsonField.of(payer))

                /**
                 * Indicates which customer should pay for the child's invoice charges **SELF**: The
                 * child pays for its own invoice charges **PARENT**: The parent pays for the
                 * child's invoice charges
                 */
                fun payer(payer: JsonField<Payer>) = apply { this.payer = payer }

                /**
                 * Indicates the behavior of the child's invoice statements on the parent's
                 * invoices.
                 *
                 * **CONSOLIDATE**: Child's invoice statements will be added to parent's
                 * consolidated invoices
                 *
                 * **SEPARATE**: Child's invoice statements will appear not appear on parent's
                 * consolidated invoices
                 */
                fun usageStatementBehavior(usageStatementBehavior: UsageStatementBehavior) =
                    usageStatementBehavior(JsonField.of(usageStatementBehavior))

                /**
                 * Indicates the behavior of the child's invoice statements on the parent's
                 * invoices.
                 *
                 * **CONSOLIDATE**: Child's invoice statements will be added to parent's
                 * consolidated invoices
                 *
                 * **SEPARATE**: Child's invoice statements will appear not appear on parent's
                 * consolidated invoices
                 */
                fun usageStatementBehavior(
                    usageStatementBehavior: JsonField<UsageStatementBehavior>
                ) = apply { this.usageStatementBehavior = usageStatementBehavior }

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

                fun build(): ChildHierarchyConfigurationV2 =
                    ChildHierarchyConfigurationV2(
                        checkRequired("parent", parent),
                        payer,
                        usageStatementBehavior,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The single parent contract/customer for this child. */
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

            /**
             * Indicates which customer should pay for the child's invoice charges **SELF**: The
             * child pays for its own invoice charges **PARENT**: The parent pays for the child's
             * invoice charges
             */
            class Payer @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SELF,
                    PARENT,
                    /**
                     * An enum member indicating that [Payer] was instantiated with an unknown
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
             * **SEPARATE**: Child's invoice statements will appear not appear on parent's
             * consolidated invoices
             */
            class UsageStatementBehavior
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
                 * An enum containing [UsageStatementBehavior]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [UsageStatementBehavior] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONSOLIDATE,
                    SEPARATE,
                    /**
                     * An enum member indicating that [UsageStatementBehavior] was instantiated with
                     * an unknown value.
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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

                    return /* spotless:off */ other is UsageStatementBehavior && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChildHierarchyConfigurationV2 && parent == other.parent && payer == other.payer && usageStatementBehavior == other.usageStatementBehavior && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(parent, payer, usageStatementBehavior, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChildHierarchyConfigurationV2{parent=$parent, payer=$payer, usageStatementBehavior=$usageStatementBehavior, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
     * automatically. EXPLICIT prioritization requires specifying priorities for each multiplier;
     * the one with the lowest priority value will be prioritized first.
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
    class RecurringCommit
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_amount")
        @ExcludeMissing
        private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
        @JsonProperty("commit_duration")
        @ExcludeMissing
        private val commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product")
        @ExcludeMissing
        private val product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("contract")
        @ExcludeMissing
        private val contract: JsonField<Contract> = JsonMissing.of(),
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
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        private val recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
        @JsonProperty("subscription_config")
        @ExcludeMissing
        private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** The amount of commit to grant. */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /** The amount of time the created commits will be valid for */
        fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

        /** Will be passed down to the individual commits */
        fun priority(): Double = priority.getRequired("priority")

        fun product(): Product = product.getRequired("product")

        /** Whether the created commits will use the commit rate or list rate */
        fun rateType(): RateType = rateType.getRequired("rate_type")

        /** Determines the start time for the first commit */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /** Will be passed down to the individual commits */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /** Will be passed down to the individual commits */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

        /** Will be passed down to the individual commits */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Determines when the contract will stop creating recurring commits. Optional */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** Optional configuration for recurring credit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /** The amount the customer should be billed for the commit. Not required. */
        fun invoiceAmount(): Optional<InvoiceAmount> =
            Optional.ofNullable(invoiceAmount.getNullable("invoice_amount"))

        /** Displayed on invoices. Will be passed through to the individual commits */
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
         * contribute to a commit's or credit's drawdown.
         */
        fun specifiers(): Optional<List<CommitSpecifier>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** Attach a subscription to the recurring commit/credit. */
        fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
            Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The amount of commit to grant. */
        @JsonProperty("access_amount")
        @ExcludeMissing
        fun _accessAmount(): JsonField<AccessAmount> = accessAmount

        /** The amount of time the created commits will be valid for */
        @JsonProperty("commit_duration")
        @ExcludeMissing
        fun _commitDuration(): JsonField<CommitDuration> = commitDuration

        /** Will be passed down to the individual commits */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        /** Whether the created commits will use the commit rate or list rate */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** Determines the start time for the first commit */
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

        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

        /** Will be passed down to the individual commits */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Determines when the contract will stop creating recurring commits. Optional */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /** Optional configuration for recurring credit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /** The amount the customer should be billed for the commit. Not required. */
        @JsonProperty("invoice_amount")
        @ExcludeMissing
        fun _invoiceAmount(): JsonField<InvoiceAmount> = invoiceAmount

        /** Displayed on invoices. Will be passed through to the individual commits */
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
         * contribute to a commit's or credit's drawdown.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

        /** Attach a subscription to the recurring commit/credit. */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> = subscriptionConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RecurringCommit = apply {
            if (validated) {
                return@apply
            }

            id()
            accessAmount().validate()
            commitDuration().validate()
            priority()
            product().validate()
            rateType()
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
            proration()
            recurrenceFrequency()
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
            private var contract: JsonField<Contract> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var proration: JsonField<Proration> = JsonMissing.of()
            private var recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of()
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
                recurrenceFrequency = recurringCommit.recurrenceFrequency
                rolloverFraction = recurringCommit.rolloverFraction
                specifiers = recurringCommit.specifiers.map { it.toMutableList() }
                subscriptionConfig = recurringCommit.subscriptionConfig
                additionalProperties = recurringCommit.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: AccessAmount) = accessAmount(JsonField.of(accessAmount))

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                this.accessAmount = accessAmount
            }

            /** The amount of time the created commits will be valid for */
            fun commitDuration(commitDuration: CommitDuration) =
                commitDuration(JsonField.of(commitDuration))

            /** The amount of time the created commits will be valid for */
            fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                this.commitDuration = commitDuration
            }

            /** Will be passed down to the individual commits */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /** Will be passed down to the individual commits */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun product(product: Product) = product(JsonField.of(product))

            fun product(product: JsonField<Product>) = apply { this.product = product }

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Determines the start time for the first commit */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** Determines the start time for the first commit */
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

            fun contract(contract: Contract) = contract(JsonField.of(contract))

            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

            /** Will be passed down to the individual commits */
            fun description(description: String) = description(JsonField.of(description))

            /** Will be passed down to the individual commits */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Determines when the contract will stop creating recurring commits. Optional */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** Determines when the contract will stop creating recurring commits. Optional */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /** Optional configuration for recurring credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for recurring credit hierarchy access control */
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

            /** Displayed on invoices. Will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /** Displayed on invoices. Will be passed through to the individual commits */
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
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: List<CommitSpecifier>) = specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun addSpecifier(specifier: CommitSpecifier) = apply {
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
            fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /** Attach a subscription to the recurring commit/credit. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

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
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
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

            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

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

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

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

        /** The amount of time the created commits will be valid for */
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

        @NoAutoDetect
        class Product
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Product = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Product]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(product: Product) = apply {
                    id = product.id
                    name = product.name
                    additionalProperties = product.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Product =
                    Product(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
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

        @NoAutoDetect
        class Contract
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Contract = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contract]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contract: Contract) = apply {
                    id = contract.id
                    additionalProperties = contract.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Contract =
                    Contract(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Contract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RecurringCommit && id == other.id && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && product == other.product && rateType == other.rateType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && contract == other.contract && description == other.description && endingBefore == other.endingBefore && hierarchyConfiguration == other.hierarchyConfiguration && invoiceAmount == other.invoiceAmount && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && proration == other.proration && recurrenceFrequency == other.recurrenceFrequency && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, accessAmount, commitDuration, priority, product, rateType, startingAt, applicableProductIds, applicableProductTags, contract, description, endingBefore, hierarchyConfiguration, invoiceAmount, name, netsuiteSalesOrderId, proration, recurrenceFrequency, rolloverFraction, specifiers, subscriptionConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCommit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, invoiceAmount=$invoiceAmount, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RecurringCredit
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_amount")
        @ExcludeMissing
        private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
        @JsonProperty("commit_duration")
        @ExcludeMissing
        private val commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product")
        @ExcludeMissing
        private val product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("contract")
        @ExcludeMissing
        private val contract: JsonField<Contract> = JsonMissing.of(),
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
        @JsonProperty("recurrence_frequency")
        @ExcludeMissing
        private val recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
        @JsonProperty("subscription_config")
        @ExcludeMissing
        private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** The amount of commit to grant. */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /** The amount of time the created commits will be valid for */
        fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

        /** Will be passed down to the individual commits */
        fun priority(): Double = priority.getRequired("priority")

        fun product(): Product = product.getRequired("product")

        /** Whether the created commits will use the commit rate or list rate */
        fun rateType(): RateType = rateType.getRequired("rate_type")

        /** Determines the start time for the first commit */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /** Will be passed down to the individual commits */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /** Will be passed down to the individual commits */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

        /** Will be passed down to the individual commits */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Determines when the contract will stop creating recurring commits. Optional */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** Optional configuration for recurring credit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /** Displayed on invoices. Will be passed through to the individual commits */
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
         * contribute to a commit's or credit's drawdown.
         */
        fun specifiers(): Optional<List<CommitSpecifier>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** Attach a subscription to the recurring commit/credit. */
        fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
            Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The amount of commit to grant. */
        @JsonProperty("access_amount")
        @ExcludeMissing
        fun _accessAmount(): JsonField<AccessAmount> = accessAmount

        /** The amount of time the created commits will be valid for */
        @JsonProperty("commit_duration")
        @ExcludeMissing
        fun _commitDuration(): JsonField<CommitDuration> = commitDuration

        /** Will be passed down to the individual commits */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        /** Whether the created commits will use the commit rate or list rate */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** Determines the start time for the first commit */
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

        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

        /** Will be passed down to the individual commits */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Determines when the contract will stop creating recurring commits. Optional */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /** Optional configuration for recurring credit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /** Displayed on invoices. Will be passed through to the individual commits */
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
         * contribute to a commit's or credit's drawdown.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

        /** Attach a subscription to the recurring commit/credit. */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> = subscriptionConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RecurringCredit = apply {
            if (validated) {
                return@apply
            }

            id()
            accessAmount().validate()
            commitDuration().validate()
            priority()
            product().validate()
            rateType()
            startingAt()
            applicableProductIds()
            applicableProductTags()
            contract().ifPresent { it.validate() }
            description()
            endingBefore()
            hierarchyConfiguration().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            proration()
            recurrenceFrequency()
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            subscriptionConfig().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
            private var contract: JsonField<Contract> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var proration: JsonField<Proration> = JsonMissing.of()
            private var recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of()
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
                recurrenceFrequency = recurringCredit.recurrenceFrequency
                rolloverFraction = recurringCredit.rolloverFraction
                specifiers = recurringCredit.specifiers.map { it.toMutableList() }
                subscriptionConfig = recurringCredit.subscriptionConfig
                additionalProperties = recurringCredit.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: AccessAmount) = accessAmount(JsonField.of(accessAmount))

            /** The amount of commit to grant. */
            fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                this.accessAmount = accessAmount
            }

            /** The amount of time the created commits will be valid for */
            fun commitDuration(commitDuration: CommitDuration) =
                commitDuration(JsonField.of(commitDuration))

            /** The amount of time the created commits will be valid for */
            fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                this.commitDuration = commitDuration
            }

            /** Will be passed down to the individual commits */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /** Will be passed down to the individual commits */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun product(product: Product) = product(JsonField.of(product))

            fun product(product: JsonField<Product>) = apply { this.product = product }

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Determines the start time for the first commit */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** Determines the start time for the first commit */
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

            fun contract(contract: Contract) = contract(JsonField.of(contract))

            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

            /** Will be passed down to the individual commits */
            fun description(description: String) = description(JsonField.of(description))

            /** Will be passed down to the individual commits */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Determines when the contract will stop creating recurring commits. Optional */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** Determines when the contract will stop creating recurring commits. Optional */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /** Optional configuration for recurring credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for recurring credit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** Displayed on invoices. Will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /** Displayed on invoices. Will be passed through to the individual commits */
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
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: List<CommitSpecifier>) = specifiers(JsonField.of(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun addSpecifier(specifier: CommitSpecifier) = apply {
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
            fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                subscriptionConfig(JsonField.of(subscriptionConfig))

            /** Attach a subscription to the recurring commit/credit. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

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
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
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

            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

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

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

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

        /** The amount of time the created commits will be valid for */
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

        @NoAutoDetect
        class Product
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Product = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Product]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(product: Product) = apply {
                    id = product.id
                    name = product.name
                    additionalProperties = product.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Product =
                    Product(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
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

        @NoAutoDetect
        class Contract
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Contract = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contract]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contract: Contract) = apply {
                    id = contract.id
                    additionalProperties = contract.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Contract =
                    Contract(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Contract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RecurringCredit && id == other.id && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && product == other.product && rateType == other.rateType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && contract == other.contract && description == other.description && endingBefore == other.endingBefore && hierarchyConfiguration == other.hierarchyConfiguration && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && proration == other.proration && recurrenceFrequency == other.recurrenceFrequency && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, accessAmount, commitDuration, priority, product, rateType, startingAt, applicableProductIds, applicableProductTags, contract, description, endingBefore, hierarchyConfiguration, name, netsuiteSalesOrderId, proration, recurrenceFrequency, rolloverFraction, specifiers, subscriptionConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCredit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ResellerRoyalty
    @JsonCreator
    private constructor(
        @JsonProperty("reseller_type")
        @ExcludeMissing
        private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
        @JsonProperty("segments")
        @ExcludeMissing
        private val segments: JsonField<List<Segment>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        fun segments(): List<Segment> = segments.getRequired("segments")

        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        @JsonProperty("segments")
        @ExcludeMissing
        fun _segments(): JsonField<List<Segment>> = segments

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ResellerRoyalty = apply {
            if (validated) {
                return@apply
            }

            resellerType()
            segments().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResellerRoyalty]. */
        class Builder internal constructor() {

            private var resellerType: JsonField<ResellerType>? = null
            private var segments: JsonField<MutableList<Segment>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                resellerType = resellerRoyalty.resellerType
                segments = resellerRoyalty.segments.map { it.toMutableList() }
                additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun segments(segments: List<Segment>) = segments(JsonField.of(segments))

            fun segments(segments: JsonField<List<Segment>>) = apply {
                this.segments = segments.map { it.toMutableList() }
            }

            fun addSegment(segment: Segment) = apply {
                segments =
                    (segments ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(segment)
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

            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    checkRequired("resellerType", resellerType),
                    checkRequired("segments", segments).map { it.toImmutable() },
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
        class Segment
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
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            private val gcpAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            private val gcpOfferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            private val resellerContractValue: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun fraction(): Double = fraction.getRequired("fraction")

            fun netsuiteResellerId(): String =
                netsuiteResellerId.getRequired("netsuite_reseller_id")

            fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            fun applicableProductIds(): Optional<List<String>> =
                Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun awsAccountNumber(): Optional<String> =
                Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

            fun awsOfferId(): Optional<String> =
                Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

            fun awsPayerReferenceId(): Optional<String> =
                Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun gcpAccountId(): Optional<String> =
                Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

            fun gcpOfferId(): Optional<String> =
                Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

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

            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

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

            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun _gcpAccountId(): JsonField<String> = gcpAccountId

            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun _gcpOfferId(): JsonField<String> = gcpOfferId

            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            fun _resellerContractValue(): JsonField<Double> = resellerContractValue

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Segment = apply {
                if (validated) {
                    return@apply
                }

                fraction()
                netsuiteResellerId()
                resellerType()
                startingAt()
                applicableProductIds()
                applicableProductTags()
                awsAccountNumber()
                awsOfferId()
                awsPayerReferenceId()
                endingBefore()
                gcpAccountId()
                gcpOfferId()
                resellerContractValue()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Segment]. */
            class Builder internal constructor() {

                private var fraction: JsonField<Double>? = null
                private var netsuiteResellerId: JsonField<String>? = null
                private var resellerType: JsonField<ResellerType>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var applicableProductIds: JsonField<MutableList<String>>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
                private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                private var awsOfferId: JsonField<String> = JsonMissing.of()
                private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var gcpAccountId: JsonField<String> = JsonMissing.of()
                private var gcpOfferId: JsonField<String> = JsonMissing.of()
                private var resellerContractValue: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(segment: Segment) = apply {
                    fraction = segment.fraction
                    netsuiteResellerId = segment.netsuiteResellerId
                    resellerType = segment.resellerType
                    startingAt = segment.startingAt
                    applicableProductIds = segment.applicableProductIds.map { it.toMutableList() }
                    applicableProductTags = segment.applicableProductTags.map { it.toMutableList() }
                    awsAccountNumber = segment.awsAccountNumber
                    awsOfferId = segment.awsOfferId
                    awsPayerReferenceId = segment.awsPayerReferenceId
                    endingBefore = segment.endingBefore
                    gcpAccountId = segment.gcpAccountId
                    gcpOfferId = segment.gcpOfferId
                    resellerContractValue = segment.resellerContractValue
                    additionalProperties = segment.additionalProperties.toMutableMap()
                }

                fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

                fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

                fun netsuiteResellerId(netsuiteResellerId: String) =
                    netsuiteResellerId(JsonField.of(netsuiteResellerId))

                fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                    this.netsuiteResellerId = netsuiteResellerId
                }

                fun resellerType(resellerType: ResellerType) =
                    resellerType(JsonField.of(resellerType))

                fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                    this.resellerType = resellerType
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                fun applicableProductIds(applicableProductIds: List<String>) =
                    applicableProductIds(JsonField.of(applicableProductIds))

                fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                    this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
                }

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

                fun applicableProductTags(applicableProductTags: List<String>) =
                    applicableProductTags(JsonField.of(applicableProductTags))

                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

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

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                    this.gcpOfferId = gcpOfferId
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

                fun build(): Segment =
                    Segment(
                        checkRequired("fraction", fraction),
                        checkRequired("netsuiteResellerId", netsuiteResellerId),
                        checkRequired("resellerType", resellerType),
                        checkRequired("startingAt", startingAt),
                        (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                        awsAccountNumber,
                        awsOfferId,
                        awsPayerReferenceId,
                        endingBefore,
                        gcpAccountId,
                        gcpOfferId,
                        resellerContractValue,
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

                return /* spotless:off */ other is Segment && fraction == other.fraction && netsuiteResellerId == other.netsuiteResellerId && resellerType == other.resellerType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && endingBefore == other.endingBefore && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && resellerContractValue == other.resellerContractValue && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(fraction, netsuiteResellerId, resellerType, startingAt, applicableProductIds, applicableProductTags, awsAccountNumber, awsOfferId, awsPayerReferenceId, endingBefore, gcpAccountId, gcpOfferId, resellerContractValue, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Segment{fraction=$fraction, netsuiteResellerId=$netsuiteResellerId, resellerType=$resellerType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, endingBefore=$endingBefore, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, resellerContractValue=$resellerContractValue, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResellerRoyalty && resellerType == other.resellerType && segments == other.segments && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(resellerType, segments, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, segments=$segments, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ContractV2 && id == other.id && commits == other.commits && createdAt == other.createdAt && createdBy == other.createdBy && customerId == other.customerId && overrides == other.overrides && scheduledCharges == other.scheduledCharges && startingAt == other.startingAt && transitions == other.transitions && usageFilter == other.usageFilter && usageStatementSchedule == other.usageStatementSchedule && archivedAt == other.archivedAt && credits == other.credits && customFields == other.customFields && customerBillingProviderConfiguration == other.customerBillingProviderConfiguration && discounts == other.discounts && endingBefore == other.endingBefore && hasMore == other.hasMore && hierarchyConfiguration == other.hierarchyConfiguration && multiplierOverridePrioritization == other.multiplierOverridePrioritization && name == other.name && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && prepaidBalanceThresholdConfiguration == other.prepaidBalanceThresholdConfiguration && priority == other.priority && professionalServices == other.professionalServices && rateCardId == other.rateCardId && recurringCommits == other.recurringCommits && recurringCredits == other.recurringCredits && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices && spendThresholdConfiguration == other.spendThresholdConfiguration && subscriptions == other.subscriptions && totalContractValue == other.totalContractValue && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, commits, createdAt, createdBy, customerId, overrides, scheduledCharges, startingAt, transitions, usageFilter, usageStatementSchedule, archivedAt, credits, customFields, customerBillingProviderConfiguration, discounts, endingBefore, hasMore, hierarchyConfiguration, multiplierOverridePrioritization, name, netPaymentTermsDays, netsuiteSalesOrderId, prepaidBalanceThresholdConfiguration, priority, professionalServices, rateCardId, recurringCommits, recurringCredits, resellerRoyalties, salesforceOpportunityId, scheduledChargesOnUsageInvoices, spendThresholdConfiguration, subscriptions, totalContractValue, uniquenessKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractV2{id=$id, commits=$commits, createdAt=$createdAt, createdBy=$createdBy, customerId=$customerId, overrides=$overrides, scheduledCharges=$scheduledCharges, startingAt=$startingAt, transitions=$transitions, usageFilter=$usageFilter, usageStatementSchedule=$usageStatementSchedule, archivedAt=$archivedAt, credits=$credits, customFields=$customFields, customerBillingProviderConfiguration=$customerBillingProviderConfiguration, discounts=$discounts, endingBefore=$endingBefore, hasMore=$hasMore, hierarchyConfiguration=$hierarchyConfiguration, multiplierOverridePrioritization=$multiplierOverridePrioritization, name=$name, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, prepaidBalanceThresholdConfiguration=$prepaidBalanceThresholdConfiguration, priority=$priority, professionalServices=$professionalServices, rateCardId=$rateCardId, recurringCommits=$recurringCommits, recurringCredits=$recurringCredits, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, spendThresholdConfiguration=$spendThresholdConfiguration, subscriptions=$subscriptions, totalContractValue=$totalContractValue, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
