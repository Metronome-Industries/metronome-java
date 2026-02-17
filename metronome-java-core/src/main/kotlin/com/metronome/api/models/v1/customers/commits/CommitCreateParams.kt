// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.commits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CommitSpecifierInput
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates customer-level commits that establish spending commitments for customers across their
 * Metronome usage. Commits represent contracted spending obligations that can be either prepaid
 * (paid upfront) or postpaid (billed later).
 *
 * Note: In most cases, you should add commitments directly to customer contracts using the
 * contract/create or contract/edit APIs.
 *
 * ### Use this endpoint to:
 * Use this endpoint when you need to establish customer-level spending commitments that can be
 * applied across multiple contracts or scoped to specific contracts. Customer-level commits are
 * ideal for:
 * - Enterprise-wide minimum spending agreements that span multiple contracts
 * - Multi-contract volume commitments with shared spending pools
 * - Cross-contract discount tiers based on aggregate usage
 *
 * #### Commit type Requirements:
 * - You must specify either "prepaid" or "postpaid" as the commit type:
 * - Prepaid commits: Customer pays upfront; invoice_schedule is optional (if omitted, creates a
 *   commit without an invoice)
 * - Postpaid commits: Customer pays when the commitment expires (the end of the access_schedule);
 *   invoice_schedule is required and must match access_schedule totals.
 *
 * #### Billing configuration:
 * - invoice_contract_id is required for postpaid commits and for prepaid commits with billing (only
 *   optional for free prepaid commits) unless do_not_invoice is set to true
 * - For postpaid commits: access_schedule and invoice_schedule must have matching amounts
 * - For postpaid commits: only one schedule item is allowed in both schedules.
 *
 * #### Scoping flexibility:
 * Customer-level commits can be configured in a few ways:
 * - Contract-specific: Use the `applicable_contract_ids` field to limit the commit to specific
 *   contracts
 * - Cross-contract: Leave `applicable_contract_ids` empty to allow the commit to be used across all
 *   of the customer's contracts
 *
 * #### Product targeting:
 * Commits can be scoped to specific products using applicable_product_ids, applicable_product_tags,
 * or specifiers, or left unrestricted to apply to all products.
 *
 * #### Priority considerations:
 * When multiple commits are applicable, the one with the lower priority value will be consumed
 * first. If there is a tie, contract level commits and credits will be applied before customer
 * level commits and credits. Plan your priority scheme carefully to ensure commits are applied in
 * the desired order.
 *
 * ### Usage guidelines:
 * ⚠️ Preferred Alternative: In most cases, you should add commits directly to contracts using the
 * create contract or edit contract APIs instead of creating customer-level commits. Contract-level
 * commits provide better organization and are the recommended approach for standard use cases.
 */
class CommitCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
     * schedule item is allowed and amount must match invoice_schedule total.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessSchedule(): AccessSchedule = body.accessSchedule()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * If multiple credits or commits are applicable, the one with the lower priority will apply
     * first.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priority(): Double = body.priority()

    /**
     * ID of the fixed product associated with the commit. This is required because products are
     * used to invoice the commit amount.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = body.productId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Which contract the commit applies to. If not provided, the commit applies to all contracts.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableContractIds(): Optional<List<String>> = body.applicableContractIds()

    /**
     * Which products the commit applies to. If applicable_product_ids, applicable_product_tags or
     * specifiers are not provided, the commit applies to all products.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableProductIds(): Optional<List<String>> = body.applicableProductIds()

    /**
     * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags or
     * specifiers are not provided, the commit applies to all products.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableProductTags(): Optional<List<String>> = body.applicableProductTags()

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * Used only in UI/API. It is not exposed to end customers.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The contract that this commit will be billed on. This is required for "POSTPAID" commits and
     * for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is 'free'),
     * or if do_not_invoice is set to true.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceContractId(): Optional<String> = body.invoiceContractId()

    /**
     * Required for "POSTPAID" commits: the true up invoice will be generated at this time and only
     * one schedule item is allowed; the total must match accesss_schedule amount. Optional for
     * "PREPAID" commits: if not provided, this will be a "complimentary" commit with no invoice.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceSchedule(): Optional<InvoiceSchedule> = body.invoiceSchedule()

    /**
     * displayed on invoices
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteSalesOrderId(): Optional<String> = body.netsuiteSalesOrderId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rateType(): Optional<RateType> = body.rateType()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salesforceOpportunityId(): Optional<String> = body.salesforceOpportunityId()

    /**
     * List of filters that determine what kind of customer usage draws down a commit or credit. A
     * customer's usage needs to meet the condition of at least one of the specifiers to contribute
     * to a commit's or credit's drawdown. This field cannot be used together with
     * `applicable_product_ids` or `applicable_product_tags`.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun specifiers(): Optional<List<CommitSpecifierInput>> = body.specifiers()

    /**
     * Prevents the creation of duplicates. If a request to create a commit or credit is made with a
     * uniqueness key that was previously used to create a commit or credit, a new record will not
     * be created and the request will fail with a 409 error.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    /**
     * Returns the raw JSON value of [accessSchedule].
     *
     * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accessSchedule(): JsonField<AccessSchedule> = body._accessSchedule()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priority(): JsonField<Double> = body._priority()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [applicableContractIds].
     *
     * Unlike [applicableContractIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _applicableContractIds(): JsonField<List<String>> = body._applicableContractIds()

    /**
     * Returns the raw JSON value of [applicableProductIds].
     *
     * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _applicableProductIds(): JsonField<List<String>> = body._applicableProductIds()

    /**
     * Returns the raw JSON value of [applicableProductTags].
     *
     * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _applicableProductTags(): JsonField<List<String>> = body._applicableProductTags()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [invoiceContractId].
     *
     * Unlike [invoiceContractId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoiceContractId(): JsonField<String> = body._invoiceContractId()

    /**
     * Returns the raw JSON value of [invoiceSchedule].
     *
     * Unlike [invoiceSchedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceSchedule(): JsonField<InvoiceSchedule> = body._invoiceSchedule()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [netsuiteSalesOrderId].
     *
     * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _netsuiteSalesOrderId(): JsonField<String> = body._netsuiteSalesOrderId()

    /**
     * Returns the raw JSON value of [rateType].
     *
     * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rateType(): JsonField<RateType> = body._rateType()

    /**
     * Returns the raw JSON value of [salesforceOpportunityId].
     *
     * Unlike [salesforceOpportunityId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _salesforceOpportunityId(): JsonField<String> = body._salesforceOpportunityId()

    /**
     * Returns the raw JSON value of [specifiers].
     *
     * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _specifiers(): JsonField<List<CommitSpecifierInput>> = body._specifiers()

    /**
     * Returns the raw JSON value of [uniquenessKey].
     *
     * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accessSchedule()
         * .customerId()
         * .priority()
         * .productId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitCreateParams: CommitCreateParams) = apply {
            body = commitCreateParams.body.toBuilder()
            additionalHeaders = commitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accessSchedule]
         * - [customerId]
         * - [priority]
         * - [productId]
         * - [type]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         */
        fun accessSchedule(accessSchedule: AccessSchedule) = apply {
            body.accessSchedule(accessSchedule)
        }

        /**
         * Sets [Builder.accessSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessSchedule] with a well-typed [AccessSchedule] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
            body.accessSchedule(accessSchedule)
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         */
        fun priority(priority: Double) = apply { body.priority(priority) }

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { body.priority(priority) }

        /**
         * ID of the fixed product associated with the commit. This is required because products are
         * used to invoice the commit amount.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         */
        fun applicableContractIds(applicableContractIds: List<String>) = apply {
            body.applicableContractIds(applicableContractIds)
        }

        /**
         * Sets [Builder.applicableContractIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicableContractIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicableContractIds(applicableContractIds: JsonField<List<String>>) = apply {
            body.applicableContractIds(applicableContractIds)
        }

        /**
         * Adds a single [String] to [applicableContractIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplicableContractId(applicableContractId: String) = apply {
            body.addApplicableContractId(applicableContractId)
        }

        /**
         * Which products the commit applies to. If applicable_product_ids, applicable_product_tags
         * or specifiers are not provided, the commit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: List<String>) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicableProductIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Adds a single [String] to [applicableProductIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplicableProductId(applicableProductId: String) = apply {
            body.addApplicableProductId(applicableProductId)
        }

        /**
         * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags or
         * specifiers are not provided, the commit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: List<String>) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicableProductTags] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Adds a single [String] to [applicableProductTags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplicableProductTag(applicableProductTag: String) = apply {
            body.addApplicableProductTag(applicableProductTag)
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** Used only in UI/API. It is not exposed to end customers. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free'), or if do_not_invoice is set to true.
         */
        fun invoiceContractId(invoiceContractId: String) = apply {
            body.invoiceContractId(invoiceContractId)
        }

        /**
         * Sets [Builder.invoiceContractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceContractId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.invoiceSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceSchedule] with a well-typed [InvoiceSchedule]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
            body.invoiceSchedule(invoiceSchedule)
        }

        /** displayed on invoices */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        /**
         * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        fun rateType(rateType: RateType) = apply { body.rateType(rateType) }

        /**
         * Sets [Builder.rateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateType] with a well-typed [RateType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateType(rateType: JsonField<RateType>) = apply { body.rateType(rateType) }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        /**
         * Sets [Builder.salesforceOpportunityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.salesforceOpportunityId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         */
        fun specifiers(specifiers: List<CommitSpecifierInput>) = apply {
            body.specifiers(specifiers)
        }

        /**
         * Sets [Builder.specifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specifiers] with a well-typed
         * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
            body.specifiers(specifiers)
        }

        /**
         * Adds a single [CommitSpecifierInput] to [specifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpecifier(specifier: CommitSpecifierInput) = apply { body.addSpecifier(specifier) }

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

        /**
         * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniquenessKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [CommitCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessSchedule()
         * .customerId()
         * .priority()
         * .productId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitCreateParams =
            CommitCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessSchedule: JsonField<AccessSchedule>,
        private val customerId: JsonField<String>,
        private val priority: JsonField<Double>,
        private val productId: JsonField<String>,
        private val type: JsonField<Type>,
        private val applicableContractIds: JsonField<List<String>>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val invoiceContractId: JsonField<String>,
        private val invoiceSchedule: JsonField<InvoiceSchedule>,
        private val name: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val rateType: JsonField<RateType>,
        private val salesforceOpportunityId: JsonField<String>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val uniquenessKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_schedule")
            @ExcludeMissing
            accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("applicable_contract_ids")
            @ExcludeMissing
            applicableContractIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_contract_id")
            @ExcludeMissing
            invoiceContractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonProperty("uniqueness_key")
            @ExcludeMissing
            uniquenessKey: JsonField<String> = JsonMissing.of(),
        ) : this(
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
            specifiers,
            uniquenessKey,
            mutableMapOf(),
        )

        /**
         * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
         * schedule item is allowed and amount must match invoice_schedule total.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessSchedule(): AccessSchedule = accessSchedule.getRequired("access_schedule")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * If multiple credits or commits are applicable, the one with the lower priority will apply
         * first.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Double = priority.getRequired("priority")

        /**
         * ID of the fixed product associated with the commit. This is required because products are
         * used to invoice the commit amount.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Which contract the commit applies to. If not provided, the commit applies to all
         * contracts.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableContractIds(): Optional<List<String>> =
            applicableContractIds.getOptional("applicable_contract_ids")

        /**
         * Which products the commit applies to. If applicable_product_ids, applicable_product_tags
         * or specifiers are not provided, the commit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags or
         * specifiers are not provided, the commit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Used only in UI/API. It is not exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The contract that this commit will be billed on. This is required for "POSTPAID" commits
         * and for "PREPAID" commits unless there is no invoice schedule above (i.e., the commit is
         * 'free'), or if do_not_invoice is set to true.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceContractId(): Optional<String> =
            invoiceContractId.getOptional("invoice_contract_id")

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match accesss_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceSchedule(): Optional<InvoiceSchedule> =
            invoiceSchedule.getOptional("invoice_schedule")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesforceOpportunityId(): Optional<String> =
            salesforceOpportunityId.getOptional("salesforce_opportunity_id")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * Prevents the creation of duplicates. If a request to create a commit or credit is made
         * with a uniqueness key that was previously used to create a commit or credit, a new record
         * will not be created and the request will fail with a 409 error.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniquenessKey(): Optional<String> = uniquenessKey.getOptional("uniqueness_key")

        /**
         * Returns the raw JSON value of [accessSchedule].
         *
         * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [applicableContractIds].
         *
         * Unlike [applicableContractIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_contract_ids")
        @ExcludeMissing
        fun _applicableContractIds(): JsonField<List<String>> = applicableContractIds

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [invoiceContractId].
         *
         * Unlike [invoiceContractId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_contract_id")
        @ExcludeMissing
        fun _invoiceContractId(): JsonField<String> = invoiceContractId

        /**
         * Returns the raw JSON value of [invoiceSchedule].
         *
         * Unlike [invoiceSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [netsuiteSalesOrderId].
         *
         * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

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
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /**
         * Returns the raw JSON value of [uniquenessKey].
         *
         * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .customerId()
             * .priority()
             * .productId()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
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
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accessSchedule = body.accessSchedule
                customerId = body.customerId
                priority = body.priority
                productId = body.productId
                type = body.type
                applicableContractIds = body.applicableContractIds.map { it.toMutableList() }
                applicableProductIds = body.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = body.applicableProductTags.map { it.toMutableList() }
                customFields = body.customFields
                description = body.description
                invoiceContractId = body.invoiceContractId
                invoiceSchedule = body.invoiceSchedule
                name = body.name
                netsuiteSalesOrderId = body.netsuiteSalesOrderId
                rateType = body.rateType
                salesforceOpportunityId = body.salesforceOpportunityId
                specifiers = body.specifiers.map { it.toMutableList() }
                uniquenessKey = body.uniquenessKey
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
             * schedule item is allowed and amount must match invoice_schedule total.
             */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * Sets [Builder.accessSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessSchedule] with a well-typed [AccessSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            /**
             * ID of the fixed product associated with the commit. This is required because products
             * are used to invoice the commit amount.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Which contract the commit applies to. If not provided, the commit applies to all
             * contracts.
             */
            fun applicableContractIds(applicableContractIds: List<String>) =
                applicableContractIds(JsonField.of(applicableContractIds))

            /**
             * Sets [Builder.applicableContractIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableContractIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The contract that this commit will be billed on. This is required for "POSTPAID"
             * commits and for "PREPAID" commits unless there is no invoice schedule above (i.e.,
             * the commit is 'free'), or if do_not_invoice is set to true.
             */
            fun invoiceContractId(invoiceContractId: String) =
                invoiceContractId(JsonField.of(invoiceContractId))

            /**
             * Sets [Builder.invoiceContractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceContractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.invoiceSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceSchedule] with a well-typed [InvoiceSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /**
             * Sets [Builder.salesforceOpportunityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesforceOpportunityId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
                    }
            }

            /**
             * Prevents the creation of duplicates. If a request to create a commit or credit is
             * made with a uniqueness key that was previously used to create a commit or credit, a
             * new record will not be created and the request will fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

            /**
             * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniquenessKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .customerId()
             * .priority()
             * .productId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
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
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    uniquenessKey,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accessSchedule().validate()
            customerId()
            priority()
            productId()
            type().validate()
            applicableContractIds()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            invoiceContractId()
            invoiceSchedule().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            rateType().ifPresent { it.validate() }
            salesforceOpportunityId()
            specifiers().ifPresent { it.forEach { it.validate() } }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (applicableContractIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (invoiceContractId.asKnown().isPresent) 1 else 0) +
                (invoiceSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (salesforceOpportunityId.asKnown().isPresent) 1 else 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (uniquenessKey.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accessSchedule == other.accessSchedule &&
                customerId == other.customerId &&
                priority == other.priority &&
                productId == other.productId &&
                type == other.type &&
                applicableContractIds == other.applicableContractIds &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                customFields == other.customFields &&
                description == other.description &&
                invoiceContractId == other.invoiceContractId &&
                invoiceSchedule == other.invoiceSchedule &&
                name == other.name &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                rateType == other.rateType &&
                salesforceOpportunityId == other.salesforceOpportunityId &&
                specifiers == other.specifiers &&
                uniquenessKey == other.uniquenessKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                specifiers,
                uniquenessKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accessSchedule=$accessSchedule, customerId=$customerId, priority=$priority, productId=$productId, type=$type, applicableContractIds=$applicableContractIds, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, invoiceContractId=$invoiceContractId, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, rateType=$rateType, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    /**
     * Schedule for distributing the commit to the customer. For "POSTPAID" commits only one
     * schedule item is allowed and amount must match invoice_schedule total.
     */
    class AccessSchedule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scheduleItems: JsonField<List<ScheduleItem>>,
        private val creditTypeId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("schedule_items")
            @ExcludeMissing
            scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
        ) : this(scheduleItems, creditTypeId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

        /**
         * Defaults to USD (cents) if not passed
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

        /**
         * Returns the raw JSON value of [scheduleItems].
         *
         * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("schedule_items")
        @ExcludeMissing
        fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

        /**
         * Returns the raw JSON value of [creditTypeId].
         *
         * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

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
             * Returns a mutable builder for constructing an instance of [AccessSchedule].
             *
             * The following fields are required:
             * ```java
             * .scheduleItems()
             * ```
             */
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

            /**
             * Sets [Builder.scheduleItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduleItems] with a well-typed
             * `List<ScheduleItem>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                this.scheduleItems = scheduleItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [ScheduleItem] to [scheduleItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                scheduleItems =
                    (scheduleItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scheduleItems", it).add(scheduleItem)
                    }
            }

            /** Defaults to USD (cents) if not passed */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * Sets [Builder.creditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [AccessSchedule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .scheduleItems()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccessSchedule =
                AccessSchedule(
                    checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                    creditTypeId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccessSchedule = apply {
            if (validated) {
                return@apply
            }

            scheduleItems().forEach { it.validate() }
            creditTypeId()
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
            (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (creditTypeId.asKnown().isPresent) 1 else 0)

        class ScheduleItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val endingBefore: JsonField<OffsetDateTime>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(amount, endingBefore, startingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * RFC 3339 timestamp (exclusive)
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            /**
             * RFC 3339 timestamp (inclusive)
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [endingBefore].
             *
             * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
                 * Returns a mutable builder for constructing an instance of [ScheduleItem].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** RFC 3339 timestamp (exclusive) */
                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * Sets [Builder.endingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                /** RFC 3339 timestamp (inclusive) */
                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [ScheduleItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ScheduleItem =
                    ScheduleItem(
                        checkRequired("amount", amount),
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toMutableMap(),
                    )
            }

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
                    (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ScheduleItem &&
                    amount == other.amount &&
                    endingBefore == other.endingBefore &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, endingBefore, startingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccessSchedule &&
                scheduleItems == other.scheduleItems &&
                creditTypeId == other.creditTypeId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(scheduleItems, creditTypeId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
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

    /**
     * Required for "POSTPAID" commits: the true up invoice will be generated at this time and only
     * one schedule item is allowed; the total must match accesss_schedule amount. Optional for
     * "PREPAID" commits: if not provided, this will be a "complimentary" commit with no invoice.
     */
    class InvoiceSchedule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditTypeId: JsonField<String>,
        private val doNotInvoice: JsonField<Boolean>,
        private val recurringSchedule: JsonField<RecurringSchedule>,
        private val scheduleItems: JsonField<List<ScheduleItem>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
            @JsonProperty("schedule_items")
            @ExcludeMissing
            scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
        ) : this(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, mutableMapOf())

        /**
         * Defaults to USD (cents) if not passed.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

        /**
         * This field is only applicable to commit invoice schedules. If true, this schedule will
         * not generate an invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun doNotInvoice(): Optional<Boolean> = doNotInvoice.getOptional("do_not_invoice")

        /**
         * Enter the unit price and quantity for the charge or instead only send the amount. If
         * amount is sent, the unit price is assumed to be the amount and quantity is inferred to
         * be 1.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurringSchedule(): Optional<RecurringSchedule> =
            recurringSchedule.getOptional("recurring_schedule")

        /**
         * Either provide amount or provide both unit_price and quantity.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scheduleItems(): Optional<List<ScheduleItem>> =
            scheduleItems.getOptional("schedule_items")

        /**
         * Returns the raw JSON value of [creditTypeId].
         *
         * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Returns the raw JSON value of [doNotInvoice].
         *
         * Unlike [doNotInvoice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("do_not_invoice")
        @ExcludeMissing
        fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

        /**
         * Returns the raw JSON value of [recurringSchedule].
         *
         * Unlike [recurringSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recurring_schedule")
        @ExcludeMissing
        fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

        /**
         * Returns the raw JSON value of [scheduleItems].
         *
         * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("schedule_items")
        @ExcludeMissing
        fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

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

            /** Returns a mutable builder for constructing an instance of [InvoiceSchedule]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InvoiceSchedule]. */
        class Builder internal constructor() {

            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
            private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
            private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                creditTypeId = invoiceSchedule.creditTypeId
                doNotInvoice = invoiceSchedule.doNotInvoice
                recurringSchedule = invoiceSchedule.recurringSchedule
                scheduleItems = invoiceSchedule.scheduleItems.map { it.toMutableList() }
                additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
            }

            /** Defaults to USD (cents) if not passed. */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * Sets [Builder.creditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             */
            fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

            /**
             * Sets [Builder.doNotInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doNotInvoice] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                this.doNotInvoice = doNotInvoice
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                recurringSchedule(JsonField.of(recurringSchedule))

            /**
             * Sets [Builder.recurringSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringSchedule] with a well-typed
             * [RecurringSchedule] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                this.recurringSchedule = recurringSchedule
            }

            /** Either provide amount or provide both unit_price and quantity. */
            fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                scheduleItems(JsonField.of(scheduleItems))

            /**
             * Sets [Builder.scheduleItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduleItems] with a well-typed
             * `List<ScheduleItem>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                this.scheduleItems = scheduleItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [ScheduleItem] to [scheduleItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                scheduleItems =
                    (scheduleItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scheduleItems", it).add(scheduleItem)
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

            /**
             * Returns an immutable instance of [InvoiceSchedule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InvoiceSchedule =
                InvoiceSchedule(
                    creditTypeId,
                    doNotInvoice,
                    recurringSchedule,
                    (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InvoiceSchedule = apply {
            if (validated) {
                return@apply
            }

            creditTypeId()
            doNotInvoice()
            recurringSchedule().ifPresent { it.validate() }
            scheduleItems().ifPresent { it.forEach { it.validate() } }
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
            (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                (if (doNotInvoice.asKnown().isPresent) 1 else 0) +
                (recurringSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * Enter the unit price and quantity for the charge or instead only send the amount. If
         * amount is sent, the unit price is assumed to be the amount and quantity is inferred to
         * be 1.
         */
        class RecurringSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amountDistribution: JsonField<AmountDistribution>,
            private val endingBefore: JsonField<OffsetDateTime>,
            private val frequency: JsonField<Frequency>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val quantity: JsonField<Double>,
            private val unitPrice: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount_distribution")
                @ExcludeMissing
                amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                frequency: JsonField<Frequency> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                unitPrice: JsonField<Double> = JsonMissing.of(),
            ) : this(
                amountDistribution,
                endingBefore,
                frequency,
                startingAt,
                amount,
                quantity,
                unitPrice,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountDistribution(): AmountDistribution =
                amountDistribution.getRequired("amount_distribution")

            /**
             * RFC 3339 timestamp (exclusive).
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun frequency(): Frequency = frequency.getRequired("frequency")

            /**
             * RFC 3339 timestamp (inclusive).
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun amount(): Optional<Double> = amount.getOptional("amount")

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Double> = quantity.getOptional("quantity")

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

            /**
             * Returns the raw JSON value of [amountDistribution].
             *
             * Unlike [amountDistribution], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_distribution")
            @ExcludeMissing
            fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

            /**
             * Returns the raw JSON value of [endingBefore].
             *
             * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /**
             * Returns the raw JSON value of [frequency].
             *
             * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("frequency")
            @ExcludeMissing
            fun _frequency(): JsonField<Frequency> = frequency

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

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
                 * Returns a mutable builder for constructing an instance of [RecurringSchedule].
                 *
                 * The following fields are required:
                 * ```java
                 * .amountDistribution()
                 * .endingBefore()
                 * .frequency()
                 * .startingAt()
                 * ```
                 */
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

                /**
                 * Sets [Builder.amountDistribution] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDistribution] with a well-typed
                 * [AmountDistribution] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) = apply {
                    this.amountDistribution = amountDistribution
                }

                /** RFC 3339 timestamp (exclusive). */
                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * Sets [Builder.endingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                /**
                 * Sets [Builder.frequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequency] with a well-typed [Frequency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun frequency(frequency: JsonField<Frequency>) = apply {
                    this.frequency = frequency
                }

                /** RFC 3339 timestamp (inclusive). */
                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [RecurringSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amountDistribution()
                 * .endingBefore()
                 * .frequency()
                 * .startingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RecurringSchedule =
                    RecurringSchedule(
                        checkRequired("amountDistribution", amountDistribution),
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("frequency", frequency),
                        checkRequired("startingAt", startingAt),
                        amount,
                        quantity,
                        unitPrice,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RecurringSchedule = apply {
                if (validated) {
                    return@apply
                }

                amountDistribution().validate()
                endingBefore()
                frequency().validate()
                startingAt()
                amount()
                quantity()
                unitPrice()
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
                (amountDistribution.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0) +
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (if (unitPrice.asKnown().isPresent) 1 else 0)

            class AmountDistribution
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                fun validate(): AmountDistribution = apply {
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

                    return other is AmountDistribution && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Frequency @JsonCreator private constructor(private val value: JsonField<String>) :
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

                fun validate(): Frequency = apply {
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

                    return other is Frequency && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RecurringSchedule &&
                    amountDistribution == other.amountDistribution &&
                    endingBefore == other.endingBefore &&
                    frequency == other.frequency &&
                    startingAt == other.startingAt &&
                    amount == other.amount &&
                    quantity == other.quantity &&
                    unitPrice == other.unitPrice &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amountDistribution,
                    endingBefore,
                    frequency,
                    startingAt,
                    amount,
                    quantity,
                    unitPrice,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
        }

        class ScheduleItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val timestamp: JsonField<OffsetDateTime>,
            private val amount: JsonField<Double>,
            private val quantity: JsonField<Double>,
            private val unitPrice: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                unitPrice: JsonField<Double> = JsonMissing.of(),
            ) : this(timestamp, amount, quantity, unitPrice, mutableMapOf())

            /**
             * timestamp of the scheduled event
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * Amount for the charge. Can be provided instead of unit_price and quantity. If amount
             * is sent, the unit_price is assumed to be the amount and quantity is inferred to be 1.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun amount(): Optional<Double> = amount.getOptional("amount")

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount and
             * must be specified with unit_price. If specified amount cannot be provided.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Double> = quantity.getOptional("quantity")

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified with quantity. If specified amount cannot be provided.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

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
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

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
                 * Returns a mutable builder for constructing an instance of [ScheduleItem].
                 *
                 * The following fields are required:
                 * ```java
                 * .timestamp()
                 * ```
                 */
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

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [ScheduleItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .timestamp()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ScheduleItem =
                    ScheduleItem(
                        checkRequired("timestamp", timestamp),
                        amount,
                        quantity,
                        unitPrice,
                        additionalProperties.toMutableMap(),
                    )
            }

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
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (if (unitPrice.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ScheduleItem &&
                    timestamp == other.timestamp &&
                    amount == other.amount &&
                    quantity == other.quantity &&
                    unitPrice == other.unitPrice &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceSchedule &&
                creditTypeId == other.creditTypeId &&
                doNotInvoice == other.doNotInvoice &&
                recurringSchedule == other.recurringSchedule &&
                scheduleItems == other.scheduleItems &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditTypeId,
                doNotInvoice,
                recurringSchedule,
                scheduleItems,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceSchedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CommitCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
