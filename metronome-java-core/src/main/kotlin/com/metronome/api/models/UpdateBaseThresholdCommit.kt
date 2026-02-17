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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class UpdateBaseThresholdCommit
@JsonCreator
private constructor(
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * Specify the name of the line item for the threshold charge. If left blank, it will default to
     * the commit product name.
     */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The commit product that will be used to generate the line item for commit payment. */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Specify the name of the line item for the threshold charge. If left blank, it will default to
     * the commit product name.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The commit product that will be used to generate the line item for commit payment. */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UpdateBaseThresholdCommit = apply {
        if (validated) {
            return@apply
        }

        description()
        name()
        productId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateBaseThresholdCommit]. */
    class Builder internal constructor() {

        private var description: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateBaseThresholdCommit: UpdateBaseThresholdCommit) = apply {
            description = updateBaseThresholdCommit.description
            name = updateBaseThresholdCommit.name
            productId = updateBaseThresholdCommit.productId
            additionalProperties = updateBaseThresholdCommit.additionalProperties.toMutableMap()
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Specify the name of the line item for the threshold charge. If left blank, it will
         * default to the commit product name.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Specify the name of the line item for the threshold charge. If left blank, it will
         * default to the commit product name.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The commit product that will be used to generate the line item for commit payment. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** The commit product that will be used to generate the line item for commit payment. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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

        fun build(): UpdateBaseThresholdCommit =
            UpdateBaseThresholdCommit(
                description,
                name,
                productId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UpdateBaseThresholdCommit && description == other.description && name == other.name && productId == other.productId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(description, name, productId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateBaseThresholdCommit{description=$description, name=$name, productId=$productId, additionalProperties=$additionalProperties}"
}
