// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CustomerCreditCreateParams
constructor(
    private val accessSchedule: AccessSchedule,
    private val customerId: String,
    private val priority: Double,
    private val productId: String,
    private val applicableContractIds: List<String>?,
    private val applicableProductIds: List<String>?,
    private val applicableProductTags: List<String>?,
    private val customFields: CustomFields?,
    private val description: String?,
    private val name: String?,
    private val netsuiteSalesOrderId: String?,
    private val salesforceOpportunityId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accessSchedule(): AccessSchedule = accessSchedule

    fun customerId(): String = customerId

    fun priority(): Double = priority

    fun productId(): String = productId

    fun applicableContractIds(): Optional<List<String>> = Optional.ofNullable(applicableContractIds)

    fun applicableProductIds(): Optional<List<String>> = Optional.ofNullable(applicableProductIds)

    fun applicableProductTags(): Optional<List<String>> = Optional.ofNullable(applicableProductTags)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

    fun salesforceOpportunityId(): Optional<String> = Optional.ofNullable(salesforceOpportunityId)

    @JvmSynthetic
    internal fun getBody(): CustomerCreditCreateBody {
        return CustomerCreditCreateBody(
            accessSchedule,
            customerId,
            priority,
            productId,
            applicableContractIds,
            applicableProductIds,
            applicableProductTags,
            customFields,
            description,
            name,
            netsuiteSalesOrderId,
            salesforceOpportunityId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomerCreditCreateBody.Builder::class)
    @NoAutoDetect
    class CustomerCreditCreateBody
    internal constructor(
        private val accessSchedule: AccessSchedule?,
        private val customerId: String?,
        private val priority: Double?,
        private val productId: String?,
        private val applicableContractIds: List<String>?,
        private val applicableProductIds: List<String>?,
        private val applicableProductTags: List<String>?,
        private val customFields: CustomFields?,
        private val description: String?,
        private val name: String?,
        private val netsuiteSalesOrderId: String?,
        private val salesforceOpportunityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Schedule for distributing the credit to the customer. */
        @JsonProperty("access_schedule") fun accessSchedule(): AccessSchedule? = accessSchedule

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        @JsonProperty("priority") fun priority(): Double? = priority

        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        @JsonProperty("applicable_contract_ids")
        fun applicableContractIds(): List<String>? = applicableContractIds

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): List<String>? = applicableProductIds

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): List<String>? = applicableProductTags

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description") fun description(): String? = description

        /** displayed on invoices */
        @JsonProperty("name") fun name(): String? = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        fun salesforceOpportunityId(): String? = salesforceOpportunityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accessSchedule: AccessSchedule? = null
            private var customerId: String? = null
            private var priority: Double? = null
            private var productId: String? = null
            private var applicableContractIds: List<String>? = null
            private var applicableProductIds: List<String>? = null
            private var applicableProductTags: List<String>? = null
            private var customFields: CustomFields? = null
            private var description: String? = null
            private var name: String? = null
            private var netsuiteSalesOrderId: String? = null
            private var salesforceOpportunityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCreditCreateBody: CustomerCreditCreateBody) = apply {
                this.accessSchedule = customerCreditCreateBody.accessSchedule
                this.customerId = customerCreditCreateBody.customerId
                this.priority = customerCreditCreateBody.priority
                this.productId = customerCreditCreateBody.productId
                this.applicableContractIds = customerCreditCreateBody.applicableContractIds
                this.applicableProductIds = customerCreditCreateBody.applicableProductIds
                this.applicableProductTags = customerCreditCreateBody.applicableProductTags
                this.customFields = customerCreditCreateBody.customFields
                this.description = customerCreditCreateBody.description
                this.name = customerCreditCreateBody.name
                this.netsuiteSalesOrderId = customerCreditCreateBody.netsuiteSalesOrderId
                this.salesforceOpportunityId = customerCreditCreateBody.salesforceOpportunityId
                additionalProperties(customerCreditCreateBody.additionalProperties)
            }

            /** Schedule for distributing the credit to the customer. */
            @JsonProperty("access_schedule")
            fun accessSchedule(accessSchedule: AccessSchedule) = apply {
                this.accessSchedule = accessSchedule
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            @JsonProperty("priority")
            fun priority(priority: Double) = apply { this.priority = priority }

            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Which contract the credit applies to. If not provided, the credit applies to all
             * contracts.
             */
            @JsonProperty("applicable_contract_ids")
            fun applicableContractIds(applicableContractIds: List<String>) = apply {
                this.applicableContractIds = applicableContractIds
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            @JsonProperty("applicable_product_ids")
            fun applicableProductIds(applicableProductIds: List<String>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            @JsonProperty("applicable_product_tags")
            fun applicableProductTags(applicableProductTags: List<String>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** displayed on invoices */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("salesforce_opportunity_id")
            fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
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

            fun build(): CustomerCreditCreateBody =
                CustomerCreditCreateBody(
                    checkNotNull(accessSchedule) { "`accessSchedule` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(priority) { "`priority` is required but was not set" },
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    applicableContractIds?.toImmutable(),
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    customFields,
                    description,
                    name,
                    netsuiteSalesOrderId,
                    salesforceOpportunityId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCreditCreateBody && this.accessSchedule == other.accessSchedule && this.customerId == other.customerId && this.priority == other.priority && this.productId == other.productId && this.applicableContractIds == other.applicableContractIds && this.applicableProductIds == other.applicableProductIds && this.applicableProductTags == other.applicableProductTags && this.customFields == other.customFields && this.description == other.description && this.name == other.name && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.salesforceOpportunityId == other.salesforceOpportunityId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accessSchedule, customerId, priority, productId, applicableContractIds, applicableProductIds, applicableProductTags, customFields, description, name, netsuiteSalesOrderId, salesforceOpportunityId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerCreditCreateBody{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, salesforceOpportunityId=$salesforceOpportunityId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditCreateParams && this.accessSchedule == other.accessSchedule && this.customerId == other.customerId && this.priority == other.priority && this.productId == other.productId && this.applicableContractIds == other.applicableContractIds && this.applicableProductIds == other.applicableProductIds && this.applicableProductTags == other.applicableProductTags && this.customFields == other.customFields && this.description == other.description && this.name == other.name && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.salesforceOpportunityId == other.salesforceOpportunityId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accessSchedule, customerId, priority, productId, applicableContractIds, applicableProductIds, applicableProductTags, customFields, description, name, netsuiteSalesOrderId, salesforceOpportunityId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditCreateParams{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, salesforceOpportunityId=$salesforceOpportunityId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accessSchedule: AccessSchedule? = null
        private var customerId: String? = null
        private var priority: Double? = null
        private var productId: String? = null
        private var applicableContractIds: MutableList<String> = mutableListOf()
        private var applicableProductIds: MutableList<String> = mutableListOf()
        private var applicableProductTags: MutableList<String> = mutableListOf()
        private var customFields: CustomFields? = null
        private var description: String? = null
        private var name: String? = null
        private var netsuiteSalesOrderId: String? = null
        private var salesforceOpportunityId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreditCreateParams: CustomerCreditCreateParams) = apply {
            this.accessSchedule = customerCreditCreateParams.accessSchedule
            this.customerId = customerCreditCreateParams.customerId
            this.priority = customerCreditCreateParams.priority
            this.productId = customerCreditCreateParams.productId
            this.applicableContractIds(customerCreditCreateParams.applicableContractIds ?: listOf())
            this.applicableProductIds(customerCreditCreateParams.applicableProductIds ?: listOf())
            this.applicableProductTags(customerCreditCreateParams.applicableProductTags ?: listOf())
            this.customFields = customerCreditCreateParams.customFields
            this.description = customerCreditCreateParams.description
            this.name = customerCreditCreateParams.name
            this.netsuiteSalesOrderId = customerCreditCreateParams.netsuiteSalesOrderId
            this.salesforceOpportunityId = customerCreditCreateParams.salesforceOpportunityId
            additionalQueryParams(customerCreditCreateParams.additionalQueryParams)
            additionalHeaders(customerCreditCreateParams.additionalHeaders)
            additionalBodyProperties(customerCreditCreateParams.additionalBodyProperties)
        }

        /** Schedule for distributing the credit to the customer. */
        fun accessSchedule(accessSchedule: AccessSchedule) = apply {
            this.accessSchedule = accessSchedule
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(priority: Double) = apply { this.priority = priority }

        fun productId(productId: String) = apply { this.productId = productId }

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        fun applicableContractIds(applicableContractIds: List<String>) = apply {
            this.applicableContractIds.clear()
            this.applicableContractIds.addAll(applicableContractIds)
        }

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        fun addApplicableContractId(applicableContractId: String) = apply {
            this.applicableContractIds.add(applicableContractId)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: List<String>) = apply {
            this.applicableProductIds.clear()
            this.applicableProductIds.addAll(applicableProductIds)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun addApplicableProductId(applicableProductId: String) = apply {
            this.applicableProductIds.add(applicableProductId)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: List<String>) = apply {
            this.applicableProductTags.clear()
            this.applicableProductTags.addAll(applicableProductTags)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun addApplicableProductTag(applicableProductTag: String) = apply {
            this.applicableProductTags.add(applicableProductTag)
        }

        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(description: String) = apply { this.description = description }

        /** displayed on invoices */
        fun name(name: String) = apply { this.name = name }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): CustomerCreditCreateParams =
            CustomerCreditCreateParams(
                checkNotNull(accessSchedule) { "`accessSchedule` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(priority) { "`priority` is required but was not set" },
                checkNotNull(productId) { "`productId` is required but was not set" },
                if (applicableContractIds.size == 0) null else applicableContractIds.toImmutable(),
                if (applicableProductIds.size == 0) null else applicableProductIds.toImmutable(),
                if (applicableProductTags.size == 0) null else applicableProductTags.toImmutable(),
                customFields,
                description,
                name,
                netsuiteSalesOrderId,
                salesforceOpportunityId,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Schedule for distributing the credit to the customer. */
    @JsonDeserialize(builder = AccessSchedule.Builder::class)
    @NoAutoDetect
    class AccessSchedule
    private constructor(
        private val creditTypeId: String?,
        private val scheduleItems: List<ScheduleItem>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

        @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem>? = scheduleItems

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditTypeId: String? = null
            private var scheduleItems: List<ScheduleItem>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessSchedule: AccessSchedule) = apply {
                this.creditTypeId = accessSchedule.creditTypeId
                this.scheduleItems = accessSchedule.scheduleItems
                additionalProperties(accessSchedule.additionalProperties)
            }

            @JsonProperty("credit_type_id")
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            @JsonProperty("schedule_items")
            fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                this.scheduleItems = scheduleItems
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

            fun build(): AccessSchedule =
                AccessSchedule(
                    creditTypeId,
                    checkNotNull(scheduleItems) { "`scheduleItems` is required but was not set" }
                        .toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = ScheduleItem.Builder::class)
        @NoAutoDetect
        class ScheduleItem
        private constructor(
            private val amount: Double?,
            private val startingAt: OffsetDateTime?,
            private val endingBefore: OffsetDateTime?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("amount") fun amount(): Double? = amount

            /** RFC 3339 timestamp (inclusive) */
            @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

            /** RFC 3339 timestamp (exclusive) */
            @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: Double? = null
                private var startingAt: OffsetDateTime? = null
                private var endingBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scheduleItem: ScheduleItem) = apply {
                    this.amount = scheduleItem.amount
                    this.startingAt = scheduleItem.startingAt
                    this.endingBefore = scheduleItem.endingBefore
                    additionalProperties(scheduleItem.additionalProperties)
                }

                @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

                /** RFC 3339 timestamp (inclusive) */
                @JsonProperty("starting_at")
                fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

                /** RFC 3339 timestamp (exclusive) */
                @JsonProperty("ending_before")
                fun endingBefore(endingBefore: OffsetDateTime) = apply {
                    this.endingBefore = endingBefore
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

                fun build(): ScheduleItem =
                    ScheduleItem(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                        checkNotNull(endingBefore) { "`endingBefore` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ScheduleItem && this.amount == other.amount && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, startingAt, endingBefore, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ScheduleItem{amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccessSchedule && this.creditTypeId == other.creditTypeId && this.scheduleItems == other.scheduleItems && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(creditTypeId, scheduleItems, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccessSchedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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
}
