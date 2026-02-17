// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

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
import com.metronome.api.core.checkRequired
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
 * For a specific customer and contract, get the rates at a specific point in time. This endpoint
 * takes the contract's rate card into consideration, including scheduled changes. It also takes
 * into account overrides on the contract.
 *
 * For example, if you want to show your customer a summary of the prices they are paying, inclusive
 * of any negotiated discounts or promotions, use this endpoint. This endpoint only returns rates
 * that are entitled.
 */
class ContractRetrieveRateScheduleParams
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
     * ID of the contract to get the rate schedule for.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractId(): String = body.contractId()

    /**
     * ID of the customer for whose contract to get the rate schedule for.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * optional timestamp which overlaps with the returned rate schedule segments. When not
     * specified, the current timestamp will be used.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun at(): Optional<OffsetDateTime> = body.at()

    /**
     * List of rate selectors, rates matching ANY of the selectors will be included in the response.
     * Passing no selectors will result in all rates being returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selectors(): Optional<List<Selector>> = body.selectors()

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [at].
     *
     * Unlike [at], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _at(): JsonField<OffsetDateTime> = body._at()

    /**
     * Returns the raw JSON value of [selectors].
     *
     * Unlike [selectors], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _selectors(): JsonField<List<Selector>> = body._selectors()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractRetrieveRateScheduleParams].
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractRetrieveRateScheduleParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractRetrieveRateScheduleParams: ContractRetrieveRateScheduleParams) =
            apply {
                limit = contractRetrieveRateScheduleParams.limit
                nextPage = contractRetrieveRateScheduleParams.nextPage
                body = contractRetrieveRateScheduleParams.body.toBuilder()
                additionalHeaders = contractRetrieveRateScheduleParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    contractRetrieveRateScheduleParams.additionalQueryParams.toBuilder()
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
         * - [contractId]
         * - [customerId]
         * - [at]
         * - [selectors]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the contract to get the rate schedule for. */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** ID of the customer for whose contract to get the rate schedule for. */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         */
        fun at(at: OffsetDateTime) = apply { body.at(at) }

        /**
         * Sets [Builder.at] to an arbitrary JSON value.
         *
         * You should usually call [Builder.at] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun at(at: JsonField<OffsetDateTime>) = apply { body.at(at) }

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: List<Selector>) = apply { body.selectors(selectors) }

        /**
         * Sets [Builder.selectors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selectors] with a well-typed `List<Selector>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun selectors(selectors: JsonField<List<Selector>>) = apply { body.selectors(selectors) }

        /**
         * Adds a single [Selector] to [selectors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelector(selector: Selector) = apply { body.addSelector(selector) }

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
         * Returns an immutable instance of [ContractRetrieveRateScheduleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractRetrieveRateScheduleParams =
            ContractRetrieveRateScheduleParams(
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
        private val contractId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val at: JsonField<OffsetDateTime>,
        private val selectors: JsonField<List<Selector>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("at") @ExcludeMissing at: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("selectors")
            @ExcludeMissing
            selectors: JsonField<List<Selector>> = JsonMissing.of(),
        ) : this(contractId, customerId, at, selectors, mutableMapOf())

        /**
         * ID of the contract to get the rate schedule for.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * ID of the customer for whose contract to get the rate schedule for.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun at(): Optional<OffsetDateTime> = at.getOptional("at")

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selectors(): Optional<List<Selector>> = selectors.getOptional("selectors")

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [at].
         *
         * Unlike [at], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("at") @ExcludeMissing fun _at(): JsonField<OffsetDateTime> = at

        /**
         * Returns the raw JSON value of [selectors].
         *
         * Unlike [selectors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selectors")
        @ExcludeMissing
        fun _selectors(): JsonField<List<Selector>> = selectors

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
             * .contractId()
             * .customerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var at: JsonField<OffsetDateTime> = JsonMissing.of()
            private var selectors: JsonField<MutableList<Selector>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contractId = body.contractId
                customerId = body.customerId
                at = body.at
                selectors = body.selectors.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the contract to get the rate schedule for. */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** ID of the customer for whose contract to get the rate schedule for. */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * optional timestamp which overlaps with the returned rate schedule segments. When not
             * specified, the current timestamp will be used.
             */
            fun at(at: OffsetDateTime) = at(JsonField.of(at))

            /**
             * Sets [Builder.at] to an arbitrary JSON value.
             *
             * You should usually call [Builder.at] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun at(at: JsonField<OffsetDateTime>) = apply { this.at = at }

            /**
             * List of rate selectors, rates matching ANY of the selectors will be included in the
             * response. Passing no selectors will result in all rates being returned.
             */
            fun selectors(selectors: List<Selector>) = selectors(JsonField.of(selectors))

            /**
             * Sets [Builder.selectors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selectors] with a well-typed `List<Selector>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun selectors(selectors: JsonField<List<Selector>>) = apply {
                this.selectors = selectors.map { it.toMutableList() }
            }

            /**
             * Adds a single [Selector] to [selectors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSelector(selector: Selector) = apply {
                selectors =
                    (selectors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("selectors", it).add(selector)
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
             * .contractId()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    at,
                    (selectors ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            at()
            selectors().ifPresent { it.forEach { it.validate() } }
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
            (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (at.asKnown().isPresent) 1 else 0) +
                (selectors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contractId == other.contractId &&
                customerId == other.customerId &&
                at == other.at &&
                selectors == other.selectors &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contractId, customerId, at, selectors, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contractId=$contractId, customerId=$customerId, at=$at, selectors=$selectors, additionalProperties=$additionalProperties}"
    }

    class Selector
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingFrequency: JsonField<BillingFrequency>,
        private val partialPricingGroupValues: JsonField<PartialPricingGroupValues>,
        private val pricingGroupValues: JsonField<PricingGroupValues>,
        private val productId: JsonField<String>,
        private val productTags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
            @JsonProperty("partial_pricing_group_values")
            @ExcludeMissing
            partialPricingGroupValues: JsonField<PartialPricingGroupValues> = JsonMissing.of(),
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_tags")
            @ExcludeMissing
            productTags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            billingFrequency,
            partialPricingGroupValues,
            pricingGroupValues,
            productId,
            productTags,
            mutableMapOf(),
        )

        /**
         * Subscription rates matching the billing frequency will be included in the response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingFrequency(): Optional<BillingFrequency> =
            billingFrequency.getOptional("billing_frequency")

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun partialPricingGroupValues(): Optional<PartialPricingGroupValues> =
            partialPricingGroupValues.getOptional("partial_pricing_group_values")

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            pricingGroupValues.getOptional("pricing_group_values")

        /**
         * Rates matching the product id will be included in the response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("product_id")

        /**
         * List of product tags, rates matching any of the tags will be included in the response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productTags(): Optional<List<String>> = productTags.getOptional("product_tags")

        /**
         * Returns the raw JSON value of [billingFrequency].
         *
         * Unlike [billingFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_frequency")
        @ExcludeMissing
        fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

        /**
         * Returns the raw JSON value of [partialPricingGroupValues].
         *
         * Unlike [partialPricingGroupValues], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("partial_pricing_group_values")
        @ExcludeMissing
        fun _partialPricingGroupValues(): JsonField<PartialPricingGroupValues> =
            partialPricingGroupValues

        /**
         * Returns the raw JSON value of [pricingGroupValues].
         *
         * Unlike [pricingGroupValues], this method doesn't throw if the JSON field has an
         * unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Selector]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Selector]. */
        class Builder internal constructor() {

            private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
            private var partialPricingGroupValues: JsonField<PartialPricingGroupValues> =
                JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var productTags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(selector: Selector) = apply {
                billingFrequency = selector.billingFrequency
                partialPricingGroupValues = selector.partialPricingGroupValues
                pricingGroupValues = selector.pricingGroupValues
                productId = selector.productId
                productTags = selector.productTags.map { it.toMutableList() }
                additionalProperties = selector.additionalProperties.toMutableMap()
            }

            /**
             * Subscription rates matching the billing frequency will be included in the response.
             */
            fun billingFrequency(billingFrequency: BillingFrequency) =
                billingFrequency(JsonField.of(billingFrequency))

            /**
             * Sets [Builder.billingFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingFrequency] with a well-typed
             * [BillingFrequency] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                this.billingFrequency = billingFrequency
            }

            /**
             * List of pricing group key value pairs, rates containing the matching key / value
             * pairs will be included in the response.
             */
            fun partialPricingGroupValues(partialPricingGroupValues: PartialPricingGroupValues) =
                partialPricingGroupValues(JsonField.of(partialPricingGroupValues))

            /**
             * Sets [Builder.partialPricingGroupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partialPricingGroupValues] with a well-typed
             * [PartialPricingGroupValues] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun partialPricingGroupValues(
                partialPricingGroupValues: JsonField<PartialPricingGroupValues>
            ) = apply { this.partialPricingGroupValues = partialPricingGroupValues }

            /**
             * List of pricing group key value pairs, rates matching all of the key / value pairs
             * will be included in the response.
             */
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            /**
             * Sets [Builder.pricingGroupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingGroupValues] with a well-typed
             * [PricingGroupValues] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** Rates matching the product id will be included in the response. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * List of product tags, rates matching any of the tags will be included in the
             * response.
             */
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
             * Returns an immutable instance of [Selector].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Selector =
                Selector(
                    billingFrequency,
                    partialPricingGroupValues,
                    pricingGroupValues,
                    productId,
                    (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Selector = apply {
            if (validated) {
                return@apply
            }

            billingFrequency().ifPresent { it.validate() }
            partialPricingGroupValues().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (partialPricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                (pricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (productTags.asKnown().getOrNull()?.size ?: 0)

        /** Subscription rates matching the billing frequency will be included in the response. */
        class BillingFrequency
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val QUARTERLY = of("QUARTERLY")

                @JvmField val ANNUAL = of("ANNUAL")

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
            }

            /** An enum containing [BillingFrequency]'s known values. */
            enum class Known {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
            }

            /**
             * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BillingFrequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
                /**
                 * An enum member indicating that [BillingFrequency] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    WEEKLY -> Value.WEEKLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    WEEKLY -> Known.WEEKLY
                    else -> throw MetronomeInvalidDataException("Unknown BillingFrequency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): BillingFrequency = apply {
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

                return other is BillingFrequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        class PartialPricingGroupValues
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
                 * Returns a mutable builder for constructing an instance of
                 * [PartialPricingGroupValues].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PartialPricingGroupValues]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(partialPricingGroupValues: PartialPricingGroupValues) = apply {
                    additionalProperties =
                        partialPricingGroupValues.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PartialPricingGroupValues].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PartialPricingGroupValues =
                    PartialPricingGroupValues(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): PartialPricingGroupValues = apply {
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

                return other is PartialPricingGroupValues &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PartialPricingGroupValues{additionalProperties=$additionalProperties}"
        }

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
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

                /**
                 * Returns a mutable builder for constructing an instance of [PricingGroupValues].
                 */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PricingGroupValues].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toImmutable())
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

                return other is PricingGroupValues &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Selector &&
                billingFrequency == other.billingFrequency &&
                partialPricingGroupValues == other.partialPricingGroupValues &&
                pricingGroupValues == other.pricingGroupValues &&
                productId == other.productId &&
                productTags == other.productTags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingFrequency,
                partialPricingGroupValues,
                pricingGroupValues,
                productId,
                productTags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Selector{billingFrequency=$billingFrequency, partialPricingGroupValues=$partialPricingGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractRetrieveRateScheduleParams &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractRetrieveRateScheduleParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
