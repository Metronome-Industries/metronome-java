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
import com.metronome.api.core.allMaxBy
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Commit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val product: JsonField<Product>,
    private val type: JsonField<Type>,
    private val accessSchedule: JsonField<ScheduleDuration>,
    private val amount: JsonField<Double>,
    private val applicableContractIds: JsonField<List<String>>,
    private val applicableProductIds: JsonField<List<String>>,
    private val applicableProductTags: JsonField<List<String>>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val balance: JsonField<Double>,
    private val contract: JsonField<Contract>,
    private val customFields: JsonField<CustomFields>,
    private val description: JsonField<String>,
    private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
    private val invoiceContract: JsonField<InvoiceContract>,
    private val invoiceSchedule: JsonField<SchedulePointInTime>,
    private val ledger: JsonField<List<Ledger>>,
    private val name: JsonField<String>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val priority: JsonField<Double>,
    private val rateType: JsonField<RateType>,
    private val recurringCommitId: JsonField<String>,
    private val rolledOverFrom: JsonField<RolledOverFrom>,
    private val rolloverFraction: JsonField<Double>,
    private val salesforceOpportunityId: JsonField<String>,
    private val specifiers: JsonField<List<CommitSpecifier>>,
    private val subscriptionConfig: JsonField<SubscriptionConfig>,
    private val uniquenessKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("access_schedule")
        @ExcludeMissing
        accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("contract") @ExcludeMissing contract: JsonField<Contract> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> = JsonMissing.of(),
        @JsonProperty("invoice_contract")
        @ExcludeMissing
        invoiceContract: JsonField<InvoiceContract> = JsonMissing.of(),
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        invoiceSchedule: JsonField<SchedulePointInTime> = JsonMissing.of(),
        @JsonProperty("ledger") @ExcludeMissing ledger: JsonField<List<Ledger>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rate_type") @ExcludeMissing rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("recurring_commit_id")
        @ExcludeMissing
        recurringCommitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rolled_over_from")
        @ExcludeMissing
        rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of(),
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        rolloverFraction: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
        @JsonProperty("subscription_config")
        @ExcludeMissing
        subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        uniquenessKey: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        product,
        type,
        accessSchedule,
        amount,
        applicableContractIds,
        applicableProductIds,
        applicableProductTags,
        archivedAt,
        balance,
        contract,
        customFields,
        description,
        hierarchyConfiguration,
        invoiceContract,
        invoiceSchedule,
        ledger,
        name,
        netsuiteSalesOrderId,
        priority,
        rateType,
        recurringCommitId,
        rolledOverFrom,
        rolloverFraction,
        salesforceOpportunityId,
        specifiers,
        subscriptionConfig,
        uniquenessKey,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Timestamp of when the commit was created.
     * - Recurring commits: latter of commit service period date and parent commit start date
     * - Rollover commits: when the new contract started
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun product(): Product = product.getRequired("product")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The schedule that the customer will gain access to the credits purposed with this commit.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessSchedule(): Optional<ScheduleDuration> = accessSchedule.getOptional("access_schedule")

    /**
     * (DEPRECATED) Use access_schedule + invoice_schedule instead.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = amount.getOptional("amount")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableContractIds(): Optional<List<String>> =
        applicableContractIds.getOptional("applicable_contract_ids")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableProductIds(): Optional<List<String>> =
        applicableProductIds.getOptional("applicable_product_ids")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableProductTags(): Optional<List<String>> =
        applicableProductTags.getOptional("applicable_product_tags")

    /**
     * RFC 3339 timestamp indicating when the commit was archived. If not provided, the commit is
     * not archived.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archived_at")

    /**
     * The current balance of the credit or commit. This balance reflects the amount of credit or
     * commit that the customer has access to use at this moment - thus, expired and upcoming credit
     * or commit segments contribute 0 to the balance. The balance will match the sum of all ledger
     * entries with the exception of the case where the sum of negative manual ledger entries
     * exceeds the positive amount remaining on the credit or commit - in that case, the balance
     * will be 0. All manual ledger entries associated with active credit or commit segments are
     * included in the balance, including future-dated manual ledger entries.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balance(): Optional<Double> = balance.getOptional("balance")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contract(): Optional<Contract> = contract.getOptional("contract")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Optional configuration for commit hierarchy access control
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
        hierarchyConfiguration.getOptional("hierarchy_configuration")

    /**
     * The contract that this commit will be billed on.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceContract(): Optional<InvoiceContract> =
        invoiceContract.getOptional("invoice_contract")

    /**
     * The schedule that the customer will be invoiced for this commit.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceSchedule(): Optional<SchedulePointInTime> =
        invoiceSchedule.getOptional("invoice_schedule")

    /**
     * A list of ordered events that impact the balance of a commit. For example, an invoice
     * deduction or a rollover.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ledger(): Optional<List<Ledger>> = ledger.getOptional("ledger")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteSalesOrderId(): Optional<String> =
        netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priority(): Optional<Double> = priority.getOptional("priority")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

    /**
     * The ID of the recurring commit that this commit was generated from, if applicable.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recurringCommitId(): Optional<String> = recurringCommitId.getOptional("recurring_commit_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolledOverFrom(): Optional<RolledOverFrom> = rolledOverFrom.getOptional("rolled_over_from")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolloverFraction(): Optional<Double> = rolloverFraction.getOptional("rollover_fraction")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salesforceOpportunityId(): Optional<String> =
        salesforceOpportunityId.getOptional("salesforce_opportunity_id")

    /**
     * List of filters that determine what kind of customer usage draws down a commit or credit. A
     * customer's usage needs to meet the condition of at least one of the specifiers to contribute
     * to a commit's or credit's drawdown.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun specifiers(): Optional<List<CommitSpecifier>> = specifiers.getOptional("specifiers")

    /**
     * The subscription configuration for this commit, if it was generated from a recurring commit
     * with a subscription attached.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionConfig(): Optional<SubscriptionConfig> =
        subscriptionConfig.getOptional("subscription_config")

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniquenessKey(): Optional<String> = uniquenessKey.getOptional("uniqueness_key")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [product].
     *
     * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [accessSchedule].
     *
     * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_schedule")
    @ExcludeMissing
    fun _accessSchedule(): JsonField<ScheduleDuration> = accessSchedule

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [applicableContractIds].
     *
     * Unlike [applicableContractIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicable_contract_ids")
    @ExcludeMissing
    fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

    /**
     * Returns the raw JSON value of [applicableProductIds].
     *
     * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicable_product_ids")
    @ExcludeMissing
    fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

    /**
     * Returns the raw JSON value of [applicableProductTags].
     *
     * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

    /**
     * Returns the raw JSON value of [contract].
     *
     * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [hierarchyConfiguration].
     *
     * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hierarchy_configuration")
    @ExcludeMissing
    fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> = hierarchyConfiguration

    /**
     * Returns the raw JSON value of [invoiceContract].
     *
     * Unlike [invoiceContract], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_contract")
    @ExcludeMissing
    fun _invoiceContract(): JsonField<InvoiceContract> = invoiceContract

    /**
     * Returns the raw JSON value of [invoiceSchedule].
     *
     * Unlike [invoiceSchedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_schedule")
    @ExcludeMissing
    fun _invoiceSchedule(): JsonField<SchedulePointInTime> = invoiceSchedule

    /**
     * Returns the raw JSON value of [ledger].
     *
     * Unlike [ledger], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger") @ExcludeMissing fun _ledger(): JsonField<List<Ledger>> = ledger

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [netsuiteSalesOrderId].
     *
     * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    /**
     * Returns the raw JSON value of [rateType].
     *
     * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

    /**
     * Returns the raw JSON value of [recurringCommitId].
     *
     * Unlike [recurringCommitId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recurring_commit_id")
    @ExcludeMissing
    fun _recurringCommitId(): JsonField<String> = recurringCommitId

    /**
     * Returns the raw JSON value of [rolledOverFrom].
     *
     * Unlike [rolledOverFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rolled_over_from")
    @ExcludeMissing
    fun _rolledOverFrom(): JsonField<RolledOverFrom> = rolledOverFrom

    /**
     * Returns the raw JSON value of [rolloverFraction].
     *
     * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rollover_fraction")
    @ExcludeMissing
    fun _rolloverFraction(): JsonField<Double> = rolloverFraction

    /**
     * Returns the raw JSON value of [salesforceOpportunityId].
     *
     * Unlike [salesforceOpportunityId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

    /**
     * Returns the raw JSON value of [specifiers].
     *
     * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specifiers")
    @ExcludeMissing
    fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

    /**
     * Returns the raw JSON value of [subscriptionConfig].
     *
     * Unlike [subscriptionConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscription_config")
    @ExcludeMissing
    fun _subscriptionConfig(): JsonField<SubscriptionConfig> = subscriptionConfig

    /**
     * Returns the raw JSON value of [uniquenessKey].
     *
     * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uniqueness_key")
    @ExcludeMissing
    fun _uniquenessKey(): JsonField<String> = uniquenessKey

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Commit].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .product()
         * .type()
         * ```
         */
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Timestamp of when the commit was created.
         * - Recurring commits: latter of commit service period date and parent commit start date
         * - Rollover commits: when the new contract started
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun product(product: Product) = product(JsonField.of(product))

        /**
         * Sets [Builder.product] to an arbitrary JSON value.
         *
         * You should usually call [Builder.product] with a well-typed [Product] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The schedule that the customer will gain access to the credits purposed with this commit.
         */
        fun accessSchedule(accessSchedule: ScheduleDuration) =
            accessSchedule(JsonField.of(accessSchedule))

        /**
         * Sets [Builder.accessSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessSchedule] with a well-typed [ScheduleDuration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
            this.accessSchedule = accessSchedule
        }

        /** (DEPRECATED) Use access_schedule + invoice_schedule instead. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun applicableContractIds(applicableContractIds: List<String>) =
            applicableContractIds(JsonField.of(applicableContractIds))

        /**
         * Sets [Builder.applicableContractIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicableContractIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
            this.applicableContractIds = applicableContractIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [applicableContractIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplicableContractId(applicableContractId: String) = apply {
            applicableContractIds =
                (applicableContractIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("applicableContractIds", it).add(applicableContractId)
                }
        }

        fun applicableProductIds(applicableProductIds: List<String>) =
            applicableProductIds(JsonField.of(applicableProductIds))

        /**
         * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicableProductIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [applicableProductIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplicableProductId(applicableProductId: String) = apply {
            applicableProductIds =
                (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("applicableProductIds", it).add(applicableProductId)
                }
        }

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        /**
         * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicableProductTags] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [applicableProductTags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplicableProductTag(applicableProductTag: String) = apply {
            applicableProductTags =
                (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                    checkKnown("applicableProductTags", it).add(applicableProductTag)
                }
        }

        /**
         * RFC 3339 timestamp indicating when the commit was archived. If not provided, the commit
         * is not archived.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

        fun contract(contract: Contract) = contract(JsonField.of(contract))

        /**
         * Sets [Builder.contract] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contract] with a well-typed [Contract] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Optional configuration for commit hierarchy access control */
        fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
            hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

        /**
         * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hierarchyConfiguration] with a well-typed
         * [CommitHierarchyConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun hierarchyConfiguration(
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
        ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

        /** The contract that this commit will be billed on. */
        fun invoiceContract(invoiceContract: InvoiceContract) =
            invoiceContract(JsonField.of(invoiceContract))

        /**
         * Sets [Builder.invoiceContract] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceContract] with a well-typed [InvoiceContract]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoiceContract(invoiceContract: JsonField<InvoiceContract>) = apply {
            this.invoiceContract = invoiceContract
        }

        /** The schedule that the customer will be invoiced for this commit. */
        fun invoiceSchedule(invoiceSchedule: SchedulePointInTime) =
            invoiceSchedule(JsonField.of(invoiceSchedule))

        /**
         * Sets [Builder.invoiceSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceSchedule] with a well-typed [SchedulePointInTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoiceSchedule(invoiceSchedule: JsonField<SchedulePointInTime>) = apply {
            this.invoiceSchedule = invoiceSchedule
        }

        /**
         * A list of ordered events that impact the balance of a commit. For example, an invoice
         * deduction or a rollover.
         */
        fun ledger(ledger: List<Ledger>) = ledger(JsonField.of(ledger))

        /**
         * Sets [Builder.ledger] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledger] with a well-typed `List<Ledger>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ledger(ledger: JsonField<List<Ledger>>) = apply {
            this.ledger = ledger.map { it.toMutableList() }
        }

        /**
         * Adds a single [Ledger] to [Builder.ledger].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLedger(ledger: Ledger) = apply {
            this.ledger =
                (this.ledger ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ledger", it).add(ledger)
                }
        }

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitSegmentStartLedgerEntry(prepaidCommitSegmentStartLedgerEntry)`.
         */
        fun addLedger(
            prepaidCommitSegmentStartLedgerEntry: Ledger.PrepaidCommitSegmentStartLedgerEntry
        ) =
            addLedger(
                Ledger.ofPrepaidCommitSegmentStartLedgerEntry(prepaidCommitSegmentStartLedgerEntry)
            )

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(prepaidCommitAutomatedInvoiceDeductionLedgerEntry)`.
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
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitRolloverLedgerEntry(prepaidCommitRolloverLedgerEntry)`.
         */
        fun addLedger(prepaidCommitRolloverLedgerEntry: Ledger.PrepaidCommitRolloverLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitRolloverLedgerEntry(prepaidCommitRolloverLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitExpirationLedgerEntry(prepaidCommitExpirationLedgerEntry)`.
         */
        fun addLedger(
            prepaidCommitExpirationLedgerEntry: Ledger.PrepaidCommitExpirationLedgerEntry
        ) =
            addLedger(
                Ledger.ofPrepaidCommitExpirationLedgerEntry(prepaidCommitExpirationLedgerEntry)
            )

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitCanceledLedgerEntry(prepaidCommitCanceledLedgerEntry)`.
         */
        fun addLedger(prepaidCommitCanceledLedgerEntry: Ledger.PrepaidCommitCanceledLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitCanceledLedgerEntry(prepaidCommitCanceledLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitCreditedLedgerEntry(prepaidCommitCreditedLedgerEntry)`.
         */
        fun addLedger(prepaidCommitCreditedLedgerEntry: Ledger.PrepaidCommitCreditedLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitCreditedLedgerEntry(prepaidCommitCreditedLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitSeatBasedAdjustmentLedgerEntry(prepaidCommitSeatBasedAdjustmentLedgerEntry)`.
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
         * Alias for calling [addLedger] with
         * `Ledger.ofPostpaidCommitInitialBalanceLedgerEntry(postpaidCommitInitialBalanceLedgerEntry)`.
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
         * Alias for calling [addLedger] with
         * `Ledger.ofPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(postpaidCommitAutomatedInvoiceDeductionLedgerEntry)`.
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
         * Alias for calling [addLedger] with
         * `Ledger.ofPostpaidCommitRolloverLedgerEntry(postpaidCommitRolloverLedgerEntry)`.
         */
        fun addLedger(postpaidCommitRolloverLedgerEntry: Ledger.PostpaidCommitRolloverLedgerEntry) =
            addLedger(Ledger.ofPostpaidCommitRolloverLedgerEntry(postpaidCommitRolloverLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPostpaidCommitTrueupLedgerEntry(postpaidCommitTrueupLedgerEntry)`.
         */
        fun addLedger(postpaidCommitTrueupLedgerEntry: Ledger.PostpaidCommitTrueupLedgerEntry) =
            addLedger(Ledger.ofPostpaidCommitTrueupLedgerEntry(postpaidCommitTrueupLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPrepaidCommitManualLedgerEntry(prepaidCommitManualLedgerEntry)`.
         */
        fun addLedger(prepaidCommitManualLedgerEntry: Ledger.PrepaidCommitManualLedgerEntry) =
            addLedger(Ledger.ofPrepaidCommitManualLedgerEntry(prepaidCommitManualLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPostpaidCommitManualLedgerEntry(postpaidCommitManualLedgerEntry)`.
         */
        fun addLedger(postpaidCommitManualLedgerEntry: Ledger.PostpaidCommitManualLedgerEntry) =
            addLedger(Ledger.ofPostpaidCommitManualLedgerEntry(postpaidCommitManualLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofPostpaidCommitExpirationLedgerEntry(postpaidCommitExpirationLedgerEntry)`.
         */
        fun addLedger(
            postpaidCommitExpirationLedgerEntry: Ledger.PostpaidCommitExpirationLedgerEntry
        ) =
            addLedger(
                Ledger.ofPostpaidCommitExpirationLedgerEntry(postpaidCommitExpirationLedgerEntry)
            )

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /**
         * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(priority: Double) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        /**
         * Sets [Builder.rateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateType] with a well-typed [RateType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        /** The ID of the recurring commit that this commit was generated from, if applicable. */
        fun recurringCommitId(recurringCommitId: String) =
            recurringCommitId(JsonField.of(recurringCommitId))

        /**
         * Sets [Builder.recurringCommitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringCommitId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recurringCommitId(recurringCommitId: JsonField<String>) = apply {
            this.recurringCommitId = recurringCommitId
        }

        fun rolledOverFrom(rolledOverFrom: RolledOverFrom) =
            rolledOverFrom(JsonField.of(rolledOverFrom))

        /**
         * Sets [Builder.rolledOverFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolledOverFrom] with a well-typed [RolledOverFrom] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rolledOverFrom(rolledOverFrom: JsonField<RolledOverFrom>) = apply {
            this.rolledOverFrom = rolledOverFrom
        }

        fun rolloverFraction(rolloverFraction: Double) =
            rolloverFraction(JsonField.of(rolloverFraction))

        /**
         * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverFraction] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
            this.rolloverFraction = rolloverFraction
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /**
         * Sets [Builder.salesforceOpportunityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.salesforceOpportunityId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
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
         * Sets [Builder.specifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specifiers] with a well-typed `List<CommitSpecifier>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
            this.specifiers = specifiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [CommitSpecifier] to [specifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpecifier(specifier: CommitSpecifier) = apply {
            specifiers =
                (specifiers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("specifiers", it).add(specifier)
                }
        }

        /**
         * The subscription configuration for this commit, if it was generated from a recurring
         * commit with a subscription attached.
         */
        fun subscriptionConfig(subscriptionConfig: SubscriptionConfig) =
            subscriptionConfig(JsonField.of(subscriptionConfig))

        /**
         * Sets [Builder.subscriptionConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionConfig] with a well-typed
         * [SubscriptionConfig] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniquenessKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [Commit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .product()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Commit = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        product().validate()
        type().validate()
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
        rateType().ifPresent { it.validate() }
        recurringCommitId()
        rolledOverFrom().ifPresent { it.validate() }
        rolloverFraction()
        salesforceOpportunityId()
        specifiers().ifPresent { it.forEach { it.validate() } }
        subscriptionConfig().ifPresent { it.validate() }
        uniquenessKey()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: MetronomeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (product.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (applicableContractIds.asKnown().getOrNull()?.size ?: 0) +
            (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
            (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (if (balance.asKnown().isPresent) 1 else 0) +
            (contract.asKnown().getOrNull()?.validity() ?: 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (invoiceContract.asKnown().getOrNull()?.validity() ?: 0) +
            (invoiceSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (ledger.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (rateType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recurringCommitId.asKnown().isPresent) 1 else 0) +
            (rolledOverFrom.asKnown().getOrNull()?.validity() ?: 0) +
            (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
            (if (salesforceOpportunityId.asKnown().isPresent) 1 else 0) +
            (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (subscriptionConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uniquenessKey.asKnown().isPresent) 1 else 0)

    class Product
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, name, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Product].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Product].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Product =
                Product(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Product &&
                id == other.id &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Contract
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
        ) : this(id, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Contract].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Contract].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Contract =
                Contract(checkRequired("id", id), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Contract = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Contract &&
                id == other.id &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Contract{id=$id, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    /** The contract that this commit will be billed on. */
    class InvoiceContract
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
        ) : this(id, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [InvoiceContract].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [InvoiceContract].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InvoiceContract =
                InvoiceContract(checkRequired("id", id), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InvoiceContract = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceContract &&
                id == other.id &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

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

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.metronome.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = ledger.accept(new Ledger.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitPrepaidCommitSegmentStartLedgerEntry(PrepaidCommitSegmentStartLedgerEntry prepaidCommitSegmentStartLedgerEntry) {
         *         return Optional.of(prepaidCommitSegmentStartLedgerEntry.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws MetronomeInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitPrepaidCommitSegmentStartLedgerEntry(
                        prepaidCommitSegmentStartLedgerEntry: PrepaidCommitSegmentStartLedgerEntry
                    ) = prepaidCommitSegmentStartLedgerEntry.validity()

                    override fun visitPrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry:
                            PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                    ) = prepaidCommitAutomatedInvoiceDeductionLedgerEntry.validity()

                    override fun visitPrepaidCommitRolloverLedgerEntry(
                        prepaidCommitRolloverLedgerEntry: PrepaidCommitRolloverLedgerEntry
                    ) = prepaidCommitRolloverLedgerEntry.validity()

                    override fun visitPrepaidCommitExpirationLedgerEntry(
                        prepaidCommitExpirationLedgerEntry: PrepaidCommitExpirationLedgerEntry
                    ) = prepaidCommitExpirationLedgerEntry.validity()

                    override fun visitPrepaidCommitCanceledLedgerEntry(
                        prepaidCommitCanceledLedgerEntry: PrepaidCommitCanceledLedgerEntry
                    ) = prepaidCommitCanceledLedgerEntry.validity()

                    override fun visitPrepaidCommitCreditedLedgerEntry(
                        prepaidCommitCreditedLedgerEntry: PrepaidCommitCreditedLedgerEntry
                    ) = prepaidCommitCreditedLedgerEntry.validity()

                    override fun visitPrepaidCommitSeatBasedAdjustmentLedgerEntry(
                        prepaidCommitSeatBasedAdjustmentLedgerEntry:
                            PrepaidCommitSeatBasedAdjustmentLedgerEntry
                    ) = prepaidCommitSeatBasedAdjustmentLedgerEntry.validity()

                    override fun visitPostpaidCommitInitialBalanceLedgerEntry(
                        postpaidCommitInitialBalanceLedgerEntry:
                            PostpaidCommitInitialBalanceLedgerEntry
                    ) = postpaidCommitInitialBalanceLedgerEntry.validity()

                    override fun visitPostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry:
                            PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                    ) = postpaidCommitAutomatedInvoiceDeductionLedgerEntry.validity()

                    override fun visitPostpaidCommitRolloverLedgerEntry(
                        postpaidCommitRolloverLedgerEntry: PostpaidCommitRolloverLedgerEntry
                    ) = postpaidCommitRolloverLedgerEntry.validity()

                    override fun visitPostpaidCommitTrueupLedgerEntry(
                        postpaidCommitTrueupLedgerEntry: PostpaidCommitTrueupLedgerEntry
                    ) = postpaidCommitTrueupLedgerEntry.validity()

                    override fun visitPrepaidCommitManualLedgerEntry(
                        prepaidCommitManualLedgerEntry: PrepaidCommitManualLedgerEntry
                    ) = prepaidCommitManualLedgerEntry.validity()

                    override fun visitPostpaidCommitManualLedgerEntry(
                        postpaidCommitManualLedgerEntry: PostpaidCommitManualLedgerEntry
                    ) = postpaidCommitManualLedgerEntry.validity()

                    override fun visitPostpaidCommitExpirationLedgerEntry(
                        postpaidCommitExpirationLedgerEntry: PostpaidCommitExpirationLedgerEntry
                    ) = postpaidCommitExpirationLedgerEntry.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ledger &&
                prepaidCommitSegmentStartLedgerEntry ==
                    other.prepaidCommitSegmentStartLedgerEntry &&
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry ==
                    other.prepaidCommitAutomatedInvoiceDeductionLedgerEntry &&
                prepaidCommitRolloverLedgerEntry == other.prepaidCommitRolloverLedgerEntry &&
                prepaidCommitExpirationLedgerEntry == other.prepaidCommitExpirationLedgerEntry &&
                prepaidCommitCanceledLedgerEntry == other.prepaidCommitCanceledLedgerEntry &&
                prepaidCommitCreditedLedgerEntry == other.prepaidCommitCreditedLedgerEntry &&
                prepaidCommitSeatBasedAdjustmentLedgerEntry ==
                    other.prepaidCommitSeatBasedAdjustmentLedgerEntry &&
                postpaidCommitInitialBalanceLedgerEntry ==
                    other.postpaidCommitInitialBalanceLedgerEntry &&
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry ==
                    other.postpaidCommitAutomatedInvoiceDeductionLedgerEntry &&
                postpaidCommitRolloverLedgerEntry == other.postpaidCommitRolloverLedgerEntry &&
                postpaidCommitTrueupLedgerEntry == other.postpaidCommitTrueupLedgerEntry &&
                prepaidCommitManualLedgerEntry == other.prepaidCommitManualLedgerEntry &&
                postpaidCommitManualLedgerEntry == other.postpaidCommitManualLedgerEntry &&
                postpaidCommitExpirationLedgerEntry == other.postpaidCommitExpirationLedgerEntry
        }

        override fun hashCode(): Int =
            Objects.hash(
                prepaidCommitSegmentStartLedgerEntry,
                prepaidCommitAutomatedInvoiceDeductionLedgerEntry,
                prepaidCommitRolloverLedgerEntry,
                prepaidCommitExpirationLedgerEntry,
                prepaidCommitCanceledLedgerEntry,
                prepaidCommitCreditedLedgerEntry,
                prepaidCommitSeatBasedAdjustmentLedgerEntry,
                postpaidCommitInitialBalanceLedgerEntry,
                postpaidCommitAutomatedInvoiceDeductionLedgerEntry,
                postpaidCommitRolloverLedgerEntry,
                postpaidCommitTrueupLedgerEntry,
                prepaidCommitManualLedgerEntry,
                postpaidCommitManualLedgerEntry,
                postpaidCommitExpirationLedgerEntry,
            )

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PrepaidCommitSegmentStartLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(prepaidCommitSegmentStartLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
                                    >(),
                                )
                                ?.let {
                                    Ledger(
                                        prepaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PrepaidCommitRolloverLedgerEntry>())
                                ?.let {
                                    Ledger(prepaidCommitRolloverLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PrepaidCommitExpirationLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(prepaidCommitExpirationLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PrepaidCommitCanceledLedgerEntry>())
                                ?.let {
                                    Ledger(prepaidCommitCanceledLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PrepaidCommitCreditedLedgerEntry>())
                                ?.let {
                                    Ledger(prepaidCommitCreditedLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PrepaidCommitSeatBasedAdjustmentLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(
                                        prepaidCommitSeatBasedAdjustmentLedgerEntry = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PostpaidCommitInitialBalanceLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(
                                        postpaidCommitInitialBalanceLedgerEntry = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
                                    >(),
                                )
                                ?.let {
                                    Ledger(
                                        postpaidCommitAutomatedInvoiceDeductionLedgerEntry = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PostpaidCommitRolloverLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(postpaidCommitRolloverLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PostpaidCommitTrueupLedgerEntry>())
                                ?.let {
                                    Ledger(postpaidCommitTrueupLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PrepaidCommitManualLedgerEntry>())
                                ?.let { Ledger(prepaidCommitManualLedgerEntry = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PostpaidCommitManualLedgerEntry>())
                                ?.let {
                                    Ledger(postpaidCommitManualLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PostpaidCommitExpirationLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(postpaidCommitExpirationLedgerEntry = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Ledger(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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

        class PrepaidCommitSegmentStartLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, segmentId, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitSegmentStartLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PrepaidCommitSegmentStartLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitSegmentStartLedgerEntry =
                    PrepaidCommitSegmentStartLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitSegmentStartLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                segmentId()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitSegmentStartLedgerEntry &&
                    amount == other.amount &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, segmentId, timestamp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitSegmentStartLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PrepaidCommitAutomatedInvoiceDeductionLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val invoiceId: JsonField<String>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val contractId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, invoiceId, segmentId, timestamp, type, contractId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contractId(): Optional<String> = contractId.getOptional("contract_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitAutomatedInvoiceDeductionLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of
                 * [PrepaidCommitAutomatedInvoiceDeductionLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry =
                    PrepaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type().validate()
                contractId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (invoiceId.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (contractId.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitAutomatedInvoiceDeductionLedgerEntry &&
                    amount == other.amount &&
                    invoiceId == other.invoiceId &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    contractId == other.contractId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    invoiceId,
                    segmentId,
                    timestamp,
                    type,
                    contractId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class PrepaidCommitRolloverLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val newContractId: JsonField<String>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("new_contract_id")
                @ExcludeMissing
                newContractId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, newContractId, segmentId, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun newContractId(): String = newContractId.getRequired("new_contract_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [newContractId].
             *
             * Unlike [newContractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("new_contract_id")
            @ExcludeMissing
            fun _newContractId(): JsonField<String> = newContractId

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitRolloverLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .newContractId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun newContractId(newContractId: String) =
                    newContractId(JsonField.of(newContractId))

                /**
                 * Sets [Builder.newContractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.newContractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun newContractId(newContractId: JsonField<String>) = apply {
                    this.newContractId = newContractId
                }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PrepaidCommitRolloverLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .newContractId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitRolloverLedgerEntry =
                    PrepaidCommitRolloverLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("newContractId", newContractId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitRolloverLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                newContractId()
                segmentId()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (newContractId.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitRolloverLedgerEntry &&
                    amount == other.amount &&
                    newContractId == other.newContractId &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    newContractId,
                    segmentId,
                    timestamp,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitRolloverLedgerEntry{amount=$amount, newContractId=$newContractId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PrepaidCommitExpirationLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, segmentId, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitExpirationLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PrepaidCommitExpirationLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitExpirationLedgerEntry =
                    PrepaidCommitExpirationLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitExpirationLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                segmentId()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitExpirationLedgerEntry &&
                    amount == other.amount &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, segmentId, timestamp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitExpirationLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PrepaidCommitCanceledLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val invoiceId: JsonField<String>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val contractId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, invoiceId, segmentId, timestamp, type, contractId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contractId(): Optional<String> = contractId.getOptional("contract_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitCanceledLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PrepaidCommitCanceledLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitCanceledLedgerEntry =
                    PrepaidCommitCanceledLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitCanceledLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type().validate()
                contractId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (invoiceId.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (contractId.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitCanceledLedgerEntry &&
                    amount == other.amount &&
                    invoiceId == other.invoiceId &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    contractId == other.contractId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    invoiceId,
                    segmentId,
                    timestamp,
                    type,
                    contractId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCanceledLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class PrepaidCommitCreditedLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val invoiceId: JsonField<String>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val contractId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, invoiceId, segmentId, timestamp, type, contractId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contractId(): Optional<String> = contractId.getOptional("contract_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitCreditedLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PrepaidCommitCreditedLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitCreditedLedgerEntry =
                    PrepaidCommitCreditedLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitCreditedLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type().validate()
                contractId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (invoiceId.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (contractId.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitCreditedLedgerEntry &&
                    amount == other.amount &&
                    invoiceId == other.invoiceId &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    contractId == other.contractId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    invoiceId,
                    segmentId,
                    timestamp,
                    type,
                    contractId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitCreditedLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class PrepaidCommitSeatBasedAdjustmentLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, segmentId, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitSeatBasedAdjustmentLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PrepaidCommitSeatBasedAdjustmentLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitSeatBasedAdjustmentLedgerEntry =
                    PrepaidCommitSeatBasedAdjustmentLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitSeatBasedAdjustmentLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                segmentId()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitSeatBasedAdjustmentLedgerEntry &&
                    amount == other.amount &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, segmentId, timestamp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitSeatBasedAdjustmentLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PostpaidCommitInitialBalanceLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PostpaidCommitInitialBalanceLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PostpaidCommitInitialBalanceLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostpaidCommitInitialBalanceLedgerEntry =
                    PostpaidCommitInitialBalanceLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PostpaidCommitInitialBalanceLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostpaidCommitInitialBalanceLedgerEntry &&
                    amount == other.amount &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, timestamp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitInitialBalanceLedgerEntry{amount=$amount, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PostpaidCommitAutomatedInvoiceDeductionLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val invoiceId: JsonField<String>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val contractId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, invoiceId, segmentId, timestamp, type, contractId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contractId(): Optional<String> = contractId.getOptional("contract_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PostpaidCommitAutomatedInvoiceDeductionLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of
                 * [PostpaidCommitAutomatedInvoiceDeductionLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry =
                    PostpaidCommitAutomatedInvoiceDeductionLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PostpaidCommitAutomatedInvoiceDeductionLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                segmentId()
                timestamp()
                type().validate()
                contractId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (invoiceId.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (contractId.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostpaidCommitAutomatedInvoiceDeductionLedgerEntry &&
                    amount == other.amount &&
                    invoiceId == other.invoiceId &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    contractId == other.contractId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    invoiceId,
                    segmentId,
                    timestamp,
                    type,
                    contractId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class PostpaidCommitRolloverLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val newContractId: JsonField<String>,
            private val segmentId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("new_contract_id")
                @ExcludeMissing
                newContractId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("segment_id")
                @ExcludeMissing
                segmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, newContractId, segmentId, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun newContractId(): String = newContractId.getRequired("new_contract_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun segmentId(): String = segmentId.getRequired("segment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [newContractId].
             *
             * Unlike [newContractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("new_contract_id")
            @ExcludeMissing
            fun _newContractId(): JsonField<String> = newContractId

            /**
             * Returns the raw JSON value of [segmentId].
             *
             * Unlike [segmentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("segment_id")
            @ExcludeMissing
            fun _segmentId(): JsonField<String> = segmentId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PostpaidCommitRolloverLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .newContractId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun newContractId(newContractId: String) =
                    newContractId(JsonField.of(newContractId))

                /**
                 * Sets [Builder.newContractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.newContractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun newContractId(newContractId: JsonField<String>) = apply {
                    this.newContractId = newContractId
                }

                fun segmentId(segmentId: String) = segmentId(JsonField.of(segmentId))

                /**
                 * Sets [Builder.segmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.segmentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun segmentId(segmentId: JsonField<String>) = apply { this.segmentId = segmentId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PostpaidCommitRolloverLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .newContractId()
                 * .segmentId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostpaidCommitRolloverLedgerEntry =
                    PostpaidCommitRolloverLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("newContractId", newContractId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PostpaidCommitRolloverLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                newContractId()
                segmentId()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (newContractId.asKnown().isPresent) 1 else 0) +
                    (if (segmentId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostpaidCommitRolloverLedgerEntry &&
                    amount == other.amount &&
                    newContractId == other.newContractId &&
                    segmentId == other.segmentId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    newContractId,
                    segmentId,
                    timestamp,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitRolloverLedgerEntry{amount=$amount, newContractId=$newContractId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PostpaidCommitTrueupLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val invoiceId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val contractId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, invoiceId, timestamp, type, contractId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contractId(): Optional<String> = contractId.getOptional("contract_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PostpaidCommitTrueupLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PostpaidCommitTrueupLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .invoiceId()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostpaidCommitTrueupLedgerEntry =
                    PostpaidCommitTrueupLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        contractId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PostpaidCommitTrueupLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                invoiceId()
                timestamp()
                type().validate()
                contractId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (invoiceId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (contractId.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostpaidCommitTrueupLedgerEntry &&
                    amount == other.amount &&
                    invoiceId == other.invoiceId &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    contractId == other.contractId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, invoiceId, timestamp, type, contractId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitTrueupLedgerEntry{amount=$amount, invoiceId=$invoiceId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class PrepaidCommitManualLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val reason: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, reason, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): String = reason.getRequired("reason")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PrepaidCommitManualLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .reason()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PrepaidCommitManualLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .reason()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PrepaidCommitManualLedgerEntry =
                    PrepaidCommitManualLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("reason", reason),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PrepaidCommitManualLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                reason()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (reason.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PrepaidCommitManualLedgerEntry &&
                    amount == other.amount &&
                    reason == other.reason &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, reason, timestamp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PrepaidCommitManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PostpaidCommitManualLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val reason: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, reason, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): String = reason.getRequired("reason")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PostpaidCommitManualLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .reason()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PostpaidCommitManualLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .reason()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostpaidCommitManualLedgerEntry =
                    PostpaidCommitManualLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("reason", reason),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PostpaidCommitManualLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                reason()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (reason.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostpaidCommitManualLedgerEntry &&
                    amount == other.amount &&
                    reason == other.reason &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, reason, timestamp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommitManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class PostpaidCommitExpirationLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, timestamp, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PostpaidCommitExpirationLedgerEntry].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .timestamp()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PostpaidCommitExpirationLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .timestamp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostpaidCommitExpirationLedgerEntry =
                    PostpaidCommitExpirationLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PostpaidCommitExpirationLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                amount()
                timestamp()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostpaidCommitExpirationLedgerEntry &&
                    amount == other.amount &&
                    timestamp == other.timestamp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, timestamp, type, additionalProperties)
            }

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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RateType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RateType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RolledOverFrom
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commitId: JsonField<String>,
        private val contractId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("commit_id")
            @ExcludeMissing
            commitId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
        ) : this(commitId, contractId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commitId(): String = commitId.getRequired("commit_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * Returns the raw JSON value of [commitId].
         *
         * Unlike [commitId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [RolledOverFrom].
             *
             * The following fields are required:
             * ```java
             * .commitId()
             * .contractId()
             * ```
             */
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

            /**
             * Sets [Builder.commitId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [RolledOverFrom].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .commitId()
             * .contractId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RolledOverFrom =
                RolledOverFrom(
                    checkRequired("commitId", commitId),
                    checkRequired("contractId", contractId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RolledOverFrom = apply {
            if (validated) {
                return@apply
            }

            commitId()
            contractId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (commitId.asKnown().isPresent) 1 else 0) +
                (if (contractId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RolledOverFrom &&
                commitId == other.commitId &&
                contractId == other.contractId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(commitId, contractId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RolledOverFrom{commitId=$commitId, contractId=$contractId, additionalProperties=$additionalProperties}"
    }

    /**
     * The subscription configuration for this commit, if it was generated from a recurring commit
     * with a subscription attached.
     */
    class SubscriptionConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allocation: JsonField<Allocation>,
        private val applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>,
        private val subscriptionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allocation")
            @ExcludeMissing
            allocation: JsonField<Allocation> = JsonMissing.of(),
            @JsonProperty("apply_seat_increase_config")
            @ExcludeMissing
            applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
        ) : this(allocation, applySeatIncreaseConfig, subscriptionId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allocation(): Optional<Allocation> = allocation.getOptional("allocation")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applySeatIncreaseConfig(): Optional<ApplySeatIncreaseConfig> =
            applySeatIncreaseConfig.getOptional("apply_seat_increase_config")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionId(): Optional<String> = subscriptionId.getOptional("subscription_id")

        /**
         * Returns the raw JSON value of [allocation].
         *
         * Unlike [allocation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allocation")
        @ExcludeMissing
        fun _allocation(): JsonField<Allocation> = allocation

        /**
         * Returns the raw JSON value of [applySeatIncreaseConfig].
         *
         * Unlike [applySeatIncreaseConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("apply_seat_increase_config")
        @ExcludeMissing
        fun _applySeatIncreaseConfig(): JsonField<ApplySeatIncreaseConfig> = applySeatIncreaseConfig

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [SubscriptionConfig]. */
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

            /**
             * Sets [Builder.allocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocation] with a well-typed [Allocation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allocation(allocation: JsonField<Allocation>) = apply {
                this.allocation = allocation
            }

            fun applySeatIncreaseConfig(applySeatIncreaseConfig: ApplySeatIncreaseConfig) =
                applySeatIncreaseConfig(JsonField.of(applySeatIncreaseConfig))

            /**
             * Sets [Builder.applySeatIncreaseConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applySeatIncreaseConfig] with a well-typed
             * [ApplySeatIncreaseConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun applySeatIncreaseConfig(
                applySeatIncreaseConfig: JsonField<ApplySeatIncreaseConfig>
            ) = apply { this.applySeatIncreaseConfig = applySeatIncreaseConfig }

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [SubscriptionConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubscriptionConfig =
                SubscriptionConfig(
                    allocation,
                    applySeatIncreaseConfig,
                    subscriptionId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SubscriptionConfig = apply {
            if (validated) {
                return@apply
            }

            allocation().ifPresent { it.validate() }
            applySeatIncreaseConfig().ifPresent { it.validate() }
            subscriptionId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (allocation.asKnown().getOrNull()?.validity() ?: 0) +
                (applySeatIncreaseConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subscriptionId.asKnown().isPresent) 1 else 0)

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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Allocation = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Allocation && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ApplySeatIncreaseConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val isProrated: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("is_prorated")
                @ExcludeMissing
                isProrated: JsonField<Boolean> = JsonMissing.of()
            ) : this(isProrated, mutableMapOf())

            /**
             * Indicates whether a mid-period seat increase should be prorated.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

            /**
             * Returns the raw JSON value of [isProrated].
             *
             * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun _isProrated(): JsonField<Boolean> = isProrated

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [ApplySeatIncreaseConfig].
                 *
                 * The following fields are required:
                 * ```java
                 * .isProrated()
                 * ```
                 */
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

                /**
                 * Sets [Builder.isProrated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isProrated] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [ApplySeatIncreaseConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .isProrated()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApplySeatIncreaseConfig =
                    ApplySeatIncreaseConfig(
                        checkRequired("isProrated", isProrated),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ApplySeatIncreaseConfig = apply {
                if (validated) {
                    return@apply
                }

                isProrated()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (if (isProrated.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApplySeatIncreaseConfig &&
                    isProrated == other.isProrated &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(isProrated, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplySeatIncreaseConfig{isProrated=$isProrated, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionConfig &&
                allocation == other.allocation &&
                applySeatIncreaseConfig == other.applySeatIncreaseConfig &&
                subscriptionId == other.subscriptionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(allocation, applySeatIncreaseConfig, subscriptionId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionConfig{allocation=$allocation, applySeatIncreaseConfig=$applySeatIncreaseConfig, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Commit &&
            id == other.id &&
            createdAt == other.createdAt &&
            product == other.product &&
            type == other.type &&
            accessSchedule == other.accessSchedule &&
            amount == other.amount &&
            applicableContractIds == other.applicableContractIds &&
            applicableProductIds == other.applicableProductIds &&
            applicableProductTags == other.applicableProductTags &&
            archivedAt == other.archivedAt &&
            balance == other.balance &&
            contract == other.contract &&
            customFields == other.customFields &&
            description == other.description &&
            hierarchyConfiguration == other.hierarchyConfiguration &&
            invoiceContract == other.invoiceContract &&
            invoiceSchedule == other.invoiceSchedule &&
            ledger == other.ledger &&
            name == other.name &&
            netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
            priority == other.priority &&
            rateType == other.rateType &&
            recurringCommitId == other.recurringCommitId &&
            rolledOverFrom == other.rolledOverFrom &&
            rolloverFraction == other.rolloverFraction &&
            salesforceOpportunityId == other.salesforceOpportunityId &&
            specifiers == other.specifiers &&
            subscriptionConfig == other.subscriptionConfig &&
            uniquenessKey == other.uniquenessKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            product,
            type,
            accessSchedule,
            amount,
            applicableContractIds,
            applicableProductIds,
            applicableProductTags,
            archivedAt,
            balance,
            contract,
            customFields,
            description,
            hierarchyConfiguration,
            invoiceContract,
            invoiceSchedule,
            ledger,
            name,
            netsuiteSalesOrderId,
            priority,
            rateType,
            recurringCommitId,
            rolledOverFrom,
            rolloverFraction,
            salesforceOpportunityId,
            specifiers,
            subscriptionConfig,
            uniquenessKey,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Commit{id=$id, createdAt=$createdAt, product=$product, type=$type, accessSchedule=$accessSchedule, amount=$amount, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, archivedAt=$archivedAt, balance=$balance, contract=$contract, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, invoiceContract=$invoiceContract, invoiceSchedule=$invoiceSchedule, ledger=$ledger, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, recurringCommitId=$recurringCommitId, rolledOverFrom=$rolledOverFrom, rolloverFraction=$rolloverFraction, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
