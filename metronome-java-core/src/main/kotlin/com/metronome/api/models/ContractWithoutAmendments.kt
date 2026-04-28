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

class ContractWithoutAmendments
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commits: JsonField<List<Commit>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val overrides: JsonField<List<Override>>,
    private val scheduledCharges: JsonField<List<ScheduledCharge>>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val transitions: JsonField<List<Transition>>,
    private val usageStatementSchedule: JsonField<UsageStatementSchedule>,
    private val credits: JsonField<List<Credit>>,
    private val discounts: JsonField<List<Discount>>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val hierarchyConfiguration: JsonField<HierarchyConfiguration>,
    private val name: JsonField<String>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val prepaidBalanceThresholdConfiguration:
        JsonField<PrepaidBalanceThresholdConfiguration>,
    private val professionalServices: JsonField<List<ProService>>,
    private val rateCardId: JsonField<String>,
    private val recurringCommits: JsonField<List<RecurringCommit>>,
    private val recurringCredits: JsonField<List<RecurringCredit>>,
    private val resellerRoyalties: JsonField<List<ResellerRoyalty>>,
    private val salesforceOpportunityId: JsonField<String>,
    private val scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices>,
    private val spendThresholdConfiguration: JsonField<SpendThresholdConfiguration>,
    private val totalContractValue: JsonField<Double>,
    private val usageFilter: JsonField<UsageFilter>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commits")
        @ExcludeMissing
        commits: JsonField<List<Commit>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("usage_statement_schedule")
        @ExcludeMissing
        usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of(),
        @JsonProperty("credits")
        @ExcludeMissing
        credits: JsonField<List<Credit>> = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        discounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        hierarchyConfiguration: JsonField<HierarchyConfiguration> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prepaid_balance_threshold_configuration")
        @ExcludeMissing
        prepaidBalanceThresholdConfiguration: JsonField<PrepaidBalanceThresholdConfiguration> =
            JsonMissing.of(),
        @JsonProperty("professional_services")
        @ExcludeMissing
        professionalServices: JsonField<List<ProService>> = JsonMissing.of(),
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recurring_commits")
        @ExcludeMissing
        recurringCommits: JsonField<List<RecurringCommit>> = JsonMissing.of(),
        @JsonProperty("recurring_credits")
        @ExcludeMissing
        recurringCredits: JsonField<List<RecurringCredit>> = JsonMissing.of(),
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scheduled_charges_on_usage_invoices")
        @ExcludeMissing
        scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
            JsonMissing.of(),
        @JsonProperty("spend_threshold_configuration")
        @ExcludeMissing
        spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> = JsonMissing.of(),
        @JsonProperty("total_contract_value")
        @ExcludeMissing
        totalContractValue: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("usage_filter")
        @ExcludeMissing
        usageFilter: JsonField<UsageFilter> = JsonMissing.of(),
    ) : this(
        commits,
        createdAt,
        createdBy,
        overrides,
        scheduledCharges,
        startingAt,
        transitions,
        usageStatementSchedule,
        credits,
        discounts,
        endingBefore,
        hierarchyConfiguration,
        name,
        netPaymentTermsDays,
        netsuiteSalesOrderId,
        prepaidBalanceThresholdConfiguration,
        professionalServices,
        rateCardId,
        recurringCommits,
        recurringCredits,
        resellerRoyalties,
        salesforceOpportunityId,
        scheduledChargesOnUsageInvoices,
        spendThresholdConfiguration,
        totalContractValue,
        usageFilter,
        mutableMapOf(),
    )

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
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transitions(): List<Transition> = transitions.getRequired("transitions")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usageStatementSchedule(): UsageStatementSchedule =
        usageStatementSchedule.getRequired("usage_statement_schedule")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credits(): Optional<List<Credit>> = credits.getOptional("credits")

    /**
     * This field's availability is dependent on your client's
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discounts(): Optional<List<Discount>> = discounts.getOptional("discounts")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

    /**
     * Either a **parent** configuration with a list of children or a **child** configuration with a
     * single parent.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hierarchyConfiguration(): Optional<HierarchyConfiguration> =
        hierarchyConfiguration.getOptional("hierarchy_configuration")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPaymentTermsDays(): Optional<Double> =
        netPaymentTermsDays.getOptional("net_payment_terms_days")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteSalesOrderId(): Optional<String> =
        netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prepaidBalanceThresholdConfiguration(): Optional<PrepaidBalanceThresholdConfiguration> =
        prepaidBalanceThresholdConfiguration.getOptional("prepaid_balance_threshold_configuration")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun professionalServices(): Optional<List<ProService>> =
        professionalServices.getOptional("professional_services")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rateCardId(): Optional<String> = rateCardId.getOptional("rate_card_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recurringCommits(): Optional<List<RecurringCommit>> =
        recurringCommits.getOptional("recurring_commits")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recurringCredits(): Optional<List<RecurringCredit>> =
        recurringCredits.getOptional("recurring_credits")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
        resellerRoyalties.getOptional("reseller_royalties")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salesforceOpportunityId(): Optional<String> =
        salesforceOpportunityId.getOptional("salesforce_opportunity_id")

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
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalContractValue(): Optional<Double> =
        totalContractValue.getOptional("total_contract_value")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usageFilter(): Optional<UsageFilter> = usageFilter.getOptional("usage_filter")

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
     * Returns the raw JSON value of [transitions].
     *
     * Unlike [transitions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transitions")
    @ExcludeMissing
    fun _transitions(): JsonField<List<Transition>> = transitions

    /**
     * Returns the raw JSON value of [usageStatementSchedule].
     *
     * Unlike [usageStatementSchedule], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("usage_statement_schedule")
    @ExcludeMissing
    fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> = usageStatementSchedule

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
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    /**
     * Returns the raw JSON value of [hierarchyConfiguration].
     *
     * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hierarchy_configuration")
    @ExcludeMissing
    fun _hierarchyConfiguration(): JsonField<HierarchyConfiguration> = hierarchyConfiguration

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [netPaymentTermsDays].
     *
     * Unlike [netPaymentTermsDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

    /**
     * Returns the raw JSON value of [netsuiteSalesOrderId].
     *
     * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

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
     * Returns the raw JSON value of [professionalServices].
     *
     * Unlike [professionalServices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("professional_services")
    @ExcludeMissing
    fun _professionalServices(): JsonField<List<ProService>> = professionalServices

    /**
     * Returns the raw JSON value of [rateCardId].
     *
     * Unlike [rateCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate_card_id") @ExcludeMissing fun _rateCardId(): JsonField<String> = rateCardId

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
     * Returns the raw JSON value of [totalContractValue].
     *
     * Unlike [totalContractValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_contract_value")
    @ExcludeMissing
    fun _totalContractValue(): JsonField<Double> = totalContractValue

    /**
     * Returns the raw JSON value of [usageFilter].
     *
     * Unlike [usageFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage_filter")
    @ExcludeMissing
    fun _usageFilter(): JsonField<UsageFilter> = usageFilter

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
         * Returns a mutable builder for constructing an instance of [ContractWithoutAmendments].
         *
         * The following fields are required:
         * ```java
         * .commits()
         * .createdAt()
         * .createdBy()
         * .overrides()
         * .scheduledCharges()
         * .startingAt()
         * .transitions()
         * .usageStatementSchedule()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractWithoutAmendments]. */
    class Builder internal constructor() {

        private var commits: JsonField<MutableList<Commit>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<String>? = null
        private var overrides: JsonField<MutableList<Override>>? = null
        private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
        private var startingAt: JsonField<OffsetDateTime>? = null
        private var transitions: JsonField<MutableList<Transition>>? = null
        private var usageStatementSchedule: JsonField<UsageStatementSchedule>? = null
        private var credits: JsonField<MutableList<Credit>>? = null
        private var discounts: JsonField<MutableList<Discount>>? = null
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var hierarchyConfiguration: JsonField<HierarchyConfiguration> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var prepaidBalanceThresholdConfiguration:
            JsonField<PrepaidBalanceThresholdConfiguration> =
            JsonMissing.of()
        private var professionalServices: JsonField<MutableList<ProService>>? = null
        private var rateCardId: JsonField<String> = JsonMissing.of()
        private var recurringCommits: JsonField<MutableList<RecurringCommit>>? = null
        private var recurringCredits: JsonField<MutableList<RecurringCredit>>? = null
        private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
            JsonMissing.of()
        private var spendThresholdConfiguration: JsonField<SpendThresholdConfiguration> =
            JsonMissing.of()
        private var totalContractValue: JsonField<Double> = JsonMissing.of()
        private var usageFilter: JsonField<UsageFilter> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractWithoutAmendments: ContractWithoutAmendments) = apply {
            commits = contractWithoutAmendments.commits.map { it.toMutableList() }
            createdAt = contractWithoutAmendments.createdAt
            createdBy = contractWithoutAmendments.createdBy
            overrides = contractWithoutAmendments.overrides.map { it.toMutableList() }
            scheduledCharges = contractWithoutAmendments.scheduledCharges.map { it.toMutableList() }
            startingAt = contractWithoutAmendments.startingAt
            transitions = contractWithoutAmendments.transitions.map { it.toMutableList() }
            usageStatementSchedule = contractWithoutAmendments.usageStatementSchedule
            credits = contractWithoutAmendments.credits.map { it.toMutableList() }
            discounts = contractWithoutAmendments.discounts.map { it.toMutableList() }
            endingBefore = contractWithoutAmendments.endingBefore
            hierarchyConfiguration = contractWithoutAmendments.hierarchyConfiguration
            name = contractWithoutAmendments.name
            netPaymentTermsDays = contractWithoutAmendments.netPaymentTermsDays
            netsuiteSalesOrderId = contractWithoutAmendments.netsuiteSalesOrderId
            prepaidBalanceThresholdConfiguration =
                contractWithoutAmendments.prepaidBalanceThresholdConfiguration
            professionalServices =
                contractWithoutAmendments.professionalServices.map { it.toMutableList() }
            rateCardId = contractWithoutAmendments.rateCardId
            recurringCommits = contractWithoutAmendments.recurringCommits.map { it.toMutableList() }
            recurringCredits = contractWithoutAmendments.recurringCredits.map { it.toMutableList() }
            resellerRoyalties =
                contractWithoutAmendments.resellerRoyalties.map { it.toMutableList() }
            salesforceOpportunityId = contractWithoutAmendments.salesforceOpportunityId
            scheduledChargesOnUsageInvoices =
                contractWithoutAmendments.scheduledChargesOnUsageInvoices
            spendThresholdConfiguration = contractWithoutAmendments.spendThresholdConfiguration
            totalContractValue = contractWithoutAmendments.totalContractValue
            usageFilter = contractWithoutAmendments.usageFilter
            additionalProperties = contractWithoutAmendments.additionalProperties.toMutableMap()
        }

        fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

        /**
         * Sets [Builder.commits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commits] with a well-typed `List<Commit>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * `List<ScheduledCharge>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
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

        fun transitions(transitions: List<Transition>) = transitions(JsonField.of(transitions))

        /**
         * Sets [Builder.transitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transitions] with a well-typed `List<Transition>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) =
            usageStatementSchedule(JsonField.of(usageStatementSchedule))

        /**
         * Sets [Builder.usageStatementSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageStatementSchedule] with a well-typed
         * [UsageStatementSchedule] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun usageStatementSchedule(usageStatementSchedule: JsonField<UsageStatementSchedule>) =
            apply {
                this.usageStatementSchedule = usageStatementSchedule
            }

        fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

        /**
         * Sets [Builder.credits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credits] with a well-typed `List<Credit>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /** This field's availability is dependent on your client's */
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

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        /**
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        /**
         * Either a **parent** configuration with a list of children or a **child** configuration
         * with a single parent.
         */
        fun hierarchyConfiguration(hierarchyConfiguration: HierarchyConfiguration) =
            hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

        /**
         * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hierarchyConfiguration] with a well-typed
         * [HierarchyConfiguration] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun hierarchyConfiguration(hierarchyConfiguration: JsonField<HierarchyConfiguration>) =
            apply {
                this.hierarchyConfiguration = hierarchyConfiguration
            }

        /**
         * Alias for calling [hierarchyConfiguration] with
         * `HierarchyConfiguration.ofParent(parent)`.
         */
        fun hierarchyConfiguration(parent: HierarchyConfiguration.ParentHierarchyConfiguration) =
            hierarchyConfiguration(HierarchyConfiguration.ofParent(parent))

        /**
         * Alias for calling [hierarchyConfiguration] with `HierarchyConfiguration.ofChild(child)`.
         */
        fun hierarchyConfiguration(child: HierarchyConfiguration.ChildHierarchyConfiguration) =
            hierarchyConfiguration(HierarchyConfiguration.ofChild(child))

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        /**
         * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /**
         * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

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

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: List<ProService>) =
            professionalServices(JsonField.of(professionalServices))

        /**
         * Sets [Builder.professionalServices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.professionalServices] with a well-typed
         * `List<ProService>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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

        fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

        /**
         * Sets [Builder.rateCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateCardId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

        fun recurringCommits(recurringCommits: List<RecurringCommit>) =
            recurringCommits(JsonField.of(recurringCommits))

        /**
         * Sets [Builder.recurringCommits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringCommits] with a well-typed
         * `List<RecurringCommit>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
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
         * `List<RecurringCredit>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
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

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) =
            resellerRoyalties(JsonField.of(resellerRoyalties))

        /**
         * Sets [Builder.resellerRoyalties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resellerRoyalties] with a well-typed
         * `List<ResellerRoyalty>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
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

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) =
            totalContractValue(JsonField.of(totalContractValue))

        /**
         * Sets [Builder.totalContractValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalContractValue] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
            this.totalContractValue = totalContractValue
        }

        fun usageFilter(usageFilter: UsageFilter) = usageFilter(JsonField.of(usageFilter))

        /**
         * Sets [Builder.usageFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageFilter] with a well-typed [UsageFilter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usageFilter(usageFilter: JsonField<UsageFilter>) = apply {
            this.usageFilter = usageFilter
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
         * Returns an immutable instance of [ContractWithoutAmendments].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .commits()
         * .createdAt()
         * .createdBy()
         * .overrides()
         * .scheduledCharges()
         * .startingAt()
         * .transitions()
         * .usageStatementSchedule()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractWithoutAmendments =
            ContractWithoutAmendments(
                checkRequired("commits", commits).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("overrides", overrides).map { it.toImmutable() },
                checkRequired("scheduledCharges", scheduledCharges).map { it.toImmutable() },
                checkRequired("startingAt", startingAt),
                checkRequired("transitions", transitions).map { it.toImmutable() },
                checkRequired("usageStatementSchedule", usageStatementSchedule),
                (credits ?: JsonMissing.of()).map { it.toImmutable() },
                (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                endingBefore,
                hierarchyConfiguration,
                name,
                netPaymentTermsDays,
                netsuiteSalesOrderId,
                prepaidBalanceThresholdConfiguration,
                (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                rateCardId,
                (recurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                (recurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                salesforceOpportunityId,
                scheduledChargesOnUsageInvoices,
                spendThresholdConfiguration,
                totalContractValue,
                usageFilter,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContractWithoutAmendments = apply {
        if (validated) {
            return@apply
        }

        commits().forEach { it.validate() }
        createdAt()
        createdBy()
        overrides().forEach { it.validate() }
        scheduledCharges().forEach { it.validate() }
        startingAt()
        transitions().forEach { it.validate() }
        usageStatementSchedule().validate()
        credits().ifPresent { it.forEach { it.validate() } }
        discounts().ifPresent { it.forEach { it.validate() } }
        endingBefore()
        hierarchyConfiguration().ifPresent { it.validate() }
        name()
        netPaymentTermsDays()
        netsuiteSalesOrderId()
        prepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
        professionalServices().ifPresent { it.forEach { it.validate() } }
        rateCardId()
        recurringCommits().ifPresent { it.forEach { it.validate() } }
        recurringCredits().ifPresent { it.forEach { it.validate() } }
        resellerRoyalties().ifPresent { it.forEach { it.validate() } }
        salesforceOpportunityId()
        scheduledChargesOnUsageInvoices().ifPresent { it.validate() }
        spendThresholdConfiguration().ifPresent { it.validate() }
        totalContractValue()
        usageFilter().ifPresent { it.validate() }
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
        (commits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (overrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (scheduledCharges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startingAt.asKnown().isPresent) 1 else 0) +
            (transitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (usageStatementSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (credits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (endingBefore.asKnown().isPresent) 1 else 0) +
            (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (netPaymentTermsDays.asKnown().isPresent) 1 else 0) +
            (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
            (prepaidBalanceThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (professionalServices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (rateCardId.asKnown().isPresent) 1 else 0) +
            (recurringCommits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (recurringCredits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (resellerRoyalties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (salesforceOpportunityId.asKnown().isPresent) 1 else 0) +
            (scheduledChargesOnUsageInvoices.asKnown().getOrNull()?.validity() ?: 0) +
            (spendThresholdConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalContractValue.asKnown().isPresent) 1 else 0) +
            (usageFilter.asKnown().getOrNull()?.validity() ?: 0)

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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fromContractId(): String = fromContractId.getRequired("from_contract_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun toContractId(): String = toContractId.getRequired("to_contract_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [fromContractId].
         *
         * Unlike [fromContractId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("from_contract_id")
        @ExcludeMissing
        fun _fromContractId(): JsonField<String> = fromContractId

        /**
         * Returns the raw JSON value of [toContractId].
         *
         * Unlike [toContractId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("to_contract_id")
        @ExcludeMissing
        fun _toContractId(): JsonField<String> = toContractId

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
             * You should usually call [Builder.fromContractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromContractId(fromContractId: JsonField<String>) = apply {
                this.fromContractId = fromContractId
            }

            fun toContractId(toContractId: String) = toContractId(JsonField.of(toContractId))

            /**
             * Sets [Builder.toContractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toContractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toContractId(toContractId: JsonField<String>) = apply {
                this.toContractId = toContractId
            }

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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingAnchorDate(): OffsetDateTime =
            billingAnchorDate.getRequired("billing_anchor_date")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frequency(): Frequency = frequency.getRequired("frequency")

        /**
         * Returns the raw JSON value of [billingAnchorDate].
         *
         * Unlike [billingAnchorDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_anchor_date")
        @ExcludeMissing
        fun _billingAnchorDate(): JsonField<OffsetDateTime> = billingAnchorDate

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
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
             * Returns a mutable builder for constructing an instance of [UsageStatementSchedule].
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
                additionalProperties = usageStatementSchedule.additionalProperties.toMutableMap()
            }

            /** Contract usage statements follow a selected cadence based on this date. */
            fun billingAnchorDate(billingAnchorDate: OffsetDateTime) =
                billingAnchorDate(JsonField.of(billingAnchorDate))

            /**
             * Sets [Builder.billingAnchorDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAnchorDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun billingAnchorDate(billingAnchorDate: JsonField<OffsetDateTime>) = apply {
                this.billingAnchorDate = billingAnchorDate
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
        private val contract: JsonField<Contract>,
        private val description: JsonField<String>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
        private val invoiceAmount: JsonField<InvoiceAmount>,
        private val name: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val proration: JsonField<Proration>,
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
            @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
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
            contract: JsonField<Contract> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> = JsonMissing.of(),
            @JsonProperty("invoice_amount")
            @ExcludeMissing
            invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proration")
            @ExcludeMissing
            proration: JsonField<Proration> = JsonMissing.of(),
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
            subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> = JsonMissing.of(),
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
            recurrenceFrequency,
            rolloverFraction,
            specifiers,
            subscriptionConfig,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The amount of commit to grant.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /**
         * The amount of time the created commits will be valid for
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
        fun product(): Product = product.getRequired("product")

        /**
         * Whether the created commits will use the commit rate or list rate
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rateType(): RateType = rateType.getRequired("rate_type")

        /**
         * Determines the start time for the first commit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contract(): Optional<Contract> = contract.getOptional("contract")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Determines when the contract will stop creating recurring commits. Optional
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Optional configuration for recurring commit/credit hierarchy access control
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            hierarchyConfiguration.getOptional("hierarchy_configuration")

        /**
         * The amount the customer should be billed for the commit. Not required.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceAmount(): Optional<InvoiceAmount> = invoiceAmount.getOptional("invoice_amount")

        /**
         * Displayed on invoices. Will be passed through to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proration(): Optional<Proration> = proration.getOptional("proration")

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
         * contribute to a commit's or credit's drawdown.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifier>> = specifiers.getOptional("specifiers")

        /**
         * Attach a subscription to the recurring commit/credit.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [contract].
         *
         * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [hierarchyConfiguration].
         *
         * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

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
         * Unlike [proration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

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
        fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

        /**
         * Returns the raw JSON value of [subscriptionConfig].
         *
         * Unlike [subscriptionConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> = subscriptionConfig

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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            /** The amount of time the created commits will be valid for */
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

            fun product(product: Product) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [Product] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<Product>) = apply { this.product = product }

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

            /** Determines the start time for the first commit */
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

            fun contract(contract: Contract) = contract(JsonField.of(contract))

            /**
             * Sets [Builder.contract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contract] with a well-typed [Contract] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

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

            /** Determines when the contract will stop creating recurring commits. Optional */
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

            /** Optional configuration for recurring commit/credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /**
             * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchyConfiguration] with a well-typed
             * [CommitHierarchyConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
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
             * You should usually call [Builder.invoiceAmount] with a well-typed [InvoiceAmount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceAmount(invoiceAmount: JsonField<InvoiceAmount>) = apply {
                this.invoiceAmount = invoiceAmount
            }

            /** Displayed on invoices. Will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Will be passed down to the individual commits */
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
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: List<CommitSpecifier>) = specifiers(JsonField.of(specifiers))

            /**
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifier>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * [RecurringCommitSubscriptionConfig] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
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
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    additionalProperties.toMutableMap(),
                )
        }

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

        class Product
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, name, mutableMapOf())

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
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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
                (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Product &&
                    id == other.id &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

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

        class Contract
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
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Contract].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
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

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Contract].
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
                fun build(): Contract =
                    Contract(checkRequired("id", id), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Contract = apply {
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
            @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contract &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"
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
                recurrenceFrequency,
                rolloverFraction,
                specifiers,
                subscriptionConfig,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCommit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, invoiceAmount=$invoiceAmount, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
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
        private val contract: JsonField<Contract>,
        private val description: JsonField<String>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
        private val name: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val proration: JsonField<Proration>,
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
            @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
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
            contract: JsonField<Contract> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proration")
            @ExcludeMissing
            proration: JsonField<Proration> = JsonMissing.of(),
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
            subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> = JsonMissing.of(),
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
            recurrenceFrequency,
            rolloverFraction,
            specifiers,
            subscriptionConfig,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The amount of commit to grant.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

        /**
         * The amount of time the created commits will be valid for
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
        fun product(): Product = product.getRequired("product")

        /**
         * Whether the created commits will use the commit rate or list rate
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rateType(): RateType = rateType.getRequired("rate_type")

        /**
         * Determines the start time for the first commit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contract(): Optional<Contract> = contract.getOptional("contract")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Determines when the contract will stop creating recurring commits. Optional
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Optional configuration for recurring commit/credit hierarchy access control
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            hierarchyConfiguration.getOptional("hierarchy_configuration")

        /**
         * Displayed on invoices. Will be passed through to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Will be passed down to the individual commits
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * Determines whether the first and last commit will be prorated. If not provided, the
         * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proration(): Optional<Proration> = proration.getOptional("proration")

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
         * contribute to a commit's or credit's drawdown.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifier>> = specifiers.getOptional("specifiers")

        /**
         * Attach a subscription to the recurring commit/credit.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [contract].
         *
         * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [hierarchyConfiguration].
         *
         * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [proration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proration")
        @ExcludeMissing
        fun _proration(): JsonField<Proration> = proration

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
        fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

        /**
         * Returns the raw JSON value of [subscriptionConfig].
         *
         * Unlike [subscriptionConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_config")
        @ExcludeMissing
        fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> = subscriptionConfig

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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            /** The amount of time the created commits will be valid for */
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

            fun product(product: Product) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [Product] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<Product>) = apply { this.product = product }

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

            /** Determines the start time for the first commit */
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

            fun contract(contract: Contract) = contract(JsonField.of(contract))

            /**
             * Sets [Builder.contract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contract] with a well-typed [Contract] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

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

            /** Determines when the contract will stop creating recurring commits. Optional */
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

            /** Optional configuration for recurring commit/credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /**
             * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchyConfiguration] with a well-typed
             * [CommitHierarchyConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** Displayed on invoices. Will be passed through to the individual commits */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Will be passed down to the individual commits */
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
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(specifiers: List<CommitSpecifier>) = specifiers(JsonField.of(specifiers))

            /**
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifier>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * [RecurringCommitSubscriptionConfig] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
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
                    recurrenceFrequency,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionConfig,
                    additionalProperties.toMutableMap(),
                )
        }

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

        class Product
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, name, mutableMapOf())

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
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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
                (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Product &&
                    id == other.id &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

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

        class Contract
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
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Contract].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
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

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Contract].
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
                fun build(): Contract =
                    Contract(checkRequired("id", id), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Contract = apply {
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
            @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contract &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

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
                recurrenceFrequency,
                rolloverFraction,
                specifiers,
                subscriptionConfig,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCredit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
    }

    class ResellerRoyalty
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fraction: JsonField<Double>,
        private val netsuiteResellerId: JsonField<String>,
        private val resellerType: JsonField<ResellerType>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val awsAccountNumber: JsonField<String>,
        private val awsOfferId: JsonField<String>,
        private val awsPayerReferenceId: JsonField<String>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val gcpAccountId: JsonField<String>,
        private val gcpOfferId: JsonField<String>,
        private val resellerContractValue: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fraction")
            @ExcludeMissing
            fraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            netsuiteResellerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reseller_type")
            @ExcludeMissing
            resellerType: JsonField<ResellerType> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
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
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            gcpAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            gcpOfferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            resellerContractValue: JsonField<Double> = JsonMissing.of(),
        ) : this(
            fraction,
            netsuiteResellerId,
            resellerType,
            startingAt,
            applicableProductIds,
            applicableProductTags,
            awsAccountNumber,
            awsOfferId,
            awsPayerReferenceId,
            endingBefore,
            gcpAccountId,
            gcpOfferId,
            resellerContractValue,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fraction(): Double = fraction.getRequired("fraction")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun netsuiteResellerId(): String = netsuiteResellerId.getRequired("netsuite_reseller_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsAccountNumber(): Optional<String> =
            awsAccountNumber.getOptional("aws_account_number")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsOfferId(): Optional<String> = awsOfferId.getOptional("aws_offer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsPayerReferenceId(): Optional<String> =
            awsPayerReferenceId.getOptional("aws_payer_reference_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gcpAccountId(): Optional<String> = gcpAccountId.getOptional("gcp_account_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gcpOfferId(): Optional<String> = gcpOfferId.getOptional("gcp_offer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resellerContractValue(): Optional<Double> =
            resellerContractValue.getOptional("reseller_contract_value")

        /**
         * Returns the raw JSON value of [fraction].
         *
         * Unlike [fraction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<Double> = fraction

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
         * Returns the raw JSON value of [resellerType].
         *
         * Unlike [resellerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [awsAccountNumber].
         *
         * Unlike [awsAccountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_account_number")
        @ExcludeMissing
        fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

        /**
         * Returns the raw JSON value of [awsOfferId].
         *
         * Unlike [awsOfferId], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [gcpOfferId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gcp_offer_id")
        @ExcludeMissing
        fun _gcpOfferId(): JsonField<String> = gcpOfferId

        /**
         * Returns the raw JSON value of [resellerContractValue].
         *
         * Unlike [resellerContractValue], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reseller_contract_value")
        @ExcludeMissing
        fun _resellerContractValue(): JsonField<Double> = resellerContractValue

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
             * .fraction()
             * .netsuiteResellerId()
             * .resellerType()
             * .startingAt()
             * ```
             */
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
            private var awsAccountNumber: JsonField<String> = JsonMissing.of()
            private var awsOfferId: JsonField<String> = JsonMissing.of()
            private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var gcpAccountId: JsonField<String> = JsonMissing.of()
            private var gcpOfferId: JsonField<String> = JsonMissing.of()
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
                awsAccountNumber = resellerRoyalty.awsAccountNumber
                awsOfferId = resellerRoyalty.awsOfferId
                awsPayerReferenceId = resellerRoyalty.awsPayerReferenceId
                endingBefore = resellerRoyalty.endingBefore
                gcpAccountId = resellerRoyalty.gcpAccountId
                gcpOfferId = resellerRoyalty.gcpOfferId
                resellerContractValue = resellerRoyalty.resellerContractValue
                additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
            }

            fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

            /**
             * Sets [Builder.fraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraction] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

            fun netsuiteResellerId(netsuiteResellerId: String) =
                netsuiteResellerId(JsonField.of(netsuiteResellerId))

            /**
             * Sets [Builder.netsuiteResellerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteResellerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            /**
             * Sets [Builder.resellerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerType] with a well-typed [ResellerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
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

            fun awsAccountNumber(awsAccountNumber: String) =
                awsAccountNumber(JsonField.of(awsAccountNumber))

            /**
             * Sets [Builder.awsAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsAccountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                this.awsAccountNumber = awsAccountNumber
            }

            fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

            /**
             * Sets [Builder.awsOfferId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsOfferId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsOfferId(awsOfferId: JsonField<String>) = apply { this.awsOfferId = awsOfferId }

            fun awsPayerReferenceId(awsPayerReferenceId: String) =
                awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

            /**
             * Sets [Builder.awsPayerReferenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsPayerReferenceId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                this.awsPayerReferenceId = awsPayerReferenceId
            }

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

            fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

            /**
             * Sets [Builder.gcpAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gcpAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                this.gcpAccountId = gcpAccountId
            }

            fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

            /**
             * Sets [Builder.gcpOfferId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gcpOfferId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gcpOfferId(gcpOfferId: JsonField<String>) = apply { this.gcpOfferId = gcpOfferId }

            fun resellerContractValue(resellerContractValue: Double) =
                resellerContractValue(JsonField.of(resellerContractValue))

            /**
             * Sets [Builder.resellerContractValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerContractValue] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [ResellerRoyalty].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fraction()
             * .netsuiteResellerId()
             * .resellerType()
             * .startingAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResellerRoyalty =
                ResellerRoyalty(
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResellerRoyalty = apply {
            if (validated) {
                return@apply
            }

            fraction()
            netsuiteResellerId()
            resellerType().validate()
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
            (if (fraction.asKnown().isPresent) 1 else 0) +
                (if (netsuiteResellerId.asKnown().isPresent) 1 else 0) +
                (resellerType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (if (awsAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (awsOfferId.asKnown().isPresent) 1 else 0) +
                (if (awsPayerReferenceId.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (gcpAccountId.asKnown().isPresent) 1 else 0) +
                (if (gcpOfferId.asKnown().isPresent) 1 else 0) +
                (if (resellerContractValue.asKnown().isPresent) 1 else 0)

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

            private var validated: Boolean = false

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
                fraction == other.fraction &&
                netsuiteResellerId == other.netsuiteResellerId &&
                resellerType == other.resellerType &&
                startingAt == other.startingAt &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                awsAccountNumber == other.awsAccountNumber &&
                awsOfferId == other.awsOfferId &&
                awsPayerReferenceId == other.awsPayerReferenceId &&
                endingBefore == other.endingBefore &&
                gcpAccountId == other.gcpAccountId &&
                gcpOfferId == other.gcpOfferId &&
                resellerContractValue == other.resellerContractValue &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fraction,
                netsuiteResellerId,
                resellerType,
                startingAt,
                applicableProductIds,
                applicableProductTags,
                awsAccountNumber,
                awsOfferId,
                awsPayerReferenceId,
                endingBefore,
                gcpAccountId,
                gcpOfferId,
                resellerContractValue,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{fraction=$fraction, netsuiteResellerId=$netsuiteResellerId, resellerType=$resellerType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, endingBefore=$endingBefore, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, resellerContractValue=$resellerContractValue, additionalProperties=$additionalProperties}"
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

    class UsageFilter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val current: JsonField<BaseUsageFilter>,
        private val initial: JsonField<BaseUsageFilter>,
        private val updates: JsonField<List<Update>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current")
            @ExcludeMissing
            current: JsonField<BaseUsageFilter> = JsonMissing.of(),
            @JsonProperty("initial")
            @ExcludeMissing
            initial: JsonField<BaseUsageFilter> = JsonMissing.of(),
            @JsonProperty("updates")
            @ExcludeMissing
            updates: JsonField<List<Update>> = JsonMissing.of(),
        ) : this(current, initial, updates, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun current(): Optional<BaseUsageFilter> = current.getOptional("current")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun initial(): BaseUsageFilter = initial.getRequired("initial")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updates(): List<Update> = updates.getRequired("updates")

        /**
         * Returns the raw JSON value of [current].
         *
         * Unlike [current], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("current")
        @ExcludeMissing
        fun _current(): JsonField<BaseUsageFilter> = current

        /**
         * Returns the raw JSON value of [initial].
         *
         * Unlike [initial], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("initial")
        @ExcludeMissing
        fun _initial(): JsonField<BaseUsageFilter> = initial

        /**
         * Returns the raw JSON value of [updates].
         *
         * Unlike [updates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updates") @ExcludeMissing fun _updates(): JsonField<List<Update>> = updates

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
             * .current()
             * .initial()
             * .updates()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UsageFilter]. */
        class Builder internal constructor() {

            private var current: JsonField<BaseUsageFilter>? = null
            private var initial: JsonField<BaseUsageFilter>? = null
            private var updates: JsonField<MutableList<Update>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageFilter: UsageFilter) = apply {
                current = usageFilter.current
                initial = usageFilter.initial
                updates = usageFilter.updates.map { it.toMutableList() }
                additionalProperties = usageFilter.additionalProperties.toMutableMap()
            }

            fun current(current: BaseUsageFilter?) = current(JsonField.ofNullable(current))

            /** Alias for calling [Builder.current] with `current.orElse(null)`. */
            fun current(current: Optional<BaseUsageFilter>) = current(current.getOrNull())

            /**
             * Sets [Builder.current] to an arbitrary JSON value.
             *
             * You should usually call [Builder.current] with a well-typed [BaseUsageFilter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun current(current: JsonField<BaseUsageFilter>) = apply { this.current = current }

            fun initial(initial: BaseUsageFilter) = initial(JsonField.of(initial))

            /**
             * Sets [Builder.initial] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initial] with a well-typed [BaseUsageFilter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initial(initial: JsonField<BaseUsageFilter>) = apply { this.initial = initial }

            fun updates(updates: List<Update>) = updates(JsonField.of(updates))

            /**
             * Sets [Builder.updates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updates] with a well-typed `List<Update>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updates(updates: JsonField<List<Update>>) = apply {
                this.updates = updates.map { it.toMutableList() }
            }

            /**
             * Adds a single [Update] to [updates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUpdate(update: Update) = apply {
                updates =
                    (updates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("updates", it).add(update)
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
             * Returns an immutable instance of [UsageFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .current()
             * .initial()
             * .updates()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UsageFilter =
                UsageFilter(
                    checkRequired("current", current),
                    checkRequired("initial", initial),
                    checkRequired("updates", updates).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UsageFilter = apply {
            if (validated) {
                return@apply
            }

            current().ifPresent { it.validate() }
            initial().validate()
            updates().forEach { it.validate() }
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
            (current.asKnown().getOrNull()?.validity() ?: 0) +
                (initial.asKnown().getOrNull()?.validity() ?: 0) +
                (updates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Update
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val groupKey: JsonField<String>,
            private val groupValues: JsonField<List<String>>,
            private val startingAt: JsonField<OffsetDateTime>,
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
            ) : this(groupKey, groupValues, startingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun groupKey(): String = groupKey.getRequired("group_key")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun groupValues(): List<String> = groupValues.getRequired("group_values")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Returns the raw JSON value of [groupKey].
             *
             * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

            /**
             * Returns the raw JSON value of [groupValues].
             *
             * Unlike [groupValues], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("group_values")
            @ExcludeMissing
            fun _groupValues(): JsonField<List<String>> = groupValues

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
                 * Returns a mutable builder for constructing an instance of [Update].
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

            /** A builder for [Update]. */
            class Builder internal constructor() {

                private var groupKey: JsonField<String>? = null
                private var groupValues: JsonField<MutableList<String>>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(update: Update) = apply {
                    groupKey = update.groupKey
                    groupValues = update.groupValues.map { it.toMutableList() }
                    startingAt = update.startingAt
                    additionalProperties = update.additionalProperties.toMutableMap()
                }

                fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

                /**
                 * Sets [Builder.groupKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

                fun groupValues(groupValues: List<String>) = groupValues(JsonField.of(groupValues))

                /**
                 * Sets [Builder.groupValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupValues] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Update].
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
                fun build(): Update =
                    Update(
                        checkRequired("groupKey", groupKey),
                        checkRequired("groupValues", groupValues).map { it.toImmutable() },
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Update = apply {
                if (validated) {
                    return@apply
                }

                groupKey()
                groupValues()
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
                (if (groupKey.asKnown().isPresent) 1 else 0) +
                    (groupValues.asKnown().getOrNull()?.size ?: 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Update &&
                    groupKey == other.groupKey &&
                    groupValues == other.groupValues &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(groupKey, groupValues, startingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Update{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageFilter &&
                current == other.current &&
                initial == other.initial &&
                updates == other.updates &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(current, initial, updates, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageFilter{current=$current, initial=$initial, updates=$updates, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractWithoutAmendments &&
            commits == other.commits &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            overrides == other.overrides &&
            scheduledCharges == other.scheduledCharges &&
            startingAt == other.startingAt &&
            transitions == other.transitions &&
            usageStatementSchedule == other.usageStatementSchedule &&
            credits == other.credits &&
            discounts == other.discounts &&
            endingBefore == other.endingBefore &&
            hierarchyConfiguration == other.hierarchyConfiguration &&
            name == other.name &&
            netPaymentTermsDays == other.netPaymentTermsDays &&
            netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
            prepaidBalanceThresholdConfiguration == other.prepaidBalanceThresholdConfiguration &&
            professionalServices == other.professionalServices &&
            rateCardId == other.rateCardId &&
            recurringCommits == other.recurringCommits &&
            recurringCredits == other.recurringCredits &&
            resellerRoyalties == other.resellerRoyalties &&
            salesforceOpportunityId == other.salesforceOpportunityId &&
            scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices &&
            spendThresholdConfiguration == other.spendThresholdConfiguration &&
            totalContractValue == other.totalContractValue &&
            usageFilter == other.usageFilter &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            commits,
            createdAt,
            createdBy,
            overrides,
            scheduledCharges,
            startingAt,
            transitions,
            usageStatementSchedule,
            credits,
            discounts,
            endingBefore,
            hierarchyConfiguration,
            name,
            netPaymentTermsDays,
            netsuiteSalesOrderId,
            prepaidBalanceThresholdConfiguration,
            professionalServices,
            rateCardId,
            recurringCommits,
            recurringCredits,
            resellerRoyalties,
            salesforceOpportunityId,
            scheduledChargesOnUsageInvoices,
            spendThresholdConfiguration,
            totalContractValue,
            usageFilter,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractWithoutAmendments{commits=$commits, createdAt=$createdAt, createdBy=$createdBy, overrides=$overrides, scheduledCharges=$scheduledCharges, startingAt=$startingAt, transitions=$transitions, usageStatementSchedule=$usageStatementSchedule, credits=$credits, discounts=$discounts, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, prepaidBalanceThresholdConfiguration=$prepaidBalanceThresholdConfiguration, professionalServices=$professionalServices, rateCardId=$rateCardId, recurringCommits=$recurringCommits, recurringCredits=$recurringCredits, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, spendThresholdConfiguration=$spendThresholdConfiguration, totalContractValue=$totalContractValue, usageFilter=$usageFilter, additionalProperties=$additionalProperties}"
}
