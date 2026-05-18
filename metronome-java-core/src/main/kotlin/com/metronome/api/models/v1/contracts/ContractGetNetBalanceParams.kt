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
import com.metronome.api.models.BalanceFilter
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve the combined current balance across any grouping of credits and commits for a customer
 * in a single API call.
 * - Display real-time available balance to customers in billing dashboards
 * - Build finance dashboards showing credit utilization across customer segments
 * - Validate expected vs. actual balance during billing reconciliation
 *
 * ### Key response fields:
 * - `balance`: The combined net balance available to use at this moment across all matching commits
 *   and credits
 * - `credit_type_id`: The credit type (fiat or custom pricing unit) the balance is denominated in
 *
 * ### Filtering options:
 * Balance filters allow you to scope the calculation to specific subsets of commits and credits.
 * When using multiple filter objects, they are OR'd together — if a commit or credit matches any
 * filter, it's included in the net balance. Within a single filter object, all specified conditions
 * are AND'd together.
 * - **Balance types**: Include any combination of `PREPAID_COMMIT`, `POSTPAID_COMMIT`, and `CREDIT`
 *   (e.g., `["PREPAID_COMMIT", "CREDIT"]` to exclude postpaid commits). If not specified, all
 *   balance types are included.
 * - **Specific IDs**: Target exact commit or credit IDs for precise balance queries
 * - **Custom fields**: Filter by custom field key-value pairs; when multiple pairs are provided,
 *   commits must match all of them
 *
 * **Example**: To get the balance of all free-trial credits OR all signup-promotion commits, you'd
 * pass two filter objects — one filtering for CREDIT with custom field campaign: free-trial, and
 * another filtering for PREPAID_COMMIT with custom field campaign: signup-promotion.
 *
 * ### Usage guidelines:
 * - **Balance ledger details**: Use the
 *   [listBalances](https://docs.metronome.com/api-reference/credits-and-commits/list-balances)
 *   endpoint instead to understand detailed ledger drawdowns for each individual balance
 * - **Draft invoice handling**: Use `invoice_inclusion_mode` to control whether pending draft
 *   invoice deductions are included (`FINALIZED_AND_DRAFT`, the default) or excluded (`FINALIZED`)
 *   from the balance calculation
 * - **Account hierarchies**: When querying a child customer, shared commits from parent contracts
 *   are not included — query the parent customer directly to see shared commit balances
 * - **Negative balances**: Manual ledger entries can cause negative segment balances; these are
 *   treated as zero when calculating the net balance
 * - **Credit types**: If `credit_type_id` is not specified, the balance defaults to USD (cents)
 */
class ContractGetNetBalanceParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the customer.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
     * Defaults to USD (cents) if not specified.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditTypeId(): Optional<String> = body.creditTypeId()

    /**
     * Balance filters are OR'd together, so if a given commit or credit matches any of the filters,
     * it will be included in the net balance.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<BalanceFilter>> = body.filters()

    /**
     * Controls which invoices are considered when calculating the remaining balance. `FINALIZED`
     * considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also includes
     * deductions from pending draft invoices.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceInclusionMode(): Optional<InvoiceInclusionMode> = body.invoiceInclusionMode()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [creditTypeId].
     *
     * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditTypeId(): JsonField<String> = body._creditTypeId()

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filters(): JsonField<List<BalanceFilter>> = body._filters()

    /**
     * Returns the raw JSON value of [invoiceInclusionMode].
     *
     * Unlike [invoiceInclusionMode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoiceInclusionMode(): JsonField<InvoiceInclusionMode> = body._invoiceInclusionMode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractGetNetBalanceParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractGetNetBalanceParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractGetNetBalanceParams: ContractGetNetBalanceParams) = apply {
            body = contractGetNetBalanceParams.body.toBuilder()
            additionalHeaders = contractGetNetBalanceParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractGetNetBalanceParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [creditTypeId]
         * - [filters]
         * - [invoiceInclusionMode]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The ID of the customer. */
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
         * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
         * Defaults to USD (cents) if not specified.
         */
        fun creditTypeId(creditTypeId: String) = apply { body.creditTypeId(creditTypeId) }

        /**
         * Sets [Builder.creditTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
            body.creditTypeId(creditTypeId)
        }

        /**
         * Balance filters are OR'd together, so if a given commit or credit matches any of the
         * filters, it will be included in the net balance.
         */
        fun filters(filters: List<BalanceFilter>) = apply { body.filters(filters) }

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<BalanceFilter>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filters(filters: JsonField<List<BalanceFilter>>) = apply { body.filters(filters) }

        /**
         * Adds a single [BalanceFilter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: BalanceFilter) = apply { body.addFilter(filter) }

        /**
         * Controls which invoices are considered when calculating the remaining balance.
         * `FINALIZED` considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also
         * includes deductions from pending draft invoices.
         */
        fun invoiceInclusionMode(invoiceInclusionMode: InvoiceInclusionMode) = apply {
            body.invoiceInclusionMode(invoiceInclusionMode)
        }

        /**
         * Sets [Builder.invoiceInclusionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceInclusionMode] with a well-typed
         * [InvoiceInclusionMode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun invoiceInclusionMode(invoiceInclusionMode: JsonField<InvoiceInclusionMode>) = apply {
            body.invoiceInclusionMode(invoiceInclusionMode)
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
         * Returns an immutable instance of [ContractGetNetBalanceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractGetNetBalanceParams =
            ContractGetNetBalanceParams(
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
        private val creditTypeId: JsonField<String>,
        private val filters: JsonField<List<BalanceFilter>>,
        private val invoiceInclusionMode: JsonField<InvoiceInclusionMode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<BalanceFilter>> = JsonMissing.of(),
            @JsonProperty("invoice_inclusion_mode")
            @ExcludeMissing
            invoiceInclusionMode: JsonField<InvoiceInclusionMode> = JsonMissing.of(),
        ) : this(customerId, creditTypeId, filters, invoiceInclusionMode, mutableMapOf())

        /**
         * The ID of the customer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
         * Defaults to USD (cents) if not specified.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

        /**
         * Balance filters are OR'd together, so if a given commit or credit matches any of the
         * filters, it will be included in the net balance.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filters(): Optional<List<BalanceFilter>> = filters.getOptional("filters")

        /**
         * Controls which invoices are considered when calculating the remaining balance.
         * `FINALIZED` considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also
         * includes deductions from pending draft invoices.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceInclusionMode(): Optional<InvoiceInclusionMode> =
            invoiceInclusionMode.getOptional("invoice_inclusion_mode")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [creditTypeId].
         *
         * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<List<BalanceFilter>> = filters

        /**
         * Returns the raw JSON value of [invoiceInclusionMode].
         *
         * Unlike [invoiceInclusionMode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoice_inclusion_mode")
        @ExcludeMissing
        fun _invoiceInclusionMode(): JsonField<InvoiceInclusionMode> = invoiceInclusionMode

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var filters: JsonField<MutableList<BalanceFilter>>? = null
            private var invoiceInclusionMode: JsonField<InvoiceInclusionMode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                creditTypeId = body.creditTypeId
                filters = body.filters.map { it.toMutableList() }
                invoiceInclusionMode = body.invoiceInclusionMode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The ID of the customer. */
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
             * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance
             * for. Defaults to USD (cents) if not specified.
             */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * Sets [Builder.creditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            /**
             * Balance filters are OR'd together, so if a given commit or credit matches any of the
             * filters, it will be included in the net balance.
             */
            fun filters(filters: List<BalanceFilter>) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<BalanceFilter>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun filters(filters: JsonField<List<BalanceFilter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [BalanceFilter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: BalanceFilter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            /**
             * Controls which invoices are considered when calculating the remaining balance.
             * `FINALIZED` considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT`
             * also includes deductions from pending draft invoices.
             */
            fun invoiceInclusionMode(invoiceInclusionMode: InvoiceInclusionMode) =
                invoiceInclusionMode(JsonField.of(invoiceInclusionMode))

            /**
             * Sets [Builder.invoiceInclusionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceInclusionMode] with a well-typed
             * [InvoiceInclusionMode] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun invoiceInclusionMode(invoiceInclusionMode: JsonField<InvoiceInclusionMode>) =
                apply {
                    this.invoiceInclusionMode = invoiceInclusionMode
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    creditTypeId,
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    invoiceInclusionMode,
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

            customerId()
            creditTypeId()
            filters().ifPresent { it.forEach { it.validate() } }
            invoiceInclusionMode().ifPresent { it.validate() }
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
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (invoiceInclusionMode.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerId == other.customerId &&
                creditTypeId == other.creditTypeId &&
                filters == other.filters &&
                invoiceInclusionMode == other.invoiceInclusionMode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                creditTypeId,
                filters,
                invoiceInclusionMode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, creditTypeId=$creditTypeId, filters=$filters, invoiceInclusionMode=$invoiceInclusionMode, additionalProperties=$additionalProperties}"
    }

    /**
     * Controls which invoices are considered when calculating the remaining balance. `FINALIZED`
     * considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also includes
     * deductions from pending draft invoices.
     */
    class InvoiceInclusionMode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FINALIZED = of("FINALIZED")

            @JvmField val FINALIZED_AND_DRAFT = of("FINALIZED_AND_DRAFT")

            @JvmStatic fun of(value: String) = InvoiceInclusionMode(JsonField.of(value))
        }

        /** An enum containing [InvoiceInclusionMode]'s known values. */
        enum class Known {
            FINALIZED,
            FINALIZED_AND_DRAFT,
        }

        /**
         * An enum containing [InvoiceInclusionMode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [InvoiceInclusionMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FINALIZED,
            FINALIZED_AND_DRAFT,
            /**
             * An enum member indicating that [InvoiceInclusionMode] was instantiated with an
             * unknown value.
             */
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
                FINALIZED -> Value.FINALIZED
                FINALIZED_AND_DRAFT -> Value.FINALIZED_AND_DRAFT
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
                FINALIZED -> Known.FINALIZED
                FINALIZED_AND_DRAFT -> Known.FINALIZED_AND_DRAFT
                else -> throw MetronomeInvalidDataException("Unknown InvoiceInclusionMode: $value")
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
        fun validate(): InvoiceInclusionMode = apply {
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

            return other is InvoiceInclusionMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractGetNetBalanceParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractGetNetBalanceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
