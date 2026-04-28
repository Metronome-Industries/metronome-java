// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Void a credit grant. This is a Plans (deprecated) endpoint. New clients should implement using
 * Contracts.
 */
class CreditGrantVoidParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = body.id()

    /**
     * If true, resets the uniqueness key on this grant so it can be re-used
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun releaseUniquenessKey(): Optional<Boolean> = body.releaseUniquenessKey()

    /**
     * If true, void the purchase invoice associated with the grant
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voidCreditPurchaseInvoice(): Optional<Boolean> = body.voidCreditPurchaseInvoice()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [releaseUniquenessKey].
     *
     * Unlike [releaseUniquenessKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _releaseUniquenessKey(): JsonField<Boolean> = body._releaseUniquenessKey()

    /**
     * Returns the raw JSON value of [voidCreditPurchaseInvoice].
     *
     * Unlike [voidCreditPurchaseInvoice], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _voidCreditPurchaseInvoice(): JsonField<Boolean> = body._voidCreditPurchaseInvoice()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditGrantVoidParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGrantVoidParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantVoidParams: CreditGrantVoidParams) = apply {
            body = creditGrantVoidParams.body.toBuilder()
            additionalHeaders = creditGrantVoidParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantVoidParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [releaseUniquenessKey]
         * - [voidCreditPurchaseInvoice]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** If true, resets the uniqueness key on this grant so it can be re-used */
        fun releaseUniquenessKey(releaseUniquenessKey: Boolean) = apply {
            body.releaseUniquenessKey(releaseUniquenessKey)
        }

        /**
         * Sets [Builder.releaseUniquenessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.releaseUniquenessKey] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun releaseUniquenessKey(releaseUniquenessKey: JsonField<Boolean>) = apply {
            body.releaseUniquenessKey(releaseUniquenessKey)
        }

        /** If true, void the purchase invoice associated with the grant */
        fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean) = apply {
            body.voidCreditPurchaseInvoice(voidCreditPurchaseInvoice)
        }

        /**
         * Sets [Builder.voidCreditPurchaseInvoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidCreditPurchaseInvoice] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: JsonField<Boolean>) = apply {
            body.voidCreditPurchaseInvoice(voidCreditPurchaseInvoice)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CreditGrantVoidParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditGrantVoidParams =
            CreditGrantVoidParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val releaseUniquenessKey: JsonField<Boolean>,
        private val voidCreditPurchaseInvoice: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("release_uniqueness_key")
            @ExcludeMissing
            releaseUniquenessKey: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("void_credit_purchase_invoice")
            @ExcludeMissing
            voidCreditPurchaseInvoice: JsonField<Boolean> = JsonMissing.of(),
        ) : this(id, releaseUniquenessKey, voidCreditPurchaseInvoice, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * If true, resets the uniqueness key on this grant so it can be re-used
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun releaseUniquenessKey(): Optional<Boolean> =
            releaseUniquenessKey.getOptional("release_uniqueness_key")

        /**
         * If true, void the purchase invoice associated with the grant
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun voidCreditPurchaseInvoice(): Optional<Boolean> =
            voidCreditPurchaseInvoice.getOptional("void_credit_purchase_invoice")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [releaseUniquenessKey].
         *
         * Unlike [releaseUniquenessKey], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("release_uniqueness_key")
        @ExcludeMissing
        fun _releaseUniquenessKey(): JsonField<Boolean> = releaseUniquenessKey

        /**
         * Returns the raw JSON value of [voidCreditPurchaseInvoice].
         *
         * Unlike [voidCreditPurchaseInvoice], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("void_credit_purchase_invoice")
        @ExcludeMissing
        fun _voidCreditPurchaseInvoice(): JsonField<Boolean> = voidCreditPurchaseInvoice

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var releaseUniquenessKey: JsonField<Boolean> = JsonMissing.of()
            private var voidCreditPurchaseInvoice: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                releaseUniquenessKey = body.releaseUniquenessKey
                voidCreditPurchaseInvoice = body.voidCreditPurchaseInvoice
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** If true, resets the uniqueness key on this grant so it can be re-used */
            fun releaseUniquenessKey(releaseUniquenessKey: Boolean) =
                releaseUniquenessKey(JsonField.of(releaseUniquenessKey))

            /**
             * Sets [Builder.releaseUniquenessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.releaseUniquenessKey] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun releaseUniquenessKey(releaseUniquenessKey: JsonField<Boolean>) = apply {
                this.releaseUniquenessKey = releaseUniquenessKey
            }

            /** If true, void the purchase invoice associated with the grant */
            fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean) =
                voidCreditPurchaseInvoice(JsonField.of(voidCreditPurchaseInvoice))

            /**
             * Sets [Builder.voidCreditPurchaseInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidCreditPurchaseInvoice] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: JsonField<Boolean>) = apply {
                this.voidCreditPurchaseInvoice = voidCreditPurchaseInvoice
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("id", id),
                    releaseUniquenessKey,
                    voidCreditPurchaseInvoice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            releaseUniquenessKey()
            voidCreditPurchaseInvoice()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (releaseUniquenessKey.asKnown().isPresent) 1 else 0) +
                (if (voidCreditPurchaseInvoice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                releaseUniquenessKey == other.releaseUniquenessKey &&
                voidCreditPurchaseInvoice == other.voidCreditPurchaseInvoice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, releaseUniquenessKey, voidCreditPurchaseInvoice, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, releaseUniquenessKey=$releaseUniquenessKey, voidCreditPurchaseInvoice=$voidCreditPurchaseInvoice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantVoidParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditGrantVoidParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
