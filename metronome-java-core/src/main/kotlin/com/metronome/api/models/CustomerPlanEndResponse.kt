// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = CustomerPlanEndResponse.Builder::class)
@NoAutoDetect
class CustomerPlanEndResponse
private constructor(
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerPlanEndResponse = apply {
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
        internal fun from(customerPlanEndResponse: CustomerPlanEndResponse) = apply {
            additionalProperties(customerPlanEndResponse.additionalProperties)
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

        fun build(): CustomerPlanEndResponse =
            CustomerPlanEndResponse(additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanEndResponse && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() = "CustomerPlanEndResponse{additionalProperties=$additionalProperties}"
}
