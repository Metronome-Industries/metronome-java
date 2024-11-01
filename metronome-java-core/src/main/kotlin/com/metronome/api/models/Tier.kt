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

@JsonDeserialize(builder = Tier.Builder::class)
@NoAutoDetect
class Tier
private constructor(
    private val size: JsonField<Double>,
    private val price: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun size(): Optional<Double> = Optional.ofNullable(size.getNullable("size"))

    fun price(): Double = price.getRequired("price")

    @JsonProperty("size") @ExcludeMissing fun _size() = size

    @JsonProperty("price") @ExcludeMissing fun _price() = price

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Tier = apply {
        if (!validated) {
            size()
            price()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var size: JsonField<Double> = JsonMissing.of()
        private var price: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tier: Tier) = apply {
            this.size = tier.size
            this.price = tier.price
            additionalProperties(tier.additionalProperties)
        }

        fun size(size: Double) = size(JsonField.of(size))

        @JsonProperty("size")
        @ExcludeMissing
        fun size(size: JsonField<Double>) = apply { this.size = size }

        fun price(price: Double) = price(JsonField.of(price))

        @JsonProperty("price")
        @ExcludeMissing
        fun price(price: JsonField<Double>) = apply { this.price = price }

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

        fun build(): Tier =
            Tier(
                size,
                price,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Tier && this.size == other.size && this.price == other.price && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(size, price, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Tier{size=$size, price=$price, additionalProperties=$additionalProperties}"
}
