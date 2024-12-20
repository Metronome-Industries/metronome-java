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
class PlanListCustomersResponse
@JsonCreator
private constructor(
    @JsonProperty("customer_details")
    @ExcludeMissing
    private val customerDetails: JsonField<CustomerDetail> = JsonMissing.of(),
    @JsonProperty("plan_details")
    @ExcludeMissing
    private val planDetails: JsonField<PlanDetails> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun customerDetails(): CustomerDetail = customerDetails.getRequired("customer_details")

    fun planDetails(): PlanDetails = planDetails.getRequired("plan_details")

    @JsonProperty("customer_details") @ExcludeMissing fun _customerDetails() = customerDetails

    @JsonProperty("plan_details") @ExcludeMissing fun _planDetails() = planDetails

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
            customerDetails = planListCustomersResponse.customerDetails
            planDetails = planListCustomersResponse.planDetails
            additionalProperties = planListCustomersResponse.additionalProperties.toMutableMap()
        }

        fun customerDetails(customerDetails: CustomerDetail) =
            customerDetails(JsonField.of(customerDetails))

        fun customerDetails(customerDetails: JsonField<CustomerDetail>) = apply {
            this.customerDetails = customerDetails
        }

        fun planDetails(planDetails: PlanDetails) = planDetails(JsonField.of(planDetails))

        fun planDetails(planDetails: JsonField<PlanDetails>) = apply {
            this.planDetails = planDetails
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

        fun build(): PlanListCustomersResponse =
            PlanListCustomersResponse(
                customerDetails,
                planDetails,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class PlanDetails
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_on")
        @ExcludeMissing
        private val startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_plan_id")
        @ExcludeMissing
        private val customerPlanId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                id = planDetails.id
                name = planDetails.name
                startingOn = planDetails.startingOn
                endingBefore = planDetails.endingBefore
                customFields = planDetails.customFields
                customerPlanId = planDetails.customerPlanId
                additionalProperties = planDetails.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The start date of the plan */
            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /** The start date of the plan */
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
            }

            /** The end date of the plan */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** The end date of the plan */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun customerPlanId(customerPlanId: String) =
                customerPlanId(JsonField.of(customerPlanId))

            fun customerPlanId(customerPlanId: JsonField<String>) = apply {
                this.customerPlanId = customerPlanId
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

            fun build(): PlanDetails =
                PlanDetails(
                    id,
                    name,
                    startingOn,
                    endingBefore,
                    customFields,
                    customerPlanId,
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

            return /* spotless:off */ other is PlanDetails && id == other.id && name == other.name && startingOn == other.startingOn && endingBefore == other.endingBefore && customFields == other.customFields && customerPlanId == other.customerPlanId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, startingOn, endingBefore, customFields, customerPlanId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanDetails{id=$id, name=$name, startingOn=$startingOn, endingBefore=$endingBefore, customFields=$customFields, customerPlanId=$customerPlanId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListCustomersResponse && customerDetails == other.customerDetails && planDetails == other.planDetails && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(customerDetails, planDetails, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListCustomersResponse{customerDetails=$customerDetails, planDetails=$planDetails, additionalProperties=$additionalProperties}"
}
