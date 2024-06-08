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
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PlanListCustomersResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListCustomersResponse &&
            this.data == other.data &&
            this.nextPage == other.nextPage &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextPage,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PlanListCustomersResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListCustomersResponse: PlanListCustomersResponse) = apply {
            this.data = planListCustomersResponse.data
            this.nextPage = planListCustomersResponse.nextPage
            additionalProperties(planListCustomersResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        @JsonProperty("next_page")
        @ExcludeMissing
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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
                data.map { it.toUnmodifiable() },
                nextPage,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val customerDetails: JsonField<CustomerDetail>,
        private val planDetails: JsonField<PlanDetails>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun customerDetails(): CustomerDetail = customerDetails.getRequired("customer_details")

        fun planDetails(): PlanDetails = planDetails.getRequired("plan_details")

        @JsonProperty("customer_details") @ExcludeMissing fun _customerDetails() = customerDetails

        @JsonProperty("plan_details") @ExcludeMissing fun _planDetails() = planDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                customerDetails().validate()
                planDetails().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.customerDetails == other.customerDetails &&
                this.planDetails == other.planDetails &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        customerDetails,
                        planDetails,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{customerDetails=$customerDetails, planDetails=$planDetails, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerDetails: JsonField<CustomerDetail> = JsonMissing.of()
            private var planDetails: JsonField<PlanDetails> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.customerDetails = data.customerDetails
                this.planDetails = data.planDetails
                additionalProperties(data.additionalProperties)
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

            fun build(): Data =
                Data(
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlanDetails &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.startingOn == other.startingOn &&
                    this.endingBefore == other.endingBefore &&
                    this.customFields == other.customFields &&
                    this.customerPlanId == other.customerPlanId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            startingOn,
                            endingBefore,
                            customFields,
                            customerPlanId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "PlanDetails{id=$id, name=$name, startingOn=$startingOn, endingBefore=$endingBefore, customFields=$customFields, customerPlanId=$customerPlanId, additionalProperties=$additionalProperties}"

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

                fun customFields(customFields: CustomFields) =
                    customFields(JsonField.of(customFields))

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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
    }
}
