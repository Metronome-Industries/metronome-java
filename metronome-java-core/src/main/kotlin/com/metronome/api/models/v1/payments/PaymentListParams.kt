// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.payments

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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch all payment attempts for the given invoice. */
class PaymentListParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceId(): String = body.invoiceId()

    /**
     * The maximum number of payments to return. Defaults to 25.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * The next page token from a previous response.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPage(): Optional<String> = body.nextPage()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statuses(): Optional<List<PaymentStatus>> = body.statuses()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceId(): JsonField<String> = body._invoiceId()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [nextPage].
     *
     * Unlike [nextPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nextPage(): JsonField<String> = body._nextPage()

    /**
     * Returns the raw JSON value of [statuses].
     *
     * Unlike [statuses], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statuses(): JsonField<List<PaymentStatus>> = body._statuses()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentListParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .invoiceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentListParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentListParams: PaymentListParams) = apply {
            body = paymentListParams.body.toBuilder()
            additionalHeaders = paymentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [invoiceId]
         * - [limit]
         * - [nextPage]
         * - [statuses]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        fun invoiceId(invoiceId: String) = apply { body.invoiceId(invoiceId) }

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { body.invoiceId(invoiceId) }

        /** The maximum number of payments to return. Defaults to 25. */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { body.nextPage(nextPage) }

        /**
         * Sets [Builder.nextPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPage] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextPage(nextPage: JsonField<String>) = apply { body.nextPage(nextPage) }

        fun statuses(statuses: List<PaymentStatus>) = apply { body.statuses(statuses) }

        /**
         * Sets [Builder.statuses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statuses] with a well-typed `List<PaymentStatus>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statuses(statuses: JsonField<List<PaymentStatus>>) = apply { body.statuses(statuses) }

        /**
         * Adds a single [PaymentStatus] to [statuses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: PaymentStatus) = apply { body.addStatus(status) }

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
         * Returns an immutable instance of [PaymentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .invoiceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentListParams =
            PaymentListParams(
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
        private val customerId: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val limit: JsonField<Long>,
        private val nextPage: JsonField<String>,
        private val statuses: JsonField<List<PaymentStatus>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next_page")
            @ExcludeMissing
            nextPage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statuses")
            @ExcludeMissing
            statuses: JsonField<List<PaymentStatus>> = JsonMissing.of(),
        ) : this(customerId, invoiceId, limit, nextPage, statuses, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoiceId(): String = invoiceId.getRequired("invoice_id")

        /**
         * The maximum number of payments to return. Defaults to 25.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * The next page token from a previous response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nextPage(): Optional<String> = nextPage.getOptional("next_page")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun statuses(): Optional<List<PaymentStatus>> = statuses.getOptional("statuses")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [invoiceId].
         *
         * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [nextPage].
         *
         * Unlike [nextPage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

        /**
         * Returns the raw JSON value of [statuses].
         *
         * Unlike [statuses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("statuses")
        @ExcludeMissing
        fun _statuses(): JsonField<List<PaymentStatus>> = statuses

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
             * .customerId()
             * .invoiceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var invoiceId: JsonField<String>? = null
            private var limit: JsonField<Long> = JsonMissing.of()
            private var nextPage: JsonField<String> = JsonMissing.of()
            private var statuses: JsonField<MutableList<PaymentStatus>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                invoiceId = body.invoiceId
                limit = body.limit
                nextPage = body.nextPage
                statuses = body.statuses.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            /**
             * Sets [Builder.invoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            /** The maximum number of payments to return. Defaults to 25. */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** The next page token from a previous response. */
            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            /**
             * Sets [Builder.nextPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextPage] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun statuses(statuses: List<PaymentStatus>) = statuses(JsonField.of(statuses))

            /**
             * Sets [Builder.statuses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statuses] with a well-typed `List<PaymentStatus>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statuses(statuses: JsonField<List<PaymentStatus>>) = apply {
                this.statuses = statuses.map { it.toMutableList() }
            }

            /**
             * Adds a single [PaymentStatus] to [statuses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatus(status: PaymentStatus) = apply {
                statuses =
                    (statuses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statuses", it).add(status)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .invoiceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    checkRequired("invoiceId", invoiceId),
                    limit,
                    nextPage,
                    (statuses ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerId()
            invoiceId()
            limit()
            nextPage()
            statuses().ifPresent { it.forEach { it.validate() } }
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (invoiceId.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (nextPage.asKnown().isPresent) 1 else 0) +
                (statuses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerId == other.customerId &&
                invoiceId == other.invoiceId &&
                limit == other.limit &&
                nextPage == other.nextPage &&
                statuses == other.statuses &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerId, invoiceId, limit, nextPage, statuses, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, invoiceId=$invoiceId, limit=$limit, nextPage=$nextPage, statuses=$statuses, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentListParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PaymentListParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
