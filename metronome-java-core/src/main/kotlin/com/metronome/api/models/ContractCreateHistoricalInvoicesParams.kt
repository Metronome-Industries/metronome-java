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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Creates historical usage invoices for a contract */
class ContractCreateHistoricalInvoicesParams
private constructor(
    private val body: ContractCreateHistoricalInvoicesBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun invoices(): List<Invoice> = body.invoices()

    fun preview(): Boolean = body.preview()

    fun _invoices(): JsonField<List<Invoice>> = body._invoices()

    fun _preview(): JsonField<Boolean> = body._preview()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractCreateHistoricalInvoicesBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractCreateHistoricalInvoicesBody
    @JsonCreator
    internal constructor(
        @JsonProperty("invoices")
        @ExcludeMissing
        private val invoices: JsonField<List<Invoice>> = JsonMissing.of(),
        @JsonProperty("preview")
        @ExcludeMissing
        private val preview: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun invoices(): List<Invoice> = invoices.getRequired("invoices")

        fun preview(): Boolean = preview.getRequired("preview")

        @JsonProperty("invoices")
        @ExcludeMissing
        fun _invoices(): JsonField<List<Invoice>> = invoices

        @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<Boolean> = preview

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractCreateHistoricalInvoicesBody = apply {
            if (validated) {
                return@apply
            }

            invoices().forEach { it.validate() }
            preview()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var invoices: JsonField<MutableList<Invoice>>? = null
            private var preview: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractCreateHistoricalInvoicesBody: ContractCreateHistoricalInvoicesBody
            ) = apply {
                invoices = contractCreateHistoricalInvoicesBody.invoices.map { it.toMutableList() }
                preview = contractCreateHistoricalInvoicesBody.preview
                additionalProperties =
                    contractCreateHistoricalInvoicesBody.additionalProperties.toMutableMap()
            }

            fun invoices(invoices: List<Invoice>) = invoices(JsonField.of(invoices))

            fun invoices(invoices: JsonField<List<Invoice>>) = apply {
                this.invoices = invoices.map { it.toMutableList() }
            }

            fun addInvoice(invoice: Invoice) = apply {
                invoices =
                    (invoices ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(invoice)
                    }
            }

            fun preview(preview: Boolean) = preview(JsonField.of(preview))

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

            fun build(): ContractCreateHistoricalInvoicesBody =
                ContractCreateHistoricalInvoicesBody(
                    checkRequired("invoices", invoices).map { it.toImmutable() },
                    checkRequired("preview", preview),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractCreateHistoricalInvoicesBody && invoices == other.invoices && preview == other.preview && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(invoices, preview, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractCreateHistoricalInvoicesBody{invoices=$invoices, preview=$preview, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ContractCreateHistoricalInvoicesBody.Builder =
            ContractCreateHistoricalInvoicesBody.builder()
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

        fun invoices(invoices: List<Invoice>) = apply { body.invoices(invoices) }

        fun invoices(invoices: JsonField<List<Invoice>>) = apply { body.invoices(invoices) }

        fun addInvoice(invoice: Invoice) = apply { body.addInvoice(invoice) }

        fun preview(preview: Boolean) = apply { body.preview(preview) }

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

        fun build(): ContractCreateHistoricalInvoicesParams =
            ContractCreateHistoricalInvoicesParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Invoice
    @JsonCreator
    private constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exclusive_end_date")
        @ExcludeMissing
        private val exclusiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inclusive_start_date")
        @ExcludeMissing
        private val inclusiveStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("issue_date")
        @ExcludeMissing
        private val issueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usage_line_items")
        @ExcludeMissing
        private val usageLineItems: JsonField<List<UsageLineItem>> = JsonMissing.of(),
        @JsonProperty("billable_status")
        @ExcludeMissing
        private val billableStatus: JsonField<BillableStatus> = JsonMissing.of(),
        @JsonProperty("breakdown_granularity")
        @ExcludeMissing
        private val breakdownGranularity: JsonField<BreakdownGranularity> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun contractId(): String = contractId.getRequired("contract_id")

        fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

        fun customerId(): String = customerId.getRequired("customer_id")

        fun exclusiveEndDate(): OffsetDateTime = exclusiveEndDate.getRequired("exclusive_end_date")

        fun inclusiveStartDate(): OffsetDateTime =
            inclusiveStartDate.getRequired("inclusive_start_date")

        fun issueDate(): OffsetDateTime = issueDate.getRequired("issue_date")

        fun usageLineItems(): List<UsageLineItem> = usageLineItems.getRequired("usage_line_items")

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(): Optional<BillableStatus> =
            Optional.ofNullable(billableStatus.getNullable("billable_status"))

        fun breakdownGranularity(): Optional<BreakdownGranularity> =
            Optional.ofNullable(breakdownGranularity.getNullable("breakdown_granularity"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonProperty("exclusive_end_date")
        @ExcludeMissing
        fun _exclusiveEndDate(): JsonField<OffsetDateTime> = exclusiveEndDate

        @JsonProperty("inclusive_start_date")
        @ExcludeMissing
        fun _inclusiveStartDate(): JsonField<OffsetDateTime> = inclusiveStartDate

        @JsonProperty("issue_date")
        @ExcludeMissing
        fun _issueDate(): JsonField<OffsetDateTime> = issueDate

        @JsonProperty("usage_line_items")
        @ExcludeMissing
        fun _usageLineItems(): JsonField<List<UsageLineItem>> = usageLineItems

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("billable_status")
        @ExcludeMissing
        fun _billableStatus(): JsonField<BillableStatus> = billableStatus

        @JsonProperty("breakdown_granularity")
        @ExcludeMissing
        fun _breakdownGranularity(): JsonField<BreakdownGranularity> = breakdownGranularity

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            billableStatus()
            breakdownGranularity()
            customFields().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

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

            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) =
                exclusiveEndDate(JsonField.of(exclusiveEndDate))

            fun exclusiveEndDate(exclusiveEndDate: JsonField<OffsetDateTime>) = apply {
                this.exclusiveEndDate = exclusiveEndDate
            }

            fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) =
                inclusiveStartDate(JsonField.of(inclusiveStartDate))

            fun inclusiveStartDate(inclusiveStartDate: JsonField<OffsetDateTime>) = apply {
                this.inclusiveStartDate = inclusiveStartDate
            }

            fun issueDate(issueDate: OffsetDateTime) = issueDate(JsonField.of(issueDate))

            fun issueDate(issueDate: JsonField<OffsetDateTime>) = apply {
                this.issueDate = issueDate
            }

            fun usageLineItems(usageLineItems: List<UsageLineItem>) =
                usageLineItems(JsonField.of(usageLineItems))

            fun usageLineItems(usageLineItems: JsonField<List<UsageLineItem>>) = apply {
                this.usageLineItems = usageLineItems.map { it.toMutableList() }
            }

            fun addUsageLineItem(usageLineItem: UsageLineItem) = apply {
                usageLineItems =
                    (usageLineItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(usageLineItem)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun billableStatus(billableStatus: BillableStatus) =
                billableStatus(JsonField.of(billableStatus))

            /** This field's availability is dependent on your client's configuration. */
            fun billableStatus(billableStatus: JsonField<BillableStatus>) = apply {
                this.billableStatus = billableStatus
            }

            fun breakdownGranularity(breakdownGranularity: BreakdownGranularity) =
                breakdownGranularity(JsonField.of(breakdownGranularity))

            fun breakdownGranularity(breakdownGranularity: JsonField<BreakdownGranularity>) =
                apply {
                    this.breakdownGranularity = breakdownGranularity
                }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

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
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class UsageLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("exclusive_end_date")
            @ExcludeMissing
            private val exclusiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("inclusive_start_date")
            @ExcludeMissing
            private val inclusiveStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            private val productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            private val presentationGroupValues: JsonField<PresentationGroupValues> =
                JsonMissing.of(),
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("subtotals_with_quantity")
            @ExcludeMissing
            private val subtotalsWithQuantity: JsonField<List<SubtotalsWithQuantity>> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun exclusiveEndDate(): OffsetDateTime =
                exclusiveEndDate.getRequired("exclusive_end_date")

            fun inclusiveStartDate(): OffsetDateTime =
                inclusiveStartDate.getRequired("inclusive_start_date")

            fun productId(): String = productId.getRequired("product_id")

            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                Optional.ofNullable(
                    presentationGroupValues.getNullable("presentation_group_values")
                )

            fun pricingGroupValues(): Optional<PricingGroupValues> =
                Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            fun subtotalsWithQuantity(): Optional<List<SubtotalsWithQuantity>> =
                Optional.ofNullable(subtotalsWithQuantity.getNullable("subtotals_with_quantity"))

            @JsonProperty("exclusive_end_date")
            @ExcludeMissing
            fun _exclusiveEndDate(): JsonField<OffsetDateTime> = exclusiveEndDate

            @JsonProperty("inclusive_start_date")
            @ExcludeMissing
            fun _inclusiveStartDate(): JsonField<OffsetDateTime> = inclusiveStartDate

            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun _presentationGroupValues(): JsonField<PresentationGroupValues> =
                presentationGroupValues

            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("subtotals_with_quantity")
            @ExcludeMissing
            fun _subtotalsWithQuantity(): JsonField<List<SubtotalsWithQuantity>> =
                subtotalsWithQuantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

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

                fun exclusiveEndDate(exclusiveEndDate: JsonField<OffsetDateTime>) = apply {
                    this.exclusiveEndDate = exclusiveEndDate
                }

                fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) =
                    inclusiveStartDate(JsonField.of(inclusiveStartDate))

                fun inclusiveStartDate(inclusiveStartDate: JsonField<OffsetDateTime>) = apply {
                    this.inclusiveStartDate = inclusiveStartDate
                }

                fun productId(productId: String) = productId(JsonField.of(productId))

                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    presentationGroupValues(JsonField.of(presentationGroupValues))

                fun presentationGroupValues(
                    presentationGroupValues: JsonField<PresentationGroupValues>
                ) = apply { this.presentationGroupValues = presentationGroupValues }

                fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                    pricingGroupValues(JsonField.of(pricingGroupValues))

                fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun subtotalsWithQuantity(subtotalsWithQuantity: List<SubtotalsWithQuantity>) =
                    subtotalsWithQuantity(JsonField.of(subtotalsWithQuantity))

                fun subtotalsWithQuantity(
                    subtotalsWithQuantity: JsonField<List<SubtotalsWithQuantity>>
                ) = apply {
                    this.subtotalsWithQuantity = subtotalsWithQuantity.map { it.toMutableList() }
                }

                fun addSubtotalsWithQuantity(subtotalsWithQuantity: SubtotalsWithQuantity) = apply {
                    this.subtotalsWithQuantity =
                        (this.subtotalsWithQuantity ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(subtotalsWithQuantity)
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

                fun build(): UsageLineItem =
                    UsageLineItem(
                        checkRequired("exclusiveEndDate", exclusiveEndDate),
                        checkRequired("inclusiveStartDate", inclusiveStartDate),
                        checkRequired("productId", productId),
                        presentationGroupValues,
                        pricingGroupValues,
                        quantity,
                        (subtotalsWithQuantity ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class PresentationGroupValues
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PresentationGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

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

                    fun build(): PresentationGroupValues =
                        PresentationGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PresentationGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PresentationGroupValues{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PricingGroupValues
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PricingGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

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

                    fun build(): PricingGroupValues =
                        PricingGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PricingGroupValues{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class SubtotalsWithQuantity
            @JsonCreator
            private constructor(
                @JsonProperty("exclusive_end_date")
                @ExcludeMissing
                private val exclusiveEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("inclusive_start_date")
                @ExcludeMissing
                private val inclusiveStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun exclusiveEndDate(): OffsetDateTime =
                    exclusiveEndDate.getRequired("exclusive_end_date")

                fun inclusiveStartDate(): OffsetDateTime =
                    inclusiveStartDate.getRequired("inclusive_start_date")

                fun quantity(): Double = quantity.getRequired("quantity")

                @JsonProperty("exclusive_end_date")
                @ExcludeMissing
                fun _exclusiveEndDate(): JsonField<OffsetDateTime> = exclusiveEndDate

                @JsonProperty("inclusive_start_date")
                @ExcludeMissing
                fun _inclusiveStartDate(): JsonField<OffsetDateTime> = inclusiveStartDate

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

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

                    fun exclusiveEndDate(exclusiveEndDate: JsonField<OffsetDateTime>) = apply {
                        this.exclusiveEndDate = exclusiveEndDate
                    }

                    fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) =
                        inclusiveStartDate(JsonField.of(inclusiveStartDate))

                    fun inclusiveStartDate(inclusiveStartDate: JsonField<OffsetDateTime>) = apply {
                        this.inclusiveStartDate = inclusiveStartDate
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

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

                    fun build(): SubtotalsWithQuantity =
                        SubtotalsWithQuantity(
                            checkRequired("exclusiveEndDate", exclusiveEndDate),
                            checkRequired("inclusiveStartDate", inclusiveStartDate),
                            checkRequired("quantity", quantity),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SubtotalsWithQuantity && exclusiveEndDate == other.exclusiveEndDate && inclusiveStartDate == other.inclusiveStartDate && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(exclusiveEndDate, inclusiveStartDate, quantity, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SubtotalsWithQuantity{exclusiveEndDate=$exclusiveEndDate, inclusiveStartDate=$inclusiveStartDate, quantity=$quantity, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageLineItem && exclusiveEndDate == other.exclusiveEndDate && inclusiveStartDate == other.inclusiveStartDate && productId == other.productId && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && quantity == other.quantity && subtotalsWithQuantity == other.subtotalsWithQuantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(exclusiveEndDate, inclusiveStartDate, productId, presentationGroupValues, pricingGroupValues, quantity, subtotalsWithQuantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageLineItem{exclusiveEndDate=$exclusiveEndDate, inclusiveStartDate=$inclusiveStartDate, productId=$productId, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, quantity=$quantity, subtotalsWithQuantity=$subtotalsWithQuantity, additionalProperties=$additionalProperties}"
        }

        /** This field's availability is dependent on your client's configuration. */
        class BillableStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BILLABLE = of("billable")

                @JvmField val UNBILLABLE = of("unbillable")

                @JvmStatic fun of(value: String) = BillableStatus(JsonField.of(value))
            }

            enum class Known {
                BILLABLE,
                UNBILLABLE,
            }

            enum class Value {
                BILLABLE,
                UNBILLABLE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BILLABLE -> Value.BILLABLE
                    UNBILLABLE -> Value.UNBILLABLE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BILLABLE -> Known.BILLABLE
                    UNBILLABLE -> Known.UNBILLABLE
                    else -> throw MetronomeInvalidDataException("Unknown BillableStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillableStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class BreakdownGranularity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val HOUR = of("HOUR")

                @JvmField val DAY = of("DAY")

                @JvmStatic fun of(value: String) = BreakdownGranularity(JsonField.of(value))
            }

            enum class Known {
                HOUR,
                DAY,
            }

            enum class Value {
                HOUR,
                DAY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    HOUR -> Value.HOUR
                    DAY -> Value.DAY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    HOUR -> Known.HOUR
                    DAY -> Known.DAY
                    else ->
                        throw MetronomeInvalidDataException("Unknown BreakdownGranularity: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BreakdownGranularity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

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

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Invoice && contractId == other.contractId && creditTypeId == other.creditTypeId && customerId == other.customerId && exclusiveEndDate == other.exclusiveEndDate && inclusiveStartDate == other.inclusiveStartDate && issueDate == other.issueDate && usageLineItems == other.usageLineItems && billableStatus == other.billableStatus && breakdownGranularity == other.breakdownGranularity && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, creditTypeId, customerId, exclusiveEndDate, inclusiveStartDate, issueDate, usageLineItems, billableStatus, breakdownGranularity, customFields, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Invoice{contractId=$contractId, creditTypeId=$creditTypeId, customerId=$customerId, exclusiveEndDate=$exclusiveEndDate, inclusiveStartDate=$inclusiveStartDate, issueDate=$issueDate, usageLineItems=$usageLineItems, billableStatus=$billableStatus, breakdownGranularity=$breakdownGranularity, customFields=$customFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractCreateHistoricalInvoicesParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractCreateHistoricalInvoicesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
