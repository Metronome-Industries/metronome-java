// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new scheduled invoice for Professional Services terms on a contract. This endpoint's
 * availability is dependent on your client's configuration.
 */
class ContractScheduleProServicesInvoiceParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractId(): String = body.contractId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * The date the invoice is issued
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun issuedAt(): OffsetDateTime = body.issuedAt()

    /**
     * Each line requires an amount or both unit_price and quantity.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lineItems(): List<LineItem> = body.lineItems()

    /**
     * The end date of the invoice header in Netsuite
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteInvoiceHeaderEnd(): Optional<OffsetDateTime> = body.netsuiteInvoiceHeaderEnd()

    /**
     * The start date of the invoice header in Netsuite
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteInvoiceHeaderStart(): Optional<OffsetDateTime> = body.netsuiteInvoiceHeaderStart()

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
     * Returns the raw JSON value of [issuedAt].
     *
     * Unlike [issuedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _issuedAt(): JsonField<OffsetDateTime> = body._issuedAt()

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lineItems(): JsonField<List<LineItem>> = body._lineItems()

    /**
     * Returns the raw JSON value of [netsuiteInvoiceHeaderEnd].
     *
     * Unlike [netsuiteInvoiceHeaderEnd], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _netsuiteInvoiceHeaderEnd(): JsonField<OffsetDateTime> = body._netsuiteInvoiceHeaderEnd()

    /**
     * Returns the raw JSON value of [netsuiteInvoiceHeaderStart].
     *
     * Unlike [netsuiteInvoiceHeaderStart], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _netsuiteInvoiceHeaderStart(): JsonField<OffsetDateTime> =
        body._netsuiteInvoiceHeaderStart()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractScheduleProServicesInvoiceParams].
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * .issuedAt()
         * .lineItems()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractScheduleProServicesInvoiceParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractScheduleProServicesInvoiceParams: ContractScheduleProServicesInvoiceParams
        ) = apply {
            body = contractScheduleProServicesInvoiceParams.body.toBuilder()
            additionalHeaders =
                contractScheduleProServicesInvoiceParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractScheduleProServicesInvoiceParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contractId]
         * - [customerId]
         * - [issuedAt]
         * - [lineItems]
         * - [netsuiteInvoiceHeaderEnd]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The date the invoice is issued */
        fun issuedAt(issuedAt: OffsetDateTime) = apply { body.issuedAt(issuedAt) }

        /**
         * Sets [Builder.issuedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { body.issuedAt(issuedAt) }

        /** Each line requires an amount or both unit_price and quantity. */
        fun lineItems(lineItems: List<LineItem>) = apply { body.lineItems(lineItems) }

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { body.lineItems(lineItems) }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply { body.addLineItem(lineItem) }

        /** The end date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime) = apply {
            body.netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd)
        }

        /**
         * Sets [Builder.netsuiteInvoiceHeaderEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteInvoiceHeaderEnd] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime>) = apply {
            body.netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd)
        }

        /** The start date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime) = apply {
            body.netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart)
        }

        /**
         * Sets [Builder.netsuiteInvoiceHeaderStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteInvoiceHeaderStart] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: JsonField<OffsetDateTime>) =
            apply {
                body.netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart)
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
         * Returns an immutable instance of [ContractScheduleProServicesInvoiceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * .issuedAt()
         * .lineItems()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractScheduleProServicesInvoiceParams =
            ContractScheduleProServicesInvoiceParams(
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
        private val contractId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val issuedAt: JsonField<OffsetDateTime>,
        private val lineItems: JsonField<List<LineItem>>,
        private val netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime>,
        private val netsuiteInvoiceHeaderStart: JsonField<OffsetDateTime>,
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
            @JsonProperty("issued_at")
            @ExcludeMissing
            issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("line_items")
            @ExcludeMissing
            lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
            @JsonProperty("netsuite_invoice_header_end")
            @ExcludeMissing
            netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("netsuite_invoice_header_start")
            @ExcludeMissing
            netsuiteInvoiceHeaderStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            contractId,
            customerId,
            issuedAt,
            lineItems,
            netsuiteInvoiceHeaderEnd,
            netsuiteInvoiceHeaderStart,
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
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * The date the invoice is issued
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun issuedAt(): OffsetDateTime = issuedAt.getRequired("issued_at")

        /**
         * Each line requires an amount or both unit_price and quantity.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

        /**
         * The end date of the invoice header in Netsuite
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInvoiceHeaderEnd(): Optional<OffsetDateTime> =
            netsuiteInvoiceHeaderEnd.getOptional("netsuite_invoice_header_end")

        /**
         * The start date of the invoice header in Netsuite
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInvoiceHeaderStart(): Optional<OffsetDateTime> =
            netsuiteInvoiceHeaderStart.getOptional("netsuite_invoice_header_start")

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
         * Returns the raw JSON value of [issuedAt].
         *
         * Unlike [issuedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issued_at")
        @ExcludeMissing
        fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

        /**
         * Returns the raw JSON value of [lineItems].
         *
         * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): JsonField<List<LineItem>> = lineItems

        /**
         * Returns the raw JSON value of [netsuiteInvoiceHeaderEnd].
         *
         * Unlike [netsuiteInvoiceHeaderEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_invoice_header_end")
        @ExcludeMissing
        fun _netsuiteInvoiceHeaderEnd(): JsonField<OffsetDateTime> = netsuiteInvoiceHeaderEnd

        /**
         * Returns the raw JSON value of [netsuiteInvoiceHeaderStart].
         *
         * Unlike [netsuiteInvoiceHeaderStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_invoice_header_start")
        @ExcludeMissing
        fun _netsuiteInvoiceHeaderStart(): JsonField<OffsetDateTime> = netsuiteInvoiceHeaderStart

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
             * .issuedAt()
             * .lineItems()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var issuedAt: JsonField<OffsetDateTime>? = null
            private var lineItems: JsonField<MutableList<LineItem>>? = null
            private var netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteInvoiceHeaderStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contractId = body.contractId
                customerId = body.customerId
                issuedAt = body.issuedAt
                lineItems = body.lineItems.map { it.toMutableList() }
                netsuiteInvoiceHeaderEnd = body.netsuiteInvoiceHeaderEnd
                netsuiteInvoiceHeaderStart = body.netsuiteInvoiceHeaderStart
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The date the invoice is issued */
            fun issuedAt(issuedAt: OffsetDateTime) = issuedAt(JsonField.of(issuedAt))

            /**
             * Sets [Builder.issuedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

            /** Each line requires an amount or both unit_price and quantity. */
            fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

            /**
             * Sets [Builder.lineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [LineItem] to [lineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineItem(lineItem: LineItem) = apply {
                lineItems =
                    (lineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineItems", it).add(lineItem)
                    }
            }

            /** The end date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime) =
                netsuiteInvoiceHeaderEnd(JsonField.of(netsuiteInvoiceHeaderEnd))

            /**
             * Sets [Builder.netsuiteInvoiceHeaderEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInvoiceHeaderEnd] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceHeaderEnd = netsuiteInvoiceHeaderEnd
                }

            /** The start date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime) =
                netsuiteInvoiceHeaderStart(JsonField.of(netsuiteInvoiceHeaderStart))

            /**
             * Sets [Builder.netsuiteInvoiceHeaderStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInvoiceHeaderStart] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceHeaderStart = netsuiteInvoiceHeaderStart
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
             * .issuedAt()
             * .lineItems()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("issuedAt", issuedAt),
                    checkRequired("lineItems", lineItems).map { it.toImmutable() },
                    netsuiteInvoiceHeaderEnd,
                    netsuiteInvoiceHeaderStart,
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
            issuedAt()
            lineItems().forEach { it.validate() }
            netsuiteInvoiceHeaderEnd()
            netsuiteInvoiceHeaderStart()
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
                (if (issuedAt.asKnown().isPresent) 1 else 0) +
                (lineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (netsuiteInvoiceHeaderEnd.asKnown().isPresent) 1 else 0) +
                (if (netsuiteInvoiceHeaderStart.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contractId == other.contractId &&
                customerId == other.customerId &&
                issuedAt == other.issuedAt &&
                lineItems == other.lineItems &&
                netsuiteInvoiceHeaderEnd == other.netsuiteInvoiceHeaderEnd &&
                netsuiteInvoiceHeaderStart == other.netsuiteInvoiceHeaderStart &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contractId,
                customerId,
                issuedAt,
                lineItems,
                netsuiteInvoiceHeaderEnd,
                netsuiteInvoiceHeaderStart,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contractId=$contractId, customerId=$customerId, issuedAt=$issuedAt, lineItems=$lineItems, netsuiteInvoiceHeaderEnd=$netsuiteInvoiceHeaderEnd, netsuiteInvoiceHeaderStart=$netsuiteInvoiceHeaderStart, additionalProperties=$additionalProperties}"
    }

    /** Describes the line item for a professional service charge on an invoice. */
    class LineItem
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val professionalServiceId: JsonField<String>,
        private val amendmentId: JsonField<String>,
        private val amount: JsonField<Double>,
        private val metadata: JsonField<String>,
        private val netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>,
        private val netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>,
        private val quantity: JsonField<Double>,
        private val unitPrice: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("professional_service_id")
            @ExcludeMissing
            professionalServiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amendment_id")
            @ExcludeMissing
            amendmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_invoice_billing_end")
            @ExcludeMissing
            netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("netsuite_invoice_billing_start")
            @ExcludeMissing
            netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
        ) : this(
            professionalServiceId,
            amendmentId,
            amount,
            metadata,
            netsuiteInvoiceBillingEnd,
            netsuiteInvoiceBillingStart,
            quantity,
            unitPrice,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun professionalServiceId(): String =
            professionalServiceId.getRequired("professional_service_id")

        /**
         * If the professional_service_id was added on an amendment, this is required.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amendmentId(): Optional<String> = amendmentId.getOptional("amendment_id")

        /**
         * Amount for the term on the new invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * For client use.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<String> = metadata.getOptional("metadata")

        /**
         * The end date for the billing period on the invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInvoiceBillingEnd(): Optional<OffsetDateTime> =
            netsuiteInvoiceBillingEnd.getOptional("netsuite_invoice_billing_end")

        /**
         * The start date for the billing period on the invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInvoiceBillingStart(): Optional<OffsetDateTime> =
            netsuiteInvoiceBillingStart.getOptional("netsuite_invoice_billing_start")

        /**
         * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<Double> = quantity.getOptional("quantity")

        /**
         * If specified, this overrides the unit price on the pro service term. Must also provide
         * quantity (but not amount) if providing unit_price.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

        /**
         * Returns the raw JSON value of [professionalServiceId].
         *
         * Unlike [professionalServiceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("professional_service_id")
        @ExcludeMissing
        fun _professionalServiceId(): JsonField<String> = professionalServiceId

        /**
         * Returns the raw JSON value of [amendmentId].
         *
         * Unlike [amendmentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amendment_id")
        @ExcludeMissing
        fun _amendmentId(): JsonField<String> = amendmentId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<String> = metadata

        /**
         * Returns the raw JSON value of [netsuiteInvoiceBillingEnd].
         *
         * Unlike [netsuiteInvoiceBillingEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingEnd(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingEnd

        /**
         * Returns the raw JSON value of [netsuiteInvoiceBillingStart].
         *
         * Unlike [netsuiteInvoiceBillingStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingStart(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingStart

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

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
             * Returns a mutable builder for constructing an instance of [LineItem].
             *
             * The following fields are required:
             * ```java
             * .professionalServiceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var professionalServiceId: JsonField<String>? = null
            private var amendmentId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var metadata: JsonField<String> = JsonMissing.of()
            private var netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                professionalServiceId = lineItem.professionalServiceId
                amendmentId = lineItem.amendmentId
                amount = lineItem.amount
                metadata = lineItem.metadata
                netsuiteInvoiceBillingEnd = lineItem.netsuiteInvoiceBillingEnd
                netsuiteInvoiceBillingStart = lineItem.netsuiteInvoiceBillingStart
                quantity = lineItem.quantity
                unitPrice = lineItem.unitPrice
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            fun professionalServiceId(professionalServiceId: String) =
                professionalServiceId(JsonField.of(professionalServiceId))

            /**
             * Sets [Builder.professionalServiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.professionalServiceId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun professionalServiceId(professionalServiceId: JsonField<String>) = apply {
                this.professionalServiceId = professionalServiceId
            }

            /** If the professional_service_id was added on an amendment, this is required. */
            fun amendmentId(amendmentId: String) = amendmentId(JsonField.of(amendmentId))

            /**
             * Sets [Builder.amendmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amendmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amendmentId(amendmentId: JsonField<String>) = apply {
                this.amendmentId = amendmentId
            }

            /** Amount for the term on the new invoice. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** For client use. */
            fun metadata(metadata: String) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<String>) = apply { this.metadata = metadata }

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: OffsetDateTime) =
                netsuiteInvoiceBillingEnd(JsonField.of(netsuiteInvoiceBillingEnd))

            /**
             * Sets [Builder.netsuiteInvoiceBillingEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInvoiceBillingEnd] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceBillingEnd = netsuiteInvoiceBillingEnd
                }

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: OffsetDateTime) =
                netsuiteInvoiceBillingStart(JsonField.of(netsuiteInvoiceBillingStart))

            /**
             * Sets [Builder.netsuiteInvoiceBillingStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInvoiceBillingStart] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun netsuiteInvoiceBillingStart(
                netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>
            ) = apply { this.netsuiteInvoiceBillingStart = netsuiteInvoiceBillingStart }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /**
             * If specified, this overrides the unit price on the pro service term. Must also
             * provide quantity (but not amount) if providing unit_price.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

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
             * Returns an immutable instance of [LineItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .professionalServiceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LineItem =
                LineItem(
                    checkRequired("professionalServiceId", professionalServiceId),
                    amendmentId,
                    amount,
                    metadata,
                    netsuiteInvoiceBillingEnd,
                    netsuiteInvoiceBillingStart,
                    quantity,
                    unitPrice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            professionalServiceId()
            amendmentId()
            amount()
            metadata()
            netsuiteInvoiceBillingEnd()
            netsuiteInvoiceBillingStart()
            quantity()
            unitPrice()
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
            (if (professionalServiceId.asKnown().isPresent) 1 else 0) +
                (if (amendmentId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (metadata.asKnown().isPresent) 1 else 0) +
                (if (netsuiteInvoiceBillingEnd.asKnown().isPresent) 1 else 0) +
                (if (netsuiteInvoiceBillingStart.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItem &&
                professionalServiceId == other.professionalServiceId &&
                amendmentId == other.amendmentId &&
                amount == other.amount &&
                metadata == other.metadata &&
                netsuiteInvoiceBillingEnd == other.netsuiteInvoiceBillingEnd &&
                netsuiteInvoiceBillingStart == other.netsuiteInvoiceBillingStart &&
                quantity == other.quantity &&
                unitPrice == other.unitPrice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                professionalServiceId,
                amendmentId,
                amount,
                metadata,
                netsuiteInvoiceBillingEnd,
                netsuiteInvoiceBillingStart,
                quantity,
                unitPrice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{professionalServiceId=$professionalServiceId, amendmentId=$amendmentId, amount=$amount, metadata=$metadata, netsuiteInvoiceBillingEnd=$netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart=$netsuiteInvoiceBillingStart, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractScheduleProServicesInvoiceParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractScheduleProServicesInvoiceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
