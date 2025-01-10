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
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Create a new scheduled invoice for Professional Services terms on a contract. This endpoint's
 * availability is dependent on your client's configuration.
 */
class ContractScheduleProServicesInvoiceParams
constructor(
    private val body: ContractScheduleProServicesInvoiceBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun contractId(): String = body.contractId()

    fun customerId(): String = body.customerId()

    /** The date the invoice is issued */
    fun issuedAt(): OffsetDateTime = body.issuedAt()

    /** Each line requires an amount or both unit_price and quantity. */
    fun lineItems(): List<LineItem> = body.lineItems()

    /** The end date of the invoice header in Netsuite */
    fun netsuiteInvoiceHeaderEnd(): Optional<OffsetDateTime> = body.netsuiteInvoiceHeaderEnd()

    /** The start date of the invoice header in Netsuite */
    fun netsuiteInvoiceHeaderStart(): Optional<OffsetDateTime> = body.netsuiteInvoiceHeaderStart()

    fun _contractId(): JsonField<String> = body._contractId()

    fun _customerId(): JsonField<String> = body._customerId()

    /** The date the invoice is issued */
    fun _issuedAt(): JsonField<OffsetDateTime> = body._issuedAt()

    /** Each line requires an amount or both unit_price and quantity. */
    fun _lineItems(): JsonField<List<LineItem>> = body._lineItems()

    /** The end date of the invoice header in Netsuite */
    fun _netsuiteInvoiceHeaderEnd(): JsonField<OffsetDateTime> = body._netsuiteInvoiceHeaderEnd()

    /** The start date of the invoice header in Netsuite */
    fun _netsuiteInvoiceHeaderStart(): JsonField<OffsetDateTime> =
        body._netsuiteInvoiceHeaderStart()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractScheduleProServicesInvoiceBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractScheduleProServicesInvoiceBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("issued_at")
        @ExcludeMissing
        private val issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("line_items")
        @ExcludeMissing
        private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("netsuite_invoice_header_end")
        @ExcludeMissing
        private val netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("netsuite_invoice_header_start")
        @ExcludeMissing
        private val netsuiteInvoiceHeaderStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun contractId(): String = contractId.getRequired("contract_id")

        fun customerId(): String = customerId.getRequired("customer_id")

        /** The date the invoice is issued */
        fun issuedAt(): OffsetDateTime = issuedAt.getRequired("issued_at")

        /** Each line requires an amount or both unit_price and quantity. */
        fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

        /** The end date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderEnd(): Optional<OffsetDateTime> =
            Optional.ofNullable(netsuiteInvoiceHeaderEnd.getNullable("netsuite_invoice_header_end"))

        /** The start date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderStart(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                netsuiteInvoiceHeaderStart.getNullable("netsuite_invoice_header_start")
            )

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** The date the invoice is issued */
        @JsonProperty("issued_at")
        @ExcludeMissing
        fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

        /** Each line requires an amount or both unit_price and quantity. */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): JsonField<List<LineItem>> = lineItems

        /** The end date of the invoice header in Netsuite */
        @JsonProperty("netsuite_invoice_header_end")
        @ExcludeMissing
        fun _netsuiteInvoiceHeaderEnd(): JsonField<OffsetDateTime> = netsuiteInvoiceHeaderEnd

        /** The start date of the invoice header in Netsuite */
        @JsonProperty("netsuite_invoice_header_start")
        @ExcludeMissing
        fun _netsuiteInvoiceHeaderStart(): JsonField<OffsetDateTime> = netsuiteInvoiceHeaderStart

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractScheduleProServicesInvoiceBody = apply {
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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var issuedAt: JsonField<OffsetDateTime>? = null
            private var lineItems: JsonField<MutableList<LineItem>>? = null
            private var netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteInvoiceHeaderStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractScheduleProServicesInvoiceBody: ContractScheduleProServicesInvoiceBody
            ) = apply {
                contractId = contractScheduleProServicesInvoiceBody.contractId
                customerId = contractScheduleProServicesInvoiceBody.customerId
                issuedAt = contractScheduleProServicesInvoiceBody.issuedAt
                lineItems =
                    contractScheduleProServicesInvoiceBody.lineItems.map { it.toMutableList() }
                netsuiteInvoiceHeaderEnd =
                    contractScheduleProServicesInvoiceBody.netsuiteInvoiceHeaderEnd
                netsuiteInvoiceHeaderStart =
                    contractScheduleProServicesInvoiceBody.netsuiteInvoiceHeaderStart
                additionalProperties =
                    contractScheduleProServicesInvoiceBody.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The date the invoice is issued */
            fun issuedAt(issuedAt: OffsetDateTime) = issuedAt(JsonField.of(issuedAt))

            /** The date the invoice is issued */
            fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

            /** Each line requires an amount or both unit_price and quantity. */
            fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

            /** Each line requires an amount or both unit_price and quantity. */
            fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            /** Each line requires an amount or both unit_price and quantity. */
            fun addLineItem(lineItem: LineItem) = apply {
                lineItems =
                    (lineItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(lineItem)
                    }
            }

            /** The end date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime) =
                netsuiteInvoiceHeaderEnd(JsonField.of(netsuiteInvoiceHeaderEnd))

            /** The end date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceHeaderEnd = netsuiteInvoiceHeaderEnd
                }

            /** The start date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime) =
                netsuiteInvoiceHeaderStart(JsonField.of(netsuiteInvoiceHeaderStart))

            /** The start date of the invoice header in Netsuite */
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

            fun build(): ContractScheduleProServicesInvoiceBody =
                ContractScheduleProServicesInvoiceBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(issuedAt) { "`issuedAt` is required but was not set" },
                    checkNotNull(lineItems) { "`lineItems` is required but was not set" }
                        .map { it.toImmutable() },
                    netsuiteInvoiceHeaderEnd,
                    netsuiteInvoiceHeaderStart,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractScheduleProServicesInvoiceBody && contractId == other.contractId && customerId == other.customerId && issuedAt == other.issuedAt && lineItems == other.lineItems && netsuiteInvoiceHeaderEnd == other.netsuiteInvoiceHeaderEnd && netsuiteInvoiceHeaderStart == other.netsuiteInvoiceHeaderStart && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, issuedAt, lineItems, netsuiteInvoiceHeaderEnd, netsuiteInvoiceHeaderStart, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractScheduleProServicesInvoiceBody{contractId=$contractId, customerId=$customerId, issuedAt=$issuedAt, lineItems=$lineItems, netsuiteInvoiceHeaderEnd=$netsuiteInvoiceHeaderEnd, netsuiteInvoiceHeaderStart=$netsuiteInvoiceHeaderStart, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractScheduleProServicesInvoiceBody.Builder =
            ContractScheduleProServicesInvoiceBody.builder()
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

        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The date the invoice is issued */
        fun issuedAt(issuedAt: OffsetDateTime) = apply { body.issuedAt(issuedAt) }

        /** The date the invoice is issued */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { body.issuedAt(issuedAt) }

        /** Each line requires an amount or both unit_price and quantity. */
        fun lineItems(lineItems: List<LineItem>) = apply { body.lineItems(lineItems) }

        /** Each line requires an amount or both unit_price and quantity. */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { body.lineItems(lineItems) }

        /** Each line requires an amount or both unit_price and quantity. */
        fun addLineItem(lineItem: LineItem) = apply { body.addLineItem(lineItem) }

        /** The end date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime) = apply {
            body.netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd)
        }

        /** The end date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: JsonField<OffsetDateTime>) = apply {
            body.netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd)
        }

        /** The start date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime) = apply {
            body.netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart)
        }

        /** The start date of the invoice header in Netsuite */
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

        fun build(): ContractScheduleProServicesInvoiceParams =
            ContractScheduleProServicesInvoiceParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Describes the line item for a professional service charge on an invoice. */
    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("professional_service_id")
        @ExcludeMissing
        private val professionalServiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amendment_id")
        @ExcludeMissing
        private val amendmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        private val netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        private val netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit_price")
        @ExcludeMissing
        private val unitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun professionalServiceId(): String =
            professionalServiceId.getRequired("professional_service_id")

        /** If the professional_service_id was added on an amendment, this is required. */
        fun amendmentId(): Optional<String> =
            Optional.ofNullable(amendmentId.getNullable("amendment_id"))

        /** Amount for the term on the new invoice. */
        fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

        /** For client use. */
        fun metadata(): Optional<String> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** The end date for the billing period on the invoice. */
        fun netsuiteInvoiceBillingEnd(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                netsuiteInvoiceBillingEnd.getNullable("netsuite_invoice_billing_end")
            )

        /** The start date for the billing period on the invoice. */
        fun netsuiteInvoiceBillingStart(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                netsuiteInvoiceBillingStart.getNullable("netsuite_invoice_billing_start")
            )

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /**
         * If specified, this overrides the unit price on the pro service term. Must also provide
         * quantity (but not amount) if providing unit_price.
         */
        fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice.getNullable("unit_price"))

        @JsonProperty("professional_service_id")
        @ExcludeMissing
        fun _professionalServiceId(): JsonField<String> = professionalServiceId

        /** If the professional_service_id was added on an amendment, this is required. */
        @JsonProperty("amendment_id")
        @ExcludeMissing
        fun _amendmentId(): JsonField<String> = amendmentId

        /** Amount for the term on the new invoice. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** For client use. */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<String> = metadata

        /** The end date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingEnd(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingEnd

        /** The start date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingStart(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingStart

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * If specified, this overrides the unit price on the pro service term. Must also provide
         * quantity (but not amount) if providing unit_price.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun professionalServiceId(professionalServiceId: JsonField<String>) = apply {
                this.professionalServiceId = professionalServiceId
            }

            /** If the professional_service_id was added on an amendment, this is required. */
            fun amendmentId(amendmentId: String) = amendmentId(JsonField.of(amendmentId))

            /** If the professional_service_id was added on an amendment, this is required. */
            fun amendmentId(amendmentId: JsonField<String>) = apply {
                this.amendmentId = amendmentId
            }

            /** Amount for the term on the new invoice. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /** Amount for the term on the new invoice. */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** For client use. */
            fun metadata(metadata: String) = metadata(JsonField.of(metadata))

            /** For client use. */
            fun metadata(metadata: JsonField<String>) = apply { this.metadata = metadata }

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: OffsetDateTime) =
                netsuiteInvoiceBillingEnd(JsonField.of(netsuiteInvoiceBillingEnd))

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceBillingEnd = netsuiteInvoiceBillingEnd
                }

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: OffsetDateTime) =
                netsuiteInvoiceBillingStart(JsonField.of(netsuiteInvoiceBillingStart))

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(
                netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>
            ) = apply { this.netsuiteInvoiceBillingStart = netsuiteInvoiceBillingStart }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /**
             * If specified, this overrides the unit price on the pro service term. Must also
             * provide quantity (but not amount) if providing unit_price.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * If specified, this overrides the unit price on the pro service term. Must also
             * provide quantity (but not amount) if providing unit_price.
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

            fun build(): LineItem =
                LineItem(
                    checkNotNull(professionalServiceId) {
                        "`professionalServiceId` is required but was not set"
                    },
                    amendmentId,
                    amount,
                    metadata,
                    netsuiteInvoiceBillingEnd,
                    netsuiteInvoiceBillingStart,
                    quantity,
                    unitPrice,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && professionalServiceId == other.professionalServiceId && amendmentId == other.amendmentId && amount == other.amount && metadata == other.metadata && netsuiteInvoiceBillingEnd == other.netsuiteInvoiceBillingEnd && netsuiteInvoiceBillingStart == other.netsuiteInvoiceBillingStart && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(professionalServiceId, amendmentId, amount, metadata, netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart, quantity, unitPrice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{professionalServiceId=$professionalServiceId, amendmentId=$amendmentId, amount=$amount, metadata=$metadata, netsuiteInvoiceBillingEnd=$netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart=$netsuiteInvoiceBillingStart, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractScheduleProServicesInvoiceParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractScheduleProServicesInvoiceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
