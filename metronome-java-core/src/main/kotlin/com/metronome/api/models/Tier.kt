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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Tier
@JsonCreator
private constructor(
    @JsonProperty("price") @ExcludeMissing private val price: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("size") @ExcludeMissing private val size: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun price(): Double = price.getRequired("price")

    fun size(): Optional<Double> = Optional.ofNullable(size.getNullable("size"))

    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Tier = apply {
        if (validated) {
            return@apply
        }

        price()
        size()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Tier]. */
    class Builder internal constructor() {

        private var price: JsonField<Double>? = null
        private var size: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tier: Tier) = apply {
            price = tier.price
            size = tier.size
            additionalProperties = tier.additionalProperties.toMutableMap()
        }

        fun price(price: Double) = price(JsonField.of(price))

        fun price(price: JsonField<Double>) = apply { this.price = price }

        fun size(size: Double) = size(JsonField.of(size))

        fun size(size: JsonField<Double>) = apply { this.size = size }

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

        fun build(): Tier =
            Tier(checkRequired("price", price), size, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Tier && price == other.price && size == other.size && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(price, size, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Tier{price=$price, size=$size, additionalProperties=$additionalProperties}"
}
