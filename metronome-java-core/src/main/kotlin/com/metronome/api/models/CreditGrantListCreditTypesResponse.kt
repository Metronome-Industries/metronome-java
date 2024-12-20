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
import java.util.Optional

@JsonDeserialize(builder = CreditGrantListCreditTypesResponse.Builder::class)
@NoAutoDetect
class CreditGrantListCreditTypesResponse
private constructor(
    private val name: JsonField<String>,
    private val id: JsonField<String>,
    private val isCurrency: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun isCurrency(): Optional<Boolean> = Optional.ofNullable(isCurrency.getNullable("is_currency"))

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("is_currency") @ExcludeMissing fun _isCurrency() = isCurrency

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditGrantListCreditTypesResponse = apply {
        if (!validated) {
            name()
            id()
            isCurrency()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var isCurrency: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListCreditTypesResponse: CreditGrantListCreditTypesResponse) =
            apply {
                name = creditGrantListCreditTypesResponse.name
                id = creditGrantListCreditTypesResponse.id
                isCurrency = creditGrantListCreditTypesResponse.isCurrency
                additionalProperties =
                    creditGrantListCreditTypesResponse.additionalProperties.toMutableMap()
            }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun isCurrency(isCurrency: Boolean) = isCurrency(JsonField.of(isCurrency))

        @JsonProperty("is_currency")
        @ExcludeMissing
        fun isCurrency(isCurrency: JsonField<Boolean>) = apply { this.isCurrency = isCurrency }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): CreditGrantListCreditTypesResponse =
            CreditGrantListCreditTypesResponse(
                name,
                id,
                isCurrency,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListCreditTypesResponse && name == other.name && id == other.id && isCurrency == other.isCurrency && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, id, isCurrency, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditGrantListCreditTypesResponse{name=$name, id=$id, isCurrency=$isCurrency, additionalProperties=$additionalProperties}"
}
