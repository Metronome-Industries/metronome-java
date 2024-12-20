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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CustomerPlanListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_id")
    @ExcludeMissing
    private val planId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_name")
    @ExcludeMissing
    private val planName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_description")
    @ExcludeMissing
    private val planDescription: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** the ID of the customer plan */
    fun id(): String = id.getRequired("id")

    /** the ID of the plan */
    fun planId(): String = planId.getRequired("plan_id")

    fun planName(): String = planName.getRequired("plan_name")

    fun planDescription(): String = planDescription.getRequired("plan_description")

    fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun netPaymentTermsDays(): Optional<Double> =
        Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

    fun trialInfo(): Optional<TrialInfo> = Optional.ofNullable(trialInfo.getNullable("trial_info"))

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    /** the ID of the customer plan */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** the ID of the plan */
    @JsonProperty("plan_id") @ExcludeMissing fun _planId() = planId

    @JsonProperty("plan_name") @ExcludeMissing fun _planName() = planName

    @JsonProperty("plan_description") @ExcludeMissing fun _planDescription() = planDescription

    @JsonProperty("starting_on") @ExcludeMissing fun _startingOn() = startingOn

    @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays() = netPaymentTermsDays

    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo() = trialInfo

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerPlanListResponse = apply {
        if (!validated) {
            id()
            planId()
            planName()
            planDescription()
            startingOn()
            endingBefore()
            netPaymentTermsDays()
            trialInfo().map { it.validate() }
            customFields().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planName: JsonField<String> = JsonMissing.of()
        private var planDescription: JsonField<String> = JsonMissing.of()
        private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var trialInfo: JsonField<TrialInfo> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerPlanListResponse: CustomerPlanListResponse) = apply {
            id = customerPlanListResponse.id
            planId = customerPlanListResponse.planId
            planName = customerPlanListResponse.planName
            planDescription = customerPlanListResponse.planDescription
            startingOn = customerPlanListResponse.startingOn
            endingBefore = customerPlanListResponse.endingBefore
            netPaymentTermsDays = customerPlanListResponse.netPaymentTermsDays
            trialInfo = customerPlanListResponse.trialInfo
            customFields = customerPlanListResponse.customFields
            additionalProperties = customerPlanListResponse.additionalProperties.toMutableMap()
        }

        /** the ID of the customer plan */
        fun id(id: String) = id(JsonField.of(id))

        /** the ID of the customer plan */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** the ID of the plan */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /** the ID of the plan */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        fun planDescription(planDescription: String) =
            planDescription(JsonField.of(planDescription))

        fun planDescription(planDescription: JsonField<String>) = apply {
            this.planDescription = planDescription
        }

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

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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

        fun build(): CustomerPlanListResponse =
            CustomerPlanListResponse(
                id,
                planId,
                planName,
                planDescription,
                startingOn,
                endingBefore,
                netPaymentTermsDays,
                trialInfo,
                customFields,
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
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonProperty("spending_caps") @ExcludeMissing fun _spendingCaps() = spendingCaps

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialInfo = apply {
            if (!validated) {
                endingBefore()
                spendingCaps().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var spendingCaps: JsonField<List<SpendingCap>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialInfo: TrialInfo) = apply {
                endingBefore = trialInfo.endingBefore
                spendingCaps = trialInfo.spendingCaps
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
                this.spendingCaps = spendingCaps
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
                    endingBefore,
                    spendingCaps.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class SpendingCap
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type")
            @ExcludeMissing
            private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("amount_remaining")
            @ExcludeMissing
            private val amountRemaining: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

            fun amount(): Double = amount.getRequired("amount")

            fun amountRemaining(): Double = amountRemaining.getRequired("amount_remaining")

            @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("amount_remaining")
            @ExcludeMissing
            fun _amountRemaining() = amountRemaining

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SpendingCap = apply {
                if (!validated) {
                    creditType().validate()
                    amount()
                    amountRemaining()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var amountRemaining: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spendingCap: SpendingCap) = apply {
                    creditType = spendingCap.creditType
                    amount = spendingCap.amount
                    amountRemaining = spendingCap.amountRemaining
                    additionalProperties = spendingCap.additionalProperties.toMutableMap()
                }

                fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

                fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                    this.creditType = creditType
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun amountRemaining(amountRemaining: Double) =
                    amountRemaining(JsonField.of(amountRemaining))

                fun amountRemaining(amountRemaining: JsonField<Double>) = apply {
                    this.amountRemaining = amountRemaining
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
                        creditType,
                        amount,
                        amountRemaining,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SpendingCap && creditType == other.creditType && amount == other.amount && amountRemaining == other.amountRemaining && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditType, amount, amountRemaining, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpendingCap{creditType=$creditType, amount=$amount, amountRemaining=$amountRemaining, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is CustomerPlanListResponse && id == other.id && planId == other.planId && planName == other.planName && planDescription == other.planDescription && startingOn == other.startingOn && endingBefore == other.endingBefore && netPaymentTermsDays == other.netPaymentTermsDays && trialInfo == other.trialInfo && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, planId, planName, planDescription, startingOn, endingBefore, netPaymentTermsDays, trialInfo, customFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerPlanListResponse{id=$id, planId=$planId, planName=$planName, planDescription=$planDescription, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, trialInfo=$trialInfo, customFields=$customFields, additionalProperties=$additionalProperties}"
}
