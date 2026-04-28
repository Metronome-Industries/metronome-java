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
 * Create historical usage invoices for past billing periods on specific contracts. Use this
 * endpoint to generate retroactive invoices with custom usage line items, quantities, and date
 * ranges. Supports preview mode to validate invoice data before creation. Ideal for billing
 * migrations or correcting past billing periods.
 */
class ContractCreateHistoricalInvoicesParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoices(): List<Invoice> = body.invoices()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun preview(): Boolean = body.preview()

    /**
     * Returns the raw JSON value of [invoices].
     *
     * Unlike [invoices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoices(): JsonField<List<Invoice>> = body._invoices()

    /**
     * Returns the raw JSON value of [preview].
     *
     * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preview(): JsonField<Boolean> = body._preview()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractCreateHistoricalInvoicesParams].
         *
         * The following fields are required:
         * ```java
         * .invoices()
         * .preview()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractCreateHistoricalInvoicesParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractCreateHistoricalInvoicesParams: ContractCreateHistoricalInvoicesParams
        ) = apply {
            body = contractCreateHistoricalInvoicesParams.body.toBuilder()
            additionalHeaders = contractCreateHistoricalInvoicesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractCreateHistoricalInvoicesParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [invoices]
         * - [preview]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun invoices(invoices: List<Invoice>) = apply { body.invoices(invoices) }

        /**
         * Sets [Builder.invoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoices] with a well-typed `List<Invoice>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoices(invoices: JsonField<List<Invoice>>) = apply { body.invoices(invoices) }

        /**
         * Adds a single [Invoice] to [invoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInvoice(invoice: Invoice) = apply { body.addInvoice(invoice) }

        fun preview(preview: Boolean) = apply { body.preview(preview) }

        /**
         * Sets [Builder.preview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preview] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun preview(preview: JsonField<Boolean>) = apply { body.preview(preview) }

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
         * Returns an immutable instance of [ContractCreateHistoricalInvoicesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .invoices()
         * .preview()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractCreateHistoricalInvoicesParams =
            ContractCreateHistoricalInvoicesParams(
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
        private val invoices: JsonField<List<Invoice>>,
        private val preview: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("invoices")
            @ExcludeMissing
            invoices: JsonField<List<Invoice>> = JsonMissing.of(),
            @JsonProperty("preview") @ExcludeMissing preview: JsonField<Boolean> = JsonMissing.of(),
        ) : this(invoices, preview, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoices(): List<Invoice> = invoices.getRequired("invoices")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun preview(): Boolean = preview.getRequired("preview")

        /**
         * Returns the raw JSON value of [invoices].
         *
         * Unlike [invoices], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoices")
        @ExcludeMissing
        fun _invoices(): JsonField<List<Invoice>> = invoices

        /**
         * Returns the raw JSON value of [preview].
         *
         * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<Boolean> = preview

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
             * .invoices()
             * .preview()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var invoices: JsonField<MutableList<Invoice>>? = null
            private var preview: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                invoices = body.invoices.map { it.toMutableList() }
                preview = body.preview
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun invoices(invoices: List<Invoice>) = invoices(JsonField.of(invoices))

            /**
             * Sets [Builder.invoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoices] with a well-typed `List<Invoice>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoices(invoices: JsonField<List<Invoice>>) = apply {
                this.invoices = invoices.map { it.toMutableList() }
            }

            /**
             * Adds a single [Invoice] to [invoices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInvoice(invoice: Invoice) = apply {
                invoices =
                    (invoices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("invoices", it).add(invoice)
                    }
            }

            fun preview(preview: Boolean) = preview(JsonField.of(preview))

            /**
             * Sets [Builder.preview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preview] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preview(preview: JsonField<Boolean>) = apply { this.preview = preview }

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
             * .invoices()
             * .preview()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("invoices", invoices).map { it.toImmutable() },
                    checkRequired("preview", preview),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            invoices().forEach { it.validate() }
            preview()
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
            (invoices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (preview.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                invoices == other.invoices &&
                preview == other.preview &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(invoices, preview, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{invoices=$invoices, preview=$preview, additionalProperties=$additionalProperties}"
    }

    class Invoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contractId: JsonField<String>,
        private val creditTypeId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val exclusiveEndDate: JsonField<OffsetDateTime>,
        private val inclusiveStartDate: JsonField<OffsetDateTime>,
        private val issueDate: JsonField<OffsetDateTime>,
        private val usageLineItems: JsonField<List<UsageLineItem>>,
        private val billableStatus: JsonField<BillableStatus>,
        private val breakdownGranularity: JsonField<BreakdownGranularity>,
        private val customFields: JsonField<CustomFields>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exclusive_end_date")
            @ExcludeMissing
            exclusiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("inclusive_start_date")
            @ExcludeMissing
            inclusiveStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("issue_date")
            @ExcludeMissing
            issueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usage_line_items")
            @ExcludeMissing
            usageLineItems: JsonField<List<UsageLineItem>> = JsonMissing.of(),
            @JsonProperty("billable_status")
            @ExcludeMissing
            billableStatus: JsonField<BillableStatus> = JsonMissing.of(),
            @JsonProperty("breakdown_granularity")
            @ExcludeMissing
            breakdownGranularity: JsonField<BreakdownGranularity> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
        ) : this(
            contractId,
            creditTypeId,
            customerId,
            exclusiveEndDate,
            inclusiveStartDate,
            issueDate,
            usageLineItems,
            billableStatus,
            breakdownGranularity,
            customFields,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exclusiveEndDate(): OffsetDateTime = exclusiveEndDate.getRequired("exclusive_end_date")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inclusiveStartDate(): OffsetDateTime =
            inclusiveStartDate.getRequired("inclusive_start_date")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun issueDate(): OffsetDateTime = issueDate.getRequired("issue_date")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usageLineItems(): List<UsageLineItem> = usageLineItems.getRequired("usage_line_items")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billableStatus(): Optional<BillableStatus> =
            billableStatus.getOptional("billable_status")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun breakdownGranularity(): Optional<BreakdownGranularity> =
            breakdownGranularity.getOptional("breakdown_granularity")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

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
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [exclusiveEndDate].
         *
         * Unlike [exclusiveEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exclusive_end_date")
        @ExcludeMissing
        fun _exclusiveEndDate(): JsonField<OffsetDateTime> = exclusiveEndDate

        /**
         * Returns the raw JSON value of [inclusiveStartDate].
         *
         * Unlike [inclusiveStartDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inclusive_start_date")
        @ExcludeMissing
        fun _inclusiveStartDate(): JsonField<OffsetDateTime> = inclusiveStartDate

        /**
         * Returns the raw JSON value of [issueDate].
         *
         * Unlike [issueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issue_date")
        @ExcludeMissing
        fun _issueDate(): JsonField<OffsetDateTime> = issueDate

        /**
         * Returns the raw JSON value of [usageLineItems].
         *
         * Unlike [usageLineItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usage_line_items")
        @ExcludeMissing
        fun _usageLineItems(): JsonField<List<UsageLineItem>> = usageLineItems

        /**
         * Returns the raw JSON value of [billableStatus].
         *
         * Unlike [billableStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billable_status")
        @ExcludeMissing
        fun _billableStatus(): JsonField<BillableStatus> = billableStatus

        /**
         * Returns the raw JSON value of [breakdownGranularity].
         *
         * Unlike [breakdownGranularity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("breakdown_granularity")
        @ExcludeMissing
        fun _breakdownGranularity(): JsonField<BreakdownGranularity> = breakdownGranularity

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

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
             * Returns a mutable builder for constructing an instance of [Invoice].
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .creditTypeId()
             * .customerId()
             * .exclusiveEndDate()
             * .inclusiveStartDate()
             * .issueDate()
             * .usageLineItems()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Invoice]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var creditTypeId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var exclusiveEndDate: JsonField<OffsetDateTime>? = null
            private var inclusiveStartDate: JsonField<OffsetDateTime>? = null
            private var issueDate: JsonField<OffsetDateTime>? = null
            private var usageLineItems: JsonField<MutableList<UsageLineItem>>? = null
            private var billableStatus: JsonField<BillableStatus> = JsonMissing.of()
            private var breakdownGranularity: JsonField<BreakdownGranularity> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoice: Invoice) = apply {
                contractId = invoice.contractId
                creditTypeId = invoice.creditTypeId
                customerId = invoice.customerId
                exclusiveEndDate = invoice.exclusiveEndDate
                inclusiveStartDate = invoice.inclusiveStartDate
                issueDate = invoice.issueDate
                usageLineItems = invoice.usageLineItems.map { it.toMutableList() }
                billableStatus = invoice.billableStatus
                breakdownGranularity = invoice.breakdownGranularity
                customFields = invoice.customFields
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

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

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) =
                exclusiveEndDate(JsonField.of(exclusiveEndDate))

            /**
             * Sets [Builder.exclusiveEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exclusiveEndDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun exclusiveEndDate(exclusiveEndDate: JsonField<OffsetDateTime>) = apply {
                this.exclusiveEndDate = exclusiveEndDate
            }

            fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) =
                inclusiveStartDate(JsonField.of(inclusiveStartDate))

            /**
             * Sets [Builder.inclusiveStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inclusiveStartDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inclusiveStartDate(inclusiveStartDate: JsonField<OffsetDateTime>) = apply {
                this.inclusiveStartDate = inclusiveStartDate
            }

            fun issueDate(issueDate: OffsetDateTime) = issueDate(JsonField.of(issueDate))

            /**
             * Sets [Builder.issueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issueDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issueDate(issueDate: JsonField<OffsetDateTime>) = apply {
                this.issueDate = issueDate
            }

            fun usageLineItems(usageLineItems: List<UsageLineItem>) =
                usageLineItems(JsonField.of(usageLineItems))

            /**
             * Sets [Builder.usageLineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageLineItems] with a well-typed
             * `List<UsageLineItem>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun usageLineItems(usageLineItems: JsonField<List<UsageLineItem>>) = apply {
                this.usageLineItems = usageLineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [UsageLineItem] to [usageLineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsageLineItem(usageLineItem: UsageLineItem) = apply {
                usageLineItems =
                    (usageLineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usageLineItems", it).add(usageLineItem)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun billableStatus(billableStatus: BillableStatus) =
                billableStatus(JsonField.of(billableStatus))

            /**
             * Sets [Builder.billableStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billableStatus] with a well-typed [BillableStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billableStatus(billableStatus: JsonField<BillableStatus>) = apply {
                this.billableStatus = billableStatus
            }

            fun breakdownGranularity(breakdownGranularity: BreakdownGranularity) =
                breakdownGranularity(JsonField.of(breakdownGranularity))

            /**
             * Sets [Builder.breakdownGranularity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.breakdownGranularity] with a well-typed
             * [BreakdownGranularity] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun breakdownGranularity(breakdownGranularity: JsonField<BreakdownGranularity>) =
                apply {
                    this.breakdownGranularity = breakdownGranularity
                }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
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
             * Returns an immutable instance of [Invoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .creditTypeId()
             * .customerId()
             * .exclusiveEndDate()
             * .inclusiveStartDate()
             * .issueDate()
             * .usageLineItems()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Invoice =
                Invoice(
                    checkRequired("contractId", contractId),
                    checkRequired("creditTypeId", creditTypeId),
                    checkRequired("customerId", customerId),
                    checkRequired("exclusiveEndDate", exclusiveEndDate),
                    checkRequired("inclusiveStartDate", inclusiveStartDate),
                    checkRequired("issueDate", issueDate),
                    checkRequired("usageLineItems", usageLineItems).map { it.toImmutable() },
                    billableStatus,
                    breakdownGranularity,
                    customFields,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Invoice = apply {
            if (validated) {
                return@apply
            }

            contractId()
            creditTypeId()
            customerId()
            exclusiveEndDate()
            inclusiveStartDate()
            issueDate()
            usageLineItems().forEach { it.validate() }
            billableStatus().ifPresent { it.validate() }
            breakdownGranularity().ifPresent { it.validate() }
            customFields().ifPresent { it.validate() }
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
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (exclusiveEndDate.asKnown().isPresent) 1 else 0) +
                (if (inclusiveStartDate.asKnown().isPresent) 1 else 0) +
                (if (issueDate.asKnown().isPresent) 1 else 0) +
                (usageLineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (billableStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (breakdownGranularity.asKnown().getOrNull()?.validity() ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0)

        class UsageLineItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val exclusiveEndDate: JsonField<OffsetDateTime>,
            private val inclusiveStartDate: JsonField<OffsetDateTime>,
            private val productId: JsonField<String>,
            private val presentationGroupValues: JsonField<PresentationGroupValues>,
            private val pricingGroupValues: JsonField<PricingGroupValues>,
            private val quantity: JsonField<Double>,
            private val subtotalsWithQuantity: JsonField<List<SubtotalsWithQuantity>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("exclusive_end_date")
                @ExcludeMissing
                exclusiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("inclusive_start_date")
                @ExcludeMissing
                inclusiveStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("presentation_group_values")
                @ExcludeMissing
                presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
                @JsonProperty("pricing_group_values")
                @ExcludeMissing
                pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("subtotals_with_quantity")
                @ExcludeMissing
                subtotalsWithQuantity: JsonField<List<SubtotalsWithQuantity>> = JsonMissing.of(),
            ) : this(
                exclusiveEndDate,
                inclusiveStartDate,
                productId,
                presentationGroupValues,
                pricingGroupValues,
                quantity,
                subtotalsWithQuantity,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun exclusiveEndDate(): OffsetDateTime =
                exclusiveEndDate.getRequired("exclusive_end_date")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inclusiveStartDate(): OffsetDateTime =
                inclusiveStartDate.getRequired("inclusive_start_date")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun productId(): String = productId.getRequired("product_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                presentationGroupValues.getOptional("presentation_group_values")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pricingGroupValues(): Optional<PricingGroupValues> =
                pricingGroupValues.getOptional("pricing_group_values")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Double> = quantity.getOptional("quantity")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun subtotalsWithQuantity(): Optional<List<SubtotalsWithQuantity>> =
                subtotalsWithQuantity.getOptional("subtotals_with_quantity")

            /**
             * Returns the raw JSON value of [exclusiveEndDate].
             *
             * Unlike [exclusiveEndDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("exclusive_end_date")
            @ExcludeMissing
            fun _exclusiveEndDate(): JsonField<OffsetDateTime> = exclusiveEndDate

            /**
             * Returns the raw JSON value of [inclusiveStartDate].
             *
             * Unlike [inclusiveStartDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inclusive_start_date")
            @ExcludeMissing
            fun _inclusiveStartDate(): JsonField<OffsetDateTime> = inclusiveStartDate

            /**
             * Returns the raw JSON value of [productId].
             *
             * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /**
             * Returns the raw JSON value of [presentationGroupValues].
             *
             * Unlike [presentationGroupValues], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun _presentationGroupValues(): JsonField<PresentationGroupValues> =
                presentationGroupValues

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
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [subtotalsWithQuantity].
             *
             * Unlike [subtotalsWithQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subtotals_with_quantity")
            @ExcludeMissing
            fun _subtotalsWithQuantity(): JsonField<List<SubtotalsWithQuantity>> =
                subtotalsWithQuantity

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
                 * Returns a mutable builder for constructing an instance of [UsageLineItem].
                 *
                 * The following fields are required:
                 * ```java
                 * .exclusiveEndDate()
                 * .inclusiveStartDate()
                 * .productId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UsageLineItem]. */
            class Builder internal constructor() {

                private var exclusiveEndDate: JsonField<OffsetDateTime>? = null
                private var inclusiveStartDate: JsonField<OffsetDateTime>? = null
                private var productId: JsonField<String>? = null
                private var presentationGroupValues: JsonField<PresentationGroupValues> =
                    JsonMissing.of()
                private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var subtotalsWithQuantity: JsonField<MutableList<SubtotalsWithQuantity>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usageLineItem: UsageLineItem) = apply {
                    exclusiveEndDate = usageLineItem.exclusiveEndDate
                    inclusiveStartDate = usageLineItem.inclusiveStartDate
                    productId = usageLineItem.productId
                    presentationGroupValues = usageLineItem.presentationGroupValues
                    pricingGroupValues = usageLineItem.pricingGroupValues
                    quantity = usageLineItem.quantity
                    subtotalsWithQuantity =
                        usageLineItem.subtotalsWithQuantity.map { it.toMutableList() }
                    additionalProperties = usageLineItem.additionalProperties.toMutableMap()
                }

                fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) =
                    exclusiveEndDate(JsonField.of(exclusiveEndDate))

                /**
                 * Sets [Builder.exclusiveEndDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exclusiveEndDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun exclusiveEndDate(exclusiveEndDate: JsonField<OffsetDateTime>) = apply {
                    this.exclusiveEndDate = exclusiveEndDate
                }

                fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) =
                    inclusiveStartDate(JsonField.of(inclusiveStartDate))

                /**
                 * Sets [Builder.inclusiveStartDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inclusiveStartDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun inclusiveStartDate(inclusiveStartDate: JsonField<OffsetDateTime>) = apply {
                    this.inclusiveStartDate = inclusiveStartDate
                }

                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    presentationGroupValues(JsonField.of(presentationGroupValues))

                /**
                 * Sets [Builder.presentationGroupValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.presentationGroupValues] with a well-typed
                 * [PresentationGroupValues] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun presentationGroupValues(
                    presentationGroupValues: JsonField<PresentationGroupValues>
                ) = apply { this.presentationGroupValues = presentationGroupValues }

                fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                    pricingGroupValues(JsonField.of(pricingGroupValues))

                /**
                 * Sets [Builder.pricingGroupValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pricingGroupValues] with a well-typed
                 * [PricingGroupValues] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun subtotalsWithQuantity(subtotalsWithQuantity: List<SubtotalsWithQuantity>) =
                    subtotalsWithQuantity(JsonField.of(subtotalsWithQuantity))

                /**
                 * Sets [Builder.subtotalsWithQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtotalsWithQuantity] with a well-typed
                 * `List<SubtotalsWithQuantity>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun subtotalsWithQuantity(
                    subtotalsWithQuantity: JsonField<List<SubtotalsWithQuantity>>
                ) = apply {
                    this.subtotalsWithQuantity = subtotalsWithQuantity.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SubtotalsWithQuantity] to [Builder.subtotalsWithQuantity].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSubtotalsWithQuantity(subtotalsWithQuantity: SubtotalsWithQuantity) = apply {
                    this.subtotalsWithQuantity =
                        (this.subtotalsWithQuantity ?: JsonField.of(mutableListOf())).also {
                            checkKnown("subtotalsWithQuantity", it).add(subtotalsWithQuantity)
                        }
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
                 * Returns an immutable instance of [UsageLineItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .exclusiveEndDate()
                 * .inclusiveStartDate()
                 * .productId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsageLineItem =
                    UsageLineItem(
                        checkRequired("exclusiveEndDate", exclusiveEndDate),
                        checkRequired("inclusiveStartDate", inclusiveStartDate),
                        checkRequired("productId", productId),
                        presentationGroupValues,
                        pricingGroupValues,
                        quantity,
                        (subtotalsWithQuantity ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsageLineItem = apply {
                if (validated) {
                    return@apply
                }

                exclusiveEndDate()
                inclusiveStartDate()
                productId()
                presentationGroupValues().ifPresent { it.validate() }
                pricingGroupValues().ifPresent { it.validate() }
                quantity()
                subtotalsWithQuantity().ifPresent { it.forEach { it.validate() } }
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
                (if (exclusiveEndDate.asKnown().isPresent) 1 else 0) +
                    (if (inclusiveStartDate.asKnown().isPresent) 1 else 0) +
                    (if (productId.asKnown().isPresent) 1 else 0) +
                    (presentationGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                    (pricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (subtotalsWithQuantity.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0)

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
                     * Returns a mutable builder for constructing an instance of
                     * [PresentationGroupValues].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PresentationGroupValues]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                        additionalProperties =
                            presentationGroupValues.additionalProperties.toMutableMap()
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PricingGroupValues].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PricingGroupValues]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                        additionalProperties =
                            pricingGroupValues.additionalProperties.toMutableMap()
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            class SubtotalsWithQuantity
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val exclusiveEndDate: JsonField<OffsetDateTime>,
                private val inclusiveStartDate: JsonField<OffsetDateTime>,
                private val quantity: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("exclusive_end_date")
                    @ExcludeMissing
                    exclusiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("inclusive_start_date")
                    @ExcludeMissing
                    inclusiveStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                ) : this(exclusiveEndDate, inclusiveStartDate, quantity, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun exclusiveEndDate(): OffsetDateTime =
                    exclusiveEndDate.getRequired("exclusive_end_date")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun inclusiveStartDate(): OffsetDateTime =
                    inclusiveStartDate.getRequired("inclusive_start_date")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * Returns the raw JSON value of [exclusiveEndDate].
                 *
                 * Unlike [exclusiveEndDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("exclusive_end_date")
                @ExcludeMissing
                fun _exclusiveEndDate(): JsonField<OffsetDateTime> = exclusiveEndDate

                /**
                 * Returns the raw JSON value of [inclusiveStartDate].
                 *
                 * Unlike [inclusiveStartDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("inclusive_start_date")
                @ExcludeMissing
                fun _inclusiveStartDate(): JsonField<OffsetDateTime> = inclusiveStartDate

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

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
                     * Returns a mutable builder for constructing an instance of
                     * [SubtotalsWithQuantity].
                     *
                     * The following fields are required:
                     * ```java
                     * .exclusiveEndDate()
                     * .inclusiveStartDate()
                     * .quantity()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SubtotalsWithQuantity]. */
                class Builder internal constructor() {

                    private var exclusiveEndDate: JsonField<OffsetDateTime>? = null
                    private var inclusiveStartDate: JsonField<OffsetDateTime>? = null
                    private var quantity: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(subtotalsWithQuantity: SubtotalsWithQuantity) = apply {
                        exclusiveEndDate = subtotalsWithQuantity.exclusiveEndDate
                        inclusiveStartDate = subtotalsWithQuantity.inclusiveStartDate
                        quantity = subtotalsWithQuantity.quantity
                        additionalProperties =
                            subtotalsWithQuantity.additionalProperties.toMutableMap()
                    }

                    fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) =
                        exclusiveEndDate(JsonField.of(exclusiveEndDate))

                    /**
                     * Sets [Builder.exclusiveEndDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.exclusiveEndDate] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun exclusiveEndDate(exclusiveEndDate: JsonField<OffsetDateTime>) = apply {
                        this.exclusiveEndDate = exclusiveEndDate
                    }

                    fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) =
                        inclusiveStartDate(JsonField.of(inclusiveStartDate))

                    /**
                     * Sets [Builder.inclusiveStartDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inclusiveStartDate] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun inclusiveStartDate(inclusiveStartDate: JsonField<OffsetDateTime>) = apply {
                        this.inclusiveStartDate = inclusiveStartDate
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
                     * Returns an immutable instance of [SubtotalsWithQuantity].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .exclusiveEndDate()
                     * .inclusiveStartDate()
                     * .quantity()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SubtotalsWithQuantity =
                        SubtotalsWithQuantity(
                            checkRequired("exclusiveEndDate", exclusiveEndDate),
                            checkRequired("inclusiveStartDate", inclusiveStartDate),
                            checkRequired("quantity", quantity),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SubtotalsWithQuantity = apply {
                    if (validated) {
                        return@apply
                    }

                    exclusiveEndDate()
                    inclusiveStartDate()
                    quantity()
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
                    (if (exclusiveEndDate.asKnown().isPresent) 1 else 0) +
                        (if (inclusiveStartDate.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SubtotalsWithQuantity &&
                        exclusiveEndDate == other.exclusiveEndDate &&
                        inclusiveStartDate == other.inclusiveStartDate &&
                        quantity == other.quantity &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        exclusiveEndDate,
                        inclusiveStartDate,
                        quantity,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SubtotalsWithQuantity{exclusiveEndDate=$exclusiveEndDate, inclusiveStartDate=$inclusiveStartDate, quantity=$quantity, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsageLineItem &&
                    exclusiveEndDate == other.exclusiveEndDate &&
                    inclusiveStartDate == other.inclusiveStartDate &&
                    productId == other.productId &&
                    presentationGroupValues == other.presentationGroupValues &&
                    pricingGroupValues == other.pricingGroupValues &&
                    quantity == other.quantity &&
                    subtotalsWithQuantity == other.subtotalsWithQuantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    exclusiveEndDate,
                    inclusiveStartDate,
                    productId,
                    presentationGroupValues,
                    pricingGroupValues,
                    quantity,
                    subtotalsWithQuantity,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageLineItem{exclusiveEndDate=$exclusiveEndDate, inclusiveStartDate=$inclusiveStartDate, productId=$productId, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, quantity=$quantity, subtotalsWithQuantity=$subtotalsWithQuantity, additionalProperties=$additionalProperties}"
        }

        /** This field's availability is dependent on your client's configuration. */
        class BillableStatus
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

                @JvmField val BILLABLE = of("billable")

                @JvmField val UNBILLABLE = of("unbillable")

                @JvmStatic fun of(value: String) = BillableStatus(JsonField.of(value))
            }

            /** An enum containing [BillableStatus]'s known values. */
            enum class Known {
                BILLABLE,
                UNBILLABLE,
            }

            /**
             * An enum containing [BillableStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillableStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BILLABLE,
                UNBILLABLE,
                /**
                 * An enum member indicating that [BillableStatus] was instantiated with an unknown
                 * value.
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
                    BILLABLE -> Value.BILLABLE
                    UNBILLABLE -> Value.UNBILLABLE
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
                    BILLABLE -> Known.BILLABLE
                    UNBILLABLE -> Known.UNBILLABLE
                    else -> throw MetronomeInvalidDataException("Unknown BillableStatus: $value")
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

            fun validate(): BillableStatus = apply {
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

                return other is BillableStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class BreakdownGranularity
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

                @JvmField val HOUR = of("HOUR")

                @JvmField val DAY = of("DAY")

                @JvmStatic fun of(value: String) = BreakdownGranularity(JsonField.of(value))
            }

            /** An enum containing [BreakdownGranularity]'s known values. */
            enum class Known {
                HOUR,
                DAY,
            }

            /**
             * An enum containing [BreakdownGranularity]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BreakdownGranularity] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HOUR,
                DAY,
                /**
                 * An enum member indicating that [BreakdownGranularity] was instantiated with an
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
                    HOUR -> Value.HOUR
                    DAY -> Value.DAY
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
                    HOUR -> Known.HOUR
                    DAY -> Known.DAY
                    else ->
                        throw MetronomeInvalidDataException("Unknown BreakdownGranularity: $value")
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

            fun validate(): BreakdownGranularity = apply {
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

                return other is BreakdownGranularity && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
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

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
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

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Invoice &&
                contractId == other.contractId &&
                creditTypeId == other.creditTypeId &&
                customerId == other.customerId &&
                exclusiveEndDate == other.exclusiveEndDate &&
                inclusiveStartDate == other.inclusiveStartDate &&
                issueDate == other.issueDate &&
                usageLineItems == other.usageLineItems &&
                billableStatus == other.billableStatus &&
                breakdownGranularity == other.breakdownGranularity &&
                customFields == other.customFields &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contractId,
                creditTypeId,
                customerId,
                exclusiveEndDate,
                inclusiveStartDate,
                issueDate,
                usageLineItems,
                billableStatus,
                breakdownGranularity,
                customFields,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Invoice{contractId=$contractId, creditTypeId=$creditTypeId, customerId=$customerId, exclusiveEndDate=$exclusiveEndDate, inclusiveStartDate=$inclusiveStartDate, issueDate=$issueDate, usageLineItems=$usageLineItems, billableStatus=$billableStatus, breakdownGranularity=$breakdownGranularity, customFields=$customFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractCreateHistoricalInvoicesParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractCreateHistoricalInvoicesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
