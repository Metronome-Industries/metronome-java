// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CustomerListCostsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditTypes: JsonField<CreditTypes>,
    private val endTimestamp: JsonField<OffsetDateTime>,
    private val startTimestamp: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_types")
        @ExcludeMissing
        creditTypes: JsonField<CreditTypes> = JsonMissing.of(),
        @JsonProperty("end_timestamp")
        @ExcludeMissing
        endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_timestamp")
        @ExcludeMissing
        startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(creditTypes, endTimestamp, startTimestamp, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditTypes(): CreditTypes = creditTypes.getRequired("credit_types")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTimestamp(): OffsetDateTime = endTimestamp.getRequired("end_timestamp")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTimestamp(): OffsetDateTime = startTimestamp.getRequired("start_timestamp")

    /**
     * Returns the raw JSON value of [creditTypes].
     *
     * Unlike [creditTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_types")
    @ExcludeMissing
    fun _creditTypes(): JsonField<CreditTypes> = creditTypes

    /**
     * Returns the raw JSON value of [endTimestamp].
     *
     * Unlike [endTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    fun _endTimestamp(): JsonField<OffsetDateTime> = endTimestamp

    /**
     * Returns the raw JSON value of [startTimestamp].
     *
     * Unlike [startTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    fun _startTimestamp(): JsonField<OffsetDateTime> = startTimestamp

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
         * Returns a mutable builder for constructing an instance of [CustomerListCostsResponse].
         *
         * The following fields are required:
         * ```java
         * .creditTypes()
         * .endTimestamp()
         * .startTimestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListCostsResponse]. */
    class Builder internal constructor() {

        private var creditTypes: JsonField<CreditTypes>? = null
        private var endTimestamp: JsonField<OffsetDateTime>? = null
        private var startTimestamp: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerListCostsResponse: CustomerListCostsResponse) = apply {
            creditTypes = customerListCostsResponse.creditTypes
            endTimestamp = customerListCostsResponse.endTimestamp
            startTimestamp = customerListCostsResponse.startTimestamp
            additionalProperties = customerListCostsResponse.additionalProperties.toMutableMap()
        }

        fun creditTypes(creditTypes: CreditTypes) = creditTypes(JsonField.of(creditTypes))

        /**
         * Sets [Builder.creditTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditTypes] with a well-typed [CreditTypes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditTypes(creditTypes: JsonField<CreditTypes>) = apply {
            this.creditTypes = creditTypes
        }

        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        /**
         * Sets [Builder.endTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        fun startTimestamp(startTimestamp: OffsetDateTime) =
            startTimestamp(JsonField.of(startTimestamp))

        /**
         * Sets [Builder.startTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
            this.startTimestamp = startTimestamp
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
         * Returns an immutable instance of [CustomerListCostsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .creditTypes()
         * .endTimestamp()
         * .startTimestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerListCostsResponse =
            CustomerListCostsResponse(
                checkRequired("creditTypes", creditTypes),
                checkRequired("endTimestamp", endTimestamp),
                checkRequired("startTimestamp", startTimestamp),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerListCostsResponse = apply {
        if (validated) {
            return@apply
        }

        creditTypes().validate()
        endTimestamp()
        startTimestamp()
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
        (creditTypes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTimestamp.asKnown().isPresent) 1 else 0) +
            (if (startTimestamp.asKnown().isPresent) 1 else 0)

    class CreditTypes
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

            /** Returns a mutable builder for constructing an instance of [CreditTypes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreditTypes]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditTypes: CreditTypes) = apply {
                additionalProperties = creditTypes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CreditTypes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreditTypes = CreditTypes(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CreditTypes = apply {
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

            return other is CreditTypes && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CreditTypes{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListCostsResponse &&
            creditTypes == other.creditTypes &&
            endTimestamp == other.endTimestamp &&
            startTimestamp == other.startTimestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(creditTypes, endTimestamp, startTimestamp, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerListCostsResponse{creditTypes=$creditTypes, endTimestamp=$endTimestamp, startTimestamp=$startTimestamp, additionalProperties=$additionalProperties}"
}
