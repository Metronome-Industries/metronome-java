// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractScheduleProServicesInvoiceParams
constructor(
    private val contractId: String,
    private val customerId: String,
    private val issuedAt: OffsetDateTime,
    private val lineItems: List<LineItem>,
    private val netsuiteInvoiceHeaderEnd: OffsetDateTime?,
    private val netsuiteInvoiceHeaderStart: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contractId(): String = contractId

    fun customerId(): String = customerId

    fun issuedAt(): OffsetDateTime = issuedAt

    fun lineItems(): List<LineItem> = lineItems

    fun netsuiteInvoiceHeaderEnd(): Optional<OffsetDateTime> =
        Optional.ofNullable(netsuiteInvoiceHeaderEnd)

    fun netsuiteInvoiceHeaderStart(): Optional<OffsetDateTime> =
        Optional.ofNullable(netsuiteInvoiceHeaderStart)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ContractScheduleProServicesInvoiceBody {
        return ContractScheduleProServicesInvoiceBody(
            contractId,
            customerId,
            issuedAt,
            lineItems,
            netsuiteInvoiceHeaderEnd,
            netsuiteInvoiceHeaderStart,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ContractScheduleProServicesInvoiceBody.Builder::class)
    @NoAutoDetect
    class ContractScheduleProServicesInvoiceBody
    internal constructor(
        private val contractId: String?,
        private val customerId: String?,
        private val issuedAt: OffsetDateTime?,
        private val lineItems: List<LineItem>?,
        private val netsuiteInvoiceHeaderEnd: OffsetDateTime?,
        private val netsuiteInvoiceHeaderStart: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("contract_id") fun contractId(): String? = contractId

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** The date the invoice is issued */
        @JsonProperty("issued_at") fun issuedAt(): OffsetDateTime? = issuedAt

        /** Each line requires an amount or both unit_price and quantity. */
        @JsonProperty("line_items") fun lineItems(): List<LineItem>? = lineItems

        /** The end date of the invoice header in Netsuite */
        @JsonProperty("netsuite_invoice_header_end")
        fun netsuiteInvoiceHeaderEnd(): OffsetDateTime? = netsuiteInvoiceHeaderEnd

        /** The start date of the invoice header in Netsuite */
        @JsonProperty("netsuite_invoice_header_start")
        fun netsuiteInvoiceHeaderStart(): OffsetDateTime? = netsuiteInvoiceHeaderStart

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contractId: String? = null
            private var customerId: String? = null
            private var issuedAt: OffsetDateTime? = null
            private var lineItems: List<LineItem>? = null
            private var netsuiteInvoiceHeaderEnd: OffsetDateTime? = null
            private var netsuiteInvoiceHeaderStart: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractScheduleProServicesInvoiceBody: ContractScheduleProServicesInvoiceBody
            ) = apply {
                this.contractId = contractScheduleProServicesInvoiceBody.contractId
                this.customerId = contractScheduleProServicesInvoiceBody.customerId
                this.issuedAt = contractScheduleProServicesInvoiceBody.issuedAt
                this.lineItems = contractScheduleProServicesInvoiceBody.lineItems
                this.netsuiteInvoiceHeaderEnd =
                    contractScheduleProServicesInvoiceBody.netsuiteInvoiceHeaderEnd
                this.netsuiteInvoiceHeaderStart =
                    contractScheduleProServicesInvoiceBody.netsuiteInvoiceHeaderStart
                additionalProperties(contractScheduleProServicesInvoiceBody.additionalProperties)
            }

            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The date the invoice is issued */
            @JsonProperty("issued_at")
            fun issuedAt(issuedAt: OffsetDateTime) = apply { this.issuedAt = issuedAt }

            /** Each line requires an amount or both unit_price and quantity. */
            @JsonProperty("line_items")
            fun lineItems(lineItems: List<LineItem>) = apply { this.lineItems = lineItems }

            /** The end date of the invoice header in Netsuite */
            @JsonProperty("netsuite_invoice_header_end")
            fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime) = apply {
                this.netsuiteInvoiceHeaderEnd = netsuiteInvoiceHeaderEnd
            }

            /** The start date of the invoice header in Netsuite */
            @JsonProperty("netsuite_invoice_header_start")
            fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime) = apply {
                this.netsuiteInvoiceHeaderStart = netsuiteInvoiceHeaderStart
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ContractScheduleProServicesInvoiceBody =
                ContractScheduleProServicesInvoiceBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(issuedAt) { "`issuedAt` is required but was not set" },
                    checkNotNull(lineItems) { "`lineItems` is required but was not set" }
                        .toImmutable(),
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

        private var contractId: String? = null
        private var customerId: String? = null
        private var issuedAt: OffsetDateTime? = null
        private var lineItems: MutableList<LineItem> = mutableListOf()
        private var netsuiteInvoiceHeaderEnd: OffsetDateTime? = null
        private var netsuiteInvoiceHeaderStart: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractScheduleProServicesInvoiceParams: ContractScheduleProServicesInvoiceParams
        ) = apply {
            contractId = contractScheduleProServicesInvoiceParams.contractId
            customerId = contractScheduleProServicesInvoiceParams.customerId
            issuedAt = contractScheduleProServicesInvoiceParams.issuedAt
            lineItems = contractScheduleProServicesInvoiceParams.lineItems.toMutableList()
            netsuiteInvoiceHeaderEnd =
                contractScheduleProServicesInvoiceParams.netsuiteInvoiceHeaderEnd
            netsuiteInvoiceHeaderStart =
                contractScheduleProServicesInvoiceParams.netsuiteInvoiceHeaderStart
            additionalHeaders =
                contractScheduleProServicesInvoiceParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractScheduleProServicesInvoiceParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                contractScheduleProServicesInvoiceParams.additionalBodyProperties.toMutableMap()
        }

        fun contractId(contractId: String) = apply { this.contractId = contractId }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The date the invoice is issued */
        fun issuedAt(issuedAt: OffsetDateTime) = apply { this.issuedAt = issuedAt }

        /** Each line requires an amount or both unit_price and quantity. */
        fun lineItems(lineItems: List<LineItem>) = apply {
            this.lineItems.clear()
            this.lineItems.addAll(lineItems)
        }

        /** Each line requires an amount or both unit_price and quantity. */
        fun addLineItem(lineItem: LineItem) = apply { this.lineItems.add(lineItem) }

        /** The end date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime) = apply {
            this.netsuiteInvoiceHeaderEnd = netsuiteInvoiceHeaderEnd
        }

        /** The start date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime) = apply {
            this.netsuiteInvoiceHeaderStart = netsuiteInvoiceHeaderStart
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ContractScheduleProServicesInvoiceParams =
            ContractScheduleProServicesInvoiceParams(
                checkNotNull(contractId) { "`contractId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(issuedAt) { "`issuedAt` is required but was not set" },
                lineItems.toImmutable(),
                netsuiteInvoiceHeaderEnd,
                netsuiteInvoiceHeaderStart,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Describes the line item for a professional service charge on an invoice. */
    @JsonDeserialize(builder = LineItem.Builder::class)
    @NoAutoDetect
    class LineItem
    private constructor(
        private val professionalServiceId: String?,
        private val amendmentId: String?,
        private val unitPrice: Double?,
        private val quantity: Double?,
        private val amount: Double?,
        private val netsuiteInvoiceBillingStart: OffsetDateTime?,
        private val netsuiteInvoiceBillingEnd: OffsetDateTime?,
        private val metadata: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("professional_service_id")
        fun professionalServiceId(): String? = professionalServiceId

        /** If the professional_service_id was added on an amendment, this is required. */
        @JsonProperty("amendment_id") fun amendmentId(): String? = amendmentId

        /**
         * If specified, this overrides the unit price on the pro service term. Must also provide
         * quantity (but not amount) if providing unit_price.
         */
        @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /** Amount for the term on the new invoice. */
        @JsonProperty("amount") fun amount(): Double? = amount

        /** The start date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_start")
        fun netsuiteInvoiceBillingStart(): OffsetDateTime? = netsuiteInvoiceBillingStart

        /** The end date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_end")
        fun netsuiteInvoiceBillingEnd(): OffsetDateTime? = netsuiteInvoiceBillingEnd

        /** For client use. */
        @JsonProperty("metadata") fun metadata(): String? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var professionalServiceId: String? = null
            private var amendmentId: String? = null
            private var unitPrice: Double? = null
            private var quantity: Double? = null
            private var amount: Double? = null
            private var netsuiteInvoiceBillingStart: OffsetDateTime? = null
            private var netsuiteInvoiceBillingEnd: OffsetDateTime? = null
            private var metadata: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                this.professionalServiceId = lineItem.professionalServiceId
                this.amendmentId = lineItem.amendmentId
                this.unitPrice = lineItem.unitPrice
                this.quantity = lineItem.quantity
                this.amount = lineItem.amount
                this.netsuiteInvoiceBillingStart = lineItem.netsuiteInvoiceBillingStart
                this.netsuiteInvoiceBillingEnd = lineItem.netsuiteInvoiceBillingEnd
                this.metadata = lineItem.metadata
                additionalProperties(lineItem.additionalProperties)
            }

            @JsonProperty("professional_service_id")
            fun professionalServiceId(professionalServiceId: String) = apply {
                this.professionalServiceId = professionalServiceId
            }

            /** If the professional_service_id was added on an amendment, this is required. */
            @JsonProperty("amendment_id")
            fun amendmentId(amendmentId: String) = apply { this.amendmentId = amendmentId }

            /**
             * If specified, this overrides the unit price on the pro service term. Must also
             * provide quantity (but not amount) if providing unit_price.
             */
            @JsonProperty("unit_price")
            fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /** Amount for the term on the new invoice. */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            /** The start date for the billing period on the invoice. */
            @JsonProperty("netsuite_invoice_billing_start")
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: OffsetDateTime) = apply {
                this.netsuiteInvoiceBillingStart = netsuiteInvoiceBillingStart
            }

            /** The end date for the billing period on the invoice. */
            @JsonProperty("netsuite_invoice_billing_end")
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: OffsetDateTime) = apply {
                this.netsuiteInvoiceBillingEnd = netsuiteInvoiceBillingEnd
            }

            /** For client use. */
            @JsonProperty("metadata")
            fun metadata(metadata: String) = apply { this.metadata = metadata }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): LineItem =
                LineItem(
                    checkNotNull(professionalServiceId) {
                        "`professionalServiceId` is required but was not set"
                    },
                    amendmentId,
                    unitPrice,
                    quantity,
                    amount,
                    netsuiteInvoiceBillingStart,
                    netsuiteInvoiceBillingEnd,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && professionalServiceId == other.professionalServiceId && amendmentId == other.amendmentId && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && netsuiteInvoiceBillingStart == other.netsuiteInvoiceBillingStart && netsuiteInvoiceBillingEnd == other.netsuiteInvoiceBillingEnd && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(professionalServiceId, amendmentId, unitPrice, quantity, amount, netsuiteInvoiceBillingStart, netsuiteInvoiceBillingEnd, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{professionalServiceId=$professionalServiceId, amendmentId=$amendmentId, unitPrice=$unitPrice, quantity=$quantity, amount=$amount, netsuiteInvoiceBillingStart=$netsuiteInvoiceBillingStart, netsuiteInvoiceBillingEnd=$netsuiteInvoiceBillingEnd, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractScheduleProServicesInvoiceParams && contractId == other.contractId && customerId == other.customerId && issuedAt == other.issuedAt && lineItems == other.lineItems && netsuiteInvoiceHeaderEnd == other.netsuiteInvoiceHeaderEnd && netsuiteInvoiceHeaderStart == other.netsuiteInvoiceHeaderStart && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(contractId, customerId, issuedAt, lineItems, netsuiteInvoiceHeaderEnd, netsuiteInvoiceHeaderStart, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractScheduleProServicesInvoiceParams{contractId=$contractId, customerId=$customerId, issuedAt=$issuedAt, lineItems=$lineItems, netsuiteInvoiceHeaderEnd=$netsuiteInvoiceHeaderEnd, netsuiteInvoiceHeaderStart=$netsuiteInvoiceHeaderStart, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
