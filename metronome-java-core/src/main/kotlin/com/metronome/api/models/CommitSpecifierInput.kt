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
class CommitSpecifierInput
@JsonCreator
private constructor(
    @JsonProperty("presentation_group_values")
    @ExcludeMissing
    private val presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product_tags")
    @ExcludeMissing
    private val productTags: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * If provided, the specifier will apply to product usage with these set of presentation group
     * values.
     */
    fun presentationGroupValues(): Optional<PresentationGroupValues> =
        Optional.ofNullable(presentationGroupValues.getNullable("presentation_group_values"))

    /**
     * If provided, the specifier will apply to product usage with these set of pricing group
     * values.
     */
    fun pricingGroupValues(): Optional<PricingGroupValues> =
        Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

    /** If provided, the specifier will only apply to the product with the specified ID. */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

    /** If provided, the specifier will only apply to products with all the specified tags. */
    fun productTags(): Optional<List<String>> =
        Optional.ofNullable(productTags.getNullable("product_tags"))

    /**
     * If provided, the specifier will apply to product usage with these set of presentation group
     * values.
     */
    @JsonProperty("presentation_group_values")
    @ExcludeMissing
    fun _presentationGroupValues(): JsonField<PresentationGroupValues> = presentationGroupValues

    /**
     * If provided, the specifier will apply to product usage with these set of pricing group
     * values.
     */
    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

    /** If provided, the specifier will only apply to the product with the specified ID. */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /** If provided, the specifier will only apply to products with all the specified tags. */
    @JsonProperty("product_tags")
    @ExcludeMissing
    fun _productTags(): JsonField<List<String>> = productTags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CommitSpecifierInput = apply {
        if (validated) {
            return@apply
        }

        presentationGroupValues().ifPresent { it.validate() }
        pricingGroupValues().ifPresent { it.validate() }
        productId()
        productTags()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitSpecifierInput]. */
    class Builder internal constructor() {

        private var presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of()
        private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var productTags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitSpecifierInput: CommitSpecifierInput) = apply {
            presentationGroupValues = commitSpecifierInput.presentationGroupValues
            pricingGroupValues = commitSpecifierInput.pricingGroupValues
            productId = commitSpecifierInput.productId
            productTags = commitSpecifierInput.productTags.map { it.toMutableList() }
            additionalProperties = commitSpecifierInput.additionalProperties.toMutableMap()
        }

        /**
         * If provided, the specifier will apply to product usage with these set of presentation
         * group values.
         */
        fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
            presentationGroupValues(JsonField.of(presentationGroupValues))

        /**
         * If provided, the specifier will apply to product usage with these set of presentation
         * group values.
         */
        fun presentationGroupValues(presentationGroupValues: JsonField<PresentationGroupValues>) =
            apply {
                this.presentationGroupValues = presentationGroupValues
            }

        /**
         * If provided, the specifier will apply to product usage with these set of pricing group
         * values.
         */
        fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
            pricingGroupValues(JsonField.of(pricingGroupValues))

        /**
         * If provided, the specifier will apply to product usage with these set of pricing group
         * values.
         */
        fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
            this.pricingGroupValues = pricingGroupValues
        }

        /** If provided, the specifier will only apply to the product with the specified ID. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** If provided, the specifier will only apply to the product with the specified ID. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** If provided, the specifier will only apply to products with all the specified tags. */
        fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

        /** If provided, the specifier will only apply to products with all the specified tags. */
        fun productTags(productTags: JsonField<List<String>>) = apply {
            this.productTags = productTags.map { it.toMutableList() }
        }

        /** If provided, the specifier will only apply to products with all the specified tags. */
        fun addProductTag(productTag: String) = apply {
            productTags =
                (productTags ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(productTag)
                }
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

        fun build(): CommitSpecifierInput =
            CommitSpecifierInput(
                presentationGroupValues,
                pricingGroupValues,
                productId,
                (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If provided, the specifier will apply to product usage with these set of presentation group
     * values.
     */
    @NoAutoDetect
    class PresentationGroupValues
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PresentationGroupValues = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PresentationGroupValues]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                additionalProperties = presentationGroupValues.additionalProperties.toMutableMap()
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

            fun build(): PresentationGroupValues =
                PresentationGroupValues(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PresentationGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PresentationGroupValues{additionalProperties=$additionalProperties}"
    }

    /**
     * If provided, the specifier will apply to product usage with these set of pricing group
     * values.
     */
    @NoAutoDetect
    class PricingGroupValues
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PricingGroupValues = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PricingGroupValues]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                additionalProperties = pricingGroupValues.additionalProperties.toMutableMap()
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

            fun build(): PricingGroupValues = PricingGroupValues(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "PricingGroupValues{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitSpecifierInput && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && productTags == other.productTags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(presentationGroupValues, pricingGroupValues, productId, productTags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitSpecifierInput{presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, additionalProperties=$additionalProperties}"
}
