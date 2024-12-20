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

@NoAutoDetect
class CustomerListCostsResponse
@JsonCreator
private constructor(
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    private val startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    private val endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_types")
    @ExcludeMissing
    private val creditTypes: JsonField<CreditTypes> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun startTimestamp(): OffsetDateTime = startTimestamp.getRequired("start_timestamp")

    fun endTimestamp(): OffsetDateTime = endTimestamp.getRequired("end_timestamp")

    fun creditTypes(): CreditTypes = creditTypes.getRequired("credit_types")

    @JsonProperty("start_timestamp") @ExcludeMissing fun _startTimestamp() = startTimestamp

    @JsonProperty("end_timestamp") @ExcludeMissing fun _endTimestamp() = endTimestamp

    @JsonProperty("credit_types") @ExcludeMissing fun _creditTypes() = creditTypes

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerListCostsResponse = apply {
        if (!validated) {
            startTimestamp()
            endTimestamp()
            creditTypes().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditTypes: JsonField<CreditTypes> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerListCostsResponse: CustomerListCostsResponse) = apply {
            startTimestamp = customerListCostsResponse.startTimestamp
            endTimestamp = customerListCostsResponse.endTimestamp
            creditTypes = customerListCostsResponse.creditTypes
            additionalProperties = customerListCostsResponse.additionalProperties.toMutableMap()
        }

        fun startTimestamp(startTimestamp: OffsetDateTime) =
            startTimestamp(JsonField.of(startTimestamp))

        fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
            this.startTimestamp = startTimestamp
        }

        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        fun creditTypes(creditTypes: CreditTypes) = creditTypes(JsonField.of(creditTypes))

        fun creditTypes(creditTypes: JsonField<CreditTypes>) = apply {
            this.creditTypes = creditTypes
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

        fun build(): CustomerListCostsResponse =
            CustomerListCostsResponse(
                startTimestamp,
                endTimestamp,
                creditTypes,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CreditTypes
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditTypes = apply {
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

            fun build(): CreditTypes = CreditTypes(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditTypes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CreditTypes{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListCostsResponse && startTimestamp == other.startTimestamp && endTimestamp == other.endTimestamp && creditTypes == other.creditTypes && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(startTimestamp, endTimestamp, creditTypes, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerListCostsResponse{startTimestamp=$startTimestamp, endTimestamp=$endTimestamp, creditTypes=$creditTypes, additionalProperties=$additionalProperties}"
}
