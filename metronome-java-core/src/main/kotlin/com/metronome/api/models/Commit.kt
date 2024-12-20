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
    @JsonProperty("contract")
    @ExcludeMissing
    private val contract: JsonField<Contract> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("rate_type")
    @ExcludeMissing
    private val rateType: JsonField<RateType> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("product")
    @ExcludeMissing
    private val product: JsonField<Product> = JsonMissing.of(),
    @JsonProperty("access_schedule")
    @ExcludeMissing
    private val accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
    @JsonProperty("invoice_schedule")
    @ExcludeMissing
    private val invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of(),
    @JsonProperty("invoice_contract")
    @ExcludeMissing
    private val invoiceContract: JsonField<InvoiceContract> = JsonMissing.of(),
    @JsonProperty("rolled_over_from")
    @ExcludeMissing
    private val rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("rollover_fraction")
    @ExcludeMissing
    private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("applicable_product_ids")
    @ExcludeMissing
    private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applicable_contract_ids")
    @ExcludeMissing
    private val applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger")
    @ExcludeMissing
    private val ledger: JsonField<List<Ledger>> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    private val uniquenessKey: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

    fun type(): Type = type.getRequired("type")

    fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

    fun product(): Product = product.getRequired("product")

    /** The schedule that the customer will gain access to the credits purposed with this commit. */
    fun accessSchedule(): Optional<ScheduleDuration> =
        Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

    /** The schedule that the customer will be invoiced for this commit. */
    fun invoiceSchedule(): Optional<SchedulePointInTime> =
        Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

    /** The contract that this commit will be billed on. */
    fun invoiceContract(): Optional<InvoiceContract> =
        Optional.ofNullable(invoiceContract.getNullable("invoice_contract"))

    fun rolledOverFrom(): Optional<RolledOverFrom> =
        Optional.ofNullable(rolledOverFrom.getNullable("rolled_over_from"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun rolloverFraction(): Optional<Double> =
        Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

    fun applicableProductIds(): Optional<List<String>> =
        Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

    fun applicableProductTags(): Optional<List<String>> =
        Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

    fun applicableContractIds(): Optional<List<String>> =
        Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
    fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    /**
     * A list of ordered events that impact the balance of a commit. For example, an invoice
     * deduction or a rollover.
     */
    fun ledger(): Optional<List<Ledger>> = Optional.ofNullable(ledger.getNullable("ledger"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     */
    fun uniquenessKey(): Optional<String> =
        Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("contract") @ExcludeMissing fun _contract() = contract

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("rate_type") @ExcludeMissing fun _rateType() = rateType

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

    @JsonProperty("product") @ExcludeMissing fun _product() = product

    /** The schedule that the customer will gain access to the credits purposed with this commit. */
    @JsonProperty("access_schedule") @ExcludeMissing fun _accessSchedule() = accessSchedule

    /** The schedule that the customer will be invoiced for this commit. */
    @JsonProperty("invoice_schedule") @ExcludeMissing fun _invoiceSchedule() = invoiceSchedule

    /** The contract that this commit will be billed on. */
    @JsonProperty("invoice_contract") @ExcludeMissing fun _invoiceContract() = invoiceContract

    @JsonProperty("rolled_over_from") @ExcludeMissing fun _rolledOverFrom() = rolledOverFrom

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("rollover_fraction") @ExcludeMissing fun _rolloverFraction() = rolloverFraction

    @JsonProperty("applicable_product_ids")
    @ExcludeMissing
    fun _applicableProductIds() = applicableProductIds

    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    fun _applicableProductTags() = applicableProductTags

    @JsonProperty("applicable_contract_ids")
    @ExcludeMissing
    fun _applicableContractIds() = applicableContractIds

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

    /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId() = salesforceOpportunityId

    /**
     * A list of ordered events that impact the balance of a commit. For example, an invoice
     * deduction or a rollover.
     */
    @JsonProperty("ledger") @ExcludeMissing fun _ledger() = ledger

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     */
    @JsonProperty("uniqueness_key") @ExcludeMissing fun _uniquenessKey() = uniquenessKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Commit = apply {
        if (!validated) {
            id()
            contract().map { it.validate() }
            type()
            rateType()
            name()
            priority()
            product().validate()
            accessSchedule().map { it.validate() }
            invoiceSchedule().map { it.validate() }
            invoiceContract().map { it.validate() }
            rolledOverFrom().map { it.validate() }
            description()
            rolloverFraction()
            applicableProductIds()
            applicableProductTags()
            applicableContractIds()
            netsuiteSalesOrderId()
            amount()
            salesforceOpportunityId()
            ledger()
            customFields().map { it.validate() }
            uniquenessKey()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var contract: JsonField<Contract> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var product: JsonField<Product> = JsonMissing.of()
        private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
        private var invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of()
        private var invoiceContract: JsonField<InvoiceContract> = JsonMissing.of()
        private var rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var rolloverFraction: JsonField<Double> = JsonMissing.of()
        private var applicableProductIds: JsonField<List<String>> = JsonMissing.of()
        private var applicableProductTags: JsonField<List<String>> = JsonMissing.of()
        private var applicableContractIds: JsonField<List<String>> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Double> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var ledger: JsonField<List<Ledger>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commit: Commit) = apply {
            id = commit.id
            contract = commit.contract
            type = commit.type
            rateType = commit.rateType
            name = commit.name
            priority = commit.priority
            product = commit.product
            accessSchedule = commit.accessSchedule
            invoiceSchedule = commit.invoiceSchedule
            invoiceContract = commit.invoiceContract
            rolledOverFrom = commit.rolledOverFrom
            description = commit.description
            rolloverFraction = commit.rolloverFraction
            applicableProductIds = commit.applicableProductIds
            applicableProductTags = commit.applicableProductTags
            applicableContractIds = commit.applicableContractIds
            netsuiteSalesOrderId = commit.netsuiteSalesOrderId
            amount = commit.amount
            salesforceOpportunityId = commit.salesforceOpportunityId
            ledger = commit.ledger
            customFields = commit.customFields
            uniquenessKey = commit.uniquenessKey
            additionalProperties = commit.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun contract(contract: Contract) = contract(JsonField.of(contract))

        fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

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

        /** The schedule that the customer will be invoiced for this commit. */
        fun invoiceSchedule(invoiceSchedule: SchedulePointInTime) =
            invoiceSchedule(JsonField.of(invoiceSchedule))

        /** The schedule that the customer will be invoiced for this commit. */
        fun invoiceSchedule(invoiceSchedule: JsonField<SchedulePointInTime>) = apply {
            this.invoiceSchedule = invoiceSchedule
        }

        /** The contract that this commit will be billed on. */
        fun invoiceContract(invoiceContract: InvoiceContract) =
            invoiceContract(JsonField.of(invoiceContract))

        /** The contract that this commit will be billed on. */
        fun invoiceContract(invoiceContract: JsonField<InvoiceContract>) = apply {
            this.invoiceContract = invoiceContract
        }

        fun rolledOverFrom(rolledOverFrom: RolledOverFrom) =
            rolledOverFrom(JsonField.of(rolledOverFrom))

        fun rolledOverFrom(rolledOverFrom: JsonField<RolledOverFrom>) = apply {
            this.rolledOverFrom = rolledOverFrom
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun rolloverFraction(rolloverFraction: Double) =
            rolloverFraction(JsonField.of(rolloverFraction))

        fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
            this.rolloverFraction = rolloverFraction
        }

        fun applicableProductIds(applicableProductIds: List<String>) =
            applicableProductIds(JsonField.of(applicableProductIds))

        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            this.applicableProductIds = applicableProductIds
        }

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags
        }

        fun applicableContractIds(applicableContractIds: List<String>) =
            applicableContractIds(JsonField.of(applicableContractIds))

        fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
            this.applicableContractIds = applicableContractIds
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
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
        fun ledger(ledger: JsonField<List<Ledger>>) = apply { this.ledger = ledger }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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
                id,
                contract,
                type,
                rateType,
                name,
                priority,
                product,
                accessSchedule,
                invoiceSchedule,
                invoiceContract,
                rolledOverFrom,
                description,
                rolloverFraction,
                applicableProductIds.map { it.toImmutable() },
                applicableProductTags.map { it.toImmutable() },
                applicableContractIds.map { it.toImmutable() },
                netsuiteSalesOrderId,
                amount,
                salesforceOpportunityId,
                ledger.map { it.toImmutable() },
                customFields,
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

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

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

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
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
                    id,
                    name,
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

        @JsonProperty("id") @ExcludeMissing fun _id() = id

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

            private var id: JsonField<String> = JsonMissing.of()
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

            fun build(): Contract = Contract(id, additionalProperties.toImmutable())
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

        @JsonProperty("id") @ExcludeMissing fun _id() = id

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

            private var id: JsonField<String> = JsonMissing.of()
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

            fun build(): InvoiceContract = InvoiceContract(id, additionalProperties.toImmutable())
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitSegmentStartLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
                ) = apply {
                    type = prepaidCommitSegmentStartLedgerEntry.type
                    timestamp = prepaidCommitSegmentStartLedgerEntry.timestamp
                    amount = prepaidCommitSegmentStartLedgerEntry.amount
                    segmentId = prepaidCommitSegmentStartLedgerEntry.segmentId
                    additionalProperties =
                        prepaidCommitSegmentStartLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

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
                        type,
                        timestamp,
                        amount,
                        segmentId,
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

                return /* spotless:off */ other is PrepaidCommitSegmentStartLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitSegmentStartLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    invoiceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                ) = apply {
                    type = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.type
                    timestamp = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.timestamp
                    amount = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.amount
                    segmentId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.segmentId
                    invoiceId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.invoiceId
                    additionalProperties =
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                            .toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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
                        type,
                        timestamp,
                        amount,
                        segmentId,
                        invoiceId,
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

                return /* spotless:off */ other is PrepaidCommitAutomatedInvoiceDeductionLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitAutomatedInvoiceDeductionLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitRolloverLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("new_contract_id")
            @ExcludeMissing
            private val newContractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun newContractId(): String = newContractId.getRequired("new_contract_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonProperty("new_contract_id") @ExcludeMissing fun _newContractId() = newContractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitRolloverLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    newContractId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var newContractId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                ) = apply {
                    type = prepaidCommitRolloverLedgerEntry.type
                    timestamp = prepaidCommitRolloverLedgerEntry.timestamp
                    amount = prepaidCommitRolloverLedgerEntry.amount
                    segmentId = prepaidCommitRolloverLedgerEntry.segmentId
                    newContractId = prepaidCommitRolloverLedgerEntry.newContractId
                    additionalProperties =
                        prepaidCommitRolloverLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun newContractId(newContractId: String) =
                    newContractId(JsonField.of(newContractId))

                fun newContractId(newContractId: JsonField<String>) = apply {
                    this.newContractId = newContractId
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

                fun build(): PrepaidCommitRolloverLedgerEntry =
                    PrepaidCommitRolloverLedgerEntry(
                        type,
                        timestamp,
                        amount,
                        segmentId,
                        newContractId,
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

                return /* spotless:off */ other is PrepaidCommitRolloverLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && newContractId == other.newContractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, newContractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitRolloverLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, newContractId=$newContractId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitExpirationLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitExpirationLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                ) = apply {
                    type = prepaidCommitExpirationLedgerEntry.type
                    timestamp = prepaidCommitExpirationLedgerEntry.timestamp
                    amount = prepaidCommitExpirationLedgerEntry.amount
                    segmentId = prepaidCommitExpirationLedgerEntry.segmentId
                    additionalProperties =
                        prepaidCommitExpirationLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

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
                        type,
                        timestamp,
                        amount,
                        segmentId,
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

                return /* spotless:off */ other is PrepaidCommitExpirationLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitExpirationLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitCanceledLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitCanceledLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    invoiceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                ) = apply {
                    type = prepaidCommitCanceledLedgerEntry.type
                    timestamp = prepaidCommitCanceledLedgerEntry.timestamp
                    amount = prepaidCommitCanceledLedgerEntry.amount
                    segmentId = prepaidCommitCanceledLedgerEntry.segmentId
                    invoiceId = prepaidCommitCanceledLedgerEntry.invoiceId
                    additionalProperties =
                        prepaidCommitCanceledLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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
                        type,
                        timestamp,
                        amount,
                        segmentId,
                        invoiceId,
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

                return /* spotless:off */ other is PrepaidCommitCanceledLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCanceledLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitCreditedLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitCreditedLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    invoiceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                ) = apply {
                    type = prepaidCommitCreditedLedgerEntry.type
                    timestamp = prepaidCommitCreditedLedgerEntry.timestamp
                    amount = prepaidCommitCreditedLedgerEntry.amount
                    segmentId = prepaidCommitCreditedLedgerEntry.segmentId
                    invoiceId = prepaidCommitCreditedLedgerEntry.invoiceId
                    additionalProperties =
                        prepaidCommitCreditedLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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
                        type,
                        timestamp,
                        amount,
                        segmentId,
                        invoiceId,
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

                return /* spotless:off */ other is PrepaidCommitCreditedLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCreditedLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitInitialBalanceLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitInitialBalanceLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitInitialBalanceLedgerEntry: PostpaidCommitInitialBalanceLedgerEntry
                ) = apply {
                    type = postpaidCommitInitialBalanceLedgerEntry.type
                    timestamp = postpaidCommitInitialBalanceLedgerEntry.timestamp
                    amount = postpaidCommitInitialBalanceLedgerEntry.amount
                    additionalProperties =
                        postpaidCommitInitialBalanceLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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
                        type,
                        timestamp,
                        amount,
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

                return /* spotless:off */ other is PostpaidCommitInitialBalanceLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitInitialBalanceLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    invoiceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                        PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                ) = apply {
                    type = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.type
                    timestamp = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.timestamp
                    amount = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.amount
                    segmentId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.segmentId
                    invoiceId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.invoiceId
                    additionalProperties =
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                            .toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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
                        type,
                        timestamp,
                        amount,
                        segmentId,
                        invoiceId,
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

                return /* spotless:off */ other is PostpaidCommitAutomatedInvoiceDeductionLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitAutomatedInvoiceDeductionLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitRolloverLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segment_id")
            @ExcludeMissing
            private val segmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("new_contract_id")
            @ExcludeMissing
            private val newContractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun newContractId(): String = newContractId.getRequired("new_contract_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("segment_id") @ExcludeMissing fun _segmentId() = segmentId

            @JsonProperty("new_contract_id") @ExcludeMissing fun _newContractId() = newContractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitRolloverLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    segmentId()
                    newContractId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var segmentId: JsonField<String> = JsonMissing.of()
                private var newContractId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                ) = apply {
                    type = postpaidCommitRolloverLedgerEntry.type
                    timestamp = postpaidCommitRolloverLedgerEntry.timestamp
                    amount = postpaidCommitRolloverLedgerEntry.amount
                    segmentId = postpaidCommitRolloverLedgerEntry.segmentId
                    newContractId = postpaidCommitRolloverLedgerEntry.newContractId
                    additionalProperties =
                        postpaidCommitRolloverLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun newContractId(newContractId: String) =
                    newContractId(JsonField.of(newContractId))

                fun newContractId(newContractId: JsonField<String>) = apply {
                    this.newContractId = newContractId
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

                fun build(): PostpaidCommitRolloverLedgerEntry =
                    PostpaidCommitRolloverLedgerEntry(
                        type,
                        timestamp,
                        amount,
                        segmentId,
                        newContractId,
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

                return /* spotless:off */ other is PostpaidCommitRolloverLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && newContractId == other.newContractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, newContractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitRolloverLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, newContractId=$newContractId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitTrueupLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitTrueupLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    invoiceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                ) = apply {
                    type = postpaidCommitTrueupLedgerEntry.type
                    timestamp = postpaidCommitTrueupLedgerEntry.timestamp
                    amount = postpaidCommitTrueupLedgerEntry.amount
                    invoiceId = postpaidCommitTrueupLedgerEntry.invoiceId
                    additionalProperties =
                        postpaidCommitTrueupLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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
                        type,
                        timestamp,
                        amount,
                        invoiceId,
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

                return /* spotless:off */ other is PostpaidCommitTrueupLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitTrueupLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitManualLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun reason(): String = reason.getRequired("reason")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitManualLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    reason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry) =
                    apply {
                        type = prepaidCommitManualLedgerEntry.type
                        timestamp = prepaidCommitManualLedgerEntry.timestamp
                        amount = prepaidCommitManualLedgerEntry.amount
                        reason = prepaidCommitManualLedgerEntry.reason
                        additionalProperties =
                            prepaidCommitManualLedgerEntry.additionalProperties.toMutableMap()
                    }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                        type,
                        timestamp,
                        amount,
                        reason,
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

                return /* spotless:off */ other is PrepaidCommitManualLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitManualLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, reason=$reason, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitManualLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            fun reason(): String = reason.getRequired("reason")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitManualLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    reason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                ) = apply {
                    type = postpaidCommitManualLedgerEntry.type
                    timestamp = postpaidCommitManualLedgerEntry.timestamp
                    amount = postpaidCommitManualLedgerEntry.amount
                    reason = postpaidCommitManualLedgerEntry.reason
                    additionalProperties =
                        postpaidCommitManualLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                        type,
                        timestamp,
                        amount,
                        reason,
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

                return /* spotless:off */ other is PostpaidCommitManualLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitManualLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, reason=$reason, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PostpaidCommitExpirationLedgerEntry
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun amount(): Double = amount.getRequired("amount")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitExpirationLedgerEntry = apply {
                if (!validated) {
                    type()
                    timestamp()
                    amount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var amount: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                ) = apply {
                    type = postpaidCommitExpirationLedgerEntry.type
                    timestamp = postpaidCommitExpirationLedgerEntry.timestamp
                    amount = postpaidCommitExpirationLedgerEntry.amount
                    additionalProperties =
                        postpaidCommitExpirationLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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
                        type,
                        timestamp,
                        amount,
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

                return /* spotless:off */ other is PostpaidCommitExpirationLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitExpirationLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, additionalProperties=$additionalProperties}"
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

        @JsonProperty("commit_id") @ExcludeMissing fun _commitId() = commitId

        @JsonProperty("contract_id") @ExcludeMissing fun _contractId() = contractId

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

            private var commitId: JsonField<String> = JsonMissing.of()
            private var contractId: JsonField<String> = JsonMissing.of()
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
                    commitId,
                    contractId,
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

        return /* spotless:off */ other is Commit && id == other.id && contract == other.contract && type == other.type && rateType == other.rateType && name == other.name && priority == other.priority && product == other.product && accessSchedule == other.accessSchedule && invoiceSchedule == other.invoiceSchedule && invoiceContract == other.invoiceContract && rolledOverFrom == other.rolledOverFrom && description == other.description && rolloverFraction == other.rolloverFraction && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && applicableContractIds == other.applicableContractIds && netsuiteSalesOrderId == other.netsuiteSalesOrderId && amount == other.amount && salesforceOpportunityId == other.salesforceOpportunityId && ledger == other.ledger && customFields == other.customFields && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, contract, type, rateType, name, priority, product, accessSchedule, invoiceSchedule, invoiceContract, rolledOverFrom, description, rolloverFraction, applicableProductIds, applicableProductTags, applicableContractIds, netsuiteSalesOrderId, amount, salesforceOpportunityId, ledger, customFields, uniquenessKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Commit{id=$id, contract=$contract, type=$type, rateType=$rateType, name=$name, priority=$priority, product=$product, accessSchedule=$accessSchedule, invoiceSchedule=$invoiceSchedule, invoiceContract=$invoiceContract, rolledOverFrom=$rolledOverFrom, description=$description, rolloverFraction=$rolloverFraction, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, applicableContractIds=$applicableContractIds, netsuiteSalesOrderId=$netsuiteSalesOrderId, amount=$amount, salesforceOpportunityId=$salesforceOpportunityId, ledger=$ledger, customFields=$customFields, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
