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
class ContractWithoutAmendments
@JsonCreator
private constructor(
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
    @JsonProperty("transitions")
    @ExcludeMissing
    private val transitions: JsonField<List<Transition>> = JsonMissing.of(),
    @JsonProperty("usage_statement_schedule")
    @ExcludeMissing
    private val usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of(),
    @JsonProperty("credits")
    @ExcludeMissing
    private val credits: JsonField<List<Credit>> = JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    private val netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("total_contract_value")
    @ExcludeMissing
    private val totalContractValue: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("usage_filter")
    @ExcludeMissing
    private val usageFilter: JsonField<UsageFilter> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun commits(): List<Commit> = commits.getRequired("commits")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun createdBy(): String = createdBy.getRequired("created_by")

    fun overrides(): List<Override> = overrides.getRequired("overrides")

    fun scheduledCharges(): List<ScheduledCharge> =
        scheduledCharges.getRequired("scheduled_charges")

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun transitions(): List<Transition> = transitions.getRequired("transitions")

    fun usageStatementSchedule(): UsageStatementSchedule =
        usageStatementSchedule.getRequired("usage_statement_schedule")

    fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits.getNullable("credits"))

    /** This field's availability is dependent on your client's configuration. */
    fun discounts(): Optional<List<Discount>> =
        Optional.ofNullable(discounts.getNullable("discounts"))

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun netPaymentTermsDays(): Optional<Double> =
        Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

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

    /** This field's availability is dependent on your client's configuration. */
    fun totalContractValue(): Optional<Double> =
        Optional.ofNullable(totalContractValue.getNullable("total_contract_value"))

    fun usageFilter(): Optional<UsageFilter> =
        Optional.ofNullable(usageFilter.getNullable("usage_filter"))

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

    @JsonProperty("transitions")
    @ExcludeMissing
    fun _transitions(): JsonField<List<Transition>> = transitions

    @JsonProperty("usage_statement_schedule")
    @ExcludeMissing
    fun _usageStatementSchedule(): JsonField<UsageStatementSchedule> = usageStatementSchedule

    @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<Discount>> = discounts

    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

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

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("total_contract_value")
    @ExcludeMissing
    fun _totalContractValue(): JsonField<Double> = totalContractValue

    @JsonProperty("usage_filter")
    @ExcludeMissing
    fun _usageFilter(): JsonField<UsageFilter> = usageFilter

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        name()
        netPaymentTermsDays()
        netsuiteSalesOrderId()
        professionalServices().ifPresent { it.forEach { it.validate() } }
        rateCardId()
        recurringCommits().ifPresent { it.forEach { it.validate() } }
        recurringCredits().ifPresent { it.forEach { it.validate() } }
        resellerRoyalties().ifPresent { it.forEach { it.validate() } }
        salesforceOpportunityId()
        scheduledChargesOnUsageInvoices()
        totalContractValue()
        usageFilter().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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
        private var name: JsonField<String> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var professionalServices: JsonField<MutableList<ProService>>? = null
        private var rateCardId: JsonField<String> = JsonMissing.of()
        private var recurringCommits: JsonField<MutableList<RecurringCommit>>? = null
        private var recurringCredits: JsonField<MutableList<RecurringCredit>>? = null
        private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var scheduledChargesOnUsageInvoices: JsonField<ScheduledChargesOnUsageInvoices> =
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
            name = contractWithoutAmendments.name
            netPaymentTermsDays = contractWithoutAmendments.netPaymentTermsDays
            netsuiteSalesOrderId = contractWithoutAmendments.netsuiteSalesOrderId
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
            totalContractValue = contractWithoutAmendments.totalContractValue
            usageFilter = contractWithoutAmendments.usageFilter
            additionalProperties = contractWithoutAmendments.additionalProperties.toMutableMap()
        }

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

        fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) =
            usageStatementSchedule(JsonField.of(usageStatementSchedule))

        fun usageStatementSchedule(usageStatementSchedule: JsonField<UsageStatementSchedule>) =
            apply {
                this.usageStatementSchedule = usageStatementSchedule
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

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

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

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) =
            totalContractValue(JsonField.of(totalContractValue))

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
            this.totalContractValue = totalContractValue
        }

        fun usageFilter(usageFilter: UsageFilter) = usageFilter(JsonField.of(usageFilter))

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
                name,
                netPaymentTermsDays,
                netsuiteSalesOrderId,
                (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                rateCardId,
                (recurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                (recurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                salesforceOpportunityId,
                scheduledChargesOnUsageInvoices,
                totalContractValue,
                usageFilter,
                additionalProperties.toImmutable(),
            )
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

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

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

        class Frequency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
            }

            /** An enum containing [Frequency]'s known values. */
            enum class Known {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
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
                    else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
        @JsonProperty("invoice_amount")
        @ExcludeMissing
        private val invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
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

        /** The amount the customer should be billed for the commit. Not required. */
        fun invoiceAmount(): Optional<InvoiceAmount> =
            Optional.ofNullable(invoiceAmount.getNullable("invoice_amount"))

        /** Displayed on invoices. Will be passed through to the individual commits */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** Will be passed down to the individual commits */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        fun rolloverFraction(): Optional<Double> =
            Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

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
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

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
            invoiceAmount().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            rolloverFraction()
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
            private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
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
                invoiceAmount = recurringCommit.invoiceAmount
                name = recurringCommit.name
                netsuiteSalesOrderId = recurringCommit.netsuiteSalesOrderId
                rolloverFraction = recurringCommit.rolloverFraction
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
                    invoiceAmount,
                    name,
                    netsuiteSalesOrderId,
                    rolloverFraction,
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

            fun validate(): AccessAmount = apply {
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

            /** A builder for [AccessAmount]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var unitPrice: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessAmount: AccessAmount) = apply {
                    creditTypeId = accessAmount.creditTypeId
                    quantity = accessAmount.quantity
                    unitPrice = accessAmount.unitPrice
                    additionalProperties = accessAmount.additionalProperties.toMutableMap()
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

                fun build(): AccessAmount =
                    AccessAmount(
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

                return /* spotless:off */ other is AccessAmount && creditTypeId == other.creditTypeId && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, quantity, unitPrice, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessAmount{creditTypeId=$creditTypeId, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
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

            class Unit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    PERIODS,
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

                fun asString(): String = _value().asStringOrThrow()

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
        class RateType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RecurringCommit && id == other.id && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && product == other.product && rateType == other.rateType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && contract == other.contract && description == other.description && endingBefore == other.endingBefore && invoiceAmount == other.invoiceAmount && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && rolloverFraction == other.rolloverFraction && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, accessAmount, commitDuration, priority, product, rateType, startingAt, applicableProductIds, applicableProductTags, contract, description, endingBefore, invoiceAmount, name, netsuiteSalesOrderId, rolloverFraction, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCommit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, invoiceAmount=$invoiceAmount, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rolloverFraction=$rolloverFraction, additionalProperties=$additionalProperties}"
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
        @JsonProperty("invoice_amount")
        @ExcludeMissing
        private val invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
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

        /** The amount the customer should be billed for the commit. Not required. */
        fun invoiceAmount(): Optional<InvoiceAmount> =
            Optional.ofNullable(invoiceAmount.getNullable("invoice_amount"))

        /** Displayed on invoices. Will be passed through to the individual commits */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** Will be passed down to the individual commits */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /**
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        fun rolloverFraction(): Optional<Double> =
            Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

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
         * Will be passed down to the individual commits. This controls how much of an individual
         * unexpired commit will roll over upon contract transition. Must be between 0 and 1.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

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
            invoiceAmount().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            rolloverFraction()
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
            private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
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
                invoiceAmount = recurringCredit.invoiceAmount
                name = recurringCredit.name
                netsuiteSalesOrderId = recurringCredit.netsuiteSalesOrderId
                rolloverFraction = recurringCredit.rolloverFraction
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
                    invoiceAmount,
                    name,
                    netsuiteSalesOrderId,
                    rolloverFraction,
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

            fun validate(): AccessAmount = apply {
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

            /** A builder for [AccessAmount]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var unitPrice: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessAmount: AccessAmount) = apply {
                    creditTypeId = accessAmount.creditTypeId
                    quantity = accessAmount.quantity
                    unitPrice = accessAmount.unitPrice
                    additionalProperties = accessAmount.additionalProperties.toMutableMap()
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

                fun build(): AccessAmount =
                    AccessAmount(
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

                return /* spotless:off */ other is AccessAmount && creditTypeId == other.creditTypeId && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, quantity, unitPrice, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessAmount{creditTypeId=$creditTypeId, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
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

            class Unit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    PERIODS,
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

                fun asString(): String = _value().asStringOrThrow()

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
        class RateType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RecurringCredit && id == other.id && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && product == other.product && rateType == other.rateType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && contract == other.contract && description == other.description && endingBefore == other.endingBefore && invoiceAmount == other.invoiceAmount && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && rolloverFraction == other.rolloverFraction && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, accessAmount, commitDuration, priority, product, rateType, startingAt, applicableProductIds, applicableProductTags, contract, description, endingBefore, invoiceAmount, name, netsuiteSalesOrderId, rolloverFraction, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringCredit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, invoiceAmount=$invoiceAmount, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rolloverFraction=$rolloverFraction, additionalProperties=$additionalProperties}"
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

        fun netsuiteResellerId(): String = netsuiteResellerId.getRequired("netsuite_reseller_id")

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

            fun awsOfferId(awsOfferId: JsonField<String>) = apply { this.awsOfferId = awsOfferId }

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

            fun gcpOfferId(gcpOfferId: JsonField<String>) = apply { this.gcpOfferId = gcpOfferId }

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
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is ResellerRoyalty && fraction == other.fraction && netsuiteResellerId == other.netsuiteResellerId && resellerType == other.resellerType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && endingBefore == other.endingBefore && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && resellerContractValue == other.resellerContractValue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fraction, netsuiteResellerId, resellerType, startingAt, applicableProductIds, applicableProductTags, awsAccountNumber, awsOfferId, awsPayerReferenceId, endingBefore, gcpAccountId, gcpOfferId, resellerContractValue, additionalProperties) }
        /* spotless:on */

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
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
            ALL,
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

        fun asString(): String = _value().asStringOrThrow()

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
    class UsageFilter
    @JsonCreator
    private constructor(
        @JsonProperty("current")
        @ExcludeMissing
        private val current: JsonField<BaseUsageFilter> = JsonMissing.of(),
        @JsonProperty("initial")
        @ExcludeMissing
        private val initial: JsonField<BaseUsageFilter> = JsonMissing.of(),
        @JsonProperty("updates")
        @ExcludeMissing
        private val updates: JsonField<List<Update>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun current(): Optional<BaseUsageFilter> =
            Optional.ofNullable(current.getNullable("current"))

        fun initial(): BaseUsageFilter = initial.getRequired("initial")

        fun updates(): List<Update> = updates.getRequired("updates")

        @JsonProperty("current")
        @ExcludeMissing
        fun _current(): JsonField<BaseUsageFilter> = current

        @JsonProperty("initial")
        @ExcludeMissing
        fun _initial(): JsonField<BaseUsageFilter> = initial

        @JsonProperty("updates") @ExcludeMissing fun _updates(): JsonField<List<Update>> = updates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun current(current: Optional<BaseUsageFilter>) = current(current.orElse(null))

            fun current(current: JsonField<BaseUsageFilter>) = apply { this.current = current }

            fun initial(initial: BaseUsageFilter) = initial(JsonField.of(initial))

            fun initial(initial: JsonField<BaseUsageFilter>) = apply { this.initial = initial }

            fun updates(updates: List<Update>) = updates(JsonField.of(updates))

            fun updates(updates: JsonField<List<Update>>) = apply {
                this.updates = updates.map { it.toMutableList() }
            }

            fun addUpdate(update: Update) = apply {
                updates =
                    (updates ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(update)
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

            fun build(): UsageFilter =
                UsageFilter(
                    checkRequired("current", current),
                    checkRequired("initial", initial),
                    checkRequired("updates", updates).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Update
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
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun groupKey(): String = groupKey.getRequired("group_key")

            fun groupValues(): List<String> = groupValues.getRequired("group_values")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

            @JsonProperty("group_values")
            @ExcludeMissing
            fun _groupValues(): JsonField<List<String>> = groupValues

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Update =
                    Update(
                        checkRequired("groupKey", groupKey),
                        checkRequired("groupValues", groupValues).map { it.toImmutable() },
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Update && groupKey == other.groupKey && groupValues == other.groupValues && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(groupKey, groupValues, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Update{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageFilter && current == other.current && initial == other.initial && updates == other.updates && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(current, initial, updates, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageFilter{current=$current, initial=$initial, updates=$updates, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractWithoutAmendments && commits == other.commits && createdAt == other.createdAt && createdBy == other.createdBy && overrides == other.overrides && scheduledCharges == other.scheduledCharges && startingAt == other.startingAt && transitions == other.transitions && usageStatementSchedule == other.usageStatementSchedule && credits == other.credits && discounts == other.discounts && endingBefore == other.endingBefore && name == other.name && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && professionalServices == other.professionalServices && rateCardId == other.rateCardId && recurringCommits == other.recurringCommits && recurringCredits == other.recurringCredits && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && scheduledChargesOnUsageInvoices == other.scheduledChargesOnUsageInvoices && totalContractValue == other.totalContractValue && usageFilter == other.usageFilter && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(commits, createdAt, createdBy, overrides, scheduledCharges, startingAt, transitions, usageStatementSchedule, credits, discounts, endingBefore, name, netPaymentTermsDays, netsuiteSalesOrderId, professionalServices, rateCardId, recurringCommits, recurringCredits, resellerRoyalties, salesforceOpportunityId, scheduledChargesOnUsageInvoices, totalContractValue, usageFilter, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractWithoutAmendments{commits=$commits, createdAt=$createdAt, createdBy=$createdBy, overrides=$overrides, scheduledCharges=$scheduledCharges, startingAt=$startingAt, transitions=$transitions, usageStatementSchedule=$usageStatementSchedule, credits=$credits, discounts=$discounts, endingBefore=$endingBefore, name=$name, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, professionalServices=$professionalServices, rateCardId=$rateCardId, recurringCommits=$recurringCommits, recurringCredits=$recurringCredits, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledChargesOnUsageInvoices=$scheduledChargesOnUsageInvoices, totalContractValue=$totalContractValue, usageFilter=$usageFilter, additionalProperties=$additionalProperties}"
}
