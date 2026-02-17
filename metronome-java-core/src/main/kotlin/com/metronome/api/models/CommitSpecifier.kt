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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CommitSpecifier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val presentationGroupValues: JsonField<PresentationGroupValues>,
    private val pricingGroupValues: JsonField<PricingGroupValues>,
    private val productId: JsonField<String>,
    private val productTags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_tags")
        @ExcludeMissing
        productTags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(presentationGroupValues, pricingGroupValues, productId, productTags, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presentationGroupValues(): Optional<PresentationGroupValues> =
        presentationGroupValues.getOptional("presentation_group_values")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricingGroupValues(): Optional<PricingGroupValues> =
        pricingGroupValues.getOptional("pricing_group_values")

    /**
     * If provided, the specifier will only apply to the product with the specified ID.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = productId.getOptional("product_id")

    /**
     * If provided, the specifier will only apply to products with all the specified tags.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productTags(): Optional<List<String>> = productTags.getOptional("product_tags")

    /**
     * Returns the raw JSON value of [presentationGroupValues].
     *
     * Unlike [presentationGroupValues], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("presentation_group_values")
    @ExcludeMissing
    fun _presentationGroupValues(): JsonField<PresentationGroupValues> = presentationGroupValues

    /**
     * Returns the raw JSON value of [pricingGroupValues].
     *
     * Unlike [pricingGroupValues], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [productTags].
     *
     * Unlike [productTags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_tags")
    @ExcludeMissing
    fun _productTags(): JsonField<List<String>> = productTags

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

        /** Returns a mutable builder for constructing an instance of [CommitSpecifier]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitSpecifier]. */
    class Builder internal constructor() {

        private var presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of()
        private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var productTags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitSpecifier: CommitSpecifier) = apply {
            presentationGroupValues = commitSpecifier.presentationGroupValues
            pricingGroupValues = commitSpecifier.pricingGroupValues
            productId = commitSpecifier.productId
            productTags = commitSpecifier.productTags.map { it.toMutableList() }
            additionalProperties = commitSpecifier.additionalProperties.toMutableMap()
        }

        fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
            presentationGroupValues(JsonField.of(presentationGroupValues))

        /**
         * Sets [Builder.presentationGroupValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presentationGroupValues] with a well-typed
         * [PresentationGroupValues] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun presentationGroupValues(presentationGroupValues: JsonField<PresentationGroupValues>) =
            apply {
                this.presentationGroupValues = presentationGroupValues
            }

        fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
            pricingGroupValues(JsonField.of(pricingGroupValues))

        /**
         * Sets [Builder.pricingGroupValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingGroupValues] with a well-typed
         * [PricingGroupValues] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
            this.pricingGroupValues = pricingGroupValues
        }

        /** If provided, the specifier will only apply to the product with the specified ID. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** If provided, the specifier will only apply to products with all the specified tags. */
        fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

        /**
         * Sets [Builder.productTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productTags] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productTags(productTags: JsonField<List<String>>) = apply {
            this.productTags = productTags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [productTags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductTag(productTag: String) = apply {
            productTags =
                (productTags ?: JsonField.of(mutableListOf())).also {
                    checkKnown("productTags", it).add(productTag)
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

        /**
         * Returns an immutable instance of [CommitSpecifier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommitSpecifier =
            CommitSpecifier(
                presentationGroupValues,
                pricingGroupValues,
                productId,
                (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CommitSpecifier = apply {
        if (validated) {
            return@apply
        }

        presentationGroupValues().ifPresent { it.validate() }
        pricingGroupValues().ifPresent { it.validate() }
        productId()
        productTags()
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
        (presentationGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
            (pricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (productTags.asKnown().getOrNull()?.size ?: 0)

    class PresentationGroupValues
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

            /**
             * Returns a mutable builder for constructing an instance of [PresentationGroupValues].
             */
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

            /**
             * Returns an immutable instance of [PresentationGroupValues].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PresentationGroupValues =
                PresentationGroupValues(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PresentationGroupValues = apply {
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

            return other is PresentationGroupValues &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PresentationGroupValues{additionalProperties=$additionalProperties}"
    }

    class PricingGroupValues
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

            /** Returns a mutable builder for constructing an instance of [PricingGroupValues]. */
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

            /**
             * Returns an immutable instance of [PricingGroupValues].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PricingGroupValues = PricingGroupValues(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PricingGroupValues = apply {
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

            return other is PricingGroupValues && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PricingGroupValues{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitSpecifier &&
            presentationGroupValues == other.presentationGroupValues &&
            pricingGroupValues == other.pricingGroupValues &&
            productId == other.productId &&
            productTags == other.productTags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            presentationGroupValues,
            pricingGroupValues,
            productId,
            productTags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitSpecifier{presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, additionalProperties=$additionalProperties}"
}
