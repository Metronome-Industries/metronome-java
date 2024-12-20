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
    private val rateType: RateType?,
    private val salesforceOpportunityId: String?,
    private val uniquenessKey: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    fun rateType(): Optional<RateType> = Optional.ofNullable(rateType)

    fun salesforceOpportunityId(): Optional<String> = Optional.ofNullable(salesforceOpportunityId)

    fun uniquenessKey(): Optional<String> = Optional.ofNullable(uniquenessKey)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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
            rateType,
            salesforceOpportunityId,
            uniquenessKey,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CustomerCreditCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("access_schedule") private val accessSchedule: AccessSchedule,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("priority") private val priority: Double,
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("applicable_contract_ids") private val applicableContractIds: List<String>?,
        @JsonProperty("applicable_product_ids") private val applicableProductIds: List<String>?,
        @JsonProperty("applicable_product_tags") private val applicableProductTags: List<String>?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonProperty("rate_type") private val rateType: RateType?,
        @JsonProperty("salesforce_opportunity_id") private val salesforceOpportunityId: String?,
        @JsonProperty("uniqueness_key") private val uniquenessKey: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Schedule for distributing the credit to the customer. */
        @JsonProperty("access_schedule") fun accessSchedule(): AccessSchedule = accessSchedule

        @JsonProperty("customer_id") fun customerId(): String = customerId

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        @JsonProperty("priority") fun priority(): Double = priority

        @JsonProperty("product_id") fun productId(): String = productId

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        @JsonProperty("applicable_contract_ids")
        fun applicableContractIds(): Optional<List<String>> =
            Optional.ofNullable(applicableContractIds)

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds)

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags)

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /** displayed on invoices */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

        @JsonProperty("rate_type")
        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId)

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        fun uniquenessKey(): Optional<String> = Optional.ofNullable(uniquenessKey)

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
            private var rateType: RateType? = null
            private var salesforceOpportunityId: String? = null
            private var uniquenessKey: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCreditCreateBody: CustomerCreditCreateBody) = apply {
                accessSchedule = customerCreditCreateBody.accessSchedule
                customerId = customerCreditCreateBody.customerId
                priority = customerCreditCreateBody.priority
                productId = customerCreditCreateBody.productId
                applicableContractIds =
                    customerCreditCreateBody.applicableContractIds?.toMutableList()
                applicableProductIds =
                    customerCreditCreateBody.applicableProductIds?.toMutableList()
                applicableProductTags =
                    customerCreditCreateBody.applicableProductTags?.toMutableList()
                customFields = customerCreditCreateBody.customFields
                description = customerCreditCreateBody.description
                name = customerCreditCreateBody.name
                netsuiteSalesOrderId = customerCreditCreateBody.netsuiteSalesOrderId
                rateType = customerCreditCreateBody.rateType
                salesforceOpportunityId = customerCreditCreateBody.salesforceOpportunityId
                uniquenessKey = customerCreditCreateBody.uniquenessKey
                additionalProperties = customerCreditCreateBody.additionalProperties.toMutableMap()
            }

            /** Schedule for distributing the credit to the customer. */
            fun accessSchedule(accessSchedule: AccessSchedule) = apply {
                this.accessSchedule = accessSchedule
            }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: Double) = apply { this.priority = priority }

            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Which contract the credit applies to. If not provided, the credit applies to all
             * contracts.
             */
            fun applicableContractIds(applicableContractIds: List<String>) = apply {
                this.applicableContractIds = applicableContractIds
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = apply { this.description = description }

            /** displayed on invoices */
            fun name(name: String) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun rateType(rateType: RateType) = apply { this.rateType = rateType }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            /**
             * Prevents the creation of duplicates. If a request to create a commit or credit is
             * made with a uniqueness key that was previously used to create a commit or credit, a
             * new record will not be created and the request will fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

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
                    rateType,
                    salesforceOpportunityId,
                    uniquenessKey,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCreditCreateBody && accessSchedule == other.accessSchedule && customerId == other.customerId && priority == other.priority && productId == other.productId && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && rateType == other.rateType && salesforceOpportunityId == other.salesforceOpportunityId && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessSchedule, customerId, priority, productId, applicableContractIds, applicableProductIds, applicableProductTags, customFields, description, name, netsuiteSalesOrderId, rateType, salesforceOpportunityId, uniquenessKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCreditCreateBody{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rateType=$rateType, salesforceOpportunityId=$salesforceOpportunityId, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

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
        private var rateType: RateType? = null
        private var salesforceOpportunityId: String? = null
        private var uniquenessKey: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreditCreateParams: CustomerCreditCreateParams) = apply {
            accessSchedule = customerCreditCreateParams.accessSchedule
            customerId = customerCreditCreateParams.customerId
            priority = customerCreditCreateParams.priority
            productId = customerCreditCreateParams.productId
            applicableContractIds =
                customerCreditCreateParams.applicableContractIds?.toMutableList() ?: mutableListOf()
            applicableProductIds =
                customerCreditCreateParams.applicableProductIds?.toMutableList() ?: mutableListOf()
            applicableProductTags =
                customerCreditCreateParams.applicableProductTags?.toMutableList() ?: mutableListOf()
            customFields = customerCreditCreateParams.customFields
            description = customerCreditCreateParams.description
            name = customerCreditCreateParams.name
            netsuiteSalesOrderId = customerCreditCreateParams.netsuiteSalesOrderId
            rateType = customerCreditCreateParams.rateType
            salesforceOpportunityId = customerCreditCreateParams.salesforceOpportunityId
            uniquenessKey = customerCreditCreateParams.uniquenessKey
            additionalHeaders = customerCreditCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreditCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                customerCreditCreateParams.additionalBodyProperties.toMutableMap()
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

        fun rateType(rateType: RateType) = apply { this.rateType = rateType }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

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

        fun build(): CustomerCreditCreateParams =
            CustomerCreditCreateParams(
                checkNotNull(accessSchedule) { "`accessSchedule` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(priority) { "`priority` is required but was not set" },
                checkNotNull(productId) { "`productId` is required but was not set" },
                applicableContractIds.toImmutable().ifEmpty { null },
                applicableProductIds.toImmutable().ifEmpty { null },
                applicableProductTags.toImmutable().ifEmpty { null },
                customFields,
                description,
                name,
                netsuiteSalesOrderId,
                rateType,
                salesforceOpportunityId,
                uniquenessKey,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Schedule for distributing the credit to the customer. */
    @NoAutoDetect
    class AccessSchedule
    @JsonCreator
    private constructor(
        @JsonProperty("credit_type_id") private val creditTypeId: String?,
        @JsonProperty("schedule_items") private val scheduleItems: List<ScheduleItem>,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Defaults to USD (cents) if not passed */
        @JsonProperty("credit_type_id")
        fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

        @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem> = scheduleItems

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
                creditTypeId = accessSchedule.creditTypeId
                scheduleItems = accessSchedule.scheduleItems.toMutableList()
                additionalProperties = accessSchedule.additionalProperties.toMutableMap()
            }

            /** Defaults to USD (cents) if not passed */
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                this.scheduleItems = scheduleItems
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

            fun build(): AccessSchedule =
                AccessSchedule(
                    creditTypeId,
                    checkNotNull(scheduleItems) { "`scheduleItems` is required but was not set" }
                        .toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ScheduleItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: Double,
            @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
            @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("amount") fun amount(): Double = amount

            /** RFC 3339 timestamp (inclusive) */
            @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

            /** RFC 3339 timestamp (exclusive) */
            @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

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
                    amount = scheduleItem.amount
                    startingAt = scheduleItem.startingAt
                    endingBefore = scheduleItem.endingBefore
                    additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = apply { this.amount = amount }

                /** RFC 3339 timestamp (inclusive) */
                fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

                /** RFC 3339 timestamp (exclusive) */
                fun endingBefore(endingBefore: OffsetDateTime) = apply {
                    this.endingBefore = endingBefore
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

                return /* spotless:off */ other is ScheduleItem && amount == other.amount && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, startingAt, endingBefore, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduleItem{amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccessSchedule && creditTypeId == other.creditTypeId && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditTypeId, scheduleItems, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessSchedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

    class RateType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMMIT_RATE = of("COMMIT_RATE")

            @JvmField val COMMIT_RATE = of("commit_rate")

            @JvmField val LIST_RATE = of("LIST_RATE")

            @JvmField val LIST_RATE = of("list_rate")

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        enum class Known {
            COMMIT_RATE,
            COMMIT_RATE,
            LIST_RATE,
            LIST_RATE,
        }

        enum class Value {
            COMMIT_RATE,
            COMMIT_RATE,
            LIST_RATE,
            LIST_RATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMIT_RATE -> Value.COMMIT_RATE
                COMMIT_RATE -> Value.COMMIT_RATE
                LIST_RATE -> Value.LIST_RATE
                LIST_RATE -> Value.LIST_RATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMMIT_RATE -> Known.COMMIT_RATE
                COMMIT_RATE -> Known.COMMIT_RATE
                LIST_RATE -> Known.LIST_RATE
                LIST_RATE -> Known.LIST_RATE
                else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditCreateParams && accessSchedule == other.accessSchedule && customerId == other.customerId && priority == other.priority && productId == other.productId && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && rateType == other.rateType && salesforceOpportunityId == other.salesforceOpportunityId && uniquenessKey == other.uniquenessKey && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accessSchedule, customerId, priority, productId, applicableContractIds, applicableProductIds, applicableProductTags, customFields, description, name, netsuiteSalesOrderId, rateType, salesforceOpportunityId, uniquenessKey, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerCreditCreateParams{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rateType=$rateType, salesforceOpportunityId=$salesforceOpportunityId, uniquenessKey=$uniquenessKey, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
