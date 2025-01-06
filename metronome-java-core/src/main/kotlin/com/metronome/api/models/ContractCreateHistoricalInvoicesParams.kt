// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractCreateHistoricalInvoicesParams
constructor(
    private val body: ContractCreateHistoricalInvoicesBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun invoices(): List<Invoice> = body.invoices()

    fun preview(): Boolean = body.preview()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ContractCreateHistoricalInvoicesBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractCreateHistoricalInvoicesBody
    @JsonCreator
    internal constructor(
        @JsonProperty("invoices") private val invoices: List<Invoice>,
        @JsonProperty("preview") private val preview: Boolean,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("invoices") fun invoices(): List<Invoice> = invoices

        @JsonProperty("preview") fun preview(): Boolean = preview

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var invoices: MutableList<Invoice>? = null
            private var preview: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractCreateHistoricalInvoicesBody: ContractCreateHistoricalInvoicesBody
            ) = apply {
                invoices = contractCreateHistoricalInvoicesBody.invoices.toMutableList()
                preview = contractCreateHistoricalInvoicesBody.preview
                additionalProperties =
                    contractCreateHistoricalInvoicesBody.additionalProperties.toMutableMap()
            }

            fun invoices(invoices: List<Invoice>) = apply {
                this.invoices = invoices.toMutableList()
            }

            fun addInvoice(invoice: Invoice) = apply {
                invoices = (invoices ?: mutableListOf()).apply { add(invoice) }
            }

            fun preview(preview: Boolean) = apply { this.preview = preview }

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
    class Builder {

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

        fun addInvoice(invoice: Invoice) = apply { body.addInvoice(invoice) }

        fun preview(preview: Boolean) = apply { body.preview(preview) }

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
        @JsonProperty("contract_id") private val contractId: String,
        @JsonProperty("credit_type_id") private val creditTypeId: String,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("exclusive_end_date") private val exclusiveEndDate: OffsetDateTime,
        @JsonProperty("inclusive_start_date") private val inclusiveStartDate: OffsetDateTime,
        @JsonProperty("issue_date") private val issueDate: OffsetDateTime,
        @JsonProperty("usage_line_items") private val usageLineItems: List<UsageLineItem>,
        @JsonProperty("billable_status") private val billableStatus: BillableStatus?,
        @JsonProperty("breakdown_granularity")
        private val breakdownGranularity: BreakdownGranularity?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("contract_id") fun contractId(): String = contractId

        @JsonProperty("credit_type_id") fun creditTypeId(): String = creditTypeId

        @JsonProperty("customer_id") fun customerId(): String = customerId

        @JsonProperty("exclusive_end_date")
        fun exclusiveEndDate(): OffsetDateTime = exclusiveEndDate

        @JsonProperty("inclusive_start_date")
        fun inclusiveStartDate(): OffsetDateTime = inclusiveStartDate

        @JsonProperty("issue_date") fun issueDate(): OffsetDateTime = issueDate

        @JsonProperty("usage_line_items") fun usageLineItems(): List<UsageLineItem> = usageLineItems

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("billable_status")
        fun billableStatus(): Optional<BillableStatus> = Optional.ofNullable(billableStatus)

        @JsonProperty("breakdown_granularity")
        fun breakdownGranularity(): Optional<BreakdownGranularity> =
            Optional.ofNullable(breakdownGranularity)

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contractId: String? = null
            private var creditTypeId: String? = null
            private var customerId: String? = null
            private var exclusiveEndDate: OffsetDateTime? = null
            private var inclusiveStartDate: OffsetDateTime? = null
            private var issueDate: OffsetDateTime? = null
            private var usageLineItems: MutableList<UsageLineItem>? = null
            private var billableStatus: BillableStatus? = null
            private var breakdownGranularity: BreakdownGranularity? = null
            private var customFields: CustomFields? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoice: Invoice) = apply {
                contractId = invoice.contractId
                creditTypeId = invoice.creditTypeId
                customerId = invoice.customerId
                exclusiveEndDate = invoice.exclusiveEndDate
                inclusiveStartDate = invoice.inclusiveStartDate
                issueDate = invoice.issueDate
                usageLineItems = invoice.usageLineItems.toMutableList()
                billableStatus = invoice.billableStatus
                breakdownGranularity = invoice.breakdownGranularity
                customFields = invoice.customFields
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = apply { this.contractId = contractId }

            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) = apply {
                this.exclusiveEndDate = exclusiveEndDate
            }

            fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) = apply {
                this.inclusiveStartDate = inclusiveStartDate
            }

            fun issueDate(issueDate: OffsetDateTime) = apply { this.issueDate = issueDate }

            fun usageLineItems(usageLineItems: List<UsageLineItem>) = apply {
                this.usageLineItems = usageLineItems.toMutableList()
            }

            fun addUsageLineItem(usageLineItem: UsageLineItem) = apply {
                usageLineItems = (usageLineItems ?: mutableListOf()).apply { add(usageLineItem) }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun billableStatus(billableStatus: BillableStatus?) = apply {
                this.billableStatus = billableStatus
            }

            /** This field's availability is dependent on your client's configuration. */
            fun billableStatus(billableStatus: Optional<BillableStatus>) =
                billableStatus(billableStatus.orElse(null))

            fun breakdownGranularity(breakdownGranularity: BreakdownGranularity?) = apply {
                this.breakdownGranularity = breakdownGranularity
            }

            fun breakdownGranularity(breakdownGranularity: Optional<BreakdownGranularity>) =
                breakdownGranularity(breakdownGranularity.orElse(null))

            fun customFields(customFields: CustomFields?) = apply {
                this.customFields = customFields
            }

            fun customFields(customFields: Optional<CustomFields>) =
                customFields(customFields.orElse(null))

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
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(creditTypeId) { "`creditTypeId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(exclusiveEndDate) {
                        "`exclusiveEndDate` is required but was not set"
                    },
                    checkNotNull(inclusiveStartDate) {
                        "`inclusiveStartDate` is required but was not set"
                    },
                    checkNotNull(issueDate) { "`issueDate` is required but was not set" },
                    checkNotNull(usageLineItems) { "`usageLineItems` is required but was not set" }
                        .toImmutable(),
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
            @JsonProperty("exclusive_end_date") private val exclusiveEndDate: OffsetDateTime,
            @JsonProperty("inclusive_start_date") private val inclusiveStartDate: OffsetDateTime,
            @JsonProperty("product_id") private val productId: String,
            @JsonProperty("presentation_group_values")
            private val presentationGroupValues: PresentationGroupValues?,
            @JsonProperty("pricing_group_values")
            private val pricingGroupValues: PricingGroupValues?,
            @JsonProperty("quantity") private val quantity: Double?,
            @JsonProperty("subtotals_with_quantity")
            private val subtotalsWithQuantity: List<SubtotalsWithQuantity>?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("exclusive_end_date")
            fun exclusiveEndDate(): OffsetDateTime = exclusiveEndDate

            @JsonProperty("inclusive_start_date")
            fun inclusiveStartDate(): OffsetDateTime = inclusiveStartDate

            @JsonProperty("product_id") fun productId(): String = productId

            @JsonProperty("presentation_group_values")
            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                Optional.ofNullable(presentationGroupValues)

            @JsonProperty("pricing_group_values")
            fun pricingGroupValues(): Optional<PricingGroupValues> =
                Optional.ofNullable(pricingGroupValues)

            @JsonProperty("quantity")
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

            @JsonProperty("subtotals_with_quantity")
            fun subtotalsWithQuantity(): Optional<List<SubtotalsWithQuantity>> =
                Optional.ofNullable(subtotalsWithQuantity)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var exclusiveEndDate: OffsetDateTime? = null
                private var inclusiveStartDate: OffsetDateTime? = null
                private var productId: String? = null
                private var presentationGroupValues: PresentationGroupValues? = null
                private var pricingGroupValues: PricingGroupValues? = null
                private var quantity: Double? = null
                private var subtotalsWithQuantity: MutableList<SubtotalsWithQuantity>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usageLineItem: UsageLineItem) = apply {
                    exclusiveEndDate = usageLineItem.exclusiveEndDate
                    inclusiveStartDate = usageLineItem.inclusiveStartDate
                    productId = usageLineItem.productId
                    presentationGroupValues = usageLineItem.presentationGroupValues
                    pricingGroupValues = usageLineItem.pricingGroupValues
                    quantity = usageLineItem.quantity
                    subtotalsWithQuantity = usageLineItem.subtotalsWithQuantity?.toMutableList()
                    additionalProperties = usageLineItem.additionalProperties.toMutableMap()
                }

                fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) = apply {
                    this.exclusiveEndDate = exclusiveEndDate
                }

                fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) = apply {
                    this.inclusiveStartDate = inclusiveStartDate
                }

                fun productId(productId: String) = apply { this.productId = productId }

                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues?) =
                    apply {
                        this.presentationGroupValues = presentationGroupValues
                    }

                fun presentationGroupValues(
                    presentationGroupValues: Optional<PresentationGroupValues>
                ) = presentationGroupValues(presentationGroupValues.orElse(null))

                fun pricingGroupValues(pricingGroupValues: PricingGroupValues?) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                fun pricingGroupValues(pricingGroupValues: Optional<PricingGroupValues>) =
                    pricingGroupValues(pricingGroupValues.orElse(null))

                fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                fun quantity(quantity: Double) = quantity(quantity as Double?)

                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun quantity(quantity: Optional<Double>) =
                    quantity(quantity.orElse(null) as Double?)

                fun subtotalsWithQuantity(subtotalsWithQuantity: List<SubtotalsWithQuantity>?) =
                    apply {
                        this.subtotalsWithQuantity = subtotalsWithQuantity?.toMutableList()
                    }

                fun subtotalsWithQuantity(
                    subtotalsWithQuantity: Optional<List<SubtotalsWithQuantity>>
                ) = subtotalsWithQuantity(subtotalsWithQuantity.orElse(null))

                fun addSubtotalsWithQuantity(subtotalsWithQuantity: SubtotalsWithQuantity) = apply {
                    this.subtotalsWithQuantity =
                        (this.subtotalsWithQuantity ?: mutableListOf()).apply {
                            add(subtotalsWithQuantity)
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
                        checkNotNull(exclusiveEndDate) {
                            "`exclusiveEndDate` is required but was not set"
                        },
                        checkNotNull(inclusiveStartDate) {
                            "`inclusiveStartDate` is required but was not set"
                        },
                        checkNotNull(productId) { "`productId` is required but was not set" },
                        presentationGroupValues,
                        pricingGroupValues,
                        quantity,
                        subtotalsWithQuantity?.toImmutable(),
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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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
                @JsonProperty("exclusive_end_date") private val exclusiveEndDate: OffsetDateTime,
                @JsonProperty("inclusive_start_date")
                private val inclusiveStartDate: OffsetDateTime,
                @JsonProperty("quantity") private val quantity: Double,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("exclusive_end_date")
                fun exclusiveEndDate(): OffsetDateTime = exclusiveEndDate

                @JsonProperty("inclusive_start_date")
                fun inclusiveStartDate(): OffsetDateTime = inclusiveStartDate

                @JsonProperty("quantity") fun quantity(): Double = quantity

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var exclusiveEndDate: OffsetDateTime? = null
                    private var inclusiveStartDate: OffsetDateTime? = null
                    private var quantity: Double? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(subtotalsWithQuantity: SubtotalsWithQuantity) = apply {
                        exclusiveEndDate = subtotalsWithQuantity.exclusiveEndDate
                        inclusiveStartDate = subtotalsWithQuantity.inclusiveStartDate
                        quantity = subtotalsWithQuantity.quantity
                        additionalProperties =
                            subtotalsWithQuantity.additionalProperties.toMutableMap()
                    }

                    fun exclusiveEndDate(exclusiveEndDate: OffsetDateTime) = apply {
                        this.exclusiveEndDate = exclusiveEndDate
                    }

                    fun inclusiveStartDate(inclusiveStartDate: OffsetDateTime) = apply {
                        this.inclusiveStartDate = inclusiveStartDate
                    }

                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

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
                            checkNotNull(exclusiveEndDate) {
                                "`exclusiveEndDate` is required but was not set"
                            },
                            checkNotNull(inclusiveStartDate) {
                                "`inclusiveStartDate` is required but was not set"
                            },
                            checkNotNull(quantity) { "`quantity` is required but was not set" },
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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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
