// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class V1CustomerPlanListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("plan_description")
    @ExcludeMissing
    private val planDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_id")
    @ExcludeMissing
    private val planId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_name")
    @ExcludeMissing
    private val planName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("starting_on")
    @ExcludeMissing
    private val startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    private val netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("trial_info")
    @ExcludeMissing
    private val trialInfo: JsonField<TrialInfo> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** the ID of the customer plan */
    fun id(): String = id.getRequired("id")

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    fun planDescription(): String = planDescription.getRequired("plan_description")

    /** the ID of the plan */
    fun planId(): String = planId.getRequired("plan_id")

    fun planName(): String = planName.getRequired("plan_name")

    fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun netPaymentTermsDays(): Optional<Double> =
        Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

    fun trialInfo(): Optional<TrialInfo> = Optional.ofNullable(trialInfo.getNullable("trial_info"))

    /** the ID of the customer plan */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("plan_description")
    @ExcludeMissing
    fun _planDescription(): JsonField<String> = planDescription

    /** the ID of the plan */
    @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

    @JsonProperty("plan_name") @ExcludeMissing fun _planName(): JsonField<String> = planName

    @JsonProperty("starting_on")
    @ExcludeMissing
    fun _startingOn(): JsonField<OffsetDateTime> = startingOn

    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo(): JsonField<TrialInfo> = trialInfo

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): V1CustomerPlanListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        customFields().validate()
        planDescription()
        planId()
        planName()
        startingOn()
        endingBefore()
        netPaymentTermsDays()
        trialInfo().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerPlanListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var planDescription: JsonField<String>? = null
        private var planId: JsonField<String>? = null
        private var planName: JsonField<String>? = null
        private var startingOn: JsonField<OffsetDateTime>? = null
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var trialInfo: JsonField<TrialInfo> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1CustomerPlanListResponse: V1CustomerPlanListResponse) = apply {
            id = v1CustomerPlanListResponse.id
            customFields = v1CustomerPlanListResponse.customFields
            planDescription = v1CustomerPlanListResponse.planDescription
            planId = v1CustomerPlanListResponse.planId
            planName = v1CustomerPlanListResponse.planName
            startingOn = v1CustomerPlanListResponse.startingOn
            endingBefore = v1CustomerPlanListResponse.endingBefore
            netPaymentTermsDays = v1CustomerPlanListResponse.netPaymentTermsDays
            trialInfo = v1CustomerPlanListResponse.trialInfo
            additionalProperties = v1CustomerPlanListResponse.additionalProperties.toMutableMap()
        }

        /** the ID of the customer plan */
        fun id(id: String) = id(JsonField.of(id))

        /** the ID of the customer plan */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun planDescription(planDescription: String) =
            planDescription(JsonField.of(planDescription))

        fun planDescription(planDescription: JsonField<String>) = apply {
            this.planDescription = planDescription
        }

        /** the ID of the plan */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /** the ID of the plan */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            this.startingOn = startingOn
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

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

        fun build(): V1CustomerPlanListResponse =
            V1CustomerPlanListResponse(
                checkRequired("id", id),
                checkRequired("customFields", customFields),
                checkRequired("planDescription", planDescription),
                checkRequired("planId", planId),
                checkRequired("planName", planName),
                checkRequired("startingOn", startingOn),
                endingBefore,
                netPaymentTermsDays,
                trialInfo,
                additionalProperties.toImmutable(),
            )
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

    @NoAutoDetect
    class TrialInfo
    @JsonCreator
    private constructor(
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("spending_caps")
        @ExcludeMissing
        private val spendingCaps: JsonField<List<SpendingCap>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

        fun spendingCaps(): List<SpendingCap> = spendingCaps.getRequired("spending_caps")

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("spending_caps")
        @ExcludeMissing
        fun _spendingCaps(): JsonField<List<SpendingCap>> = spendingCaps

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialInfo = apply {
            if (validated) {
                return@apply
            }

            endingBefore()
            spendingCaps().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrialInfo]. */
        class Builder internal constructor() {

            private var endingBefore: JsonField<OffsetDateTime>? = null
            private var spendingCaps: JsonField<MutableList<SpendingCap>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialInfo: TrialInfo) = apply {
                endingBefore = trialInfo.endingBefore
                spendingCaps = trialInfo.spendingCaps.map { it.toMutableList() }
                additionalProperties = trialInfo.additionalProperties.toMutableMap()
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun spendingCaps(spendingCaps: List<SpendingCap>) =
                spendingCaps(JsonField.of(spendingCaps))

            fun spendingCaps(spendingCaps: JsonField<List<SpendingCap>>) = apply {
                this.spendingCaps = spendingCaps.map { it.toMutableList() }
            }

            fun addSpendingCap(spendingCap: SpendingCap) = apply {
                spendingCaps =
                    (spendingCaps ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(spendingCap)
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

            fun build(): TrialInfo =
                TrialInfo(
                    checkRequired("endingBefore", endingBefore),
                    checkRequired("spendingCaps", spendingCaps).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class SpendingCap
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("amount_remaining")
            @ExcludeMissing
            private val amountRemaining: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("credit_type")
            @ExcludeMissing
            private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun amountRemaining(): Double = amountRemaining.getRequired("amount_remaining")

            fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("amount_remaining")
            @ExcludeMissing
            fun _amountRemaining(): JsonField<Double> = amountRemaining

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun _creditType(): JsonField<CreditTypeData> = creditType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SpendingCap = apply {
                if (validated) {
                    return@apply
                }

                amount()
                amountRemaining()
                creditType().validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SpendingCap]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var amountRemaining: JsonField<Double>? = null
                private var creditType: JsonField<CreditTypeData>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spendingCap: SpendingCap) = apply {
                    amount = spendingCap.amount
                    amountRemaining = spendingCap.amountRemaining
                    creditType = spendingCap.creditType
                    additionalProperties = spendingCap.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun amountRemaining(amountRemaining: Double) =
                    amountRemaining(JsonField.of(amountRemaining))

                fun amountRemaining(amountRemaining: JsonField<Double>) = apply {
                    this.amountRemaining = amountRemaining
                }

                fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

                fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                    this.creditType = creditType
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

                fun build(): SpendingCap =
                    SpendingCap(
                        checkRequired("amount", amount),
                        checkRequired("amountRemaining", amountRemaining),
                        checkRequired("creditType", creditType),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SpendingCap && amount == other.amount && amountRemaining == other.amountRemaining && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, amountRemaining, creditType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpendingCap{amount=$amount, amountRemaining=$amountRemaining, creditType=$creditType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialInfo && endingBefore == other.endingBefore && spendingCaps == other.spendingCaps && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endingBefore, spendingCaps, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialInfo{endingBefore=$endingBefore, spendingCaps=$spendingCaps, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerPlanListResponse && id == other.id && customFields == other.customFields && planDescription == other.planDescription && planId == other.planId && planName == other.planName && startingOn == other.startingOn && endingBefore == other.endingBefore && netPaymentTermsDays == other.netPaymentTermsDays && trialInfo == other.trialInfo && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, customFields, planDescription, planId, planName, startingOn, endingBefore, netPaymentTermsDays, trialInfo, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1CustomerPlanListResponse{id=$id, customFields=$customFields, planDescription=$planDescription, planId=$planId, planName=$planName, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, trialInfo=$trialInfo, additionalProperties=$additionalProperties}"
}
