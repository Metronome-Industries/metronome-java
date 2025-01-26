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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Credit
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
    @JsonProperty("applicable_contract_ids")
    @ExcludeMissing
    private val applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applicable_product_ids")
    @ExcludeMissing
    private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("balance")
    @ExcludeMissing
    private val balance: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("contract")
    @ExcludeMissing
    private val contract: JsonField<Contract> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
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

    /** The schedule that the customer will gain access to the credits. */
    fun accessSchedule(): Optional<ScheduleDuration> =
        Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

    fun applicableContractIds(): Optional<List<String>> =
        Optional.ofNullable(applicableContractIds.getNullable("applicable_contract_ids"))

    fun applicableProductIds(): Optional<List<String>> =
        Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

    fun applicableProductTags(): Optional<List<String>> =
        Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

    /**
     * The current balance of the credit or commit. This balance reflects the amount of credit or
     * commit that the customer has access to use at this moment - thus, expired and upcoming credit
     * or commit segments contribute 0 to the balance. The balance will match the sum of all ledger
     * entries with the exception of the case where the sum of negative manual ledger entries
     * exceeds the positive amount remaining on the credit or commit - in that case, the balance
     * will be 0. All manual ledger entries associated with active credit or commit segments are
     * included in the balance, including future-dated manual ledger entries.
     */
    fun balance(): Optional<Double> = Optional.ofNullable(balance.getNullable("balance"))

    fun contract(): Optional<Contract> = Optional.ofNullable(contract.getNullable("contract"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * A list of ordered events that impact the balance of a credit. For example, an invoice
     * deduction or an expiration.
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

    /** The schedule that the customer will gain access to the credits. */
    @JsonProperty("access_schedule")
    @ExcludeMissing
    fun _accessSchedule(): JsonField<ScheduleDuration> = accessSchedule

    @JsonProperty("applicable_contract_ids")
    @ExcludeMissing
    fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

    @JsonProperty("applicable_product_ids")
    @ExcludeMissing
    fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

    /**
     * The current balance of the credit or commit. This balance reflects the amount of credit or
     * commit that the customer has access to use at this moment - thus, expired and upcoming credit
     * or commit segments contribute 0 to the balance. The balance will match the sum of all ledger
     * entries with the exception of the case where the sum of negative manual ledger entries
     * exceeds the positive amount remaining on the credit or commit - in that case, the balance
     * will be 0. All manual ledger entries associated with active credit or commit segments are
     * included in the balance, including future-dated manual ledger entries.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

    @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * A list of ordered events that impact the balance of a credit. For example, an invoice
     * deduction or an expiration.
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

    fun validate(): Credit = apply {
        if (validated) {
            return@apply
        }

        id()
        product().validate()
        type()
        accessSchedule().ifPresent { it.validate() }
        applicableContractIds()
        applicableProductIds()
        applicableProductTags()
        balance()
        contract().ifPresent { it.validate() }
        customFields().ifPresent { it.validate() }
        description()
        ledger().ifPresent { it.forEach { it.validate() } }
        name()
        netsuiteSalesOrderId()
        priority()
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

        private var id: JsonField<String>? = null
        private var product: JsonField<Product>? = null
        private var type: JsonField<Type>? = null
        private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
        private var applicableContractIds: JsonField<MutableList<String>>? = null
        private var applicableProductIds: JsonField<MutableList<String>>? = null
        private var applicableProductTags: JsonField<MutableList<String>>? = null
        private var balance: JsonField<Double> = JsonMissing.of()
        private var contract: JsonField<Contract> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var ledger: JsonField<MutableList<Ledger>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(credit: Credit) = apply {
            id = credit.id
            product = credit.product
            type = credit.type
            accessSchedule = credit.accessSchedule
            applicableContractIds = credit.applicableContractIds.map { it.toMutableList() }
            applicableProductIds = credit.applicableProductIds.map { it.toMutableList() }
            applicableProductTags = credit.applicableProductTags.map { it.toMutableList() }
            balance = credit.balance
            contract = credit.contract
            customFields = credit.customFields
            description = credit.description
            ledger = credit.ledger.map { it.toMutableList() }
            name = credit.name
            netsuiteSalesOrderId = credit.netsuiteSalesOrderId
            priority = credit.priority
            rateType = credit.rateType
            salesforceOpportunityId = credit.salesforceOpportunityId
            uniquenessKey = credit.uniquenessKey
            additionalProperties = credit.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The schedule that the customer will gain access to the credits. */
        fun accessSchedule(accessSchedule: ScheduleDuration) =
            accessSchedule(JsonField.of(accessSchedule))

        /** The schedule that the customer will gain access to the credits. */
        fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
            this.accessSchedule = accessSchedule
        }

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

        /**
         * The current balance of the credit or commit. This balance reflects the amount of credit
         * or commit that the customer has access to use at this moment - thus, expired and upcoming
         * credit or commit segments contribute 0 to the balance. The balance will match the sum of
         * all ledger entries with the exception of the case where the sum of negative manual ledger
         * entries exceeds the positive amount remaining on the credit or commit - in that case, the
         * balance will be 0. All manual ledger entries associated with active credit or commit
         * segments are included in the balance, including future-dated manual ledger entries.
         */
        fun balance(balance: Double) = balance(JsonField.of(balance))

        /**
         * The current balance of the credit or commit. This balance reflects the amount of credit
         * or commit that the customer has access to use at this moment - thus, expired and upcoming
         * credit or commit segments contribute 0 to the balance. The balance will match the sum of
         * all ledger entries with the exception of the case where the sum of negative manual ledger
         * entries exceeds the positive amount remaining on the credit or commit - in that case, the
         * balance will be 0. All manual ledger entries associated with active credit or commit
         * segments are included in the balance, including future-dated manual ledger entries.
         */
        fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

        fun contract(contract: Contract) = contract(JsonField.of(contract))

        fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun ledger(ledger: List<Ledger>) = ledger(JsonField.of(ledger))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun ledger(ledger: JsonField<List<Ledger>>) = apply {
            this.ledger = ledger.map { it.toMutableList() }
        }

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
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

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun addLedger(creditSegmentStartLedgerEntry: Ledger.CreditSegmentStartLedgerEntry) =
            addLedger(Ledger.ofCreditSegmentStartLedgerEntry(creditSegmentStartLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun addLedger(
            creditAutomatedInvoiceDeductionLedgerEntry:
                Ledger.CreditAutomatedInvoiceDeductionLedgerEntry
        ) =
            addLedger(
                Ledger.ofCreditAutomatedInvoiceDeductionLedgerEntry(
                    creditAutomatedInvoiceDeductionLedgerEntry
                )
            )

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun addLedger(creditExpirationLedgerEntry: Ledger.CreditExpirationLedgerEntry) =
            addLedger(Ledger.ofCreditExpirationLedgerEntry(creditExpirationLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun addLedger(creditCanceledLedgerEntry: Ledger.CreditCanceledLedgerEntry) =
            addLedger(Ledger.ofCreditCanceledLedgerEntry(creditCanceledLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun addLedger(creditCreditedLedgerEntry: Ledger.CreditCreditedLedgerEntry) =
            addLedger(Ledger.ofCreditCreditedLedgerEntry(creditCreditedLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
         */
        fun addLedger(creditManualLedgerEntry: Ledger.CreditManualLedgerEntry) =
            addLedger(Ledger.ofCreditManualLedgerEntry(creditManualLedgerEntry))

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

        fun build(): Credit =
            Credit(
                checkRequired("id", id),
                checkRequired("product", product),
                checkRequired("type", type),
                accessSchedule,
                (applicableContractIds ?: JsonMissing.of()).map { it.toImmutable() },
                (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                balance,
                contract,
                customFields,
                description,
                (ledger ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                netsuiteSalesOrderId,
                priority,
                rateType,
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
            if (validated) {
                return@apply
            }

            id()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

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
                    checkRequired("id", id),
                    checkRequired("name", name),
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
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

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
                Contract(checkRequired("id", id), additionalProperties.toImmutable())
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

        private var validated: Boolean = false

        fun validate(): Ledger = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCreditSegmentStartLedgerEntry(
                        creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
                    ) {
                        creditSegmentStartLedgerEntry.validate()
                    }

                    override fun visitCreditAutomatedInvoiceDeductionLedgerEntry(
                        creditAutomatedInvoiceDeductionLedgerEntry:
                            CreditAutomatedInvoiceDeductionLedgerEntry
                    ) {
                        creditAutomatedInvoiceDeductionLedgerEntry.validate()
                    }

                    override fun visitCreditExpirationLedgerEntry(
                        creditExpirationLedgerEntry: CreditExpirationLedgerEntry
                    ) {
                        creditExpirationLedgerEntry.validate()
                    }

                    override fun visitCreditCanceledLedgerEntry(
                        creditCanceledLedgerEntry: CreditCanceledLedgerEntry
                    ) {
                        creditCanceledLedgerEntry.validate()
                    }

                    override fun visitCreditCreditedLedgerEntry(
                        creditCreditedLedgerEntry: CreditCreditedLedgerEntry
                    ) {
                        creditCreditedLedgerEntry.validate()
                    }

                    override fun visitCreditManualLedgerEntry(
                        creditManualLedgerEntry: CreditManualLedgerEntry
                    ) {
                        creditManualLedgerEntry.validate()
                    }
                }
            )
            validated = true
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

        internal class Deserializer : BaseDeserializer<Ledger>(Ledger::class) {

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

        internal class Serializer : BaseSerializer<Ledger>(Ledger::class) {

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

        @NoAutoDetect
        class CreditSegmentStartLedgerEntry
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

            fun validate(): CreditSegmentStartLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                segmentId()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry) =
                    apply {
                        amount = creditSegmentStartLedgerEntry.amount
                        segmentId = creditSegmentStartLedgerEntry.segmentId
                        timestamp = creditSegmentStartLedgerEntry.timestamp
                        type = creditSegmentStartLedgerEntry.type
                        additionalProperties =
                            creditSegmentStartLedgerEntry.additionalProperties.toMutableMap()
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

                fun build(): CreditSegmentStartLedgerEntry =
                    CreditSegmentStartLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
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

                return /* spotless:off */ other is CreditSegmentStartLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditSegmentStartLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreditAutomatedInvoiceDeductionLedgerEntry
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

            fun validate(): CreditAutomatedInvoiceDeductionLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    creditAutomatedInvoiceDeductionLedgerEntry:
                        CreditAutomatedInvoiceDeductionLedgerEntry
                ) = apply {
                    amount = creditAutomatedInvoiceDeductionLedgerEntry.amount
                    invoiceId = creditAutomatedInvoiceDeductionLedgerEntry.invoiceId
                    segmentId = creditAutomatedInvoiceDeductionLedgerEntry.segmentId
                    timestamp = creditAutomatedInvoiceDeductionLedgerEntry.timestamp
                    type = creditAutomatedInvoiceDeductionLedgerEntry.type
                    additionalProperties =
                        creditAutomatedInvoiceDeductionLedgerEntry.additionalProperties
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

                fun build(): CreditAutomatedInvoiceDeductionLedgerEntry =
                    CreditAutomatedInvoiceDeductionLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
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

                return /* spotless:off */ other is CreditAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreditExpirationLedgerEntry
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

            fun validate(): CreditExpirationLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                segmentId()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditExpirationLedgerEntry: CreditExpirationLedgerEntry) =
                    apply {
                        amount = creditExpirationLedgerEntry.amount
                        segmentId = creditExpirationLedgerEntry.segmentId
                        timestamp = creditExpirationLedgerEntry.timestamp
                        type = creditExpirationLedgerEntry.type
                        additionalProperties =
                            creditExpirationLedgerEntry.additionalProperties.toMutableMap()
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

                fun build(): CreditExpirationLedgerEntry =
                    CreditExpirationLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
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

                return /* spotless:off */ other is CreditExpirationLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditExpirationLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreditCanceledLedgerEntry
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

            fun validate(): CreditCanceledLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditCanceledLedgerEntry: CreditCanceledLedgerEntry) = apply {
                    amount = creditCanceledLedgerEntry.amount
                    invoiceId = creditCanceledLedgerEntry.invoiceId
                    segmentId = creditCanceledLedgerEntry.segmentId
                    timestamp = creditCanceledLedgerEntry.timestamp
                    type = creditCanceledLedgerEntry.type
                    additionalProperties =
                        creditCanceledLedgerEntry.additionalProperties.toMutableMap()
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

                fun build(): CreditCanceledLedgerEntry =
                    CreditCanceledLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
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

                return /* spotless:off */ other is CreditCanceledLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditCanceledLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreditCreditedLedgerEntry
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

            fun validate(): CreditCreditedLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditCreditedLedgerEntry: CreditCreditedLedgerEntry) = apply {
                    amount = creditCreditedLedgerEntry.amount
                    invoiceId = creditCreditedLedgerEntry.invoiceId
                    segmentId = creditCreditedLedgerEntry.segmentId
                    timestamp = creditCreditedLedgerEntry.timestamp
                    type = creditCreditedLedgerEntry.type
                    additionalProperties =
                        creditCreditedLedgerEntry.additionalProperties.toMutableMap()
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

                fun build(): CreditCreditedLedgerEntry =
                    CreditCreditedLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
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

                return /* spotless:off */ other is CreditCreditedLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditCreditedLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreditManualLedgerEntry
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

            fun validate(): CreditManualLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                reason()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var reason: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditManualLedgerEntry: CreditManualLedgerEntry) = apply {
                    amount = creditManualLedgerEntry.amount
                    reason = creditManualLedgerEntry.reason
                    timestamp = creditManualLedgerEntry.timestamp
                    type = creditManualLedgerEntry.type
                    additionalProperties =
                        creditManualLedgerEntry.additionalProperties.toMutableMap()
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

                fun build(): CreditManualLedgerEntry =
                    CreditManualLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("reason", reason),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
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

                return /* spotless:off */ other is CreditManualLedgerEntry && amount == other.amount && reason == other.reason && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, reason, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is Credit && id == other.id && product == other.product && type == other.type && accessSchedule == other.accessSchedule && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && balance == other.balance && contract == other.contract && customFields == other.customFields && description == other.description && ledger == other.ledger && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && salesforceOpportunityId == other.salesforceOpportunityId && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, product, type, accessSchedule, applicableContractIds, applicableProductIds, applicableProductTags, balance, contract, customFields, description, ledger, name, netsuiteSalesOrderId, priority, rateType, salesforceOpportunityId, uniquenessKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Credit{id=$id, product=$product, type=$type, accessSchedule=$accessSchedule, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, balance=$balance, contract=$contract, customFields=$customFields, description=$description, ledger=$ledger, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, salesforceOpportunityId=$salesforceOpportunityId, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
