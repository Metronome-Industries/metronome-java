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

class Credit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val product: JsonField<Product>,
    private val type: JsonField<Type>,
    private val accessSchedule: JsonField<ScheduleDuration>,
    private val applicableContractIds: JsonField<List<String>>,
    private val applicableProductIds: JsonField<List<String>>,
    private val applicableProductTags: JsonField<List<String>>,
    private val balance: JsonField<Double>,
    private val contract: JsonField<Contract>,
    private val customFields: JsonField<CustomFields>,
    private val description: JsonField<String>,
    private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
    private val ledger: JsonField<List<Ledger>>,
    private val name: JsonField<String>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val priority: JsonField<Double>,
    private val rateType: JsonField<RateType>,
    private val recurringCreditId: JsonField<String>,
    private val rolledOverFrom: JsonField<RolledOverFrom>,
    private val salesforceOpportunityId: JsonField<String>,
    private val specifiers: JsonField<List<CommitSpecifier>>,
    private val subscriptionConfig: JsonField<SubscriptionConfig>,
    private val uniquenessKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("access_schedule")
        @ExcludeMissing
        accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
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
        @JsonProperty("ledger") @ExcludeMissing ledger: JsonField<List<Ledger>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rate_type") @ExcludeMissing rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("recurring_credit_id")
        @ExcludeMissing
        recurringCreditId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rolled_over_from")
        @ExcludeMissing
        rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of(),
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
        product,
        type,
        accessSchedule,
        applicableContractIds,
        applicableProductIds,
        applicableProductTags,
        balance,
        contract,
        customFields,
        description,
        hierarchyConfiguration,
        ledger,
        name,
        netsuiteSalesOrderId,
        priority,
        rateType,
        recurringCreditId,
        rolledOverFrom,
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
     * The schedule that the customer will gain access to the credits.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessSchedule(): Optional<ScheduleDuration> = accessSchedule.getOptional("access_schedule")

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
     * Optional configuration for credit hierarchy access control
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
        hierarchyConfiguration.getOptional("hierarchy_configuration")

    /**
     * A list of ordered events that impact the balance of a credit. For example, an invoice
     * deduction or an expiration.
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
     * The ID of the recurring credit that this credit was generated from, if applicable.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recurringCreditId(): Optional<String> = recurringCreditId.getOptional("recurring_credit_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolledOverFrom(): Optional<RolledOverFrom> = rolledOverFrom.getOptional("rolled_over_from")

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
     * The subscription configuration for this credit, if it was generated from a recurring credit
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
     * Returns the raw JSON value of [recurringCreditId].
     *
     * Unlike [recurringCreditId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recurring_credit_id")
    @ExcludeMissing
    fun _recurringCreditId(): JsonField<String> = recurringCreditId

    /**
     * Returns the raw JSON value of [rolledOverFrom].
     *
     * Unlike [rolledOverFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rolled_over_from")
    @ExcludeMissing
    fun _rolledOverFrom(): JsonField<RolledOverFrom> = rolledOverFrom

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
         * Returns a mutable builder for constructing an instance of [Credit].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .product()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Credit]. */
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
        private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
            JsonMissing.of()
        private var ledger: JsonField<MutableList<Ledger>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var recurringCreditId: JsonField<String> = JsonMissing.of()
        private var rolledOverFrom: JsonField<RolledOverFrom> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
        private var subscriptionConfig: JsonField<SubscriptionConfig> = JsonMissing.of()
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
            hierarchyConfiguration = credit.hierarchyConfiguration
            ledger = credit.ledger.map { it.toMutableList() }
            name = credit.name
            netsuiteSalesOrderId = credit.netsuiteSalesOrderId
            priority = credit.priority
            rateType = credit.rateType
            recurringCreditId = credit.recurringCreditId
            rolledOverFrom = credit.rolledOverFrom
            salesforceOpportunityId = credit.salesforceOpportunityId
            specifiers = credit.specifiers.map { it.toMutableList() }
            subscriptionConfig = credit.subscriptionConfig
            uniquenessKey = credit.uniquenessKey
            additionalProperties = credit.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** The schedule that the customer will gain access to the credits. */
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

        /** Optional configuration for credit hierarchy access control */
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

        /**
         * A list of ordered events that impact the balance of a credit. For example, an invoice
         * deduction or an expiration.
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
         * `Ledger.ofCreditSegmentStartLedgerEntry(creditSegmentStartLedgerEntry)`.
         */
        fun addLedger(creditSegmentStartLedgerEntry: Ledger.CreditSegmentStartLedgerEntry) =
            addLedger(Ledger.ofCreditSegmentStartLedgerEntry(creditSegmentStartLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofCreditAutomatedInvoiceDeductionLedgerEntry(creditAutomatedInvoiceDeductionLedgerEntry)`.
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
         * Alias for calling [addLedger] with
         * `Ledger.ofCreditExpirationLedgerEntry(creditExpirationLedgerEntry)`.
         */
        fun addLedger(creditExpirationLedgerEntry: Ledger.CreditExpirationLedgerEntry) =
            addLedger(Ledger.ofCreditExpirationLedgerEntry(creditExpirationLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofCreditCanceledLedgerEntry(creditCanceledLedgerEntry)`.
         */
        fun addLedger(creditCanceledLedgerEntry: Ledger.CreditCanceledLedgerEntry) =
            addLedger(Ledger.ofCreditCanceledLedgerEntry(creditCanceledLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofCreditCreditedLedgerEntry(creditCreditedLedgerEntry)`.
         */
        fun addLedger(creditCreditedLedgerEntry: Ledger.CreditCreditedLedgerEntry) =
            addLedger(Ledger.ofCreditCreditedLedgerEntry(creditCreditedLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofCreditManualLedgerEntry(creditManualLedgerEntry)`.
         */
        fun addLedger(creditManualLedgerEntry: Ledger.CreditManualLedgerEntry) =
            addLedger(Ledger.ofCreditManualLedgerEntry(creditManualLedgerEntry))

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofCreditSeatBasedAdjustmentLedgerEntry(creditSeatBasedAdjustmentLedgerEntry)`.
         */
        fun addLedger(
            creditSeatBasedAdjustmentLedgerEntry: Ledger.CreditSeatBasedAdjustmentLedgerEntry
        ) =
            addLedger(
                Ledger.ofCreditSeatBasedAdjustmentLedgerEntry(creditSeatBasedAdjustmentLedgerEntry)
            )

        /**
         * Alias for calling [addLedger] with
         * `Ledger.ofCreditRolloverLedgerEntry(creditRolloverLedgerEntry)`.
         */
        fun addLedger(creditRolloverLedgerEntry: Ledger.CreditRolloverLedgerEntry) =
            addLedger(Ledger.ofCreditRolloverLedgerEntry(creditRolloverLedgerEntry))

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

        /** The ID of the recurring credit that this credit was generated from, if applicable. */
        fun recurringCreditId(recurringCreditId: String) =
            recurringCreditId(JsonField.of(recurringCreditId))

        /**
         * Sets [Builder.recurringCreditId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringCreditId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recurringCreditId(recurringCreditId: JsonField<String>) = apply {
            this.recurringCreditId = recurringCreditId
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
         * The subscription configuration for this credit, if it was generated from a recurring
         * credit with a subscription attached.
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
         * Returns an immutable instance of [Credit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .product()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                hierarchyConfiguration,
                (ledger ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                netsuiteSalesOrderId,
                priority,
                rateType,
                recurringCreditId,
                rolledOverFrom,
                salesforceOpportunityId,
                (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                subscriptionConfig,
                uniquenessKey,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Credit = apply {
        if (validated) {
            return@apply
        }

        id()
        product().validate()
        type().validate()
        accessSchedule().ifPresent { it.validate() }
        applicableContractIds()
        applicableProductIds()
        applicableProductTags()
        balance()
        contract().ifPresent { it.validate() }
        customFields().ifPresent { it.validate() }
        description()
        hierarchyConfiguration().ifPresent { it.validate() }
        ledger().ifPresent { it.forEach { it.validate() } }
        name()
        netsuiteSalesOrderId()
        priority()
        rateType().ifPresent { it.validate() }
        recurringCreditId()
        rolledOverFrom().ifPresent { it.validate() }
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
            (product.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (applicableContractIds.asKnown().getOrNull()?.size ?: 0) +
            (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
            (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
            (if (balance.asKnown().isPresent) 1 else 0) +
            (contract.asKnown().getOrNull()?.validity() ?: 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (ledger.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (rateType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recurringCreditId.asKnown().isPresent) 1 else 0) +
            (rolledOverFrom.asKnown().getOrNull()?.validity() ?: 0) +
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

            @JvmField val CREDIT = of("CREDIT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CREDIT
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
            CREDIT,
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
                CREDIT -> Value.CREDIT
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
                CREDIT -> Known.CREDIT
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
        private val creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry? =
            null,
        private val creditRolloverLedgerEntry: CreditRolloverLedgerEntry? = null,
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

        fun creditSeatBasedAdjustmentLedgerEntry(): Optional<CreditSeatBasedAdjustmentLedgerEntry> =
            Optional.ofNullable(creditSeatBasedAdjustmentLedgerEntry)

        fun creditRolloverLedgerEntry(): Optional<CreditRolloverLedgerEntry> =
            Optional.ofNullable(creditRolloverLedgerEntry)

        fun isCreditSegmentStartLedgerEntry(): Boolean = creditSegmentStartLedgerEntry != null

        fun isCreditAutomatedInvoiceDeductionLedgerEntry(): Boolean =
            creditAutomatedInvoiceDeductionLedgerEntry != null

        fun isCreditExpirationLedgerEntry(): Boolean = creditExpirationLedgerEntry != null

        fun isCreditCanceledLedgerEntry(): Boolean = creditCanceledLedgerEntry != null

        fun isCreditCreditedLedgerEntry(): Boolean = creditCreditedLedgerEntry != null

        fun isCreditManualLedgerEntry(): Boolean = creditManualLedgerEntry != null

        fun isCreditSeatBasedAdjustmentLedgerEntry(): Boolean =
            creditSeatBasedAdjustmentLedgerEntry != null

        fun isCreditRolloverLedgerEntry(): Boolean = creditRolloverLedgerEntry != null

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

        fun asCreditSeatBasedAdjustmentLedgerEntry(): CreditSeatBasedAdjustmentLedgerEntry =
            creditSeatBasedAdjustmentLedgerEntry.getOrThrow("creditSeatBasedAdjustmentLedgerEntry")

        fun asCreditRolloverLedgerEntry(): CreditRolloverLedgerEntry =
            creditRolloverLedgerEntry.getOrThrow("creditRolloverLedgerEntry")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
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
                creditSeatBasedAdjustmentLedgerEntry != null ->
                    visitor.visitCreditSeatBasedAdjustmentLedgerEntry(
                        creditSeatBasedAdjustmentLedgerEntry
                    )
                creditRolloverLedgerEntry != null ->
                    visitor.visitCreditRolloverLedgerEntry(creditRolloverLedgerEntry)
                else -> visitor.unknown(_json)
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

                    override fun visitCreditSeatBasedAdjustmentLedgerEntry(
                        creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
                    ) {
                        creditSeatBasedAdjustmentLedgerEntry.validate()
                    }

                    override fun visitCreditRolloverLedgerEntry(
                        creditRolloverLedgerEntry: CreditRolloverLedgerEntry
                    ) {
                        creditRolloverLedgerEntry.validate()
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
                    override fun visitCreditSegmentStartLedgerEntry(
                        creditSegmentStartLedgerEntry: CreditSegmentStartLedgerEntry
                    ) = creditSegmentStartLedgerEntry.validity()

                    override fun visitCreditAutomatedInvoiceDeductionLedgerEntry(
                        creditAutomatedInvoiceDeductionLedgerEntry:
                            CreditAutomatedInvoiceDeductionLedgerEntry
                    ) = creditAutomatedInvoiceDeductionLedgerEntry.validity()

                    override fun visitCreditExpirationLedgerEntry(
                        creditExpirationLedgerEntry: CreditExpirationLedgerEntry
                    ) = creditExpirationLedgerEntry.validity()

                    override fun visitCreditCanceledLedgerEntry(
                        creditCanceledLedgerEntry: CreditCanceledLedgerEntry
                    ) = creditCanceledLedgerEntry.validity()

                    override fun visitCreditCreditedLedgerEntry(
                        creditCreditedLedgerEntry: CreditCreditedLedgerEntry
                    ) = creditCreditedLedgerEntry.validity()

                    override fun visitCreditManualLedgerEntry(
                        creditManualLedgerEntry: CreditManualLedgerEntry
                    ) = creditManualLedgerEntry.validity()

                    override fun visitCreditSeatBasedAdjustmentLedgerEntry(
                        creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
                    ) = creditSeatBasedAdjustmentLedgerEntry.validity()

                    override fun visitCreditRolloverLedgerEntry(
                        creditRolloverLedgerEntry: CreditRolloverLedgerEntry
                    ) = creditRolloverLedgerEntry.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ledger &&
                creditSegmentStartLedgerEntry == other.creditSegmentStartLedgerEntry &&
                creditAutomatedInvoiceDeductionLedgerEntry ==
                    other.creditAutomatedInvoiceDeductionLedgerEntry &&
                creditExpirationLedgerEntry == other.creditExpirationLedgerEntry &&
                creditCanceledLedgerEntry == other.creditCanceledLedgerEntry &&
                creditCreditedLedgerEntry == other.creditCreditedLedgerEntry &&
                creditManualLedgerEntry == other.creditManualLedgerEntry &&
                creditSeatBasedAdjustmentLedgerEntry ==
                    other.creditSeatBasedAdjustmentLedgerEntry &&
                creditRolloverLedgerEntry == other.creditRolloverLedgerEntry
        }

        override fun hashCode(): Int =
            Objects.hash(
                creditSegmentStartLedgerEntry,
                creditAutomatedInvoiceDeductionLedgerEntry,
                creditExpirationLedgerEntry,
                creditCanceledLedgerEntry,
                creditCreditedLedgerEntry,
                creditManualLedgerEntry,
                creditSeatBasedAdjustmentLedgerEntry,
                creditRolloverLedgerEntry,
            )

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
                creditSeatBasedAdjustmentLedgerEntry != null ->
                    "Ledger{creditSeatBasedAdjustmentLedgerEntry=$creditSeatBasedAdjustmentLedgerEntry}"
                creditRolloverLedgerEntry != null ->
                    "Ledger{creditRolloverLedgerEntry=$creditRolloverLedgerEntry}"
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

            @JvmStatic
            fun ofCreditSeatBasedAdjustmentLedgerEntry(
                creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
            ) = Ledger(creditSeatBasedAdjustmentLedgerEntry = creditSeatBasedAdjustmentLedgerEntry)

            @JvmStatic
            fun ofCreditRolloverLedgerEntry(creditRolloverLedgerEntry: CreditRolloverLedgerEntry) =
                Ledger(creditRolloverLedgerEntry = creditRolloverLedgerEntry)
        }

        /** An interface that defines how to map each variant of [Ledger] to a value of type [T]. */
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

            fun visitCreditSeatBasedAdjustmentLedgerEntry(
                creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
            ): T

            fun visitCreditRolloverLedgerEntry(
                creditRolloverLedgerEntry: CreditRolloverLedgerEntry
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
                            tryDeserialize(node, jacksonTypeRef<CreditSegmentStartLedgerEntry>())
                                ?.let { Ledger(creditSegmentStartLedgerEntry = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<CreditAutomatedInvoiceDeductionLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(
                                        creditAutomatedInvoiceDeductionLedgerEntry = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<CreditExpirationLedgerEntry>())
                                ?.let { Ledger(creditExpirationLedgerEntry = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<CreditCanceledLedgerEntry>())?.let {
                                Ledger(creditCanceledLedgerEntry = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CreditCreditedLedgerEntry>())?.let {
                                Ledger(creditCreditedLedgerEntry = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CreditManualLedgerEntry>())?.let {
                                Ledger(creditManualLedgerEntry = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<CreditSeatBasedAdjustmentLedgerEntry>(),
                                )
                                ?.let {
                                    Ledger(creditSeatBasedAdjustmentLedgerEntry = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<CreditRolloverLedgerEntry>())?.let {
                                Ledger(creditRolloverLedgerEntry = it, _json = json)
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
                    value.creditSeatBasedAdjustmentLedgerEntry != null ->
                        generator.writeObject(value.creditSeatBasedAdjustmentLedgerEntry)
                    value.creditRolloverLedgerEntry != null ->
                        generator.writeObject(value.creditRolloverLedgerEntry)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Ledger")
                }
            }
        }

        class CreditSegmentStartLedgerEntry
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
                 * [CreditSegmentStartLedgerEntry].
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

            /** A builder for [CreditSegmentStartLedgerEntry]. */
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
                 * Returns an immutable instance of [CreditSegmentStartLedgerEntry].
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
                fun build(): CreditSegmentStartLedgerEntry =
                    CreditSegmentStartLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditSegmentStartLedgerEntry = apply {
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

                    @JvmField val CREDIT_SEGMENT_START = of("CREDIT_SEGMENT_START")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_SEGMENT_START
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
                    CREDIT_SEGMENT_START,
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
                        CREDIT_SEGMENT_START -> Value.CREDIT_SEGMENT_START
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
                        CREDIT_SEGMENT_START -> Known.CREDIT_SEGMENT_START
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

                return other is CreditSegmentStartLedgerEntry &&
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
                "CreditSegmentStartLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class CreditAutomatedInvoiceDeductionLedgerEntry
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
                 * [CreditAutomatedInvoiceDeductionLedgerEntry].
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

            /** A builder for [CreditAutomatedInvoiceDeductionLedgerEntry]. */
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
                    creditAutomatedInvoiceDeductionLedgerEntry:
                        CreditAutomatedInvoiceDeductionLedgerEntry
                ) = apply {
                    amount = creditAutomatedInvoiceDeductionLedgerEntry.amount
                    invoiceId = creditAutomatedInvoiceDeductionLedgerEntry.invoiceId
                    segmentId = creditAutomatedInvoiceDeductionLedgerEntry.segmentId
                    timestamp = creditAutomatedInvoiceDeductionLedgerEntry.timestamp
                    type = creditAutomatedInvoiceDeductionLedgerEntry.type
                    contractId = creditAutomatedInvoiceDeductionLedgerEntry.contractId
                    additionalProperties =
                        creditAutomatedInvoiceDeductionLedgerEntry.additionalProperties
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
                 * Returns an immutable instance of [CreditAutomatedInvoiceDeductionLedgerEntry].
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
                fun build(): CreditAutomatedInvoiceDeductionLedgerEntry =
                    CreditAutomatedInvoiceDeductionLedgerEntry(
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

            fun validate(): CreditAutomatedInvoiceDeductionLedgerEntry = apply {
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
                    val CREDIT_AUTOMATED_INVOICE_DEDUCTION =
                        of("CREDIT_AUTOMATED_INVOICE_DEDUCTION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_AUTOMATED_INVOICE_DEDUCTION
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
                    CREDIT_AUTOMATED_INVOICE_DEDUCTION,
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
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Value.CREDIT_AUTOMATED_INVOICE_DEDUCTION
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
                        CREDIT_AUTOMATED_INVOICE_DEDUCTION ->
                            Known.CREDIT_AUTOMATED_INVOICE_DEDUCTION
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

                return other is CreditAutomatedInvoiceDeductionLedgerEntry &&
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
                "CreditAutomatedInvoiceDeductionLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class CreditExpirationLedgerEntry
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
                 * [CreditExpirationLedgerEntry].
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

            /** A builder for [CreditExpirationLedgerEntry]. */
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
                 * Returns an immutable instance of [CreditExpirationLedgerEntry].
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
                fun build(): CreditExpirationLedgerEntry =
                    CreditExpirationLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditExpirationLedgerEntry = apply {
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

                    @JvmField val CREDIT_EXPIRATION = of("CREDIT_EXPIRATION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_EXPIRATION
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
                    CREDIT_EXPIRATION,
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
                        CREDIT_EXPIRATION -> Value.CREDIT_EXPIRATION
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
                        CREDIT_EXPIRATION -> Known.CREDIT_EXPIRATION
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

                return other is CreditExpirationLedgerEntry &&
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
                "CreditExpirationLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class CreditCanceledLedgerEntry
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
                 * [CreditCanceledLedgerEntry].
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

            /** A builder for [CreditCanceledLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var contractId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditCanceledLedgerEntry: CreditCanceledLedgerEntry) = apply {
                    amount = creditCanceledLedgerEntry.amount
                    invoiceId = creditCanceledLedgerEntry.invoiceId
                    segmentId = creditCanceledLedgerEntry.segmentId
                    timestamp = creditCanceledLedgerEntry.timestamp
                    type = creditCanceledLedgerEntry.type
                    contractId = creditCanceledLedgerEntry.contractId
                    additionalProperties =
                        creditCanceledLedgerEntry.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [CreditCanceledLedgerEntry].
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
                fun build(): CreditCanceledLedgerEntry =
                    CreditCanceledLedgerEntry(
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

            fun validate(): CreditCanceledLedgerEntry = apply {
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

                    @JvmField val CREDIT_CANCELED = of("CREDIT_CANCELED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_CANCELED
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
                    CREDIT_CANCELED,
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
                        CREDIT_CANCELED -> Value.CREDIT_CANCELED
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
                        CREDIT_CANCELED -> Known.CREDIT_CANCELED
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

                return other is CreditCanceledLedgerEntry &&
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
                "CreditCanceledLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class CreditCreditedLedgerEntry
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
                 * [CreditCreditedLedgerEntry].
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

            /** A builder for [CreditCreditedLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var invoiceId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var contractId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditCreditedLedgerEntry: CreditCreditedLedgerEntry) = apply {
                    amount = creditCreditedLedgerEntry.amount
                    invoiceId = creditCreditedLedgerEntry.invoiceId
                    segmentId = creditCreditedLedgerEntry.segmentId
                    timestamp = creditCreditedLedgerEntry.timestamp
                    type = creditCreditedLedgerEntry.type
                    contractId = creditCreditedLedgerEntry.contractId
                    additionalProperties =
                        creditCreditedLedgerEntry.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [CreditCreditedLedgerEntry].
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
                fun build(): CreditCreditedLedgerEntry =
                    CreditCreditedLedgerEntry(
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

            fun validate(): CreditCreditedLedgerEntry = apply {
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

                    @JvmField val CREDIT_CREDITED = of("CREDIT_CREDITED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_CREDITED
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
                    CREDIT_CREDITED,
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
                        CREDIT_CREDITED -> Value.CREDIT_CREDITED
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
                        CREDIT_CREDITED -> Known.CREDIT_CREDITED
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

                return other is CreditCreditedLedgerEntry &&
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
                "CreditCreditedLedgerEntry{amount=$amount, invoiceId=$invoiceId, segmentId=$segmentId, timestamp=$timestamp, type=$type, contractId=$contractId, additionalProperties=$additionalProperties}"
        }

        class CreditManualLedgerEntry
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
                 * [CreditManualLedgerEntry].
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

            /** A builder for [CreditManualLedgerEntry]. */
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
                 * Returns an immutable instance of [CreditManualLedgerEntry].
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
                fun build(): CreditManualLedgerEntry =
                    CreditManualLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("reason", reason),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditManualLedgerEntry = apply {
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

                    @JvmField val CREDIT_MANUAL = of("CREDIT_MANUAL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_MANUAL
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
                    CREDIT_MANUAL,
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
                        CREDIT_MANUAL -> Value.CREDIT_MANUAL
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
                        CREDIT_MANUAL -> Known.CREDIT_MANUAL
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

                return other is CreditManualLedgerEntry &&
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
                "CreditManualLedgerEntry{amount=$amount, reason=$reason, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class CreditSeatBasedAdjustmentLedgerEntry
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
                 * [CreditSeatBasedAdjustmentLedgerEntry].
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

            /** A builder for [CreditSeatBasedAdjustmentLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    creditSeatBasedAdjustmentLedgerEntry: CreditSeatBasedAdjustmentLedgerEntry
                ) = apply {
                    amount = creditSeatBasedAdjustmentLedgerEntry.amount
                    segmentId = creditSeatBasedAdjustmentLedgerEntry.segmentId
                    timestamp = creditSeatBasedAdjustmentLedgerEntry.timestamp
                    type = creditSeatBasedAdjustmentLedgerEntry.type
                    additionalProperties =
                        creditSeatBasedAdjustmentLedgerEntry.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [CreditSeatBasedAdjustmentLedgerEntry].
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
                fun build(): CreditSeatBasedAdjustmentLedgerEntry =
                    CreditSeatBasedAdjustmentLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditSeatBasedAdjustmentLedgerEntry = apply {
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

                    @JvmField val CREDIT_SEAT_BASED_ADJUSTMENT = of("CREDIT_SEAT_BASED_ADJUSTMENT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_SEAT_BASED_ADJUSTMENT
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
                    CREDIT_SEAT_BASED_ADJUSTMENT,
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
                        CREDIT_SEAT_BASED_ADJUSTMENT -> Value.CREDIT_SEAT_BASED_ADJUSTMENT
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
                        CREDIT_SEAT_BASED_ADJUSTMENT -> Known.CREDIT_SEAT_BASED_ADJUSTMENT
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

                return other is CreditSeatBasedAdjustmentLedgerEntry &&
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
                "CreditSeatBasedAdjustmentLedgerEntry{amount=$amount, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
        }

        class CreditRolloverLedgerEntry
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
                 * [CreditRolloverLedgerEntry].
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

            /** A builder for [CreditRolloverLedgerEntry]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var newContractId: JsonField<String>? = null
                private var segmentId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditRolloverLedgerEntry: CreditRolloverLedgerEntry) = apply {
                    amount = creditRolloverLedgerEntry.amount
                    newContractId = creditRolloverLedgerEntry.newContractId
                    segmentId = creditRolloverLedgerEntry.segmentId
                    timestamp = creditRolloverLedgerEntry.timestamp
                    type = creditRolloverLedgerEntry.type
                    additionalProperties =
                        creditRolloverLedgerEntry.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [CreditRolloverLedgerEntry].
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
                fun build(): CreditRolloverLedgerEntry =
                    CreditRolloverLedgerEntry(
                        checkRequired("amount", amount),
                        checkRequired("newContractId", newContractId),
                        checkRequired("segmentId", segmentId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditRolloverLedgerEntry = apply {
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

                    @JvmField val CREDIT_ROLLOVER = of("CREDIT_ROLLOVER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_ROLLOVER
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
                    CREDIT_ROLLOVER,
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
                        CREDIT_ROLLOVER -> Value.CREDIT_ROLLOVER
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
                        CREDIT_ROLLOVER -> Known.CREDIT_ROLLOVER
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

                return other is CreditRolloverLedgerEntry &&
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
                "CreditRolloverLedgerEntry{amount=$amount, newContractId=$newContractId, segmentId=$segmentId, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
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
        private val contractId: JsonField<String>,
        private val creditId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_id")
            @ExcludeMissing
            creditId: JsonField<String> = JsonMissing.of(),
        ) : this(contractId, creditId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditId(): String = creditId.getRequired("credit_id")

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [creditId].
         *
         * Unlike [creditId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_id") @ExcludeMissing fun _creditId(): JsonField<String> = creditId

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
             * .contractId()
             * .creditId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RolledOverFrom]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var creditId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rolledOverFrom: RolledOverFrom) = apply {
                contractId = rolledOverFrom.contractId
                creditId = rolledOverFrom.creditId
                additionalProperties = rolledOverFrom.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun creditId(creditId: String) = creditId(JsonField.of(creditId))

            /**
             * Sets [Builder.creditId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditId(creditId: JsonField<String>) = apply { this.creditId = creditId }

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
             * .contractId()
             * .creditId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RolledOverFrom =
                RolledOverFrom(
                    checkRequired("contractId", contractId),
                    checkRequired("creditId", creditId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RolledOverFrom = apply {
            if (validated) {
                return@apply
            }

            contractId()
            creditId()
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
            (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (creditId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RolledOverFrom &&
                contractId == other.contractId &&
                creditId == other.creditId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contractId, creditId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RolledOverFrom{contractId=$contractId, creditId=$creditId, additionalProperties=$additionalProperties}"
    }

    /**
     * The subscription configuration for this credit, if it was generated from a recurring credit
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

        return other is Credit &&
            id == other.id &&
            product == other.product &&
            type == other.type &&
            accessSchedule == other.accessSchedule &&
            applicableContractIds == other.applicableContractIds &&
            applicableProductIds == other.applicableProductIds &&
            applicableProductTags == other.applicableProductTags &&
            balance == other.balance &&
            contract == other.contract &&
            customFields == other.customFields &&
            description == other.description &&
            hierarchyConfiguration == other.hierarchyConfiguration &&
            ledger == other.ledger &&
            name == other.name &&
            netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
            priority == other.priority &&
            rateType == other.rateType &&
            recurringCreditId == other.recurringCreditId &&
            rolledOverFrom == other.rolledOverFrom &&
            salesforceOpportunityId == other.salesforceOpportunityId &&
            specifiers == other.specifiers &&
            subscriptionConfig == other.subscriptionConfig &&
            uniquenessKey == other.uniquenessKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            product,
            type,
            accessSchedule,
            applicableContractIds,
            applicableProductIds,
            applicableProductTags,
            balance,
            contract,
            customFields,
            description,
            hierarchyConfiguration,
            ledger,
            name,
            netsuiteSalesOrderId,
            priority,
            rateType,
            recurringCreditId,
            rolledOverFrom,
            salesforceOpportunityId,
            specifiers,
            subscriptionConfig,
            uniquenessKey,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Credit{id=$id, product=$product, type=$type, accessSchedule=$accessSchedule, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, balance=$balance, contract=$contract, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, ledger=$ledger, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, recurringCreditId=$recurringCreditId, rolledOverFrom=$rolledOverFrom, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
}
