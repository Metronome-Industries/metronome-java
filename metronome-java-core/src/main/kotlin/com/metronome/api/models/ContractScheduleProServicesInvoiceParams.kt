// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ContractScheduleProServicesInvoiceBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractScheduleProServicesInvoiceBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id") private val contractId: String,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("issued_at") private val issuedAt: OffsetDateTime,
        @JsonProperty("line_items") private val lineItems: List<LineItem>,
        @JsonProperty("netsuite_invoice_header_end")
        private val netsuiteInvoiceHeaderEnd: OffsetDateTime?,
        @JsonProperty("netsuite_invoice_header_start")
        private val netsuiteInvoiceHeaderStart: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("contract_id") fun contractId(): String = contractId

        @JsonProperty("customer_id") fun customerId(): String = customerId

        /** The date the invoice is issued */
        @JsonProperty("issued_at") fun issuedAt(): OffsetDateTime = issuedAt

        /** Each line requires an amount or both unit_price and quantity. */
        @JsonProperty("line_items") fun lineItems(): List<LineItem> = lineItems

        /** The end date of the invoice header in Netsuite */
        @JsonProperty("netsuite_invoice_header_end")
        fun netsuiteInvoiceHeaderEnd(): Optional<OffsetDateTime> =
            Optional.ofNullable(netsuiteInvoiceHeaderEnd)

        /** The start date of the invoice header in Netsuite */
        @JsonProperty("netsuite_invoice_header_start")
        fun netsuiteInvoiceHeaderStart(): Optional<OffsetDateTime> =
            Optional.ofNullable(netsuiteInvoiceHeaderStart)

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
            private var lineItems: MutableList<LineItem>? = null
            private var netsuiteInvoiceHeaderEnd: OffsetDateTime? = null
            private var netsuiteInvoiceHeaderStart: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractScheduleProServicesInvoiceBody: ContractScheduleProServicesInvoiceBody
            ) = apply {
                contractId = contractScheduleProServicesInvoiceBody.contractId
                customerId = contractScheduleProServicesInvoiceBody.customerId
                issuedAt = contractScheduleProServicesInvoiceBody.issuedAt
                lineItems = contractScheduleProServicesInvoiceBody.lineItems.toMutableList()
                netsuiteInvoiceHeaderEnd =
                    contractScheduleProServicesInvoiceBody.netsuiteInvoiceHeaderEnd
                netsuiteInvoiceHeaderStart =
                    contractScheduleProServicesInvoiceBody.netsuiteInvoiceHeaderStart
                additionalProperties =
                    contractScheduleProServicesInvoiceBody.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The date the invoice is issued */
            fun issuedAt(issuedAt: OffsetDateTime) = apply { this.issuedAt = issuedAt }

            /** Each line requires an amount or both unit_price and quantity. */
            fun lineItems(lineItems: List<LineItem>) = apply {
                this.lineItems = lineItems.toMutableList()
            }

            /** Each line requires an amount or both unit_price and quantity. */
            fun addLineItem(lineItem: LineItem) = apply {
                lineItems = (lineItems ?: mutableListOf()).apply { add(lineItem) }
            }

            /** The end date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime?) = apply {
                this.netsuiteInvoiceHeaderEnd = netsuiteInvoiceHeaderEnd
            }

            /** The end date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: Optional<OffsetDateTime>) =
                netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd.orElse(null))

            /** The start date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime?) = apply {
                this.netsuiteInvoiceHeaderStart = netsuiteInvoiceHeaderStart
            }

            /** The start date of the invoice header in Netsuite */
            fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: Optional<OffsetDateTime>) =
                netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart.orElse(null))

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

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** The date the invoice is issued */
        fun issuedAt(issuedAt: OffsetDateTime) = apply { body.issuedAt(issuedAt) }

        /** Each line requires an amount or both unit_price and quantity. */
        fun lineItems(lineItems: List<LineItem>) = apply { body.lineItems(lineItems) }

        /** Each line requires an amount or both unit_price and quantity. */
        fun addLineItem(lineItem: LineItem) = apply { body.addLineItem(lineItem) }

        /** The end date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: OffsetDateTime?) = apply {
            body.netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd)
        }

        /** The end date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd: Optional<OffsetDateTime>) =
            netsuiteInvoiceHeaderEnd(netsuiteInvoiceHeaderEnd.orElse(null))

        /** The start date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: OffsetDateTime?) = apply {
            body.netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart)
        }

        /** The start date of the invoice header in Netsuite */
        fun netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart: Optional<OffsetDateTime>) =
            netsuiteInvoiceHeaderStart(netsuiteInvoiceHeaderStart.orElse(null))

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
        @JsonProperty("professional_service_id") private val professionalServiceId: String,
        @JsonProperty("amendment_id") private val amendmentId: String?,
        @JsonProperty("amount") private val amount: Double?,
        @JsonProperty("metadata") private val metadata: String?,
        @JsonProperty("netsuite_invoice_billing_end")
        private val netsuiteInvoiceBillingEnd: OffsetDateTime?,
        @JsonProperty("netsuite_invoice_billing_start")
        private val netsuiteInvoiceBillingStart: OffsetDateTime?,
        @JsonProperty("quantity") private val quantity: Double?,
        @JsonProperty("unit_price") private val unitPrice: Double?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("professional_service_id")
        fun professionalServiceId(): String = professionalServiceId

        /** If the professional_service_id was added on an amendment, this is required. */
        @JsonProperty("amendment_id")
        fun amendmentId(): Optional<String> = Optional.ofNullable(amendmentId)

        /** Amount for the term on the new invoice. */
        @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

        /** For client use. */
        @JsonProperty("metadata") fun metadata(): Optional<String> = Optional.ofNullable(metadata)

        /** The end date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_end")
        fun netsuiteInvoiceBillingEnd(): Optional<OffsetDateTime> =
            Optional.ofNullable(netsuiteInvoiceBillingEnd)

        /** The start date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_start")
        fun netsuiteInvoiceBillingStart(): Optional<OffsetDateTime> =
            Optional.ofNullable(netsuiteInvoiceBillingStart)

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity") fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

        /**
         * If specified, this overrides the unit price on the pro service term. Must also provide
         * quantity (but not amount) if providing unit_price.
         */
        @JsonProperty("unit_price")
        fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

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
            private var amount: Double? = null
            private var metadata: String? = null
            private var netsuiteInvoiceBillingEnd: OffsetDateTime? = null
            private var netsuiteInvoiceBillingStart: OffsetDateTime? = null
            private var quantity: Double? = null
            private var unitPrice: Double? = null
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

            fun professionalServiceId(professionalServiceId: String) = apply {
                this.professionalServiceId = professionalServiceId
            }

            /** If the professional_service_id was added on an amendment, this is required. */
            fun amendmentId(amendmentId: String?) = apply { this.amendmentId = amendmentId }

            /** If the professional_service_id was added on an amendment, this is required. */
            fun amendmentId(amendmentId: Optional<String>) = amendmentId(amendmentId.orElse(null))

            /** Amount for the term on the new invoice. */
            fun amount(amount: Double?) = apply { this.amount = amount }

            /** Amount for the term on the new invoice. */
            fun amount(amount: Double) = amount(amount as Double?)

            /** Amount for the term on the new invoice. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

            /** For client use. */
            fun metadata(metadata: String?) = apply { this.metadata = metadata }

            /** For client use. */
            fun metadata(metadata: Optional<String>) = metadata(metadata.orElse(null))

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: OffsetDateTime?) = apply {
                this.netsuiteInvoiceBillingEnd = netsuiteInvoiceBillingEnd
            }

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: Optional<OffsetDateTime>) =
                netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd.orElse(null))

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: OffsetDateTime?) = apply {
                this.netsuiteInvoiceBillingStart = netsuiteInvoiceBillingStart
            }

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: Optional<OffsetDateTime>) =
                netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart.orElse(null))

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double?) = apply { this.quantity = quantity }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double) = quantity(quantity as Double?)

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun quantity(quantity: Optional<Double>) = quantity(quantity.orElse(null) as Double?)

            /**
             * If specified, this overrides the unit price on the pro service term. Must also
             * provide quantity (but not amount) if providing unit_price.
             */
            fun unitPrice(unitPrice: Double?) = apply { this.unitPrice = unitPrice }

            /**
             * If specified, this overrides the unit price on the pro service term. Must also
             * provide quantity (but not amount) if providing unit_price.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

            /**
             * If specified, this overrides the unit price on the pro service term. Must also
             * provide quantity (but not amount) if providing unit_price.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun unitPrice(unitPrice: Optional<Double>) =
                unitPrice(unitPrice.orElse(null) as Double?)

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
