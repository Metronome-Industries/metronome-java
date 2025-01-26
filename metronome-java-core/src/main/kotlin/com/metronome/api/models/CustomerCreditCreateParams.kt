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

/** Create a new credit at the customer level. */
class CustomerCreditCreateParams
private constructor(
    private val body: CustomerCreditCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Schedule for distributing the credit to the customer. */
    fun accessSchedule(): AccessSchedule = body.accessSchedule()

    fun customerId(): String = body.customerId()

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    fun priority(): Double = body.priority()

    fun productId(): String = body.productId()

    /**
     * Which contract the credit applies to. If not provided, the credit applies to all contracts.
     */
    fun applicableContractIds(): Optional<List<String>> = body.applicableContractIds()

    /**
     * Which products the credit applies to. If both applicable_product_ids and
     * applicable_product_tags are not provided, the credit applies to all products.
     */
    fun applicableProductIds(): Optional<List<String>> = body.applicableProductIds()

    /**
     * Which tags the credit applies to. If both applicable_product_ids and applicable_product_tags
     * are not provided, the credit applies to all products.
     */
    fun applicableProductTags(): Optional<List<String>> = body.applicableProductTags()

    fun customFields(): Optional<CustomFields> = body.customFields()

    /** Used only in UI/API. It is not exposed to end customers. */
    fun description(): Optional<String> = body.description()

    /** displayed on invoices */
    fun name(): Optional<String> = body.name()

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> = body.netsuiteSalesOrderId()

    fun rateType(): Optional<RateType> = body.rateType()

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> = body.salesforceOpportunityId()

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    /** Schedule for distributing the credit to the customer. */
    fun _accessSchedule(): JsonField<AccessSchedule> = body._accessSchedule()

    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    fun _priority(): JsonField<Double> = body._priority()

    fun _productId(): JsonField<String> = body._productId()

    /**
     * Which contract the credit applies to. If not provided, the credit applies to all contracts.
     */
    fun _applicableContractIds(): JsonField<List<String>> = body._applicableContractIds()

    /**
     * Which products the credit applies to. If both applicable_product_ids and
     * applicable_product_tags are not provided, the credit applies to all products.
     */
    fun _applicableProductIds(): JsonField<List<String>> = body._applicableProductIds()

    /**
     * Which tags the credit applies to. If both applicable_product_ids and applicable_product_tags
     * are not provided, the credit applies to all products.
     */
    fun _applicableProductTags(): JsonField<List<String>> = body._applicableProductTags()

    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /** Used only in UI/API. It is not exposed to end customers. */
    fun _description(): JsonField<String> = body._description()

    /** displayed on invoices */
    fun _name(): JsonField<String> = body._name()

    /** This field's availability is dependent on your client's configuration. */
    fun _netsuiteSalesOrderId(): JsonField<String> = body._netsuiteSalesOrderId()

    fun _rateType(): JsonField<RateType> = body._rateType()

    /** This field's availability is dependent on your client's configuration. */
    fun _salesforceOpportunityId(): JsonField<String> = body._salesforceOpportunityId()

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CustomerCreditCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CustomerCreditCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("access_schedule")
        @ExcludeMissing
        private val accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        private val applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Schedule for distributing the credit to the customer. */
        fun accessSchedule(): AccessSchedule = accessSchedule.getRequired("access_schedule")

        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(): Double = priority.getRequired("priority")

        fun productId(): String = productId.getRequired("product_id")

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        fun applicableContractIds(): Optional<List<String>> =
            Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** displayed on invoices */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        /** Schedule for distributing the credit to the customer. */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** displayed on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerCreditCreateBody = apply {
            if (validated) {
                return@apply
            }

            accessSchedule().validate()
            customerId()
            priority()
            productId()
            applicableContractIds()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            name()
            netsuiteSalesOrderId()
            rateType()
            salesforceOpportunityId()
            uniquenessKey()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var accessSchedule: JsonField<AccessSchedule>? = null
            private var customerId: JsonField<String>? = null
            private var priority: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var applicableContractIds: JsonField<MutableList<String>>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCreditCreateBody: CustomerCreditCreateBody) = apply {
                accessSchedule = customerCreditCreateBody.accessSchedule
                customerId = customerCreditCreateBody.customerId
                priority = customerCreditCreateBody.priority
                productId = customerCreditCreateBody.productId
                applicableContractIds =
                    customerCreditCreateBody.applicableContractIds.map { it.toMutableList() }
                applicableProductIds =
                    customerCreditCreateBody.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    customerCreditCreateBody.applicableProductTags.map { it.toMutableList() }
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
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /** Schedule for distributing the credit to the customer. */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Which contract the credit applies to. If not provided, the credit applies to all
             * contracts.
             */
            fun applicableContractIds(applicableContractIds: List<String>) =
                applicableContractIds(JsonField.of(applicableContractIds))

            /**
             * Which contract the credit applies to. If not provided, the credit applies to all
             * contracts.
             */
            fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
                this.applicableContractIds = applicableContractIds.map { it.toMutableList() }
            }

            /**
             * Which contract the credit applies to. If not provided, the credit applies to all
             * contracts.
             */
            fun addApplicableContractId(applicableContractId: String) = apply {
                applicableContractIds =
                    (applicableContractIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableContractId)
                    }
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            /**
             * Prevents the creation of duplicates. If a request to create a commit or credit is
             * made with a uniqueness key that was previously used to create a commit or credit, a
             * new record will not be created and the request will fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

            /**
             * Prevents the creation of duplicates. If a request to create a commit or credit is
             * made with a uniqueness key that was previously used to create a commit or credit, a
             * new record will not be created and the request will fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                this.uniquenessKey = uniquenessKey
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

            fun build(): CustomerCreditCreateBody =
                CustomerCreditCreateBody(
                    checkRequired("accessSchedule", accessSchedule),
                    checkRequired("customerId", customerId),
                    checkRequired("priority", priority),
                    checkRequired("productId", productId),
                    (applicableContractIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
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
    class Builder internal constructor() {

        private var body: CustomerCreditCreateBody.Builder = CustomerCreditCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCreditCreateParams: CustomerCreditCreateParams) = apply {
            body = customerCreditCreateParams.body.toBuilder()
            additionalHeaders = customerCreditCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreditCreateParams.additionalQueryParams.toBuilder()
        }

        /** Schedule for distributing the credit to the customer. */
        fun accessSchedule(accessSchedule: AccessSchedule) = apply {
            body.accessSchedule(accessSchedule)
        }

        /** Schedule for distributing the credit to the customer. */
        fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
            body.accessSchedule(accessSchedule)
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(priority: Double) = apply { body.priority(priority) }

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(priority: JsonField<Double>) = apply { body.priority(priority) }

        fun productId(productId: String) = apply { body.productId(productId) }

        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        fun applicableContractIds(applicableContractIds: List<String>) = apply {
            body.applicableContractIds(applicableContractIds)
        }

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
            body.applicableContractIds(applicableContractIds)
        }

        /**
         * Which contract the credit applies to. If not provided, the credit applies to all
         * contracts.
         */
        fun addApplicableContractId(applicableContractId: String) = apply {
            body.addApplicableContractId(applicableContractId)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: List<String>) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun addApplicableProductId(applicableProductId: String) = apply {
            body.addApplicableProductId(applicableProductId)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: List<String>) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun addApplicableProductTag(applicableProductTag: String) = apply {
            body.addApplicableProductTag(applicableProductTag)
        }

        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(description: String) = apply { body.description(description) }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** displayed on invoices */
        fun name(name: String) = apply { body.name(name) }

        /** displayed on invoices */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        fun rateType(rateType: RateType) = apply { body.rateType(rateType) }

        fun rateType(rateType: JsonField<RateType>) = apply { body.rateType(rateType) }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
            body.uniquenessKey(uniquenessKey)
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

        fun build(): CustomerCreditCreateParams =
            CustomerCreditCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Schedule for distributing the credit to the customer. */
    @NoAutoDetect
    class AccessSchedule
    @JsonCreator
    private constructor(
        @JsonProperty("schedule_items")
        @ExcludeMissing
        private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

        /** Defaults to USD (cents) if not passed */
        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

        @JsonProperty("schedule_items")
        @ExcludeMissing
        fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

        /** Defaults to USD (cents) if not passed */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccessSchedule = apply {
            if (validated) {
                return@apply
            }

            scheduleItems().forEach { it.validate() }
            creditTypeId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessSchedule: AccessSchedule) = apply {
                scheduleItems = accessSchedule.scheduleItems.map { it.toMutableList() }
                creditTypeId = accessSchedule.creditTypeId
                additionalProperties = accessSchedule.additionalProperties.toMutableMap()
            }

            fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                scheduleItems(JsonField.of(scheduleItems))

            fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                this.scheduleItems = scheduleItems.map { it.toMutableList() }
            }

            fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                scheduleItems =
                    (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(scheduleItem)
                    }
            }

            /** Defaults to USD (cents) if not passed */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /** Defaults to USD (cents) if not passed */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
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
                    checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                    creditTypeId,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ScheduleItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            /** RFC 3339 timestamp (exclusive) */
            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            /** RFC 3339 timestamp (inclusive) */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /** RFC 3339 timestamp (exclusive) */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /** RFC 3339 timestamp (inclusive) */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ScheduleItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                endingBefore()
                startingAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var endingBefore: JsonField<OffsetDateTime>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scheduleItem: ScheduleItem) = apply {
                    amount = scheduleItem.amount
                    endingBefore = scheduleItem.endingBefore
                    startingAt = scheduleItem.startingAt
                    additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** RFC 3339 timestamp (exclusive) */
                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /** RFC 3339 timestamp (exclusive) */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                /** RFC 3339 timestamp (inclusive) */
                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /** RFC 3339 timestamp (inclusive) */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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
                        checkRequired("amount", amount),
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccessSchedule && scheduleItems == other.scheduleItems && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(scheduleItems, creditTypeId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is CustomerCreditCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
