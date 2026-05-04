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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List credit grants. This list does not included voided grants. This is a Plans (deprecated)
 * endpoint. New clients should implement using Contracts.
 */
class CreditGrantListParams
private constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * An array of credit grant IDs. If this is specified, neither credit_type_ids nor customer_ids
     * may be specified.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditGrantIds(): Optional<List<String>> = body.creditGrantIds()

    /**
     * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditTypeIds(): Optional<List<String>> = body.creditTypeIds()

    /**
     * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
     * specified.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerIds(): Optional<List<String>> = body.customerIds()

    /**
     * Only return credit grants that are effective before this timestamp (exclusive).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveBefore(): Optional<OffsetDateTime> = body.effectiveBefore()

    /**
     * Only return credit grants that expire at or after this timestamp.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notExpiringBefore(): Optional<OffsetDateTime> = body.notExpiringBefore()

    /**
     * Returns the raw JSON value of [creditGrantIds].
     *
     * Unlike [creditGrantIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditGrantIds(): JsonField<List<String>> = body._creditGrantIds()

    /**
     * Returns the raw JSON value of [creditTypeIds].
     *
     * Unlike [creditTypeIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditTypeIds(): JsonField<List<String>> = body._creditTypeIds()

    /**
     * Returns the raw JSON value of [customerIds].
     *
     * Unlike [customerIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerIds(): JsonField<List<String>> = body._customerIds()

    /**
     * Returns the raw JSON value of [effectiveBefore].
     *
     * Unlike [effectiveBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveBefore(): JsonField<OffsetDateTime> = body._effectiveBefore()

    /**
     * Returns the raw JSON value of [notExpiringBefore].
     *
     * Unlike [notExpiringBefore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _notExpiringBefore(): JsonField<OffsetDateTime> = body._notExpiringBefore()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CreditGrantListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CreditGrantListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGrantListParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantListParams: CreditGrantListParams) = apply {
            limit = creditGrantListParams.limit
            nextPage = creditGrantListParams.nextPage
            body = creditGrantListParams.body.toBuilder()
            additionalHeaders = creditGrantListParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantListParams.additionalQueryParams.toBuilder()
        }

        /** Max number of results that should be returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [creditGrantIds]
         * - [creditTypeIds]
         * - [customerIds]
         * - [effectiveBefore]
         * - [notExpiringBefore]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun creditGrantIds(creditGrantIds: List<String>) = apply {
            body.creditGrantIds(creditGrantIds)
        }

        /**
         * Sets [Builder.creditGrantIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditGrantIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditGrantIds(creditGrantIds: JsonField<List<String>>) = apply {
            body.creditGrantIds(creditGrantIds)
        }

        /**
         * Adds a single [String] to [creditGrantIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditGrantId(creditGrantId: String) = apply { body.addCreditGrantId(creditGrantId) }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun creditTypeIds(creditTypeIds: List<String>) = apply { body.creditTypeIds(creditTypeIds) }

        /**
         * Sets [Builder.creditTypeIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditTypeIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditTypeIds(creditTypeIds: JsonField<List<String>>) = apply {
            body.creditTypeIds(creditTypeIds)
        }

        /**
         * Adds a single [String] to [creditTypeIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditTypeId(creditTypeId: String) = apply { body.addCreditTypeId(creditTypeId) }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun customerIds(customerIds: List<String>) = apply { body.customerIds(customerIds) }

        /**
         * Sets [Builder.customerIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerIds(customerIds: JsonField<List<String>>) = apply {
            body.customerIds(customerIds)
        }

        /**
         * Adds a single [String] to [customerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerId(customerId: String) = apply { body.addCustomerId(customerId) }

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /**
         * Sets [Builder.effectiveBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveBefore] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Only return credit grants that expire at or after this timestamp. */
        fun notExpiringBefore(notExpiringBefore: OffsetDateTime) = apply {
            body.notExpiringBefore(notExpiringBefore)
        }

        /**
         * Sets [Builder.notExpiringBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notExpiringBefore] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun notExpiringBefore(notExpiringBefore: JsonField<OffsetDateTime>) = apply {
            body.notExpiringBefore(notExpiringBefore)
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
         * Returns an immutable instance of [CreditGrantListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreditGrantListParams =
            CreditGrantListParams(
                limit,
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditGrantIds: JsonField<List<String>>,
        private val creditTypeIds: JsonField<List<String>>,
        private val customerIds: JsonField<List<String>>,
        private val effectiveBefore: JsonField<OffsetDateTime>,
        private val notExpiringBefore: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_grant_ids")
            @ExcludeMissing
            creditGrantIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("credit_type_ids")
            @ExcludeMissing
            creditTypeIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("customer_ids")
            @ExcludeMissing
            customerIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("effective_before")
            @ExcludeMissing
            effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("not_expiring_before")
            @ExcludeMissing
            notExpiringBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            creditGrantIds,
            creditTypeIds,
            customerIds,
            effectiveBefore,
            notExpiringBefore,
            mutableMapOf(),
        )

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditGrantIds(): Optional<List<String>> =
            creditGrantIds.getOptional("credit_grant_ids")

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditTypeIds(): Optional<List<String>> = creditTypeIds.getOptional("credit_type_ids")

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerIds(): Optional<List<String>> = customerIds.getOptional("customer_ids")

        /**
         * Only return credit grants that are effective before this timestamp (exclusive).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveBefore(): Optional<OffsetDateTime> =
            effectiveBefore.getOptional("effective_before")

        /**
         * Only return credit grants that expire at or after this timestamp.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notExpiringBefore(): Optional<OffsetDateTime> =
            notExpiringBefore.getOptional("not_expiring_before")

        /**
         * Returns the raw JSON value of [creditGrantIds].
         *
         * Unlike [creditGrantIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_grant_ids")
        @ExcludeMissing
        fun _creditGrantIds(): JsonField<List<String>> = creditGrantIds

        /**
         * Returns the raw JSON value of [creditTypeIds].
         *
         * Unlike [creditTypeIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_type_ids")
        @ExcludeMissing
        fun _creditTypeIds(): JsonField<List<String>> = creditTypeIds

        /**
         * Returns the raw JSON value of [customerIds].
         *
         * Unlike [customerIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_ids")
        @ExcludeMissing
        fun _customerIds(): JsonField<List<String>> = customerIds

        /**
         * Returns the raw JSON value of [effectiveBefore].
         *
         * Unlike [effectiveBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_before")
        @ExcludeMissing
        fun _effectiveBefore(): JsonField<OffsetDateTime> = effectiveBefore

        /**
         * Returns the raw JSON value of [notExpiringBefore].
         *
         * Unlike [notExpiringBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("not_expiring_before")
        @ExcludeMissing
        fun _notExpiringBefore(): JsonField<OffsetDateTime> = notExpiringBefore

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var creditGrantIds: JsonField<MutableList<String>>? = null
            private var creditTypeIds: JsonField<MutableList<String>>? = null
            private var customerIds: JsonField<MutableList<String>>? = null
            private var effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var notExpiringBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                creditGrantIds = body.creditGrantIds.map { it.toMutableList() }
                creditTypeIds = body.creditTypeIds.map { it.toMutableList() }
                customerIds = body.customerIds.map { it.toMutableList() }
                effectiveBefore = body.effectiveBefore
                notExpiringBefore = body.notExpiringBefore
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            fun creditGrantIds(creditGrantIds: List<String>) =
                creditGrantIds(JsonField.of(creditGrantIds))

            /**
             * Sets [Builder.creditGrantIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditGrantIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditGrantIds(creditGrantIds: JsonField<List<String>>) = apply {
                this.creditGrantIds = creditGrantIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [creditGrantIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditGrantId(creditGrantId: String) = apply {
                creditGrantIds =
                    (creditGrantIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditGrantIds", it).add(creditGrantId)
                    }
            }

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun creditTypeIds(creditTypeIds: List<String>) =
                creditTypeIds(JsonField.of(creditTypeIds))

            /**
             * Sets [Builder.creditTypeIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditTypeIds(creditTypeIds: JsonField<List<String>>) = apply {
                this.creditTypeIds = creditTypeIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [creditTypeIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditTypeId(creditTypeId: String) = apply {
                creditTypeIds =
                    (creditTypeIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditTypeIds", it).add(creditTypeId)
                    }
            }

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun customerIds(customerIds: List<String>) = customerIds(JsonField.of(customerIds))

            /**
             * Sets [Builder.customerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerIds(customerIds: JsonField<List<String>>) = apply {
                this.customerIds = customerIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [customerIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomerId(customerId: String) = apply {
                customerIds =
                    (customerIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customerIds", it).add(customerId)
                    }
            }

            /** Only return credit grants that are effective before this timestamp (exclusive). */
            fun effectiveBefore(effectiveBefore: OffsetDateTime) =
                effectiveBefore(JsonField.of(effectiveBefore))

            /**
             * Sets [Builder.effectiveBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Only return credit grants that expire at or after this timestamp. */
            fun notExpiringBefore(notExpiringBefore: OffsetDateTime) =
                notExpiringBefore(JsonField.of(notExpiringBefore))

            /**
             * Sets [Builder.notExpiringBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notExpiringBefore] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun notExpiringBefore(notExpiringBefore: JsonField<OffsetDateTime>) = apply {
                this.notExpiringBefore = notExpiringBefore
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
             */
            fun build(): Body =
                Body(
                    (creditGrantIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (creditTypeIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (customerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    effectiveBefore,
                    notExpiringBefore,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            creditGrantIds()
            creditTypeIds()
            customerIds()
            effectiveBefore()
            notExpiringBefore()
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
            (creditGrantIds.asKnown().getOrNull()?.size ?: 0) +
                (creditTypeIds.asKnown().getOrNull()?.size ?: 0) +
                (customerIds.asKnown().getOrNull()?.size ?: 0) +
                (if (effectiveBefore.asKnown().isPresent) 1 else 0) +
                (if (notExpiringBefore.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                creditGrantIds == other.creditGrantIds &&
                creditTypeIds == other.creditTypeIds &&
                customerIds == other.customerIds &&
                effectiveBefore == other.effectiveBefore &&
                notExpiringBefore == other.notExpiringBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditGrantIds,
                creditTypeIds,
                customerIds,
                effectiveBefore,
                notExpiringBefore,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{creditGrantIds=$creditGrantIds, creditTypeIds=$creditTypeIds, customerIds=$customerIds, effectiveBefore=$effectiveBefore, notExpiringBefore=$notExpiringBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantListParams &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditGrantListParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
