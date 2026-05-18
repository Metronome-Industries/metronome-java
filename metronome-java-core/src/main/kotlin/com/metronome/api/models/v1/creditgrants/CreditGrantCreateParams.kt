// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

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
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.allMaxBy
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.getOrThrow
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new credit grant. This is a Plans (deprecated) endpoint. New clients should implement
 * using Contracts.
 */
class CreditGrantCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * the Metronome ID of the customer
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * The credit grant will only apply to usage or charges dated before this timestamp
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = body.expiresAt()

    /**
     * the amount of credits granted
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grantAmount(): GrantAmount = body.grantAmount()

    /**
     * the name of the credit grant as it will appear on invoices
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * the amount paid for this credit grant
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paidAmount(): PaidAmount = body.paidAmount()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priority(): Double = body.priority()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditGrantType(): Optional<String> = body.creditGrantType()

    /**
     * Custom fields to attach to the credit grant.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * The credit grant will only apply to usage or charges dated on or after this timestamp
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveAt(): Optional<OffsetDateTime> = body.effectiveAt()

    /**
     * The date to issue an invoice for the paid_amount.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceDate(): Optional<OffsetDateTime> = body.invoiceDate()

    /**
     * The product(s) which these credits will be applied to. (If unspecified, the credits will be
     * applied to charges for all products.). The array ordering specified here will be used to
     * determine the order in which credits will be applied to invoice line items
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productIds(): Optional<List<String>> = body.productIds()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<String> = body.reason()

    /**
     * Configure a rollover for this credit grant so if it expires it rolls over a configured amount
     * to a new credit grant. This feature is currently opt-in only. Contact Metronome to be added
     * to the beta.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolloverSettings(): Optional<RolloverSettings> = body.rolloverSettings()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /**
     * Returns the raw JSON value of [grantAmount].
     *
     * Unlike [grantAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _grantAmount(): JsonField<GrantAmount> = body._grantAmount()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [paidAmount].
     *
     * Unlike [paidAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paidAmount(): JsonField<PaidAmount> = body._paidAmount()

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priority(): JsonField<Double> = body._priority()

    /**
     * Returns the raw JSON value of [creditGrantType].
     *
     * Unlike [creditGrantType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditGrantType(): JsonField<String> = body._creditGrantType()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveAt(): JsonField<OffsetDateTime> = body._effectiveAt()

    /**
     * Returns the raw JSON value of [invoiceDate].
     *
     * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceDate(): JsonField<OffsetDateTime> = body._invoiceDate()

    /**
     * Returns the raw JSON value of [productIds].
     *
     * Unlike [productIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productIds(): JsonField<List<String>> = body._productIds()

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reason(): JsonField<String> = body._reason()

    /**
     * Returns the raw JSON value of [rolloverSettings].
     *
     * Unlike [rolloverSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _rolloverSettings(): JsonField<RolloverSettings> = body._rolloverSettings()

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
         * Returns a mutable builder for constructing an instance of [CreditGrantCreateParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .expiresAt()
         * .grantAmount()
         * .name()
         * .paidAmount()
         * .priority()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditGrantCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantCreateParams: CreditGrantCreateParams) = apply {
            body = creditGrantCreateParams.body.toBuilder()
            additionalHeaders = creditGrantCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [expiresAt]
         * - [grantAmount]
         * - [name]
         * - [paidAmount]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** the Metronome ID of the customer */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The credit grant will only apply to usage or charges dated before this timestamp */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /** the amount of credits granted */
        fun grantAmount(grantAmount: GrantAmount) = apply { body.grantAmount(grantAmount) }

        /**
         * Sets [Builder.grantAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantAmount] with a well-typed [GrantAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun grantAmount(grantAmount: JsonField<GrantAmount>) = apply {
            body.grantAmount(grantAmount)
        }

        /** the name of the credit grant as it will appear on invoices */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** the amount paid for this credit grant */
        fun paidAmount(paidAmount: PaidAmount) = apply { body.paidAmount(paidAmount) }

        /**
         * Sets [Builder.paidAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paidAmount] with a well-typed [PaidAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply { body.paidAmount(paidAmount) }

        fun priority(priority: Double) = apply { body.priority(priority) }

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { body.priority(priority) }

        fun creditGrantType(creditGrantType: String) = apply {
            body.creditGrantType(creditGrantType)
        }

        /**
         * Sets [Builder.creditGrantType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditGrantType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditGrantType(creditGrantType: JsonField<String>) = apply {
            body.creditGrantType(creditGrantType)
        }

        /** Custom fields to attach to the credit grant. */
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

        /** The credit grant will only apply to usage or charges dated on or after this timestamp */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { body.effectiveAt(effectiveAt) }

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            body.effectiveAt(effectiveAt)
        }

        /** The date to issue an invoice for the paid_amount. */
        fun invoiceDate(invoiceDate: OffsetDateTime) = apply { body.invoiceDate(invoiceDate) }

        /**
         * Sets [Builder.invoiceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
            body.invoiceDate(invoiceDate)
        }

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         */
        fun productIds(productIds: List<String>) = apply { body.productIds(productIds) }

        /**
         * Sets [Builder.productIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productIds(productIds: JsonField<List<String>>) = apply { body.productIds(productIds) }

        /**
         * Adds a single [String] to [productIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductId(productId: String) = apply { body.addProductId(productId) }

        fun reason(reason: String) = apply { body.reason(reason) }

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { body.reason(reason) }

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
         */
        fun rolloverSettings(rolloverSettings: RolloverSettings) = apply {
            body.rolloverSettings(rolloverSettings)
        }

        /**
         * Sets [Builder.rolloverSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverSettings] with a well-typed [RolloverSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rolloverSettings(rolloverSettings: JsonField<RolloverSettings>) = apply {
            body.rolloverSettings(rolloverSettings)
        }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
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
         * Returns an immutable instance of [CreditGrantCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .expiresAt()
         * .grantAmount()
         * .name()
         * .paidAmount()
         * .priority()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditGrantCreateParams =
            CreditGrantCreateParams(
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
        private val customerId: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val grantAmount: JsonField<GrantAmount>,
        private val name: JsonField<String>,
        private val paidAmount: JsonField<PaidAmount>,
        private val priority: JsonField<Double>,
        private val creditGrantType: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val effectiveAt: JsonField<OffsetDateTime>,
        private val invoiceDate: JsonField<OffsetDateTime>,
        private val productIds: JsonField<List<String>>,
        private val reason: JsonField<String>,
        private val rolloverSettings: JsonField<RolloverSettings>,
        private val uniquenessKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("grant_amount")
            @ExcludeMissing
            grantAmount: JsonField<GrantAmount> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paid_amount")
            @ExcludeMissing
            paidAmount: JsonField<PaidAmount> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("credit_grant_type")
            @ExcludeMissing
            creditGrantType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("effective_at")
            @ExcludeMissing
            effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("invoice_date")
            @ExcludeMissing
            invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("product_ids")
            @ExcludeMissing
            productIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rollover_settings")
            @ExcludeMissing
            rolloverSettings: JsonField<RolloverSettings> = JsonMissing.of(),
            @JsonProperty("uniqueness_key")
            @ExcludeMissing
            uniquenessKey: JsonField<String> = JsonMissing.of(),
        ) : this(
            customerId,
            expiresAt,
            grantAmount,
            name,
            paidAmount,
            priority,
            creditGrantType,
            customFields,
            effectiveAt,
            invoiceDate,
            productIds,
            reason,
            rolloverSettings,
            uniquenessKey,
            mutableMapOf(),
        )

        /**
         * the Metronome ID of the customer
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * The credit grant will only apply to usage or charges dated before this timestamp
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * the amount of credits granted
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun grantAmount(): GrantAmount = grantAmount.getRequired("grant_amount")

        /**
         * the name of the credit grant as it will appear on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * the amount paid for this credit grant
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paidAmount(): PaidAmount = paidAmount.getRequired("paid_amount")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Double = priority.getRequired("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditGrantType(): Optional<String> = creditGrantType.getOptional("credit_grant_type")

        /**
         * Custom fields to attach to the credit grant.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * The credit grant will only apply to usage or charges dated on or after this timestamp
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveAt(): Optional<OffsetDateTime> = effectiveAt.getOptional("effective_at")

        /**
         * The date to issue an invoice for the paid_amount.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceDate(): Optional<OffsetDateTime> = invoiceDate.getOptional("invoice_date")

        /**
         * The product(s) which these credits will be applied to. (If unspecified, the credits will
         * be applied to charges for all products.). The array ordering specified here will be used
         * to determine the order in which credits will be applied to invoice line items
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productIds(): Optional<List<String>> = productIds.getOptional("product_ids")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Configure a rollover for this credit grant so if it expires it rolls over a configured
         * amount to a new credit grant. This feature is currently opt-in only. Contact Metronome to
         * be added to the beta.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rolloverSettings(): Optional<RolloverSettings> =
            rolloverSettings.getOptional("rollover_settings")

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniquenessKey(): Optional<String> = uniquenessKey.getOptional("uniqueness_key")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [grantAmount].
         *
         * Unlike [grantAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grant_amount")
        @ExcludeMissing
        fun _grantAmount(): JsonField<GrantAmount> = grantAmount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [paidAmount].
         *
         * Unlike [paidAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paid_amount")
        @ExcludeMissing
        fun _paidAmount(): JsonField<PaidAmount> = paidAmount

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [creditGrantType].
         *
         * Unlike [creditGrantType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_grant_type")
        @ExcludeMissing
        fun _creditGrantType(): JsonField<String> = creditGrantType

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
         * Returns the raw JSON value of [effectiveAt].
         *
         * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /**
         * Returns the raw JSON value of [invoiceDate].
         *
         * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_date")
        @ExcludeMissing
        fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

        /**
         * Returns the raw JSON value of [productIds].
         *
         * Unlike [productIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_ids")
        @ExcludeMissing
        fun _productIds(): JsonField<List<String>> = productIds

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [rolloverSettings].
         *
         * Unlike [rolloverSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_settings")
        @ExcludeMissing
        fun _rolloverSettings(): JsonField<RolloverSettings> = rolloverSettings

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
             * .customerId()
             * .expiresAt()
             * .grantAmount()
             * .name()
             * .paidAmount()
             * .priority()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var grantAmount: JsonField<GrantAmount>? = null
            private var name: JsonField<String>? = null
            private var paidAmount: JsonField<PaidAmount>? = null
            private var priority: JsonField<Double>? = null
            private var creditGrantType: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var productIds: JsonField<MutableList<String>>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var rolloverSettings: JsonField<RolloverSettings> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                expiresAt = body.expiresAt
                grantAmount = body.grantAmount
                name = body.name
                paidAmount = body.paidAmount
                priority = body.priority
                creditGrantType = body.creditGrantType
                customFields = body.customFields
                effectiveAt = body.effectiveAt
                invoiceDate = body.invoiceDate
                productIds = body.productIds.map { it.toMutableList() }
                reason = body.reason
                rolloverSettings = body.rolloverSettings
                uniquenessKey = body.uniquenessKey
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** the Metronome ID of the customer */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The credit grant will only apply to usage or charges dated before this timestamp */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** the amount of credits granted */
            fun grantAmount(grantAmount: GrantAmount) = grantAmount(JsonField.of(grantAmount))

            /**
             * Sets [Builder.grantAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantAmount] with a well-typed [GrantAmount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantAmount(grantAmount: JsonField<GrantAmount>) = apply {
                this.grantAmount = grantAmount
            }

            /** the name of the credit grant as it will appear on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** the amount paid for this credit grant */
            fun paidAmount(paidAmount: PaidAmount) = paidAmount(JsonField.of(paidAmount))

            /**
             * Sets [Builder.paidAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paidAmount] with a well-typed [PaidAmount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paidAmount(paidAmount: JsonField<PaidAmount>) = apply {
                this.paidAmount = paidAmount
            }

            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun creditGrantType(creditGrantType: String) =
                creditGrantType(JsonField.of(creditGrantType))

            /**
             * Sets [Builder.creditGrantType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditGrantType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditGrantType(creditGrantType: JsonField<String>) = apply {
                this.creditGrantType = creditGrantType
            }

            /** Custom fields to attach to the credit grant. */
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

            /**
             * The credit grant will only apply to usage or charges dated on or after this timestamp
             */
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /**
             * Sets [Builder.effectiveAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            /** The date to issue an invoice for the paid_amount. */
            fun invoiceDate(invoiceDate: OffsetDateTime) = invoiceDate(JsonField.of(invoiceDate))

            /**
             * Sets [Builder.invoiceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
                this.invoiceDate = invoiceDate
            }

            /**
             * The product(s) which these credits will be applied to. (If unspecified, the credits
             * will be applied to charges for all products.). The array ordering specified here will
             * be used to determine the order in which credits will be applied to invoice line items
             */
            fun productIds(productIds: List<String>) = productIds(JsonField.of(productIds))

            /**
             * Sets [Builder.productIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productIds(productIds: JsonField<List<String>>) = apply {
                this.productIds = productIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [productIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductId(productId: String) = apply {
                productIds =
                    (productIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productIds", it).add(productId)
                    }
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /**
             * Configure a rollover for this credit grant so if it expires it rolls over a
             * configured amount to a new credit grant. This feature is currently opt-in only.
             * Contact Metronome to be added to the beta.
             */
            fun rolloverSettings(rolloverSettings: RolloverSettings) =
                rolloverSettings(JsonField.of(rolloverSettings))

            /**
             * Sets [Builder.rolloverSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverSettings] with a well-typed
             * [RolloverSettings] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun rolloverSettings(rolloverSettings: JsonField<RolloverSettings>) = apply {
                this.rolloverSettings = rolloverSettings
            }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
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
             * .customerId()
             * .expiresAt()
             * .grantAmount()
             * .name()
             * .paidAmount()
             * .priority()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("grantAmount", grantAmount),
                    checkRequired("name", name),
                    checkRequired("paidAmount", paidAmount),
                    checkRequired("priority", priority),
                    creditGrantType,
                    customFields,
                    effectiveAt,
                    invoiceDate,
                    (productIds ?: JsonMissing.of()).map { it.toImmutable() },
                    reason,
                    rolloverSettings,
                    uniquenessKey,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerId()
            expiresAt()
            grantAmount().validate()
            name()
            paidAmount().validate()
            priority()
            creditGrantType()
            customFields().ifPresent { it.validate() }
            effectiveAt()
            invoiceDate()
            productIds()
            reason()
            rolloverSettings().ifPresent { it.validate() }
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (grantAmount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (paidAmount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (creditGrantType.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (effectiveAt.asKnown().isPresent) 1 else 0) +
                (if (invoiceDate.asKnown().isPresent) 1 else 0) +
                (productIds.asKnown().getOrNull()?.size ?: 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (rolloverSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (uniquenessKey.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerId == other.customerId &&
                expiresAt == other.expiresAt &&
                grantAmount == other.grantAmount &&
                name == other.name &&
                paidAmount == other.paidAmount &&
                priority == other.priority &&
                creditGrantType == other.creditGrantType &&
                customFields == other.customFields &&
                effectiveAt == other.effectiveAt &&
                invoiceDate == other.invoiceDate &&
                productIds == other.productIds &&
                reason == other.reason &&
                rolloverSettings == other.rolloverSettings &&
                uniquenessKey == other.uniquenessKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                expiresAt,
                grantAmount,
                name,
                paidAmount,
                priority,
                creditGrantType,
                customFields,
                effectiveAt,
                invoiceDate,
                productIds,
                reason,
                rolloverSettings,
                uniquenessKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, expiresAt=$expiresAt, grantAmount=$grantAmount, name=$name, paidAmount=$paidAmount, priority=$priority, creditGrantType=$creditGrantType, customFields=$customFields, effectiveAt=$effectiveAt, invoiceDate=$invoiceDate, productIds=$productIds, reason=$reason, rolloverSettings=$rolloverSettings, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    /** the amount of credits granted */
    class GrantAmount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val creditTypeId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
        ) : this(amount, creditTypeId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * the ID of the pricing unit to be used. Defaults to USD (cents) if not passed.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

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
             * Returns a mutable builder for constructing an instance of [GrantAmount].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .creditTypeId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GrantAmount]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var creditTypeId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grantAmount: GrantAmount) = apply {
                amount = grantAmount.amount
                creditTypeId = grantAmount.creditTypeId
                additionalProperties = grantAmount.additionalProperties.toMutableMap()
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
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
             * Returns an immutable instance of [GrantAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .creditTypeId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GrantAmount =
                GrantAmount(
                    checkRequired("amount", amount),
                    checkRequired("creditTypeId", creditTypeId),
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
        fun validate(): GrantAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (creditTypeId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GrantAmount &&
                amount == other.amount &&
                creditTypeId == other.creditTypeId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, creditTypeId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GrantAmount{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
    }

    /** the amount paid for this credit grant */
    class PaidAmount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val creditTypeId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
        ) : this(amount, creditTypeId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * the ID of the pricing unit to be used. Defaults to USD (cents) if not passed.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

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
             * Returns a mutable builder for constructing an instance of [PaidAmount].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .creditTypeId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaidAmount]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var creditTypeId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paidAmount: PaidAmount) = apply {
                amount = paidAmount.amount
                creditTypeId = paidAmount.creditTypeId
                additionalProperties = paidAmount.additionalProperties.toMutableMap()
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** the ID of the pricing unit to be used. Defaults to USD (cents) if not passed. */
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
             * Returns an immutable instance of [PaidAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .creditTypeId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaidAmount =
                PaidAmount(
                    checkRequired("amount", amount),
                    checkRequired("creditTypeId", creditTypeId),
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
        fun validate(): PaidAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (creditTypeId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaidAmount &&
                amount == other.amount &&
                creditTypeId == other.creditTypeId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, creditTypeId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaidAmount{amount=$amount, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to attach to the credit grant. */
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

    /**
     * Configure a rollover for this credit grant so if it expires it rolls over a configured amount
     * to a new credit grant. This feature is currently opt-in only. Contact Metronome to be added
     * to the beta.
     */
    class RolloverSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresAt: JsonField<OffsetDateTime>,
        private val priority: JsonField<Double>,
        private val rolloverAmount: JsonField<RolloverAmount>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rollover_amount")
            @ExcludeMissing
            rolloverAmount: JsonField<RolloverAmount> = JsonMissing.of(),
        ) : this(expiresAt, priority, rolloverAmount, mutableMapOf())

        /**
         * The date to expire the rollover credits.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * The priority to give the rollover credit grant that gets created when a rollover happens.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Double = priority.getRequired("priority")

        /**
         * Specify how much to rollover to the rollover credit grant
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rolloverAmount(): RolloverAmount = rolloverAmount.getRequired("rollover_amount")

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [rolloverAmount].
         *
         * Unlike [rolloverAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_amount")
        @ExcludeMissing
        fun _rolloverAmount(): JsonField<RolloverAmount> = rolloverAmount

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
             * Returns a mutable builder for constructing an instance of [RolloverSettings].
             *
             * The following fields are required:
             * ```java
             * .expiresAt()
             * .priority()
             * .rolloverAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RolloverSettings]. */
        class Builder internal constructor() {

            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var priority: JsonField<Double>? = null
            private var rolloverAmount: JsonField<RolloverAmount>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rolloverSettings: RolloverSettings) = apply {
                expiresAt = rolloverSettings.expiresAt
                priority = rolloverSettings.priority
                rolloverAmount = rolloverSettings.rolloverAmount
                additionalProperties = rolloverSettings.additionalProperties.toMutableMap()
            }

            /** The date to expire the rollover credits. */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * The priority to give the rollover credit grant that gets created when a rollover
             * happens.
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

            /** Specify how much to rollover to the rollover credit grant */
            fun rolloverAmount(rolloverAmount: RolloverAmount) =
                rolloverAmount(JsonField.of(rolloverAmount))

            /**
             * Sets [Builder.rolloverAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverAmount] with a well-typed [RolloverAmount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rolloverAmount(rolloverAmount: JsonField<RolloverAmount>) = apply {
                this.rolloverAmount = rolloverAmount
            }

            /**
             * Alias for calling [rolloverAmount] with
             * `RolloverAmount.ofMaxPercentage(maxPercentage)`.
             */
            fun rolloverAmount(maxPercentage: RolloverAmountMaxPercentage) =
                rolloverAmount(RolloverAmount.ofMaxPercentage(maxPercentage))

            /** Alias for calling [rolloverAmount] with `RolloverAmount.ofMax(max)`. */
            fun rolloverAmount(max: RolloverAmountMaxAmount) =
                rolloverAmount(RolloverAmount.ofMax(max))

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
             * Returns an immutable instance of [RolloverSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .expiresAt()
             * .priority()
             * .rolloverAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RolloverSettings =
                RolloverSettings(
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("priority", priority),
                    checkRequired("rolloverAmount", rolloverAmount),
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
        fun validate(): RolloverSettings = apply {
            if (validated) {
                return@apply
            }

            expiresAt()
            priority()
            rolloverAmount().validate()
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
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (rolloverAmount.asKnown().getOrNull()?.validity() ?: 0)

        /** Specify how much to rollover to the rollover credit grant */
        @JsonDeserialize(using = RolloverAmount.Deserializer::class)
        @JsonSerialize(using = RolloverAmount.Serializer::class)
        class RolloverAmount
        private constructor(
            private val maxPercentage: RolloverAmountMaxPercentage? = null,
            private val max: RolloverAmountMaxAmount? = null,
            private val _json: JsonValue? = null,
        ) {

            fun maxPercentage(): Optional<RolloverAmountMaxPercentage> =
                Optional.ofNullable(maxPercentage)

            fun max(): Optional<RolloverAmountMaxAmount> = Optional.ofNullable(max)

            fun isMaxPercentage(): Boolean = maxPercentage != null

            fun isMax(): Boolean = max != null

            fun asMaxPercentage(): RolloverAmountMaxPercentage =
                maxPercentage.getOrThrow("maxPercentage")

            fun asMax(): RolloverAmountMaxAmount = max.getOrThrow("max")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.metronome.api.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = rolloverAmount.accept(new RolloverAmount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitMaxPercentage(RolloverAmountMaxPercentage maxPercentage) {
             *         return Optional.of(maxPercentage.toString());
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
             * @throws MetronomeInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    maxPercentage != null -> visitor.visitMaxPercentage(maxPercentage)
                    max != null -> visitor.visitMax(max)
                    else -> visitor.unknown(_json)
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
            fun validate(): RolloverAmount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitMaxPercentage(
                            maxPercentage: RolloverAmountMaxPercentage
                        ) {
                            maxPercentage.validate()
                        }

                        override fun visitMax(max: RolloverAmountMaxAmount) {
                            max.validate()
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
                        override fun visitMaxPercentage(
                            maxPercentage: RolloverAmountMaxPercentage
                        ) = maxPercentage.validity()

                        override fun visitMax(max: RolloverAmountMaxAmount) = max.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RolloverAmount &&
                    maxPercentage == other.maxPercentage &&
                    max == other.max
            }

            override fun hashCode(): Int = Objects.hash(maxPercentage, max)

            override fun toString(): String =
                when {
                    maxPercentage != null -> "RolloverAmount{maxPercentage=$maxPercentage}"
                    max != null -> "RolloverAmount{max=$max}"
                    _json != null -> "RolloverAmount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid RolloverAmount")
                }

            companion object {

                @JvmStatic
                fun ofMaxPercentage(maxPercentage: RolloverAmountMaxPercentage) =
                    RolloverAmount(maxPercentage = maxPercentage)

                @JvmStatic fun ofMax(max: RolloverAmountMaxAmount) = RolloverAmount(max = max)
            }

            /**
             * An interface that defines how to map each variant of [RolloverAmount] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitMaxPercentage(maxPercentage: RolloverAmountMaxPercentage): T

                fun visitMax(max: RolloverAmountMaxAmount): T

                /**
                 * Maps an unknown variant of [RolloverAmount] to a value of type [T].
                 *
                 * An instance of [RolloverAmount] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws MetronomeInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw MetronomeInvalidDataException("Unknown RolloverAmount: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<RolloverAmount>(RolloverAmount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): RolloverAmount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<RolloverAmountMaxPercentage>())
                                    ?.let { RolloverAmount(maxPercentage = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<RolloverAmountMaxAmount>())
                                    ?.let { RolloverAmount(max = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> RolloverAmount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<RolloverAmount>(RolloverAmount::class) {

                override fun serialize(
                    value: RolloverAmount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.maxPercentage != null -> generator.writeObject(value.maxPercentage)
                        value.max != null -> generator.writeObject(value.max)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid RolloverAmount")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RolloverSettings &&
                expiresAt == other.expiresAt &&
                priority == other.priority &&
                rolloverAmount == other.rolloverAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expiresAt, priority, rolloverAmount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RolloverSettings{expiresAt=$expiresAt, priority=$priority, rolloverAmount=$rolloverAmount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditGrantCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
