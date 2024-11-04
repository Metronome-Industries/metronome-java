// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class ContractCreateHistoricalInvoicesParams
constructor(
    private val invoices: List<Invoice>,
    private val preview: Boolean,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun invoices(): List<Invoice> = invoices

    fun preview(): Boolean = preview

    @JvmSynthetic
    internal fun getBody(): ContractCreateHistoricalInvoicesBody {
        return ContractCreateHistoricalInvoicesBody(
            invoices,
            preview,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ContractCreateHistoricalInvoicesBody.Builder::class)
    @NoAutoDetect
    class ContractCreateHistoricalInvoicesBody
    internal constructor(
        private val invoices: List<Invoice>?,
        private val preview: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("invoices") fun invoices(): List<Invoice>? = invoices

        @JsonProperty("preview") fun preview(): Boolean? = preview

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var invoices: List<Invoice>? = null
            private var preview: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractCreateHistoricalInvoicesBody: ContractCreateHistoricalInvoicesBody
            ) = apply {
                this.invoices = contractCreateHistoricalInvoicesBody.invoices
                this.preview = contractCreateHistoricalInvoicesBody.preview
                additionalProperties(contractCreateHistoricalInvoicesBody.additionalProperties)
            }

            @JsonProperty("invoices")
            fun invoices(invoices: List<Invoice>) = apply { this.invoices = invoices }

            @JsonProperty("preview")
            fun preview(preview: Boolean) = apply { this.preview = preview }

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

            fun build(): ContractCreateHistoricalInvoicesBody =
                ContractCreateHistoricalInvoicesBody(
                    checkNotNull(invoices) { "`invoices` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(preview) { "`preview` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractCreateHistoricalInvoicesBody && this.invoices == other.invoices && this.preview == other.preview && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(invoices, preview, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractCreateHistoricalInvoicesBody{invoices=$invoices, preview=$preview, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractCreateHistoricalInvoicesParams && this.invoices == other.invoices && this.preview == other.preview && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(invoices, preview, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractCreateHistoricalInvoicesParams{invoices=$invoices, preview=$preview, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var invoices: MutableList<Invoice> = mutableListOf()
        private var preview: Boolean? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractCreateHistoricalInvoicesParams: ContractCreateHistoricalInvoicesParams
        ) = apply {
            this.invoices(contractCreateHistoricalInvoicesParams.invoices)
            this.preview = contractCreateHistoricalInvoicesParams.preview
            additionalHeaders(contractCreateHistoricalInvoicesParams.additionalHeaders)
            additionalQueryParams(contractCreateHistoricalInvoicesParams.additionalQueryParams)
            additionalBodyProperties(
                contractCreateHistoricalInvoicesParams.additionalBodyProperties
            )
        }

        fun invoices(invoices: List<Invoice>) = apply {
            this.invoices.clear()
            this.invoices.addAll(invoices)
        }

        fun addInvoice(invoice: Invoice) = apply { this.invoices.add(invoice) }

        fun preview(preview: Boolean) = apply { this.preview = preview }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ContractCreateHistoricalInvoicesParams =
            ContractCreateHistoricalInvoicesParams(
                checkNotNull(invoices) { "`invoices` is required but was not set" }.toImmutable(),
                checkNotNull(preview) { "`preview` is required but was not set" },
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Invoice.Builder::class)
    @NoAutoDetect
    class Invoice
    private constructor(
        private val customerId: String?,
        private val contractId: String?,
        private val creditTypeId: String?,
        private val inclusiveStartDate: OffsetDateTime?,
        private val exclusiveEndDate: OffsetDateTime?,
        private val issueDate: OffsetDateTime?,
        private val breakdownGranularity: BreakdownGranularity?,
        private val usageLineItems: List<UsageLineItem>?,
        private val billableStatus: BillableStatus?,
        private val customFields: CustomFields?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonProperty("contract_id") fun contractId(): String? = contractId

        @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

        @JsonProperty("inclusive_start_date")
        fun inclusiveStartDate(): OffsetDateTime? = inclusiveStartDate

        @JsonProperty("exclusive_end_date")
        fun exclusiveEndDate(): OffsetDateTime? = exclusiveEndDate

        @JsonProperty("issue_date") fun issueDate(): OffsetDateTime? = issueDate

        @JsonProperty("breakdown_granularity")
        fun breakdownGranularity(): BreakdownGranularity? = breakdownGranularity

        @JsonProperty("usage_line_items")
        fun usageLineItems(): List<UsageLineItem>? = usageLineItems

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("billable_status") fun billableStatus(): BillableStatus? = billableStatus

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var contractId: String? = null
            private var creditTypeId: String? = null
            private var inclusiveStartDate: OffsetDateTime? = null
            private var exclusiveEndDate: OffsetDateTime? = null
            private var issueDate: OffsetDateTime? = null
            private var breakdownGranularity: BreakdownGranularity? = null
            private var usageLineItems: List<UsageLineItem>? = null
            private var billableStatus: BillableStatus? = null
            private var customFields: CustomFields? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoice: Invoice) = apply {
                this.customerId = invoice.customerId
                this.contractId = invoice.contractId
                this.creditTypeId = invoice.creditTypeId
                this.inclusiveStartDate = invoice.inclusiveStartDate
                this.exclusiveEndDate = invoice.exclusiveEndDate
                this.issueDate = invoice.issueDate
                this.breakdownGranularity = invoice.breakdownGranularity
                this.usageLineItems = invoice.usageLineItems
                this.billableStatus = invoice.billableStatus
                this.customFields = invoice.customFields
                additionalProperties(invoice.additionalProperties)
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            @JsonProperty("credit_type_id")
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            @JsonProperty("inclusive_start_date")
            fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) = apply {
                this.inclusiveStartDate = inclusiveStartDate
            }

            @JsonProperty("exclusive_end_date")
            fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) = apply {
                this.exclusiveEndDate = exclusiveEndDate
            }

            @JsonProperty("issue_date")
            fun issueDate(issueDate: OffsetDateTime) = apply { this.issueDate = issueDate }

            @JsonProperty("breakdown_granularity")
            fun breakdownGranularity(breakdownGranularity: BreakdownGranularity) = apply {
                this.breakdownGranularity = breakdownGranularity
            }

            @JsonProperty("usage_line_items")
            fun usageLineItems(usageLineItems: List<UsageLineItem>) = apply {
                this.usageLineItems = usageLineItems
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("billable_status")
            fun billableStatus(billableStatus: BillableStatus) = apply {
                this.billableStatus = billableStatus
            }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
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

            fun build(): Invoice =
                Invoice(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(creditTypeId) { "`creditTypeId` is required but was not set" },
                    checkNotNull(inclusiveStartDate) {
                        "`inclusiveStartDate` is required but was not set"
                    },
                    checkNotNull(exclusiveEndDate) {
                        "`exclusiveEndDate` is required but was not set"
                    },
                    checkNotNull(issueDate) { "`issueDate` is required but was not set" },
                    breakdownGranularity,
                    checkNotNull(usageLineItems) { "`usageLineItems` is required but was not set" }
                        .toImmutable(),
                    billableStatus,
                    customFields,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = UsageLineItem.Builder::class)
        @NoAutoDetect
        class UsageLineItem
        private constructor(
            private val productId: String?,
            private val inclusiveStartDate: OffsetDateTime?,
            private val exclusiveEndDate: OffsetDateTime?,
            private val quantity: Double?,
            private val pricingGroupValues: PricingGroupValues?,
            private val presentationGroupValues: PresentationGroupValues?,
            private val subtotalsWithQuantity: List<SubtotalsWithQuantity>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("product_id") fun productId(): String? = productId

            @JsonProperty("inclusive_start_date")
            fun inclusiveStartDate(): OffsetDateTime? = inclusiveStartDate

            @JsonProperty("exclusive_end_date")
            fun exclusiveEndDate(): OffsetDateTime? = exclusiveEndDate

            @JsonProperty("quantity") fun quantity(): Double? = quantity

            @JsonProperty("pricing_group_values")
            fun pricingGroupValues(): PricingGroupValues? = pricingGroupValues

            @JsonProperty("presentation_group_values")
            fun presentationGroupValues(): PresentationGroupValues? = presentationGroupValues

            @JsonProperty("subtotals_with_quantity")
            fun subtotalsWithQuantity(): List<SubtotalsWithQuantity>? = subtotalsWithQuantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var productId: String? = null
                private var inclusiveStartDate: OffsetDateTime? = null
                private var exclusiveEndDate: OffsetDateTime? = null
                private var quantity: Double? = null
                private var pricingGroupValues: PricingGroupValues? = null
                private var presentationGroupValues: PresentationGroupValues? = null
                private var subtotalsWithQuantity: List<SubtotalsWithQuantity>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usageLineItem: UsageLineItem) = apply {
                    this.productId = usageLineItem.productId
                    this.inclusiveStartDate = usageLineItem.inclusiveStartDate
                    this.exclusiveEndDate = usageLineItem.exclusiveEndDate
                    this.quantity = usageLineItem.quantity
                    this.pricingGroupValues = usageLineItem.pricingGroupValues
                    this.presentationGroupValues = usageLineItem.presentationGroupValues
                    this.subtotalsWithQuantity = usageLineItem.subtotalsWithQuantity
                    additionalProperties(usageLineItem.additionalProperties)
                }

                @JsonProperty("product_id")
                fun productId(productId: String) = apply { this.productId = productId }

                @JsonProperty("inclusive_start_date")
                fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) = apply {
                    this.inclusiveStartDate = inclusiveStartDate
                }

                @JsonProperty("exclusive_end_date")
                fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) = apply {
                    this.exclusiveEndDate = exclusiveEndDate
                }

                @JsonProperty("quantity")
                fun quantity(quantity: Double) = apply { this.quantity = quantity }

                @JsonProperty("pricing_group_values")
                fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                @JsonProperty("presentation_group_values")
                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    apply {
                        this.presentationGroupValues = presentationGroupValues
                    }

                @JsonProperty("subtotals_with_quantity")
                fun subtotalsWithQuantity(subtotalsWithQuantity: List<SubtotalsWithQuantity>) =
                    apply {
                        this.subtotalsWithQuantity = subtotalsWithQuantity
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UsageLineItem =
                    UsageLineItem(
                        checkNotNull(productId) { "`productId` is required but was not set" },
                        checkNotNull(inclusiveStartDate) {
                            "`inclusiveStartDate` is required but was not set"
                        },
                        checkNotNull(exclusiveEndDate) {
                            "`exclusiveEndDate` is required but was not set"
                        },
                        quantity,
                        pricingGroupValues,
                        presentationGroupValues,
                        subtotalsWithQuantity?.toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = PresentationGroupValues.Builder::class)
            @NoAutoDetect
            class PresentationGroupValues
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                        additionalProperties(presentationGroupValues.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PresentationGroupValues =
                        PresentationGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PresentationGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PresentationGroupValues{additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = PricingGroupValues.Builder::class)
            @NoAutoDetect
            class PricingGroupValues
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                        additionalProperties(pricingGroupValues.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PricingGroupValues =
                        PricingGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PricingGroupValues{additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SubtotalsWithQuantity.Builder::class)
            @NoAutoDetect
            class SubtotalsWithQuantity
            private constructor(
                private val inclusiveStartDate: OffsetDateTime?,
                private val exclusiveEndDate: OffsetDateTime?,
                private val quantity: Double?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonProperty("inclusive_start_date")
                fun inclusiveStartDate(): OffsetDateTime? = inclusiveStartDate

                @JsonProperty("exclusive_end_date")
                fun exclusiveEndDate(): OffsetDateTime? = exclusiveEndDate

                @JsonProperty("quantity") fun quantity(): Double? = quantity

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var inclusiveStartDate: OffsetDateTime? = null
                    private var exclusiveEndDate: OffsetDateTime? = null
                    private var quantity: Double? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(subtotalsWithQuantity: SubtotalsWithQuantity) = apply {
                        this.inclusiveStartDate = subtotalsWithQuantity.inclusiveStartDate
                        this.exclusiveEndDate = subtotalsWithQuantity.exclusiveEndDate
                        this.quantity = subtotalsWithQuantity.quantity
                        additionalProperties(subtotalsWithQuantity.additionalProperties)
                    }

                    @JsonProperty("inclusive_start_date")
                    fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) = apply {
                        this.inclusiveStartDate = inclusiveStartDate
                    }

                    @JsonProperty("exclusive_end_date")
                    fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) = apply {
                        this.exclusiveEndDate = exclusiveEndDate
                    }

                    @JsonProperty("quantity")
                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): SubtotalsWithQuantity =
                        SubtotalsWithQuantity(
                            checkNotNull(inclusiveStartDate) {
                                "`inclusiveStartDate` is required but was not set"
                            },
                            checkNotNull(exclusiveEndDate) {
                                "`exclusiveEndDate` is required but was not set"
                            },
                            checkNotNull(quantity) { "`quantity` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SubtotalsWithQuantity && this.inclusiveStartDate == other.inclusiveStartDate && this.exclusiveEndDate == other.exclusiveEndDate && this.quantity == other.quantity && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(inclusiveStartDate, exclusiveEndDate, quantity, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "SubtotalsWithQuantity{inclusiveStartDate=$inclusiveStartDate, exclusiveEndDate=$exclusiveEndDate, quantity=$quantity, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageLineItem && this.productId == other.productId && this.inclusiveStartDate == other.inclusiveStartDate && this.exclusiveEndDate == other.exclusiveEndDate && this.quantity == other.quantity && this.pricingGroupValues == other.pricingGroupValues && this.presentationGroupValues == other.presentationGroupValues && this.subtotalsWithQuantity == other.subtotalsWithQuantity && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(productId, inclusiveStartDate, exclusiveEndDate, quantity, pricingGroupValues, presentationGroupValues, subtotalsWithQuantity, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "UsageLineItem{productId=$productId, inclusiveStartDate=$inclusiveStartDate, exclusiveEndDate=$exclusiveEndDate, quantity=$quantity, pricingGroupValues=$pricingGroupValues, presentationGroupValues=$presentationGroupValues, subtotalsWithQuantity=$subtotalsWithQuantity, additionalProperties=$additionalProperties}"
        }

        class BillableStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillableStatus && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val BILLABLE = BillableStatus(JsonField.of("billable"))

                @JvmField val UNBILLABLE = BillableStatus(JsonField.of("unbillable"))

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
        }

        class BreakdownGranularity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BreakdownGranularity && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val HOUR = BreakdownGranularity(JsonField.of("HOUR"))

                @JvmField val DAY = BreakdownGranularity(JsonField.of("DAY"))

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
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties(customFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Invoice && this.customerId == other.customerId && this.contractId == other.contractId && this.creditTypeId == other.creditTypeId && this.inclusiveStartDate == other.inclusiveStartDate && this.exclusiveEndDate == other.exclusiveEndDate && this.issueDate == other.issueDate && this.breakdownGranularity == other.breakdownGranularity && this.usageLineItems == other.usageLineItems && this.billableStatus == other.billableStatus && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, contractId, creditTypeId, inclusiveStartDate, exclusiveEndDate, issueDate, breakdownGranularity, usageLineItems, billableStatus, customFields, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Invoice{customerId=$customerId, contractId=$contractId, creditTypeId=$creditTypeId, inclusiveStartDate=$inclusiveStartDate, exclusiveEndDate=$exclusiveEndDate, issueDate=$issueDate, breakdownGranularity=$breakdownGranularity, usageLineItems=$usageLineItems, billableStatus=$billableStatus, customFields=$customFields, additionalProperties=$additionalProperties}"
    }
}
