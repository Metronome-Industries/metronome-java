// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.contracts

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
import com.metronome.api.models.CommitHierarchyConfiguration
import com.metronome.api.models.CommitSpecifierInput
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Edit details for a contract-level or customer-level credit.
 *
 * ### Use this endpoint to:
 * - Extend the duration or the amount of an existing free credit like a trial
 * - Modify individual credit access schedules, applicable products, priority, or other fields.
 *
 * ### Usage guidelines:
 * - As with all edits in Metronome, draft invoices will reflect the edit immediately, while
 *   finalized invoices are untouched unless voided and regenerated.
 * - You cannot remove an access schedule segment that was applied to a finalized invoice. You can
 *   void the invoice beforehand and then remove the access schedule segment.
 */
class ContractEditCreditParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ID of the credit to edit
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditId(): String = body.creditId()

    /**
     * ID of the customer whose credit is being edited
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessSchedule(): Optional<AccessSchedule> = body.accessSchedule()

    /**
     * Which products the credit applies to. If both applicable_product_ids and
     * applicable_product_tags are not provided, the credit applies to all products.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableProductIds(): Optional<List<String>> = body.applicableProductIds()

    /**
     * Which tags the credit applies to. If both applicable_product_ids and applicable_product_tags
     * are not provided, the credit applies to all products.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableProductTags(): Optional<List<String>> = body.applicableProductTags()

    /**
     * Updated description for the credit
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Optional configuration for credit hierarchy access control
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
        body.hierarchyConfiguration()

    /**
     * Updated name for the credit
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * If multiple commits are applicable, the one with the lower priority will apply first.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priority(): Optional<Double> = body.priority()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = body.productId()

    /**
     * If provided, updates the credit to use the specified rate type for current and future
     * invoices. Previously finalized invoices will need to be voided and regenerated to reflect the
     * rate type change.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rateType(): Optional<RateType> = body.rateType()

    /**
     * List of filters that determine what kind of customer usage draws down a commit or credit. A
     * customer's usage needs to meet the condition of at least one of the specifiers to contribute
     * to a commit's or credit's drawdown. This field cannot be used together with
     * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by product or
     * product tag, pass those values in the body of `specifiers`.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun specifiers(): Optional<List<CommitSpecifierInput>> = body.specifiers()

    /**
     * Returns the raw JSON value of [creditId].
     *
     * Unlike [creditId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditId(): JsonField<String> = body._creditId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [accessSchedule].
     *
     * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accessSchedule(): JsonField<AccessSchedule> = body._accessSchedule()

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [hierarchyConfiguration].
     *
     * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
        body._hierarchyConfiguration()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

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
     * Returns the raw JSON value of [rateType].
     *
     * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rateType(): JsonField<RateType> = body._rateType()

    /**
     * Returns the raw JSON value of [specifiers].
     *
     * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _specifiers(): JsonField<List<CommitSpecifierInput>> = body._specifiers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractEditCreditParams].
         *
         * The following fields are required:
         * ```java
         * .creditId()
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractEditCreditParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractEditCreditParams: ContractEditCreditParams) = apply {
            body = contractEditCreditParams.body.toBuilder()
            additionalHeaders = contractEditCreditParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractEditCreditParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [creditId]
         * - [customerId]
         * - [accessSchedule]
         * - [applicableProductIds]
         * - [applicableProductTags]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the credit to edit */
        fun creditId(creditId: String) = apply { body.creditId(creditId) }

        /**
         * Sets [Builder.creditId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creditId(creditId: JsonField<String>) = apply { body.creditId(creditId) }

        /** ID of the customer whose credit is being edited */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

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

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: List<String>?) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Alias for calling [Builder.applicableProductIds] with
         * `applicableProductIds.orElse(null)`.
         */
        fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
            applicableProductIds(applicableProductIds.getOrNull())

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
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: List<String>?) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Alias for calling [Builder.applicableProductTags] with
         * `applicableProductTags.orElse(null)`.
         */
        fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
            applicableProductTags(applicableProductTags.getOrNull())

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

        /** Updated description for the credit */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Optional configuration for credit hierarchy access control */
        fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) = apply {
            body.hierarchyConfiguration(hierarchyConfiguration)
        }

        /**
         * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hierarchyConfiguration] with a well-typed
         * [CommitHierarchyConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun hierarchyConfiguration(
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
        ) = apply { body.hierarchyConfiguration(hierarchyConfiguration) }

        /** Updated name for the credit */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        fun priority(priority: Double?) = apply { body.priority(priority) }

        /**
         * Alias for [Builder.priority].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun priority(priority: Double) = priority(priority as Double?)

        /** Alias for calling [Builder.priority] with `priority.orElse(null)`. */
        fun priority(priority: Optional<Double>) = priority(priority.getOrNull())

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { body.priority(priority) }

        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /**
         * If provided, updates the credit to use the specified rate type for current and future
         * invoices. Previously finalized invoices will need to be voided and regenerated to reflect
         * the rate type change.
         */
        fun rateType(rateType: RateType) = apply { body.rateType(rateType) }

        /**
         * Sets [Builder.rateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateType] with a well-typed [RateType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateType(rateType: JsonField<RateType>) = apply { body.rateType(rateType) }

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        fun specifiers(specifiers: List<CommitSpecifierInput>?) = apply {
            body.specifiers(specifiers)
        }

        /** Alias for calling [Builder.specifiers] with `specifiers.orElse(null)`. */
        fun specifiers(specifiers: Optional<List<CommitSpecifierInput>>) =
            specifiers(specifiers.getOrNull())

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
         * Returns an immutable instance of [ContractEditCreditParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .creditId()
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractEditCreditParams =
            ContractEditCreditParams(
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
        private val creditId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val accessSchedule: JsonField<AccessSchedule>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val description: JsonField<String>,
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
        private val name: JsonField<String>,
        private val priority: JsonField<Double>,
        private val productId: JsonField<String>,
        private val rateType: JsonField<RateType>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_id")
            @ExcludeMissing
            creditId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_schedule")
            @ExcludeMissing
            accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        ) : this(
            creditId,
            customerId,
            accessSchedule,
            applicableProductIds,
            applicableProductTags,
            description,
            hierarchyConfiguration,
            name,
            priority,
            productId,
            rateType,
            specifiers,
            mutableMapOf(),
        )

        /**
         * ID of the credit to edit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditId(): String = creditId.getRequired("credit_id")

        /**
         * ID of the customer whose credit is being edited
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accessSchedule(): Optional<AccessSchedule> =
            accessSchedule.getOptional("access_schedule")

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Updated description for the credit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional configuration for credit hierarchy access control
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            hierarchyConfiguration.getOptional("hierarchy_configuration")

        /**
         * Updated name for the credit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * If multiple commits are applicable, the one with the lower priority will apply first.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("product_id")

        /**
         * If provided, updates the credit to use the specified rate type for current and future
         * invoices. Previously finalized invoices will need to be voided and regenerated to reflect
         * the rate type change.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * Returns the raw JSON value of [creditId].
         *
         * Unlike [creditId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_id") @ExcludeMissing fun _creditId(): JsonField<String> = creditId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [hierarchyConfiguration].
         *
         * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

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
             * .creditId()
             * .customerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var creditId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var accessSchedule: JsonField<AccessSchedule> = JsonMissing.of()
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                creditId = body.creditId
                customerId = body.customerId
                accessSchedule = body.accessSchedule
                applicableProductIds = body.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = body.applicableProductTags.map { it.toMutableList() }
                description = body.description
                hierarchyConfiguration = body.hierarchyConfiguration
                name = body.name
                priority = body.priority
                productId = body.productId
                rateType = body.rateType
                specifiers = body.specifiers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the credit to edit */
            fun creditId(creditId: String) = creditId(JsonField.of(creditId))

            /**
             * Sets [Builder.creditId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditId(creditId: JsonField<String>) = apply { this.creditId = creditId }

            /** ID of the customer whose credit is being edited */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>?) =
                applicableProductIds(JsonField.ofNullable(applicableProductIds))

            /**
             * Alias for calling [Builder.applicableProductIds] with
             * `applicableProductIds.orElse(null)`.
             */
            fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
                applicableProductIds(applicableProductIds.getOrNull())

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
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>?) =
                applicableProductTags(JsonField.ofNullable(applicableProductTags))

            /**
             * Alias for calling [Builder.applicableProductTags] with
             * `applicableProductTags.orElse(null)`.
             */
            fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                applicableProductTags(applicableProductTags.getOrNull())

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

            /** Updated description for the credit */
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

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /**
             * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchyConfiguration] with a well-typed
             * [CommitHierarchyConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** Updated name for the credit */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double?) = priority(JsonField.ofNullable(priority))

            /**
             * Alias for [Builder.priority].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun priority(priority: Double) = priority(priority as Double?)

            /** Alias for calling [Builder.priority] with `priority.orElse(null)`. */
            fun priority(priority: Optional<Double>) = priority(priority.getOrNull())

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * If provided, updates the credit to use the specified rate type for current and future
             * invoices. Previously finalized invoices will need to be voided and regenerated to
             * reflect the rate type change.
             */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>?) =
                specifiers(JsonField.ofNullable(specifiers))

            /** Alias for calling [Builder.specifiers] with `specifiers.orElse(null)`. */
            fun specifiers(specifiers: Optional<List<CommitSpecifierInput>>) =
                specifiers(specifiers.getOrNull())

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
             * .creditId()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("creditId", creditId),
                    checkRequired("customerId", customerId),
                    accessSchedule,
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    hierarchyConfiguration,
                    name,
                    priority,
                    productId,
                    rateType,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            creditId()
            customerId()
            accessSchedule().ifPresent { it.validate() }
            applicableProductIds()
            applicableProductTags()
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            name()
            priority()
            productId()
            rateType().ifPresent { it.validate() }
            specifiers().ifPresent { it.forEach { it.validate() } }
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
            (if (creditId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                creditId == other.creditId &&
                customerId == other.customerId &&
                accessSchedule == other.accessSchedule &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                description == other.description &&
                hierarchyConfiguration == other.hierarchyConfiguration &&
                name == other.name &&
                priority == other.priority &&
                productId == other.productId &&
                rateType == other.rateType &&
                specifiers == other.specifiers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditId,
                customerId,
                accessSchedule,
                applicableProductIds,
                applicableProductTags,
                description,
                hierarchyConfiguration,
                name,
                priority,
                productId,
                rateType,
                specifiers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{creditId=$creditId, customerId=$customerId, accessSchedule=$accessSchedule, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, hierarchyConfiguration=$hierarchyConfiguration, name=$name, priority=$priority, productId=$productId, rateType=$rateType, specifiers=$specifiers, additionalProperties=$additionalProperties}"
    }

    class AccessSchedule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addScheduleItems: JsonField<List<AddScheduleItem>>,
        private val removeScheduleItems: JsonField<List<RemoveScheduleItem>>,
        private val updateScheduleItems: JsonField<List<UpdateScheduleItem>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add_schedule_items")
            @ExcludeMissing
            addScheduleItems: JsonField<List<AddScheduleItem>> = JsonMissing.of(),
            @JsonProperty("remove_schedule_items")
            @ExcludeMissing
            removeScheduleItems: JsonField<List<RemoveScheduleItem>> = JsonMissing.of(),
            @JsonProperty("update_schedule_items")
            @ExcludeMissing
            updateScheduleItems: JsonField<List<UpdateScheduleItem>> = JsonMissing.of(),
        ) : this(addScheduleItems, removeScheduleItems, updateScheduleItems, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addScheduleItems(): Optional<List<AddScheduleItem>> =
            addScheduleItems.getOptional("add_schedule_items")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun removeScheduleItems(): Optional<List<RemoveScheduleItem>> =
            removeScheduleItems.getOptional("remove_schedule_items")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updateScheduleItems(): Optional<List<UpdateScheduleItem>> =
            updateScheduleItems.getOptional("update_schedule_items")

        /**
         * Returns the raw JSON value of [addScheduleItems].
         *
         * Unlike [addScheduleItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_schedule_items")
        @ExcludeMissing
        fun _addScheduleItems(): JsonField<List<AddScheduleItem>> = addScheduleItems

        /**
         * Returns the raw JSON value of [removeScheduleItems].
         *
         * Unlike [removeScheduleItems], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remove_schedule_items")
        @ExcludeMissing
        fun _removeScheduleItems(): JsonField<List<RemoveScheduleItem>> = removeScheduleItems

        /**
         * Returns the raw JSON value of [updateScheduleItems].
         *
         * Unlike [updateScheduleItems], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("update_schedule_items")
        @ExcludeMissing
        fun _updateScheduleItems(): JsonField<List<UpdateScheduleItem>> = updateScheduleItems

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

            /** Returns a mutable builder for constructing an instance of [AccessSchedule]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccessSchedule]. */
        class Builder internal constructor() {

            private var addScheduleItems: JsonField<MutableList<AddScheduleItem>>? = null
            private var removeScheduleItems: JsonField<MutableList<RemoveScheduleItem>>? = null
            private var updateScheduleItems: JsonField<MutableList<UpdateScheduleItem>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessSchedule: AccessSchedule) = apply {
                addScheduleItems = accessSchedule.addScheduleItems.map { it.toMutableList() }
                removeScheduleItems = accessSchedule.removeScheduleItems.map { it.toMutableList() }
                updateScheduleItems = accessSchedule.updateScheduleItems.map { it.toMutableList() }
                additionalProperties = accessSchedule.additionalProperties.toMutableMap()
            }

            fun addScheduleItems(addScheduleItems: List<AddScheduleItem>) =
                addScheduleItems(JsonField.of(addScheduleItems))

            /**
             * Sets [Builder.addScheduleItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addScheduleItems] with a well-typed
             * `List<AddScheduleItem>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun addScheduleItems(addScheduleItems: JsonField<List<AddScheduleItem>>) = apply {
                this.addScheduleItems = addScheduleItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddScheduleItem] to [addScheduleItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddScheduleItem(addScheduleItem: AddScheduleItem) = apply {
                addScheduleItems =
                    (addScheduleItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addScheduleItems", it).add(addScheduleItem)
                    }
            }

            fun removeScheduleItems(removeScheduleItems: List<RemoveScheduleItem>) =
                removeScheduleItems(JsonField.of(removeScheduleItems))

            /**
             * Sets [Builder.removeScheduleItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeScheduleItems] with a well-typed
             * `List<RemoveScheduleItem>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun removeScheduleItems(removeScheduleItems: JsonField<List<RemoveScheduleItem>>) =
                apply {
                    this.removeScheduleItems = removeScheduleItems.map { it.toMutableList() }
                }

            /**
             * Adds a single [RemoveScheduleItem] to [removeScheduleItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveScheduleItem(removeScheduleItem: RemoveScheduleItem) = apply {
                removeScheduleItems =
                    (removeScheduleItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeScheduleItems", it).add(removeScheduleItem)
                    }
            }

            fun updateScheduleItems(updateScheduleItems: List<UpdateScheduleItem>) =
                updateScheduleItems(JsonField.of(updateScheduleItems))

            /**
             * Sets [Builder.updateScheduleItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updateScheduleItems] with a well-typed
             * `List<UpdateScheduleItem>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun updateScheduleItems(updateScheduleItems: JsonField<List<UpdateScheduleItem>>) =
                apply {
                    this.updateScheduleItems = updateScheduleItems.map { it.toMutableList() }
                }

            /**
             * Adds a single [UpdateScheduleItem] to [updateScheduleItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUpdateScheduleItem(updateScheduleItem: UpdateScheduleItem) = apply {
                updateScheduleItems =
                    (updateScheduleItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("updateScheduleItems", it).add(updateScheduleItem)
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
             * Returns an immutable instance of [AccessSchedule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AccessSchedule =
                AccessSchedule(
                    (addScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                    (updateScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccessSchedule = apply {
            if (validated) {
                return@apply
            }

            addScheduleItems().ifPresent { it.forEach { it.validate() } }
            removeScheduleItems().ifPresent { it.forEach { it.validate() } }
            updateScheduleItems().ifPresent { it.forEach { it.validate() } }
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
            (addScheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (removeScheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (updateScheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class AddScheduleItem
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
                 * Returns a mutable builder for constructing an instance of [AddScheduleItem].
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

            /** A builder for [AddScheduleItem]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var endingBefore: JsonField<OffsetDateTime>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addScheduleItem: AddScheduleItem) = apply {
                    amount = addScheduleItem.amount
                    endingBefore = addScheduleItem.endingBefore
                    startingAt = addScheduleItem.startingAt
                    additionalProperties = addScheduleItem.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [AddScheduleItem].
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
                fun build(): AddScheduleItem =
                    AddScheduleItem(
                        checkRequired("amount", amount),
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AddScheduleItem = apply {
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

                return other is AddScheduleItem &&
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
                "AddScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        class RemoveScheduleItem
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
                 * Returns a mutable builder for constructing an instance of [RemoveScheduleItem].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RemoveScheduleItem]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(removeScheduleItem: RemoveScheduleItem) = apply {
                    id = removeScheduleItem.id
                    additionalProperties = removeScheduleItem.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                 * Returns an immutable instance of [RemoveScheduleItem].
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
                fun build(): RemoveScheduleItem =
                    RemoveScheduleItem(checkRequired("id", id), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): RemoveScheduleItem = apply {
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

                return other is RemoveScheduleItem &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RemoveScheduleItem{id=$id, additionalProperties=$additionalProperties}"
        }

        class UpdateScheduleItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Double>,
            private val endingBefore: JsonField<OffsetDateTime>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(id, amount, endingBefore, startingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun amount(): Optional<Double> = amount.getOptional("amount")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                 * Returns a mutable builder for constructing an instance of [UpdateScheduleItem].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateScheduleItem]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<Double> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateScheduleItem: UpdateScheduleItem) = apply {
                    id = updateScheduleItem.id
                    amount = updateScheduleItem.amount
                    endingBefore = updateScheduleItem.endingBefore
                    startingAt = updateScheduleItem.startingAt
                    additionalProperties = updateScheduleItem.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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
                 * Returns an immutable instance of [UpdateScheduleItem].
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
                fun build(): UpdateScheduleItem =
                    UpdateScheduleItem(
                        checkRequired("id", id),
                        amount,
                        endingBefore,
                        startingAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UpdateScheduleItem = apply {
                if (validated) {
                    return@apply
                }

                id()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UpdateScheduleItem &&
                    id == other.id &&
                    amount == other.amount &&
                    endingBefore == other.endingBefore &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, amount, endingBefore, startingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateScheduleItem{id=$id, amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccessSchedule &&
                addScheduleItems == other.addScheduleItems &&
                removeScheduleItems == other.removeScheduleItems &&
                updateScheduleItems == other.updateScheduleItems &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addScheduleItems,
                removeScheduleItems,
                updateScheduleItems,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessSchedule{addScheduleItems=$addScheduleItems, removeScheduleItems=$removeScheduleItems, updateScheduleItems=$updateScheduleItems, additionalProperties=$additionalProperties}"
    }

    /**
     * If provided, updates the credit to use the specified rate type for current and future
     * invoices. Previously finalized invoices will need to be voided and regenerated to reflect the
     * rate type change.
     */
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

            @JvmField val LIST_RATE = of("LIST_RATE")

            @JvmField val COMMIT_RATE = of("COMMIT_RATE")

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        /** An enum containing [RateType]'s known values. */
        enum class Known {
            LIST_RATE,
            COMMIT_RATE,
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
            LIST_RATE,
            COMMIT_RATE,
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
                LIST_RATE -> Value.LIST_RATE
                COMMIT_RATE -> Value.COMMIT_RATE
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
                LIST_RATE -> Known.LIST_RATE
                COMMIT_RATE -> Known.COMMIT_RATE
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

        return other is ContractEditCreditParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractEditCreditParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
