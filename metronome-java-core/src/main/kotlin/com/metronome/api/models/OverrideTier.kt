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
import com.metronome.api.core.checkRequired
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class OverrideTier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val multiplier: JsonField<Double>,
    private val size: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("multiplier")
        @ExcludeMissing
        multiplier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Double> = JsonMissing.of(),
    ) : this(multiplier, size, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun multiplier(): Double = multiplier.getRequired("multiplier")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun size(): Optional<Double> = size.getOptional("size")

    /**
     * Returns the raw JSON value of [multiplier].
     *
     * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<Double> = multiplier

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

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
         * Returns a mutable builder for constructing an instance of [OverrideTier].
         *
         * The following fields are required:
         * ```java
         * .multiplier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OverrideTier]. */
    class Builder internal constructor() {

        private var multiplier: JsonField<Double>? = null
        private var size: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(overrideTier: OverrideTier) = apply {
            multiplier = overrideTier.multiplier
            size = overrideTier.size
            additionalProperties = overrideTier.additionalProperties.toMutableMap()
        }

        fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

        /**
         * Sets [Builder.multiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplier] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

        fun size(size: Double) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [OverrideTier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .multiplier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OverrideTier =
            OverrideTier(
                checkRequired("multiplier", multiplier),
                size,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OverrideTier = apply {
        if (validated) {
            return@apply
        }

        multiplier()
        size()
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
        (if (multiplier.asKnown().isPresent) 1 else 0) + (if (size.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OverrideTier &&
            multiplier == other.multiplier &&
            size == other.size &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(multiplier, size, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OverrideTier{multiplier=$multiplier, size=$size, additionalProperties=$additionalProperties}"
}
