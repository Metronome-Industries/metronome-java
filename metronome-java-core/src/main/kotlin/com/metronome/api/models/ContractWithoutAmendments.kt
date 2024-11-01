// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ContractWithoutAmendments.Builder::class)
@NoAutoDetect
class ContractWithoutAmendments
private constructor(
    private val name: JsonField<String>,
    private val salesforceOpportunityId: JsonField<String>,
    private val rateCardId: JsonField<String>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val commits: JsonField<List<Commit>>,
    private val credits: JsonField<List<Credit>>,
    private val overrides: JsonField<List<Override>>,
    private val discounts: JsonField<List<Discount>>,
    private val professionalServices: JsonField<List<ProService>>,
    private val scheduledCharges: JsonField<List<ScheduledCharge>>,
    private val transitions: JsonField<List<Transition>>,
    private val resellerRoyalties: JsonField<List<ResellerRoyalty>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val totalContractValue: JsonField<Double>,
    private val usageFilter: JsonField<UsageFilter>,
    private val usageStatementSchedule: JsonField<UsageStatementSchedule>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    fun rateCardId(): Optional<String> = Optional.ofNullable(rateCardId.getNullable("rate_card_id"))

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun commits(): List<Commit> = commits.getRequired("commits")

    fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits.getNullable("credits"))

    fun overrides(): List<Override> = overrides.getRequired("overrides")

    /** This field's availability is dependent on your client's configuration. */
    fun discounts(): Optional<List<Discount>> =
        Optional.ofNullable(discounts.getNullable("discounts"))

    /** This field's availability is dependent on your client's configuration. */
    fun professionalServices(): Optional<List<ProService>> =
        Optional.ofNullable(professionalServices.getNullable("professional_services"))

    fun scheduledCharges(): List<ScheduledCharge> =
        scheduledCharges.getRequired("scheduled_charges")

    fun transitions(): List<Transition> = transitions.getRequired("transitions")

    /** This field's availability is dependent on your client's configuration. */
    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
        Optional.ofNullable(resellerRoyalties.getNullable("reseller_royalties"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun createdBy(): String = createdBy.getRequired("created_by")

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    fun netPaymentTermsDays(): Optional<Double> =
        Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    /** This field's availability is dependent on your client's configuration. */
    fun totalContractValue(): Optional<Double> =
        Optional.ofNullable(totalContractValue.getNullable("total_contract_value"))

    fun usageFilter(): Optional<UsageFilter> =
        Optional.ofNullable(usageFilter.getNullable("usage_filter"))

    fun usageStatementSchedule(): UsageStatementSchedule =
        usageStatementSchedule.getRequired("usage_statement_schedule")

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId() = salesforceOpportunityId

    @JsonProperty("rate_card_id") @ExcludeMissing fun _rateCardId() = rateCardId

    @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

    @JsonProperty("commits") @ExcludeMissing fun _commits() = commits

    @JsonProperty("credits") @ExcludeMissing fun _credits() = credits

    @JsonProperty("overrides") @ExcludeMissing fun _overrides() = overrides

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("discounts") @ExcludeMissing fun _discounts() = discounts

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("professional_services")
    @ExcludeMissing
    fun _professionalServices() = professionalServices

    @JsonProperty("scheduled_charges") @ExcludeMissing fun _scheduledCharges() = scheduledCharges

    @JsonProperty("transitions") @ExcludeMissing fun _transitions() = transitions

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("reseller_royalties") @ExcludeMissing fun _resellerRoyalties() = resellerRoyalties

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays() = netPaymentTermsDays

    @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("total_contract_value")
    @ExcludeMissing
    fun _totalContractValue() = totalContractValue

    @JsonProperty("usage_filter") @ExcludeMissing fun _usageFilter() = usageFilter

    @JsonProperty("usage_statement_schedule")
    @ExcludeMissing
    fun _usageStatementSchedule() = usageStatementSchedule

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ContractWithoutAmendments = apply {
        if (!validated) {
            name()
            salesforceOpportunityId()
            rateCardId()
            startingAt()
            commits().forEach { it.validate() }
            credits().map { it.forEach { it.validate() } }
            overrides().forEach { it.validate() }
            discounts().map { it.forEach { it.validate() } }
            professionalServices().map { it.forEach { it.validate() } }
            scheduledCharges().forEach { it.validate() }
            transitions().forEach { it.validate() }
            resellerRoyalties().map { it.forEach { it.validate() } }
            createdAt()
            createdBy()
            netsuiteSalesOrderId()
            netPaymentTermsDays()
            endingBefore()
            totalContractValue()
            usageFilter().map { it.validate() }
            usageStatementSchedule().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var rateCardId: JsonField<String> = JsonMissing.of()
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var commits: JsonField<List<Commit>> = JsonMissing.of()
        private var credits: JsonField<List<Credit>> = JsonMissing.of()
        private var overrides: JsonField<List<Override>> = JsonMissing.of()
        private var discounts: JsonField<List<Discount>> = JsonMissing.of()
        private var professionalServices: JsonField<List<ProService>> = JsonMissing.of()
        private var scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of()
        private var transitions: JsonField<List<Transition>> = JsonMissing.of()
        private var resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var totalContractValue: JsonField<Double> = JsonMissing.of()
        private var usageFilter: JsonField<UsageFilter> = JsonMissing.of()
        private var usageStatementSchedule: JsonField<UsageStatementSchedule> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractWithoutAmendments: ContractWithoutAmendments) = apply {
            this.name = contractWithoutAmendments.name
            this.salesforceOpportunityId = contractWithoutAmendments.salesforceOpportunityId
            this.rateCardId = contractWithoutAmendments.rateCardId
            this.startingAt = contractWithoutAmendments.startingAt
            this.commits = contractWithoutAmendments.commits
            this.credits = contractWithoutAmendments.credits
            this.overrides = contractWithoutAmendments.overrides
            this.discounts = contractWithoutAmendments.discounts
            this.professionalServices = contractWithoutAmendments.professionalServices
            this.scheduledCharges = contractWithoutAmendments.scheduledCharges
            this.transitions = contractWithoutAmendments.transitions
            this.resellerRoyalties = contractWithoutAmendments.resellerRoyalties
            this.createdAt = contractWithoutAmendments.createdAt
            this.createdBy = contractWithoutAmendments.createdBy
            this.netsuiteSalesOrderId = contractWithoutAmendments.netsuiteSalesOrderId
            this.netPaymentTermsDays = contractWithoutAmendments.netPaymentTermsDays
            this.endingBefore = contractWithoutAmendments.endingBefore
            this.totalContractValue = contractWithoutAmendments.totalContractValue
            this.usageFilter = contractWithoutAmendments.usageFilter
            this.usageStatementSchedule = contractWithoutAmendments.usageStatementSchedule
            additionalProperties(contractWithoutAmendments.additionalProperties)
        }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

        @JsonProperty("commits")
        @ExcludeMissing
        fun commits(commits: JsonField<List<Commit>>) = apply { this.commits = commits }

        fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

        @JsonProperty("credits")
        @ExcludeMissing
        fun credits(credits: JsonField<List<Credit>>) = apply { this.credits = credits }

        fun overrides(overrides: List<Override>) = overrides(JsonField.of(overrides))

        @JsonProperty("overrides")
        @ExcludeMissing
        fun overrides(overrides: JsonField<List<Override>>) = apply { this.overrides = overrides }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun discounts(discounts: JsonField<List<Discount>>) = apply { this.discounts = discounts }

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: List<ProService>) =
            professionalServices(JsonField.of(professionalServices))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        @ExcludeMissing
        fun professionalServices(professionalServices: JsonField<List<ProService>>) = apply {
            this.professionalServices = professionalServices
        }

        fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) =
            scheduledCharges(JsonField.of(scheduledCharges))

        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
            this.scheduledCharges = scheduledCharges
        }

        fun transitions(transitions: List<Transition>) = transitions(JsonField.of(transitions))

        @JsonProperty("transitions")
        @ExcludeMissing
        fun transitions(transitions: JsonField<List<Transition>>) = apply {
            this.transitions = transitions
        }

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) =
            resellerRoyalties(JsonField.of(resellerRoyalties))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
            this.resellerRoyalties = resellerRoyalties
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        @JsonProperty("created_by")
        @ExcludeMissing
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) =
            totalContractValue(JsonField.of(totalContractValue))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("total_contract_value")
        @ExcludeMissing
        fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
            this.totalContractValue = totalContractValue
        }

        fun usageFilter(usageFilter: UsageFilter) = usageFilter(JsonField.of(usageFilter))

        @JsonProperty("usage_filter")
        @ExcludeMissing
        fun usageFilter(usageFilter: JsonField<UsageFilter>) = apply {
            this.usageFilter = usageFilter
        }

        fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) =
            usageStatementSchedule(JsonField.of(usageStatementSchedule))

        @JsonProperty("usage_statement_schedule")
        @ExcludeMissing
        fun usageStatementSchedule(usageStatementSchedule: JsonField<UsageStatementSchedule>) =
            apply {
                this.usageStatementSchedule = usageStatementSchedule
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ContractWithoutAmendments =
            ContractWithoutAmendments(
                name,
                salesforceOpportunityId,
                rateCardId,
                startingAt,
                commits.map { it.toImmutable() },
                credits.map { it.toImmutable() },
                overrides.map { it.toImmutable() },
                discounts.map { it.toImmutable() },
                professionalServices.map { it.toImmutable() },
                scheduledCharges.map { it.toImmutable() },
                transitions.map { it.toImmutable() },
                resellerRoyalties.map { it.toImmutable() },
                createdAt,
                createdBy,
                netsuiteSalesOrderId,
                netPaymentTermsDays,
                endingBefore,
                totalContractValue,
                usageFilter,
                usageStatementSchedule,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Transition.Builder::class)
    @NoAutoDetect
    class Transition
    private constructor(
        private val type: JsonField<Type>,
        private val fromContractId: JsonField<String>,
        private val toContractId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun type(): Type = type.getRequired("type")

        fun fromContractId(): String = fromContractId.getRequired("from_contract_id")

        fun toContractId(): String = toContractId.getRequired("to_contract_id")

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("from_contract_id") @ExcludeMissing fun _fromContractId() = fromContractId

        @JsonProperty("to_contract_id") @ExcludeMissing fun _toContractId() = toContractId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Transition = apply {
            if (!validated) {
                type()
                fromContractId()
                toContractId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var fromContractId: JsonField<String> = JsonMissing.of()
            private var toContractId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transition: Transition) = apply {
                this.type = transition.type
                this.fromContractId = transition.fromContractId
                this.toContractId = transition.toContractId
                additionalProperties(transition.additionalProperties)
            }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun fromContractId(fromContractId: String) =
                fromContractId(JsonField.of(fromContractId))

            @JsonProperty("from_contract_id")
            @ExcludeMissing
            fun fromContractId(fromContractId: JsonField<String>) = apply {
                this.fromContractId = fromContractId
            }

            fun toContractId(toContractId: String) = toContractId(JsonField.of(toContractId))

            @JsonProperty("to_contract_id")
            @ExcludeMissing
            fun toContractId(toContractId: JsonField<String>) = apply {
                this.toContractId = toContractId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Transition =
                Transition(
                    type,
                    fromContractId,
                    toContractId,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SUPERSEDE = Type(JsonField.of("SUPERSEDE"))

                @JvmField val RENEWAL = Type(JsonField.of("RENEWAL"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                SUPERSEDE,
                RENEWAL,
            }

            enum class Value {
                SUPERSEDE,
                RENEWAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUPERSEDE -> Value.SUPERSEDE
                    RENEWAL -> Value.RENEWAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SUPERSEDE -> Known.SUPERSEDE
                    RENEWAL -> Known.RENEWAL
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transition && this.type == other.type && this.fromContractId == other.fromContractId && this.toContractId == other.toContractId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, fromContractId, toContractId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Transition{type=$type, fromContractId=$fromContractId, toContractId=$toContractId, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = UsageStatementSchedule.Builder::class)
    @NoAutoDetect
    class UsageStatementSchedule
    private constructor(
        private val frequency: JsonField<Frequency>,
        private val billingAnchorDate: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun frequency(): Frequency = frequency.getRequired("frequency")

        /** Contract usage statements follow a selected cadence based on this date. */
        fun billingAnchorDate(): OffsetDateTime =
            billingAnchorDate.getRequired("billing_anchor_date")

        @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

        /** Contract usage statements follow a selected cadence based on this date. */
        @JsonProperty("billing_anchor_date")
        @ExcludeMissing
        fun _billingAnchorDate() = billingAnchorDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UsageStatementSchedule = apply {
            if (!validated) {
                frequency()
                billingAnchorDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var frequency: JsonField<Frequency> = JsonMissing.of()
            private var billingAnchorDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageStatementSchedule: UsageStatementSchedule) = apply {
                this.frequency = usageStatementSchedule.frequency
                this.billingAnchorDate = usageStatementSchedule.billingAnchorDate
                additionalProperties(usageStatementSchedule.additionalProperties)
            }

            fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

            @JsonProperty("frequency")
            @ExcludeMissing
            fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

            /** Contract usage statements follow a selected cadence based on this date. */
            fun billingAnchorDate(billingAnchorDate: OffsetDateTime) =
                billingAnchorDate(JsonField.of(billingAnchorDate))

            /** Contract usage statements follow a selected cadence based on this date. */
            @JsonProperty("billing_anchor_date")
            @ExcludeMissing
            fun billingAnchorDate(billingAnchorDate: JsonField<OffsetDateTime>) = apply {
                this.billingAnchorDate = billingAnchorDate
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): UsageStatementSchedule =
                UsageStatementSchedule(
                    frequency,
                    billingAnchorDate,
                    additionalProperties.toImmutable(),
                )
        }

        class Frequency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Frequency && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val MONTHLY = Frequency(JsonField.of("MONTHLY"))

                @JvmField val QUARTERLY = Frequency(JsonField.of("QUARTERLY"))

                @JvmField val ANNUAL = Frequency(JsonField.of("ANNUAL"))

                @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
            }

            enum class Known {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
            }

            enum class Value {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageStatementSchedule && this.frequency == other.frequency && this.billingAnchorDate == other.billingAnchorDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(frequency, billingAnchorDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "UsageStatementSchedule{frequency=$frequency, billingAnchorDate=$billingAnchorDate, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ResellerRoyalty.Builder::class)
    @NoAutoDetect
    class ResellerRoyalty
    private constructor(
        private val resellerType: JsonField<ResellerType>,
        private val fraction: JsonField<Double>,
        private val applicableProductTags: JsonField<List<String>>,
        private val applicableProductIds: JsonField<List<String>>,
        private val netsuiteResellerId: JsonField<String>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val resellerContractValue: JsonField<Double>,
        private val awsAccountNumber: JsonField<String>,
        private val awsPayerReferenceId: JsonField<String>,
        private val awsOfferId: JsonField<String>,
        private val gcpAccountId: JsonField<String>,
        private val gcpOfferId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        fun fraction(): Double = fraction.getRequired("fraction")

        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        fun netsuiteResellerId(): String = netsuiteResellerId.getRequired("netsuite_reseller_id")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun resellerContractValue(): Optional<Double> =
            Optional.ofNullable(resellerContractValue.getNullable("reseller_contract_value"))

        fun awsAccountNumber(): Optional<String> =
            Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

        fun awsPayerReferenceId(): Optional<String> =
            Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

        fun awsOfferId(): Optional<String> =
            Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

        fun gcpAccountId(): Optional<String> =
            Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

        fun gcpOfferId(): Optional<String> =
            Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

        @JsonProperty("reseller_type") @ExcludeMissing fun _resellerType() = resellerType

        @JsonProperty("fraction") @ExcludeMissing fun _fraction() = fraction

        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags() = applicableProductTags

        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds() = applicableProductIds

        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        fun _netsuiteResellerId() = netsuiteResellerId

        @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonProperty("reseller_contract_value")
        @ExcludeMissing
        fun _resellerContractValue() = resellerContractValue

        @JsonProperty("aws_account_number")
        @ExcludeMissing
        fun _awsAccountNumber() = awsAccountNumber

        @JsonProperty("aws_payer_reference_id")
        @ExcludeMissing
        fun _awsPayerReferenceId() = awsPayerReferenceId

        @JsonProperty("aws_offer_id") @ExcludeMissing fun _awsOfferId() = awsOfferId

        @JsonProperty("gcp_account_id") @ExcludeMissing fun _gcpAccountId() = gcpAccountId

        @JsonProperty("gcp_offer_id") @ExcludeMissing fun _gcpOfferId() = gcpOfferId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ResellerRoyalty = apply {
            if (!validated) {
                resellerType()
                fraction()
                applicableProductTags()
                applicableProductIds()
                netsuiteResellerId()
                startingAt()
                endingBefore()
                resellerContractValue()
                awsAccountNumber()
                awsPayerReferenceId()
                awsOfferId()
                gcpAccountId()
                gcpOfferId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var resellerType: JsonField<ResellerType> = JsonMissing.of()
            private var fraction: JsonField<Double> = JsonMissing.of()
            private var applicableProductTags: JsonField<List<String>> = JsonMissing.of()
            private var applicableProductIds: JsonField<List<String>> = JsonMissing.of()
            private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var resellerContractValue: JsonField<Double> = JsonMissing.of()
            private var awsAccountNumber: JsonField<String> = JsonMissing.of()
            private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
            private var awsOfferId: JsonField<String> = JsonMissing.of()
            private var gcpAccountId: JsonField<String> = JsonMissing.of()
            private var gcpOfferId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                this.resellerType = resellerRoyalty.resellerType
                this.fraction = resellerRoyalty.fraction
                this.applicableProductTags = resellerRoyalty.applicableProductTags
                this.applicableProductIds = resellerRoyalty.applicableProductIds
                this.netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                this.startingAt = resellerRoyalty.startingAt
                this.endingBefore = resellerRoyalty.endingBefore
                this.resellerContractValue = resellerRoyalty.resellerContractValue
                this.awsAccountNumber = resellerRoyalty.awsAccountNumber
                this.awsPayerReferenceId = resellerRoyalty.awsPayerReferenceId
                this.awsOfferId = resellerRoyalty.awsOfferId
                this.gcpAccountId = resellerRoyalty.gcpAccountId
                this.gcpOfferId = resellerRoyalty.gcpOfferId
                additionalProperties(resellerRoyalty.additionalProperties)
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            @JsonProperty("reseller_type")
            @ExcludeMissing
            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

            @JsonProperty("fraction")
            @ExcludeMissing
            fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            fun netsuiteResellerId(netsuiteResellerId: String) =
                netsuiteResellerId(JsonField.of(netsuiteResellerId))

            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun resellerContractValue(resellerContractValue: Double) =
                resellerContractValue(JsonField.of(resellerContractValue))

            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            fun resellerContractValue(resellerContractValue: JsonField<Double>) = apply {
                this.resellerContractValue = resellerContractValue
            }

            fun awsAccountNumber(awsAccountNumber: String) =
                awsAccountNumber(JsonField.of(awsAccountNumber))

            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                this.awsAccountNumber = awsAccountNumber
            }

            fun awsPayerReferenceId(awsPayerReferenceId: String) =
                awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                this.awsPayerReferenceId = awsPayerReferenceId
            }

            fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            fun awsOfferId(awsOfferId: JsonField<String>) = apply { this.awsOfferId = awsOfferId }

            fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                this.gcpAccountId = gcpAccountId
            }

            fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun gcpOfferId(gcpOfferId: JsonField<String>) = apply { this.gcpOfferId = gcpOfferId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    resellerType,
                    fraction,
                    applicableProductTags.map { it.toImmutable() },
                    applicableProductIds.map { it.toImmutable() },
                    netsuiteResellerId,
                    startingAt,
                    endingBefore,
                    resellerContractValue,
                    awsAccountNumber,
                    awsPayerReferenceId,
                    awsOfferId,
                    gcpAccountId,
                    gcpOfferId,
                    additionalProperties.toImmutable(),
                )
        }

        class ResellerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS = ResellerType(JsonField.of("AWS"))

                @JvmField val AWS_PRO_SERVICE = ResellerType(JsonField.of("AWS_PRO_SERVICE"))

                @JvmField val GCP = ResellerType(JsonField.of("GCP"))

                @JvmField val GCP_PRO_SERVICE = ResellerType(JsonField.of("GCP_PRO_SERVICE"))

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResellerRoyalty && this.resellerType == other.resellerType && this.fraction == other.fraction && this.applicableProductTags == other.applicableProductTags && this.applicableProductIds == other.applicableProductIds && this.netsuiteResellerId == other.netsuiteResellerId && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.resellerContractValue == other.resellerContractValue && this.awsAccountNumber == other.awsAccountNumber && this.awsPayerReferenceId == other.awsPayerReferenceId && this.awsOfferId == other.awsOfferId && this.gcpAccountId == other.gcpAccountId && this.gcpOfferId == other.gcpOfferId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(resellerType, fraction, applicableProductTags, applicableProductIds, netsuiteResellerId, startingAt, endingBefore, resellerContractValue, awsAccountNumber, awsPayerReferenceId, awsOfferId, gcpAccountId, gcpOfferId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, fraction=$fraction, applicableProductTags=$applicableProductTags, applicableProductIds=$applicableProductIds, netsuiteResellerId=$netsuiteResellerId, startingAt=$startingAt, endingBefore=$endingBefore, resellerContractValue=$resellerContractValue, awsAccountNumber=$awsAccountNumber, awsPayerReferenceId=$awsPayerReferenceId, awsOfferId=$awsOfferId, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = UsageFilter.Builder::class)
    @NoAutoDetect
    class UsageFilter
    private constructor(
        private val initial: JsonField<BaseUsageFilter>,
        private val current: JsonField<BaseUsageFilter>,
        private val updates: JsonField<List<Update>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun initial(): BaseUsageFilter = initial.getRequired("initial")

        fun current(): Optional<BaseUsageFilter> =
            Optional.ofNullable(current.getNullable("current"))

        fun updates(): List<Update> = updates.getRequired("updates")

        @JsonProperty("initial") @ExcludeMissing fun _initial() = initial

        @JsonProperty("current") @ExcludeMissing fun _current() = current

        @JsonProperty("updates") @ExcludeMissing fun _updates() = updates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UsageFilter = apply {
            if (!validated) {
                initial().validate()
                current().map { it.validate() }
                updates().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var initial: JsonField<BaseUsageFilter> = JsonMissing.of()
            private var current: JsonField<BaseUsageFilter> = JsonMissing.of()
            private var updates: JsonField<List<Update>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageFilter: UsageFilter) = apply {
                this.initial = usageFilter.initial
                this.current = usageFilter.current
                this.updates = usageFilter.updates
                additionalProperties(usageFilter.additionalProperties)
            }

            fun initial(initial: BaseUsageFilter) = initial(JsonField.of(initial))

            @JsonProperty("initial")
            @ExcludeMissing
            fun initial(initial: JsonField<BaseUsageFilter>) = apply { this.initial = initial }

            fun current(current: BaseUsageFilter) = current(JsonField.of(current))

            @JsonProperty("current")
            @ExcludeMissing
            fun current(current: JsonField<BaseUsageFilter>) = apply { this.current = current }

            fun updates(updates: List<Update>) = updates(JsonField.of(updates))

            @JsonProperty("updates")
            @ExcludeMissing
            fun updates(updates: JsonField<List<Update>>) = apply { this.updates = updates }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): UsageFilter =
                UsageFilter(
                    initial,
                    current,
                    updates.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Update.Builder::class)
        @NoAutoDetect
        class Update
        private constructor(
            private val groupKey: JsonField<String>,
            private val groupValues: JsonField<List<String>>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun groupKey(): String = groupKey.getRequired("group_key")

            fun groupValues(): List<String> = groupValues.getRequired("group_values")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("group_key") @ExcludeMissing fun _groupKey() = groupKey

            @JsonProperty("group_values") @ExcludeMissing fun _groupValues() = groupValues

            @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Update = apply {
                if (!validated) {
                    groupKey()
                    groupValues()
                    startingAt()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var groupKey: JsonField<String> = JsonMissing.of()
                private var groupValues: JsonField<List<String>> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(update: Update) = apply {
                    this.groupKey = update.groupKey
                    this.groupValues = update.groupValues
                    this.startingAt = update.startingAt
                    additionalProperties(update.additionalProperties)
                }

                fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

                @JsonProperty("group_key")
                @ExcludeMissing
                fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

                fun groupValues(groupValues: List<String>) = groupValues(JsonField.of(groupValues))

                @JsonProperty("group_values")
                @ExcludeMissing
                fun groupValues(groupValues: JsonField<List<String>>) = apply {
                    this.groupValues = groupValues
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                @JsonProperty("starting_at")
                @ExcludeMissing
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Update =
                    Update(
                        groupKey,
                        groupValues.map { it.toImmutable() },
                        startingAt,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Update && this.groupKey == other.groupKey && this.groupValues == other.groupValues && this.startingAt == other.startingAt && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(groupKey, groupValues, startingAt, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Update{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageFilter && this.initial == other.initial && this.current == other.current && this.updates == other.updates && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(initial, current, updates, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "UsageFilter{initial=$initial, current=$current, updates=$updates, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractWithoutAmendments && this.name == other.name && this.salesforceOpportunityId == other.salesforceOpportunityId && this.rateCardId == other.rateCardId && this.startingAt == other.startingAt && this.commits == other.commits && this.credits == other.credits && this.overrides == other.overrides && this.discounts == other.discounts && this.professionalServices == other.professionalServices && this.scheduledCharges == other.scheduledCharges && this.transitions == other.transitions && this.resellerRoyalties == other.resellerRoyalties && this.createdAt == other.createdAt && this.createdBy == other.createdBy && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.netPaymentTermsDays == other.netPaymentTermsDays && this.endingBefore == other.endingBefore && this.totalContractValue == other.totalContractValue && this.usageFilter == other.usageFilter && this.usageStatementSchedule == other.usageStatementSchedule && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(name, salesforceOpportunityId, rateCardId, startingAt, commits, credits, overrides, discounts, professionalServices, scheduledCharges, transitions, resellerRoyalties, createdAt, createdBy, netsuiteSalesOrderId, netPaymentTermsDays, endingBefore, totalContractValue, usageFilter, usageStatementSchedule, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ContractWithoutAmendments{name=$name, salesforceOpportunityId=$salesforceOpportunityId, rateCardId=$rateCardId, startingAt=$startingAt, commits=$commits, credits=$credits, overrides=$overrides, discounts=$discounts, professionalServices=$professionalServices, scheduledCharges=$scheduledCharges, transitions=$transitions, resellerRoyalties=$resellerRoyalties, createdAt=$createdAt, createdBy=$createdBy, netsuiteSalesOrderId=$netsuiteSalesOrderId, netPaymentTermsDays=$netPaymentTermsDays, endingBefore=$endingBefore, totalContractValue=$totalContractValue, usageFilter=$usageFilter, usageStatementSchedule=$usageStatementSchedule, additionalProperties=$additionalProperties}"
}
