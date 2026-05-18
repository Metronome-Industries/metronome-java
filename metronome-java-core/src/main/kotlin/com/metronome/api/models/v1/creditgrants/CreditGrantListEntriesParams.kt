// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
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
 * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger entries
 * are returned in chronological order. Ledger entries associated with voided credit grants are not
 * included. This is a Plans (deprecated) endpoint. New clients should implement using Contracts.
 */
class CreditGrantListEntriesParams
private constructor(
    private val nextPage: String?,
    private val sort: Sort?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /** Ledgers sort order by date, asc or desc. Defaults to asc. */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /**
     * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger entries
     * for all credit types will be returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditTypeIds(): Optional<List<String>> = body.creditTypeIds()

    /**
     * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries for
     * all customers will be returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerIds(): Optional<List<String>> = body.customerIds()

    /**
     * If supplied, ledger entries will only be returned with an effective_at before this time. This
     * timestamp must not be in the future. If no timestamp is supplied, all entries up to the start
     * of the customer's next billing period will be returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * If supplied, only ledger entries effective at or after this time will be returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingOn(): Optional<OffsetDateTime> = body.startingOn()

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
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * Returns the raw JSON value of [startingOn].
     *
     * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingOn(): JsonField<OffsetDateTime> = body._startingOn()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CreditGrantListEntriesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [CreditGrantListEntriesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGrantListEntriesParams]. */
    class Builder internal constructor() {

        private var nextPage: String? = null
        private var sort: Sort? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantListEntriesParams: CreditGrantListEntriesParams) = apply {
            nextPage = creditGrantListEntriesParams.nextPage
            sort = creditGrantListEntriesParams.sort
            body = creditGrantListEntriesParams.body.toBuilder()
            additionalHeaders = creditGrantListEntriesParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantListEntriesParams.additionalQueryParams.toBuilder()
        }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /** Ledgers sort order by date, asc or desc. Defaults to asc. */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [creditTypeIds]
         * - [customerIds]
         * - [endingBefore]
         * - [startingOn]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
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
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
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

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /**
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /** If supplied, only ledger entries effective at or after this time will be returned. */
        fun startingOn(startingOn: OffsetDateTime) = apply { body.startingOn(startingOn) }

        /**
         * Sets [Builder.startingOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            body.startingOn(startingOn)
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
         * Returns an immutable instance of [CreditGrantListEntriesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreditGrantListEntriesParams =
            CreditGrantListEntriesParams(
                nextPage,
                sort,
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
                nextPage?.let { put("next_page", it) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditTypeIds: JsonField<List<String>>,
        private val customerIds: JsonField<List<String>>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val startingOn: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_ids")
            @ExcludeMissing
            creditTypeIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("customer_ids")
            @ExcludeMissing
            customerIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_on")
            @ExcludeMissing
            startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(creditTypeIds, customerIds, endingBefore, startingOn, mutableMapOf())

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditTypeIds(): Optional<List<String>> = creditTypeIds.getOptional("credit_type_ids")

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerIds(): Optional<List<String>> = customerIds.getOptional("customer_ids")

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * If supplied, only ledger entries effective at or after this time will be returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingOn(): Optional<OffsetDateTime> = startingOn.getOptional("starting_on")

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
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [startingOn].
         *
         * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

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

            private var creditTypeIds: JsonField<MutableList<String>>? = null
            private var customerIds: JsonField<MutableList<String>>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                creditTypeIds = body.creditTypeIds.map { it.toMutableList() }
                customerIds = body.customerIds.map { it.toMutableList() }
                endingBefore = body.endingBefore
                startingOn = body.startingOn
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
             * entries for all credit types will be returned.
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
             * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger
             * entries for all customers will be returned.
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

            /**
             * If supplied, ledger entries will only be returned with an effective_at before this
             * time. This timestamp must not be in the future. If no timestamp is supplied, all
             * entries up to the start of the customer's next billing period will be returned.
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * If supplied, only ledger entries effective at or after this time will be returned.
             */
            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /**
             * Sets [Builder.startingOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
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
                    (creditTypeIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (customerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    endingBefore,
                    startingOn,
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

            creditTypeIds()
            customerIds()
            endingBefore()
            startingOn()
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
            (creditTypeIds.asKnown().getOrNull()?.size ?: 0) +
                (customerIds.asKnown().getOrNull()?.size ?: 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (startingOn.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                creditTypeIds == other.creditTypeIds &&
                customerIds == other.customerIds &&
                endingBefore == other.endingBefore &&
                startingOn == other.startingOn &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(creditTypeIds, customerIds, endingBefore, startingOn, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{creditTypeIds=$creditTypeIds, customerIds=$customerIds, endingBefore=$endingBefore, startingOn=$startingOn, additionalProperties=$additionalProperties}"
    }

    /** Ledgers sort order by date, asc or desc. Defaults to asc. */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ASC -> Value.ASC
                DESC -> Value.DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw MetronomeInvalidDataException("Unknown Sort: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
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
        fun validate(): Sort = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantListEntriesParams &&
            nextPage == other.nextPage &&
            sort == other.sort &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(nextPage, sort, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditGrantListEntriesParams{nextPage=$nextPage, sort=$sort, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
