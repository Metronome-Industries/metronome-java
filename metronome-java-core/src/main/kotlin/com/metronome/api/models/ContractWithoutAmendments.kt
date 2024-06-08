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
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.toUnmodifiable
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
    private val professionalServices: JsonField<List<ProfessionalService>>,
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

    private var hashCode: Int = 0

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
    fun professionalServices(): Optional<List<ProfessionalService>> =
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractWithoutAmendments &&
            this.name == other.name &&
            this.salesforceOpportunityId == other.salesforceOpportunityId &&
            this.rateCardId == other.rateCardId &&
            this.startingAt == other.startingAt &&
            this.commits == other.commits &&
            this.credits == other.credits &&
            this.overrides == other.overrides &&
            this.discounts == other.discounts &&
            this.professionalServices == other.professionalServices &&
            this.scheduledCharges == other.scheduledCharges &&
            this.transitions == other.transitions &&
            this.resellerRoyalties == other.resellerRoyalties &&
            this.createdAt == other.createdAt &&
            this.createdBy == other.createdBy &&
            this.netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
            this.netPaymentTermsDays == other.netPaymentTermsDays &&
            this.endingBefore == other.endingBefore &&
            this.totalContractValue == other.totalContractValue &&
            this.usageFilter == other.usageFilter &&
            this.usageStatementSchedule == other.usageStatementSchedule &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    salesforceOpportunityId,
                    rateCardId,
                    startingAt,
                    commits,
                    credits,
                    overrides,
                    discounts,
                    professionalServices,
                    scheduledCharges,
                    transitions,
                    resellerRoyalties,
                    createdAt,
                    createdBy,
                    netsuiteSalesOrderId,
                    netPaymentTermsDays,
                    endingBefore,
                    totalContractValue,
                    usageFilter,
                    usageStatementSchedule,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ContractWithoutAmendments{name=$name, salesforceOpportunityId=$salesforceOpportunityId, rateCardId=$rateCardId, startingAt=$startingAt, commits=$commits, credits=$credits, overrides=$overrides, discounts=$discounts, professionalServices=$professionalServices, scheduledCharges=$scheduledCharges, transitions=$transitions, resellerRoyalties=$resellerRoyalties, createdAt=$createdAt, createdBy=$createdBy, netsuiteSalesOrderId=$netsuiteSalesOrderId, netPaymentTermsDays=$netPaymentTermsDays, endingBefore=$endingBefore, totalContractValue=$totalContractValue, usageFilter=$usageFilter, usageStatementSchedule=$usageStatementSchedule, additionalProperties=$additionalProperties}"

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
        private var professionalServices: JsonField<List<ProfessionalService>> = JsonMissing.of()
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
        fun professionalServices(professionalServices: List<ProfessionalService>) =
            professionalServices(JsonField.of(professionalServices))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        @ExcludeMissing
        fun professionalServices(professionalServices: JsonField<List<ProfessionalService>>) =
            apply {
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

        fun totalContractValue(totalContractValue: Double) =
            totalContractValue(JsonField.of(totalContractValue))

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
                commits.map { it.toUnmodifiable() },
                credits.map { it.toUnmodifiable() },
                overrides.map { it.toUnmodifiable() },
                discounts.map { it.toUnmodifiable() },
                professionalServices.map { it.toUnmodifiable() },
                scheduledCharges.map { it.toUnmodifiable() },
                transitions.map { it.toUnmodifiable() },
                resellerRoyalties.map { it.toUnmodifiable() },
                createdAt,
                createdBy,
                netsuiteSalesOrderId,
                netPaymentTermsDays,
                endingBefore,
                totalContractValue,
                usageFilter,
                usageStatementSchedule,
                additionalProperties.toUnmodifiable(),
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transition &&
                this.type == other.type &&
                this.fromContractId == other.fromContractId &&
                this.toContractId == other.toContractId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        fromContractId,
                        toContractId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Transition{type=$type, fromContractId=$fromContractId, toContractId=$toContractId, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
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

                return other is Type && this.value == other.value
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
    }

    @JsonDeserialize(builder = UsageStatementSchedule.Builder::class)
    @NoAutoDetect
    class UsageStatementSchedule
    private constructor(
        private val frequency: JsonField<Frequency>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun frequency(): Frequency = frequency.getRequired("frequency")

        @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UsageStatementSchedule = apply {
            if (!validated) {
                frequency()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageStatementSchedule &&
                this.frequency == other.frequency &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(frequency, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "UsageStatementSchedule{frequency=$frequency, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var frequency: JsonField<Frequency> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageStatementSchedule: UsageStatementSchedule) = apply {
                this.frequency = usageStatementSchedule.frequency
                additionalProperties(usageStatementSchedule.additionalProperties)
            }

            fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

            @JsonProperty("frequency")
            @ExcludeMissing
            fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

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
                UsageStatementSchedule(frequency, additionalProperties.toUnmodifiable())
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

                return other is Frequency && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val MONTHLY = Frequency(JsonField.of("MONTHLY"))

                @JvmField val MONTHLY = Frequency(JsonField.of("monthly"))

                @JvmField val QUARTERLY = Frequency(JsonField.of("QUARTERLY"))

                @JvmField val QUARTERLY = Frequency(JsonField.of("quarterly"))

                @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
            }

            enum class Known {
                MONTHLY,
                MONTHLY,
                QUARTERLY,
                QUARTERLY,
            }

            enum class Value {
                MONTHLY,
                MONTHLY,
                QUARTERLY,
                QUARTERLY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    QUARTERLY -> Value.QUARTERLY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    QUARTERLY -> Known.QUARTERLY
                    else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = Credit.Builder::class)
    @NoAutoDetect
    class Credit
    private constructor(
        private val id: JsonField<String>,
        private val contract: JsonField<Contract>,
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val priority: JsonField<Double>,
        private val product: JsonField<Product>,
        private val accessSchedule: JsonField<AccessSchedule>,
        private val description: JsonField<String>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val applicableContractIds: JsonField<List<String>>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val salesforceOpportunityId: JsonField<String>,
        private val ledger: JsonField<List<Ledger>>,
        private val customFields: JsonField<CustomFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

        fun type(): Type = type.getRequired("type")

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun product(): Product = product.getRequired("product")

        /** The schedule that the customer will gain access to the credits. */
        fun accessSchedule(): Optional<AccessSchedule> =
            Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun applicableContractIds(): Optional<List<String>> =
            Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun ledger(): Optional<List<Ledger>> = Optional.ofNullable(ledger.getNullable("ledger"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("contract") @ExcludeMissing fun _contract() = contract

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

        @JsonProperty("product") @ExcludeMissing fun _product() = product

        /** The schedule that the customer will gain access to the credits. */
        @JsonProperty("access_schedule") @ExcludeMissing fun _accessSchedule() = accessSchedule

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds() = applicableProductIds

        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags() = applicableProductTags

        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        fun _applicableContractIds() = applicableContractIds

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId() = salesforceOpportunityId

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        @JsonProperty("ledger") @ExcludeMissing fun _ledger() = ledger

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Credit = apply {
            if (!validated) {
                id()
                contract().map { it.validate() }
                type()
                name()
                priority()
                product().validate()
                accessSchedule().map { it.validate() }
                description()
                applicableProductIds()
                applicableProductTags()
                applicableContractIds()
                netsuiteSalesOrderId()
                salesforceOpportunityId()
                ledger()
                customFields().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Credit &&
                this.id == other.id &&
                this.contract == other.contract &&
                this.type == other.type &&
                this.name == other.name &&
                this.priority == other.priority &&
                this.product == other.product &&
                this.accessSchedule == other.accessSchedule &&
                this.description == other.description &&
                this.applicableProductIds == other.applicableProductIds &&
                this.applicableProductTags == other.applicableProductTags &&
                this.applicableContractIds == other.applicableContractIds &&
                this.netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                this.salesforceOpportunityId == other.salesforceOpportunityId &&
                this.ledger == other.ledger &&
                this.customFields == other.customFields &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        contract,
                        type,
                        name,
                        priority,
                        product,
                        accessSchedule,
                        description,
                        applicableProductIds,
                        applicableProductTags,
                        applicableContractIds,
                        netsuiteSalesOrderId,
                        salesforceOpportunityId,
                        ledger,
                        customFields,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Credit{id=$id, contract=$contract, type=$type, name=$name, priority=$priority, product=$product, accessSchedule=$accessSchedule, description=$description, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, applicableContractIds=$applicableContractIds, netsuiteSalesOrderId=$netsuiteSalesOrderId, salesforceOpportunityId=$salesforceOpportunityId, ledger=$ledger, customFields=$customFields, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var contract: JsonField<Contract> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var product: JsonField<Product> = JsonMissing.of()
            private var accessSchedule: JsonField<AccessSchedule> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var applicableProductIds: JsonField<List<String>> = JsonMissing.of()
            private var applicableProductTags: JsonField<List<String>> = JsonMissing.of()
            private var applicableContractIds: JsonField<List<String>> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var ledger: JsonField<List<Ledger>> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credit: Credit) = apply {
                this.id = credit.id
                this.contract = credit.contract
                this.type = credit.type
                this.name = credit.name
                this.priority = credit.priority
                this.product = credit.product
                this.accessSchedule = credit.accessSchedule
                this.description = credit.description
                this.applicableProductIds = credit.applicableProductIds
                this.applicableProductTags = credit.applicableProductTags
                this.applicableContractIds = credit.applicableContractIds
                this.netsuiteSalesOrderId = credit.netsuiteSalesOrderId
                this.salesforceOpportunityId = credit.salesforceOpportunityId
                this.ledger = credit.ledger
                this.customFields = credit.customFields
                additionalProperties(credit.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun contract(contract: Contract) = contract(JsonField.of(contract))

            @JsonProperty("contract")
            @ExcludeMissing
            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            @JsonProperty("priority")
            @ExcludeMissing
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun product(product: Product) = product(JsonField.of(product))

            @JsonProperty("product")
            @ExcludeMissing
            fun product(product: JsonField<Product>) = apply { this.product = product }

            /** The schedule that the customer will gain access to the credits. */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /** The schedule that the customer will gain access to the credits. */
            @JsonProperty("access_schedule")
            @ExcludeMissing
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            fun applicableContractIds(applicableContractIds: List<String>) =
                applicableContractIds(JsonField.of(applicableContractIds))

            @JsonProperty("applicable_contract_ids")
            @ExcludeMissing
            fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
                this.applicableContractIds = applicableContractIds
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            fun ledger(ledger: List<Ledger>) = ledger(JsonField.of(ledger))

            /**
             * A list of ordered events that impact the balance of a credit. For example, an invoice
             * deduction or an expiration.
             */
            @JsonProperty("ledger")
            @ExcludeMissing
            fun ledger(ledger: JsonField<List<Ledger>>) = apply { this.ledger = ledger }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
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

            fun build(): Credit =
                Credit(
                    id,
                    contract,
                    type,
                    name,
                    priority,
                    product,
                    accessSchedule,
                    description,
                    applicableProductIds.map { it.toUnmodifiable() },
                    applicableProductTags.map { it.toUnmodifiable() },
                    applicableContractIds.map { it.toUnmodifiable() },
                    netsuiteSalesOrderId,
                    salesforceOpportunityId,
                    ledger.map { it.toUnmodifiable() },
                    customFields,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Product.Builder::class)
        @NoAutoDetect
        class Product
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Product = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Product &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(product: Product) = apply {
                    this.id = product.id
                    this.name = product.name
                    additionalProperties(product.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Product =
                    Product(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CREDIT = Type(JsonField.of("CREDIT"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CREDIT,
            }

            enum class Value {
                CREDIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CREDIT -> Value.CREDIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CREDIT -> Known.CREDIT
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** The schedule that the customer will gain access to the credits. */
        @JsonDeserialize(builder = AccessSchedule.Builder::class)
        @NoAutoDetect
        class AccessSchedule
        private constructor(
            private val creditType: JsonField<CreditType>,
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun creditType(): Optional<CreditType> =
                Optional.ofNullable(creditType.getNullable("credit_type"))

            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

            @JsonProperty("schedule_items") @ExcludeMissing fun _scheduleItems() = scheduleItems

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AccessSchedule = apply {
                if (!validated) {
                    creditType().map { it.validate() }
                    scheduleItems().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessSchedule &&
                    this.creditType == other.creditType &&
                    this.scheduleItems == other.scheduleItems &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            creditType,
                            scheduleItems,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AccessSchedule{creditType=$creditType, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditType: JsonField<CreditType> = JsonMissing.of()
                private var scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    this.creditType = accessSchedule.creditType
                    this.scheduleItems = accessSchedule.scheduleItems
                    additionalProperties(accessSchedule.additionalProperties)
                }

                fun creditType(creditType: CreditType) = creditType(JsonField.of(creditType))

                @JsonProperty("credit_type")
                @ExcludeMissing
                fun creditType(creditType: JsonField<CreditType>) = apply {
                    this.creditType = creditType
                }

                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                @JsonProperty("schedule_items")
                @ExcludeMissing
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems
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

                fun build(): AccessSchedule =
                    AccessSchedule(
                        creditType,
                        scheduleItems.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = ScheduleItem.Builder::class)
            @NoAutoDetect
            class ScheduleItem
            private constructor(
                private val id: JsonField<String>,
                private val amount: JsonField<Double>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun id(): String = id.getRequired("id")

                fun amount(): Double = amount.getRequired("amount")

                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

                @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ScheduleItem = apply {
                    if (!validated) {
                        id()
                        amount()
                        startingAt()
                        endingBefore()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        this.id == other.id &&
                        this.amount == other.amount &&
                        this.startingAt == other.startingAt &&
                        this.endingBefore == other.endingBefore &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                id,
                                amount,
                                startingAt,
                                endingBefore,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "ScheduleItem{id=$id, amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        this.id = scheduleItem.id
                        this.amount = scheduleItem.amount
                        this.startingAt = scheduleItem.startingAt
                        this.endingBefore = scheduleItem.endingBefore
                        additionalProperties(scheduleItem.additionalProperties)
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

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

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            id,
                            amount,
                            startingAt,
                            endingBefore,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = CreditType.Builder::class)
            @NoAutoDetect
            class CreditType
            private constructor(
                private val name: JsonField<String>,
                private val id: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun name(): String = name.getRequired("name")

                fun id(): String = id.getRequired("id")

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditType = apply {
                    if (!validated) {
                        name()
                        id()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditType &&
                        this.name == other.name &&
                        this.id == other.id &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                name,
                                id,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditType{name=$name, id=$id, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditType: CreditType) = apply {
                        this.name = creditType.name
                        this.id = creditType.id
                        additionalProperties(creditType.additionalProperties)
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

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

                    fun build(): CreditType =
                        CreditType(
                            name,
                            id,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        @JsonDeserialize(builder = Contract.Builder::class)
        @NoAutoDetect
        class Contract
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Contract = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contract &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(id, additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contract: Contract) = apply {
                    this.id = contract.id
                    additionalProperties(contract.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Contract = Contract(id, additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties(customFields.additionalProperties)
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

                fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
            }
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
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

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

            fun isCreditSegmentStartLedgerEntry(): Boolean = creditSegmentStartLedgerEntry != null

            fun isCreditAutomatedInvoiceDeductionLedgerEntry(): Boolean =
                creditAutomatedInvoiceDeductionLedgerEntry != null

            fun isCreditExpirationLedgerEntry(): Boolean = creditExpirationLedgerEntry != null

            fun isCreditCanceledLedgerEntry(): Boolean = creditCanceledLedgerEntry != null

            fun isCreditCreditedLedgerEntry(): Boolean = creditCreditedLedgerEntry != null

            fun isCreditManualLedgerEntry(): Boolean = creditManualLedgerEntry != null

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
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Ledger = apply {
                if (!validated) {
                    if (
                        creditSegmentStartLedgerEntry == null &&
                            creditAutomatedInvoiceDeductionLedgerEntry == null &&
                            creditExpirationLedgerEntry == null &&
                            creditCanceledLedgerEntry == null &&
                            creditCreditedLedgerEntry == null &&
                            creditManualLedgerEntry == null
                    ) {
                        throw MetronomeInvalidDataException("Unknown Ledger: $_json")
                    }
                    creditSegmentStartLedgerEntry?.validate()
                    creditAutomatedInvoiceDeductionLedgerEntry?.validate()
                    creditExpirationLedgerEntry?.validate()
                    creditCanceledLedgerEntry?.validate()
                    creditCreditedLedgerEntry?.validate()
                    creditManualLedgerEntry?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Ledger &&
                    this.creditSegmentStartLedgerEntry == other.creditSegmentStartLedgerEntry &&
                    this.creditAutomatedInvoiceDeductionLedgerEntry ==
                        other.creditAutomatedInvoiceDeductionLedgerEntry &&
                    this.creditExpirationLedgerEntry == other.creditExpirationLedgerEntry &&
                    this.creditCanceledLedgerEntry == other.creditCanceledLedgerEntry &&
                    this.creditCreditedLedgerEntry == other.creditCreditedLedgerEntry &&
                    this.creditManualLedgerEntry == other.creditManualLedgerEntry
            }

            override fun hashCode(): Int {
                return Objects.hash(
                    creditSegmentStartLedgerEntry,
                    creditAutomatedInvoiceDeductionLedgerEntry,
                    creditExpirationLedgerEntry,
                    creditCanceledLedgerEntry,
                    creditCreditedLedgerEntry,
                    creditManualLedgerEntry,
                )
            }

            override fun toString(): String {
                return when {
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
                    _json != null -> "Ledger{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Ledger")
                }
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
            }

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

                fun unknown(json: JsonValue?): T {
                    throw MetronomeInvalidDataException("Unknown Ledger: $json")
                }
            }

            class Deserializer : BaseDeserializer<Ledger>(Ledger::class) {

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
                            jacksonTypeRef<CreditAutomatedInvoiceDeductionLedgerEntry>()
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return Ledger(
                                creditAutomatedInvoiceDeductionLedgerEntry = it,
                                _json = json
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

                    return Ledger(_json = json)
                }
            }

            class Serializer : BaseSerializer<Ledger>(Ledger::class) {

                override fun serialize(
                    value: Ledger,
                    generator: JsonGenerator,
                    provider: SerializerProvider
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
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Ledger")
                    }
                }
            }

            @JsonDeserialize(builder = CreditSegmentStartLedgerEntry.Builder::class)
            @NoAutoDetect
            class CreditSegmentStartLedgerEntry
            private constructor(
                private val type: JsonField<Type>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val segmentId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditSegmentStartLedgerEntry = apply {
                    if (!validated) {
                        type()
                        timestamp()
                        amount()
                        segmentId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditSegmentStartLedgerEntry &&
                        this.type == other.type &&
                        this.timestamp == other.timestamp &&
                        this.amount == other.amount &&
                        this.segmentId == other.segmentId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                timestamp,
                                amount,
                                segmentId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditSegmentStartLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var segmentId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
                    ) = apply {
                        this.type = creditSegmentStartLedgerEntry.type
                        this.timestamp = creditSegmentStartLedgerEntry.timestamp
                        this.amount = creditSegmentStartLedgerEntry.amount
                        this.segmentId = creditSegmentStartLedgerEntry.segmentId
                        additionalProperties(creditSegmentStartLedgerEntry.additionalProperties)
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    @JsonProperty("segment_id")
                    @ExcludeMissing
                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
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

                    fun build(): CreditSegmentStartLedgerEntry =
                        CreditSegmentStartLedgerEntry(
                            type,
                            timestamp,
                            amount,
                            segmentId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField
                        val CREDIT_SEGMENT_START = Type(JsonField.of("CREDIT_SEGMENT_START"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CREDIT_SEGMENT_START,
                    }

                    enum class Value {
                        CREDIT_SEGMENT_START,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CREDIT_SEGMENT_START -> Value.CREDIT_SEGMENT_START
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CREDIT_SEGMENT_START -> Known.CREDIT_SEGMENT_START
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = CreditAutomatedInvoiceDeductionLedgerEntry.Builder::class)
            @NoAutoDetect
            class CreditAutomatedInvoiceDeductionLedgerEntry
            private constructor(
                private val type: JsonField<Type>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val segmentId: JsonField<String>,
                private val invoiceId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

                @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditAutomatedInvoiceDeductionLedgerEntry = apply {
                    if (!validated) {
                        type()
                        timestamp()
                        amount()
                        segmentId()
                        invoiceId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditAutomatedInvoiceDeductionLedgerEntry &&
                        this.type == other.type &&
                        this.timestamp == other.timestamp &&
                        this.amount == other.amount &&
                        this.segmentId == other.segmentId &&
                        this.invoiceId == other.invoiceId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                timestamp,
                                amount,
                                segmentId,
                                invoiceId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditAutomatedInvoiceDeductionLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var segmentId: JsonField<String> = JsonMissing.of()
                    private var invoiceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        creditAutomatedInvoiceDeductionLedgerEntry:
                            CreditAutomatedInvoiceDeductionLedgerEntry
                    ) = apply {
                        this.type = creditAutomatedInvoiceDeductionLedgerEntry.type
                        this.timestamp = creditAutomatedInvoiceDeductionLedgerEntry.timestamp
                        this.amount = creditAutomatedInvoiceDeductionLedgerEntry.amount
                        this.segmentId = creditAutomatedInvoiceDeductionLedgerEntry.segmentId
                        this.invoiceId = creditAutomatedInvoiceDeductionLedgerEntry.invoiceId
                        additionalProperties(
                            creditAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                        )
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    @JsonProperty("segment_id")
                    @ExcludeMissing
                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    @JsonProperty("invoice_id")
                    @ExcludeMissing
                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
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

                    fun build(): CreditAutomatedInvoiceDeductionLedgerEntry =
                        CreditAutomatedInvoiceDeductionLedgerEntry(
                            type,
                            timestamp,
                            amount,
                            segmentId,
                            invoiceId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField
                        val CREDIT_AUTOMATED_INVOICE_DEDUCTION =
                            Type(JsonField.of("CREDIT_AUTOMATED_INVOICE_DEDUCTION"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION,
                    }

                    enum class Value {
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Value.CREDIT_AUTOMATED_INVOICE_DEDUCTION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                                Known.CREDIT_AUTOMATED_INVOICE_DEDUCTION
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = CreditExpirationLedgerEntry.Builder::class)
            @NoAutoDetect
            class CreditExpirationLedgerEntry
            private constructor(
                private val type: JsonField<Type>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val segmentId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditExpirationLedgerEntry = apply {
                    if (!validated) {
                        type()
                        timestamp()
                        amount()
                        segmentId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditExpirationLedgerEntry &&
                        this.type == other.type &&
                        this.timestamp == other.timestamp &&
                        this.amount == other.amount &&
                        this.segmentId == other.segmentId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                timestamp,
                                amount,
                                segmentId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditExpirationLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var segmentId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditExpirationLedgerEntry: CreditExpirationLedgerEntry) =
                        apply {
                            this.type = creditExpirationLedgerEntry.type
                            this.timestamp = creditExpirationLedgerEntry.timestamp
                            this.amount = creditExpirationLedgerEntry.amount
                            this.segmentId = creditExpirationLedgerEntry.segmentId
                            additionalProperties(creditExpirationLedgerEntry.additionalProperties)
                        }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    @JsonProperty("segment_id")
                    @ExcludeMissing
                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
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

                    fun build(): CreditExpirationLedgerEntry =
                        CreditExpirationLedgerEntry(
                            type,
                            timestamp,
                            amount,
                            segmentId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val CREDIT_EXPIRATION = Type(JsonField.of("CREDIT_EXPIRATION"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CREDIT_EXPIRATION,
                    }

                    enum class Value {
                        CREDIT_EXPIRATION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CREDIT_EXPIRATION -> Value.CREDIT_EXPIRATION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CREDIT_EXPIRATION -> Known.CREDIT_EXPIRATION
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = CreditCanceledLedgerEntry.Builder::class)
            @NoAutoDetect
            class CreditCanceledLedgerEntry
            private constructor(
                private val type: JsonField<Type>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val segmentId: JsonField<String>,
                private val invoiceId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

                @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditCanceledLedgerEntry = apply {
                    if (!validated) {
                        type()
                        timestamp()
                        amount()
                        segmentId()
                        invoiceId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditCanceledLedgerEntry &&
                        this.type == other.type &&
                        this.timestamp == other.timestamp &&
                        this.amount == other.amount &&
                        this.segmentId == other.segmentId &&
                        this.invoiceId == other.invoiceId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                timestamp,
                                amount,
                                segmentId,
                                invoiceId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditCanceledLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var segmentId: JsonField<String> = JsonMissing.of()
                    private var invoiceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditCanceledLedgerEntry: CreditCanceledLedgerEntry) =
                        apply {
                            this.type = creditCanceledLedgerEntry.type
                            this.timestamp = creditCanceledLedgerEntry.timestamp
                            this.amount = creditCanceledLedgerEntry.amount
                            this.segmentId = creditCanceledLedgerEntry.segmentId
                            this.invoiceId = creditCanceledLedgerEntry.invoiceId
                            additionalProperties(creditCanceledLedgerEntry.additionalProperties)
                        }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    @JsonProperty("segment_id")
                    @ExcludeMissing
                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    @JsonProperty("invoice_id")
                    @ExcludeMissing
                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
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

                    fun build(): CreditCanceledLedgerEntry =
                        CreditCanceledLedgerEntry(
                            type,
                            timestamp,
                            amount,
                            segmentId,
                            invoiceId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val CREDIT_CANCELED = Type(JsonField.of("CREDIT_CANCELED"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CREDIT_CANCELED,
                    }

                    enum class Value {
                        CREDIT_CANCELED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CREDIT_CANCELED -> Value.CREDIT_CANCELED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CREDIT_CANCELED -> Known.CREDIT_CANCELED
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = CreditCreditedLedgerEntry.Builder::class)
            @NoAutoDetect
            class CreditCreditedLedgerEntry
            private constructor(
                private val type: JsonField<Type>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val segmentId: JsonField<String>,
                private val invoiceId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun amount(): Double = amount.getRequired("amount")

                fun segmentId(): String = segmentId.getRequired("segment_id")

                fun invoiceId(): String = invoiceId.getRequired("invoice_id")

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

                @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditCreditedLedgerEntry = apply {
                    if (!validated) {
                        type()
                        timestamp()
                        amount()
                        segmentId()
                        invoiceId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditCreditedLedgerEntry &&
                        this.type == other.type &&
                        this.timestamp == other.timestamp &&
                        this.amount == other.amount &&
                        this.segmentId == other.segmentId &&
                        this.invoiceId == other.invoiceId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                timestamp,
                                amount,
                                segmentId,
                                invoiceId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditCreditedLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var segmentId: JsonField<String> = JsonMissing.of()
                    private var invoiceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditCreditedLedgerEntry: CreditCreditedLedgerEntry) =
                        apply {
                            this.type = creditCreditedLedgerEntry.type
                            this.timestamp = creditCreditedLedgerEntry.timestamp
                            this.amount = creditCreditedLedgerEntry.amount
                            this.segmentId = creditCreditedLedgerEntry.segmentId
                            this.invoiceId = creditCreditedLedgerEntry.invoiceId
                            additionalProperties(creditCreditedLedgerEntry.additionalProperties)
                        }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                    @JsonProperty("segment_id")
                    @ExcludeMissing
                    fun segmentId(segmentId: JsonField<String>) = apply {
                        this.segmentId = segmentId
                    }

                    fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                    @JsonProperty("invoice_id")
                    @ExcludeMissing
                    fun invoiceId(invoiceId: JsonField<String>) = apply {
                        this.invoiceId = invoiceId
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

                    fun build(): CreditCreditedLedgerEntry =
                        CreditCreditedLedgerEntry(
                            type,
                            timestamp,
                            amount,
                            segmentId,
                            invoiceId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val CREDIT_CREDITED = Type(JsonField.of("CREDIT_CREDITED"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CREDIT_CREDITED,
                    }

                    enum class Value {
                        CREDIT_CREDITED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CREDIT_CREDITED -> Value.CREDIT_CREDITED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CREDIT_CREDITED -> Known.CREDIT_CREDITED
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = CreditManualLedgerEntry.Builder::class)
            @NoAutoDetect
            class CreditManualLedgerEntry
            private constructor(
                private val type: JsonField<Type>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val reason: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                fun amount(): Double = amount.getRequired("amount")

                fun reason(): String = reason.getRequired("reason")

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CreditManualLedgerEntry = apply {
                    if (!validated) {
                        type()
                        timestamp()
                        amount()
                        reason()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditManualLedgerEntry &&
                        this.type == other.type &&
                        this.timestamp == other.timestamp &&
                        this.amount == other.amount &&
                        this.reason == other.reason &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                timestamp,
                                amount,
                                reason,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CreditManualLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, reason=$reason, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditManualLedgerEntry: CreditManualLedgerEntry) = apply {
                        this.type = creditManualLedgerEntry.type
                        this.timestamp = creditManualLedgerEntry.timestamp
                        this.amount = creditManualLedgerEntry.amount
                        this.reason = creditManualLedgerEntry.reason
                        additionalProperties(creditManualLedgerEntry.additionalProperties)
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    fun reason(reason: String) = reason(JsonField.of(reason))

                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

                    fun build(): CreditManualLedgerEntry =
                        CreditManualLedgerEntry(
                            type,
                            timestamp,
                            amount,
                            reason,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val CREDIT_MANUAL = Type(JsonField.of("CREDIT_MANUAL"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CREDIT_MANUAL,
                    }

                    enum class Value {
                        CREDIT_MANUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CREDIT_MANUAL -> Value.CREDIT_MANUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CREDIT_MANUAL -> Known.CREDIT_MANUAL
                            else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }
    }

    @JsonDeserialize(builder = ProfessionalService.Builder::class)
    @NoAutoDetect
    class ProfessionalService
    private constructor(
        private val id: JsonField<String>,
        private val description: JsonField<String>,
        private val productId: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val unitPrice: JsonField<Double>,
        private val quantity: JsonField<Double>,
        private val maxAmount: JsonField<Double>,
        private val customFields: JsonField<CustomFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun productId(): String = productId.getRequired("product_id")

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        fun unitPrice(): Double = unitPrice.getRequired("unit_price")

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        fun quantity(): Double = quantity.getRequired("quantity")

        /** Maximum amount for the term. */
        fun maxAmount(): Double = maxAmount.getRequired("max_amount")

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice() = unitPrice

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** Maximum amount for the term. */
        @JsonProperty("max_amount") @ExcludeMissing fun _maxAmount() = maxAmount

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ProfessionalService = apply {
            if (!validated) {
                id()
                description()
                productId()
                netsuiteSalesOrderId()
                unitPrice()
                quantity()
                maxAmount()
                customFields().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProfessionalService &&
                this.id == other.id &&
                this.description == other.description &&
                this.productId == other.productId &&
                this.netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                this.unitPrice == other.unitPrice &&
                this.quantity == other.quantity &&
                this.maxAmount == other.maxAmount &&
                this.customFields == other.customFields &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        description,
                        productId,
                        netsuiteSalesOrderId,
                        unitPrice,
                        quantity,
                        maxAmount,
                        customFields,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ProfessionalService{id=$id, description=$description, productId=$productId, netsuiteSalesOrderId=$netsuiteSalesOrderId, unitPrice=$unitPrice, quantity=$quantity, maxAmount=$maxAmount, customFields=$customFields, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var maxAmount: JsonField<Double> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(professionalService: ProfessionalService) = apply {
                this.id = professionalService.id
                this.description = professionalService.description
                this.productId = professionalService.productId
                this.netsuiteSalesOrderId = professionalService.netsuiteSalesOrderId
                this.unitPrice = professionalService.unitPrice
                this.quantity = professionalService.quantity
                this.maxAmount = professionalService.maxAmount
                this.customFields = professionalService.customFields
                additionalProperties(professionalService.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            @JsonProperty("product_id")
            @ExcludeMissing
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Maximum amount for the term. */
            fun maxAmount(maxAmount: Double) = maxAmount(JsonField.of(maxAmount))

            /** Maximum amount for the term. */
            @JsonProperty("max_amount")
            @ExcludeMissing
            fun maxAmount(maxAmount: JsonField<Double>) = apply { this.maxAmount = maxAmount }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
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

            fun build(): ProfessionalService =
                ProfessionalService(
                    id,
                    description,
                    productId,
                    netsuiteSalesOrderId,
                    unitPrice,
                    quantity,
                    maxAmount,
                    customFields,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties(customFields.additionalProperties)
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

                fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
            }
        }
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResellerRoyalty &&
                this.resellerType == other.resellerType &&
                this.fraction == other.fraction &&
                this.applicableProductTags == other.applicableProductTags &&
                this.applicableProductIds == other.applicableProductIds &&
                this.netsuiteResellerId == other.netsuiteResellerId &&
                this.startingAt == other.startingAt &&
                this.endingBefore == other.endingBefore &&
                this.resellerContractValue == other.resellerContractValue &&
                this.awsAccountNumber == other.awsAccountNumber &&
                this.awsPayerReferenceId == other.awsPayerReferenceId &&
                this.awsOfferId == other.awsOfferId &&
                this.gcpAccountId == other.gcpAccountId &&
                this.gcpOfferId == other.gcpOfferId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        resellerType,
                        fraction,
                        applicableProductTags,
                        applicableProductIds,
                        netsuiteResellerId,
                        startingAt,
                        endingBefore,
                        resellerContractValue,
                        awsAccountNumber,
                        awsPayerReferenceId,
                        awsOfferId,
                        gcpAccountId,
                        gcpOfferId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, fraction=$fraction, applicableProductTags=$applicableProductTags, applicableProductIds=$applicableProductIds, netsuiteResellerId=$netsuiteResellerId, startingAt=$startingAt, endingBefore=$endingBefore, resellerContractValue=$resellerContractValue, awsAccountNumber=$awsAccountNumber, awsPayerReferenceId=$awsPayerReferenceId, awsOfferId=$awsOfferId, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"

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
                    applicableProductTags.map { it.toUnmodifiable() },
                    applicableProductIds.map { it.toUnmodifiable() },
                    netsuiteResellerId,
                    startingAt,
                    endingBefore,
                    resellerContractValue,
                    awsAccountNumber,
                    awsPayerReferenceId,
                    awsOfferId,
                    gcpAccountId,
                    gcpOfferId,
                    additionalProperties.toUnmodifiable(),
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

                return other is ResellerType && this.value == other.value
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
    }

    @JsonDeserialize(builder = UsageFilter.Builder::class)
    @NoAutoDetect
    class UsageFilter
    private constructor(
        private val initial: JsonField<Initial>,
        private val current: JsonField<Current>,
        private val updates: JsonField<List<Update>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun initial(): Initial = initial.getRequired("initial")

        fun current(): Optional<Current> = Optional.ofNullable(current.getNullable("current"))

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageFilter &&
                this.initial == other.initial &&
                this.current == other.current &&
                this.updates == other.updates &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        initial,
                        current,
                        updates,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "UsageFilter{initial=$initial, current=$current, updates=$updates, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var initial: JsonField<Initial> = JsonMissing.of()
            private var current: JsonField<Current> = JsonMissing.of()
            private var updates: JsonField<List<Update>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageFilter: UsageFilter) = apply {
                this.initial = usageFilter.initial
                this.current = usageFilter.current
                this.updates = usageFilter.updates
                additionalProperties(usageFilter.additionalProperties)
            }

            fun initial(initial: Initial) = initial(JsonField.of(initial))

            @JsonProperty("initial")
            @ExcludeMissing
            fun initial(initial: JsonField<Initial>) = apply { this.initial = initial }

            fun current(current: Current) = current(JsonField.of(current))

            @JsonProperty("current")
            @ExcludeMissing
            fun current(current: JsonField<Current>) = apply { this.current = current }

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
                    updates.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Current.Builder::class)
        @NoAutoDetect
        class Current
        private constructor(
            private val groupKey: JsonField<String>,
            private val groupValues: JsonField<List<String>>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun groupKey(): String = groupKey.getRequired("group_key")

            fun groupValues(): List<String> = groupValues.getRequired("group_values")

            fun startingAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(startingAt.getNullable("starting_at"))

            @JsonProperty("group_key") @ExcludeMissing fun _groupKey() = groupKey

            @JsonProperty("group_values") @ExcludeMissing fun _groupValues() = groupValues

            @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Current = apply {
                if (!validated) {
                    groupKey()
                    groupValues()
                    startingAt()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Current &&
                    this.groupKey == other.groupKey &&
                    this.groupValues == other.groupValues &&
                    this.startingAt == other.startingAt &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            groupKey,
                            groupValues,
                            startingAt,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Current{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var groupKey: JsonField<String> = JsonMissing.of()
                private var groupValues: JsonField<List<String>> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(current: Current) = apply {
                    this.groupKey = current.groupKey
                    this.groupValues = current.groupValues
                    this.startingAt = current.startingAt
                    additionalProperties(current.additionalProperties)
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

                fun build(): Current =
                    Current(
                        groupKey,
                        groupValues.map { it.toUnmodifiable() },
                        startingAt,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Initial.Builder::class)
        @NoAutoDetect
        class Initial
        private constructor(
            private val groupKey: JsonField<String>,
            private val groupValues: JsonField<List<String>>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun groupKey(): String = groupKey.getRequired("group_key")

            fun groupValues(): List<String> = groupValues.getRequired("group_values")

            fun startingAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(startingAt.getNullable("starting_at"))

            @JsonProperty("group_key") @ExcludeMissing fun _groupKey() = groupKey

            @JsonProperty("group_values") @ExcludeMissing fun _groupValues() = groupValues

            @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Initial = apply {
                if (!validated) {
                    groupKey()
                    groupValues()
                    startingAt()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Initial &&
                    this.groupKey == other.groupKey &&
                    this.groupValues == other.groupValues &&
                    this.startingAt == other.startingAt &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            groupKey,
                            groupValues,
                            startingAt,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Initial{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var groupKey: JsonField<String> = JsonMissing.of()
                private var groupValues: JsonField<List<String>> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(initial: Initial) = apply {
                    this.groupKey = initial.groupKey
                    this.groupValues = initial.groupValues
                    this.startingAt = initial.startingAt
                    additionalProperties(initial.additionalProperties)
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

                fun build(): Initial =
                    Initial(
                        groupKey,
                        groupValues.map { it.toUnmodifiable() },
                        startingAt,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Update &&
                    this.groupKey == other.groupKey &&
                    this.groupValues == other.groupValues &&
                    this.startingAt == other.startingAt &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            groupKey,
                            groupValues,
                            startingAt,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Update{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"

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
                        groupValues.map { it.toUnmodifiable() },
                        startingAt,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
