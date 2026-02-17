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
class Commit
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
    @JsonProperty("archived_at")
    @ExcludeMissing
    private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
    @JsonProperty("hierarchy_configuration")
    @ExcludeMissing
    private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> = JsonMissing.of(),
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
    @JsonProperty("recurring_commit_id")
    @ExcludeMissing
    private val recurringCommitId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("rolled_over_from")
    @ExcludeMissing
    private val rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of(),
    @JsonProperty("rollover_fraction")
    @ExcludeMissing
    private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("specifiers")
    @ExcludeMissing
    private val specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
    @JsonProperty("subscription_config")
    @ExcludeMissing
    private val subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of(),
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    private val uniquenessKey: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * Timestamp of when the commit was created.
     * - Recurring commits: latter of commit service period date and parent commit start date
     * - Rollover commits: when the new contract started
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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

    /**
     * RFC 3339 timestamp indicating when the commit was archived. If not provided, the commit is
     * not archived.
     */
    fun archivedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(archivedAt.getNullable("archived_at"))

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

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Optional configuration for commit hierarchy access control */
    fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
        Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

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

    /** The ID of the recurring commit that this commit was generated from, if applicable. */
    fun recurringCommitId(): Optional<String> =
        Optional.ofNullable(recurringCommitId.getNullable("recurring_commit_id"))

    fun rolledOverFrom(): Optional<RolledOverFrom> =
        Optional.ofNullable(rolledOverFrom.getNullable("rolled_over_from"))

    fun rolloverFraction(): Optional<Double> =
        Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    /**
     * List of filters that determine what kind of customer usage draws down a commit or credit. A
     * customer's usage needs to meet the condition of at least one of the specifiers to contribute
     * to a commit's or credit's drawdown.
     */
    fun specifiers(): Optional<List<CommitSpecifier>> =
        Optional.ofNullable(specifiers.getNullable("specifiers"))

    /**
     * The subscription configuration for this commit, if it was generated from a recurring commit
     * with a subscription attached.
     */
    fun subscriptionConfig(): Optional<SubscriptionConfig> =
        Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     */
    fun uniquenessKey(): Optional<String> =
        Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Timestamp of when the commit was created.
     * - Recurring commits: latter of commit service period date and parent commit start date
     * - Rollover commits: when the new contract started
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

    /**
     * RFC 3339 timestamp indicating when the commit was archived. If not provided, the commit is
     * not archived.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

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

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** Optional configuration for commit hierarchy access control */
    @JsonProperty("hierarchy_configuration")
    @ExcludeMissing
    fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> = hierarchyConfiguration

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

    /** The ID of the recurring commit that this commit was generated from, if applicable. */
    @JsonProperty("recurring_commit_id")
    @ExcludeMissing
    fun _recurringCommitId(): JsonField<String> = recurringCommitId

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
     * List of filters that determine what kind of customer usage draws down a commit or credit. A
     * customer's usage needs to meet the condition of at least one of the specifiers to contribute
     * to a commit's or credit's drawdown.
     */
    @JsonProperty("specifiers")
    @ExcludeMissing
    fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

    /**
     * The subscription configuration for this commit, if it was generated from a recurring commit
     * with a subscription attached.
     */
    @JsonProperty("subscription_config")
    @ExcludeMissing
    fun _subscriptionConfig(): JsonField<SubscriptionConfig> = subscriptionConfig

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
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        product().validate()
        type()
        accessSchedule().ifPresent { it.validate() }
        amount()
        applicableContractIds()
        applicableProductIds()
        applicableProductTags()
        archivedAt()
        balance()
        contract().ifPresent { it.validate() }
        customFields().ifPresent { it.validate() }
        description()
        hierarchyConfiguration().ifPresent { it.validate() }
        invoiceContract().ifPresent { it.validate() }
        invoiceSchedule().ifPresent { it.validate() }
        ledger().ifPresent { it.forEach { it.validate() } }
        name()
        netsuiteSalesOrderId()
        priority()
        rateType()
        recurringCommitId()
        rolledOverFrom().ifPresent { it.validate() }
        rolloverFraction()
        salesforceOpportunityId()
        specifiers().ifPresent { it.forEach { it.validate() } }
        subscriptionConfig().ifPresent { it.validate() }
        uniquenessKey()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Commit]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var product: JsonField<Product>? = null
        private var type: JsonField<Type>? = null
        private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
        private var amount: JsonField<Double> = JsonMissing.of()
        private var applicableContractIds: JsonField<MutableList<String>>? = null
        private var applicableProductIds: JsonField<MutableList<String>>? = null
        private var applicableProductTags: JsonField<MutableList<String>>? = null
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var balance: JsonField<Double> = JsonMissing.of()
        private var contract: JsonField<Contract> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
            JsonMissing.of()
        private var invoiceContract: JsonField<InvoiceContract> = JsonMissing.of()
        private var invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of()
        private var ledger: JsonField<MutableList<Ledger>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var recurringCommitId: JsonField<String> = JsonMissing.of()
        private var rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of()
        private var rolloverFraction: JsonField<Double> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
        private var subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of()
        private var uniquenessKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commit: Commit) = apply {
            id = commit.id
            createdAt = commit.createdAt
            product = commit.product
            type = commit.type
            accessSchedule = commit.accessSchedule
            amount = commit.amount
            applicableContractIds = commit.applicableContractIds.map { it.toMutableList() }
            applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
            applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
            archivedAt = commit.archivedAt
            balance = commit.balance
            contract = commit.contract
            customFields = commit.customFields
            description = commit.description
            hierarchyConfiguration = commit.hierarchyConfiguration
            invoiceContract = commit.invoiceContract
            invoiceSchedule = commit.invoiceSchedule
            ledger = commit.ledger.map { it.toMutableList() }
            name = commit.name
            netsuiteSalesOrderId = commit.netsuiteSalesOrderId
            priority = commit.priority
            rateType = commit.rateType
            recurringCommitId = commit.recurringCommitId
            rolledOverFrom = commit.rolledOverFrom
            rolloverFraction = commit.rolloverFraction
            salesforceOpportunityId = commit.salesforceOpportunityId
            specifiers = commit.specifiers.map { it.toMutableList() }
            subscriptionConfig = commit.subscriptionConfig
            uniquenessKey = commit.uniquenessKey
            additionalProperties = commit.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Timestamp of when the commit was created.
         * - Recurring commits: latter of commit service period date and parent commit start date
         * - Rollover commits: when the new contract started
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Timestamp of when the commit was created.
         * - Recurring commits: latter of commit service period date and parent commit start date
         * - Rollover commits: when the new contract started
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /**
         * RFC 3339 timestamp indicating when the commit was archived. If not provided, the commit
         * is not archived.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * RFC 3339 timestamp indicating when the commit was archived. If not provided, the commit
         * is not archived.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
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

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Optional configuration for commit hierarchy access control */
        fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
            hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

        /** Optional configuration for commit hierarchy access control */
        fun hierarchyConfiguration(
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
        ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

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

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(
            prepaidCommitSegmentStartLedgerEntry: Ledger.PrepaidCommitSegmentStartLedgerEntry
        ) =
            addLedger(
                Ledger.ofPrepaidCommitSegmentStartLedgerEntry(prepaidCommitSegmentStartLedgerEntry)
            )

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(
            prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                Ledger.PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
        ) =
            addLedger(
                Ledger.ofPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                    prepaidCommitAutomatedInvoiceDeductionLedgerEntry
                )
            )

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(prepaidCommitRolloverLedgerEntry: Ledger.PrepaidCommitRolloverLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitRolloverLedgerEntry(prepaidCommitRolloverLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(
            prepaidCommitExpirationLedgerEntry: Ledger.PrepaidCommitExpirationLedgerEntry
        ) =
            addLedger(
                Ledger.ofPrepaidCommitExpirationLedgerEntry(prepaidCommitExpirationLedgerEntry)
            )

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(prepaidCommitCanceledLedgerEntry: Ledger.PrepaidCommitCanceledLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitCanceledLedgerEntry(prepaidCommitCanceledLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(prepaidCommitCreditedLedgerEntry: Ledger.PrepaidCommitCreditedLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitCreditedLedgerEntry(prepaidCommitCreditedLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(
            prepaidCommitSeatBasedAdjustmentLedgerEntry:
                Ledger.PrepaidCommitSeatBasedAdjustmentLedgerEntry
        ) =
            addLedger(
                Ledger.ofPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                    prepaidCommitSeatBasedAdjustmentLedgerEntry
                )
            )

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(
            postpaidCommitInitialBalanceLedgerEntry: Ledger.PostpaidCommitInitialBalanceLedgerEntry
        ) =
            addLedger(
                Ledger.ofPostpaidCommitInitialBalanceLedgerEntry(
                    postpaidCommitInitialBalanceLedgerEntry
                )
            )

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(
            postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                Ledger.PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
        ) =
            addLedger(
                Ledger.ofPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                    postpaidCommitAutomatedInvoiceDeductionLedgerEntry
                )
            )

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(postpaidCommitRolloverLedgerEntry: Ledger.PostpaidCommitRolloverLedgerEntry) =
            addLedger(Ledger.ofPostpaidCommitRolloverLedgerEntry(postpaidCommitRolloverLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(postpaidCommitTrueupLedgerEntry: Ledger.PostpaidCommitTrueupLedgerEntry) =
            addLedger(Ledger.ofPostpaidCommitTrueupLedgerEntry(postpaidCommitTrueupLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(prepaidCommitManualLedgerEntry: Ledger.PrepaidCommitManualLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitManualLedgerEntry(prepaidCommitManualLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(postpaidCommitManualLedgerEntry: Ledger.PostpaidCommitManualLedgerEntry) =
            addLedger(Ledger.ofPostpaidCommitManualLedgerEntry(postpaidCommitManualLedgerEntry))

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun addLedger(
            postpaidCommitExpirationLedgerEntry: Ledger.PostpaidCommitExpirationLedgerEntry
        ) =
            addLedger(
                Ledger.ofPostpaidCommitExpirationLedgerEntry(postpaidCommitExpirationLedgerEntry)
            )

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

        /** The ID of the recurring commit that this commit was generated from, if applicable. */
        fun recurringCommitId(recurringCommitId: String) =
            recurringCommitId(JsonField.of(recurringCommitId))

        /** The ID of the recurring commit that this commit was generated from, if applicable. */
        fun recurringCommitId(recurringCommitId: JsonField<String>) = apply {
            this.recurringCommitId = recurringCommitId
        }

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
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown.
         */
        fun specifiers(specifiers: List<CommitSpecifier>) = specifiers(JsonField.of(specifiers))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown.
         */
        fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
            this.specifiers = specifiers.map { it.toMutableList() }
        }

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown.
         */
        fun addSpecifier(specifier: CommitSpecifier) = apply {
            specifiers =
                (specifiers ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(specifier)
                }
        }

        /**
         * The subscription configuration for this commit, if it was generated from a recurring
         * commit with a subscription attached.
         */
        fun subscriptionConfig(subscriptionConfig: SubscriptionConfig) =
            subscriptionConfig(JsonField.of(subscriptionConfig))

        /**
         * The subscription configuration for this commit, if it was generated from a recurring
         * commit with a subscription attached.
         */
        fun subscriptionConfig(subscriptionConfig: JsonField<SubscriptionConfig>) = apply {
            this.subscriptionConfig = subscriptionConfig
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
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("product", product),
                checkRequired("type", type),
                accessSchedule,
                amount,
                (applicableContractIds ?: JsonMissing.of()).map { it.toImmutable() },
                (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                archivedAt,
                balance,
                contract,
                customFields,
                description,
                hierarchyConfiguration,
                invoiceContract,
                invoiceSchedule,
                (ledger ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                netsuiteSalesOrderId,
                priority,
                rateType,
                recurringCommitId,
                rolledOverFrom,
                rolloverFraction,
                salesforceOpportunityId,
                (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                subscriptionConfig,
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

        /** A builder for [Product]. */
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

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

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

        /** A builder for [Contract]. */
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

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        /** A builder for [InvoiceContract]. */
        class Builder internal constructor() {

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
                InvoiceContract(checkRequired("id", id), additionalProperties.toImmutable())
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
        private val prepaidCommitSeatBasedAdjustmentLedgerEntry:
            PrepaidCommitSeatBasedAdjustmentLedgerEntry? =
            null,
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

        fun prepaidCommitSeatBasedAdjustmentLedgerEntry():
            Optional<PrepaidCommitSeatBasedAdjustmentLedgerEntry> =
            Optional.ofNullable(prepaidCommitSeatBasedAdjustmentLedgerEntry)

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

        fun isPrepaidCommitSeatBasedAdjustmentLedgerEntry(): Boolean =
            prepaidCommitSeatBasedAdjustmentLedgerEntry != null

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

        fun asPrepaidCommitSeatBasedAdjustmentLedgerEntry():
            PrepaidCommitSeatBasedAdjustmentLedgerEntry =
            prepaidCommitSeatBasedAdjustmentLedgerEntry.getOrThrow(
                "prepaidCommitSeatBasedAdjustmentLedgerEntry"
            )

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
                prepaidCommitSeatBasedAdjustmentLedgerEntry != null ->
                    visitor.visitPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                        prepaidCommitSeatBasedAdjustmentLedgerEntry
                    )
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

        private var validated: Boolean = false

        fun validate(): Ledger = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPrepaidCommitSegmentStartLedgerEntry(
                        prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
                    ) {
                        prepaidCommitSegmentStartLedgerEntry.validate()
                    }

                    override fun visitPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                            PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                    ) {
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry.validate()
                    }

                    override fun visitPrepaidCommitRolloverLedgerEntry(
                        prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                    ) {
                        prepaidCommitRolloverLedgerEntry.validate()
                    }

                    override fun visitPrepaidCommitExpirationLedgerEntry(
                        prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                    ) {
                        prepaidCommitExpirationLedgerEntry.validate()
                    }

                    override fun visitPrepaidCommitCanceledLedgerEntry(
                        prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                    ) {
                        prepaidCommitCanceledLedgerEntry.validate()
                    }

                    override fun visitPrepaidCommitCreditedLedgerEntry(
                        prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                    ) {
                        prepaidCommitCreditedLedgerEntry.validate()
                    }

                    override fun visitPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                        prepaidCommitSeatBasedAdjustmentLedgerEntry:
                            PrepaidCommitSeatBasedAdjustmentLedgerEntry
                    ) {
                        prepaidCommitSeatBasedAdjustmentLedgerEntry.validate()
                    }

                    override fun visitPostpaidCommitInitialBalanceLedgerEntry(
                        postpaidCommitInitialBalanceLedgerEntry:
                            PostpaidCommitInitialBalanceLedgerEntry
                    ) {
                        postpaidCommitInitialBalanceLedgerEntry.validate()
                    }

                    override fun visitPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                            PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                    ) {
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry.validate()
                    }

                    override fun visitPostpaidCommitRolloverLedgerEntry(
                        postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                    ) {
                        postpaidCommitRolloverLedgerEntry.validate()
                    }

                    override fun visitPostpaidCommitTrueupLedgerEntry(
                        postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                    ) {
                        postpaidCommitTrueupLedgerEntry.validate()
                    }

                    override fun visitPrepaidCommitManualLedgerEntry(
                        prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
                    ) {
                        prepaidCommitManualLedgerEntry.validate()
                    }

                    override fun visitPostpaidCommitManualLedgerEntry(
                        postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                    ) {
                        postpaidCommitManualLedgerEntry.validate()
                    }

                    override fun visitPostpaidCommitExpirationLedgerEntry(
                        postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                    ) {
                        postpaidCommitExpirationLedgerEntry.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ledger && prepaidCommitSegmentStartLedgerEntry == other.prepaidCommitSegmentStartLedgerEntry && prepaidCommitAutomatedInvoiceDeductionLedgerEntry == other.prepaidCommitAutomatedInvoiceDeductionLedgerEntry && prepaidCommitRolloverLedgerEntry == other.prepaidCommitRolloverLedgerEntry && prepaidCommitExpirationLedgerEntry == other.prepaidCommitExpirationLedgerEntry && prepaidCommitCanceledLedgerEntry == other.prepaidCommitCanceledLedgerEntry && prepaidCommitCreditedLedgerEntry == other.prepaidCommitCreditedLedgerEntry && prepaidCommitSeatBasedAdjustmentLedgerEntry == other.prepaidCommitSeatBasedAdjustmentLedgerEntry && postpaidCommitInitialBalanceLedgerEntry == other.postpaidCommitInitialBalanceLedgerEntry && postpaidCommitAutomatedInvoiceDeductionLedgerEntry == other.postpaidCommitAutomatedInvoiceDeductionLedgerEntry && postpaidCommitRolloverLedgerEntry == other.postpaidCommitRolloverLedgerEntry && postpaidCommitTrueupLedgerEntry == other.postpaidCommitTrueupLedgerEntry && prepaidCommitManualLedgerEntry == other.prepaidCommitManualLedgerEntry && postpaidCommitManualLedgerEntry == other.postpaidCommitManualLedgerEntry && postpaidCommitExpirationLedgerEntry == other.postpaidCommitExpirationLedgerEntry /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(prepaidCommitSegmentStartLedgerEntry, prepaidCommitAutomatedInvoiceDeductionLedgerEntry, prepaidCommitRolloverLedgerEntry, prepaidCommitExpirationLedgerEntry, prepaidCommitCanceledLedgerEntry, prepaidCommitCreditedLedgerEntry, prepaidCommitSeatBasedAdjustmentLedgerEntry, postpaidCommitInitialBalanceLedgerEntry, postpaidCommitAutomatedInvoiceDeductionLedgerEntry, postpaidCommitRolloverLedgerEntry, postpaidCommitTrueupLedgerEntry, prepaidCommitManualLedgerEntry, postpaidCommitManualLedgerEntry, postpaidCommitExpirationLedgerEntry) /* spotless:on */

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
                prepaidCommitSeatBasedAdjustmentLedgerEntry != null ->
                    "Ledger{prepaidCommitSeatBasedAdjustmentLedgerEntry=$prepaidCommitSeatBasedAdjustmentLedgerEntry}"
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
            fun ofPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                prepaidCommitSeatBasedAdjustmentLedgerEntry:
                    PrepaidCommitSeatBasedAdjustmentLedgerEntry
            ) =
                Ledger(
                    prepaidCommitSeatBasedAdjustmentLedgerEntry =
                        prepaidCommitSeatBasedAdjustmentLedgerEntry
                )

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

        /** An interface that defines how to map each variant of [Ledger] to a value of type [T]. */
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

            fun visitPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                prepaidCommitSeatBasedAdjustmentLedgerEntry:
                    PrepaidCommitSeatBasedAdjustmentLedgerEntry
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

            /**
             * Maps an unknown variant of [Ledger] to a value of type [T].
             *
             * An instance of [Ledger] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws MetronomeInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw MetronomeInvalidDataException("Unknown Ledger: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Ledger>(Ledger::class) {

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
                        jacksonTypeRef<PrepaidCommitAutomatedInvoiceDeductionLedgerEntry>(),
                    ) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(
                            prepaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                            _json = json,
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
                tryDeserialize(
                        node,
                        jacksonTypeRef<PrepaidCommitSeatBasedAdjustmentLedgerEntry>(),
                    ) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(
                            prepaidCommitSeatBasedAdjustmentLedgerEntry = it,
                            _json = json,
                        )
                    }
                tryDeserialize(node, jacksonTypeRef<PostpaidCommitInitialBalanceLedgerEntry>()) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(postpaidCommitInitialBalanceLedgerEntry = it, _json = json)
                    }
                tryDeserialize(
                        node,
                        jacksonTypeRef<PostpaidCommitAutomatedInvoiceDeductionLedgerEntry>(),
                    ) {
                        it.validate()
                    }
                    ?.let {
                        return Ledger(
                            postpaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                            _json = json,
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

        internal class Serializer : BaseSerializer<Ledger>(Ledger::class) {

            override fun serialize(
                value: Ledger,
                generator: JsonGenerator,
                provider: SerializerProvider,
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
                    value.prepaidCommitSeatBasedAdjustmentLedgerEntry != null ->
                        generator.writeObject(value.prepaidCommitSeatBasedAdjustmentLedgerEntry)
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

            /** A builder for [PrepaidCommitSegmentStartLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PREPAID_COMMIT_SEGMENT_START = of("PREPAID_COMMIT_SEGMENT_START")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_SEGMENT_START
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_SEGMENT_START,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_SEGMENT_START -> Value.PREPAID_COMMIT_SEGMENT_START
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
                        PREPAID_COMMIT_SEGMENT_START -> Known.PREPAID_COMMIT_SEGMENT_START
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            fun contractId(): Optional<String> =
                Optional.ofNullable(contractId.getNullable("contract_id"))

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

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type()
                contractId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PrepaidCommitAutomatedInvoiceDeductionLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var contractId: JsonField<String> = JsonMissing.of()
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
                    contractId = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.contractId
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

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
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

                fun build(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry =
                    PrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField
                    val PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION =
                        of("PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Value.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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
                        PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Known.PREPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is PrepaidCommitAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
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
                if (validated) {
                    return@apply
                }

                amount()
                newContractId()
                segmentId()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PrepaidCommitRolloverLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("newContractId", newContractId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PREPAID_COMMIT_ROLLOVER = of("PREPAID_COMMIT_ROLLOVER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_ROLLOVER
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_ROLLOVER,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_ROLLOVER -> Value.PREPAID_COMMIT_ROLLOVER
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
                        PREPAID_COMMIT_ROLLOVER -> Known.PREPAID_COMMIT_ROLLOVER
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

            /** A builder for [PrepaidCommitExpirationLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PREPAID_COMMIT_EXPIRATION = of("PREPAID_COMMIT_EXPIRATION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_EXPIRATION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_EXPIRATION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_EXPIRATION -> Value.PREPAID_COMMIT_EXPIRATION
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
                        PREPAID_COMMIT_EXPIRATION -> Known.PREPAID_COMMIT_EXPIRATION
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            fun contractId(): Optional<String> =
                Optional.ofNullable(contractId.getNullable("contract_id"))

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

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitCanceledLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type()
                contractId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PrepaidCommitCanceledLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var contractId: JsonField<String> = JsonMissing.of()
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
                    contractId = prepaidCommitCanceledLedgerEntry.contractId
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

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
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

                fun build(): PrepaidCommitCanceledLedgerEntry =
                    PrepaidCommitCanceledLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PREPAID_COMMIT_CANCELED = of("PREPAID_COMMIT_CANCELED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_CANCELED
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_CANCELED,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_CANCELED -> Value.PREPAID_COMMIT_CANCELED
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
                        PREPAID_COMMIT_CANCELED -> Known.PREPAID_COMMIT_CANCELED
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is PrepaidCommitCanceledLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCanceledLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
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
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            fun contractId(): Optional<String> =
                Optional.ofNullable(contractId.getNullable("contract_id"))

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

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PrepaidCommitCreditedLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type()
                contractId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PrepaidCommitCreditedLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var contractId: JsonField<String> = JsonMissing.of()
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
                    contractId = prepaidCommitCreditedLedgerEntry.contractId
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

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
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

                fun build(): PrepaidCommitCreditedLedgerEntry =
                    PrepaidCommitCreditedLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PREPAID_COMMIT_CREDITED = of("PREPAID_COMMIT_CREDITED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_CREDITED
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_CREDITED,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_CREDITED -> Value.PREPAID_COMMIT_CREDITED
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
                        PREPAID_COMMIT_CREDITED -> Known.PREPAID_COMMIT_CREDITED
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is PrepaidCommitCreditedLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCreditedLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PrepaidCommitSeatBasedAdjustmentLedgerEntry
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

            fun validate(): PrepaidCommitSeatBasedAdjustmentLedgerEntry = apply {
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

            /** A builder for [PrepaidCommitSeatBasedAdjustmentLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    prepaidCommitSeatBasedAdjustmentLedgerEntry:
                        PrepaidCommitSeatBasedAdjustmentLedgerEntry
                ) = apply {
                    amount = prepaidCommitSeatBasedAdjustmentLedgerEntry.amount
                    segmentId = prepaidCommitSeatBasedAdjustmentLedgerEntry.segmentId
                    timestamp = prepaidCommitSeatBasedAdjustmentLedgerEntry.timestamp
                    type = prepaidCommitSeatBasedAdjustmentLedgerEntry.type
                    additionalProperties =
                        prepaidCommitSeatBasedAdjustmentLedgerEntry.additionalProperties
                            .toMutableMap()
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

                fun build(): PrepaidCommitSeatBasedAdjustmentLedgerEntry =
                    PrepaidCommitSeatBasedAdjustmentLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField
                    val PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT =
                        of("PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT ->
                            Value.PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
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
                        PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT ->
                            Known.PREPAID_COMMIT_SEAT_BASED_ADJUSTMENT
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is PrepaidCommitSeatBasedAdjustmentLedgerEntry && amount == other.amount && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, segmentId, timestamp, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitSeatBasedAdjustmentLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
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
                if (validated) {
                    return@apply
                }

                amount()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PostpaidCommitInitialBalanceLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField
                    val POSTPAID_COMMIT_INITIAL_BALANCE = of("POSTPAID_COMMIT_INITIAL_BALANCE")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POSTPAID_COMMIT_INITIAL_BALANCE
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POSTPAID_COMMIT_INITIAL_BALANCE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POSTPAID_COMMIT_INITIAL_BALANCE -> Value.POSTPAID_COMMIT_INITIAL_BALANCE
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
                        POSTPAID_COMMIT_INITIAL_BALANCE -> Known.POSTPAID_COMMIT_INITIAL_BALANCE
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun segmentId(): String = segmentId.getRequired("segment_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            fun contractId(): Optional<String> =
                Optional.ofNullable(contractId.getNullable("contract_id"))

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

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type()
                contractId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PostpaidCommitAutomatedInvoiceDeductionLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var contractId: JsonField<String> = JsonMissing.of()
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
                    contractId = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.contractId
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

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
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

                fun build(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry =
                    PostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField
                    val POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION =
                        of("POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Value.POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
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
                        POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Known.POSTPAID_COMMIT_AUTOMATED_INVOICE_DEDUCTION
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is PostpaidCommitAutomatedInvoiceDeductionLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && segmentId == other.segmentId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, segmentId, timestamp, type, contractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
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
                if (validated) {
                    return@apply
                }

                amount()
                newContractId()
                segmentId()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PostpaidCommitRolloverLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("newContractId", newContractId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val POSTPAID_COMMIT_ROLLOVER = of("POSTPAID_COMMIT_ROLLOVER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POSTPAID_COMMIT_ROLLOVER
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POSTPAID_COMMIT_ROLLOVER,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POSTPAID_COMMIT_ROLLOVER -> Value.POSTPAID_COMMIT_ROLLOVER
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
                        POSTPAID_COMMIT_ROLLOVER -> Known.POSTPAID_COMMIT_ROLLOVER
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun type(): Type = type.getRequired("type")

            fun contractId(): Optional<String> =
                Optional.ofNullable(contractId.getNullable("contract_id"))

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommitTrueupLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                timestamp()
                type()
                contractId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PostpaidCommitTrueupLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var contractId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                ) = apply {
                    amount = postpaidCommitTrueupLedgerEntry.amount
                    invoiceId = postpaidCommitTrueupLedgerEntry.invoiceId
                    timestamp = postpaidCommitTrueupLedgerEntry.timestamp
                    type = postpaidCommitTrueupLedgerEntry.type
                    contractId = postpaidCommitTrueupLedgerEntry.contractId
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

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
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

                fun build(): PostpaidCommitTrueupLedgerEntry =
                    PostpaidCommitTrueupLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val POSTPAID_COMMIT_TRUEUP = of("POSTPAID_COMMIT_TRUEUP")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POSTPAID_COMMIT_TRUEUP
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POSTPAID_COMMIT_TRUEUP,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POSTPAID_COMMIT_TRUEUP -> Value.POSTPAID_COMMIT_TRUEUP
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
                        POSTPAID_COMMIT_TRUEUP -> Known.POSTPAID_COMMIT_TRUEUP
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is PostpaidCommitTrueupLedgerEntry && amount == other.amount && invoiceId == other.invoiceId && timestamp == other.timestamp && type == other.type && contractId == other.contractId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, invoiceId, timestamp, type, contractId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitTrueupLedgerEntry{amount=$amount, invoiceId=$invoiceId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
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

            /** A builder for [PrepaidCommitManualLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("reason", reason),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PREPAID_COMMIT_MANUAL = of("PREPAID_COMMIT_MANUAL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID_COMMIT_MANUAL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID_COMMIT_MANUAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PREPAID_COMMIT_MANUAL -> Value.PREPAID_COMMIT_MANUAL
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
                        PREPAID_COMMIT_MANUAL -> Known.PREPAID_COMMIT_MANUAL
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

            /** A builder for [PostpaidCommitManualLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("reason", reason),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val POSTPAID_COMMIT_MANUAL = of("POSTPAID_COMMIT_MANUAL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POSTPAID_COMMIT_MANUAL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POSTPAID_COMMIT_MANUAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POSTPAID_COMMIT_MANUAL -> Value.POSTPAID_COMMIT_MANUAL
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
                        POSTPAID_COMMIT_MANUAL -> Known.POSTPAID_COMMIT_MANUAL
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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
                if (validated) {
                    return@apply
                }

                amount()
                timestamp()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PostpaidCommitExpirationLedgerEntry]. */
            class Builder internal constructor() {

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
                        checkRequired("amount", amount),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val POSTPAID_COMMIT_EXPIRATION = of("POSTPAID_COMMIT_EXPIRATION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POSTPAID_COMMIT_EXPIRATION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POSTPAID_COMMIT_EXPIRATION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POSTPAID_COMMIT_EXPIRATION -> Value.POSTPAID_COMMIT_EXPIRATION
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
                        POSTPAID_COMMIT_EXPIRATION -> Known.POSTPAID_COMMIT_EXPIRATION
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

    class RateType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

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
            if (validated) {
                return@apply
            }

            commitId()
            contractId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RolledOverFrom]. */
        class Builder internal constructor() {

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
                    checkRequired("commitId", commitId),
                    checkRequired("contractId", contractId),
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

    /**
     * The subscription configuration for this commit, if it was generated from a recurring commit
     * with a subscription attached.
     */
    @NoAutoDetect
    class SubscriptionConfig
    @JsonCreator
    private constructor(
        @JsonProperty("allocation")
        @ExcludeMissing
        private val allocation: JsonField<Allocation> = JsonMissing.of(),
        @JsonProperty("apply_seat_increase_config")
        @ExcludeMissing
        private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        private val subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun allocation(): Optional<Allocation> =
            Optional.ofNullable(allocation.getNullable("allocation"))

        fun applySeatIncreaseConfig(): Optional<ApplySeatIncreaseConfig> =
            Optional.ofNullable(applySeatIncreaseConfig.getNullable("apply_seat_increase_config"))

        fun subscriptionId(): Optional<String> =
            Optional.ofNullable(subscriptionId.getNullable("subscription_id"))

        @JsonProperty("allocation")
        @ExcludeMissing
        fun _allocation(): JsonField<Allocation> = allocation

        @JsonProperty("apply_seat_increase_config")
        @ExcludeMissing
        fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> = applySeatIncreaseConfig

        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SubscriptionConfig = apply {
            if (validated) {
                return@apply
            }

            allocation()
            applySeatIncreaseConfig().ifPresent { it.validate() }
            subscriptionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubscriptionConfig]. */
        class Builder internal constructor() {

            private var allocation: JsonField<Allocation> = JsonMissing.of()
            private var applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> =
                JsonMissing.of()
            private var subscriptionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionConfig: SubscriptionConfig) = apply {
                allocation = subscriptionConfig.allocation
                applySeatIncreaseConfig = subscriptionConfig.applySeatIncreaseConfig
                subscriptionId = subscriptionConfig.subscriptionId
                additionalProperties = subscriptionConfig.additionalProperties.toMutableMap()
            }

            fun allocation(allocation: Allocation) = allocation(JsonField.of(allocation))

            fun allocation(allocation: JsonField<Allocation>) = apply {
                this.allocation = allocation
            }

            fun applySeatIncreaseConfig(applySeatIncreaseConfig: ApplySeatIncreaseConfig) =
                applySeatIncreaseConfig(JsonField.of(applySeatIncreaseConfig))

            fun applySeatIncreaseConfig(
                applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>
            ) = apply { this.applySeatIncreaseConfig = applySeatIncreaseConfig }

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
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

            fun build(): SubscriptionConfig =
                SubscriptionConfig(
                    allocation,
                    applySeatIncreaseConfig,
                    subscriptionId,
                    additionalProperties.toImmutable(),
                )
        }

        class Allocation @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INDIVIDUAL = of("INDIVIDUAL")

                @JvmField val POOLED = of("POOLED")

                @JvmStatic fun of(value: String) = Allocation(JsonField.of(value))
            }

            /** An enum containing [Allocation]'s known values. */
            enum class Known {
                INDIVIDUAL,
                POOLED,
            }

            /**
             * An enum containing [Allocation]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Allocation] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INDIVIDUAL,
                POOLED,
                /**
                 * An enum member indicating that [Allocation] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INDIVIDUAL -> Value.INDIVIDUAL
                    POOLED -> Value.POOLED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INDIVIDUAL -> Known.INDIVIDUAL
                    POOLED -> Known.POOLED
                    else -> throw MetronomeInvalidDataException("Unknown Allocation: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Allocation && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class ApplySeatIncreaseConfig
        @JsonCreator
        private constructor(
            @JsonProperty("is_prorated")
            @ExcludeMissing
            private val isProrated: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Indicates whether a mid-period seat increase should be prorated. */
            fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

            /** Indicates whether a mid-period seat increase should be prorated. */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun _isProrated(): JsonField<Boolean> = isProrated

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ApplySeatIncreaseConfig = apply {
                if (validated) {
                    return@apply
                }

                isProrated()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApplySeatIncreaseConfig]. */
            class Builder internal constructor() {

                private var isProrated: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(applySeatIncreaseConfig: ApplySeatIncreaseConfig) = apply {
                    isProrated = applySeatIncreaseConfig.isProrated
                    additionalProperties =
                        applySeatIncreaseConfig.additionalProperties.toMutableMap()
                }

                /** Indicates whether a mid-period seat increase should be prorated. */
                fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                /** Indicates whether a mid-period seat increase should be prorated. */
                fun isProrated(isProrated: JsonField<Boolean>) = apply {
                    this.isProrated = isProrated
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

                fun build(): ApplySeatIncreaseConfig =
                    ApplySeatIncreaseConfig(
                        checkRequired("isProrated", isProrated),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ApplySeatIncreaseConfig && isProrated == other.isProrated && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplySeatIncreaseConfig{isProrated=$isProrated, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionConfig && allocation == other.allocation && applySeatIncreaseConfig == other.applySeatIncreaseConfig && subscriptionId == other.subscriptionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(allocation, applySeatIncreaseConfig, subscriptionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionConfig{allocation=$allocation, applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Commit && id == other.id && createdAt == other.createdAt && product == other.product && type == other.type && accessSchedule == other.accessSchedule && amount == other.amount && applicableContractIds == other.applicableContractIds && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && archivedAt == other.archivedAt && balance == other.balance && contract == other.contract && customFields == other.customFields && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && invoiceContract == other.invoiceContract && invoiceSchedule == other.invoiceSchedule && ledger == other.ledger && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && recurringCommitId == other.recurringCommitId && rolledOverFrom == other.rolledOverFrom && rolloverFraction == other.rolloverFraction && salesforceOpportunityId == other.salesforceOpportunityId && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, product, type, accessSchedule, amount, applicableContractIds, applicableProductIds, applicableProductTags, archivedAt, balance, contract, customFields, description, hierarchyConfiguration, invoiceContract, invoiceSchedule, ledger, name, netsuiteSalesOrderId, priority, rateType, recurringCommitId, rolledOverFrom, rolloverFraction, salesforceOpportunityId, specifiers, subscriptionConfig, uniquenessKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Commit{id=$id, createdAt=$createdAt, product=$product, type=$type, accessSchedule=$accessSchedule, amount=$amount, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, archivedAt=$archivedAt, balance=$balance, contract=$contract, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, invoiceContract=$invoiceContract, invoiceSchedule=$invoiceSchedule, ledger=$ledger, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, recurringCommitId=$recurringCommitId, rolledOverFrom=$rolledOverFrom, rolloverFraction=$rolloverFraction, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
