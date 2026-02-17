// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

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
 *
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
 * - **Draft invoice handling**: Use `invoice_inclusion_mode` to control whether pending draft
 *   invoice deductions are included (`FINALIZED_AND_DRAFT`, the default) or excluded (`FINALIZED`)
 *   from the balance calculation
 * - **Account hierarchies**: When querying a child customer, shared commits from parent contracts
 *   are not included — query the parent customer directly to see shared commit balances
 * - **Negative balances**: Manual ledger entries can cause negative segment balances; these are
 *   treated as zero when calculating the net balance
 * - **Credit types**: If `credit_type_id` is not specified, the balance defaults to USD (cents)
 */
class V1ContractGetNetBalanceParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The ID of the customer. */
    fun customerId(): String = body.customerId()

    /**
     * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
     * Defaults to USD (cents) if not specified.
     */
    fun creditTypeId(): Optional<String> = body.creditTypeId()

    /**
     * Balance filters are OR'd together, so if a given commit or credit matches any of the filters,
     * it will be included in the net balance.
     */
    fun filters(): Optional<List<BalanceFilter>> = body.filters()

    /**
     * Controls which invoices are considered when calculating the remaining balance. `FINALIZED`
     * considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also includes
     * deductions from pending draft invoices.
     */
    fun invoiceInclusionMode(): Optional<InvoiceInclusionMode> = body.invoiceInclusionMode()

    /** The ID of the customer. */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
     * Defaults to USD (cents) if not specified.
     */
    fun _creditTypeId(): JsonField<String> = body._creditTypeId()

    /**
     * Balance filters are OR'd together, so if a given commit or credit matches any of the filters,
     * it will be included in the net balance.
     */
    fun _filters(): JsonField<List<BalanceFilter>> = body._filters()

    /**
     * Controls which invoices are considered when calculating the remaining balance. `FINALIZED`
     * considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also includes
     * deductions from pending draft invoices.
     */
    fun _invoiceInclusionMode(): JsonField<InvoiceInclusionMode> = body._invoiceInclusionMode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        private val filters: JsonField<List<BalanceFilter>> = JsonMissing.of(),
        @JsonProperty("invoice_inclusion_mode")
        @ExcludeMissing
        private val invoiceInclusionMode: JsonField<InvoiceInclusionMode> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the customer. */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
         * Defaults to USD (cents) if not specified.
         */
        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

        /**
         * Balance filters are OR'd together, so if a given commit or credit matches any of the
         * filters, it will be included in the net balance.
         */
        fun filters(): Optional<List<BalanceFilter>> =
            Optional.ofNullable(filters.getNullable("filters"))

        /**
         * Controls which invoices are considered when calculating the remaining balance.
         * `FINALIZED` considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also
         * includes deductions from pending draft invoices.
         */
        fun invoiceInclusionMode(): Optional<InvoiceInclusionMode> =
            Optional.ofNullable(invoiceInclusionMode.getNullable("invoice_inclusion_mode"))

        /** The ID of the customer. */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
         * Defaults to USD (cents) if not specified.
         */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Balance filters are OR'd together, so if a given commit or credit matches any of the
         * filters, it will be included in the net balance.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<List<BalanceFilter>> = filters

        /**
         * Controls which invoices are considered when calculating the remaining balance.
         * `FINALIZED` considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also
         * includes deductions from pending draft invoices.
         */
        @JsonProperty("invoice_inclusion_mode")
        @ExcludeMissing
        fun _invoiceInclusionMode(): JsonField<InvoiceInclusionMode> = invoiceInclusionMode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerId()
            creditTypeId()
            filters().ifPresent { it.forEach { it.validate() } }
            invoiceInclusionMode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The ID of the customer. */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance
             * for. Defaults to USD (cents) if not specified.
             */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance
             * for. Defaults to USD (cents) if not specified.
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
             * Balance filters are OR'd together, so if a given commit or credit matches any of the
             * filters, it will be included in the net balance.
             */
            fun filters(filters: JsonField<List<BalanceFilter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Balance filters are OR'd together, so if a given commit or credit matches any of the
             * filters, it will be included in the net balance.
             */
            fun addFilter(filter: BalanceFilter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(filter)
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
             * Controls which invoices are considered when calculating the remaining balance.
             * `FINALIZED` considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT`
             * also includes deductions from pending draft invoices.
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

            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    creditTypeId,
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    invoiceInclusionMode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && customerId == other.customerId && creditTypeId == other.creditTypeId && filters == other.filters && invoiceInclusionMode == other.invoiceInclusionMode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, creditTypeId, filters, invoiceInclusionMode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, creditTypeId=$creditTypeId, filters=$filters, invoiceInclusionMode=$invoiceInclusionMode, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ContractGetNetBalanceParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ContractGetNetBalanceParams: V1ContractGetNetBalanceParams) = apply {
            body = v1ContractGetNetBalanceParams.body.toBuilder()
            additionalHeaders = v1ContractGetNetBalanceParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ContractGetNetBalanceParams.additionalQueryParams.toBuilder()
        }

        /** The ID of the customer. */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** The ID of the customer. */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
         * Defaults to USD (cents) if not specified.
         */
        fun creditTypeId(creditTypeId: String) = apply { body.creditTypeId(creditTypeId) }

        /**
         * The ID of the credit type (can be fiat or a custom pricing unit) to get the balance for.
         * Defaults to USD (cents) if not specified.
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
         * Balance filters are OR'd together, so if a given commit or credit matches any of the
         * filters, it will be included in the net balance.
         */
        fun filters(filters: JsonField<List<BalanceFilter>>) = apply { body.filters(filters) }

        /**
         * Balance filters are OR'd together, so if a given commit or credit matches any of the
         * filters, it will be included in the net balance.
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
         * Controls which invoices are considered when calculating the remaining balance.
         * `FINALIZED` considers only deductions from finalized invoices. `FINALIZED_AND_DRAFT` also
         * includes deductions from pending draft invoices.
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

        fun build(): V1ContractGetNetBalanceParams =
            V1ContractGetNetBalanceParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceInclusionMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1ContractGetNetBalanceParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1ContractGetNetBalanceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
