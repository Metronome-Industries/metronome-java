// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CustomerPlanListResponse.Builder::class)
@NoAutoDetect
class CustomerPlanListResponse
private constructor(
    private val id: JsonField<String>,
    private val planId: JsonField<String>,
    private val planName: JsonField<String>,
    private val planDescription: JsonField<String>,
    private val startingOn: JsonField<OffsetDateTime>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val trialInfo: JsonField<TrialInfo>,
    private val customFields: JsonField<CustomFields>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
            this.id = customerPlanListResponse.id
            this.planId = customerPlanListResponse.planId
            this.planName = customerPlanListResponse.planName
            this.planDescription = customerPlanListResponse.planDescription
            this.startingOn = customerPlanListResponse.startingOn
            this.endingBefore = customerPlanListResponse.endingBefore
            this.netPaymentTermsDays = customerPlanListResponse.netPaymentTermsDays
            this.trialInfo = customerPlanListResponse.trialInfo
            this.customFields = customerPlanListResponse.customFields
            additionalProperties(customerPlanListResponse.additionalProperties)
        }

        /** the ID of the customer plan */
        fun id(id: String) = id(JsonField.of(id))

        /** the ID of the customer plan */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** the ID of the plan */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /** the ID of the plan */
        @JsonProperty("plan_id")
        @ExcludeMissing
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        @JsonProperty("plan_name")
        @ExcludeMissing
        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        fun planDescription(planDescription: String) =
            planDescription(JsonField.of(planDescription))

        @JsonProperty("plan_description")
        @ExcludeMissing
        fun planDescription(planDescription: JsonField<String>) = apply {
            this.planDescription = planDescription
        }

        fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

        @JsonProperty("starting_on")
        @ExcludeMissing
        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            this.startingOn = startingOn
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        @JsonProperty("trial_info")
        @ExcludeMissing
        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

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

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = TrialInfo.Builder::class)
    @NoAutoDetect
    class TrialInfo
    private constructor(
        private val endingBefore: JsonField<OffsetDateTime>,
        private val spendingCaps: JsonField<List<SpendingCap>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

        fun spendingCaps(): List<SpendingCap> = spendingCaps.getRequired("spending_caps")

        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonProperty("spending_caps") @ExcludeMissing fun _spendingCaps() = spendingCaps

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                this.endingBefore = trialInfo.endingBefore
                this.spendingCaps = trialInfo.spendingCaps
                additionalProperties(trialInfo.additionalProperties)
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun spendingCaps(spendingCaps: List<SpendingCap>) =
                spendingCaps(JsonField.of(spendingCaps))

            @JsonProperty("spending_caps")
            @ExcludeMissing
            fun spendingCaps(spendingCaps: JsonField<List<SpendingCap>>) = apply {
                this.spendingCaps = spendingCaps
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

            fun build(): TrialInfo =
                TrialInfo(
                    endingBefore,
                    spendingCaps.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = SpendingCap.Builder::class)
        @NoAutoDetect
        class SpendingCap
        private constructor(
            private val creditType: JsonField<CreditTypeData>,
            private val amount: JsonField<Double>,
            private val amountRemaining: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
                    this.creditType = spendingCap.creditType
                    this.amount = spendingCap.amount
                    this.amountRemaining = spendingCap.amountRemaining
                    additionalProperties(spendingCap.additionalProperties)
                }

                fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

                @JsonProperty("credit_type")
                @ExcludeMissing
                fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                    this.creditType = creditType
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun amountRemaining(amountRemaining: Double) =
                    amountRemaining(JsonField.of(amountRemaining))

                @JsonProperty("amount_remaining")
                @ExcludeMissing
                fun amountRemaining(amountRemaining: JsonField<Double>) = apply {
                    this.amountRemaining = amountRemaining
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

                return /* spotless:off */ other is SpendingCap && this.creditType == other.creditType && this.amount == other.amount && this.amountRemaining == other.amountRemaining && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(creditType, amount, amountRemaining, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "SpendingCap{creditType=$creditType, amount=$amount, amountRemaining=$amountRemaining, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialInfo && this.endingBefore == other.endingBefore && this.spendingCaps == other.spendingCaps && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(endingBefore, spendingCaps, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TrialInfo{endingBefore=$endingBefore, spendingCaps=$spendingCaps, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanListResponse && this.id == other.id && this.planId == other.planId && this.planName == other.planName && this.planDescription == other.planDescription && this.startingOn == other.startingOn && this.endingBefore == other.endingBefore && this.netPaymentTermsDays == other.netPaymentTermsDays && this.trialInfo == other.trialInfo && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, planId, planName, planDescription, startingOn, endingBefore, netPaymentTermsDays, trialInfo, customFields, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CustomerPlanListResponse{id=$id, planId=$planId, planName=$planName, planDescription=$planDescription, startingOn=$startingOn, endingBefore=$endingBefore, netPaymentTermsDays=$netPaymentTermsDays, trialInfo=$trialInfo, customFields=$customFields, additionalProperties=$additionalProperties}"
}
