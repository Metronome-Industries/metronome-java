// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.BaseDeserializer
import com.metronome.api.core.BaseSerializer
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Commit
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product")
    @ExcludeMissing
    private val product: JsonField<Product> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("access_schedule")
    @ExcludeMissing
    private val accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("applicable_contract_ids")
    @ExcludeMissing
    private val applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applicable_product_ids")
    @ExcludeMissing
    private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("contract")
    @ExcludeMissing
    private val contract: JsonField<Contract> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_contract")
    @ExcludeMissing
    private val invoiceContract: JsonField<InvoiceContract> = JsonMissing.of(),
    @JsonProperty("invoice_schedule")
    @ExcludeMissing
    private val invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of(),
    @JsonProperty("ledger")
    @ExcludeMissing
    private val ledger: JsonField<List<Ledger>> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("rate_type")
    @ExcludeMissing
    private val rateType: JsonField<RateType> = JsonMissing.of(),
    @JsonProperty("rolled_over_from")
    @ExcludeMissing
    private val rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of(),
    @JsonProperty("rollover_fraction")
    @ExcludeMissing
    private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    private val uniquenessKey: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun product(): Product = product.getRequired("product")

    fun type(): Type = type.getRequired("type")

    /** The schedule that the customer will gain access to the credits purposed with this commit. */
    fun accessSchedule(): Optional<ScheduleDuration> =
        Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

    /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
    fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

    fun applicableContractIds(): Optional<List<String>> =
        Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

    fun applicableProductIds(): Optional<List<String>> =
        Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

    fun applicableProductTags(): Optional<List<String>> =
        Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

    fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The contract that this commit will be billed on. */
    fun invoiceContract(): Optional<InvoiceContract> =
        Optional.ofNullable(invoiceContract.getNullable("invoice_contract"))

    /** The schedule that the customer will be invoiced for this commit. */
    fun invoiceSchedule(): Optional<SchedulePointInTime> =
        Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

    /**
     * A list of ordered events that impact the balance of a commit. For example, an invoice
     * deduction or a rollover.
     */
    fun ledger(): Optional<List<Ledger>> = Optional.ofNullable(ledger.getNullable("ledger"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

    fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

    fun rolledOverFrom(): Optional<RolledOverFrom> =
        Optional.ofNullable(rolledOverFrom.getNullable("rolled_over_from"))

    fun rolloverFraction(): Optional<Double> =
        Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     */
    fun uniquenessKey(): Optional<String> =
        Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The schedule that the customer will gain access to the credits purposed with this commit. */
    @JsonProperty("access_schedule")
    @ExcludeMissing
    fun _accessSchedule(): JsonField<ScheduleDuration> = accessSchedule

    /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    @JsonProperty("applicable_contract_ids")
    @ExcludeMissing
    fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

    @JsonProperty("applicable_product_ids")
    @ExcludeMissing
    fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

    @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The contract that this commit will be billed on. */
    @JsonProperty("invoice_contract")
    @ExcludeMissing
    fun _invoiceContract(): JsonField<InvoiceContract> = invoiceContract

    /** The schedule that the customer will be invoiced for this commit. */
    @JsonProperty("invoice_schedule")
    @ExcludeMissing
    fun _invoiceSchedule(): JsonField<SchedulePointInTime> = invoiceSchedule

    /**
     * A list of ordered events that impact the balance of a commit. For example, an invoice
     * deduction or a rollover.
     */
    @JsonProperty("ledger") @ExcludeMissing fun _ledger(): JsonField<List<Ledger>> = ledger

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

    @JsonProperty("rolled_over_from")
    @ExcludeMissing
    fun _rolledOverFrom(): JsonField<RolledOverFrom> = rolledOverFrom

    @JsonProperty("rollover_fraction")
    @ExcludeMissing
    fun _rolloverFraction(): JsonField<Double> = rolloverFraction

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     */
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    fun _uniquenessKey(): JsonField<String> = uniquenessKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Commit = apply {
        if (!validated) {
            id()
            product().validate()
            type()
            accessSchedule().map { it.validate() }
            amount()
            applicableContractIds()
            applicableProductIds()
            applicableProductTags()
            contract().map { it.validate() }
            customFields().map { it.validate() }
            description()
            invoiceContract().map { it.validate() }
            invoiceSchedule().map { it.validate() }
            ledger()
            name()
            netsuiteSalesOrderId()
            priority()
            rateType()
            rolledOverFrom().map { it.validate() }
            rolloverFraction()
            salesforceOpportunityId()
            uniquenessKey()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var product: JsonField<Product>? = null
        private var type: JsonField<Type>? = null
        private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
        private var amount: JsonField<Double> = JsonMissing.of()
        private var applicableContractIds: JsonField<MutableList<String>>? = null
        private var applicableProductIds: JsonField<MutableList<String>>? = null
        private var applicableProductTags: JsonField<MutableList<String>>? = null
        private var contract: JsonField<Contract> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var invoiceContract: JsonField<InvoiceContract> = JsonMissing.of()
        private var invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of()
        private var ledger: JsonField<MutableList<Ledger>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of()
        private var rolloverFraction: JsonField<Double> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commit: Commit) = apply {
            id = commit.id
            product = commit.product
            type = commit.type
            accessSchedule = commit.accessSchedule
            amount = commit.amount
            applicableContractIds = commit.applicableContractIds.map { it.toMutableList() }
            applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
            applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
            contract = commit.contract
            customFields = commit.customFields
            description = commit.description
            invoiceContract = commit.invoiceContract
            invoiceSchedule = commit.invoiceSchedule
            ledger = commit.ledger.map { it.toMutableList() }
            name = commit.name
            netsuiteSalesOrderId = commit.netsuiteSalesOrderId
            priority = commit.priority
            rateType = commit.rateType
            rolledOverFrom = commit.rolledOverFrom
            rolloverFraction = commit.rolloverFraction
            salesforceOpportunityId = commit.salesforceOpportunityId
            uniquenessKey = commit.uniquenessKey
            additionalProperties = commit.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The schedule that the customer will gain access to the credits purposed with this commit.
         */
        fun accessSchedule(accessSchedule: ScheduleDuration) =
            accessSchedule(JsonField.of(accessSchedule))

        /**
         * The schedule that the customer will gain access to the credits purposed with this commit.
         */
        fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
            this.accessSchedule = accessSchedule
        }

        /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun applicableContractIds(applicableContractIds: List<String>) =
            applicableContractIds(JsonField.of(applicableContractIds))

        fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
            this.applicableContractIds = applicableContractIds.map { it.toMutableList() }
        }

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

        fun applicableProductIds(applicableProductIds: List<String>) =
            applicableProductIds(JsonField.of(applicableProductIds))

        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
        }

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

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
        }

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

        fun contract(contract: Contract) = contract(JsonField.of(contract))

        fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The contract that this commit will be billed on. */
        fun invoiceContract(invoiceContract: InvoiceContract) =
            invoiceContract(JsonField.of(invoiceContract))

        /** The contract that this commit will be billed on. */
        fun invoiceContract(invoiceContract: JsonField<InvoiceContract>) = apply {
            this.invoiceContract = invoiceContract
        }

        /** The schedule that the customer will be invoiced for this commit. */
        fun invoiceSchedule(invoiceSchedule: SchedulePointInTime) =
            invoiceSchedule(JsonField.of(invoiceSchedule))

        /** The schedule that the customer will be invoiced for this commit. */
        fun invoiceSchedule(invoiceSchedule: JsonField<SchedulePointInTime>) = apply {
            this.invoiceSchedule = invoiceSchedule
        }

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun ledger(ledger: List<Ledger>) = ledger(JsonField.of(ledger))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun ledger(ledger: JsonField<List<Ledger>>) = apply {
            this.ledger = ledger.map { it.toMutableList() }
        }

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(ledger: Ledger) = apply {
            this.ledger =
                (this.ledger ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(ledger)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(priority: Double) = priority(JsonField.of(priority))

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        fun rolledOverFrom(rolledOverFrom: RolledOverFrom) =
            rolledOverFrom(JsonField.of(rolledOverFrom))

        fun rolledOverFrom(rolledOverFrom: JsonField<RolledOverFrom>) = apply {
            this.rolledOverFrom = rolledOverFrom
        }

        fun rolloverFraction(rolloverFraction: Double) =
            rolloverFraction(JsonField.of(rolloverFraction))

        fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
            this.rolloverFraction = rolloverFraction
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
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

        fun build(): Commit =
            Commit(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(product) { "`product` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                accessSchedule,
                amount,
                (applicableContractIds ?: JsonMissing.of()).map { it.toImmutable() },
                (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                contract,
                customFields,
                description,
                invoiceContract,
                invoiceSchedule,
                (ledger ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                netsuiteSalesOrderId,
                priority,
                rateType,
                rolledOverFrom,
                rolloverFraction,
                salesforceOpportunityId,
                uniquenessKey,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Product
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (!validated) {
                id()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                id = product.id
                name = product.name
                additionalProperties = product.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Product =
                Product(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
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
    class Contract
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Contract = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contract: Contract) = apply {
                id = contract.id
                additionalProperties = contract.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): Contract =
                Contract(
                    checkNotNull(id) { "`id` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Contract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"
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
            if (!validated) {
                validated = true
            }
        }

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

    /** The contract that this commit will be billed on. */
    @NoAutoDetect
    class InvoiceContract
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceContract = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceContract: InvoiceContract) = apply {
                id = invoiceContract.id
                additionalProperties = invoiceContract.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): InvoiceContract =
                InvoiceContract(
                    checkNotNull(id) { "`id` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceContract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceContract{id=$id, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Ledger.Deserializer::class)
    @JsonSerialize(using = Ledger.Serializer::class)
    class Ledger
    private constructor(
        private val prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry? =
            null,
        private val prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
            PrepaidCommitAutomatedInvoiceDeductionLedgerEntry? =
            null,
        private val prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry? = null,
        private val prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry? = null,
        private val prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry? = null,
        private val prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry? = null,
        private val postpaidCommitInitialBalanceLedgerEntry:
            PostpaidCommitInitialBalanceLedgerEntry? =
            null,
        private val postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
            PostpaidCommitAutomatedInvoiceDeductionLedgerEntry? =
            null,
        private val postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry? = null,
        private val postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry? = null,
        private val prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry? = null,
        private val postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry? = null,
        private val postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry? =
            null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun prepaidCommitSegmentStartLedgerEntry(): Optional<PrepaidCommitSegmentStartLedgerEntry> =
            Optional.ofNullable(prepaidCommitSegmentStartLedgerEntry)

        fun prepaidCommitAutomatedInvoiceDeductionLedgerEntry():
            Optional<PrepaidCommitAutomatedInvoiceDeductionLedgerEntry> =
            Optional.ofNullable(prepaidCommitAutomatedInvoiceDeductionLedgerEntry)

        fun prepaidCommitRolloverLedgerEntry(): Optional<PrepaidCommitRolloverLedgerEntry> =
            Optional.ofNullable(prepaidCommitRolloverLedgerEntry)

        fun prepaidCommitExpirationLedgerEntry(): Optional<PrepaidCommitExpirationLedgerEntry> =
            Optional.ofNullable(prepaidCommitExpirationLedgerEntry)

        fun prepaidCommitCanceledLedgerEntry(): Optional<PrepaidCommitCanceledLedgerEntry> =
            Optional.ofNullable(prepaidCommitCanceledLedgerEntry)

        fun prepaidCommitCreditedLedgerEntry(): Optional<PrepaidCommitCreditedLedgerEntry> =
            Optional.ofNullable(prepaidCommitCreditedLedgerEntry)

        fun postpaidCommitInitialBalanceLedgerEntry():
            Optional<PostpaidCommitInitialBalanceLedgerEntry> =
            Optional.ofNullable(postpaidCommitInitialBalanceLedgerEntry)

        fun postpaidCommitAutomatedInvoiceDeductionLedgerEntry():
            Optional<PostpaidCommitAutomatedInvoiceDeductionLedgerEntry> =
            Optional.ofNullable(postpaidCommitAutomatedInvoiceDeductionLedgerEntry)

        fun postpaidCommitRolloverLedgerEntry(): Optional<PostpaidCommitRolloverLedgerEntry> =
            Optional.ofNullable(postpaidCommitRolloverLedgerEntry)

        fun postpaidCommitTrueupLedgerEntry(): Optional<PostpaidCommitTrueupLedgerEntry> =
            Optional.ofNullable(postpaidCommitTrueupLedgerEntry)

        fun prepaidCommitManualLedgerEntry(): Optional<PrepaidCommitManualLedgerEntry> =
            Optional.ofNullable(prepaidCommitManualLedgerEntry)

        fun postpaidCommitManualLedgerEntry(): Optional<PostpaidCommitManualLedgerEntry> =
            Optional.ofNullable(postpaidCommitManualLedgerEntry)

        fun postpaidCommitExpirationLedgerEntry(): Optional<PostpaidCommitExpirationLedgerEntry> =
            Optional.ofNullable(postpaidCommitExpirationLedgerEntry)

        fun isPrepaidCommitSegmentStartLedgerEntry(): Boolean =
            prepaidCommitSegmentStartLedgerEntry != null

        fun isPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(): Boolean =
            prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null

        fun isPrepaidCommitRolloverLedgerEntry(): Boolean = prepaidCommitRolloverLedgerEntry != null

        fun isPrepaidCommitExpirationLedgerEntry(): Boolean =
            prepaidCommitExpirationLedgerEntry != null

        fun isPrepaidCommitCanceledLedgerEntry(): Boolean = prepaidCommitCanceledLedgerEntry != null

        fun isPrepaidCommitCreditedLedgerEntry(): Boolean = prepaidCommitCreditedLedgerEntry != null

        fun isPostpaidCommitInitialBalanceLedgerEntry(): Boolean =
            postpaidCommitInitialBalanceLedgerEntry != null

        fun isPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(): Boolean =
            postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null

        fun isPostpaidCommitRolloverLedgerEntry(): Boolean =
            postpaidCommitRolloverLedgerEntry != null

        fun isPostpaidCommitTrueupLedgerEntry(): Boolean = postpaidCommitTrueupLedgerEntry != null

        fun isPrepaidCommitManualLedgerEntry(): Boolean = prepaidCommitManualLedgerEntry != null

        fun isPostpaidCommitManualLedgerEntry(): Boolean = postpaidCommitManualLedgerEntry != null

        fun isPostpaidCommitExpirationLedgerEntry(): Boolean =
            postpaidCommitExpirationLedgerEntry != null

        fun asPrepaidCommitSegmentStartLedgerEntry(): PrepaidCommitSegmentStartLedgerEntry =
            prepaidCommitSegmentStartLedgerEntry.getOrThrow("prepaidCommitSegmentStartLedgerEntry")

        fun asPrepaidCommitAutomatedInvoiceDeductionLedgerEntry():
            PrepaidCommitAutomatedInvoiceDeductionLedgerEntry =
            prepaidCommitAutomatedInvoiceDeductionLedgerEntry.getOrThrow(
                "prepaidCommitAutomatedInvoiceDeductionLedgerEntry"
            )

        fun asPrepaidCommitRolloverLedgerEntry(): PrepaidCommitRolloverLedgerEntry =
            prepaidCommitRolloverLedgerEntry.getOrThrow("prepaidCommitRolloverLedgerEntry")

        fun asPrepaidCommitExpirationLedgerEntry(): PrepaidCommitExpirationLedgerEntry =
            prepaidCommitExpirationLedgerEntry.getOrThrow("prepaidCommitExpirationLedgerEntry")

        fun asPrepaidCommitCanceledLedgerEntry(): PrepaidCommitCanceledLedgerEntry =
            prepaidCommitCanceledLedgerEntry.getOrThrow("prepaidCommitCanceledLedgerEntry")

        fun asPrepaidCommitCreditedLedgerEntry(): PrepaidCommitCreditedLedgerEntry =
            prepaidCommitCreditedLedgerEntry.getOrThrow("prepaidCommitCreditedLedgerEntry")

        fun asPostpaidCommitInitialBalanceLedgerEntry(): PostpaidCommitInitialBalanceLedgerEntry =
            postpaidCommitInitialBalanceLedgerEntry.getOrThrow(
                "postpaidCommitInitialBalanceLedgerEntry"
            )

        fun asPostpaidCommitAutomatedInvoiceDeductionLedgerEntry():
            PostpaidCommitAutomatedInvoiceDeductionLedgerEntry =
            postpaidCommitAutomatedInvoiceDeductionLedgerEntry.getOrThrow(
                "postpaidCommitAutomatedInvoiceDeductionLedgerEntry"
            )

        fun asPostpaidCommitRolloverLedgerEntry(): PostpaidCommitRolloverLedgerEntry =
            postpaidCommitRolloverLedgerEntry.getOrThrow("postpaidCommitRolloverLedgerEntry")

        fun asPostpaidCommitTrueupLedgerEntry(): PostpaidCommitTrueupLedgerEntry =
            postpaidCommitTrueupLedgerEntry.getOrThrow("postpaidCommitTrueupLedgerEntry")

        fun asPrepaidCommitManualLedgerEntry(): PrepaidCommitManualLedgerEntry =
            prepaidCommitManualLedgerEntry.getOrThrow("prepaidCommitManualLedgerEntry")

        fun asPostpaidCommitManualLedgerEntry(): PostpaidCommitManualLedgerEntry =
            postpaidCommitManualLedgerEntry.getOrThrow("postpaidCommitManualLedgerEntry")

        fun asPostpaidCommitExpirationLedgerEntry(): PostpaidCommitExpirationLedgerEntry =
            postpaidCommitExpirationLedgerEntry.getOrThrow("postpaidCommitExpirationLedgerEntry")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                prepaidCommitSegmentStartLedgerEntry != null ->
                    visitor.visitPrepaidCommitSegmentStartLedgerEntry(
                        prepaidCommitSegmentStartLedgerEntry
                    )
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                    visitor.visitPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                    )
                prepaidCommitRolloverLedgerEntry != null ->
                    visitor.visitPrepaidCommitRolloverLedgerEntry(prepaidCommitRolloverLedgerEntry)
                prepaidCommitExpirationLedgerEntry != null ->
                    visitor.visitPrepaidCommitExpirationLedgerEntry(
                        prepaidCommitExpirationLedgerEntry
                    )
                prepaidCommitCanceledLedgerEntry != null ->
                    visitor.visitPrepaidCommitCanceledLedgerEntry(prepaidCommitCanceledLedgerEntry)
                prepaidCommitCreditedLedgerEntry != null ->
                    visitor.visitPrepaidCommitCreditedLedgerEntry(prepaidCommitCreditedLedgerEntry)
                postpaidCommitInitialBalanceLedgerEntry != null ->
                    visitor.visitPostpaidCommitInitialBalanceLedgerEntry(
                        postpaidCommitInitialBalanceLedgerEntry
                    )
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                    visitor.visitPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                    )
                postpaidCommitRolloverLedgerEntry != null ->
                    visitor.visitPostpaidCommitRolloverLedgerEntry(
                        postpaidCommitRolloverLedgerEntry
                    )
                postpaidCommitTrueupLedgerEntry != null ->
                    visitor.visitPostpaidCommitTrueupLedgerEntry(postpaidCommitTrueupLedgerEntry)
                prepaidCommitManualLedgerEntry != null ->
                    visitor.visitPrepaidCommitManualLedgerEntry(prepaidCommitManualLedgerEntry)
                postpaidCommitManualLedgerEntry != null ->
                    visitor.visitPostpaidCommitManualLedgerEntry(postpaidCommitManualLedgerEntry)
                postpaidCommitExpirationLedgerEntry != null ->
                    visitor.visitPostpaidCommitExpirationLedgerEntry(
                        postpaidCommitExpirationLedgerEntry
                    )
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Ledger = apply {
            if (!validated) {
                if (
                    prepaidCommitSegmentStartLedgerEntry == null &&
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry == null &&
                        prepaidCommitRolloverLedgerEntry == null &&
                        prepaidCommitExpirationLedgerEntry == null &&
                        prepaidCommitCanceledLedgerEntry == null &&
                        prepaidCommitCreditedLedgerEntry == null &&
                        postpaidCommitInitialBalanceLedgerEntry == null &&
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry == null &&
                        postpaidCommitRolloverLedgerEntry == null &&
                        postpaidCommitTrueupLedgerEntry == null &&
                        prepaidCommitManualLedgerEntry == null &&
                        postpaidCommitManualLedgerEntry == null &&
                        postpaidCommitExpirationLedgerEntry == null
                ) {
                    throw MetronomeInvalidDataException("Unknown Ledger: $_json")
                }
                prepaidCommitSegmentStartLedgerEntry?.validate()
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry?.validate()
                prepaidCommitRolloverLedgerEntry?.validate()
                prepaidCommitExpirationLedgerEntry?.validate()
                prepaidCommitCanceledLedgerEntry?.validate()
                prepaidCommitCreditedLedgerEntry?.validate()
                postpaidCommitInitialBalanceLedgerEntry?.validate()
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry?.validate()
                postpaidCommitRolloverLedgerEntry?.validate()
                postpaidCommitTrueupLedgerEntry?.validate()
                prepaidCommitManualLedgerEntry?.validate()
                postpaidCommitManualLedgerEntry?.validate()
                postpaidCommitExpirationLedgerEntry?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ledger && prepaidCommitSegmentStartLedgerEntry == other.prepaidCommitSegmentStartLedgerEntry && prepaidCommitAutomatedInvoiceDeductionLedgerEntry == other.prepaidCommitAutomatedInvoiceDeductionLedgerEntry && prepaidCommitRolloverLedgerEntry == other.prepaidCommitRolloverLedgerEntry && prepaidCommitExpirationLedgerEntry == other.prepaidCommitExpirationLedgerEntry && prepaidCommitCanceledLedgerEntry == other.prepaidCommitCanceledLedgerEntry && prepaidCommitCreditedLedgerEntry == other.prepaidCommitCreditedLedgerEntry && postpaidCommitInitialBalanceLedgerEntry == other.postpaidCommitInitialBalanceLedgerEntry && postpaidCommitAutomatedInvoiceDeductionLedgerEntry == other.postpaidCommitAutomatedInvoiceDeductionLedgerEntry && postpaidCommitRolloverLedgerEntry == other.postpaidCommitRolloverLedgerEntry && postpaidCommitTrueupLedgerEntry == other.postpaidCommitTrueupLedgerEntry && prepaidCommitManualLedgerEntry == other.prepaidCommitManualLedgerEntry && postpaidCommitManualLedgerEntry == other.postpaidCommitManualLedgerEntry && postpaidCommitExpirationLedgerEntry == other.postpaidCommitExpirationLedgerEntry /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(prepaidCommitSegmentStartLedgerEntry, prepaidCommitAutomatedInvoiceDeductionLedgerEntry, prepaidCommitRolloverLedgerEntry, prepaidCommitExpirationLedgerEntry, prepaidCommitCanceledLedgerEntry, prepaidCommitCreditedLedgerEntry, postpaidCommitInitialBalanceLedgerEntry, postpaidCommitAutomatedInvoiceDeductionLedgerEntry, postpaidCommitRolloverLedgerEntry, postpaidCommitTrueupLedgerEntry, prepaidCommitManualLedgerEntry, postpaidCommitManualLedgerEntry, postpaidCommitExpirationLedgerEntry) /* spotless:on */

        override fun toString(): String =
            when {
                prepaidCommitSegmentStartLedgerEntry != null ->
                    "Ledger{prepaidCommitSegmentStartLedgerEntry=$prepaidCommitSegmentStartLedgerEntry}"
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                    "Ledger{prepaidCommitAutomatedInvoiceDeductionLedgerEntry=$prepaidCommitAutomatedInvoiceDeductionLedgerEntry}"
                prepaidCommitRolloverLedgerEntry != null ->
                    "Ledger{prepaidCommitRolloverLedgerEntry=$prepaidCommitRolloverLedgerEntry}"
                prepaidCommitExpirationLedgerEntry != null ->
                    "Ledger{prepaidCommitExpirationLedgerEntry=$prepaidCommitExpirationLedgerEntry}"
                prepaidCommitCanceledLedgerEntry != null ->
                    "Ledger{prepaidCommitCanceledLedgerEntry=$prepaidCommitCanceledLedgerEntry}"
                prepaidCommitCreditedLedgerEntry != null ->
                    "Ledger{prepaidCommitCreditedLedgerEntry=$prepaidCommitCreditedLedgerEntry}"
                postpaidCommitInitialBalanceLedgerEntry != null ->
                    "Ledger{postpaidCommitInitialBalanceLedgerEntry=$postpaidCommitInitialBalanceLedgerEntry}"
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                    "Ledger{postpaidCommitAutomatedInvoiceDeductionLedgerEntry=$postpaidCommitAutomatedInvoiceDeductionLedgerEntry}"
                postpaidCommitRolloverLedgerEntry != null ->
                    "Ledger{postpaidCommitRolloverLedgerEntry=$postpaidCommitRolloverLedgerEntry}"
                postpaidCommitTrueupLedgerEntry != null ->
                    "Ledger{postpaidCommitTrueupLedgerEntry=$postpaidCommitTrueupLedgerEntry}"
                prepaidCommitManualLedgerEntry != null ->
                    "Ledger{prepaidCommitManualLedgerEntry=$prepaidCommitManualLedgerEntry}"
                postpaidCommitManualLedgerEntry != null ->
                    "Ledger{postpaidCommitManualLedgerEntry=$postpaidCommitManualLedgerEntry}"
                postpaidCommitExpirationLedgerEntry != null ->
                    "Ledger{postpaidCommitExpirationLedgerEntry=$postpaidCommitExpirationLedgerEntry}"
                _json != null -> "Ledger{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Ledger")
            }

        companion object {

            @JvmStatic
            fun ofPrepaidCommitSegmentStartLedgerEntry(
                prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
            ) = Ledger(prepaidCommitSegmentStartLedgerEntry = prepaidCommitSegmentStartLedgerEntry)

            @JvmStatic
            fun ofPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                    PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
            ) =
                Ledger(
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry =
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                )

            @JvmStatic
            fun ofPrepaidCommitRolloverLedgerEntry(
                prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
            ) = Ledger(prepaidCommitRolloverLedgerEntry = prepaidCommitRolloverLedgerEntry)

            @JvmStatic
            fun ofPrepaidCommitExpirationLedgerEntry(
                prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
            ) = Ledger(prepaidCommitExpirationLedgerEntry = prepaidCommitExpirationLedgerEntry)

            @JvmStatic
            fun ofPrepaidCommitCanceledLedgerEntry(
                prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
            ) = Ledger(prepaidCommitCanceledLedgerEntry = prepaidCommitCanceledLedgerEntry)

            @JvmStatic
            fun ofPrepaidCommitCreditedLedgerEntry(
                prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
            ) = Ledger(prepaidCommitCreditedLedgerEntry = prepaidCommitCreditedLedgerEntry)

            @JvmStatic
            fun ofPostpaidCommitInitialBalanceLedgerEntry(
                postpaidCommitInitialBalanceLedgerEntry: PostpaidCommitInitialBalanceLedgerEntry
            ) =
                Ledger(
                    postpaidCommitInitialBalanceLedgerEntry =
                        postpaidCommitInitialBalanceLedgerEntry
                )

            @JvmStatic
            fun ofPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                    PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
            ) =
                Ledger(
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry =
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                )

            @JvmStatic
            fun ofPostpaidCommitRolloverLedgerEntry(
                postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
            ) = Ledger(postpaidCommitRolloverLedgerEntry = postpaidCommitRolloverLedgerEntry)

            @JvmStatic
            fun ofPostpaidCommitTrueupLedgerEntry(
                postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
            ) = Ledger(postpaidCommitTrueupLedgerEntry = postpaidCommitTrueupLedgerEntry)

            @JvmStatic
            fun ofPrepaidCommitManualLedgerEntry(
                prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
            ) = Ledger(prepaidCommitManualLedgerEntry = prepaidCommitManualLedgerEntry)

            @JvmStatic
            fun ofPostpaidCommitManualLedgerEntry(
                postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
            ) = Ledger(postpaidCommitManualLedgerEntry = postpaidCommitManualLedgerEntry)

            @JvmStatic
            fun ofPostpaidCommitExpirationLedgerEntry(
                postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
            ) = Ledger(postpaidCommitExpirationLedgerEntry = postpaidCommitExpirationLedgerEntry)
        }

        interface Visitor<out T> {

            fun visitPrepaidCommitSegmentStartLedgerEntry(
                prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
            ): T

            fun visitPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                    PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
            ): T

            fun visitPrepaidCommitRolloverLedgerEntry(
                prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
            ): T

            fun visitPrepaidCommitExpirationLedgerEntry(
                prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
            ): T

            fun visitPrepaidCommitCanceledLedgerEntry(
                prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
            ): T

            fun visitPrepaidCommitCreditedLedgerEntry(
                prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
            ): T

            fun visitPostpaidCommitInitialBalanceLedgerEntry(
                postpaidCommitInitialBalanceLedgerEntry: PostpaidCommitInitialBalanceLedgerEntry
            ): T

            fun visitPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                    PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
            ): T

            fun visitPostpaidCommitRolloverLedgerEntry(
                postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
            ): T

            fun visitPostpaidCommitTrueupLedgerEntry(
                postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
            ): T

            fun visitPrepaidCommitManualLedgerEntry(
                prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
            ): T

            fun visitPostpaidCommitManualLedgerEntry(
                postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
            ): T

            fun visitPostpaidCommitExpirationLedgerEntry(
                postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
            ): T

            fun unknown(json: JsonValue?): T {
                throw MetronomeInvalidDataException("Unknown Ledger: $json")
            }
        }

        class Deserializer : BaseDeserializer<Ledger>(Ledger::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Ledger {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<PrepaidCommitSegmentStartLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(prepaidCommitSegmentStartLedgerEntry = it, _json = json)
                    }
                tryDeserialize(
                        node,
                        jacksonTypeRef<PrepaidCommitAutomatedInvoiceDeductionLedgerEntry>()
                    ) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(
                            prepaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                            _json = json
                        )
                    }
                tryDeserialize(node, jacksonTypeRef<PrepaidCommitRolloverLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(prepaidCommitRolloverLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PrepaidCommitExpirationLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(prepaidCommitExpirationLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PrepaidCommitCanceledLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(prepaidCommitCanceledLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PrepaidCommitCreditedLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(prepaidCommitCreditedLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PostpaidCommitInitialBalanceLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(postpaidCommitInitialBalanceLedgerEntry = it, _json = json)
                    }
                tryDeserialize(
                        node,
                        jacksonTypeRef<PostpaidCommitAutomatedInvoiceDeductionLedgerEntry>()
                    ) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(
                            postpaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                            _json = json
                        )
                    }
                tryDeserialize(node, jacksonTypeRef<PostpaidCommitRolloverLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(postpaidCommitRolloverLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PostpaidCommitTrueupLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(postpaidCommitTrueupLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PrepaidCommitManualLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(prepaidCommitManualLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PostpaidCommitManualLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(postpaidCommitManualLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PostpaidCommitExpirationLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(postpaidCommitExpirationLedgerEntry = it, _json = json)
                    }

                return Ledger(_json = json)
            }
        }

        class Serializer : BaseSerializer<Ledger>(Ledger::class) {

            override fun serialize(
                value: Ledger,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.prepaidCommitSegmentStartLedgerEntry != null ->
                        generator.writeObject(value.prepaidCommitSegmentStartLedgerEntry)
                    value.prepaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                        generator.writeObject(
                            value.prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                        )
                    value.prepaidCommitRolloverLedgerEntry != null ->
                        generator.writeObject(value.prepaidCommitRolloverLedgerEntry)
                    value.prepaidCommitExpirationLedgerEntry != null ->
                        generator.writeObject(value.prepaidCommitExpirationLedgerEntry)
                    value.prepaidCommitCanceledLedgerEntry != null ->
                        generator.writeObject(value.prepaidCommitCanceledLedgerEntry)
                    value.prepaidCommitCreditedLedgerEntry != null ->
                        generator.writeObject(value.prepaidCommitCreditedLedgerEntry)
                    value.postpaidCommitInitialBalanceLedgerEntry != null ->
                        generator.writeObject(value.postpaidCommitInitialBalanceLedgerEntry)
                    value.postpaidCommitAutomatedInvoiceDeductionLedgerEntry != null ->
                        generator.writeObject(
                            value.postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                        )
                    value.postpaidCommitRolloverLedgerEntry != null ->
                        generator.writeObject(value.postpaidCommitRolloverLedgerEntry)
                    value.postpaidCommitTrueupLedgerEntry != null ->
                        generator.writeObject(value.postpaidCommitTrueupLedgerEntry)
                    value.prepaidCommitManualLedgerEntry != null ->
                        generator.writeObject(value.prepaidCommitManualLedgerEntry)
                    value.postpaidCommitManualLedgerEntry != null ->
                        generator.writeObject(value.postpaidCommitManualLedgerEntry)
                    value.postpaidCommitExpirationLedgerEntry != null ->
                        generator.writeObject(value.postpaidCommitExpirationLedgerEntry)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Ledger")
                }
            }
        }

        @NoAutoDetect
        class PrepaidCommitSegmentStartLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitSegmentStartLedgerEntry = apply {
                if (!validated) {
                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
                ) = apply {
                    amount = prepaidCommitSegmentStartLedgerEntry.amount
                    segmentId = prepaidCommitSegmentStartLedgerEntry.segmentId
                    timestamp = prepaidCommitSegmentStartLedgerEntry.timestamp
                    type = prepaidCommitSegmentStartLedgerEntry.type
                    additionalProperties =
                        prepaidCommitSegmentStartLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PrepaidCommitSegmentStartLedgerEntry =
                    PrepaidCommitSegmentStartLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID_COMMIT_SEGMENT_START = of("PREPAID_COMMIT_SEGMENT_START")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID_COMMIT_SEGMENT_START,
                }

                enum class Value {
                    PREPAID_COMMIT_SEGMENT_START,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID_COMMIT_SEGMENT_START -> Value.PREPAID_COMMIT_SEGMENT_START
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID_COMMIT_SEGMENT_START -> Known.PREPAID_COMMIT_SEGMENT_START
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PrepaidCommitSegmentStartLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitSegmentStartLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (!validated) {
                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                ) = apply {
                    amount = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.amount
                    invoiceId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.invoiceId
                    segmentId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.segmentId
                    timestamp = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.timestamp
                    type = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.type
                    additionalProperties =
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                            .toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry =
                    PrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField
                    val PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION =
                        of("PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                }

                enum class Value {
                    PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Value.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Known.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PrepaidCommitAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitRolloverLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("new_contract_id")
            @ExcludeMissing
            private val newContractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun newContractId(): String = newContractId.getRequired("new_contract_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("new_contract_id")
            @ExcludeMissing
            fun _newContractId(): JsonField<String> = newContractId

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitRolloverLedgerEntry = apply {
                if (!validated) {
                    amount()
                    newContractId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var newContractId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                ) = apply {
                    amount = prepaidCommitRolloverLedgerEntry.amount
                    newContractId = prepaidCommitRolloverLedgerEntry.newContractId
                    segmentId = prepaidCommitRolloverLedgerEntry.segmentId
                    timestamp = prepaidCommitRolloverLedgerEntry.timestamp
                    type = prepaidCommitRolloverLedgerEntry.type
                    additionalProperties =
                        prepaidCommitRolloverLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun newContractId(newContractId: String) =
                    newContractId(JsonField.of(newContractId))

                fun newContractId(newContractId: JsonField<String>) = apply {
                    this.newContractId = newContractId
                }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PrepaidCommitRolloverLedgerEntry =
                    PrepaidCommitRolloverLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(newContractId) {
                            "`newContractId` is required but was not set"
                        },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID_COMMIT_ROLLOVER = of("PREPAID_COMMIT_ROLLOVER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID_COMMIT_ROLLOVER,
                }

                enum class Value {
                    PREPAID_COMMIT_ROLLOVER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID_COMMIT_ROLLOVER -> Value.PREPAID_COMMIT_ROLLOVER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID_COMMIT_ROLLOVER -> Known.PREPAID_COMMIT_ROLLOVER
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PrepaidCommitRolloverLedgerEntry && amount == other.amount && newContractId == other.newContractId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, newContractId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitRolloverLedgerEntry{amount=$amount, newContractId=$newContractId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitExpirationLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitExpirationLedgerEntry = apply {
                if (!validated) {
                    amount()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                ) = apply {
                    amount = prepaidCommitExpirationLedgerEntry.amount
                    segmentId = prepaidCommitExpirationLedgerEntry.segmentId
                    timestamp = prepaidCommitExpirationLedgerEntry.timestamp
                    type = prepaidCommitExpirationLedgerEntry.type
                    additionalProperties =
                        prepaidCommitExpirationLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PrepaidCommitExpirationLedgerEntry =
                    PrepaidCommitExpirationLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID_COMMIT_EXPIRATION = of("PREPAID_COMMIT_EXPIRATION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID_COMMIT_EXPIRATION,
                }

                enum class Value {
                    PREPAID_COMMIT_EXPIRATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID_COMMIT_EXPIRATION -> Value.PREPAID_COMMIT_EXPIRATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID_COMMIT_EXPIRATION -> Known.PREPAID_COMMIT_EXPIRATION
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PrepaidCommitExpirationLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitExpirationLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitCanceledLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitCanceledLedgerEntry = apply {
                if (!validated) {
                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                ) = apply {
                    amount = prepaidCommitCanceledLedgerEntry.amount
                    invoiceId = prepaidCommitCanceledLedgerEntry.invoiceId
                    segmentId = prepaidCommitCanceledLedgerEntry.segmentId
                    timestamp = prepaidCommitCanceledLedgerEntry.timestamp
                    type = prepaidCommitCanceledLedgerEntry.type
                    additionalProperties =
                        prepaidCommitCanceledLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PrepaidCommitCanceledLedgerEntry =
                    PrepaidCommitCanceledLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID_COMMIT_CANCELED = of("PREPAID_COMMIT_CANCELED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID_COMMIT_CANCELED,
                }

                enum class Value {
                    PREPAID_COMMIT_CANCELED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID_COMMIT_CANCELED -> Value.PREPAID_COMMIT_CANCELED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID_COMMIT_CANCELED -> Known.PREPAID_COMMIT_CANCELED
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PrepaidCommitCanceledLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCanceledLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitCreditedLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitCreditedLedgerEntry = apply {
                if (!validated) {
                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                ) = apply {
                    amount = prepaidCommitCreditedLedgerEntry.amount
                    invoiceId = prepaidCommitCreditedLedgerEntry.invoiceId
                    segmentId = prepaidCommitCreditedLedgerEntry.segmentId
                    timestamp = prepaidCommitCreditedLedgerEntry.timestamp
                    type = prepaidCommitCreditedLedgerEntry.type
                    additionalProperties =
                        prepaidCommitCreditedLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PrepaidCommitCreditedLedgerEntry =
                    PrepaidCommitCreditedLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID_COMMIT_CREDITED = of("PREPAID_COMMIT_CREDITED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID_COMMIT_CREDITED,
                }

                enum class Value {
                    PREPAID_COMMIT_CREDITED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID_COMMIT_CREDITED -> Value.PREPAID_COMMIT_CREDITED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID_COMMIT_CREDITED -> Known.PREPAID_COMMIT_CREDITED
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PrepaidCommitCreditedLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCreditedLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitInitialBalanceLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitInitialBalanceLedgerEntry = apply {
                if (!validated) {
                    amount()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitInitialBalanceLedgerEntry: PostpaidCommitInitialBalanceLedgerEntry
                ) = apply {
                    amount = postpaidCommitInitialBalanceLedgerEntry.amount
                    timestamp = postpaidCommitInitialBalanceLedgerEntry.timestamp
                    type = postpaidCommitInitialBalanceLedgerEntry.type
                    additionalProperties =
                        postpaidCommitInitialBalanceLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PostpaidCommitInitialBalanceLedgerEntry =
                    PostpaidCommitInitialBalanceLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField
                    val POSTPAID_COMMIT_INITIAL_BALANCE = of("POSTPAID_COMMIT_INITIAL_BALANCE")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    POSTPAID_COMMIT_INITIAL_BALANCE,
                }

                enum class Value {
                    POSTPAID_COMMIT_INITIAL_BALANCE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        POSTPAID_COMMIT_INITIAL_BALANCE -> Value.POSTPAID_COMMIT_INITIAL_BALANCE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        POSTPAID_COMMIT_INITIAL_BALANCE -> Known.POSTPAID_COMMIT_INITIAL_BALANCE
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommitInitialBalanceLedgerEntry && amount == other.amount && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitInitialBalanceLedgerEntry{amount=$amount, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (!validated) {
                    amount()
                    invoiceId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                ) = apply {
                    amount = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.amount
                    invoiceId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.invoiceId
                    segmentId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.segmentId
                    timestamp = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.timestamp
                    type = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.type
                    additionalProperties =
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                            .toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry =
                    PostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField
                    val POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION =
                        of("POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                }

                enum class Value {
                    POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Value.POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Known.POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommitAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitRolloverLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("new_contract_id")
            @ExcludeMissing
            private val newContractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun newContractId(): String = newContractId.getRequired("new_contract_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("new_contract_id")
            @ExcludeMissing
            fun _newContractId(): JsonField<String> = newContractId

            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitRolloverLedgerEntry = apply {
                if (!validated) {
                    amount()
                    newContractId()
                    segmentId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var newContractId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                ) = apply {
                    amount = postpaidCommitRolloverLedgerEntry.amount
                    newContractId = postpaidCommitRolloverLedgerEntry.newContractId
                    segmentId = postpaidCommitRolloverLedgerEntry.segmentId
                    timestamp = postpaidCommitRolloverLedgerEntry.timestamp
                    type = postpaidCommitRolloverLedgerEntry.type
                    additionalProperties =
                        postpaidCommitRolloverLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun newContractId(newContractId: String) =
                    newContractId(JsonField.of(newContractId))

                fun newContractId(newContractId: JsonField<String>) = apply {
                    this.newContractId = newContractId
                }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PostpaidCommitRolloverLedgerEntry =
                    PostpaidCommitRolloverLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(newContractId) {
                            "`newContractId` is required but was not set"
                        },
                        checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val POSTPAID_COMMIT_ROLLOVER = of("POSTPAID_COMMIT_ROLLOVER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    POSTPAID_COMMIT_ROLLOVER,
                }

                enum class Value {
                    POSTPAID_COMMIT_ROLLOVER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        POSTPAID_COMMIT_ROLLOVER -> Value.POSTPAID_COMMIT_ROLLOVER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        POSTPAID_COMMIT_ROLLOVER -> Known.POSTPAID_COMMIT_ROLLOVER
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommitRolloverLedgerEntry && amount == other.amount && newContractId == other.newContractId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, newContractId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitRolloverLedgerEntry{amount=$amount, newContractId=$newContractId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitTrueupLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitTrueupLedgerEntry = apply {
                if (!validated) {
                    amount()
                    invoiceId()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                ) = apply {
                    amount = postpaidCommitTrueupLedgerEntry.amount
                    invoiceId = postpaidCommitTrueupLedgerEntry.invoiceId
                    timestamp = postpaidCommitTrueupLedgerEntry.timestamp
                    type = postpaidCommitTrueupLedgerEntry.type
                    additionalProperties =
                        postpaidCommitTrueupLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PostpaidCommitTrueupLedgerEntry =
                    PostpaidCommitTrueupLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val POSTPAID_COMMIT_TRUEUP = of("POSTPAID_COMMIT_TRUEUP")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    POSTPAID_COMMIT_TRUEUP,
                }

                enum class Value {
                    POSTPAID_COMMIT_TRUEUP,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        POSTPAID_COMMIT_TRUEUP -> Value.POSTPAID_COMMIT_TRUEUP
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        POSTPAID_COMMIT_TRUEUP -> Known.POSTPAID_COMMIT_TRUEUP
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommitTrueupLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitTrueupLedgerEntry{amount=$amount, invoiceId=$invoiceId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitManualLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun reason(): String = reason.getRequired("reason")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitManualLedgerEntry = apply {
                if (!validated) {
                    amount()
                    reason()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var reason: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry) =
                    apply {
                        amount = prepaidCommitManualLedgerEntry.amount
                        reason = prepaidCommitManualLedgerEntry.reason
                        timestamp = prepaidCommitManualLedgerEntry.timestamp
                        type = prepaidCommitManualLedgerEntry.type
                        additionalProperties =
                            prepaidCommitManualLedgerEntry.additionalProperties.toMutableMap()
                    }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PrepaidCommitManualLedgerEntry =
                    PrepaidCommitManualLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(reason) { "`reason` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID_COMMIT_MANUAL = of("PREPAID_COMMIT_MANUAL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID_COMMIT_MANUAL,
                }

                enum class Value {
                    PREPAID_COMMIT_MANUAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID_COMMIT_MANUAL -> Value.PREPAID_COMMIT_MANUAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID_COMMIT_MANUAL -> Known.PREPAID_COMMIT_MANUAL
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PrepaidCommitManualLedgerEntry && amount == other.amount && reason == other.reason && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, reason, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitManualLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun reason(): String = reason.getRequired("reason")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitManualLedgerEntry = apply {
                if (!validated) {
                    amount()
                    reason()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var reason: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                ) = apply {
                    amount = postpaidCommitManualLedgerEntry.amount
                    reason = postpaidCommitManualLedgerEntry.reason
                    timestamp = postpaidCommitManualLedgerEntry.timestamp
                    type = postpaidCommitManualLedgerEntry.type
                    additionalProperties =
                        postpaidCommitManualLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PostpaidCommitManualLedgerEntry =
                    PostpaidCommitManualLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(reason) { "`reason` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val POSTPAID_COMMIT_MANUAL = of("POSTPAID_COMMIT_MANUAL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    POSTPAID_COMMIT_MANUAL,
                }

                enum class Value {
                    POSTPAID_COMMIT_MANUAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        POSTPAID_COMMIT_MANUAL -> Value.POSTPAID_COMMIT_MANUAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        POSTPAID_COMMIT_MANUAL -> Known.POSTPAID_COMMIT_MANUAL
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommitManualLedgerEntry && amount == other.amount && reason == other.reason && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, reason, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitExpirationLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitExpirationLedgerEntry = apply {
                if (!validated) {
                    amount()
                    timestamp()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Double>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                ) = apply {
                    amount = postpaidCommitExpirationLedgerEntry.amount
                    timestamp = postpaidCommitExpirationLedgerEntry.timestamp
                    type = postpaidCommitExpirationLedgerEntry.type
                    additionalProperties =
                        postpaidCommitExpirationLedgerEntry.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PostpaidCommitExpirationLedgerEntry =
                    PostpaidCommitExpirationLedgerEntry(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val POSTPAID_COMMIT_EXPIRATION = of("POSTPAID_COMMIT_EXPIRATION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    POSTPAID_COMMIT_EXPIRATION,
                }

                enum class Value {
                    POSTPAID_COMMIT_EXPIRATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        POSTPAID_COMMIT_EXPIRATION -> Value.POSTPAID_COMMIT_EXPIRATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        POSTPAID_COMMIT_EXPIRATION -> Known.POSTPAID_COMMIT_EXPIRATION
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommitExpirationLedgerEntry && amount == other.amount && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitExpirationLedgerEntry{amount=$amount, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class RateType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMMIT_RATE = of("COMMIT_RATE")

            @JvmField val LIST_RATE = of("LIST_RATE")

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        enum class Known {
            COMMIT_RATE,
            LIST_RATE,
        }

        enum class Value {
            COMMIT_RATE,
            LIST_RATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMIT_RATE -> Value.COMMIT_RATE
                LIST_RATE -> Value.LIST_RATE
                else -> Value._UNKNOWN
            }

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

    @NoAutoDetect
    class RolledOverFrom
    @JsonCreator
    private constructor(
        @JsonProperty("commit_id")
        @ExcludeMissing
        private val commitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun commitId(): String = commitId.getRequired("commit_id")

        fun contractId(): String = contractId.getRequired("contract_id")

        @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RolledOverFrom = apply {
            if (!validated) {
                commitId()
                contractId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var commitId: JsonField<String>? = null
            private var contractId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rolledOverFrom: RolledOverFrom) = apply {
                commitId = rolledOverFrom.commitId
                contractId = rolledOverFrom.contractId
                additionalProperties = rolledOverFrom.additionalProperties.toMutableMap()
            }

            fun commitId(commitId: String) = commitId(JsonField.of(commitId))

            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

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

            fun build(): RolledOverFrom =
                RolledOverFrom(
                    checkNotNull(commitId) { "`commitId` is required but was not set" },
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RolledOverFrom && commitId == other.commitId && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(commitId, contractId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RolledOverFrom{commitId=$commitId, contractId=$contractId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Commit && id == other.id && product == other.product && type == other.type && accessSchedule == other.accessSchedule && amount == other.amount && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && contract == other.contract && customFields == other.customFields && description == other.description && invoiceContract == other.invoiceContract && invoiceSchedule == other.invoiceSchedule && ledger == other.ledger && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && rolledOverFrom == other.rolledOverFrom && rolloverFraction == other.rolloverFraction && salesforceOpportunityId == other.salesforceOpportunityId && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, product, type, accessSchedule, amount, applicableContractIds, applicableProductIds, applicableProductTags, contract, customFields, description, invoiceContract, invoiceSchedule, ledger, name, netsuiteSalesOrderId, priority, rateType, rolledOverFrom, rolloverFraction, salesforceOpportunityId, uniquenessKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Commit{id=$id, product=$product, type=$type, accessSchedule=$accessSchedule, amount=$amount, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, customFields=$customFields, description=$description, invoiceContract=$invoiceContract, invoiceSchedule=$invoiceSchedule, ledger=$ledger, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, rolledOverFrom=$rolledOverFrom, rolloverFraction=$rolloverFraction, salesforceOpportunityId=$salesforceOpportunityId, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
