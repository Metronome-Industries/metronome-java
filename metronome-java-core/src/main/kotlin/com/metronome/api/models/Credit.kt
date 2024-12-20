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
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Credit.Builder::class)
@NoAutoDetect
class Credit
private constructor(
    private val id: JsonField<String>,
    private val contract: JsonField<Contract>,
    private val type: JsonField<Type>,
    private val name: JsonField<String>,
    private val priority: JsonField<Double>,
    private val product: JsonField<Product>,
    private val accessSchedule: JsonField<ScheduleDuration>,
    private val description: JsonField<String>,
    private val applicableProductIds: JsonField<List<String>>,
    private val applicableProductTags: JsonField<List<String>>,
    private val applicableContractIds: JsonField<List<String>>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val salesforceOpportunityId: JsonField<String>,
    private val ledger: JsonField<List<Ledger>>,
    private val customFields: JsonField<CustomFields>,
    private val rateType: JsonField<RateType>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun id(): String = id.getRequired("id")

    fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

    fun type(): Type = type.getRequired("type")

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

    fun product(): Product = product.getRequired("product")

    /** The schedule that the customer will gain access to the credits. */
    fun accessSchedule(): Optional<ScheduleDuration> =
        Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun applicableProductIds(): Optional<List<String>> =
        Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

    fun applicableProductTags(): Optional<List<String>> =
        Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

    fun applicableContractIds(): Optional<List<String>> =
        Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    /**
     * A list of ordered events that impact the balance of a credit. For example, an invoice
     * deduction or an expiration.
     */
    fun ledger(): Optional<List<Ledger>> = Optional.ofNullable(ledger.getNullable("ledger"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("contract") @ExcludeMissing fun _contract() = contract

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

    @JsonProperty("product") @ExcludeMissing fun _product() = product

    /** The schedule that the customer will gain access to the credits. */
    @JsonProperty("access_schedule") @ExcludeMissing fun _accessSchedule() = accessSchedule

    @JsonProperty("description") @ExcludeMissing fun _description() = description

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

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId() = salesforceOpportunityId

    /**
     * A list of ordered events that impact the balance of a credit. For example, an invoice
     * deduction or an expiration.
     */
    @JsonProperty("ledger") @ExcludeMissing fun _ledger() = ledger

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonProperty("rate_type") @ExcludeMissing fun _rateType() = rateType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Credit = apply {
        if (!validated) {
            id()
            contract().map { it.validate() }
            type()
            name()
            priority()
            product().validate()
            accessSchedule().map { it.validate() }
            description()
            applicableProductIds()
            applicableProductTags()
            applicableContractIds()
            netsuiteSalesOrderId()
            salesforceOpportunityId()
            ledger()
            customFields().map { it.validate() }
            rateType()
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
        private var name: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var product: JsonField<Product> = JsonMissing.of()
        private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var applicableProductIds: JsonField<List<String>> = JsonMissing.of()
        private var applicableProductTags: JsonField<List<String>> = JsonMissing.of()
        private var applicableContractIds: JsonField<List<String>> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var ledger: JsonField<List<Ledger>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(credit: Credit) = apply {
            id = credit.id
            contract = credit.contract
            type = credit.type
            name = credit.name
            priority = credit.priority
            product = credit.product
            accessSchedule = credit.accessSchedule
            description = credit.description
            applicableProductIds = credit.applicableProductIds
            applicableProductTags = credit.applicableProductTags
            applicableContractIds = credit.applicableContractIds
            netsuiteSalesOrderId = credit.netsuiteSalesOrderId
            salesforceOpportunityId = credit.salesforceOpportunityId
            ledger = credit.ledger
            customFields = credit.customFields
            rateType = credit.rateType
            additionalProperties = credit.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun contract(contract: Contract) = contract(JsonField.of(contract))

        @JsonProperty("contract")
        @ExcludeMissing
        fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
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
        @JsonProperty("priority")
        @ExcludeMissing
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun product(product: Product) = product(JsonField.of(product))

        @JsonProperty("product")
        @ExcludeMissing
        fun product(product: JsonField<Product>) = apply { this.product = product }

        /** The schedule that the customer will gain access to the credits. */
        fun accessSchedule(accessSchedule: ScheduleDuration) =
            accessSchedule(JsonField.of(accessSchedule))

        /** The schedule that the customer will gain access to the credits. */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
            this.accessSchedule = accessSchedule
        }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun applicableProductIds(applicableProductIds: List<String>) =
            applicableProductIds(JsonField.of(applicableProductIds))

        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            this.applicableProductIds = applicableProductIds
        }

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags
        }

        fun applicableContractIds(applicableContractIds: List<String>) =
            applicableContractIds(JsonField.of(applicableContractIds))

        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
            this.applicableContractIds = applicableContractIds
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun ledger(ledger: List<Ledger>) = ledger(JsonField.of(ledger))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        @JsonProperty("ledger")
        @ExcludeMissing
        fun ledger(ledger: JsonField<List<Ledger>>) = apply { this.ledger = ledger }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        @JsonProperty("rate_type")
        @ExcludeMissing
        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): Credit =
            Credit(
                id,
                contract,
                type,
                name,
                priority,
                product,
                accessSchedule,
                description,
                applicableProductIds.map { it.toImmutable() },
                applicableProductTags.map { it.toImmutable() },
                applicableContractIds.map { it.toImmutable() },
                netsuiteSalesOrderId,
                salesforceOpportunityId,
                ledger.map { it.toImmutable() },
                customFields,
                rateType,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Product.Builder::class)
    @NoAutoDetect
    class Product
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
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

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            @JvmField val CREDIT = of("CREDIT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
        }

        enum class Value {
            CREDIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
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

    @JsonDeserialize(builder = Contract.Builder::class)
    @NoAutoDetect
    class Contract
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
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

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
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

            @JsonAnySetter
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

    @JsonDeserialize(using = Ledger.Deserializer::class)
    @JsonSerialize(using = Ledger.Serializer::class)
    class Ledger
    private constructor(
        private val creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry? = null,
        private val creditAutomatedInvoiceDeductionLedgerEntry:
            CreditAutomatedInvoiceDeductionLedgerEntry? =
            null,
        private val creditExpirationLedgerEntry: CreditExpirationLedgerEntry? = null,
        private val creditCanceledLedgerEntry: CreditCanceledLedgerEntry? = null,
        private val creditCreditedLedgerEntry: CreditCreditedLedgerEntry? = null,
        private val creditManualLedgerEntry: CreditManualLedgerEntry? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun creditSegmentStartLedgerEntry(): Optional<CreditSegmentStartLedgerEntry> =
            Optional.ofNullable(creditSegmentStartLedgerEntry)

        fun creditAutomatedInvoiceDeductionLedgerEntry():
            Optional<CreditAutomatedInvoiceDeductionLedgerEntry> =
            Optional.ofNullable(creditAutomatedInvoiceDeductionLedgerEntry)

        fun creditExpirationLedgerEntry(): Optional<CreditExpirationLedgerEntry> =
            Optional.ofNullable(creditExpirationLedgerEntry)

        fun creditCanceledLedgerEntry(): Optional<CreditCanceledLedgerEntry> =
            Optional.ofNullable(creditCanceledLedgerEntry)

        fun creditCreditedLedgerEntry(): Optional<CreditCreditedLedgerEntry> =
            Optional.ofNullable(creditCreditedLedgerEntry)

        fun creditManualLedgerEntry(): Optional<CreditManualLedgerEntry> =
            Optional.ofNullable(creditManualLedgerEntry)

        fun isCreditSegmentStartLedgerEntry(): Boolean = creditSegmentStartLedgerEntry != null

        fun isCreditAutomatedInvoiceDeductionLedgerEntry(): Boolean =
            creditAutomatedInvoiceDeductionLedgerEntry != null

        fun isCreditExpirationLedgerEntry(): Boolean = creditExpirationLedgerEntry != null

        fun isCreditCanceledLedgerEntry(): Boolean = creditCanceledLedgerEntry != null

        fun isCreditCreditedLedgerEntry(): Boolean = creditCreditedLedgerEntry != null

        fun isCreditManualLedgerEntry(): Boolean = creditManualLedgerEntry != null

        fun asCreditSegmentStartLedgerEntry(): CreditSegmentStartLedgerEntry =
            creditSegmentStartLedgerEntry.getOrThrow("creditSegmentStartLedgerEntry")

        fun asCreditAutomatedInvoiceDeductionLedgerEntry():
            CreditAutomatedInvoiceDeductionLedgerEntry =
            creditAutomatedInvoiceDeductionLedgerEntry.getOrThrow(
                "creditAutomatedInvoiceDeductionLedgerEntry"
            )

        fun asCreditExpirationLedgerEntry(): CreditExpirationLedgerEntry =
            creditExpirationLedgerEntry.getOrThrow("creditExpirationLedgerEntry")

        fun asCreditCanceledLedgerEntry(): CreditCanceledLedgerEntry =
            creditCanceledLedgerEntry.getOrThrow("creditCanceledLedgerEntry")

        fun asCreditCreditedLedgerEntry(): CreditCreditedLedgerEntry =
            creditCreditedLedgerEntry.getOrThrow("creditCreditedLedgerEntry")

        fun asCreditManualLedgerEntry(): CreditManualLedgerEntry =
            creditManualLedgerEntry.getOrThrow("creditManualLedgerEntry")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                creditSegmentStartLedgerEntry != null ->
                    visitor.visitCreditSegmentStartLedgerEntry(creditSegmentStartLedgerEntry)
                creditAutomatedInvoiceDeductionLedgerEntry != null ->
                    visitor.visitCreditAutomatedInvoiceDeductionLedgerEntry(
                        creditAutomatedInvoiceDeductionLedgerEntry
                    )
                creditExpirationLedgerEntry != null ->
                    visitor.visitCreditExpirationLedgerEntry(creditExpirationLedgerEntry)
                creditCanceledLedgerEntry != null ->
                    visitor.visitCreditCanceledLedgerEntry(creditCanceledLedgerEntry)
                creditCreditedLedgerEntry != null ->
                    visitor.visitCreditCreditedLedgerEntry(creditCreditedLedgerEntry)
                creditManualLedgerEntry != null ->
                    visitor.visitCreditManualLedgerEntry(creditManualLedgerEntry)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Ledger = apply {
            if (!validated) {
                if (
                    creditSegmentStartLedgerEntry == null &&
                        creditAutomatedInvoiceDeductionLedgerEntry == null &&
                        creditExpirationLedgerEntry == null &&
                        creditCanceledLedgerEntry == null &&
                        creditCreditedLedgerEntry == null &&
                        creditManualLedgerEntry == null
                ) {
                    throw MetronomeInvalidDataException("Unknown Ledger: $_json")
                }
                creditSegmentStartLedgerEntry?.validate()
                creditAutomatedInvoiceDeductionLedgerEntry?.validate()
                creditExpirationLedgerEntry?.validate()
                creditCanceledLedgerEntry?.validate()
                creditCreditedLedgerEntry?.validate()
                creditManualLedgerEntry?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ledger && creditSegmentStartLedgerEntry == other.creditSegmentStartLedgerEntry && creditAutomatedInvoiceDeductionLedgerEntry == other.creditAutomatedInvoiceDeductionLedgerEntry && creditExpirationLedgerEntry == other.creditExpirationLedgerEntry && creditCanceledLedgerEntry == other.creditCanceledLedgerEntry && creditCreditedLedgerEntry == other.creditCreditedLedgerEntry && creditManualLedgerEntry == other.creditManualLedgerEntry /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditSegmentStartLedgerEntry, creditAutomatedInvoiceDeductionLedgerEntry, creditExpirationLedgerEntry, creditCanceledLedgerEntry, creditCreditedLedgerEntry, creditManualLedgerEntry) /* spotless:on */

        override fun toString(): String =
            when {
                creditSegmentStartLedgerEntry != null ->
                    "Ledger{creditSegmentStartLedgerEntry=$creditSegmentStartLedgerEntry}"
                creditAutomatedInvoiceDeductionLedgerEntry != null ->
                    "Ledger{creditAutomatedInvoiceDeductionLedgerEntry=$creditAutomatedInvoiceDeductionLedgerEntry}"
                creditExpirationLedgerEntry != null ->
                    "Ledger{creditExpirationLedgerEntry=$creditExpirationLedgerEntry}"
                creditCanceledLedgerEntry != null ->
                    "Ledger{creditCanceledLedgerEntry=$creditCanceledLedgerEntry}"
                creditCreditedLedgerEntry != null ->
                    "Ledger{creditCreditedLedgerEntry=$creditCreditedLedgerEntry}"
                creditManualLedgerEntry != null ->
                    "Ledger{creditManualLedgerEntry=$creditManualLedgerEntry}"
                _json != null -> "Ledger{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Ledger")
            }

        companion object {

            @JvmStatic
            fun ofCreditSegmentStartLedgerEntry(
                creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
            ) = Ledger(creditSegmentStartLedgerEntry = creditSegmentStartLedgerEntry)

            @JvmStatic
            fun ofCreditAutomatedInvoiceDeductionLedgerEntry(
                creditAutomatedInvoiceDeductionLedgerEntry:
                    CreditAutomatedInvoiceDeductionLedgerEntry
            ) =
                Ledger(
                    creditAutomatedInvoiceDeductionLedgerEntry =
                        creditAutomatedInvoiceDeductionLedgerEntry
                )

            @JvmStatic
            fun ofCreditExpirationLedgerEntry(
                creditExpirationLedgerEntry: CreditExpirationLedgerEntry
            ) = Ledger(creditExpirationLedgerEntry = creditExpirationLedgerEntry)

            @JvmStatic
            fun ofCreditCanceledLedgerEntry(creditCanceledLedgerEntry: CreditCanceledLedgerEntry) =
                Ledger(creditCanceledLedgerEntry = creditCanceledLedgerEntry)

            @JvmStatic
            fun ofCreditCreditedLedgerEntry(creditCreditedLedgerEntry: CreditCreditedLedgerEntry) =
                Ledger(creditCreditedLedgerEntry = creditCreditedLedgerEntry)

            @JvmStatic
            fun ofCreditManualLedgerEntry(creditManualLedgerEntry: CreditManualLedgerEntry) =
                Ledger(creditManualLedgerEntry = creditManualLedgerEntry)
        }

        interface Visitor<out T> {

            fun visitCreditSegmentStartLedgerEntry(
                creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
            ): T

            fun visitCreditAutomatedInvoiceDeductionLedgerEntry(
                creditAutomatedInvoiceDeductionLedgerEntry:
                    CreditAutomatedInvoiceDeductionLedgerEntry
            ): T

            fun visitCreditExpirationLedgerEntry(
                creditExpirationLedgerEntry: CreditExpirationLedgerEntry
            ): T

            fun visitCreditCanceledLedgerEntry(
                creditCanceledLedgerEntry: CreditCanceledLedgerEntry
            ): T

            fun visitCreditCreditedLedgerEntry(
                creditCreditedLedgerEntry: CreditCreditedLedgerEntry
            ): T

            fun visitCreditManualLedgerEntry(creditManualLedgerEntry: CreditManualLedgerEntry): T

            fun unknown(json: JsonValue?): T {
                throw MetronomeInvalidDataException("Unknown Ledger: $json")
            }
        }

        class Deserializer : BaseDeserializer<Ledger>(Ledger::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Ledger {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<CreditSegmentStartLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(creditSegmentStartLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreditAutomatedInvoiceDeductionLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(creditAutomatedInvoiceDeductionLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreditExpirationLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(creditExpirationLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreditCanceledLedgerEntry>()) { it.validate() }
                    ?.let {
                        return Ledger(creditCanceledLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreditCreditedLedgerEntry>()) { it.validate() }
                    ?.let {
                        return Ledger(creditCreditedLedgerEntry = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreditManualLedgerEntry>()) { it.validate() }
                    ?.let {
                        return Ledger(creditManualLedgerEntry = it, _json = json)
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
                    value.creditSegmentStartLedgerEntry != null ->
                        generator.writeObject(value.creditSegmentStartLedgerEntry)
                    value.creditAutomatedInvoiceDeductionLedgerEntry != null ->
                        generator.writeObject(value.creditAutomatedInvoiceDeductionLedgerEntry)
                    value.creditExpirationLedgerEntry != null ->
                        generator.writeObject(value.creditExpirationLedgerEntry)
                    value.creditCanceledLedgerEntry != null ->
                        generator.writeObject(value.creditCanceledLedgerEntry)
                    value.creditCreditedLedgerEntry != null ->
                        generator.writeObject(value.creditCreditedLedgerEntry)
                    value.creditManualLedgerEntry != null ->
                        generator.writeObject(value.creditManualLedgerEntry)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Ledger")
                }
            }
        }

        @JsonDeserialize(builder = CreditSegmentStartLedgerEntry.Builder::class)
        @NoAutoDetect
        class CreditSegmentStartLedgerEntry
        private constructor(
            private val type: JsonField<Type>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
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

            fun validate(): CreditSegmentStartLedgerEntry = apply {
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
                internal fun from(creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry) =
                    apply {
                        type = creditSegmentStartLedgerEntry.type
                        timestamp = creditSegmentStartLedgerEntry.timestamp
                        amount = creditSegmentStartLedgerEntry.amount
                        segmentId = creditSegmentStartLedgerEntry.segmentId
                        additionalProperties =
                            creditSegmentStartLedgerEntry.additionalProperties.toMutableMap()
                    }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): CreditSegmentStartLedgerEntry =
                    CreditSegmentStartLedgerEntry(
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

                    @JvmField val CREDIT_SEGMENT_START = of("CREDIT_SEGMENT_START")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CREDIT_SEGMENT_START,
                }

                enum class Value {
                    CREDIT_SEGMENT_START,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT_SEGMENT_START -> Value.CREDIT_SEGMENT_START
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT_SEGMENT_START -> Known.CREDIT_SEGMENT_START
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

                return /* spotless:off */ other is CreditSegmentStartLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditSegmentStartLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CreditAutomatedInvoiceDeductionLedgerEntry.Builder::class)
        @NoAutoDetect
        class CreditAutomatedInvoiceDeductionLedgerEntry
        private constructor(
            private val type: JsonField<Type>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val invoiceId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
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

            fun validate(): CreditAutomatedInvoiceDeductionLedgerEntry = apply {
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
                    creditAutomatedInvoiceDeductionLedgerEntry:
                        CreditAutomatedInvoiceDeductionLedgerEntry
                ) = apply {
                    type = creditAutomatedInvoiceDeductionLedgerEntry.type
                    timestamp = creditAutomatedInvoiceDeductionLedgerEntry.timestamp
                    amount = creditAutomatedInvoiceDeductionLedgerEntry.amount
                    segmentId = creditAutomatedInvoiceDeductionLedgerEntry.segmentId
                    invoiceId = creditAutomatedInvoiceDeductionLedgerEntry.invoiceId
                    additionalProperties =
                        creditAutomatedInvoiceDeductionLedgerEntry.additionalProperties
                            .toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): CreditAutomatedInvoiceDeductionLedgerEntry =
                    CreditAutomatedInvoiceDeductionLedgerEntry(
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
                    val CREDIT_AUTOMATED_INVOICE_DEDUCTION =
                        of("CREDIT_AUTOMATED_INVOICE_DEDUCTION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CREDIT_AUTOMATED_INVOICE_DEDUCTION,
                }

                enum class Value {
                    CREDIT_AUTOMATED_INVOICE_DEDUCTION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Value.CREDIT_AUTOMATED_INVOICE_DEDUCTION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Known.CREDIT_AUTOMATED_INVOICE_DEDUCTION
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

                return /* spotless:off */ other is CreditAutomatedInvoiceDeductionLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditAutomatedInvoiceDeductionLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CreditExpirationLedgerEntry.Builder::class)
        @NoAutoDetect
        class CreditExpirationLedgerEntry
        private constructor(
            private val type: JsonField<Type>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
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

            fun validate(): CreditExpirationLedgerEntry = apply {
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
                internal fun from(creditExpirationLedgerEntry: CreditExpirationLedgerEntry) =
                    apply {
                        type = creditExpirationLedgerEntry.type
                        timestamp = creditExpirationLedgerEntry.timestamp
                        amount = creditExpirationLedgerEntry.amount
                        segmentId = creditExpirationLedgerEntry.segmentId
                        additionalProperties =
                            creditExpirationLedgerEntry.additionalProperties.toMutableMap()
                    }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): CreditExpirationLedgerEntry =
                    CreditExpirationLedgerEntry(
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

                    @JvmField val CREDIT_EXPIRATION = of("CREDIT_EXPIRATION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CREDIT_EXPIRATION,
                }

                enum class Value {
                    CREDIT_EXPIRATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT_EXPIRATION -> Value.CREDIT_EXPIRATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT_EXPIRATION -> Known.CREDIT_EXPIRATION
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

                return /* spotless:off */ other is CreditExpirationLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditExpirationLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CreditCanceledLedgerEntry.Builder::class)
        @NoAutoDetect
        class CreditCanceledLedgerEntry
        private constructor(
            private val type: JsonField<Type>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val invoiceId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
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

            fun validate(): CreditCanceledLedgerEntry = apply {
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
                internal fun from(creditCanceledLedgerEntry: CreditCanceledLedgerEntry) = apply {
                    type = creditCanceledLedgerEntry.type
                    timestamp = creditCanceledLedgerEntry.timestamp
                    amount = creditCanceledLedgerEntry.amount
                    segmentId = creditCanceledLedgerEntry.segmentId
                    invoiceId = creditCanceledLedgerEntry.invoiceId
                    additionalProperties =
                        creditCanceledLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): CreditCanceledLedgerEntry =
                    CreditCanceledLedgerEntry(
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

                    @JvmField val CREDIT_CANCELED = of("CREDIT_CANCELED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CREDIT_CANCELED,
                }

                enum class Value {
                    CREDIT_CANCELED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT_CANCELED -> Value.CREDIT_CANCELED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT_CANCELED -> Known.CREDIT_CANCELED
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

                return /* spotless:off */ other is CreditCanceledLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditCanceledLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CreditCreditedLedgerEntry.Builder::class)
        @NoAutoDetect
        class CreditCreditedLedgerEntry
        private constructor(
            private val type: JsonField<Type>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val invoiceId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
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

            fun validate(): CreditCreditedLedgerEntry = apply {
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
                internal fun from(creditCreditedLedgerEntry: CreditCreditedLedgerEntry) = apply {
                    type = creditCreditedLedgerEntry.type
                    timestamp = creditCreditedLedgerEntry.timestamp
                    amount = creditCreditedLedgerEntry.amount
                    segmentId = creditCreditedLedgerEntry.segmentId
                    invoiceId = creditCreditedLedgerEntry.invoiceId
                    additionalProperties =
                        creditCreditedLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                @JsonProperty("segment_id")
                @ExcludeMissing
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): CreditCreditedLedgerEntry =
                    CreditCreditedLedgerEntry(
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

                    @JvmField val CREDIT_CREDITED = of("CREDIT_CREDITED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CREDIT_CREDITED,
                }

                enum class Value {
                    CREDIT_CREDITED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT_CREDITED -> Value.CREDIT_CREDITED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT_CREDITED -> Known.CREDIT_CREDITED
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

                return /* spotless:off */ other is CreditCreditedLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && segmentId == other.segmentId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, segmentId, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditCreditedLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, segmentId=$segmentId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CreditManualLedgerEntry.Builder::class)
        @NoAutoDetect
        class CreditManualLedgerEntry
        private constructor(
            private val type: JsonField<Type>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val reason: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
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

            fun validate(): CreditManualLedgerEntry = apply {
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
                internal fun from(creditManualLedgerEntry: CreditManualLedgerEntry) = apply {
                    type = creditManualLedgerEntry.type
                    timestamp = creditManualLedgerEntry.timestamp
                    amount = creditManualLedgerEntry.amount
                    reason = creditManualLedgerEntry.reason
                    additionalProperties =
                        creditManualLedgerEntry.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): CreditManualLedgerEntry =
                    CreditManualLedgerEntry(
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

                    @JvmField val CREDIT_MANUAL = of("CREDIT_MANUAL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CREDIT_MANUAL,
                }

                enum class Value {
                    CREDIT_MANUAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT_MANUAL -> Value.CREDIT_MANUAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT_MANUAL -> Known.CREDIT_MANUAL
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

                return /* spotless:off */ other is CreditManualLedgerEntry && type == other.type && timestamp == other.timestamp && amount == other.amount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, timestamp, amount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditManualLedgerEntry{type=$type, timestamp=$timestamp, amount=$amount, reason=$reason, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Credit && id == other.id && contract == other.contract && type == other.type && name == other.name && priority == other.priority && product == other.product && accessSchedule == other.accessSchedule && description == other.description && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && applicableContractIds == other.applicableContractIds && netsuiteSalesOrderId == other.netsuiteSalesOrderId && salesforceOpportunityId == other.salesforceOpportunityId && ledger == other.ledger && customFields == other.customFields && rateType == other.rateType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, contract, type, name, priority, product, accessSchedule, description, applicableProductIds, applicableProductTags, applicableContractIds, netsuiteSalesOrderId, salesforceOpportunityId, ledger, customFields, rateType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Credit{id=$id, contract=$contract, type=$type, name=$name, priority=$priority, product=$product, accessSchedule=$accessSchedule, description=$description, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, applicableContractIds=$applicableContractIds, netsuiteSalesOrderId=$netsuiteSalesOrderId, salesforceOpportunityId=$salesforceOpportunityId, ledger=$ledger, customFields=$customFields, rateType=$rateType, additionalProperties=$additionalProperties}"
}
