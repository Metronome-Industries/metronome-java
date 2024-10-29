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
import com.metronome.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PlanListCustomersResponse.Builder::class)
@NoAutoDetect
class PlanListCustomersResponse
private constructor(
    private val customerDetails: JsonField<CustomerDetail>,
    private val planDetails: JsonField<PlanDetails>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun customerDetails(): CustomerDetail = customerDetails.getRequired("customer_details")

    fun planDetails(): PlanDetails = planDetails.getRequired("plan_details")

    @JsonProperty("customer_details") @ExcludeMissing fun _customerDetails() = customerDetails

    @JsonProperty("plan_details") @ExcludeMissing fun _planDetails() = planDetails

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PlanListCustomersResponse = apply {
        if (!validated) {
            customerDetails().validate()
            planDetails().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var customerDetails: JsonField<CustomerDetail> = JsonMissing.of()
        private var planDetails: JsonField<PlanDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListCustomersResponse: PlanListCustomersResponse) = apply {
            this.customerDetails = planListCustomersResponse.customerDetails
            this.planDetails = planListCustomersResponse.planDetails
            additionalProperties(planListCustomersResponse.additionalProperties)
        }

        fun customerDetails(customerDetails: CustomerDetail) =
            customerDetails(JsonField.of(customerDetails))

        @JsonProperty("customer_details")
        @ExcludeMissing
        fun customerDetails(customerDetails: JsonField<CustomerDetail>) = apply {
            this.customerDetails = customerDetails
        }

        fun planDetails(planDetails: PlanDetails) = planDetails(JsonField.of(planDetails))

        @JsonProperty("plan_details")
        @ExcludeMissing
        fun planDetails(planDetails: JsonField<PlanDetails>) = apply {
            this.planDetails = planDetails
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

        fun build(): PlanListCustomersResponse =
            PlanListCustomersResponse(
                customerDetails,
                planDetails,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = PlanDetails.Builder::class)
    @NoAutoDetect
    class PlanDetails
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val startingOn: JsonField<OffsetDateTime>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val customFields: JsonField<CustomFields>,
        private val customerPlanId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        /** The start date of the plan */
        fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

        /** The end date of the plan */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun customFields(): CustomFields = customFields.getRequired("custom_fields")

        fun customerPlanId(): String = customerPlanId.getRequired("customer_plan_id")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The start date of the plan */
        @JsonProperty("starting_on") @ExcludeMissing fun _startingOn() = startingOn

        /** The end date of the plan */
        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        @JsonProperty("customer_plan_id") @ExcludeMissing fun _customerPlanId() = customerPlanId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PlanDetails = apply {
            if (!validated) {
                id()
                name()
                startingOn()
                endingBefore()
                customFields().validate()
                customerPlanId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var customerPlanId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planDetails: PlanDetails) = apply {
                this.id = planDetails.id
                this.name = planDetails.name
                this.startingOn = planDetails.startingOn
                this.endingBefore = planDetails.endingBefore
                this.customFields = planDetails.customFields
                this.customerPlanId = planDetails.customerPlanId
                additionalProperties(planDetails.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The start date of the plan */
            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /** The start date of the plan */
            @JsonProperty("starting_on")
            @ExcludeMissing
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
            }

            /** The end date of the plan */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** The end date of the plan */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun customerPlanId(customerPlanId: String) =
                customerPlanId(JsonField.of(customerPlanId))

            @JsonProperty("customer_plan_id")
            @ExcludeMissing
            fun customerPlanId(customerPlanId: JsonField<String>) = apply {
                this.customerPlanId = customerPlanId
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

            fun build(): PlanDetails =
                PlanDetails(
                    id,
                    name,
                    startingOn,
                    endingBefore,
                    customFields,
                    customerPlanId,
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlanDetails && this.id == other.id && this.name == other.name && this.startingOn == other.startingOn && this.endingBefore == other.endingBefore && this.customFields == other.customFields && this.customerPlanId == other.customerPlanId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, name, startingOn, endingBefore, customFields, customerPlanId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PlanDetails{id=$id, name=$name, startingOn=$startingOn, endingBefore=$endingBefore, customFields=$customFields, customerPlanId=$customerPlanId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListCustomersResponse && this.customerDetails == other.customerDetails && this.planDetails == other.planDetails && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(customerDetails, planDetails, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PlanListCustomersResponse{customerDetails=$customerDetails, planDetails=$planDetails, additionalProperties=$additionalProperties}"
}
