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

class CustomerCommitCreateParams
constructor(
    private val accessSchedule: AccessSchedule,
    private val customerId: String,
    private val priority: Double,
    private val productId: String,
    private val type: Type,
    private val applicableContractIds: List<String>?,
    private val applicableProductIds: List<String>?,
    private val applicableProductTags: List<String>?,
    private val customFields: CustomFields?,
    private val description: String?,
    private val invoiceContractId: String?,
    private val invoiceSchedule: InvoiceSchedule?,
    private val name: String?,
    private val netsuiteSalesOrderId: String?,
    private val rateType: RateType?,
    private val salesforceOpportunityId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accessSchedule(): AccessSchedule = accessSchedule

    fun customerId(): String = customerId

    fun priority(): Double = priority

    fun productId(): String = productId

    fun type(): Type = type

    fun applicableContractIds(): Optional<List<String>> = Optional.ofNullable(applicableContractIds)

    fun applicableProductIds(): Optional<List<String>> = Optional.ofNullable(applicableProductIds)

    fun applicableProductTags(): Optional<List<String>> = Optional.ofNullable(applicableProductTags)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun invoiceContractId(): Optional<String> = Optional.ofNullable(invoiceContractId)

    fun invoiceSchedule(): Optional<InvoiceSchedule> = Optional.ofNullable(invoiceSchedule)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

    fun rateType(): Optional<RateType> = Optional.ofNullable(rateType)

    fun salesforceOpportunityId(): Optional<String> = Optional.ofNullable(salesforceOpportunityId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): CustomerCommitCreateBody {
        return CustomerCommitCreateBody(
            accessSchedule,
            customerId,
            priority,
            productId,
            type,
            applicableContractIds,
            applicableProductIds,
            applicableProductTags,
            customFields,
            description,
            invoiceContractId,
            invoiceSchedule,
            name,
            netsuiteSalesOrderId,
            rateType,
            salesforceOpportunityId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CustomerCommitCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("access_schedule") private val accessSchedule: AccessSchedule,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("priority") private val priority: Double,
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("type") private val type: Type,
        @JsonProperty("applicable_contract_ids") private val applicableContractIds: List<String>?,
        @JsonProperty("applicable_product_ids") private val applicableProductIds: List<String>?,
        @JsonProperty("applicable_product_tags") private val applicableProductTags: List<String>?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("invoice_contract_id") private val invoiceContractId: String?,
        @JsonProperty("invoice_schedule") private val invoiceSchedule: InvoiceSchedule?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonProperty("rate_type") private val rateType: RateType?,
        @JsonProperty("salesforce_opportunity_id") private val salesforceOpportunityId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         */
        @JsonProperty("access_schedule") fun accessSchedule(): AccessSchedule = accessSchedule

        @JsonProperty("customer_id") fun customerId(): String = customerId

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        @JsonProperty("priority") fun priority(): Double = priority

        @JsonProperty("product_id") fun productId(): String = productId

        @JsonProperty("type") fun type(): Type = type

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        @JsonProperty("applicable_contract_ids")
        fun applicableContractIds(): Optional<List<String>> =
            Optional.ofNullable(applicableContractIds)

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds)

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags)

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free').
         */
        @JsonProperty("invoice_contract_id")
        fun invoiceContractId(): Optional<String> = Optional.ofNullable(invoiceContractId)

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match accesss_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        @JsonProperty("invoice_schedule")
        fun invoiceSchedule(): Optional<InvoiceSchedule> = Optional.ofNullable(invoiceSchedule)

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
            private var type: Type? = null
            private var applicableContractIds: List<String>? = null
            private var applicableProductIds: List<String>? = null
            private var applicableProductTags: List<String>? = null
            private var customFields: CustomFields? = null
            private var description: String? = null
            private var invoiceContractId: String? = null
            private var invoiceSchedule: InvoiceSchedule? = null
            private var name: String? = null
            private var netsuiteSalesOrderId: String? = null
            private var rateType: RateType? = null
            private var salesforceOpportunityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCommitCreateBody: CustomerCommitCreateBody) = apply {
                accessSchedule = customerCommitCreateBody.accessSchedule
                customerId = customerCommitCreateBody.customerId
                priority = customerCommitCreateBody.priority
                productId = customerCommitCreateBody.productId
                type = customerCommitCreateBody.type
                applicableContractIds =
                    customerCommitCreateBody.applicableContractIds?.toMutableList()
                applicableProductIds =
                    customerCommitCreateBody.applicableProductIds?.toMutableList()
                applicableProductTags =
                    customerCommitCreateBody.applicableProductTags?.toMutableList()
                customFields = customerCommitCreateBody.customFields
                description = customerCommitCreateBody.description
                invoiceContractId = customerCommitCreateBody.invoiceContractId
                invoiceSchedule = customerCommitCreateBody.invoiceSchedule
                name = customerCommitCreateBody.name
                netsuiteSalesOrderId = customerCommitCreateBody.netsuiteSalesOrderId
                rateType = customerCommitCreateBody.rateType
                salesforceOpportunityId = customerCommitCreateBody.salesforceOpportunityId
                additionalProperties = customerCommitCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
             * schedule item is allowed and amount must match invoice_schedule total.
             */
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

            fun type(type: Type) = apply { this.type = type }

            /**
             * Which contract the commit applies to. If not provided, the commit applies to all
             * contracts.
             */
            fun applicableContractIds(applicableContractIds: List<String>) = apply {
                this.applicableContractIds = applicableContractIds
            }

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = apply { this.description = description }

            /**
             * The contract that this commit will be billed on. This is required for "POSTPAID"
             * commits and for "PREPAID" commits unless there is no invoice schedule above (i.e.,
             * the commit is 'free').
             */
            fun invoiceContractId(invoiceContractId: String) = apply {
                this.invoiceContractId = invoiceContractId
            }

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match accesss_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

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

            fun build(): CustomerCommitCreateBody =
                CustomerCommitCreateBody(
                    checkNotNull(accessSchedule) { "`accessSchedule` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(priority) { "`priority` is required but was not set" },
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    applicableContractIds?.toImmutable(),
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    customFields,
                    description,
                    invoiceContractId,
                    invoiceSchedule,
                    name,
                    netsuiteSalesOrderId,
                    rateType,
                    salesforceOpportunityId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCommitCreateBody && accessSchedule == other.accessSchedule && customerId == other.customerId && priority == other.priority && productId == other.productId && type == other.type && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && invoiceContractId == other.invoiceContractId && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && rateType == other.rateType && salesforceOpportunityId == other.salesforceOpportunityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessSchedule, customerId, priority, productId, type, applicableContractIds, applicableProductIds, applicableProductTags, customFields, description, invoiceContractId, invoiceSchedule, name, netsuiteSalesOrderId, rateType, salesforceOpportunityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCommitCreateBody{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, type=$type, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, invoiceContractId=$invoiceContractId, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rateType=$rateType, salesforceOpportunityId=$salesforceOpportunityId, additionalProperties=$additionalProperties}"
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
        private var type: Type? = null
        private var applicableContractIds: MutableList<String> = mutableListOf()
        private var applicableProductIds: MutableList<String> = mutableListOf()
        private var applicableProductTags: MutableList<String> = mutableListOf()
        private var customFields: CustomFields? = null
        private var description: String? = null
        private var invoiceContractId: String? = null
        private var invoiceSchedule: InvoiceSchedule? = null
        private var name: String? = null
        private var netsuiteSalesOrderId: String? = null
        private var rateType: RateType? = null
        private var salesforceOpportunityId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCommitCreateParams: CustomerCommitCreateParams) = apply {
            accessSchedule = customerCommitCreateParams.accessSchedule
            customerId = customerCommitCreateParams.customerId
            priority = customerCommitCreateParams.priority
            productId = customerCommitCreateParams.productId
            type = customerCommitCreateParams.type
            applicableContractIds =
                customerCommitCreateParams.applicableContractIds?.toMutableList() ?: mutableListOf()
            applicableProductIds =
                customerCommitCreateParams.applicableProductIds?.toMutableList() ?: mutableListOf()
            applicableProductTags =
                customerCommitCreateParams.applicableProductTags?.toMutableList() ?: mutableListOf()
            customFields = customerCommitCreateParams.customFields
            description = customerCommitCreateParams.description
            invoiceContractId = customerCommitCreateParams.invoiceContractId
            invoiceSchedule = customerCommitCreateParams.invoiceSchedule
            name = customerCommitCreateParams.name
            netsuiteSalesOrderId = customerCommitCreateParams.netsuiteSalesOrderId
            rateType = customerCommitCreateParams.rateType
            salesforceOpportunityId = customerCommitCreateParams.salesforceOpportunityId
            additionalHeaders = customerCommitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCommitCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                customerCommitCreateParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         */
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

        fun type(type: Type) = apply { this.type = type }

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        fun applicableContractIds(applicableContractIds: List<String>) = apply {
            this.applicableContractIds.clear()
            this.applicableContractIds.addAll(applicableContractIds)
        }

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        fun addApplicableContractId(applicableContractId: String) = apply {
            this.applicableContractIds.add(applicableContractId)
        }

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: List<String>) = apply {
            this.applicableProductIds.clear()
            this.applicableProductIds.addAll(applicableProductIds)
        }

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun addApplicableProductId(applicableProductId: String) = apply {
            this.applicableProductIds.add(applicableProductId)
        }

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: List<String>) = apply {
            this.applicableProductTags.clear()
            this.applicableProductTags.addAll(applicableProductTags)
        }

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun addApplicableProductTag(applicableProductTag: String) = apply {
            this.applicableProductTags.add(applicableProductTag)
        }

        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free').
         */
        fun invoiceContractId(invoiceContractId: String) = apply {
            this.invoiceContractId = invoiceContractId
        }

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match accesss_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) = apply {
            this.invoiceSchedule = invoiceSchedule
        }

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

        fun build(): CustomerCommitCreateParams =
            CustomerCommitCreateParams(
                checkNotNull(accessSchedule) { "`accessSchedule` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(priority) { "`priority` is required but was not set" },
                checkNotNull(productId) { "`productId` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                applicableContractIds.toImmutable().ifEmpty { null },
                applicableProductIds.toImmutable().ifEmpty { null },
                applicableProductTags.toImmutable().ifEmpty { null },
                customFields,
                description,
                invoiceContractId,
                invoiceSchedule,
                name,
                netsuiteSalesOrderId,
                rateType,
                salesforceOpportunityId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
     * schedule item is allowed and amount must match invoice_schedule total.
     */
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PREPAID = of("PREPAID")

            @JvmField val POSTPAID = of("POSTPAID")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PREPAID,
            POSTPAID,
        }

        enum class Value {
            PREPAID,
            POSTPAID,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PREPAID -> Value.PREPAID
                POSTPAID -> Value.POSTPAID
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PREPAID -> Known.PREPAID
                POSTPAID -> Known.POSTPAID
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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

    /**
     * Required for "POSTPAID" commits: the true up invoice will be generated at this time and only
     * one schedule item is allowed; the total must match accesss_schedule amount. Optional for
     * "PREPAID" commits: if not provided, this will be a "complimentary" commit with no invoice.
     */
    @NoAutoDetect
    class InvoiceSchedule
    @JsonCreator
    private constructor(
        @JsonProperty("credit_type_id") private val creditTypeId: String?,
        @JsonProperty("schedule_items") private val scheduleItems: List<ScheduleItem>?,
        @JsonProperty("recurring_schedule") private val recurringSchedule: RecurringSchedule?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Defaults to USD (cents) if not passed. */
        @JsonProperty("credit_type_id")
        fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

        /** Either provide amount or provide both unit_price and quantity. */
        @JsonProperty("schedule_items")
        fun scheduleItems(): Optional<List<ScheduleItem>> = Optional.ofNullable(scheduleItems)

        /**
         * Enter the unit price and quantity for the charge or instead only send the amount. If
         * amount is sent, the unit price is assumed to be the amount and quantity is inferred to
         * be 1.
         */
        @JsonProperty("recurring_schedule")
        fun recurringSchedule(): Optional<RecurringSchedule> =
            Optional.ofNullable(recurringSchedule)

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
            private var recurringSchedule: RecurringSchedule? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                creditTypeId = invoiceSchedule.creditTypeId
                scheduleItems = invoiceSchedule.scheduleItems?.toMutableList()
                recurringSchedule = invoiceSchedule.recurringSchedule
                additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
            }

            /** Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            /** Either provide amount or provide both unit_price and quantity. */
            fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                this.scheduleItems = scheduleItems
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            fun recurringSchedule(recurringSchedule: RecurringSchedule) = apply {
                this.recurringSchedule = recurringSchedule
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

            fun build(): InvoiceSchedule =
                InvoiceSchedule(
                    creditTypeId,
                    scheduleItems?.toImmutable(),
                    recurringSchedule,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Enter the unit price and quantity for the charge or instead only send the amount. If
         * amount is sent, the unit price is assumed to be the amount and quantity is inferred to
         * be 1.
         */
        @NoAutoDetect
        class RecurringSchedule
        @JsonCreator
        private constructor(
            @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
            @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
            @JsonProperty("frequency") private val frequency: Frequency,
            @JsonProperty("unit_price") private val unitPrice: Double?,
            @JsonProperty("quantity") private val quantity: Double?,
            @JsonProperty("amount") private val amount: Double?,
            @JsonProperty("amount_distribution") private val amountDistribution: AmountDistribution,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** RFC 3339 timestamp (inclusive). */
            @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

            /** RFC 3339 timestamp (exclusive). */
            @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

            @JsonProperty("frequency") fun frequency(): Frequency = frequency

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             */
            @JsonProperty("unit_price")
            fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             */
            @JsonProperty("quantity")
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             */
            @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

            @JsonProperty("amount_distribution")
            fun amountDistribution(): AmountDistribution = amountDistribution

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var startingAt: OffsetDateTime? = null
                private var endingBefore: OffsetDateTime? = null
                private var frequency: Frequency? = null
                private var unitPrice: Double? = null
                private var quantity: Double? = null
                private var amount: Double? = null
                private var amountDistribution: AmountDistribution? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recurringSchedule: RecurringSchedule) = apply {
                    startingAt = recurringSchedule.startingAt
                    endingBefore = recurringSchedule.endingBefore
                    frequency = recurringSchedule.frequency
                    unitPrice = recurringSchedule.unitPrice
                    quantity = recurringSchedule.quantity
                    amount = recurringSchedule.amount
                    amountDistribution = recurringSchedule.amountDistribution
                    additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                }

                /** RFC 3339 timestamp (inclusive). */
                fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

                /** RFC 3339 timestamp (exclusive). */
                fun endingBefore(endingBefore: OffsetDateTime) = apply {
                    this.endingBefore = endingBefore
                }

                fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: Double) = apply { this.quantity = quantity }

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(amount: Double) = apply { this.amount = amount }

                fun amountDistribution(amountDistribution: AmountDistribution) = apply {
                    this.amountDistribution = amountDistribution
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

                fun build(): RecurringSchedule =
                    RecurringSchedule(
                        checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                        checkNotNull(endingBefore) { "`endingBefore` is required but was not set" },
                        checkNotNull(frequency) { "`frequency` is required but was not set" },
                        unitPrice,
                        quantity,
                        amount,
                        checkNotNull(amountDistribution) {
                            "`amountDistribution` is required but was not set"
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            class AmountDistribution
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DIVIDED = of("DIVIDED")

                    @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                    @JvmField val EACH = of("EACH")

                    @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                }

                enum class Known {
                    DIVIDED,
                    DIVIDED_ROUNDED,
                    EACH,
                }

                enum class Value {
                    DIVIDED,
                    DIVIDED_ROUNDED,
                    EACH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DIVIDED -> Value.DIVIDED
                        DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                        EACH -> Value.EACH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DIVIDED -> Known.DIVIDED
                        DIVIDED_ROUNDED -> Known.DIVIDED_ROUNDED
                        EACH -> Known.EACH
                        else ->
                            throw MetronomeInvalidDataException(
                                "Unknown AmountDistribution: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Frequency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val QUARTERLY = of("QUARTERLY")

                    @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                    @JvmField val ANNUAL = of("ANNUAL")

                    @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                }

                enum class Known {
                    MONTHLY,
                    QUARTERLY,
                    SEMI_ANNUAL,
                    ANNUAL,
                }

                enum class Value {
                    MONTHLY,
                    QUARTERLY,
                    SEMI_ANNUAL,
                    ANNUAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        ANNUAL -> Value.ANNUAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        ANNUAL -> Known.ANNUAL
                        else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RecurringSchedule && startingAt == other.startingAt && endingBefore == other.endingBefore && frequency == other.frequency && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && amountDistribution == other.amountDistribution && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(startingAt, endingBefore, frequency, unitPrice, quantity, amount, amountDistribution, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RecurringSchedule{startingAt=$startingAt, endingBefore=$endingBefore, frequency=$frequency, unitPrice=$unitPrice, quantity=$quantity, amount=$amount, amountDistribution=$amountDistribution, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ScheduleItem
        @JsonCreator
        private constructor(
            @JsonProperty("unit_price") private val unitPrice: Double?,
            @JsonProperty("quantity") private val quantity: Double?,
            @JsonProperty("amount") private val amount: Double?,
            @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             */
            @JsonProperty("unit_price")
            fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             */
            @JsonProperty("quantity")
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             */
            @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

            /** timestamp of the scheduled event */
            @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var unitPrice: Double? = null
                private var quantity: Double? = null
                private var amount: Double? = null
                private var timestamp: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scheduleItem: ScheduleItem) = apply {
                    unitPrice = scheduleItem.unitPrice
                    quantity = scheduleItem.quantity
                    amount = scheduleItem.amount
                    timestamp = scheduleItem.timestamp
                    additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                }

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: Double) = apply { this.quantity = quantity }

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(amount: Double) = apply { this.amount = amount }

                /** timestamp of the scheduled event */
                fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

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
                        unitPrice,
                        quantity,
                        amount,
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ScheduleItem && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(unitPrice, quantity, amount, timestamp, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduleItem{unitPrice=$unitPrice, quantity=$quantity, amount=$amount, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceSchedule && creditTypeId == other.creditTypeId && scheduleItems == other.scheduleItems && recurringSchedule == other.recurringSchedule && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditTypeId, scheduleItems, recurringSchedule, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceSchedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, recurringSchedule=$recurringSchedule, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is CustomerCommitCreateParams && accessSchedule == other.accessSchedule && customerId == other.customerId && priority == other.priority && productId == other.productId && type == other.type && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && invoiceContractId == other.invoiceContractId && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && rateType == other.rateType && salesforceOpportunityId == other.salesforceOpportunityId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accessSchedule, customerId, priority, productId, type, applicableContractIds, applicableProductIds, applicableProductTags, customFields, description, invoiceContractId, invoiceSchedule, name, netsuiteSalesOrderId, rateType, salesforceOpportunityId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerCommitCreateParams{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, type=$type, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, invoiceContractId=$invoiceContractId, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rateType=$rateType, salesforceOpportunityId=$salesforceOpportunityId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
