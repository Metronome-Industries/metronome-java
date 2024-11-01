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
import java.util.Objects

@JsonDeserialize(builder = ContractScheduleProServicesInvoiceResponse.Builder::class)
@NoAutoDetect
class ContractScheduleProServicesInvoiceResponse
private constructor(
    private val data: JsonField<List<Invoice>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): List<Invoice> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ContractScheduleProServicesInvoiceResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Invoice>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractScheduleProServicesInvoiceResponse: ContractScheduleProServicesInvoiceResponse
        ) = apply {
            this.data = contractScheduleProServicesInvoiceResponse.data
            additionalProperties(contractScheduleProServicesInvoiceResponse.additionalProperties)
        }

        fun data(data: List<Invoice>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Invoice>>) = apply { this.data = data }

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

        fun build(): ContractScheduleProServicesInvoiceResponse =
            ContractScheduleProServicesInvoiceResponse(
                data.map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractScheduleProServicesInvoiceResponse && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(data, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ContractScheduleProServicesInvoiceResponse{data=$data, additionalProperties=$additionalProperties}"
}
