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

/** Amend a contract */
class ContractAmendParams
private constructor(
    private val body: ContractAmendBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ID of the contract to amend */
    fun contractId(): String = body.contractId()

    /** ID of the customer whose contract is to be amended */
    fun customerId(): String = body.customerId()

    /** inclusive start time for the amendment */
    fun startingAt(): OffsetDateTime = body.startingAt()

    fun commits(): Optional<List<Commit>> = body.commits()

    fun credits(): Optional<List<Credit>> = body.credits()

    fun customFields(): Optional<CustomFields> = body.customFields()

    /** This field's availability is dependent on your client's configuration. */
    fun discounts(): Optional<List<Discount>> = body.discounts()

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> = body.netsuiteSalesOrderId()

    fun overrides(): Optional<List<Override>> = body.overrides()

    /** This field's availability is dependent on your client's configuration. */
    fun professionalServices(): Optional<List<ProfessionalService>> = body.professionalServices()

    /** This field's availability is dependent on your client's configuration. */
    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> = body.resellerRoyalties()

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> = body.salesforceOpportunityId()

    fun scheduledCharges(): Optional<List<ScheduledCharge>> = body.scheduledCharges()

    /** This field's availability is dependent on your client's configuration. */
    fun totalContractValue(): Optional<Double> = body.totalContractValue()

    /** ID of the contract to amend */
    fun _contractId(): JsonField<String> = body._contractId()

    /** ID of the customer whose contract is to be amended */
    fun _customerId(): JsonField<String> = body._customerId()

    /** inclusive start time for the amendment */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    fun _commits(): JsonField<List<Commit>> = body._commits()

    fun _credits(): JsonField<List<Credit>> = body._credits()

    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /** This field's availability is dependent on your client's configuration. */
    fun _discounts(): JsonField<List<Discount>> = body._discounts()

    /** This field's availability is dependent on your client's configuration. */
    fun _netsuiteSalesOrderId(): JsonField<String> = body._netsuiteSalesOrderId()

    fun _overrides(): JsonField<List<Override>> = body._overrides()

    /** This field's availability is dependent on your client's configuration. */
    fun _professionalServices(): JsonField<List<ProfessionalService>> = body._professionalServices()

    /** This field's availability is dependent on your client's configuration. */
    fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = body._resellerRoyalties()

    /** This field's availability is dependent on your client's configuration. */
    fun _salesforceOpportunityId(): JsonField<String> = body._salesforceOpportunityId()

    fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = body._scheduledCharges()

    /** This field's availability is dependent on your client's configuration. */
    fun _totalContractValue(): JsonField<Double> = body._totalContractValue()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ContractAmendBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractAmendBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overrides")
        @ExcludeMissing
        private val overrides: JsonField<List<Override>> = JsonMissing.of(),
        @JsonProperty("professional_services")
        @ExcludeMissing
        private val professionalServices: JsonField<List<ProfessionalService>> = JsonMissing.of(),
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        private val resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        private val scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
        @JsonProperty("total_contract_value")
        @ExcludeMissing
        private val totalContractValue: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the contract to amend */
        fun contractId(): String = contractId.getRequired("contract_id")

        /** ID of the customer whose contract is to be amended */
        fun customerId(): String = customerId.getRequired("customer_id")

        /** inclusive start time for the amendment */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        fun commits(): Optional<List<Commit>> = Optional.ofNullable(commits.getNullable("commits"))

        fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits.getNullable("credits"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(): Optional<List<Discount>> =
            Optional.ofNullable(discounts.getNullable("discounts"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        fun overrides(): Optional<List<Override>> =
            Optional.ofNullable(overrides.getNullable("overrides"))

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(): Optional<List<ProfessionalService>> =
            Optional.ofNullable(professionalServices.getNullable("professional_services"))

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
            Optional.ofNullable(resellerRoyalties.getNullable("reseller_royalties"))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

        fun scheduledCharges(): Optional<List<ScheduledCharge>> =
            Optional.ofNullable(scheduledCharges.getNullable("scheduled_charges"))

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(): Optional<Double> =
            Optional.ofNullable(totalContractValue.getNullable("total_contract_value"))

        /** ID of the contract to amend */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /** ID of the customer whose contract is to be amended */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** inclusive start time for the amendment */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonProperty("overrides")
        @ExcludeMissing
        fun _overrides(): JsonField<List<Override>> = overrides

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        @ExcludeMissing
        fun _professionalServices(): JsonField<List<ProfessionalService>> = professionalServices

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = resellerRoyalties

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("total_contract_value")
        @ExcludeMissing
        fun _totalContractValue(): JsonField<Double> = totalContractValue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractAmendBody = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            startingAt()
            commits().ifPresent { it.forEach { it.validate() } }
            credits().ifPresent { it.forEach { it.validate() } }
            customFields().ifPresent { it.validate() }
            discounts().ifPresent { it.forEach { it.validate() } }
            netsuiteSalesOrderId()
            overrides().ifPresent { it.forEach { it.validate() } }
            professionalServices().ifPresent { it.forEach { it.validate() } }
            resellerRoyalties().ifPresent { it.forEach { it.validate() } }
            salesforceOpportunityId()
            scheduledCharges().ifPresent { it.forEach { it.validate() } }
            totalContractValue()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContractAmendBody]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var commits: JsonField<MutableList<Commit>>? = null
            private var credits: JsonField<MutableList<Credit>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var discounts: JsonField<MutableList<Discount>>? = null
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var overrides: JsonField<MutableList<Override>>? = null
            private var professionalServices: JsonField<MutableList<ProfessionalService>>? = null
            private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
            private var totalContractValue: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractAmendBody: ContractAmendBody) = apply {
                contractId = contractAmendBody.contractId
                customerId = contractAmendBody.customerId
                startingAt = contractAmendBody.startingAt
                commits = contractAmendBody.commits.map { it.toMutableList() }
                credits = contractAmendBody.credits.map { it.toMutableList() }
                customFields = contractAmendBody.customFields
                discounts = contractAmendBody.discounts.map { it.toMutableList() }
                netsuiteSalesOrderId = contractAmendBody.netsuiteSalesOrderId
                overrides = contractAmendBody.overrides.map { it.toMutableList() }
                professionalServices =
                    contractAmendBody.professionalServices.map { it.toMutableList() }
                resellerRoyalties = contractAmendBody.resellerRoyalties.map { it.toMutableList() }
                salesforceOpportunityId = contractAmendBody.salesforceOpportunityId
                scheduledCharges = contractAmendBody.scheduledCharges.map { it.toMutableList() }
                totalContractValue = contractAmendBody.totalContractValue
                additionalProperties = contractAmendBody.additionalProperties.toMutableMap()
            }

            /** ID of the contract to amend */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /** ID of the contract to amend */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** ID of the customer whose contract is to be amended */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose contract is to be amended */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** inclusive start time for the amendment */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** inclusive start time for the amendment */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
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

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

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

            /** This field's availability is dependent on your client's configuration. */
            fun totalContractValue(totalContractValue: Double) =
                totalContractValue(JsonField.of(totalContractValue))

            /** This field's availability is dependent on your client's configuration. */
            fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
                this.totalContractValue = totalContractValue
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

            fun build(): ContractAmendBody =
                ContractAmendBody(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("startingAt", startingAt),
                    (commits ?: JsonMissing.of()).map { it.toImmutable() },
                    (credits ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    netsuiteSalesOrderId,
                    (overrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                    (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                    salesforceOpportunityId,
                    (scheduledCharges ?: JsonMissing.of()).map { it.toImmutable() },
                    totalContractValue,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractAmendBody && contractId == other.contractId && customerId == other.customerId && startingAt == other.startingAt && commits == other.commits && credits == other.credits && customFields == other.customFields && discounts == other.discounts && netsuiteSalesOrderId == other.netsuiteSalesOrderId && overrides == other.overrides && professionalServices == other.professionalServices && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && scheduledCharges == other.scheduledCharges && totalContractValue == other.totalContractValue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, startingAt, commits, credits, customFields, discounts, netsuiteSalesOrderId, overrides, professionalServices, resellerRoyalties, salesforceOpportunityId, scheduledCharges, totalContractValue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractAmendBody{contractId=$contractId, customerId=$customerId, startingAt=$startingAt, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, totalContractValue=$totalContractValue, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractAmendParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ContractAmendBody.Builder = ContractAmendBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractAmendParams: ContractAmendParams) = apply {
            body = contractAmendParams.body.toBuilder()
            additionalHeaders = contractAmendParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractAmendParams.additionalQueryParams.toBuilder()
        }

        /** ID of the contract to amend */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /** ID of the contract to amend */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** ID of the customer whose contract is to be amended */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose contract is to be amended */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** inclusive start time for the amendment */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /** inclusive start time for the amendment */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        fun commits(commits: List<Commit>) = apply { body.commits(commits) }

        fun commits(commits: JsonField<List<Commit>>) = apply { body.commits(commits) }

        fun addCommit(commit: Commit) = apply { body.addCommit(commit) }

        fun credits(credits: List<Credit>) = apply { body.credits(credits) }

        fun credits(credits: JsonField<List<Credit>>) = apply { body.credits(credits) }

        fun addCredit(credit: Credit) = apply { body.addCredit(credit) }

        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: List<Discount>) = apply { body.discounts(discounts) }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: JsonField<List<Discount>>) = apply { body.discounts(discounts) }

        /** This field's availability is dependent on your client's configuration. */
        fun addDiscount(discount: Discount) = apply { body.addDiscount(discount) }

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

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) = apply {
            body.totalContractValue(totalContractValue)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
            body.totalContractValue(totalContractValue)
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

        fun build(): ContractAmendParams =
            ContractAmendParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        private val invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
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
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
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
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

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

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
        fun rolloverFraction(): Optional<Double> =
            Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

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
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

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
            invoiceSchedule().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            priority()
            rateType()
            rolloverFraction()
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
            private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
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
                invoiceSchedule = commit.invoiceSchedule
                name = commit.name
                netsuiteSalesOrderId = commit.netsuiteSalesOrderId
                priority = commit.priority
                rateType = commit.rateType
                rolloverFraction = commit.rolloverFraction
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
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
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
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
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

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /** Used only in UI/API. It is not exposed to end customers. */
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
                    invoiceSchedule,
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    rateType,
                    rolloverFraction,
                    temporaryId,
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

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                    creditTypeId = invoiceSchedule.creditTypeId
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
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                    fun asString(): String = _value().asStringOrThrow()

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
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                return /* spotless:off */ other is InvoiceSchedule && creditTypeId == other.creditTypeId && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceSchedule{creditTypeId=$creditTypeId, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && productId == other.productId && type == other.type && accessSchedule == other.accessSchedule && amount == other.amount && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && rolloverFraction == other.rolloverFraction && temporaryId == other.temporaryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, type, accessSchedule, amount, applicableProductIds, applicableProductTags, customFields, description, invoiceSchedule, name, netsuiteSalesOrderId, priority, rateType, rolloverFraction, temporaryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{productId=$productId, type=$type, accessSchedule=$accessSchedule, amount=$amount, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
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

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** displayed on invoices */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        /** If multiple credits are applicable, the one with the lower priority will apply first. */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

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

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** displayed on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /** If multiple credits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

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
            name()
            netsuiteSalesOrderId()
            priority()
            rateType()
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
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
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
                netsuiteSalesOrderId = credit.netsuiteSalesOrderId
                priority = credit.priority
                rateType = credit.rateType
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

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    rateType,
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

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Credit && accessSchedule == other.accessSchedule && productId == other.productId && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessSchedule, productId, applicableProductIds, applicableProductTags, customFields, description, name, netsuiteSalesOrderId, priority, rateType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credit{accessSchedule=$accessSchedule, productId=$productId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

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
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
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
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                    fun asString(): String = _value().asStringOrThrow()

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
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to the specified commits. If not provided, the
             * override will apply to all commits.
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
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to commits created by the specified recurring
             * commit ids.
             */
            fun recurringCommitIds(): Optional<List<String>> =
                Optional.ofNullable(recurringCommitIds.getNullable("recurring_commit_ids"))

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to credits created by the specified recurring
             * credit ids.
             */
            fun recurringCreditIds(): Optional<List<String>> =
                Optional.ofNullable(recurringCreditIds.getNullable("recurring_credit_ids"))

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to the specified commits. If not provided, the
             * override will apply to all commits.
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
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to commits created by the specified recurring
             * commit ids.
             */
            @JsonProperty("recurring_commit_ids")
            @ExcludeMissing
            fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to credits created by the specified recurring
             * credit ids.
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

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun commitIds(commitIds: JsonField<List<String>>) = apply {
                    this.commitIds = commitIds.map { it.toMutableList() }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to the
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
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to commits
                 * created by the specified recurring commit ids.
                 */
                fun recurringCommitIds(recurringCommitIds: List<String>) =
                    recurringCommitIds(JsonField.of(recurringCommitIds))

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to commits
                 * created by the specified recurring commit ids.
                 */
                fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                    this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to commits
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
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to credits
                 * created by the specified recurring credit ids.
                 */
                fun recurringCreditIds(recurringCreditIds: List<String>) =
                    recurringCreditIds(JsonField.of(recurringCreditIds))

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to credits
                 * created by the specified recurring credit ids.
                 */
                fun recurringCreditIds(recurringCreditIds: JsonField<List<String>>) = apply {
                    this.recurringCreditIds = recurringCreditIds.map { it.toMutableList() }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to credits
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

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             */
            @NoAutoDetect
            class PresentationGroupValues
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

                return /* spotless:off */ other is OverrideSpecifier && commitIds == other.commitIds && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && productTags == other.productTags && recurringCommitIds == other.recurringCommitIds && recurringCreditIds == other.recurringCreditIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(commitIds, presentationGroupValues, pricingGroupValues, productId, productTags, recurringCommitIds, recurringCreditIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverrideSpecifier{commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, recurringCommitIds=$recurringCommitIds, recurringCreditIds=$recurringCreditIds, additionalProperties=$additionalProperties}"
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

            class RateType
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

                    @JvmField val FLAT = of("FLAT")

                    @JvmField val PERCENTAGE = of("PERCENTAGE")

                    @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                    @JvmField val TIERED = of("TIERED")

                    @JvmField val CUSTOM = of("CUSTOM")

                    @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
                }

                /** An enum containing [RateType]'s known values. */
                enum class Known {
                    FLAT,
                    PERCENTAGE,
                    SUBSCRIPTION,
                    TIERED,
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
                        CUSTOM -> Known.CUSTOM
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

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @NoAutoDetect
            class CustomRate
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        class Target
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

            fun asString(): String = _value().asStringOrThrow()

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

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

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

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
    class ResellerRoyalty
    @JsonCreator
    private constructor(
        @JsonProperty("reseller_type")
        @ExcludeMissing
        private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
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
        @JsonProperty("fraction")
        @ExcludeMissing
        private val fraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gcp_options")
        @ExcludeMissing
        private val gcpOptions: JsonField<GcpOptions> = JsonMissing.of(),
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

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun awsOptions(): Optional<AwsOptions> =
            Optional.ofNullable(awsOptions.getNullable("aws_options"))

        /** Use null to indicate that the existing end timestamp should be removed. */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun fraction(): Optional<Double> = Optional.ofNullable(fraction.getNullable("fraction"))

        fun gcpOptions(): Optional<GcpOptions> =
            Optional.ofNullable(gcpOptions.getNullable("gcp_options"))

        fun netsuiteResellerId(): Optional<String> =
            Optional.ofNullable(netsuiteResellerId.getNullable("netsuite_reseller_id"))

        fun resellerContractValue(): Optional<Double> =
            Optional.ofNullable(resellerContractValue.getNullable("reseller_contract_value"))

        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

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

        /** Use null to indicate that the existing end timestamp should be removed. */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<Double> = fraction

        @JsonProperty("gcp_options")
        @ExcludeMissing
        fun _gcpOptions(): JsonField<GcpOptions> = gcpOptions

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
            applicableProductIds()
            applicableProductTags()
            awsOptions().ifPresent { it.validate() }
            endingBefore()
            fraction()
            gcpOptions().ifPresent { it.validate() }
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
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var awsOptions: JsonField<AwsOptions> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var fraction: JsonField<Double> = JsonMissing.of()
            private var gcpOptions: JsonField<GcpOptions> = JsonMissing.of()
            private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
            private var resellerContractValue: JsonField<Double> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                resellerType = resellerRoyalty.resellerType
                applicableProductIds =
                    resellerRoyalty.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    resellerRoyalty.applicableProductTags.map { it.toMutableList() }
                awsOptions = resellerRoyalty.awsOptions
                endingBefore = resellerRoyalty.endingBefore
                fraction = resellerRoyalty.fraction
                gcpOptions = resellerRoyalty.gcpOptions
                netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                resellerContractValue = resellerRoyalty.resellerContractValue
                startingAt = resellerRoyalty.startingAt
                additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
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

            /** Use null to indicate that the existing end timestamp should be removed. */
            fun endingBefore(endingBefore: OffsetDateTime?) =
                endingBefore(JsonField.ofNullable(endingBefore))

            /** Use null to indicate that the existing end timestamp should be removed. */
            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.orElse(null))

            /** Use null to indicate that the existing end timestamp should be removed. */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

            fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

            fun gcpOptions(gcpOptions: GcpOptions) = gcpOptions(JsonField.of(gcpOptions))

            fun gcpOptions(gcpOptions: JsonField<GcpOptions>) = apply {
                this.gcpOptions = gcpOptions
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
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    awsOptions,
                    endingBefore,
                    fraction,
                    gcpOptions,
                    netsuiteResellerId,
                    resellerContractValue,
                    startingAt,
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
                    GcpOptions(
                        gcpAccountId,
                        gcpOfferId,
                        additionalProperties.toImmutable(),
                    )
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

            return /* spotless:off */ other is ResellerRoyalty && resellerType == other.resellerType && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && awsOptions == other.awsOptions && endingBefore == other.endingBefore && fraction == other.fraction && gcpOptions == other.gcpOptions && netsuiteResellerId == other.netsuiteResellerId && resellerContractValue == other.resellerContractValue && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(resellerType, applicableProductIds, applicableProductTags, awsOptions, endingBefore, fraction, gcpOptions, netsuiteResellerId, resellerContractValue, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, awsOptions=$awsOptions, endingBefore=$endingBefore, fraction=$fraction, gcpOptions=$gcpOptions, netsuiteResellerId=$netsuiteResellerId, resellerContractValue=$resellerContractValue, startingAt=$startingAt, additionalProperties=$additionalProperties}"
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

        /** displayed on invoices */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

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
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduledCharge: ScheduledCharge) = apply {
                productId = scheduledCharge.productId
                schedule = scheduledCharge.schedule
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
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
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
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                    fun asString(): String = _value().asStringOrThrow()

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
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduledCharge && productId == other.productId && schedule == other.schedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, schedule, name, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduledCharge{productId=$productId, schedule=$schedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractAmendParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractAmendParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
