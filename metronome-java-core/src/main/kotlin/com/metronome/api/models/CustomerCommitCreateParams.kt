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

/** Create a new commit at the customer level. */
class CustomerCommitCreateParams
private constructor(
    private val body: CustomerCommitCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
     * schedule item is allowed and amount must match invoice_schedule total.
     */
    fun accessSchedule(): AccessSchedule = body.accessSchedule()

    fun customerId(): String = body.customerId()

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    fun priority(): Double = body.priority()

    /**
     * ID of the fixed product associated with the commit. This is required because products are
     * used to invoice the commit amount.
     */
    fun productId(): String = body.productId()

    fun type(): Type = body.type()

    /**
     * Which contract the commit applies to. If not provided, the commit applies to all contracts.
     */
    fun applicableContractIds(): Optional<List<String>> = body.applicableContractIds()

    /**
     * Which products the commit applies to. If both applicable_product_ids and
     * applicable_product_tags are not provided, the commit applies to all products.
     */
    fun applicableProductIds(): Optional<List<String>> = body.applicableProductIds()

    /**
     * Which tags the commit applies to. If both applicable_product_ids and applicable_product_tags
     * are not provided, the commit applies to all products.
     */
    fun applicableProductTags(): Optional<List<String>> = body.applicableProductTags()

    fun customFields(): Optional<CustomFields> = body.customFields()

    /** Used only in UI/API. It is not exposed to end customers. */
    fun description(): Optional<String> = body.description()

    /**
     * The contract that this commit will be billed on. This is required for "POSTPAID" commits and
     * for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is 'free').
     */
    fun invoiceContractId(): Optional<String> = body.invoiceContractId()

    /**
     * Required for "POSTPAID" commits: the true up invoice will be generated at this time and only
     * one schedule item is allowed; the total must match accesss_schedule amount. Optional for
     * "PREPAID" commits: if not provided, this will be a "complimentary" commit with no invoice.
     */
    fun invoiceSchedule(): Optional<InvoiceSchedule> = body.invoiceSchedule()

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

    /**
     * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
     * schedule item is allowed and amount must match invoice_schedule total.
     */
    fun _accessSchedule(): JsonField<AccessSchedule> = body._accessSchedule()

    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    fun _priority(): JsonField<Double> = body._priority()

    /**
     * ID of the fixed product associated with the commit. This is required because products are
     * used to invoice the commit amount.
     */
    fun _productId(): JsonField<String> = body._productId()

    fun _type(): JsonField<Type> = body._type()

    /**
     * Which contract the commit applies to. If not provided, the commit applies to all contracts.
     */
    fun _applicableContractIds(): JsonField<List<String>> = body._applicableContractIds()

    /**
     * Which products the commit applies to. If both applicable_product_ids and
     * applicable_product_tags are not provided, the commit applies to all products.
     */
    fun _applicableProductIds(): JsonField<List<String>> = body._applicableProductIds()

    /**
     * Which tags the commit applies to. If both applicable_product_ids and applicable_product_tags
     * are not provided, the commit applies to all products.
     */
    fun _applicableProductTags(): JsonField<List<String>> = body._applicableProductTags()

    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /** Used only in UI/API. It is not exposed to end customers. */
    fun _description(): JsonField<String> = body._description()

    /**
     * The contract that this commit will be billed on. This is required for "POSTPAID" commits and
     * for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is 'free').
     */
    fun _invoiceContractId(): JsonField<String> = body._invoiceContractId()

    /**
     * Required for "POSTPAID" commits: the true up invoice will be generated at this time and only
     * one schedule item is allowed; the total must match accesss_schedule amount. Optional for
     * "PREPAID" commits: if not provided, this will be a "complimentary" commit with no invoice.
     */
    fun _invoiceSchedule(): JsonField<InvoiceSchedule> = body._invoiceSchedule()

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

    @JvmSynthetic internal fun getBody(): CustomerCommitCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CustomerCommitCreateBody
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
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
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
        @JsonProperty("invoice_contract_id")
        @ExcludeMissing
        private val invoiceContractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        private val invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
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

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         */
        fun accessSchedule(): AccessSchedule = accessSchedule.getRequired("access_schedule")

        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(): Double = priority.getRequired("priority")

        /**
         * ID of the fixed product associated with the commit. This is required because products are
         * used to invoice the commit amount.
         */
        fun productId(): String = productId.getRequired("product_id")

        fun type(): Type = type.getRequired("type")

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        fun applicableContractIds(): Optional<List<String>> =
            Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free').
         */
        fun invoiceContractId(): Optional<String> =
            Optional.ofNullable(invoiceContractId.getNullable("invoice_contract_id"))

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match accesss_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        fun invoiceSchedule(): Optional<InvoiceSchedule> =
            Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

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

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         */
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

        /**
         * ID of the fixed product associated with the commit. This is required because products are
         * used to invoice the commit amount.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
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

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free').
         */
        @JsonProperty("invoice_contract_id")
        @ExcludeMissing
        fun _invoiceContractId(): JsonField<String> = invoiceContractId

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match accesss_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

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

        fun validate(): CustomerCommitCreateBody = apply {
            if (validated) {
                return@apply
            }

            accessSchedule().validate()
            customerId()
            priority()
            productId()
            type()
            applicableContractIds()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            invoiceContractId()
            invoiceSchedule().ifPresent { it.validate() }
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

        /** A builder for [CustomerCommitCreateBody]. */
        class Builder internal constructor() {

            private var accessSchedule: JsonField<AccessSchedule>? = null
            private var customerId: JsonField<String>? = null
            private var priority: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var applicableContractIds: JsonField<MutableList<String>>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var invoiceContractId: JsonField<String> = JsonMissing.of()
            private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCommitCreateBody: CustomerCommitCreateBody) = apply {
                accessSchedule = customerCommitCreateBody.accessSchedule
                customerId = customerCommitCreateBody.customerId
                priority = customerCommitCreateBody.priority
                productId = customerCommitCreateBody.productId
                type = customerCommitCreateBody.type
                applicableContractIds =
                    customerCommitCreateBody.applicableContractIds.map { it.toMutableList() }
                applicableProductIds =
                    customerCommitCreateBody.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    customerCommitCreateBody.applicableProductTags.map { it.toMutableList() }
                customFields = customerCommitCreateBody.customFields
                description = customerCommitCreateBody.description
                invoiceContractId = customerCommitCreateBody.invoiceContractId
                invoiceSchedule = customerCommitCreateBody.invoiceSchedule
                name = customerCommitCreateBody.name
                netsuiteSalesOrderId = customerCommitCreateBody.netsuiteSalesOrderId
                rateType = customerCommitCreateBody.rateType
                salesforceOpportunityId = customerCommitCreateBody.salesforceOpportunityId
                uniquenessKey = customerCommitCreateBody.uniquenessKey
                additionalProperties = customerCommitCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
             * schedule item is allowed and amount must match invoice_schedule total.
             */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
             * schedule item is allowed and amount must match invoice_schedule total.
             */
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

            /**
             * ID of the fixed product associated with the commit. This is required because products
             * are used to invoice the commit amount.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * ID of the fixed product associated with the commit. This is required because products
             * are used to invoice the commit amount.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Which contract the commit applies to. If not provided, the commit applies to all
             * contracts.
             */
            fun applicableContractIds(applicableContractIds: List<String>) =
                applicableContractIds(JsonField.of(applicableContractIds))

            /**
             * Which contract the commit applies to. If not provided, the commit applies to all
             * contracts.
             */
            fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
                this.applicableContractIds = applicableContractIds.map { it.toMutableList() }
            }

            /**
             * Which contract the commit applies to. If not provided, the commit applies to all
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
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
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
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
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

            /**
             * The contract that this commit will be billed on. This is required for "POSTPAID"
             * commits and for "PREPAID" commits unless there is no invoice schedule above (i.e.,
             * the commit is 'free').
             */
            fun invoiceContractId(invoiceContractId: String) =
                invoiceContractId(JsonField.of(invoiceContractId))

            /**
             * The contract that this commit will be billed on. This is required for "POSTPAID"
             * commits and for "PREPAID" commits unless there is no invoice schedule above (i.e.,
             * the commit is 'free').
             */
            fun invoiceContractId(invoiceContractId: JsonField<String>) = apply {
                this.invoiceContractId = invoiceContractId
            }

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match accesss_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) =
                invoiceSchedule(JsonField.of(invoiceSchedule))

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match accesss_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                this.invoiceSchedule = invoiceSchedule
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

            fun build(): CustomerCommitCreateBody =
                CustomerCommitCreateBody(
                    checkRequired("accessSchedule", accessSchedule),
                    checkRequired("customerId", customerId),
                    checkRequired("priority", priority),
                    checkRequired("productId", productId),
                    checkRequired("type", type),
                    (applicableContractIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    invoiceContractId,
                    invoiceSchedule,
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

            return /* spotless:off */ other is CustomerCommitCreateBody && accessSchedule == other.accessSchedule && customerId == other.customerId && priority == other.priority && productId == other.productId && type == other.type && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && invoiceContractId == other.invoiceContractId && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && rateType == other.rateType && salesforceOpportunityId == other.salesforceOpportunityId && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessSchedule, customerId, priority, productId, type, applicableContractIds, applicableProductIds, applicableProductTags, customFields, description, invoiceContractId, invoiceSchedule, name, netsuiteSalesOrderId, rateType, salesforceOpportunityId, uniquenessKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCommitCreateBody{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, type=$type, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, invoiceContractId=$invoiceContractId, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rateType=$rateType, salesforceOpportunityId=$salesforceOpportunityId, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCommitCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: CustomerCommitCreateBody.Builder = CustomerCommitCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCommitCreateParams: CustomerCommitCreateParams) = apply {
            body = customerCommitCreateParams.body.toBuilder()
            additionalHeaders = customerCommitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCommitCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         */
        fun accessSchedule(accessSchedule: AccessSchedule) = apply {
            body.accessSchedule(accessSchedule)
        }

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         */
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

        /**
         * ID of the fixed product associated with the commit. This is required because products are
         * used to invoice the commit amount.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * ID of the fixed product associated with the commit. This is required because products are
         * used to invoice the commit amount.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        fun type(type: Type) = apply { body.type(type) }

        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        fun applicableContractIds(applicableContractIds: List<String>) = apply {
            body.applicableContractIds(applicableContractIds)
        }

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
            body.applicableContractIds(applicableContractIds)
        }

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        fun addApplicableContractId(applicableContractId: String) = apply {
            body.addApplicableContractId(applicableContractId)
        }

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: List<String>) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun addApplicableProductId(applicableProductId: String) = apply {
            body.addApplicableProductId(applicableProductId)
        }

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: List<String>) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
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

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free').
         */
        fun invoiceContractId(invoiceContractId: String) = apply {
            body.invoiceContractId(invoiceContractId)
        }

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free').
         */
        fun invoiceContractId(invoiceContractId: JsonField<String>) = apply {
            body.invoiceContractId(invoiceContractId)
        }

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match accesss_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) = apply {
            body.invoiceSchedule(invoiceSchedule)
        }

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match accesss_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
            body.invoiceSchedule(invoiceSchedule)
        }

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

        fun build(): CustomerCommitCreateParams =
            CustomerCommitCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        /** A builder for [AccessSchedule]. */
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

            /** A builder for [ScheduleItem]. */
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PREPAID = of("PREPAID")

            @JvmField val POSTPAID = of("POSTPAID")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PREPAID,
            POSTPAID,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREPAID,
            POSTPAID,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PREPAID -> Value.PREPAID
                POSTPAID -> Value.POSTPAID
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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

        /** A builder for [CustomFields]. */
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

    /**
     * Required for "POSTPAID" commits: the true up invoice will be generated at this time and only
     * one schedule item is allowed; the total must match accesss_schedule amount. Optional for
     * "PREPAID" commits: if not provided, this will be a "complimentary" commit with no invoice.
     */
    @NoAutoDetect
    class InvoiceSchedule
    @JsonCreator
    private constructor(
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recurring_schedule")
        @ExcludeMissing
        private val recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
        @JsonProperty("schedule_items")
        @ExcludeMissing
        private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Defaults to USD (cents) if not passed. */
        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

        /**
         * Enter the unit price and quantity for the charge or instead only send the amount. If
         * amount is sent, the unit price is assumed to be the amount and quantity is inferred to
         * be 1.
         */
        fun recurringSchedule(): Optional<RecurringSchedule> =
            Optional.ofNullable(recurringSchedule.getNullable("recurring_schedule"))

        /** Either provide amount or provide both unit_price and quantity. */
        fun scheduleItems(): Optional<List<ScheduleItem>> =
            Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

        /** Defaults to USD (cents) if not passed. */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Enter the unit price and quantity for the charge or instead only send the amount. If
         * amount is sent, the unit price is assumed to be the amount and quantity is inferred to
         * be 1.
         */
        @JsonProperty("recurring_schedule")
        @ExcludeMissing
        fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

        /** Either provide amount or provide both unit_price and quantity. */
        @JsonProperty("schedule_items")
        @ExcludeMissing
        fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceSchedule = apply {
            if (validated) {
                return@apply
            }

            creditTypeId()
            recurringSchedule().ifPresent { it.validate() }
            scheduleItems().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InvoiceSchedule]. */
        class Builder internal constructor() {

            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
            private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                creditTypeId = invoiceSchedule.creditTypeId
                recurringSchedule = invoiceSchedule.recurringSchedule
                scheduleItems = invoiceSchedule.scheduleItems.map { it.toMutableList() }
                additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
            }

            /** Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /** Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                recurringSchedule(JsonField.of(recurringSchedule))

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                this.recurringSchedule = recurringSchedule
            }

            /** Either provide amount or provide both unit_price and quantity. */
            fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                scheduleItems(JsonField.of(scheduleItems))

            /** Either provide amount or provide both unit_price and quantity. */
            fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                this.scheduleItems = scheduleItems.map { it.toMutableList() }
            }

            /** Either provide amount or provide both unit_price and quantity. */
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
                    recurringSchedule,
                    (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
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
            @JsonProperty("amount_distribution")
            @ExcludeMissing
            private val amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("frequency")
            @ExcludeMissing
            private val frequency: JsonField<Frequency> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            private val unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amountDistribution(): AmountDistribution =
                amountDistribution.getRequired("amount_distribution")

            /** RFC 3339 timestamp (exclusive). */
            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            fun frequency(): Frequency = frequency.getRequired("frequency")

            /** RFC 3339 timestamp (inclusive). */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             */
            fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             */
            fun unitPrice(): Optional<Double> =
                Optional.ofNullable(unitPrice.getNullable("unit_price"))

            @JsonProperty("amount_distribution")
            @ExcludeMissing
            fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

            /** RFC 3339 timestamp (exclusive). */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("frequency")
            @ExcludeMissing
            fun _frequency(): JsonField<Frequency> = frequency

            /** RFC 3339 timestamp (inclusive). */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RecurringSchedule = apply {
                if (validated) {
                    return@apply
                }

                amountDistribution()
                endingBefore()
                frequency()
                startingAt()
                amount()
                quantity()
                unitPrice()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RecurringSchedule]. */
            class Builder internal constructor() {

                private var amountDistribution: JsonField<AmountDistribution>? = null
                private var endingBefore: JsonField<OffsetDateTime>? = null
                private var frequency: JsonField<Frequency>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var amount: JsonField<Double> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var unitPrice: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recurringSchedule: RecurringSchedule) = apply {
                    amountDistribution = recurringSchedule.amountDistribution
                    endingBefore = recurringSchedule.endingBefore
                    frequency = recurringSchedule.frequency
                    startingAt = recurringSchedule.startingAt
                    amount = recurringSchedule.amount
                    quantity = recurringSchedule.quantity
                    unitPrice = recurringSchedule.unitPrice
                    additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                }

                fun amountDistribution(amountDistribution: AmountDistribution) =
                    amountDistribution(JsonField.of(amountDistribution))

                fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) = apply {
                    this.amountDistribution = amountDistribution
                }

                /** RFC 3339 timestamp (exclusive). */
                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /** RFC 3339 timestamp (exclusive). */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                fun frequency(frequency: JsonField<Frequency>) = apply {
                    this.frequency = frequency
                }

                /** RFC 3339 timestamp (inclusive). */
                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /** RFC 3339 timestamp (inclusive). */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

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
                        checkRequired("amountDistribution", amountDistribution),
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("frequency", frequency),
                        checkRequired("startingAt", startingAt),
                        amount,
                        quantity,
                        unitPrice,
                        additionalProperties.toImmutable(),
                    )
            }

            class AmountDistribution
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DIVIDED = of("DIVIDED")

                    @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                    @JvmField val EACH = of("EACH")

                    @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                }

                /** An enum containing [AmountDistribution]'s known values. */
                enum class Known {
                    DIVIDED,
                    DIVIDED_ROUNDED,
                    EACH,
                }

                /**
                 * An enum containing [AmountDistribution]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AmountDistribution] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DIVIDED,
                    DIVIDED_ROUNDED,
                    EACH,
                    /**
                     * An enum member indicating that [AmountDistribution] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DIVIDED -> Value.DIVIDED
                        DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                        EACH -> Value.EACH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
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

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val QUARTERLY = of("QUARTERLY")

                    @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                    @JvmField val ANNUAL = of("ANNUAL")

                    @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                }

                /** An enum containing [Frequency]'s known values. */
                enum class Known {
                    MONTHLY,
                    QUARTERLY,
                    SEMI_ANNUAL,
                    ANNUAL,
                }

                /**
                 * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Frequency] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTHLY,
                    QUARTERLY,
                    SEMI_ANNUAL,
                    ANNUAL,
                    /**
                     * An enum member indicating that [Frequency] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        ANNUAL -> Value.ANNUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
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

                return /* spotless:off */ other is RecurringSchedule && amountDistribution == other.amountDistribution && endingBefore == other.endingBefore && frequency == other.frequency && startingAt == other.startingAt && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountDistribution, endingBefore, frequency, startingAt, amount, quantity, unitPrice, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ScheduleItem
        @JsonCreator
        private constructor(
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            private val unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** timestamp of the scheduled event */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             */
            fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             */
            fun unitPrice(): Optional<Double> =
                Optional.ofNullable(unitPrice.getNullable("unit_price"))

            /** timestamp of the scheduled event */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ScheduleItem = apply {
                if (validated) {
                    return@apply
                }

                timestamp()
                amount()
                quantity()
                unitPrice()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ScheduleItem]. */
            class Builder internal constructor() {

                private var timestamp: JsonField<OffsetDateTime>? = null
                private var amount: JsonField<Double> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var unitPrice: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scheduleItem: ScheduleItem) = apply {
                    timestamp = scheduleItem.timestamp
                    amount = scheduleItem.amount
                    quantity = scheduleItem.quantity
                    unitPrice = scheduleItem.unitPrice
                    additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                }

                /** timestamp of the scheduled event */
                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /** timestamp of the scheduled event */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

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
                        checkRequired("timestamp", timestamp),
                        amount,
                        quantity,
                        unitPrice,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceSchedule && creditTypeId == other.creditTypeId && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditTypeId, recurringSchedule, scheduleItems, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceSchedule{creditTypeId=$creditTypeId, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
    }

    class RateType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMMIT_RATE = of("COMMIT_RATE")

            @JvmField val LIST_RATE = of("LIST_RATE")

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        /** An enum containing [RateType]'s known values. */
        enum class Known {
            COMMIT_RATE,
            LIST_RATE,
        }

        /**
         * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RateType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMIT_RATE,
            LIST_RATE,
            /** An enum member indicating that [RateType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COMMIT_RATE -> Value.COMMIT_RATE
                LIST_RATE -> Value.LIST_RATE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                COMMIT_RATE -> Known.COMMIT_RATE
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

        return /* spotless:off */ other is CustomerCommitCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCommitCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
