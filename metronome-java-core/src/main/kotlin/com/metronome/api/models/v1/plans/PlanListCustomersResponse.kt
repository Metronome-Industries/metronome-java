// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.v1.customers.CustomerDetail
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PlanListCustomersResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerDetails: JsonField<CustomerDetail>,
    private val planDetails: JsonField<PlanDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customer_details")
        @ExcludeMissing
        customerDetails: JsonField<CustomerDetail> = JsonMissing.of(),
        @JsonProperty("plan_details")
        @ExcludeMissing
        planDetails: JsonField<PlanDetails> = JsonMissing.of(),
    ) : this(customerDetails, planDetails, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerDetails(): CustomerDetail = customerDetails.getRequired("customer_details")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planDetails(): PlanDetails = planDetails.getRequired("plan_details")

    /**
     * Returns the raw JSON value of [customerDetails].
     *
     * Unlike [customerDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_details")
    @ExcludeMissing
    fun _customerDetails(): JsonField<CustomerDetail> = customerDetails

    /**
     * Returns the raw JSON value of [planDetails].
     *
     * Unlike [planDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_details")
    @ExcludeMissing
    fun _planDetails(): JsonField<PlanDetails> = planDetails

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListCustomersResponse].
         *
         * The following fields are required:
         * ```java
         * .customerDetails()
         * .planDetails()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanListCustomersResponse]. */
    class Builder internal constructor() {

        private var customerDetails: JsonField<CustomerDetail>? = null
        private var planDetails: JsonField<PlanDetails>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListCustomersResponse: PlanListCustomersResponse) = apply {
            customerDetails = planListCustomersResponse.customerDetails
            planDetails = planListCustomersResponse.planDetails
            additionalProperties = planListCustomersResponse.additionalProperties.toMutableMap()
        }

        fun customerDetails(customerDetails: CustomerDetail) =
            customerDetails(JsonField.of(customerDetails))

        /**
         * Sets [Builder.customerDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerDetails] with a well-typed [CustomerDetail]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customerDetails(customerDetails: JsonField<CustomerDetail>) = apply {
            this.customerDetails = customerDetails
        }

        fun planDetails(planDetails: PlanDetails) = planDetails(JsonField.of(planDetails))

        /**
         * Sets [Builder.planDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planDetails] with a well-typed [PlanDetails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [PlanListCustomersResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerDetails()
         * .planDetails()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanListCustomersResponse =
            PlanListCustomersResponse(
                checkRequired("customerDetails", customerDetails),
                checkRequired("planDetails", planDetails),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlanListCustomersResponse = apply {
        if (validated) {
            return@apply
        }

        customerDetails().validate()
        planDetails().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: MetronomeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (customerDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (planDetails.asKnown().getOrNull()?.validity() ?: 0)

    class PlanDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val customerPlanId: JsonField<String>,
        private val name: JsonField<String>,
        private val startingOn: JsonField<OffsetDateTime>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("customer_plan_id")
            @ExcludeMissing
            customerPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_on")
            @ExcludeMissing
            startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, customFields, customerPlanId, name, startingOn, endingBefore, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customFields(): CustomFields = customFields.getRequired("custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerPlanId(): String = customerPlanId.getRequired("customer_plan_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The start date of the plan
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

        /**
         * The end date of the plan
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [customerPlanId].
         *
         * Unlike [customerPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_plan_id")
        @ExcludeMissing
        fun _customerPlanId(): JsonField<String> = customerPlanId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [startingOn].
         *
         * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [PlanDetails].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .customFields()
             * .customerPlanId()
             * .name()
             * .startingOn()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PlanDetails]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var customFields: JsonField<CustomFields>? = null
            private var customerPlanId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var startingOn: JsonField<OffsetDateTime>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planDetails: PlanDetails) = apply {
                id = planDetails.id
                customFields = planDetails.customFields
                customerPlanId = planDetails.customerPlanId
                name = planDetails.name
                startingOn = planDetails.startingOn
                endingBefore = planDetails.endingBefore
                additionalProperties = planDetails.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun customerPlanId(customerPlanId: String) =
                customerPlanId(JsonField.of(customerPlanId))

            /**
             * Sets [Builder.customerPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerPlanId(customerPlanId: JsonField<String>) = apply {
                this.customerPlanId = customerPlanId
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The start date of the plan */
            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /**
             * Sets [Builder.startingOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
            }

            /** The end date of the plan */
            fun endingBefore(endingBefore: OffsetDateTime?) =
                endingBefore(JsonField.ofNullable(endingBefore))

            /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.getOrNull())

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
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

            /**
             * Returns an immutable instance of [PlanDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .customFields()
             * .customerPlanId()
             * .name()
             * .startingOn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PlanDetails =
                PlanDetails(
                    checkRequired("id", id),
                    checkRequired("customFields", customFields),
                    checkRequired("customerPlanId", customerPlanId),
                    checkRequired("name", name),
                    checkRequired("startingOn", startingOn),
                    endingBefore,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PlanDetails = apply {
            if (validated) {
                return@apply
            }

            id()
            customFields().validate()
            customerPlanId()
            name()
            startingOn()
            endingBefore()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customerPlanId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (startingOn.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0)

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlanDetails &&
                id == other.id &&
                customFields == other.customFields &&
                customerPlanId == other.customerPlanId &&
                name == other.name &&
                startingOn == other.startingOn &&
                endingBefore == other.endingBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                customFields,
                customerPlanId,
                name,
                startingOn,
                endingBefore,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanDetails{id=$id, customFields=$customFields, customerPlanId=$customerPlanId, name=$name, startingOn=$startingOn, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListCustomersResponse &&
            customerDetails == other.customerDetails &&
            planDetails == other.planDetails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customerDetails, planDetails, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListCustomersResponse{customerDetails=$customerDetails, planDetails=$planDetails, additionalProperties=$additionalProperties}"
}
